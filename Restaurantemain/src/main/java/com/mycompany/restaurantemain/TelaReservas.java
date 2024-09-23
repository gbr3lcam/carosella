/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.restaurantemain;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class TelaReservas extends javax.swing.JFrame {
    
    

    /**
     * Creates new form TelaReservas
     */
    public TelaReservas() {
        initComponents();
        btnConfirmar.addActionListener(evt -> reservarMesa());
        
        txtData.setText("Data");
        txtData.setForeground(Color.GRAY);
        
        txtData.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtData.getText().equals("Data")) {
            txtData.setText("");  
            txtData.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtData.getText().isEmpty()) {
            txtData.setText("Data");  
            txtData.setForeground(Color.GRAY);  
        }
    }
});
        txtHorario.setText("Horario");
        txtHorario.setForeground(Color.GRAY);
        
        txtHorario.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtHorario.getText().equals("Horario")) {
            txtHorario.setText("");  
            txtHorario.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtHorario.getText().isEmpty()) {
            txtHorario.setText("Horario");  
            txtHorario.setForeground(Color.GRAY);  
        }
    }
});
        txtQuantPessoas.setText("Quant. Pessoas");
        txtQuantPessoas.setForeground(Color.GRAY);
        
        txtQuantPessoas.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtQuantPessoas.getText().equals("Quant. Pessoas")) {
            txtQuantPessoas.setText("");  
            txtQuantPessoas.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtQuantPessoas.getText().isEmpty()) {
            txtQuantPessoas.setText("Quant. Pessoas");  
            txtQuantPessoas.setForeground(Color.GRAY);  
        }
    }
});
    }
    
    
   
    private void reservarMesa() {
      
        String data = txtData.getText();           
        String horario = txtHorario.getText();    
        String quantPessoas = txtQuantPessoas.getText();  
        String filialSel = comFilial.getSelectedItem().toString();
        
         int idFilial = getFilialId(filialSel);

        // Junta a data e o horário e converte para Timestamp (formato de data e hora do banco)
        String dataHora = data + " " + horario;
        Timestamp horaForm = Timestamp.valueOf(dataHora);  // Converte para Timestamp

        // Definindo a conexão e o comando SQL
        Connection conexao = null;
        PreparedStatement getb = null;
        
        String sql = "INSERT INTO Reservas (Data_reserva, ID_cliente, Mesa, ID_filial, Capacidade, Quant_pessoas) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Abre a conexão com o banco de dados
            conexao = ConexaoBanco.getConnection();
            getb = conexao.prepareStatement(sql);

            // Define os parâmetros para a inserção no banco de dados
            getb.setTimestamp(1, horaForm);  // Define a data e horário
            getb.setInt(2, 1);  // Supondo que o ID do cliente seja 1 (ajuste conforme sua lógica)
            getb.setString(3, "Mesa 1");  
            getb.setInt(4, idFilial);  
            getb.setString(5, "9");  
            getb.setString(6, quantPessoas);  
            // Executa o comando SQL (insere no banco)
            getb.executeUpdate();
            JOptionPane.showMessageDialog(this, "Reserva confirmada!");
            new TelaReservarEPedido().setVisible(true);
            this.dispose();
        }catch (SQLException e) {
            // Mostra mensagem de erro caso haja problema na inserção
           e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao confirmar reserva: " + e.getMessage());
        } finally {
            // Fecha a conexão e o comando SQL
            try {
                if (getb != null) getb.close();
                if (conexao != null) conexao.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private int getFilialId(String filial) {
        switch (filial) {
            case "Avenida Principal, 100":
                return 1;
            case "Rua das Flores, 200":
                return 2;
            case "Avenida Brasil, 300":
                return 3;
            case "Rua das Árvores, 400":
                return 4;
            case "Avenida Central, 500":
                return 5;
            case "Rua do comercio":
                return 6;
            case "Praça da Liberdade":
                return 7;
            case "Avenida da Paz, 800":
                return 8;
            case "Rua do Sol, 900":
                return 9;
            case "Avenida do Futuro, 1000":
                return 10;
            case "Rua dos Ventos, 1100":
                return 11;
            default:
                return 1;  
        }
    }   
    
     private int getFilialIdFromDB(String filial) {
        Connection conexao = null;
        PreparedStatement getb = null;
        ResultSet resConsul = null;
        
        String sql = "SELECT ID_filial FROM Filiais WHERE Endereco = ?";
        try {
            conexao = ConexaoBanco.getConnection();
            getb = conexao.prepareStatement(sql);
            getb.setString(1, filial); 
            
            resConsul = getb.executeQuery();
            if (resConsul.next()) {
                return resConsul.getInt("ID_filial");  // Retorna o ID encontrado
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (resConsul != null) resConsul.close();
                if (getb != null) getb.close();
                if (conexao != null) conexao.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
             }
        return -1;  // Retorna -1 se não encontrar o ID
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
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        comFilial = new javax.swing.JComboBox<>();
        txtQuantPessoas = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtHorario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVAS");

        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        comFilial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avenida Principal, 100", "Rua das Flores, 200", "Avenida Brasil, 300", "Rua das Árvores, 400", "Avenida Central, 500", "Rua do Comércio, 600", "Praça da Liberdade, 700", "Avenida da Paz, 800", "Rua do Sol, 900", "Avenida do Futuro, 1000", "Rua dos Ventos, 1100", " " }));

        txtQuantPessoas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Filial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtHorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comFilial, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(txtQuantPessoas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if (txtData.equals("Data") || txtHorario.equals("Horario") || txtQuantPessoas.equals("Quant. Pessoas")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente!", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        return;
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new TelaReservarEPedido().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
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
            java.util.logging.Logger.getLogger(TelaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comFilial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtQuantPessoas;
    // End of variables declaration//GEN-END:variables
}
