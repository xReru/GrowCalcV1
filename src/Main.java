
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growcalc;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComboBox;


/**
 *
 * @author Janrell Quiaroro
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setSize(330,230);
        setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("fav-1.png");
        this.setIconImage(icon);
        this.setTitle("Growtopia Calculator V1");
    }
    public class op {
    public static int a = 1 ;
    public static int res = 0;
    public static int rRes = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        result2 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        selectOp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("How much is the item?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        result2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        result2.setForeground(new java.awt.Color(0, 0, 0));
        result2.setText("Result");
        getContentPane().add(result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 93, 46, 32));

        result.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        result.setForeground(new java.awt.Color(0, 0, 0));
        result.setText("Result");
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 43, 46, 32));

        selectOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wls each", "items per wl" }));
        selectOp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectOp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectOpItemStateChanged(evt);
            }
        });
        selectOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOpActionPerformed(evt);
            }
        });
        getContentPane().add(selectOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 129, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 129, 28));

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 129, 28));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WorldLock.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 43, 33, -1));

        jButton1.setText("OK");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 55, 23));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DiamondLock.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 93, -1, -1));

        reset.setText("C");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 55, 23));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Approx.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 21, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_bg.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 220));

        pack();
    }// </editor-fold>                        

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void selectOpActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getSource() == selectOp){
            JComboBox cb = (JComboBox)evt.getSource();
            String choice = (String) cb.getSelectedItem();
            
            switch (choice){
                case "wls each": 
                    op.a = 1; //let 1 = Multiplication
                    break;
                case "items per wl": 
                    op.a = 2; //let 2 = Division
                    break;
            }
            
        }
    }                                        

    private void selectOpItemStateChanged(java.awt.event.ItemEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //st to int
        String p1 = price.getText();
        String q1 = quantity.getText();
        int rPrice = Integer.parseInt(p1);
        int rQuant = Integer.parseInt(q1);
        
        if (op.a == 1){
            op.res = rPrice*rQuant;
            op.rRes = (int) (Math.round(op.res * 100.0) / 100.0) ;
            String rStr = Integer.toString(op.rRes);
            result.setText("x  "+rStr);
            result2.setText("x  0");
        }
        else if (op.a == 2){
            op.res = rQuant/rPrice ;
            op.rRes = (int) (Math.round(op.res * 100.0) / 100.0) ;
            String rStr = Integer.toString(op.rRes);
            result.setText("x  "+rStr);
            result2.setText("x  0");
        }
        if (op.rRes >= 100){
            int dl = op.rRes / 100;
            String rDl = Integer.toString(dl);
            result2.setText("x  "+rDl);
            int wls = op.rRes % 100;
            String rWls = Integer.toString(wls);
            result.setText("x  "+rWls);
        }
    }                                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
       result.setText(" ");
       result2.setText(" ");
    }                                     

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset;
    private javax.swing.JLabel result;
    private javax.swing.JLabel result2;
    private javax.swing.JComboBox<String> selectOp;
    // End of variables declaration                   
}
