/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class records
{
   public int flag;
   public String superhero_name,s_id,super_powers,m_lvl,real_name,extra;
}
public class addentry extends javax.swing.JFrame {
    
records rec[]=new records[10];

    /*
     * Creates new form addentry
     */
    public addentry() {
        initComponents();
        for(int i=0;i<10;i++)
        {
            rec[i]=new records();
        }
        try {
            File file = new File("D:\\addentry.txt");
            Scanner reader=new Scanner(file);
            reader.useDelimiter(",");
            for(int i=0;i<10;i++)
            {
                rec[i].superhero_name=reader.next();
                rec[i].s_id=reader.next();
                rec[i].m_lvl=reader.next();
                rec[i].real_name=reader.next();
                rec[i].super_powers=reader.next();
                rec[i].extra=reader.next();

            }

             for(int i=0;i<10;i++)
             {
                 if(!(rec[i].s_id.equals("EMPTY")))
                 rec[i].flag=1;
                 else
                 rec[i].flag=0;
             }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addentry.class.getName()).log(Level.SEVERE, null, ex);
        }
        //int p=3;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(799, 544));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("SUPER HERO NAME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 180, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("SUPER ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(32, 169, 120, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("MUTANT LEVEL:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 143, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("REAL NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 150, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("SUPER POWERS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 350, 150, 20);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 450, 120, 25);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(243, 111, 175, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(243, 166, 175, 22);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(243, 223, 175, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(243, 282, 175, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(243, 348, 175, 22);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 450, 253, 25);

        jButton2.setText("GO BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(3, 450, 110, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train/flash.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-150, -10, 980, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sname,sid,mlvl,rname,spower;
        sname=jTextField1.getText();
        sid=jTextField2.getText();
        mlvl=jTextField3.getText();
        rname=jTextField4.getText();
        spower=jTextField5.getText();
        int p;
      Random rand=new Random();  
   int r,q;
    r=Integer.parseInt(sid)%10;
    q=rand.nextInt(1000)/10;
//std::cout<<q;
    q=Integer.parseInt(sid)/10;
    p=(q+r+7)%10; //because 7 is our fav number #CR7
    
    if(rec[p].flag==1)
   {
	    for(int i=p+1;i%10<10;i++)
	    {
		if(rec[i%10].flag==0)
               
                {
                    
                     p=i%10;
                      
                    break;
                }
            }
   }
  
     
     jLabel7.setText("Added Successfully!!!");

     rec[p].superhero_name=sname;
     rec[p].s_id=sid;
     rec[p].m_lvl=mlvl;
     rec[p].real_name=rname;
     rec[p].super_powers=spower; 
     rec[p].extra="#";
     
     System.out.println(p);

    try {
        FileWriter fw=new FileWriter("D:\\addentry.txt");
        for(int i=0;i<10;i++)
        {
        fw.write(rec[i].superhero_name);
        fw.write(",");
        fw.write(rec[i].s_id);
        fw.write(",");
        fw.write(rec[i].m_lvl);
        fw.write(",");
        fw.write(rec[i].real_name);
        fw.write(",");
        fw.write(rec[i].super_powers);
        fw.write(",");
        fw.write("#");
        fw.write(",");
        fw.write("\n");
        }
        fw.close();
        
        
        
    } catch (IOException ex) {
        Logger.getLogger(addentry.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        

        
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    menupage mp=new menupage();
        mp.setVisible(true);    
        setVisible(false);// TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addentry().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
