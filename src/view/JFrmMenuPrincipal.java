/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import query.JDlgConsultaClientes;
import query.JDlgConsultaFuncionarios;
import query.JDlgConsultaProdutos;
import query.JDlgConsultaUsuarios;
import query.JDlgConsultaVendas;
import tools.telaDeFundo;

/**
 *
 * @author eduar
 */
public class JFrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmMenuPrincipal
     */
    telaDeFundo tela;

    public JFrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBtnClienteToolBar = new javax.swing.JButton();
        jBtnVendasToolBar = new javax.swing.JButton();
        jBtnProdutosToolBar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jMnuFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMnuConsultaCliente = new javax.swing.JMenuItem();
        jMnuConsultaUsuarios = new javax.swing.JMenuItem();
        jMnuConsultarFuncionarios = new javax.swing.JMenuItem();
        jMnuConsultarProdutos = new javax.swing.JMenuItem();
        jMnuConsultarVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jBtnClienteToolBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jBtnClienteToolBar.setFocusable(false);
        jBtnClienteToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnClienteToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnClienteToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClienteToolBarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnClienteToolBar);

        jBtnVendasToolBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vendas (1).png"))); // NOI18N
        jBtnVendasToolBar.setFocusable(false);
        jBtnVendasToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendasToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVendasToolBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnVendasToolBarMouseClicked(evt);
            }
        });
        jToolBar1.add(jBtnVendasToolBar);

        jBtnProdutosToolBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jBtnProdutosToolBar.setFocusable(false);
        jBtnProdutosToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnProdutosToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnProdutosToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutosToolBarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnProdutosToolBar);

        jMenuBar1.setBackground(new java.awt.Color(102, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));
        jMenuBar1.setForeground(new java.awt.Color(102, 51, 0));
        jMenuBar1.setOpaque(false);

        jMenu1.setBackground(new java.awt.Color(102, 51, 0));
        jMenu1.setText("Cadastro");

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente.setBackground(new java.awt.Color(255, 102, 153));
        jMnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMnuCliente.setText("Cliente");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCliente);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMnuUsuarios.setText("Usuarios");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuarios);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMnuProdutos.setText("Produtos");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProdutos);

        jMnuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionarios.png"))); // NOI18N
        jMnuFuncionarios.setText("Funcionarios");
        jMnuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuFuncionarios);
        jMenu1.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuVendas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jMnuConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMnuConsultaCliente.setText("Consultar cliente");
        jMnuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultaClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMnuConsultaCliente);

        jMnuConsultaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMnuConsultaUsuarios.setText("Consultar usuario");
        jMnuConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultaUsuariosActionPerformed(evt);
            }
        });
        jMenu3.add(jMnuConsultaUsuarios);

        jMnuConsultarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionarios.png"))); // NOI18N
        jMnuConsultarFuncionarios.setText("Consultar funcionarios");
        jMnuConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultarFuncionariosActionPerformed(evt);
            }
        });
        jMenu3.add(jMnuConsultarFuncionarios);

        jMnuConsultarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMnuConsultarProdutos.setText("Consultar produtos");
        jMnuConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultarProdutosActionPerformed(evt);
            }
        });
        jMenu3.add(jMnuConsultarProdutos);

        jMnuConsultarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vendas (1).png"))); // NOI18N
        jMnuConsultarVendas.setText("Consultar vendas");
        jMnuConsultarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultarVendasActionPerformed(evt);
            }
        });
        jMenu3.add(jMnuConsultarVendas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
        
        JDlgClientes cliente = new JDlgClientes(this, true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(true);
        cliente.setVisible(true);
        
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed

        JDlgUsuarios usuarios = new JDlgUsuarios(this, true);
        usuarios.setLocationRelativeTo(null); // CENTRALIZA O JDIALOG.
        this.setVisible(true); //oculta O FORME  PARA EXIBIR USUARIO
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed
        
        JDlgProdutosNovo produtos = new JDlgProdutosNovo(this, true);
        produtos.setLocationRelativeTo(null); // CENTRALIZA O JDIALOG.
        this.setVisible(true); //oculta O FORME  PARA EXIBIR USUARIO
        produtos.setVisible(true);
        
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionariosActionPerformed
        // TODO add your handling code here:
        JDlgFuncionariosNovo funcionarios = new JDlgFuncionariosNovo(this, true);
        funcionarios.setLocationRelativeTo(null); // CENTRALIZA O JDIALOG.
        // this.dispose(); //FECHA O FORME PARA EXIBIR USUARIO
        this.setVisible(true); //oculta O FORME  PARA EXIBIR USUARIO

        funcionarios.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionariosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        
        JDlgVendas usuarios = new JDlgVendas(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);

    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMnuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultaClienteActionPerformed
        JDlgConsultaClientes usuarios = new JDlgConsultaClientes(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jMnuConsultaClienteActionPerformed

    private void jMnuConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultaUsuariosActionPerformed
        
        JDlgConsultaUsuarios usuarios = new JDlgConsultaUsuarios(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_jMnuConsultaUsuariosActionPerformed

    private void jMnuConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultarFuncionariosActionPerformed
        JDlgConsultaFuncionarios usuarios = new JDlgConsultaFuncionarios(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jMnuConsultarFuncionariosActionPerformed

    private void jMnuConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultarProdutosActionPerformed
        JDlgConsultaProdutos usuarios = new JDlgConsultaProdutos(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jMnuConsultarProdutosActionPerformed

    private void jMnuConsultarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultarVendasActionPerformed
        JDlgConsultaVendas usuarios = new JDlgConsultaVendas(this, true);
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jMnuConsultarVendasActionPerformed

    private void jBtnClienteToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClienteToolBarActionPerformed
        JDlgConsultaClientes usuarios = new JDlgConsultaClientes(this, true);
        usuarios.setLocationRelativeTo(null);
        this.setVisible(true);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jBtnClienteToolBarActionPerformed

    private void jBtnVendasToolBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVendasToolBarMouseClicked
        JDlgConsultaVendas usuarios = new JDlgConsultaVendas(this, true);
        usuarios.setLocationRelativeTo(null);
        this.setVisible(true);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jBtnVendasToolBarMouseClicked

    private void jBtnProdutosToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosToolBarActionPerformed
        JDlgConsultaProdutos usuarios = new JDlgConsultaProdutos(this, true);
        usuarios.setLocationRelativeTo(null);
        this.setVisible(true);
        usuarios.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosToolBarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClienteToolBar;
    private javax.swing.JButton jBtnProdutosToolBar;
    private javax.swing.JButton jBtnVendasToolBar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenuItem jMnuConsultaCliente;
    private javax.swing.JMenuItem jMnuConsultaUsuarios;
    private javax.swing.JMenuItem jMnuConsultarFuncionarios;
    private javax.swing.JMenuItem jMnuConsultarProdutos;
    private javax.swing.JMenuItem jMnuConsultarVendas;
    private javax.swing.JMenuItem jMnuFuncionarios;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
