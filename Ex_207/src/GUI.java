
public class GUI extends javax.swing.JFrame {

    WeatherModel bl = new WeatherModel();

    public GUI() {
        initComponents();
        tbWeather.setModel(bl);
        tbWeather.setDefaultRenderer(Object.class, new MyTableCellRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmmenu = new javax.swing.JPopupMenu();
        mihide = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbWeather = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menstat = new javax.swing.JMenu();
        miadd = new javax.swing.JMenuItem();
        mirem = new javax.swing.JMenuItem();
        menval = new javax.swing.JMenu();
        mitemp = new javax.swing.JMenuItem();
        mihum = new javax.swing.JMenuItem();

        mihide.setText("Hide Sea-Level");
        pmmenu.add(mihide);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbWeather.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbWeather.setComponentPopupMenu(pmmenu);
        jScrollPane1.setViewportView(tbWeather);

        menstat.setText("Stations");

        miadd.setText("Add Weather Station");
        miadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miaddActionPerformed(evt);
            }
        });
        menstat.add(miadd);

        mirem.setText("Remove Weather Station");
        mirem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miremActionPerformed(evt);
            }
        });
        menstat.add(mirem);

        jMenuBar1.add(menstat);

        menval.setText("Values");

        mitemp.setText("Set Temperature");
        mitemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitempActionPerformed(evt);
            }
        });
        menval.add(mitemp);

        mihum.setText("Set Humidity");
        mihum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mihumActionPerformed(evt);
            }
        });
        menval.add(mihum);

        jMenuBar1.add(menval);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddActionPerformed
        WeatherDia dialog = new WeatherDia(this, true);
        dialog.setVisible(true);
        if (dialog.isOK()) {
            Weatherstation t = dialog.getWS();
            bl.add(t);
        }
    }//GEN-LAST:event_miaddActionPerformed

    private void miremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miremActionPerformed

    private void mitempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitempActionPerformed

    private void mihumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mihumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mihumActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menstat;
    private javax.swing.JMenu menval;
    private javax.swing.JMenuItem miadd;
    private javax.swing.JMenuItem mihide;
    private javax.swing.JMenuItem mihum;
    private javax.swing.JMenuItem mirem;
    private javax.swing.JMenuItem mitemp;
    private javax.swing.JPopupMenu pmmenu;
    private javax.swing.JTable tbWeather;
    // End of variables declaration//GEN-END:variables
}
