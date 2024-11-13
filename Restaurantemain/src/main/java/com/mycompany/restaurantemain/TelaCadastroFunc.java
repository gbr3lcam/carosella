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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class TelaCadastroFunc extends javax.swing.JFrame {

    /**
     * Creates new form telacadastrofunc
     */
    public TelaCadastroFunc() {
        initComponents();
        
        txtNome.setText("Nome");
        txtNome.setForeground(Color.GRAY);
        
        txtNome.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtNome.getText().equals("Nome")) {
            txtNome.setText("");  
            txtNome.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtNome.getText().isEmpty()) {
            txtNome.setText("Nome");  
            txtNome.setForeground(Color.GRAY);  
        }
    }
});
        
        
        txtEmail.setText("Email");
        txtEmail.setForeground(Color.GRAY);
        
        txtEmail.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        // Quando o campo ganha foco 
        if (txtEmail.getText().equals("Email")) {
            txtEmail.setText("");  // Remove o placeholder
            txtEmail.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        // Quando o campo perde o foco 
        if (txtEmail.getText().isEmpty()) {
            txtEmail.setText("Email");  // Coloca o placeholder de volta
            txtEmail.setForeground(Color.GRAY);  
        }
    }
});
        
        
        
        
        txtDataNascimento.setText("Data nasc.");
        txtDataNascimento.setForeground(Color.GRAY);
        
        txtDataNascimento.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtDataNascimento.getText().equals("Data nasc.")) {
            txtDataNascimento.setText("");  
            txtDataNascimento.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtDataNascimento.getText().isEmpty()) {
            txtDataNascimento.setText("Data nasc.");  
            txtDataNascimento.setForeground(Color.GRAY);  
        }
    }
});
        
        
        
        txtCpf.setText("CPF");
        txtCpf.setForeground(Color.GRAY);
        
        txtCpf.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtCpf.getText().equals("CPF")) {
            txtCpf.setText("");  
            txtCpf.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtCpf.getText().isEmpty()) {
            txtCpf.setText("CPF");  
            txtCpf.setForeground(Color.GRAY);  
        }
    }
});
        
        
        txtTelefone.setText("Telefone");
        txtTelefone.setForeground(Color.GRAY);
        
         txtTelefone.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtTelefone.getText().equals("Telefone")) {
            txtTelefone.setText("");  
            txtTelefone.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtTelefone.getText().isEmpty()) {
            txtTelefone.setText("Telefone");  
            txtTelefone.setForeground(Color.GRAY);  
        }
    }
});
        
        txtEndereço.setText("Endereço");
        txtEndereço.setForeground(Color.GRAY);
        
        txtEndereço.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtEndereço.getText().equals("Endereço")) {
            txtEndereço.setText("");  
            txtEndereço.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtEndereço.getText().isEmpty()) {
            txtEndereço.setText("Endereço");  
            txtEndereço.setForeground(Color.GRAY);  
        }
    }
    
});
        txtCargo.setText("Cargo");
        txtCargo.setForeground(Color.GRAY);
        
        txtCargo.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtCargo.getText().equals("Cargo")) {
            txtCargo.setText("");  
            txtCargo.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtCargo.getText().isEmpty()) {
            txtCargo.setText("Cargo");  
            txtCargo.setForeground(Color.GRAY);  
        }
    }
});
        
        txtCep.setText("CEP");
        txtCep.setForeground(Color.GRAY);
        
        txtCep.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtCep.getText().equals("CEP")) {
            txtCep.setText("");  
            txtCep.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtCep.getText().isEmpty()) {
            txtCep.setText("CEP");  
            txtCep.setForeground(Color.GRAY);  
        }
    }
});
        
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
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereço = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        comEstado = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        selFilial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setText("Nome");

        txtCpf.setText("CPF");

        txtDataNascimento.setText("Data nasc.");
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        txtEmail.setText("Email");

        txtTelefone.setText("Telefone");

        txtEndereço.setText("Endereço");

        txtCargo.setText("Cargo");
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        txtCep.setText("CEP");
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        comEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comEstadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE FUNCIONÁRIO");

        jLabel2.setText("Senha:");

        btnEntrar.setText("Registrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        selFilial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        selFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selFilialActionPerformed(evt);
            }
        });

        jLabel3.setText("Filial:");

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
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone))
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascimento))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(122, 122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String dataNascimento = txtDataNascimento.getText();
            String email = txtEmail.getText();
            String telefone = txtTelefone.getText();
            String endereco = txtEndereço.getText();
            String cargo = txtCargo.getText();
            String cep = txtCep.getText();
            String estado = (String) comEstado.getSelectedItem();
            String senha = new String(txtSenha.getPassword());
            int filial = Integer.parseInt((String) selFilial.getSelectedItem());
            
            if (nome.equals("Nome") || cpf.equals("CPF") || dataNascimento.equals("Data nasc.") ||
        email.equals("Email") || telefone.equals("Telefone") || endereco.equals("Endereço") || 
        cargo.equals("Cargo") || cep.equals("CEP") || senha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
        try (Connection conexao = ConexaoBanco.getConnection()){
             String sql = "INSERT INTO funcionarios (Nome_funcionario, CPF, Data_nascimento, Email, Telefone, Endereco, Cargo, CEP, Estado, password, ID_Filial) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             
             try (PreparedStatement getb = conexao.prepareStatement(sql)){
                getb.setString(1, nome);
                getb.setString(2, cpf);
                getb.setString(3, dataNascimento);
                getb.setString(4, email);
                getb.setString(5, telefone);
                getb.setString(6, endereco);
                getb.setString(7, cargo);
                getb.setString(8, cep);
                getb.setString(9, estado);
                getb.setString(10, senha);
                getb.setInt(11, filial);
                
                int linhasAfetadas = getb.executeUpdate();
                if (linhasAfetadas > 0){
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    new TelaFuncionario().setVisible(true);
                    this.dispose();
              
                }
             }
        }  catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario" + e.getMessage());
            
        }  
    }//GEN-LAST:event_btnEntrarActionPerformed

    
    
    private void comEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comEstadoActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void selFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selFilialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selFilialActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selFilial;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
