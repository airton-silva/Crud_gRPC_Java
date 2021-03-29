/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proto.CreateVeiculoRequest;
import proto.CreateVeiculoResponse;
import proto.DeleteVeiculoRequest;
import proto.DeleteVeiculoResponse;
import proto.ListVeiculoRequest;
import proto.ListVeiculoResponse;
import proto.UpdateVeiculoRequest;
import proto.UpdateVeiculoResponse;
import proto.Veiculo;
import proto.VeiculoServiceGrpc;

/**
 *
 * @author Acer
 */
public class CrudView extends javax.swing.JFrame {
        
        String marca, modelo, anoF, anoM, preco;
        ListVeiculoResponse listVeiculoResponse;
    
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        VeiculoServiceGrpc.VeiculoServiceBlockingStub veiculoClient = VeiculoServiceGrpc.newBlockingStub(channel);
    /**
     * Creates new form CrudView
     */
    public CrudView(String marca, String modelo, String anoFab, String anoMod, String preco ){
   
        this.marca = marca;
        this.modelo = modelo;
        this.anoF = anoFab;
        this.anoM = anoMod;
        this.preco = preco;
        
    }
    
    public void createV(){
        this.marca = input_marca.getText().trim();
        this.modelo = input_modelo.getText().trim();
        this.anoF = input_anoFab.getText().trim();
        this.anoM = input_anoM.getText().trim();
        this.preco = input_preco.getText().trim();
        
        if(this.marca.equals("") && this.modelo.equals("") && this.anoF.equals("") && this.anoM.equals("") && this.preco.equals("")){
            
             input_marca.setText("");
             input_modelo.setText("");
             input_anoFab.setText("");
             input_anoM.setText("");
             input_preco.setText("");
             
             JOptionPane.showMessageDialog(null, "Todos os campos são obrifatorios");
             input_marca.requestFocus();

        }else{
            Veiculo veiculo = Veiculo.newBuilder().setMarca(this.marca).setModelo(this.modelo)
                                                  .setAnoFab(this.anoF).setAnoMod(this.anoM)
                                                  .setPreco(this.preco).build();
            CreateVeiculoResponse createVeiculoResponse = veiculoClient
                    .createVeiculo(CreateVeiculoRequest.newBuilder().setVeiculo(veiculo).build());

            int veiculoId = createVeiculoResponse.getVeiculo().getId();
            
            try {
                channel.awaitTermination(5, TimeUnit.MILLISECONDS);
            } catch (Exception e) {

                e.printStackTrace();
            }
            
           // prencherTabela();
            alert_txt.setText("Veiculo id: "+veiculoId+" Cadastrado com Sucesso");
            
             input_marca.setText("");
             input_modelo.setText("");
             input_anoFab.setText("");
             input_anoM.setText("");
             input_preco.setText("");

        }     


    }
    
    public int updateVeiculo(){
        String id = input_id.getText(); 
        int idVeiculo = Integer.parseInt(id);
        
        this.marca = input_marca.getText().trim();
        this.modelo = input_modelo.getText().trim();
        this.anoF = input_anoFab.getText().trim();
        this.anoM = input_anoM.getText().trim();
        this.preco = input_preco.getText().trim();
        Veiculo veiculo = Veiculo.newBuilder().setId(idVeiculo).setMarca(this.marca).setModelo(this.modelo)
                                      .setAnoFab(this.anoF).setAnoMod(this.anoM)
                                      .setPreco(this.preco).build();
        
        int v_id = UpdateVeiculoResponse.getDefaultInstance().getVeiculo().getId();        

//            veiculo = veiculo.toBuilder().setId(veiculo.getId())
//                    .setMarca(veiculo.getMarca())
//                    .setModelo(veiculo.getModelo())
//                    .setAnoFab(veiculo.getAnoFab())
//                    .setAnoMod(veiculo.getAnoMod())
//                    .setModelo(veiculo.getPreco()).build() ;       

        
            UpdateVeiculoResponse updateVeiculoResponse = veiculoClient
                .updateVeiculo(UpdateVeiculoRequest.newBuilder().setVeiculo(veiculo).build());                       

             alert_txt.setText("Veiculo id: "+idVeiculo+" Utualizado com Sucesso");

             input_id.setText("");
             input_marca.setText("");
             input_modelo.setText("");
             input_anoFab.setText("");
             input_anoM.setText("");
             input_preco.setText("");
        return idVeiculo;
    }
    
    public void deletarVeiculo(){
        
        String id = input_id.getText();      

        int idVeiculo = Integer.parseInt(id);
      
//        if((listVeiculoResponse.getVeiculo(idVeiculo))!=null ){
             DeleteVeiculoResponse deleteVeiculoResponse = veiculoClient
                .deleteVeiculo(DeleteVeiculoRequest.newBuilder().setVeiculoId(idVeiculo).build());  
             
             input_marca.setText("");
             input_modelo.setText("");
             input_anoFab.setText("");
             input_anoM.setText("");
             input_preco.setText("");
             
             alert_txt.setText("Veiculo id: "+idVeiculo+" Excluido com Sucesso");
//        }else{
//            JOptionPane.showMessageDialog(null, "Não foi possivel encontra veiculo com esse ID "+ idVeiculo);
//        }

    }
    
