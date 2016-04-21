/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pkg351.diegolucasromero.ejercicio7;
 
import pkg351.diegolucasromero.ejercicio7.Rectangulo;


/**
 *
 * @author Diego Lucas Romero
 */
public class Ventanaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventanaprincipal
     */
    private double ancho;
    private double alto;
    private int p;
    
    Rectangulo paredNorte = new Rectangulo();
    Rectangulo paredSur = new Rectangulo();
    Rectangulo paredEste = new Rectangulo();
    Rectangulo paredOeste = new Rectangulo();
    public Ventanaprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        res1 = new javax.swing.JRadioButton();
        res2 = new javax.swing.JRadioButton();
        res3 = new javax.swing.JRadioButton();
        res4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtancho = new javax.swing.JTextField();
        txtalto = new javax.swing.JTextField();
        btnasignar = new javax.swing.JButton();
        btnarea = new javax.swing.JButton();
        btnperimetro = new javax.swing.JButton();

        buttonGroup1.add(res1);
        buttonGroup1.add(res2);
        buttonGroup1.add(res3);
        buttonGroup1.add(res4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Paredes"));

        res1.setText("Pared Norte");
        res1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res1ActionPerformed(evt);
            }
        });

        res2.setText("Pared Sur");
        res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res2ActionPerformed(evt);
            }
        });

        res3.setText("Pared Este");
        res3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res3ActionPerformed(evt);
            }
        });

        res4.setText("Pared Oeste");
        res4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(res1)
                    .addComponent(res2)
                    .addComponent(res3)
                    .addComponent(res4))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(res1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(res2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));

        jLabel1.setText("Ancho:");

        jLabel2.setText("Alto:");

        btnasignar.setText("Asignar");
        btnasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnasignar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtalto, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtancho))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnasignar)
                .addGap(25, 25, 25))
        );

        btnarea.setText("Area");
        btnarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareaActionPerformed(evt);
            }
        });

        btnperimetro.setText("Perímetro");
        btnperimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnperimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnarea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnperimetro)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasignarActionPerformed
        // TODO add your handling code here:
        
       if(p==1){ 
            
                ancho = Double.parseDouble(txtancho.getText());
                alto =  Double.parseDouble(txtalto.getText());
                paredNorte.setBase(ancho);
                paredNorte.setAltura(alto);
                System.out.println("pared norte:");
                System.out.println("base:"+ancho);
                System.out.println("altura:"+alto);
                
       }
            
                     
       else if(p==2){    
                ancho = Double.parseDouble(txtancho.getText());
                alto =  Double.parseDouble(txtalto.getText());
                paredSur.setBase(ancho);
                paredSur.setAltura(alto);
                System.out.println("pared sur:");
                System.out.println("base:"+ancho);
                System.out.println("altura:"+alto);
                
       }       
       else if(p==3){    
                ancho = Double.parseDouble(txtancho.getText());
                alto =  Double.parseDouble(txtalto.getText());
                paredEste.setBase(ancho);
                paredEste.setAltura(alto);
                System.out.println("pared este:");
                System.out.println("base:"+ancho);
                System.out.println("altura:"+alto);
                
       }
       else if(p==3){    
                ancho = Double.parseDouble(txtancho.getText());
                alto =  Double.parseDouble(txtalto.getText());
                paredOeste.setBase(ancho);
                paredOeste.setAltura(alto);
                System.out.println("pared oeste:");
                System.out.println("base:"+ancho);
                System.out.println("altura:"+alto);
                
       }
                     
        
        
        
    
        
        
        
        
       
        
    }//GEN-LAST:event_btnasignarActionPerformed

    private void res1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res1ActionPerformed
        // TODO add your handling code here:
        p=1;
    }//GEN-LAST:event_res1ActionPerformed

    private void res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res2ActionPerformed
        // TODO add your handling code here:
        p=2;
    }//GEN-LAST:event_res2ActionPerformed

    private void res3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res3ActionPerformed
        // TODO add your handling code here:
        p=3;
    }//GEN-LAST:event_res3ActionPerformed

    private void res4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res4ActionPerformed
        // TODO add your handling code here:
        p=4;
    }//GEN-LAST:event_res4ActionPerformed

    private void btnareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareaActionPerformed
        // TODO add your handling code here:
        if(p==1){
            System.out.println("area:"+paredNorte.getArea());
            
        }
            
        
        if(p==2){
            System.out.println("area:"+paredSur.getArea());
            
        }
        if(p==3){
            System.out.println("area:"+paredEste.getArea());
            
        }
        if(p==4){
            System.out.println("area:"+paredOeste.getArea());
}
    }//GEN-LAST:event_btnareaActionPerformed

    private void btnperimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperimetroActionPerformed
        // TODO add your handling code here:
        if(p==1){
            
            System.out.println("perímetro:"+paredNorte.getPerimetro());
        }
            
        
        if(p==2){
            System.out.println("perímetro:"+paredSur.getPerimetro());
            
        }
        if(p==3){
            System.out.println("perímetro:"+paredEste.getPerimetro());
            
        }
        if(p==4){
            System.out.println("perímetro:"+paredOeste.getPerimetro());
        }
    }//GEN-LAST:event_btnperimetroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        

       
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnarea;
    private javax.swing.JButton btnasignar;
    private javax.swing.JButton btnperimetro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton res1;
    private javax.swing.JRadioButton res2;
    private javax.swing.JRadioButton res3;
    private javax.swing.JRadioButton res4;
    private javax.swing.JTextField txtalto;
    private javax.swing.JTextField txtancho;
    // End of variables declaration//GEN-END:variables
}