/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikhil
 */
class records3
{
   public int flag;
   public String superhero_name,s_id,super_powers,m_lvl,real_name,extra;
}
public class searchtrain extends javax.swing.JFrame {
    private Object recc;

    
    public searchtrain() {
        initComponents();
        
            records3 recc=new records3();
        try{
             File file = new File("D:\\addentry.txt");
            Scanner reader=new Scanner(file);
            reader.useDelimiter(",");
            
                recc.s_id=reader.next();
                
                 if(!(recc.s_id.equals("EMPTY")))
                 recc.flag=1;
                 else
                 recc.flag=0;
             
                System.out.print(recc.s_id);
               
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addentry.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(822, 414));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUPERHERO ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 160, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 30, 250, 22);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 30, 120, 25);

        jButton2.setText("GO BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 220, 150, 25);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUPER HERO NAME", "SUPER ID", "MUTANT LEVEL", "REAL NAME", "SUPER POWERS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 80, 637, 93);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 330, 510, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train/wallhaven-571057.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-160, 10, 980, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menupage mp=new menupage();
        mp.setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    class records4
{
   public int flag;
    public String superhero_name,s_id,super_powers,m_lvl,real_name,extra;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String sname,sid,rname,mlvl,spowers;
        sid=jTextField1.getText();
        int flag=0;
        int p;
      Random rand=new Random();  
         int r,q;
    r=Integer.parseInt(sid)%10;
    q=rand.nextInt(1000)/10;

    q=Integer.parseInt(sid)/10;
    p=(q+r+7)%10; 
    
  DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
   String extra;
           records4 recs[]=new records4[10];
         for(int i=0;i<10;i++)
            recs[i]=new records4();

        try{
         
        Scanner rr=new Scanner(new File("D:\\addentry.txt"));
        rr.useDelimiter(",");
        System.out.print(sid+"\n");
        
        for(int i=0;i<10;i++)
        {
        recs[i].superhero_name=rr.next();
        recs[i].s_id=rr.next();
        recs[i].m_lvl=rr.next();
        recs[i].real_name=rr.next();
        recs[i].super_powers=rr.next();
        recs[i].extra=rr.next();
       // System.out.print("\n"+recs[i].s_id+"  "+recs[i].m_lvl);
        System.out.print("\n"+p+"\t"+sid+"\t"+recs[p].s_id);
        }
        for(int i=0;i<10;i++)
        {
        if(sid.equals(recs[p].s_id)){
            model.addRow(new Object[]{recs[p].superhero_name,recs[p].s_id,recs[p].m_lvl,recs[p].real_name,recs[p].super_powers});
            flag=1;
            break;
        }
        p++;
        
        }
        if(flag!=1){
            jLabel2.setText("MUTANT EXTERMINATED !");
        
        }
        }
        catch(Exception e){}
        // System.out.println(p);
            //System.out.println(reco[p].train_no);
                
       
           
    
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(searchtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchtrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
