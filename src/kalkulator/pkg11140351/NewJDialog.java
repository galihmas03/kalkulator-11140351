/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.pkg11140351;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author galih
 */
public class NewJDialog extends javax.swing.JDialog {
     private String tmp = "";
    private int pilih;
    private float a1,a2,hasil;

    /**
     * Creates new form NewJDialog
     */
    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, "kalkulator");
        initComponents();
        setLocationRelativeTo(null);
        txttampilan.setHorizontalAlignment(JTextField.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttampilan = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnbersih = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnplesmines = new javax.swing.JButton();
        btnhasil = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txttampilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 285, 40));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 69, -1, -1));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 69, -1, -1));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 98, -1, -1));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 98, -1, -1));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 127, -1, -1));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 127, -1, -1));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        btnbersih.setText("c");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });
        getContentPane().add(btnbersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 156, 39, -1));

        btnkoma.setText(",");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnkoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 156, 39, -1));

        btnplesmines.setText("+/-");
        btnplesmines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplesminesActionPerformed(evt);
            }
        });
        getContentPane().add(btnplesmines, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 69, 95, 45));

        btnhasil.setText("=");
        btnhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhasilActionPerformed(evt);
            }
        });
        getContentPane().add(btnhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 131, 95, 48));

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, -1, -1));

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 98, 41, -1));

        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 127, 41, -1));

        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 156, 41, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        tmp += "1";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         tmp += "2";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      tmp += "3";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       tmp += "4";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        tmp += "5";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      tmp += "6";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       tmp += "7";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        tmp += "8";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        tmp += "9";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        tmp += "0";
      txttampilan.setText(tmp);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihActionPerformed
       tmp = "";
        a1=0;
        a2=0;
        hasil=0;
        txttampilan.setText("");
    }//GEN-LAST:event_btnbersihActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
       tmp += ".";
        txttampilan.setText(tmp);
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        a1 = Float.valueOf(tmp);
        pilih = 3;
        tmp = "";
        txttampilan.setText("x");
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnplesminesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplesminesActionPerformed
         if (hasil == 0) {
            JOptionPane.showMessageDialog(this, "Maaf ga tau gue hasilnya");
        } else {
            hasil *= -1;
            txttampilan.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnplesminesActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
              a1 = Float.valueOf(tmp);
        pilih = 1;
        tmp = "";
        txttampilan.setText("+");
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        a1 = Float.valueOf(tmp);
        pilih = 2;
        tmp = "";
        txttampilan.setText("-");
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
         a1 = Float.valueOf(tmp);
        pilih = 4;
        tmp = "";
        txttampilan.setText(":");
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhasilActionPerformed
        switch(pilih){
            case 1:
            a2 = Float.valueOf(tmp);
            hasil = (float) a1 + a2;
            tmp = String.valueOf(hasil);
            txttampilan.setText(tmp);
            break;
            case 2:
            a2 = Float.valueOf(tmp);
            hasil = (float) a1 - a2;
            tmp = String.valueOf(hasil);
            txttampilan.setText(tmp);
            break;
            case 3:
            a2 = Float.valueOf(tmp);
            hasil = (float) a1 * a2;
            tmp = String.valueOf(hasil);
           txttampilan.setText(tmp);
            break;
            case 4:
            a2 = Float.valueOf(tmp);
            hasil = (float) a1 / a2;
            tmp = String.valueOf(hasil);
            txttampilan.setText(tmp);
            break;
        }
        tmp = "";
        a1 = 0;
        a2 = 0;
    }//GEN-LAST:event_btnhasilActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btnhasil;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnplesmines;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField txttampilan;
    // End of variables declaration//GEN-END:variables
}
