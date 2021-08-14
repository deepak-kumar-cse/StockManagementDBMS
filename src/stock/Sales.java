/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Deepak
 */
public class Sales extends javax.swing.JFrame {

    public Sales(main m) {
        m1=m;

        initComponents();
        Connect();
    }

    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stockmanagement", "root", "rootuser");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }








    /**
     * Creates new form Sales
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel3 = new JLabel();
        jTxtPCode = new JTextField();
        jLabel4 = new JLabel();
        jTxtPName = new JTextField();
        jLabel5 = new JLabel();
        jTxtPPrice = new JTextField();
        jLabel6 = new JLabel();
        jLabel10 = new JLabel();
        jTxtTotal = new JTextField();
        jTxtQty = new JTextField();
        jAddButton = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jClearButton = new JButton();
        jBackButton = new JButton();
        jSellButton = new JButton();
        jTxtTCost = new JTextField();
        jTextTPay = new JTextField();
        jTxtBal = new JTextField();
        jLabel2 = new JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "product code", "product name", "price", "quantity", "total"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("product code");

        jTxtPCode.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jTxtPCode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTxtPCode.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTxtQty.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jLabel4.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("product name");

        jTxtPName.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jTxtPName.setEnabled(false);


        jLabel5.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("price");


        jTxtPPrice.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jTxtPPrice.setEnabled(false);



        jLabel6.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("quantity");

        jLabel10.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("total");



        jTxtQty.setFont(new Font("Tahoma", 0, 18)); // NOI18N



        jTxtTotal.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jTxtTotal.setEnabled(false);



        jAddButton.setBackground(new Color(24, 24, 24));
        jAddButton.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jAddButton.setText("ADD");
        jAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setText("Payment:");

        jLabel8.setFont(new Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setText("Balance:");

        jLabel9.setFont(new Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setText("Total cost:");

        jClearButton.setBackground(new Color(240, 240, 124));
        jClearButton.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        jClearButton.setText("CLEAR");
        jClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jClearButtonActionPerformed(evt);
            }
        });

        jBackButton.setBackground(new Color(244, 111, 111));
        jBackButton.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        jBackButton.setText("BACK");

        jBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });


        jSellButton.setBackground(new Color(124, 240, 124));
        jSellButton.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        jSellButton.setText("SELL");
        jSellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jSellButtonActionPerformed(evt);
            }
        });


        jTxtTCost.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jTxtTCost.setEnabled(false);
        jTextTPay.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jTextTPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextTPay.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextPayKeyPressed(evt);
            }
        });

        jTxtBal.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jTxtBal.setEnabled(false);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTxtPCode, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTxtPName, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTxtPPrice, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTxtQty)
                                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTxtTotal, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)//
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jAddButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtTCost, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextTPay, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtBal, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jBackButton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jClearButton)
                                                .addGap(132, 132, 132)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(656, Short.MAX_VALUE)
                                        .addComponent(jSellButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTxtPCode, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTxtPName, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTxtPPrice, GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jTxtQty))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jAddButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                        .addComponent(jTxtTotal))))//
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextTPay, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtTCost, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtBal, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jClearButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBackButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(411, Short.MAX_VALUE)
                                        .addComponent(jSellButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        jLabel2.setFont(new Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Sales");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>


    public void barcode(){
        String pcode=jTxtPCode.getText();

        try {
            pst=con.prepareStatement("select * from product where barcode = ?");
            pst.setString(1,pcode);
            rs=pst.executeQuery();
            if(rs.next()==false){
                JOptionPane.showMessageDialog(this, "Barcode not found");
                jTxtPCode.setText("");
            }
            else {
                String pname=rs.getString("pname");
                String price=rs.getString("rprice");
                jTxtPName.setText(pname.trim());
                jTxtPPrice.setText(price.trim());
                jTxtQty.requestFocus();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void sell(){


        String query1="insert into Sales(date, subtotal, pay, bal) value(?,?,?,?)";
        try {
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime now=LocalDateTime.now();
            String date=dt.format(now);
           // String date="STR_TO_DATE("+date1+",'%m-%d-%y')";
//            VALUES(STR_TO_DATE('07-25-2012','%m-%d-%y'));
            String subtotal = jTxtTCost.getText();
            String pay=jTextTPay.getText();
            String bal = jTxtBal.getText();
            int lastid=0;

            pst=con.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);

            pst.setString(1,date);
            pst.setString(2, subtotal);
            pst.setString(3, pay);
            pst.setString(4, bal);

            pst.executeUpdate();
            rs=pst.getGeneratedKeys();
            if(rs.next()){
                lastid=rs.getInt(1);
            }

            String query2="insert into sales_product(Sales_id, pid, price, qty, total) values(?,?,?,?,?)";
            pat1=con.prepareStatement(query2);

            String productid;
            String productname;
            String price;
            String qty;
            int total=0;


            for(int i=0; i<jTable1.getRowCount(); i++){

                productid=(String) jTable1.getValueAt(i,0);
                productname=(String) jTable1.getValueAt(i,1);
                price=(String) jTable1.getValueAt(i,2);
                qty=(String) jTable1.getValueAt(i,3);
                total=(int) jTable1.getValueAt(i,4);

                pat1.setInt(1, lastid);
                pat1.setString(2, productid);
                pat1.setString(3, price);
                pat1.setString(4, qty);
                pat1.setInt(5, total);
                pat1.executeUpdate();

            }

            String query3="update product set qty = qty- ? where barcode=?";
            pat2=con.prepareStatement(query3);
            for(int i=0; i<jTable1.getRowCount(); i++){
                productid=(String)jTable1.getValueAt(i,0);
                qty=(String)jTable1.getValueAt(i,3);

                pat2.setString(1, qty);
                pat2.setString(2, productid);
                pat2.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "sold successfully..wow...");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void clearUpperField(){
        jTxtPName.setText("");
        jTxtPPrice.setText("");
        jTxtTotal.setText("");
        jTxtQty.setText("");
    }
    public void clearAllTxtField(){
        jTxtPCode.setText("");
        jTxtPName.setText("");
        jTxtPPrice.setText("");
        jTxtTotal.setText("");
        jTxtQty.setText("");
        jTxtTCost.setText("");
        jTextTPay.setText("");
        jTxtBal.setText("");
        df=(DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);

    }

    public void add(){


        try {
            String pcode=jTxtPCode.getText();
            pst=con.prepareStatement("select * from product where barcode = ?");
            pst.setString(1,pcode);
            rs=pst.executeQuery();

            while (rs.next()){
                int currentqty=rs.getInt("qty");
                String productname=rs.getString("pname");
                int price=Integer.parseInt(jTxtPPrice.getText());
                int qty = Integer.parseInt(jTxtQty.getText());

                int total=price*qty;

                if(qty>=currentqty){
                    JOptionPane.showMessageDialog(this,"only "+currentqty +productname+" is available");
//                    cleartxtfield();
                }
                else {
                    df=(DefaultTableModel) jTable1.getModel();
                    df.addRow(new Object[]{
                            jTxtPCode.getText(),
                            jTxtPName.getText(),
                            jTxtPPrice.getText(),
                            jTxtQty.getText(),
                            total
                    });
//                    clearUpperField();
                    int sum=0;
                    for(int  i=0; i<jTable1.getRowCount(); i++){
                        sum=sum+Integer.parseInt(jTable1.getValueAt(i,4).toString());
                        System.out.print(jTable1.getValueAt(i,4)+" ");
                        System.out.println(sum);
                    }

                    String s1=String.valueOf(sum);

                    jTxtTCost.setText(s1);
                    System.out.println(s1+" =============");

                }

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        clearUpperField();
    }



    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
        m1.setVisible(true);
        clearAllTxtField();
    }


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("testing");
            barcode();

        }
    }
    private void jTextPayKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER) {
            int totalCost = Integer.parseInt(jTxtTCost.getText());
            int payment = Integer.parseInt(jTextTPay.getText());
            int balance = totalCost-payment;
            jTxtBal.setText(Integer.toString(balance));
        }

    }
    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
         int price=Integer.parseInt(jTxtPPrice.getText());
         int quantity=Integer.parseInt(jTxtQty.getText());
         int total=price*quantity;
         jTxtTotal.setText(Integer.toString(total));
//         jTxtTotal.setText(String.valueOf(total));


        }
    }

//    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//    }
//
//    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//    }
//
//    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//    }

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        add();
    }

    private void jClearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        clearAllTxtField();

    }
    private void jSellButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int payment=Integer.parseInt(jTextTPay.getText());
        int  totalCost=Integer.parseInt(jTxtTCost.getText());
        int bal=totalCost-payment;
        jTxtBal.setText(String.valueOf(bal));
        sell();
        clearAllTxtField();
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                main m3
//                new Sales(m3).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify





    Connection con;
    PreparedStatement pst;
    PreparedStatement pat1;
    PreparedStatement pat2;
    DefaultTableModel df;
    ResultSet rs;


    main m1; // @author Deepak
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jClearButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JButton jSellButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtPCode;
    private javax.swing.JTextField jTxtPName;
    private javax.swing.JTextField jTxtPPrice;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtQty;
    private javax.swing.JTextField jTxtTCost;
    private javax.swing.JTextField jTextTPay;
    private javax.swing.JTextField jTxtBal;
    // End of variables declaration
}
