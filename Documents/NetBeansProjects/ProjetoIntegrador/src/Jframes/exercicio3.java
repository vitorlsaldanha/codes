/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor.saldanha
 */
public class exercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form exercicio1
     */
    public exercicio3() {
        initComponents();
        setTitle("Exercicio 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    boolean correctResponse = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        label_question3 = new javax.swing.JLabel();
        tabela_xor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        label_ex3 = new javax.swing.JLabel();
        alternativa_a = new javax.swing.JRadioButton();
        alternativa_b = new javax.swing.JRadioButton();
        enviar_resposta = new javax.swing.JButton();
        alternativa_c = new javax.swing.JRadioButton();
        alternativa_d = new javax.swing.JRadioButton();
        opcao_c = new javax.swing.JLabel();
        opcao_a = new javax.swing.JLabel();
        opcao_b = new javax.swing.JLabel();
        opcao_d = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton1.setText("Enviar resposta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        label_question3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        label_question3.setText("Ok, vou dificultar um pouco as coisas para você. Observe o quadro ao lado e responda:");

        tabela_xor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jframes/images/tabela_XOR.png"))); // NOI18N
        tabela_xor.setText("jLabel2");

        jRadioButton2.setText("jRadioButton1");

        label_ex3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        label_ex3.setText("EXERCICIO 3:");

        buttonGroup1.add(alternativa_a);
        alternativa_a.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        alternativa_a.setText("A)");
        alternativa_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativa_aActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativa_b);
        alternativa_b.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        alternativa_b.setText("B)");
        alternativa_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativa_bActionPerformed(evt);
            }
        });

        enviar_resposta.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        enviar_resposta.setText("Enviar resposta");
        enviar_resposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_respostaActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativa_c);
        alternativa_c.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        alternativa_c.setText("C)");
        alternativa_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativa_cActionPerformed(evt);
            }
        });

        buttonGroup1.add(alternativa_d);
        alternativa_d.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        alternativa_d.setText("D)");
        alternativa_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativa_dActionPerformed(evt);
            }
        });

        opcao_c.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        opcao_c.setText("A SAÍDA REPRESENTA A PORTA NOT");

        opcao_a.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        opcao_a.setText("A SAÍDA REPRESENTA A PORTA AND");

        opcao_b.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        opcao_b.setText("A SAÍDA REPRESENTA A PORTA XOR");

        opcao_d.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        opcao_d.setText("A SAÍDA REPRESENTA A PORTA OR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(label_question3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(593, 593, 593)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alternativa_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(alternativa_d, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(alternativa_c)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcao_d)
                                    .addComponent(opcao_c)
                                    .addComponent(opcao_b)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(enviar_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alternativa_a)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opcao_a)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabela_xor, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(jRadioButton2)
                    .addContainerGap(654, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(label_ex3)
                    .addContainerGap(895, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(589, 589, 589)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(label_question3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alternativa_a)
                                    .addComponent(opcao_a))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alternativa_b)
                                    .addComponent(opcao_b))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alternativa_c, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opcao_c))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alternativa_d)
                                    .addComponent(opcao_d))
                                .addGap(83, 83, 83)
                                .addComponent(enviar_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tabela_xor, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(77, 77, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(334, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(342, 342, 342)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(label_ex3)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alternativa_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativa_aActionPerformed
        correctResponse = false;
    }//GEN-LAST:event_alternativa_aActionPerformed

    private void alternativa_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativa_bActionPerformed
        correctResponse = true;
    }//GEN-LAST:event_alternativa_bActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        correctResponse = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enviar_respostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_respostaActionPerformed
        if (correctResponse) {
            JOptionPane.showMessageDialog(null, "Boa resposta! está correto");
            exercicio4 ex4_screen = new exercicio4();
            ex4_screen.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Alternativa incorreta, pense um pouquinho mais");
        }
    }//GEN-LAST:event_enviar_respostaActionPerformed

    private void alternativa_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativa_cActionPerformed
        correctResponse = false;
    }//GEN-LAST:event_alternativa_cActionPerformed

    private void alternativa_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativa_dActionPerformed
        correctResponse = false;
    }//GEN-LAST:event_alternativa_dActionPerformed

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
            java.util.logging.Logger.getLogger(exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alternativa_a;
    private javax.swing.JRadioButton alternativa_b;
    private javax.swing.JRadioButton alternativa_c;
    private javax.swing.JRadioButton alternativa_d;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton enviar_resposta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel label_ex3;
    private javax.swing.JLabel label_question3;
    private javax.swing.JLabel opcao_a;
    private javax.swing.JLabel opcao_b;
    private javax.swing.JLabel opcao_c;
    private javax.swing.JLabel opcao_d;
    private javax.swing.JLabel tabela_xor;
    // End of variables declaration//GEN-END:variables
}
