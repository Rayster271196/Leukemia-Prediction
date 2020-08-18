/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classifiers.*;
import java.util.*;
import javax.swing.SwingWorker;

/**
 *
 * @author Hp
 */
public class AnalysisPanel extends javax.swing.JPanel {

    ArrayList<ArrayList<String>> trainingData,testData;
    List<String> rfOutput,knnOutput;
    int tp,tn,fp,fn;
    Long outputTime;
    public AnalysisPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numTrSamples = new javax.swing.JLabel();
        numTestSamples = new javax.swing.JLabel();
        rfAccuracy = new javax.swing.JLabel();
        knnAccuracy = new javax.swing.JLabel();
        rfTime = new javax.swing.JLabel();
        knnTime = new javax.swing.JLabel();
        rfTp = new javax.swing.JLabel();
        knnTp = new javax.swing.JLabel();
        rfTn = new javax.swing.JLabel();
        knnTn = new javax.swing.JLabel();
        rfFp = new javax.swing.JLabel();
        knnFp = new javax.swing.JLabel();
        rfFn = new javax.swing.JLabel();
        knnFn = new javax.swing.JLabel();
        analysisProgress = new javax.swing.JProgressBar();
        rfSensitivity = new javax.swing.JLabel();
        knnSensitivity = new javax.swing.JLabel();
        rfSpecificity = new javax.swing.JLabel();
        knnSpecificity = new javax.swing.JLabel();
        startAnalysis = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Random Forest");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("kNN");

        numTrSamples.setText("Number of Training Samples : N/A ");

        numTestSamples.setText("Number of Test Samples : N/A");

        rfAccuracy.setText("Accuracy : N/A");

        knnAccuracy.setText("Accuracy : N/A");

        rfTime.setText("Time Taken : N/A");

        knnTime.setText("Time Taken : N/A");

        rfTp.setText("True Positive : N/A");

        knnTp.setText("True Positive : N/A");

        rfTn.setText("True Negative : N/A");

        knnTn.setText("True Negative : N/A");

        rfFp.setText("False Positive : N/A");

        knnFp.setText("False Positive : N/A");

        rfFn.setText("False Negative : N/A");

        knnFn.setText("False Negative : N/A");

        rfSensitivity.setText("Sensitivity : N/A");
        rfSensitivity.setToolTipText("Probability of correctly classifiying cells with ALL");

        knnSensitivity.setText("Sensitivity : N/A");
        knnSensitivity.setToolTipText("Probability of correctly classifiying cells with ALL");

        rfSpecificity.setText("Specificity : N/A");
        rfSpecificity.setToolTipText("Probability of correctly classifiying cells without ALL");

        knnSpecificity.setText("Specificity : N/A");
        knnSpecificity.setToolTipText("Probability of correctly classifiying cells without ALL");

