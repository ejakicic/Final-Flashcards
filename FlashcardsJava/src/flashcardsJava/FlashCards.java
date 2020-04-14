/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcardsJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author phant
 */
public class FlashCards extends javax.swing.JFrame {

    /**
     * Creates new form FlashCards
     */
    public FlashCards() {
        initComponents();
        this.setTitle("Flashcards");
        createArrays();
        readCards();
        this.QAlabel.setText(cardList.get(0).getFrontInfo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QAlabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        WriteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AnswerField = new javax.swing.JTextField();
        QuestionField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        NextButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        LastButton = new javax.swing.JButton();
        FirstButton = new javax.swing.JButton();
        answerCheckBox = new javax.swing.JCheckBox();
        RandomButton = new javax.swing.JButton();
        MarkingCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        QAlabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        QAlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QAlabel.setText("Question1");
        QAlabel.setToolTipText("");
        QAlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        QAlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QAlabelMouseClicked(evt);
            }
        });

<<<<<<< HEAD
<<<<<<< HEAD
        NextButton.setBackground(new java.awt.Color(255, 51, 51));
        NextButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
=======
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
        jLabel1.setText("Write your own questions!");

        WriteButton.setText("Write");

        jLabel2.setText("Question");

        jLabel3.setText("Answer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WriteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(QuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(WriteButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

<<<<<<< HEAD
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
        NextButton.setText("-->");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 51, 51));
        BackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackButton.setText("<--");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        LastButton.setBackground(new java.awt.Color(255, 51, 51));
        LastButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LastButton.setText(">>");
        LastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastButtonActionPerformed(evt);
            }
        });

        FirstButton.setBackground(new java.awt.Color(255, 51, 51));
        FirstButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FirstButton.setText("<<");
        FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstButtonActionPerformed(evt);
            }
        });

        answerCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        answerCheckBox.setText("Show Answers");

        RandomButton.setBackground(new java.awt.Color(255, 51, 51));
        RandomButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RandomButton.setText("Random");
        RandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });

<<<<<<< HEAD
<<<<<<< HEAD
        MarkingCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MarkingCheckBox.setText("Mark It!");
=======
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FirstButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RandomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NextButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(answerCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(BackButton)
                    .addComponent(LastButton)
                    .addComponent(FirstButton)
                    .addComponent(RandomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBox)
                .addContainerGap(28, Short.MAX_VALUE))
        );
<<<<<<< HEAD
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(answerCheckBox)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QAlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MarkingCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FirstButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BackButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RandomButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NextButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LastButton)))))
                        .addGap(50, 50, 50))))
=======
=======

            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QAlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13

            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QAlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))

>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
<<<<<<< HEAD
                .addGap(11, 11, 11)
                .addComponent(MarkingCheckBox)
                .addGap(9, 9, 9)
                .addComponent(QAlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(BackButton)
                    .addComponent(LastButton)
                    .addComponent(FirstButton)
                    .addComponent(RandomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerCheckBox)
                .addGap(17, 17, 17))
