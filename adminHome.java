package onlinequiz.application;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static onlinequiz.application.adminHome.open;

public class adminHome extends javax.swing.JFrame {

    public static int open = 0; // this is most important for next page.

    public adminHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\add new question.png")); // NOI18N
        jButton1.setText("Add new Question");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\Update Question.png")); // NOI18N
        jButton2.setText("Update Question");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, -1));

        jButton3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\all questions.png")); // NOI18N
        jButton3.setText("All Question");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 190, -1));

        jButton4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\Logout.png")); // NOI18N
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 140, -1));

        jButton5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\delete Question.png")); // NOI18N
        jButton5.setText("Delete Question");
        jButton5.setBorder(null);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jButton6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\all student result.png")); // NOI18N
        jButton6.setText("All Student Result");
        jButton6.setBorder(null);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jButton7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\Close.png")); // NOI18N
        jButton7.setText("Exit");
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alimh\\OneDrive\\Documents\\NetBeansProjects\\OnlineQuiz Application\\nbproject\\Source package\\icon\\index background.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);;
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new loginAdmin().setVisible(true);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Exit this Application.", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (open == 0) {
            //new addNewQuestion().setVisible(true);
            addNewQuestion newQuestion = new addNewQuestion(); // Passing null can cause issues.

            open = 1;
        } else {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        if (open == 0) {
            //new addNewQuestion().setVisible(true);
            new updateQuestion().setVisible(true);
            open = 1;

        } else {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");

        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:    
        if (open == 0) {
            //new addNewQuestion().setVisible(true);
            new deleteQuestion().setVisible(true);
            open = 1;

        } else {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");

        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if (open == 0) {
            //new addNewQuestion().setVisible(true);
            new allQuestion().setVisible(true);

            open = 1;

        } else {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");

        }


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addNewQuestion q = new addNewQuestion();
        q.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
        if (open == 0) {
            //new addNewQuestion().setVisible(true);
            new allStudentResult.setVisible(true);

            open = 1;

        } else {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");

        }
    }//GEN-LAST:event_jButton6MouseClicked

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
            java.util.logging.Logger.getLogger(adminHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new adminHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
