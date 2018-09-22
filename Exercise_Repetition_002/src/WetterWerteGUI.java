/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elisc
 */
public class WetterWerteGUI extends javax.swing.JFrame {

    /**
     * Creates new form WetterWerteGUI
     */
    public WetterWerteGUI() {
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

        jInternalFrame2 = new javax.swing.JInternalFrame();
        sdTemp = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        sdMoisture = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        btAdd = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jInternalFrame2.setTitle("Eingabe");
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new java.awt.GridLayout(5, 0));

        sdTemp.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sdTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sdTemp.setText("Temperatur: 0° C");
        sdTemp.setToolTipText("");
        jInternalFrame2.getContentPane().add(sdTemp);

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(40);
        jSlider1.setMinimum(-20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jInternalFrame2.getContentPane().add(jSlider1);

        sdMoisture.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sdMoisture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sdMoisture.setText("Luftfeuchtigkeit: 50%");
        jInternalFrame2.getContentPane().add(sdMoisture);

        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMinorTickSpacing(5);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jInternalFrame2.getContentPane().add(jSlider2);

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAdd.setText("Einfügen");
        jInternalFrame2.getContentPane().add(btAdd);

        getContentPane().add(jInternalFrame2);

        jInternalFrame1.setTitle("Anzeige");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new java.awt.GridLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jInternalFrame1.getContentPane().add(jScrollPane1);

        getContentPane().add(jInternalFrame1);

        pack();
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
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WetterWerteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel sdMoisture;
    private javax.swing.JLabel sdTemp;
    // End of variables declaration//GEN-END:variables
}
