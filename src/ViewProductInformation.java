
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public final class ViewProductInformation extends javax.swing.JFrame {
    String Productid="";
    /**
     * Creates new form ViewProductInformation
     * @param selectedProduct
     */
    public ViewProductInformation(String selectedProduct) {
        Productid=selectedProduct;
        initComponents();
        test.setText(Productid);
        loadTblData();
    }

    private ViewProductInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void loadTblData(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
            Statement st=con.createStatement();
            
            PreparedStatement ps=con.prepareStatement("select * from product where product_id=?");
            ps.setString(1, Productid);
        
        
            ResultSet rs=ps.executeQuery();

            //String sql="select * from product where product_id=?";
            
            
            //ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                String product_id=rs.getString("product_id");
                String product_name=rs.getString("product_name");
                String category=rs.getString("category");  
                String manufacturer=rs.getString("manufacturer");
                String description=rs.getString("description");
                String cost_price=rs.getString("cost_price");
                String location_code=rs.getString("location_code");  
                String stock_code=rs.getString("stock_code"); 
                String quantity=rs.getString("quantity");
                String supplier_id=rs.getString("supplier_id");
                String supplier_name=rs.getString("supplier_name");  
                String supplier_address=rs.getString("supplier_address");
                String supplier_contact=rs.getString("supplier_contact"); 
                String contact_email=rs.getString("contact_email");         
                
                productId.setText(product_id);
                productName.setText(product_name);
                //productId.setText(category);
                productManufacturer.setText(manufacturer);
                productDescription.setText(description);
                productCostPrice.setText(cost_price);
                productLocationCode.setText(location_code);
                productStockCode.setText(stock_code);
                productQuantity.setText(quantity);
                supplierId.setText(supplier_id);
                supplierName.setText(supplier_name);
                supplierAddress.setText(supplier_address);
                supplierContact.setText(supplier_contact);
                supplierEmail.setText(contact_email);
   
            }
                 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(main_interface.class.getName()).log(Level.SEVERE, null, ex);
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
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        productId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productCategory = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productManufacturer = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        productDescription = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        productCostPrice = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        productLocationCode = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        productStockCode = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        productQuantity = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        supplierId = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        supplierName = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        supplierAddress = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        supplierContact = new javax.swing.JLabel();
        supplierEmail = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        test = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Build Mart.png"))); // NOI18N
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productId.setText("id");
        jPanel2.add(productId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 210, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product ID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 40));

        productName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productName.setText("name");
        jPanel2.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 40));

        productCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productCategory.setText("category");
        jPanel2.add(productCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Category:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 40));

        productManufacturer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productManufacturer.setText("manufacturer");
        jPanel2.add(productManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Manufacturer:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Description:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, 40));

        productDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productDescription.setText("description");
        productDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(productDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 270, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cost Price:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 40));

        productCostPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productCostPrice.setText("cost");
        jPanel2.add(productCostPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 240, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Location Code:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 40));

        productLocationCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productLocationCode.setText("location");
        jPanel2.add(productLocationCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 250, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Stock Code:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 40));

        productStockCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productStockCode.setText("stock");
        jPanel2.add(productStockCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 270, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Quantity:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 90, 40));

        productQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productQuantity.setText("quantity");
        jPanel2.add(productQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 250, 40));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Product Details");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 350, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Supplier Details");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 350, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Supplier ID:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 90, 40));

        supplierId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierId.setText("id");
        jPanel2.add(supplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 210, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Name:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 90, 40));

        supplierName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierName.setText("name");
        jPanel2.add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 230, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Address:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 90, 40));

        supplierAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierAddress.setText("address");
        jPanel2.add(supplierAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 250, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Contact:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, 40));

        supplierContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierContact.setText("contact");
        jPanel2.add(supplierContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 250, 40));

        supplierEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierEmail.setText("email");
        jPanel2.add(supplierEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 260, 40));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Email:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 90, 40));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 960, 570));

        test.setText("id");
        jPanel1.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProductInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel productCategory;
    private javax.swing.JLabel productCostPrice;
    private javax.swing.JLabel productDescription;
    private javax.swing.JLabel productId;
    private javax.swing.JLabel productLocationCode;
    private javax.swing.JLabel productManufacturer;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productQuantity;
    private javax.swing.JLabel productStockCode;
    private javax.swing.JLabel supplierAddress;
    private javax.swing.JLabel supplierContact;
    private javax.swing.JLabel supplierEmail;
    private javax.swing.JLabel supplierId;
    private javax.swing.JLabel supplierName;
    private javax.swing.JLabel test;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