=======
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QAlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
=======
>>>>>>> 49b5bd63d3de05cd12df654e96ee4fbfeb15fa13
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Like the isFlipped attribute of the Card class, this is false if the question is showing.
    static boolean cardState = false;
    static int position = 0;
    // static String[] QuestionArray = new String[5];
    // static String[] AnswerArray = new String[5];
    static ArrayList<Card> cardList = new ArrayList<Card>();

    static FileSystem fs;
    static File file;
    static Path pathToFile;
    static BufferedReader cardReader;
    static InputStream cardin = null;

    public void readCards() {

        fs = FileSystems.getDefault();
        pathToFile = fs.getPath("C:\\Users\\bulba\\OneDrive\\Documents\\GitHub\\Group-2\\Final-Flashcards\\FlashcardsJava\\src\\flashcardsJava\\TestQuestions.txt");

        try {

            cardin = Files.newInputStream(pathToFile);
            cardReader = new BufferedReader(new InputStreamReader(cardin));
        } catch (IOException iOException) {

        }

        String line;
        int lineCounter = 0;
        int cardCounter = 0;

        try {
            while ((line = cardReader.readLine()) != null) {
                lineCounter++;
                if (lineCounter % 2 != 0) {
                    cardCounter++;
                    if (cardList.size() < cardCounter) {
                        cardList.add(new Card());
                    }
                    cardList.get(cardCounter - 1).setFrontInfo("<html>" + line + "</html>");
                } else {
                    cardList.get(cardCounter - 1).setBackInfo("<html>" + line + "</html>");
                }
            }

        } catch (IOException iOException) {

        }

        try {
            cardin.close();
        } catch (IOException ex) {

        }

    }

    private void flipThrough() {
        if (this.answerCheckBox.isSelected()) {
            if (cardState) {
                // The answer was showing before the label was clicked.
                cardState = false;
                this.QAlabel.setText(cardList.get(position).getFrontInfo());

            } else {
                // The question was showing before the label was clicked.
                cardState = true;
                //Cycle to the next card if it changes back to the answer.
                position++;
                // If the next card shown would be out of bounds, loop back instead.
                try {
                    this.QAlabel.setText(cardList.get(position).getBackInfo());
                } catch (IndexOutOfBoundsException abe) {
                    this.QAlabel.setText(cardList.get(0).getBackInfo());
                    position = 0;
                }// End of try-catch.

            }// End of cardState if.

        } else {

            if (cardState) {
                // The answer was showing before the label was clicked.
                cardState = false;
                // When switching back to a question, cycle to the next card.
                position++;

                // Using a try-catch to loop back is surprisingly effective.
                try {
                    this.QAlabel.setText(cardList.get(position).getFrontInfo());
                } catch (IndexOutOfBoundsException abe) {
                    this.QAlabel.setText(cardList.get(0).getFrontInfo());
                    position = 0;
                }// End of try-catch.

            } else {
                // The question was showing before the label was clicked.
                cardState = true;
                this.QAlabel.setText(cardList.get(position).getBackInfo());

            }// End of cardState if.
        }// End of answerCheckBox if.

    }

    public void createArrays() {
        // Will create matching arrays of questions and answers.
        // Initialize class variables here.

        if (cardList.size() == 0) {
            for (int i = 0; i < 5; i++) {
                cardList.add(new Card());
            }
        }

        // Mike ~ "I'm creating a question and answer array separately for testing purposes. Because Evan gave the cards two sides on their own, you only need one."
        // Implemented card class
        // Front of the card is the question, back of the card is the answer
        String testQuestionString = "Question";
        String testAnswerString = "Answer";
        for (int x = 0; x < cardList.size(); x++) {
            cardList.get(x).setFrontInfo(testQuestionString + (x + 1));
            cardList.get(x).setBackInfo(testAnswerString + (x + 1));
        }

    }
    
    private void WriteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.QuestionField.getText().isEmpty() || this.AnswerField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "There must be both a question and an answer", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Successfully written to cards", "Success", JOptionPane.INFORMATION_MESSAGE);
            String fileName = "C:\\Users\\bulba\\OneDrive\\Documents\\GitHub\\Group-2\\Final-Flashcards\\FlashcardsJava\\src\\flashcardsJava\\TestQuestions.txt";
            File file = new File(fileName);
            try {
                FileWriter fileOut = new FileWriter(file, true);
                fileOut.write("\n" + this.QuestionField.getText());
                fileOut.write("\n" + this.AnswerField.getText());
                fileOut.flush();
                fileOut.close();
            } catch (IOException iOException) {
                System.out.println("Cannot write");
                System.exit(1);
            }
        }
    }
    

    private void QAlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QAlabelMouseClicked
        createArrays();
        readCards();
        flipThrough();

    }//GEN-LAST:event_QAlabelMouseClicked

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomButtonActionPerformed
        readCards();
        int random;
        do {
            random = (int) (Math.random() * cardList.size());
        } while (random == position);
        position = random;

        if (this.answerCheckBox.isSelected()) {
            cardState = true;
            this.QAlabel.setText(cardList.get(position).getBackInfo());
        } else {
            cardState = false;
            this.QAlabel.setText(cardList.get(position).getFrontInfo());
        }
        
        if(this.MarkingCheckBox.isSelected()){
            ArrayList<Card> markedCards = new ArrayList<Card>();
            markedCards.add(cardList.get(position));
        }else{
            
        }
    }//GEN-LAST:event_RandomButtonActionPerformed

    private void FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstButtonActionPerformed
        readCards();
        position = 0;

        if (this.answerCheckBox.isSelected()) {
            this.QAlabel.setText(cardList.get(position).getBackInfo());
        } else {
            this.QAlabel.setText(cardList.get(position).getFrontInfo());
        }
    }//GEN-LAST:event_FirstButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        readCards();
        if (position == cardList.size() - 1) {
            position = 0;
        } else {
            position++;
        }

        if (this.answerCheckBox.isSelected()) {
            this.QAlabel.setText(cardList.get(position).getBackInfo());
        } else {
            this.QAlabel.setText(cardList.get(position).getFrontInfo());
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        readCards();
        if (position == 0) {
            position = cardList.size() - 1;
        } else {
            position--;
        }

        if (this.answerCheckBox.isSelected()) {
            this.QAlabel.setText(cardList.get(position).getBackInfo());
        } else {
            this.QAlabel.setText(cardList.get(position).getFrontInfo());
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastButtonActionPerformed
        readCards();
        position = cardList.size() - 1;

        if (this.answerCheckBox.isSelected()) {
            this.QAlabel.setText(cardList.get(position).getBackInfo());
        } else {
            this.QAlabel.setText(cardList.get(position).getFrontInfo());
        }
    }//GEN-LAST:event_LastButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FlashCards.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlashCards.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlashCards.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlashCards.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlashCards().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerField;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton FirstButton;
    private javax.swing.JButton LastButton;
    private javax.swing.JCheckBox MarkingCheckBox;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel QAlabel;
    private javax.swing.JTextField QuestionField;
    private javax.swing.JButton RandomButton;
    private javax.swing.JButton WriteButton;
    private javax.swing.JCheckBox answerCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
