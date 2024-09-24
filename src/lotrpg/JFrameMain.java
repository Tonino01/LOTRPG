/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lotrpg;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author tonin
 */
public class JFrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMainMenu
     */
    public JFrameMain() {
        initComponents();
        
        setStyle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barramultifunzione = new javax.swing.JPanel();
        chiudi = new javax.swing.JButton();
        riduci = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maxi = new javax.swing.JButton();
        restore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        screen = new javax.swing.JPanel();
        nuovapartita = new javax.swing.JButton();
        continua = new javax.swing.JButton();
        impostazioni = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        homeBackround = new javax.swing.JLabel();
        saveOption = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        slvataggio = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barramultifunzione.setBackground(new java.awt.Color(51, 51, 51));
        barramultifunzione.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barramultifunzioneMouseDragged(evt);
            }
        });
        barramultifunzione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barramultifunzioneMousePressed(evt);
            }
        });
        barramultifunzione.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chiudi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chiudi.png"))); // NOI18N
        chiudi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiActionPerformed(evt);
            }
        });
        barramultifunzione.add(chiudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 30, 30));

        riduci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minimize-window-48.png"))); // NOI18N
        riduci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        riduci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riduciActionPerformed(evt);
            }
        });
        barramultifunzione.add(riduci, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 30));

        jLabel2.setToolTipText("");
        barramultifunzione.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        maxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maximize-window.png"))); // NOI18N
        maxi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxiActionPerformed(evt);
            }
        });
        barramultifunzione.add(maxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 30));

        restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restore-window.png"))); // NOI18N
        restore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreActionPerformed(evt);
            }
        });
        barramultifunzione.add(restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LOTRPG-30.png"))); // NOI18N
        barramultifunzione.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        getContentPane().add(barramultifunzione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 50));

        screen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuovapartita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nuovaPartita_button.png"))); // NOI18N
        nuovapartita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuovapartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuovapartitaActionPerformed(evt);
            }
        });
        screen.add(nuovapartita, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 300, 60));

        continua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/continua_button.png"))); // NOI18N
        continua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuaActionPerformed(evt);
            }
        });
        screen.add(continua, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 300, 60));

        impostazioni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/impostazioni60.png"))); // NOI18N
        screen.add(impostazioni, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 60, 60));

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TITLE-removebg-piccolo.png"))); // NOI18N
        title.setPreferredSize(new java.awt.Dimension(0, 0));
        screen.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 470, 130));

        homeBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/Menu-backround-piccolo.png"))); // NOI18N
        screen.add(homeBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 600));

        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 1030));

        saveOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("SLOT DI SALVATAGGIO");
        saveOption.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 50));

        slvataggio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");
        slvataggio.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("jLabel4");
        slvataggio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        saveOption.add(slvataggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 200));

        getContentPane().add(saveOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void chiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiActionPerformed

        this.dispose();
    }//GEN-LAST:event_chiudiActionPerformed

    private void riduciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riduciActionPerformed

        
        this.setExtendedState(this.ICONIFIED);
        
        
    }//GEN-LAST:event_riduciActionPerformed
    
    
    int xx, xy;
    private void barramultifunzioneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMouseDragged

        int x = evt.getXOnScreen();

        int y = evt.getYOnScreen();

        this.setLocation(x-xx, y-xy);

    }//GEN-LAST:event_barramultifunzioneMouseDragged

    private void barramultifunzioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barramultifunzioneMousePressed

    
    
    private final Toolkit tk = Toolkit.getDefaultToolkit();
        
    private final int w = (int)tk.getScreenSize().getWidth();
        
    private final int h = (int)tk.getScreenSize().getHeight();
    
    private void maxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxiActionPerformed
        
        
        //setStyleFullScreen();
        
        
        
        
    }//GEN-LAST:event_maxiActionPerformed

    private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
        
        
        
        //setStyleWindow();
        
        
        
        
    }//GEN-LAST:event_restoreActionPerformed

    private void nuovapartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuovapartitaActionPerformed
        
        
        this.screen.setVisible(false);
        
        this.saveOption.setVisible(true);
        
        
        
    }//GEN-LAST:event_nuovapartitaActionPerformed

    private void continuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuaActionPerformed
        
        
        
    }//GEN-LAST:event_continuaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    
    
    
    
    
    public void setStyle() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icon/LOTRPG-100.png"));
        this.setSize(1150, 650);
        this.dispose();
        this.setUndecorated(true); 
        this.setVisible(true);
        
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth()-17, getHeight()-40, 20, 20));
        
        
        this.setLocation((w/2)-(1150/2), (h/2)-(650/2));
        
        this.saveOption.setSize(screen.getSize());
        
        this.saveOption.setLocation(screen.getLocation());
        
        
        this.saveOption.setVisible(false);
        
    }
    
    private void setStyleFullScreen(){
        
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth()-17, getHeight()-40, 20, 20));
        
        this.dispose();
        
        this.setSize(w, h);
        
        this.setVisible(true);
        
        // grandezza Pannelli & posizione pulsanti home
        
        barramultifunzione.setSize(1920, 50);
        
        screen.setSize(w, 1030);
        
        chiudi.setLocation(1870, 10);
        
        maxi.setLocation(1810, 10);
        
        
        
        restore.setLocation(1810, 10);
        
        riduci.setLocation(1750, 10);
        
        
        
        title.setSize(1460, 390);
        
        homeBackround.setSize(w, 1030);
        
        
    }
    
    
    private void setStyleWindow(){
        

        
        
        
        // grandezza Pannelli & posizione pulsanti home
        
        chiudi.setLocation(1870 - 900, 10);
        
        maxi.setLocation(1810 - 900, 10);
        
        
        
        restore.setLocation(1810 - 900, 10);
        
        riduci.setLocation(1750 - 900, 10);
        
        barramultifunzione.setSize(w - 900, 50);
        
        title.setSize(1460-900, 390-100);
        
        homeBackround.setSize(w-900, 1030-500);
        
        screen.setSize(w - 900, 1030 - 500);
        
        
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barramultifunzione;
    private javax.swing.JButton chiudi;
    private javax.swing.JButton continua;
    private javax.swing.JLabel homeBackround;
    private javax.swing.JButton impostazioni;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton maxi;
    private javax.swing.JButton nuovapartita;
    private javax.swing.JButton restore;
    private javax.swing.JButton riduci;
    private javax.swing.JPanel saveOption;
    private javax.swing.JPanel screen;
    private javax.swing.JPanel slvataggio;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
