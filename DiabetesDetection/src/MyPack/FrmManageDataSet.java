/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class FrmManageDataSet extends javax.swing.JFrame {

    /**
     * Creates new form FrmManageDataSet
     */
    MainForm parent;
    Object colHeader[];
    DefaultTableModel tm;
    public FrmManageDataSet(MainForm parent) {
        this.parent = parent;
        initComponents();
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2); 
              //colHeader = new Object[]{"AGE","SEX","HBA1C","RESTING BP","PLASMA GLUCOSE","CHLORESTROL","DATE","PULSE RATE","HYPERTENSION","HEREDITORY","SEIZER ATTACK","FOOT ULCERS","HEAD INJURY","BACTERIAL MENINGITIS","VIRAL DISEASE","SEVERITY INDEX","TREATMENT"};
       colHeader = new Object[]{"AGE","SEX","HBA1C","RESTING BP","PLASMA GLUCOSE","CHLORESTROL","DATE","PULSE RATE","HYPERTENSION","HEREDITORY","FOOT ULCERS","SEVERITY INDEX","TREATMENT"};
        tm = new DefaultTableModel(colHeader, 0);
        fillTable();
        
    }

    void fillTable(){
        for(int i=0;i<parent.dataSet.dataSet.size();i++){
            String s[] = new String[16];
            
//            s[0] = parent.attributes[0][parent.dataSet.dataSet.elementAt(i).dataItem[0]];
//            s[1] = parent.attributes[1][parent.dataSet.dataSet.elementAt(i).dataItem[1]];
//            s[2] = parent.dataSet.dataSet.elementAt(i).descr[2];
//            s[3] = parent.attributes[3][parent.dataSet.dataSet.elementAt(i).dataItem[3]];
//            s[4] = parent.attributes[4][parent.dataSet.dataSet.elementAt(i).dataItem[4]];
//            s[5] = parent.attributes[5][parent.dataSet.dataSet.elementAt(i).dataItem[5]];
////             s[6] = parent.attributes[6][parent.dataSet.dataSet.elementAt(i).dataItem[6]];
//            String str=parent.dataSet.dataSet.elementAt(i).descr[6].substring(0,1);
//             String str1=parent.dataSet.dataSet.elementAt(i).descr[6].substring(1);
//            s[6] = str1+"-"+str+"-2014";
//            s[7] = parent.dataSet.dataSet.elementAt(i).descr[7];
//            s[8] = parent.attributes[7][parent.dataSet.dataSet.elementAt(i).dataItem[7]];
//            s[9] = parent.dataSet.dataSet.elementAt(i).descr[9];
//      //       s[10] = parent.attributes[8][parent.dataSet.dataSet.elementAt(i).dataItem[8]];
//            s[11] = parent.dataSet.dataSet.elementAt(i).descr[11];
//             s[12] = parent.attributes[9][parent.dataSet.dataSet.elementAt(i).dataItem[9]];
//            s[13] = parent.dataSet.dataSet.elementAt(i).descr[14];
//            s[14] = parent.dataSet.dataSet.elementAt(i).descr[15];
//            s[15] = parent.attributes[10][parent.dataSet.dataSet.elementAt(i).dataItem[10]];
             s[0] = parent.attributes[0][parent.dataSet.dataSet.elementAt(i).dataItem[0]];
            s[1] = parent.attributes[1][parent.dataSet.dataSet.elementAt(i).dataItem[1]];
             s[2] = parent.dataSet.dataSet.elementAt(i).descr[2];
            s[3] = parent.attributes[3][parent.dataSet.dataSet.elementAt(i).dataItem[3]];
            s[4] = parent.attributes[4][parent.dataSet.dataSet.elementAt(i).dataItem[4]];
            s[5] = parent.attributes[5][parent.dataSet.dataSet.elementAt(i).dataItem[5]];
//             s[6] = parent.attributes[6][parent.dataSet.dataSet.elementAt(i).dataItem[6]];
              String str="";//parent.dataSet.dataSet.elementAt(i).descr[6].substring(0,1);
             String str1="";//parent.dataSet.dataSet.elementAt(i).descr[6].substring(1);
              if(parent.dataSet.dataSet.elementAt(i).descr[6].length()==4){
                        str=parent.dataSet.dataSet.elementAt(i).descr[6].substring(1,2);
                        str1=parent.dataSet.dataSet.elementAt(i).descr[6].substring(3,2);
                        }else{
                         str=parent.dataSet.dataSet.elementAt(i).descr[6].substring(1,1);
                         str1=parent.dataSet.dataSet.elementAt(i).descr[6].substring(2,2);
                        }
            s[6] = str1+"-"+str+"-2014";
            s[7] = parent.dataSet.dataSet.elementAt(i).descr[7];
            s[8] = parent.attributes[7][parent.dataSet.dataSet.elementAt(i).dataItem[7]];
            s[9] = parent.dataSet.dataSet.elementAt(i).descr[9];
      //       s[10] = parent.attributes[8][parent.dataSet.dataSet.elementAt(i).dataItem[8]];
            s[10] = parent.dataSet.dataSet.elementAt(i).descr[11];
             //s[11] = parent.attributes[9][parent.dataSet.dataSet.elementAt(i).dataItem[9]];
            s[11] = parent.dataSet.dataSet.elementAt(i).descr[15];
            s[12] =parent.medicines[Integer.parseInt(s[11])];
            tm.addRow(s);
        }
        jTable1.setModel(tm);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        new JavaLib.LoadForm();
        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        new JavaLib.LoadForm();
        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mining Signatures from Event Sequences and ");

        new JavaLib.LoadForm();
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyPack/heart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        new JavaLib.LoadForm();
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Dataset");

        new JavaLib.LoadForm();

        new JavaLib.LoadForm();
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        new JavaLib.LoadForm();
        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Remove Selected");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 419, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(423, 423, 423))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        parent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DlgAddEntry d = new DlgAddEntry(this, true, parent);
        d.setVisible(true);
        if(!d.cancel){
            //parent.dataSet.addElement(d.vals);
            parent.dataSet.dataSet.addElement(d.se);
            tm = new DefaultTableModel(colHeader, 0);
        
            fillTable();
            jTable1.setModel(tm);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        if(index != -1){
            if(JOptionPane.showConfirmDialog(this, "Are you sure you wish to remove this entry?","Confirm entry removal",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                parent.dataSet.dataSet.removeElementAt(index);
                tm = new DefaultTableModel(colHeader, 0);
        
                fillTable();
                jTable1.setModel(tm);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