    public void getAllVeiculos(){
 
        this.listVeiculoResponse = veiculoClient.listVeiculo(ListVeiculoRequest.newBuilder().build());
        System.out.println("ID\t"+"Marca\t"+"Modelo\t"+"Ano Fabricação\t"+"Ano do Modelo\t"+"Preço");
        for (Veiculo veiculo : listVeiculoResponse.getVeiculoList()) {
            System.out.println(veiculo.getId()+"\t"
                               +veiculo.getMarca()+"\t"
                               +veiculo.getModelo()+"\t"
                               +veiculo.getAnoFab()+"\t"
                               +veiculo.getAnoMod()+"\t"
                               +veiculo.getPreco()+"\t");
        }
        prencherTabela();
         
    }
    
        
    public void prencherTabela(){       
      while (TableVeiculos.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) TableVeiculos.getModel()).removeRow(0);  
       }
       DefaultTableModel modelo = (DefaultTableModel) TableVeiculos.getModel();
       for (Veiculo v : listVeiculoResponse.getVeiculoList()) { 
            String id_v = Integer.toString(v.getId());
            modelo.addRow(new String []{
                            id_v, v.getMarca(),
                            v.getModelo(),
                            v.getAnoFab(),
                            v.getAnoMod(),
                            v.getPreco()
            });
        } 
             
        
    }

    public CrudView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        input_marca = new javax.swing.JTextField();
        input_modelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_anoFab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_anoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_preco = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVeiculos = new javax.swing.JTable();
        reloud_table = new javax.swing.JButton();
        alert_txt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        btn_excluirVeiculo = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        input_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_marcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca");

        jLabel2.setText("Modelo");

        jLabel3.setText("Ano Fabricaçao");

        jLabel4.setText("Ano de Modelo");

        jLabel5.setText("Preço");

        btn_salvar.setText("Cadastrar Veiculo");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        TableVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Ano Fabricação", "Ano Modelo", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableVeiculos);

        reloud_table.setText("Carregar Table");
        reloud_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloud_tableActionPerformed(evt);
            }
        });

        alert_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alert_txt.setForeground(new java.awt.Color(255, 204, 0));

        jLabel7.setText("ID");

        input_id.setEnabled(false);
        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });

        btn_excluirVeiculo.setText("Apagar Registro");
        btn_excluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirVeiculoActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar Veiculo");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alert_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(input_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(input_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_salvar)
                                    .addGap(15, 15, 15)
                                    .addComponent(btn_atualizar)
                                    .addGap(15, 15, 15)
                                    .addComponent(btn_excluirVeiculo)
                                    .addGap(15, 15, 15)
                                    .addComponent(reloud_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(input_anoFab, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(input_anoM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(input_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_anoFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_anoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluirVeiculo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_atualizar)
                    .addComponent(reloud_table))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Veiculos Show");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        createV();
        input_marca.setText("");
        input_modelo.setText("");
        input_anoFab.setText("");
        input_anoM.setText("");
        input_preco.setText("");
        //prencherTabela();

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void input_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_marcaActionPerformed

    private void reloud_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloud_tableActionPerformed
        input_id.setText("");
        input_marca.setText("");
        input_modelo.setText("");
        input_anoFab.setText("");
        input_anoM.setText("");
        alert_txt.setText("");
        input_preco.setText("");
        getAllVeiculos();      
        //prencherTabela();
        
    }//GEN-LAST:event_reloud_tableActionPerformed

    private void btn_excluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirVeiculoActionPerformed
 
        deletarVeiculo();
        
        input_id.setText("");
        input_marca.setText("");
        input_modelo.setText("");
        input_anoFab.setText("");
        input_anoM.setText("");
        input_preco.setText("");
               
    }//GEN-LAST:event_btn_excluirVeiculoActionPerformed

    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_idActionPerformed

    private void TableVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableVeiculosMouseClicked
        input_id.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),0));
        input_marca.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),1));
        input_modelo.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),2));
        input_anoFab.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),3));
        input_anoM.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),4));
        input_preco.setText((String) TableVeiculos.getValueAt(TableVeiculos.getSelectedRow(),5));
    }//GEN-LAST:event_TableVeiculosMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        prencherTabela();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        // TODO add your handling code here:
        int id = updateVeiculo();
        alert_txt.setText("Veiculo Id: "+id+"Foi Atualizado com Sucesso");
        
        input_marca.setText("");
        input_modelo.setText("");
        input_anoFab.setText("");
        input_anoM.setText("");
        input_preco.setText("");
    }//GEN-LAST:event_btn_atualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableVeiculos;
    private javax.swing.JLabel alert_txt;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_excluirVeiculo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField input_anoFab;
    private javax.swing.JTextField input_anoM;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_marca;
    private javax.swing.JTextField input_modelo;
    private javax.swing.JTextField input_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reloud_table;
    // End of variables declaration//GEN-END:variables
}
