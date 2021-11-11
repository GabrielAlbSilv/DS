package View;

public class principal_view extends javax.swing.JFrame {

   
    public principal_view() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeEmpresa = new javax.swing.JLabel();
        Cadastro = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        CampoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CampoText1 = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        CampoText2 = new javax.swing.JTextField();
        BotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        NomeEmpresa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomeEmpresa.setText("Switchif");
        jPanel1.add(NomeEmpresa);
        NomeEmpresa.setBounds(210, 20, 70, 40);

        Cadastro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cadastro.setText("Cadastro:");
        jPanel1.add(Cadastro);
        Cadastro.setBounds(20, 90, 80, 17);

        Nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nome.setText("Nome:");
        jPanel1.add(Nome);
        Nome.setBounds(120, 120, 41, 15);
        jPanel1.add(CampoText);
        CampoText.setBounds(170, 200, 150, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Email:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 160, 40, 15);
        jPanel1.add(CampoText1);
        CampoText1.setBounds(170, 120, 150, 20);

        Senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Senha.setText("Senha:");
        jPanel1.add(Senha);
        Senha.setBounds(120, 200, 60, 15);
        jPanel1.add(CampoText2);
        CampoText2.setBounds(170, 160, 150, 20);

        BotaoSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoSair.setText("SAIR");
        BotaoSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotaoSair.setFocusable(false);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoSair);
        BotaoSair.setBounds(390, 270, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(520, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed


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
            java.util.logging.Logger.getLogger(principal_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JTextField CampoText;
    private javax.swing.JTextField CampoText1;
    private javax.swing.JTextField CampoText2;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel NomeEmpresa;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
