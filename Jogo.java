
import javax.swing.JOptionPane;


public class Jogo extends javax.swing.JFrame {
    boolean Jogador1Ativo=true;
    boolean Jogador2Ativo=false;
    int vitoriajog1=0;
    int vitoriajog2=0;
    int numempate=0;
    
    public Jogo() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public  void JogadorAtivo(){
        if (Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        }else{
            Jogador1Ativo = true;
            Jogador2Ativo = false;
    }
            JogadorVencedor("X");
            JogadorVencedor("O");
    }
    public void JogadorVencedor(String Jogador){
       /*verificar linhas*/
        if(B1.getText().equals(Jogador)&&
            (B2.getText().equals(Jogador))&&
                B3.getText().equals(Jogador)){
        if(B1.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
         if(B4.getText().equals(Jogador)&&
            (B5.getText().equals(Jogador))&&
                B6.getText().equals(Jogador)){
        if(B4.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
          if(B7.getText().equals(Jogador)&&
            (B8.getText().equals(Jogador))&&
                B9.getText().equals(Jogador)){
        if(B7.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
           /*verificar colunas*/
        if(B1.getText().equals(Jogador)&&
            (B4.getText().equals(Jogador))&&
                B7.getText().equals(Jogador)){
        if(B1.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
         if(B2.getText().equals(Jogador)&&
            (B5.getText().equals(Jogador))&&
                B8.getText().equals(Jogador)){
        if(B2.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
          if(B3.getText().equals(Jogador)&&
            (B6.getText().equals(Jogador))&&
                B9.getText().equals(Jogador)){
        if(B3.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
            /*verificar diagonais*/
        if(B1.getText().equals(Jogador)&&
            (B5.getText().equals(Jogador))&&
                B9.getText().equals(Jogador)){
        if(B1.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
         if(B3.getText().equals(Jogador)&&
            (B5.getText().equals(Jogador))&&
                B7.getText().equals(Jogador)){
        if(B3.getText().equals("X"))
            Vencedor("Jogador 1");
        else
            Vencedor("Jogador 2");
    }
         if(!B1.getText().equals("")&&
             !B2.getText().equals("")&&
                 !B3.getText().equals("")&&
                 !B4.getText().equals("")&&
                 !B5.getText().equals("")&&
                 !B6.getText().equals("")&&
                 !B7.getText().equals("")&&
                 !B8.getText().equals("")&&
                 !B9.getText().equals("")){
             Vencedor("Empate");
         }
    }
    public void Vencedor(String JogadorVencedor){
        if (JogadorVencedor.equals("Jogador 1")){
           JOptionPane.showMessageDialog(null, "Parabens Jogador 1");
           vitoriajog1++;
           NumVitJ1.setText("Numeros de vitorias:"+vitoriajog1);
           LimpaCampos();
        }
            else
            
             if (JogadorVencedor.equals("Jogador 2")){
                  JOptionPane.showMessageDialog(null, "Parabens Jogador 2");
                  vitoriajog2++;
                  NumVitJ2.setText("Numeros de vitorias:"+vitoriajog2);
                  LimpaCampos();
             }else{
                if (JogadorVencedor.equals("Empate"))
                JOptionPane.showMessageDialog(null, "Jogo Empatado, jogue novamente"); 
                 numempate++;
                 NumEmp.setText("Numeros de Empates:"+numempate);
                 LimpaCampos();
             }
    }
    public void LimpaCampos(){
        B1.setText("");
         B2.setText("");
          B3.setText("");
           B4.setText("");
            B5.setText("");
             B6.setText("");
              B7.setText("");
               B8.setText("");
                B9.setText("");
                Jogador1Ativo = true;
            Jogador2Ativo = false;
                
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        NumVitJ1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NumVitJ2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NumEmp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        sobre = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(0, 102, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        B1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(51, 102, 255));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(51, 102, 255));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B3.setForeground(new java.awt.Color(51, 102, 255));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B4.setForeground(new java.awt.Color(51, 102, 255));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B5.setForeground(new java.awt.Color(51, 102, 255));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B6.setForeground(new java.awt.Color(51, 102, 255));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B7.setForeground(new java.awt.Color(51, 102, 255));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B8.setForeground(new java.awt.Color(51, 102, 255));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        B9.setForeground(new java.awt.Color(51, 102, 255));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B7))
                    .addComponent(B4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B8)
                    .addComponent(B5)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B9)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4)
                    .addComponent(B5)
                    .addComponent(B6))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B8)
                        .addComponent(B9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Jogo"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Jogador1 Simbolo:X");

        NumVitJ1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumVitJ1.setText("Numeros de vitorias:0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Jogador2 Simbolo:O");

        NumVitJ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumVitJ2.setText("Numero de Vitorias:0");

        NumEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NumEmp.setText("Numero de Empate:0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumVitJ1)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(NumVitJ2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(NumVitJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumVitJ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumEmp))
        );

        NovoJogo.setText("Reiniciar o jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        sobre.setText("Reset score");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel4.setText("Feito por Elismar 4ºPeriodo SPI IFAC");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sobre)
                .addGap(11, 11, 11)
                .addComponent(sair)
                .addGap(11, 11, 11)
                .addComponent(jLabel4))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
       if(Jogador1Ativo==true){
          if(B3.getText().equals("")) {
              B3.setText("X");
               B3.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B3.getText().equals("")) {
              B3.setText ("O");
               B3.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(Jogador1Ativo==true){
          if(B4.getText().equals("")) {
              B4.setText("X");
              B4.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B4.getText().equals("")) {
              B4.setText("O");
               B4.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         } // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
       if(Jogador1Ativo==true){
          if(B6.getText().equals("")) {
              B6.setText("X");
              B6.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B6.getText().equals("")) {
              B6.setText("O");
               B6.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }  // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
NumVitJ1.setText("Numeros de vitorias:0"); 
 LimpaCampos();
NumVitJ2.setText("Numeros de vitorias:0"); 
NumEmp.setText("Numeros de Empates:0");
numempate=0;
vitoriajog1=0;
vitoriajog2=0;

// TODO add your handling code here:
    }//GEN-LAST:event_sobreActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
      if(Jogador1Ativo==true){
          if(B5.getText().equals("")) {
              B5.setText("X");
              B5.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B5.getText().equals("")) {
              B5.setText("O");
               B5.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }   // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
 if(Jogador1Ativo==true){
          if(B1.getText().equals("")) {
              B1.setText("X");
              B1.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B1.getText().equals("")) {
              B1.setText("O");
               B1.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
 if(Jogador1Ativo==true){
          if(B2.getText().equals("")) {
              B2.setText("X");
              B2.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B2.getText().equals("")) {
              B2.setText("O");
               B2.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
 if(Jogador1Ativo==true){
          if(B7.getText().equals("")) {
              B7.setText("X");
              B7.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B7.getText().equals("")) {
              B7.setText("O");
               B7.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
 if(Jogador1Ativo==true){
          if(B8.getText().equals("")) {
              B8.setText("X");
              B8.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B8.getText().equals("")) {
              B8.setText("O");
               B8.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
 if(Jogador1Ativo==true){
          if(B9.getText().equals("")) {
              B9.setText("X");
              B9.setForeground(new java.awt.Color(240,0,0));
                JogadorAtivo();
           }
          }else {
            if(B9.getText().equals("")) {
              B9.setText("O");
               B9.setForeground(new java.awt.Color(51, 102, 255));
                JogadorAtivo();
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
 LimpaCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_NovoJogoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumEmp;
    private javax.swing.JLabel NumVitJ1;
    private javax.swing.JLabel NumVitJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton sair;
    private javax.swing.JButton sobre;
    // End of variables declaration//GEN-END:variables
}
