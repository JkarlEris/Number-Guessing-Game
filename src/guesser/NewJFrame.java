package guesser;
import java.awt.Color;
import java.util.Random;



public class NewJFrame extends javax.swing.JFrame {

    
        int scores = 0;
        int lives = 5;
        
        Random rand = new Random();
        int randomizer = rand.nextInt(100)+1;
        
        
        
    
    public NewJFrame() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        life = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        guessbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bottext = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cheatcode = new javax.swing.JButton();
        cheat = new javax.swing.JLabel();
        tutorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        title.setText(" GUESSING GAME ");

        life.setBackground(new java.awt.Color(255, 51, 51));
        life.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        life.setText("Life: 5");
        life.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        score.setBackground(new java.awt.Color(255, 51, 51));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("Score: 0");
        score.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        result.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Enter your Number (1-100)");

        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputKeyPressed(evt);
            }
        });

        guessbtn.setBackground(new java.awt.Color(255, 51, 51));
        guessbtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        guessbtn.setForeground(new java.awt.Color(255, 255, 255));
        guessbtn.setText("Guess");
        guessbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessbtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        bottext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bottext.setText("***GOODLUCK***");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(bottext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bottext)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        resetbtn.setBackground(new java.awt.Color(255, 51, 51));
        resetbtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 51, 51));

        cheatcode.setBackground(new java.awt.Color(255, 0, 0));
        cheatcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cheatcode.setForeground(new java.awt.Color(255, 255, 255));
        cheatcode.setText("Reveal Number");
        cheatcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheatcodeActionPerformed(evt);
            }
        });

        cheat.setText("***");

        tutorial.setBackground(new java.awt.Color(255, 51, 51));
        tutorial.setForeground(new java.awt.Color(255, 255, 255));
        tutorial.setText("?");
        tutorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tutorial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(cheat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guessbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cheatcode, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guessbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cheatcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 416, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void guessbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessbtnActionPerformed
       int text = Integer.parseInt(input.getText());
       
       if (text > 100){
           bottext.setText("Your Input is too High");
       }
       else if (text < 100){
           bottext.setText("Your Input is too Low");
       }
       
       if(text == randomizer){
           result.setText("You Guessed the Number!");
           bottext.setText("Good Job!");
           scores++;
           score.setText("Score: "+scores);
           int neww = rand.nextInt(100)+1;
           randomizer = neww;
           cheat.setText("***");
       }
       else if(text > randomizer && lives > 0 && text > 0 && text < 100) {
           result.setText("Your Guess is Higher than the Number");
           bottext.setText("Bad Luck");
           lives--;
           life.setText("Life: "+lives);
       }
       else if(text < randomizer && lives > 0 && text > 0 && text < 100) {
           result.setText("Your Guess is Lower than the Number");
           bottext.setText("Bad Luck");
           lives--;
           life.setText("Life: "+lives);
       } 
       if (lives == 0){
           bottext.setText("The number is: "+randomizer);
           losetab lose = new losetab();
           lose.setVisible(true);
           
       }
       
    }//GEN-LAST:event_guessbtnActionPerformed

    private void cheatcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheatcodeActionPerformed
        cheat.setText(Integer.toString(randomizer));
        bottext.setText("HAHA Cheater");
    }//GEN-LAST:event_cheatcodeActionPerformed

    private void tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialActionPerformed
        Ruleset rule = new Ruleset();
        rule.setVisible(true);
    }//GEN-LAST:event_tutorialActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        
        lives = 5;
        scores = 0;
        life.setText("Life: "+lives);
        score.setText("Score: "+scores);
        cheat.setText("***");
        int neww = rand.nextInt(100)+1;
        randomizer = neww;
       
        
        
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isIdentifierIgnorable(c)){
            input.setEditable(true);
            
        }
        else{
            input.setEditable(false);
             inputError ie = new inputError();
             ie.setVisible(true);
        }
    }//GEN-LAST:event_inputKeyPressed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottext;
    private javax.swing.JLabel cheat;
    private javax.swing.JButton cheatcode;
    private javax.swing.JButton guessbtn;
    private javax.swing.JTextField input;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel life;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel result;
    private javax.swing.JLabel score;
    private javax.swing.JLabel title;
    private javax.swing.JButton tutorial;
    // End of variables declaration//GEN-END:variables
}
   


