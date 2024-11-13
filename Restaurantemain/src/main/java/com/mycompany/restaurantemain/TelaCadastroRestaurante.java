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
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class TelaCadastroRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroRestaurante
     */
    public TelaCadastroRestaurante() {
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
        // Quando o campo ganha foco (clicar nele)
        if (txtEmail.getText().equals("Email")) {
            txtEmail.setText("");  // Remove o placeholder
            txtEmail.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        // Quando o campo perde o foco (clicar fora)
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
        
        txtBairro.setText("Bairro");
        txtBairro.setForeground(Color.GRAY);
        
        txtBairro.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtBairro.getText().equals("Bairro")) {
            txtBairro.setText("");  
            txtBairro.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtBairro.getText().isEmpty()) {
            txtBairro.setText("Bairro");  
            txtBairro.setForeground(Color.GRAY);  
        }
    }
});
        
        txtComplemento.setText("Complemento(opcional)");
        txtComplemento.setForeground(Color.GRAY);
        
        txtComplemento.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        
        if (txtComplemento.getText().equals("Complemento(opcional)")) {
            txtComplemento.setText("");  
            txtComplemento.setForeground(Color.BLACK);  
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        if (txtComplemento.getText().isEmpty()) {
            txtComplemento.setText("Complemento(opcional)");  
            txtComplemento.setForeground(Color.GRAY);  
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
    
    
    
    
    public void cadastrarCliente(String nome, String cpf, String dataNascimento, String email, String telefone, 
                                 String endereco, String bairro, String complemento, String cep, 
                                 String estado, String senha, String Username) {
        
        Connection conexao = null;
        PreparedStatement inClientes = null;
        PreparedStatement inLogins = null;
        ResultSet resConsul = null;
        
        String sqlClientes = "INSERT INTO Clientes (Nome_cliente, CPF, Data_nascimento, Email_cliente, Telefone, Endereco, Bairro, Complemento, CEP, Estado, password, Data_cadastro)"
                +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW() )";
        
        String sqlLogins = "INSERT INTO Logins (ID_cliente, Email_cliente, Username, Password) VALUES (?,?,?,?)";
        
        try{
            conexao = ConexaoBanco.getConnection();
            //inserir os dados
            inClientes = conexao.prepareStatement(sqlClientes, PreparedStatement.RETURN_GENERATED_KEYS);
            
            inClientes.setString(1, nome);
            inClientes.setString(2, cpf);
            inClientes.setString(3, dataNascimento);
            inClientes.setString(4, email);
            inClientes.setString(5, telefone);
            inClientes.setString(6, endereco);
            inClientes.setString(7, bairro);
            inClientes.setString(8, complemento);
            inClientes.setString(9, cep);
            inClientes.setString(10, estado);
            inClientes.setString(11, senha);
            
            //executar inserção 
            inClientes.executeUpdate();
            resConsul = inClientes.getGeneratedKeys();//pegar id gerado
            
            if (resConsul.next()){
                int idCliente = resConsul.getInt(1);
                inLogins = conexao.prepareStatement(sqlLogins);
                inLogins.setInt(1, idCliente);
                inLogins.setString(2, email);
                inLogins.setString(3, Username);
                inLogins.setString(4, senha);
                
                inLogins.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!");
            }
            
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente"+ e.getMessage());
        }finally{
            try{
                if (resConsul != null) resConsul.close();
                if (inClientes != null) inClientes.close();
                if (inLogins != null) inLogins.close();
                if (conexao != null) conexao.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
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
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereço = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        comEstado = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(690, 446));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CRIE SUA CONTA");

        txtNome.setText("Nome");

        txtCpf.setText("CPF");

        txtDataNascimento.setText("Data nasc.");

        txtEmail.setText("Email");

        txtTelefone.setText("Telefone");

        txtEndereço.setText("Endereço");

        txtComplemento.setText("Complemento");

        txtCep.setText("CEP");

        txtBairro.setText("Bairro");

        comEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel2.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String dataNascimento = txtDataNascimento.getText().trim();
        String email = txtEmail.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereço.getText().trim();
        String bairro = txtBairro.getText().trim();
        String complemento = txtComplemento.getText().trim();
        String cep = txtCep.getText().trim();
        String estado = comEstado.getSelectedItem().toString().trim();
        String senha = new String(txtSenha.getPassword()).trim();
        String Username = txtNome.getText().trim();
        
        if (nome.equals("Nome") || cpf.equals("CPF") || dataNascimento.equals("Data nasc.") || 
        email.equals("Email") || telefone.equals("Telefone") || endereco.equals("Endereço") ||
        bairro.equals("Bairro") || complemento.equals("Complemento") || cep.equals("CEP") || senha.isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente!", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        return;
    }
        if (complemento.equals("Complemento(opcional)") || complemento.isEmpty()) {
        complemento = "";  
    }
                
        
        TelaCadastroRestaurante cadastro = new TelaCadastroRestaurante();
        cadastro.cadastrarCliente(nome, cpf, dataNascimento, email, telefone, endereco, bairro, complemento, cep, estado, senha, Username );
        
        new TelaLoginRestaurante().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
