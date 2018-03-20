/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

 
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class FrmLoadCSV extends javax.swing.JFrame {
    Vector<String[]> dataVec;
    MainForm parent;
    FrmDSS p2;
    int calledBy = 0;
    boolean processComplete = false;
    public FrmLoadCSV(MainForm parent, int calledBy) {
        this.calledBy = calledBy;
        this.parent = parent;
        initComponents();
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2); 
        jLabel2.setText("Diabetes Prediction using Data Mining");
    }

    public FrmLoadCSV(FrmDSS pt, int calledBy, MainForm parent) {
        this.calledBy = calledBy;
        this.p2 = pt;
        this.parent = parent;
        initComponents();
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2); 
        jLabel2.setText("Diabetes Prediction using Data Mining");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        
        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Diabetes Prediction using Data Mining");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("");

        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyPack/heart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Import Dataset");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

       
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Select File");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if(calledBy == 0){
            parent.setVisible(true);
        }else{
            p2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        processComplete = false;
        try{
            FileDialog fd = new FileDialog(this);
            fd.setVisible(true);
            String fname = "";
            if(fd.getFile() == null){
                return;
            }
            fname = fd.getDirectory() + fd.getFile();
            jTextArea1.setText(fname);
            dataVec = new Vector<String[]>();
            Vector<String> inputVector = new Vector<String>();
            try{
                BufferedReader br = new BufferedReader(new FileReader(fname));
                while(true){
                    String contents = br.readLine();
                    if(contents == null)
                        break;
                    if(!(contents.startsWith("%") || contents.startsWith("@")))
                        inputVector.addElement(contents);
                }
                br.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error Reading file : " + e);
                return;
            }
            try{
                //parsing
                int cols = 15;
                if(calledBy == 0){
                    cols = 16;
                }
                boolean flag = false;
                Vector<String> sarr = new Vector<String>();
                for(int cnt=0;cnt<inputVector.size();cnt++){
                    StringTokenizer stok = new StringTokenizer(inputVector.elementAt(cnt), ",");
                    sarr.clear();
                    while(stok.hasMoreElements()){
                        sarr.addElement(stok.nextToken());
                    }
                    if(sarr.size() != cols){
                        JOptionPane.showMessageDialog(this,"Invalid Entry [" + cnt + "]: " + inputVector.elementAt(cnt) + "\nProcess Stopped.");
                        return;
                    }
                    String s[] = new String[cols];
                    for(int i=0;i<cols;i++){
                        s[i] = sarr.elementAt(i);
                    }
                    dataVec.addElement(s);
                }
                
                System.out.println("Total Entries : " + dataVec.size());
                if(calledBy == 0){
                    //parent.dataSet = new Vector<Integer[]>();
              //      parent.dataSet.dataSet = new Vector<SingleEntry>();
                }else{
                    //parent.compareSet = new Vector<Integer[]>();
              //      parent.compareSet.dataSet = new Vector<SingleEntry>();
                }
                int age = 0, bps = 0, tempInt=0;
                int date,day,month,year;
                double tempDouble=0.0;
                for(int i=0;i<dataVec.size();i++){
                    Integer ds[] = new Integer[11];
                    String dsStr[] = new String[14];
                    ////age
                    age = 0;
                    try{
                        age = (int)Double.parseDouble(dataVec.elementAt(i)[0]);
                    }catch(Exception e){
                        e.printStackTrace();
                        System.out.append("Value 1");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(age <= 40){
                        ds[0] = 0;
                    }else if(age <= 50){
                        ds[0] = 1;
                    }else{
                        ds[0] = 2;
                    }
                    ///////sex
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[1]);
                    }catch(Exception e){
                        System.out.append("Value 2");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempInt < 2){
                        ds[1] = tempInt;
                    }else{
                        System.out.append("Value 2");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    double tempd=0;
                    /////amplitude
                    try{
                         tempd= Double.parseDouble(dataVec.elementAt(i)[2]);
                        System.out.println("V3 is "+tempd);
                    }catch(Exception e){
                        e.printStackTrace();
                        System.out.append("Value 3");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if((tempd > 4) && (tempd < 7.8)){
                        ds[2] = (int)tempd;
                    }else{
                        System.out.append("Value 555555 3");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    ////blood Pressure
                    bps = 0;
                    try{
                        bps = (int)Double.parseDouble(dataVec.elementAt(i)[3]);
                    }catch(Exception e){
                        System.out.append("Value 4");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(bps <= 120){
                        ds[3] = 0;
                    }else if(bps <= 140){
                        ds[3] = 1;
                    }else{
                        ds[3] = 2;
                    }
                    
                    ///calcium level
                    tempDouble = 0;
                    try{
                        tempDouble = Double.parseDouble(dataVec.elementAt(i)[4]);
                    }catch(Exception e){
                        System.out.append("Value 5");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempDouble <= 70){
                        ds[4] = 0;
                    }else if(tempDouble >= 70 && tempDouble <= 100){
                        ds[4] = 1;
                    }else if(tempDouble > 100 && tempDouble <= 126){
                        ds[4] = 2;
                    }else{
                        ds[4] = 2;
                    }
    
                    ///////spike
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[5]);
                    }catch(Exception e){
                        System.out.append("Value 6");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempInt < 2){
                        ds[5] = tempInt;
                    }else{
                        System.out.append("Value 6");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    /////frequency
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[6]);
                    }catch(Exception e){
                        System.out.append("Value 7");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempInt > 3){
                        ds[6] = tempInt;
                    }else{
                        System.out.append("Value 7");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
//                    /////Date 
                    try{
                        date = (int)Double.parseDouble(dataVec.elementAt(i)[7]);
                        ds[6] = date;
                        String dt=date+"";
                        year=2014;
                        if(ds[6].toString().length()==4){
                        month=Integer.parseInt(dt.substring(1,2));
                        day=Integer.parseInt(dt.substring(3,2));
                        }else{
                            month=Integer.parseInt(dt.substring(1,1));
                        day=Integer.parseInt(dt.substring(2,2));
                        }
                    }catch(Exception e){
                       // printLeftoutLine(dataVec.elementAt(i), i);
                      //  continue;
                    }
                    //if(tempInt < 3){
                        
//                    }else{
//                        printLeftoutLine(dataVec.elementAt(i), i);
//                        continue;
//                    }
                    ///////dropping thalach because the values are real and infinite #7
                    //delta wave frequency
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[8]);
                    }catch(Exception e){
                        System.out.append("Value 9");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempInt < 2){
                        ds[7] = tempInt;
                    }else{
                        System.out.append("Value 9");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    
                    //dropping old peak because the values are real and infinite #9
                    //patient history
                    
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[10]);
                    }catch(Exception e){
                        System.out.append("Value 11");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if((tempInt >= 0) && (tempInt <= 2)){
                        ds[8] = tempInt-1;
                    }else{
                        System.out.append("Value 11");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    //dropping ca because the values are real and infinite #11
                    //head injury
                    try{
                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[12]);
                    }catch(Exception e){
                        System.out.append("Value 13");
                        printLeftoutLine(dataVec.elementAt(i), i);
                        continue;
                    }
                    if(tempInt == 0){
                        ds[9] = 0;
                    }else if(tempInt == 1){
                        ds[9] = 1;
                    
                    }
//                    //smoking
//                    try{
//                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[13]);
//                    }catch(Exception e){
//                        printLeftoutLine(dataVec.elementAt(i), i);
//                        continue;
//                    }
//                    ds[10] = tempInt;
//                    //obesity
//                    try{
//                        tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[14]);
//                    }catch(Exception e){
//                        printLeftoutLine(dataVec.elementAt(i), i);
//                        continue;
//                    }
//                    ds[11] = tempInt;
                    
                    ///////num
                    if(calledBy == 0){
                        try{
                            tempInt = (int)Double.parseDouble(dataVec.elementAt(i)[15]);
                            ds[10] = tempInt;
                        }catch(Exception e){
                            System.out.append("Value 16");
                            printLeftoutLine(dataVec.elementAt(i), i);
                            continue;
                        }
                    }
                    
                }
            }catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Error1 : " + e);
                e.printStackTrace();
                return;
            }
        }catch(Exception e){
            System.out.println("Error2 : " + e);
        }
        processComplete = true;
        JOptionPane.showMessageDialog(this, "Data Loading Successful !");
        this.setVisible(false);
        if(calledBy == 0){
            parent.setVisible(true);
        }else{
            p2.setVisible(true);
            p2.StartCalculations();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    void printLeftoutLine(String sarr[], int lineNumber){
        System.out.print("Discarding Entry at line " + lineNumber + " : ");
        for(int i=0;i<sarr.length;i++){
            System.out.print(sarr[i] + ",");
        }
        System.out.println();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
