/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.restaurantemain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class TelaCadastroFil extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFil
     */
    public TelaCadastroFil() {
        initComponents();
        
       
        
        
        txtEndereco.setText("Endereço");
        txtEndereco.setForeground(Color.GRAY);
        
        txtEndereco.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtEndereco.getText().equals("Endereço")) {
            txtEndereco.setText("");  
            txtEndereco.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtEndereco.getText().isEmpty()) {
            txtEndereco.setText("Endereço");  
            txtEndereco.setForeground(Color.GRAY);  
        }
    }
});
        
        txtQuantMesa.setText("Quant. Mesas");
        txtQuantMesa.setForeground(Color.GRAY);
        
        txtQuantMesa.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtQuantMesa.getText().equals("Quant. Mesas")) {
            txtQuantMesa.setText("");  
            txtQuantMesa.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtQuantMesa.getText().isEmpty()) {
            txtQuantMesa.setText("Quant. Mesas");  
            txtQuantMesa.setForeground(Color.GRAY);  
        }
    }
});
      
         txtEmaill.setText("Email");
        txtEmaill.setForeground(Color.GRAY);
        
        txtEmaill.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtEmaill.getText().equals("Email")) {
            txtEmaill.setText("");  
            txtEmaill.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtEmaill.getText().isEmpty()) {
            txtEmaill.setText("Email");  
            txtEmaill.setForeground(Color.GRAY);  
        }
    }
});
        
        txtTelefonee.setText("Telefone");
        txtTelefonee.setForeground(Color.GRAY);
        
        txtTelefonee.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtTelefonee.getText().equals("Telefone")) {
            txtTelefonee.setText("");  
            txtTelefonee.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtTelefonee.getText().isEmpty()) {
            txtTelefonee.setText("Telefone");  
            txtTelefonee.setForeground(Color.GRAY);  
        }
    }
});
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarFilial();
            }
        });
    }
    private void registrarFilial() {
        String endereco = txtEndereco.getText();
        String quantMesaStr = txtQuantMesa.getText();
        String email = txtEmaill.getText();
        String telefone = txtTelefonee.getText();
        
         if (endereco.equals("Endereço") || quantMesaStr.equals("Quant. Mesas") ||
            email.equals("Email") || telefone.equals("Telefone")) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
          int quantMesa;
        try {
            quantMesa = Integer.parseInt(quantMesaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quant. Mesas deve ser um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection conexao = ConexaoBanco.getConnection()) {
            String sql = "INSERT INTO Filiais (Endereco, Email, Telefone, Quant_mesas) VALUES (?, ?, ?, ?)";
            PreparedStatement getb = conexao.prepareStatement(sql);
            getb.setString(1, endereco);
            getb.setString(2, email);
            getb.setString(3, telefone);
            getb.setInt(4, quantMesa);
            getb.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Filial registrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            new TelaFuncionario().setVisible(true);
            this.dispose();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar a filial: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
        txtEndereco = new javax.swing.JTextField();
        txtQuantMesa = new javax.swing.JTextField();
        txtEmaill = new javax.swing.JTextField();
        txtTelefonee = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE FILIAL");

        btnEntrar.setText("Registrar");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonee, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmaill, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtTelefonee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new TelaFuncionario().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaCadastroFil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmaill;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtQuantMesa;
    private javax.swing.JTextField txtTelefonee;
    // End of variables declaration//GEN-END:variables
}