        startAnalysis.setText("Start Analysis");
        startAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numTrSamples)
                            .addComponent(numTestSamples))
                        .addGap(226, 226, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(analysisProgress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rfSensitivity)
                                    .addComponent(rfSpecificity)
                                    .addComponent(rfAccuracy)
                                    .addComponent(rfTime)
                                    .addComponent(rfTp)
                                    .addComponent(rfTn)
                                    .addComponent(rfFp)
                                    .addComponent(rfFn)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(knnTime)
                                    .addComponent(knnTp)
                                    .addComponent(knnTn)
                                    .addComponent(knnFp)
                                    .addComponent(knnFn)
                                    .addComponent(knnSensitivity)
                                    .addComponent(knnSpecificity)
                                    .addComponent(knnAccuracy))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numTrSamples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numTestSamples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfAccuracy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfTp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfTn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfFp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfFn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfSensitivity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfSpecificity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(knnAccuracy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(knnTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(knnTp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(knnTn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(knnFp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(knnFn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(knnSpecificity))
                            .addComponent(knnSensitivity))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(analysisProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startAnalysis)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startTimer() {
        outputTime = System.currentTimeMillis();
    }
    
    private static String timeElapsed(long time) {
        double s = (double) (System.currentTimeMillis() - time) / 1000;
        int h = (int) Math.floor(s / ((double) 3600));
        s -= (h * 3600);
        int m = (int) Math.floor(s / ((double) 60));
        s -= (m * 60);
        return s + " sec(s)";
    }
    
    private void startAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startAnalysisActionPerformed
        analysisProgress.setMinimum(0);
        analysisProgress.setMaximum(40);
        rfOutput = new ArrayList<>();
        knnOutput = new ArrayList<>();
        PrepareDataset pd = new PrepareDataset();
        trainingData = pd.getData(Initialization.trainDataPath);
        testData = pd.getData(Initialization.testDataPath);
        SwingWorker analysisWorker = new SwingWorker<Integer,Integer>() {
            @Override
            protected Integer doInBackground() {
                numTrSamples.setText("Number of Training Samples : " + trainingData.size());
                numTestSamples.setText("Number of Test Samples : " + testData.size());
                //Random Forest
                startTimer();
                //System.out.println(Initialization.numTrees + " " + Initialization.numAttrs);
                Initialization.numAttrs = (Integer) Dashboard.numAttributes.getValue();
                Initialization.numTrees = (Integer) Dashboard.numTrees.getValue();
                RandomForest rf = new RandomForest(Initialization.numTrees,4,7,Initialization.numAttrs,2,trainingData);
                rf.readFromFile();
                for(int i=0;i<testData.size();i++)    {
                    publish(i+1);
                    String c = rf.classify(testData.get(i));
                    if(c.equals("true") && testData.get(i).get(testData.get(i).size()-1).equals("true"))
                        tp++;
                    else if(c.equals("false") && testData.get(i).get(testData.get(i).size()-1).equals("false"))
                        tn++;
                    else if(c.equals("true") && testData.get(i).get(testData.get(i).size()-1).equals("false"))
                        fp++;
                    else
                        fn++;
                }
                rfAccuracy.setText("Accuracy : " + ((tp+tn)*100.0/testData.size()) + "%");
                rfTime.setText("Time taken : " + timeElapsed(outputTime));
                rfTp.setText("True Positive : " + (tp*100.0/testData.size()) + "%");
                rfTn.setText("True Negative : " + (tn*100.0/testData.size()) + "%");
                rfFp.setText("False Positive : " + (fp*100.0/testData.size()) + "%");
                rfFn.setText("False Negative : " + (fn*100.0/testData.size()) + "%");
                rfSensitivity.setText("Sensitivity : " + (tp*100.0/(tp+fn)) + "%");
                rfSpecificity.setText("Specificity : " + (tn*100.0/(tn+fp)) + "%");
                
                //knn
                tp=0;tn=0;fp=0;fn=0;
                startTimer();
                KNN knn = new KNN();
                Initialization.numNeighbours = (Integer) Dashboard.numNeighbours.getValue();
                System.out.println(Initialization.numNeighbours);
                KNN.kValue = Initialization.numNeighbours;
                for(int i=0;i<testData.size();i++)    {
                    publish(i+21);
                    String record = "";
                    for(int j=0;j<testData.get(i).size()-1;j++)
                        record += testData.get(i).get(j) + ",";
                    String c = knn.perform(record);
                    if(c.equals("true") && testData.get(i).get(testData.get(i).size()-1).equals("true"))
                        tp++;
                    else if(c.equals("false") && testData.get(i).get(testData.get(i).size()-1).equals("false"))
                        tn++;
                    else if(c.equals("true") && testData.get(i).get(testData.get(i).size()-1).equals("false"))
                        fp++;
                    else
                        fn++;
                }
                knnAccuracy.setText("Accuracy : " + ((tp+tn)*100.0/testData.size()) + "%");
                knnTime.setText("Time taken : " + timeElapsed(outputTime));
                knnTp.setText("True Positive : " + (tp*100.0/testData.size()) + "%");
                knnTn.setText("True Negative : " + (tn*100.0/testData.size()) + "%");
                knnFp.setText("False Positive : " + (fp*100.0/testData.size()) + "%");
                knnFn.setText("False Negative : " + (fn*100.0/testData.size()) + "%");
                knnSensitivity.setText("Sensitivity : " + (tp*100.0/(tp+fn)) + "%");
                knnSpecificity.setText("Specificity : " + (tn*100.0/(tn+fp)) + "%");
                return 100;
            }
            
            @Override
            protected void process (List<Integer> chunks)   {
                Integer value = chunks.get(chunks.size()-1);
                analysisProgress.setValue(value);
            }
            
            @Override
            protected void done()   {
                analysisProgress.setStringPainted(true);
                analysisProgress.setString("Analysis Complete");
            }
            
        };
        analysisWorker.execute();
    }//GEN-LAST:event_startAnalysisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar analysisProgress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel knnAccuracy;
    private javax.swing.JLabel knnFn;
    private javax.swing.JLabel knnFp;
    private javax.swing.JLabel knnSensitivity;
    private javax.swing.JLabel knnSpecificity;
    private javax.swing.JLabel knnTime;
    private javax.swing.JLabel knnTn;
    private javax.swing.JLabel knnTp;
    private javax.swing.JLabel numTestSamples;
    private javax.swing.JLabel numTrSamples;
    private javax.swing.JLabel rfAccuracy;
    private javax.swing.JLabel rfFn;
    private javax.swing.JLabel rfFp;
    private javax.swing.JLabel rfSensitivity;
    private javax.swing.JLabel rfSpecificity;
    private javax.swing.JLabel rfTime;
    private javax.swing.JLabel rfTn;
    private javax.swing.JLabel rfTp;
    private javax.swing.JButton startAnalysis;
    // End of variables declaration//GEN-END:variables
}