import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.06.2022
 * @author 
 */

public class Kartenspiel extends JFrame {
  // Anfang Attribute 
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JTextField jTextField6 = new JTextField();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JTextField jTextField7 = new JTextField();
  private JButton jButton8 = new JButton();
  private JTextField jTextField8 = new JTextField();
  int[] karten = new int[32];
    String karte1;
    String karte2;
    String karte3;
    String karte4;
    String karte5;
    String karte6;
    String karte7;
    String karte8;
    String karte9;
    String leben1 = "III";
    String leben2 = "III";
  int bu1;
  int vergleich1;
  int vergleich2;
  int vergleich3;
  int vergleich4;
  int vergleich5;
  int vergleich6;
  int vergleich7;
  int vergleich8;
  int vergleich9;
  int vergleich10;
  int vergleich11;
  int vergleich12;
  
  int tauschkarte4 = 0;
  int tauschkarte5 = 0;
  int tauschkarte6 = 0;
  int tauschkarte7 = 0;
  int tauschkarte8 = 0;
  int tauschkarte9 = 0;
  int tauschkarte10 = 0;
  int tauschkarte11 = 0;
  int tauschkarte12 = 0;
  double geld = 1000;
  int [] x = new int[19];
    
  Random ran = new Random(); 
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  private JButton jButton12 = new JButton();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JButton jButton13 = new JButton();
  private JButton jButton14 = new JButton();
  private JButton jButton15 = new JButton();
  public ImageIcon lRegeln = new ImageIcon(getClass().getResource("images/Screenshot.png"));
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public Kartenspiel() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 674; 
    int frameHeight = 501;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Kartenspiel");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    
    
    jTextField1.setBounds(13, 159, 86, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(113, 157, 86, 20);
    cp.add(jTextField2);
    jTextField3.setBounds(210, 161, 86, 20);
    cp.add(jTextField3);
    jButton1.setBounds(10, 187, 91, 25);
    jButton1.setText("h1 und m1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
      jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(13, 224, 91, 25);
    jButton2.setText("h1 und m2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(14, 259, 91, 25);
    jButton3.setText("h1 und m3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jTextField4.setBounds(12, 288, 94, 20);
    cp.add(jTextField4);
    jTextField5.setBounds(112, 288, 94, 20);
    cp.add(jTextField5);
    jTextField6.setBounds(221, 290, 78, 20);
    cp.add(jTextField6);
    jButton4.setBounds(387, 233, 91, 25);
    jButton4.setText("spielende");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
        
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(116, 190, 83, 25);
    jButton5.setText("h2 und m1");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(114, 222, 91, 25);
    jButton6.setText("h2 und m2");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(114, 255, 91, 25);
    jButton7.setText("h2 und m3");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    jButton7.setBackground(new Color(0xEEEEEE));
    cp.add(jButton7);
    cp.setBackground(new Color(0xFFC800));
    jTextField7.setBounds(318, 303, 78, 20);
    jTextField7.setText("III");
    cp.add(jTextField7);
    jButton8.setBounds(27, 349, 75, 25);
    jButton8.setText("spielstart");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jTextField8.setBounds(313, 143, 70, 20);
    jTextField8.setText("III");
    cp.add(jTextField8);
    jButton9.setBounds(216, 189, 83, 25);
    jButton9.setText("h3 und m1");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(215, 219, 83, 25);
    jButton10.setText("h3 und m2");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(218, 257, 83, 25);
    jButton11.setText("h3 und m3");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    jButton12.setBounds(133, 354, 75, 25);
    jButton12.setText("zug ende");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    cp.add(jButton12);
    jNumberField1.setBounds(354, 16, 91, 20);
    jNumberField1.setText(casio.mon);
    cp.add(jNumberField1);
    jNumberField2.setBounds(394, 186, 75, 20);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jButton13.setBounds(381, 367, 91, 25);
    jButton13.setText("Neu Spielen");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    cp.add(jButton13);
    jButton14.setBounds(289, 368, 75, 25);
    jButton14.setText("Spielregeln");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
        jLabel1.setVisible(true);
        jButton15.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jNumberField1.setVisible(false);
        jNumberField2.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
      }
    });
    cp.add(jButton14);
    jButton15.setBounds(567, 26, 75, 25);
    jButton15.setText("Zurueck");
    jButton15.setVisible(false);
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
        jLabel1.setVisible(false);
        jButton15.setVisible(false);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jNumberField1.setVisible(true);
        jNumberField2.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
      }
    });
    cp.add(jButton15);
    jLabel1.setBounds(10, 51, 38, 36);
    jLabel1.setText("text");
    jLabel1.setDisabledIcon(lRegeln);
    jLabel1.setVisible(false);
    jLabel1.setOpaque(false);
    jLabel1.setEnabled(false);
    cp.add(jLabel1);
    // Ende Komponenten
    
    
    setVisible(true);
  } // end of public Kartenspiel

  // Anfang Methoden
  
  public static void main(String[] arguments) {
    new Kartenspiel();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    String zwispei = karte4;
    karte4 = karte7;
    karte7 = zwispei;
    
    jTextField1.setText(karte4);
    jTextField4.setText(karte7);
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    String zwispei = karte5;
    karte5 = karte7;
    karte7 = zwispei;
    jTextField2.setText(karte5);
    jTextField4.setText(karte7);
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    String zwispei = karte6;
    karte6 = karte7;
    karte7 = zwispei;
    jTextField3.setText(karte6);
    jTextField4.setText(karte7);
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    double ps1 = punterechnung(karte1,karte2,karte3);
    double ps2 = punterechnung(karte7,karte8,karte9); 
    if (ps1 < ps2) {
      if (leben1.equals(" I ")) {
        leben1 = " ";
      } else {
        leben1 = lebabzug(leben1);
      } // end of if-else
      }else{
      if (leben2.equals(" I ")) {
        leben2 = " ";
      } else {
        leben2 = lebabzug(leben2);
      } // end of if-else
      } 
    jTextField7.setText(leben2);
    jTextField8.setText(leben1);
    jTextField1.setText(" ");
    jTextField2.setText(" ");
    jTextField3.setText(" ");
    jTextField4.setText(" ");
    jTextField5.setText(" ");
    jTextField6.setText(" "); 
    
    if (leben2.equals(" ")) {
      jNumberField2.setDouble(0);
    } // end of if
    if (leben1.equals(" ")) {
      casio.mon = casio.mon + 20;
      jNumberField1.setDouble(casio.mon);
      jNumberField2.setDouble(0);
    } // end of if
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    String zwispei = karte4;
    karte4 = karte8;
    karte8 = zwispei;
    jTextField1.setText(karte4);
    jTextField5.setText(karte8);
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    String zwispei = karte5;
    karte5 = karte8;
    karte8 = zwispei;
    jTextField2.setText(karte5);
    jTextField5.setText(karte8);
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    String zwispei = karte6;
    karte6 = karte8;
    karte8 = zwispei;
    jTextField3.setText(karte6);
    jTextField5.setText(karte8);
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    karte1 = kartendeck(ran.nextInt(32));
    karte2 = kartendeck(ran.nextInt(32));
    karte3 = kartendeck(ran.nextInt(32));
    karte4 = kartendeck(ran.nextInt(32));
    karte5 = kartendeck(ran.nextInt(32));
    karte6 = kartendeck(ran.nextInt(32));
    karte7 = kartendeck(ran.nextInt(32));
    karte8 = kartendeck(ran.nextInt(32));
    karte9 = kartendeck(ran.nextInt(32));
    
    jTextField1.setText(karte4);
    jTextField2.setText(karte5);
    jTextField3.setText(karte6);
        
    jTextField4.setText(karte7);
    jTextField5.setText(karte8);
    jTextField6.setText(karte9);
    
  } // end of jButton8_ActionPerformed
  
  static String kartendeck (int a){
  String karte;
   if ( a == 0) {
     karte = "karo 7     ";
     return karte;
   }
   if ( a == 1) {
     karte = "karo 8     ";
     return karte;
   }   
   if ( a == 2) {
     karte = "karo 9     ";
     return karte;
   }   
   if ( a == 3) {
     karte = "karo 10    ";
     return karte;
   }   
   if ( a == 4) {
     karte = "karo Bube  ";
     return karte;
   }  
   if ( a == 5) {
     karte = "karo Dame  ";
     return karte;
   }    
   if ( a == 6) {
     karte = "karo Koenig";
     return karte;
   }   
   if ( a == 7) {
     karte = "karo Ass   ";
     return karte;
   }   
   if ( a == 8) {
     karte = "herz 7     ";
     return karte;
   }   
   if ( a == 9) {
     karte = "herz 8     ";
     return karte;
   }   
   if ( a == 10) {
     karte = "herz 9     ";
     return karte;
   }   
   if ( a == 11) {
     karte = "herz 10    ";
     return karte;
   }   
   if ( a == 12) {
     karte = "herz Bube  ";
     return karte;
   }   
   if ( a == 13) {     
     karte = "herz Dame  ";
     return karte;
   }   
   if ( a == 14) {
     karte = "herz Koenig";
     return karte;
   }  
   if ( a == 15) {
     karte = "herz Ass   ";
     return karte;
   }   
   if ( a == 16) {
     karte = "pik  7     ";
     return karte;
   }   
   if ( a == 17) {
     karte = "pik  8     ";
     return karte;
   }      
   if ( a == 18) {
     karte = "pik  9     ";
     return karte;
   }   
   if ( a == 19) {
     karte = "pik  10    ";
     return karte;
   }   
   if ( a == 20) {
     karte = "pik  Bube  ";
     return karte;
   }   
   if ( a == 21) {
     karte = "pik  Dame  ";
     return karte;
   }   
   if ( a == 22) {
     karte = "pik  Koenig";
     return karte;
   }   
   if ( a == 23) {
     karte = "pik  Ass   ";
     return karte;
   }    
   if ( a == 24) {
     karte = "kreuz7     ";
     return karte;
   }   
   if ( a == 25) {
     karte = "kreuz8     ";
     return karte;
   }   
   if ( a == 26) {
     karte = "kreuz9     ";
     return karte;
   }    
   if ( a == 27) {
     karte = "kreuz10    ";
     return karte;
   }   
   if ( a == 28) {
     karte = "kreuzBube  ";
     return karte;
   }   
   if ( a == 29) {
     karte = "kreuzDame  ";
     return karte;
   }   
   if ( a == 30) {
     karte = "kreuzKoenig";
     return karte;
   }   
   if ( a == 31) {
     karte = "kreuzAss   ";
     return karte;
   }
   
  return null; 
  }     
  
  static String lebabzug (String leb){    
    String end = " ";
    int l = leb.length()-1;
    l--;
    for (int i = l;i>=0 ;i-- ) {
      end = end + leb.charAt(i);
    } // end of for
  return end;
  }  
  
  public void jButton9_ActionPerformed(ActionEvent evt) {
    String zwispei = karte4;
    karte4 = karte9;
    karte9 = zwispei;
    jTextField1.setText(karte4);
    jTextField6.setText(karte9);
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {
    String zwispei = karte5;
    karte5 = karte9;
    karte9 = zwispei;
    jTextField2.setText(karte5);
    jTextField6.setText(karte9);
  } // end of jButton10_ActionPerformed

  public void jButton11_ActionPerformed(ActionEvent evt) {
    String zwispei = karte6;
    karte6 = karte9;
    karte9 = zwispei;
    jTextField3.setText(karte6);
    jTextField6.setText(karte9);
  } // end of jButton11_ActionPerformed

  public void jButton12_ActionPerformed(ActionEvent evt) {

    //vergleich1 = kartenvergleich(karte1,karte2);
    //vergleich2 = kartenvergleich(karte1,karte3);
    //vergleich3 = kartenvergleich(karte2,karte3);    
    //vergleich4 = kartenvergleich(karte1,karte4);
    //vergleich5 = kartenvergleich(karte1,karte5);
    //vergleich6 = kartenvergleich(karte1,karte6);
    //vergleich7 = kartenvergleich(karte2,karte4);
    //vergleich8 = kartenvergleich(karte2,karte5);
    //vergleich9 = kartenvergleich(karte2,karte6);
    //vergleich10 = kartenvergleich(karte3,karte4);
    //vergleich11 = kartenvergleich(karte3,karte5);
    //vergleich12 = kartenvergleich(karte3,karte6);
    
    vergleich1 = kartenvergleich(karte1,karte2);
    vergleich2 = kartenvergleich(karte1,karte3);
    vergleich3 = kartenvergleich(karte2,karte3); 
    
    if (vergleich1 == vergleich2 && vergleich2 == vergleich3 && vergleich1 == vergleich3) {
      jButton4_ActionPerformed(evt);
    } else {
      
    
      
      int eins;
      int zwei;
      int drei;
      int vier; 
      if (vergleich1>=1) {
        eins = 1;
      } else {
        eins = 0;
      } // end of if-else

      if (vergleich2>=1) {
        zwei = 1;
      } else {
        zwei = 0;
      } // end of if-else

      if (vergleich3>=1) {
        drei = 1;
      } else {
        drei = 0;
      } // end of if-else
      vier = eins+zwei+drei;
      if (eins == 1) {
        vergleich4 = kartenvergleich(karte1,karte4);
        vergleich5 = kartenvergleich(karte1,karte5);
        vergleich6 = kartenvergleich(karte1,karte6);
        // verwendbare Karte finden!!! 
        if (vergleich4 == 1 && vergleich1 == 1) {
          tauschkarte4 = 1;                                  //1 = tauschbereit 
        } // end of if
        if (vergleich4 == 2 && vergleich1 == 2) {
          tauschkarte4 = 1;
        } // end of if
      
        if (vergleich5 == 1 && vergleich1 == 1) {
          tauschkarte5 = 1;
        } // end of if
        if (vergleich5 == 2 && vergleich1 == 2) {
          tauschkarte5 = 1;
        } // end of if
      
        if (vergleich6 == 1 && vergleich1 == 1) {
          tauschkarte6 = 1;
        } // end of if
        if (vergleich6 == 2 && vergleich1 == 2) {
          tauschkarte6 = 1;
        } // end of if
      
        if (tauschkarte4 == 1) {
          x[1] = kartenvergleich(karte2,karte4);
          x[2] = kartenvergleich(karte3,karte4);   
        } // end of if
        x[1] = x[1]+x[2];
        if (x[1]>=1) {
          x[1]=1;
        } // end of if
        if (tauschkarte5 == 1) {
          x[3] = kartenvergleich(karte2,karte5);
          x[4] = kartenvergleich(karte3,karte5);
        } // end of if
        x[3] = x[3]+x[4];
        if (x[3]>=1) {
          x[3]=1;
        } // end of if
        if (tauschkarte6 == 1) {
          x[5] = kartenvergleich(karte2,karte6);
          x[6] = kartenvergleich(karte3,karte6);
        } // end of if
        x[5] = x[5]+x[6];
        if (x[5]>=1) {
          x[5]=1;
        } // end of if
        
      } // end of if  
      
      if (zwei == 1) {
        vergleich7 = kartenvergleich(karte1,karte4);
        vergleich8 = kartenvergleich(karte1,karte5);
        vergleich9 = kartenvergleich(karte1,karte6);
        // verwendbare Karte finden!!!
        if (vergleich7 == 1 && vergleich2 == 1) {
          tauschkarte7 = 1;                                  //1 = tauschbereit 
        } // end of if
        if (vergleich7 == 2 && vergleich2 == 2) {
          tauschkarte7 = 1;
        } // end of if
      
        if (vergleich8 == 1 && vergleich2 == 1) {
          tauschkarte8 = 1;
        } // end of if
        if (vergleich8 == 2 && vergleich2 == 2) {
          tauschkarte8 = 1;
        } // end of if
      
        if (vergleich9 == 1 && vergleich2 == 1) {
          tauschkarte9 = 1;
        } // end of if
        if (vergleich9 == 2 && vergleich2 == 2) {
          tauschkarte9 = 1;
        } // end of if
      
        if (tauschkarte7 == 1) {
          x[7] = kartenvergleich(karte1,karte4);
          x[8] = kartenvergleich(karte3,karte4);   
        } // end of if
        x[7] = x[7]+x[8];
        if (x[7]>=1) {
          x[7]=1;
        } // end of if
        if (tauschkarte8 == 1) {
          x[9] = kartenvergleich(karte1,karte5);
          x[10] = kartenvergleich(karte3,karte5);
        } // end of if
        x[9] = x[9]+x[10];
        if (x[9]>=1) {
          x[9]=1;
        } // end of if
        if (tauschkarte9 == 1) {
          x[11] = kartenvergleich(karte2,karte6);
          x[12] = kartenvergleich(karte3,karte6);
        } // end of if
        x[11] = x[11]+x[12];
        if (x[11]>=1) {
          x[11]=1;
        } // end of if
        
      } // end of if
    
      if (drei == 1 ) {
        vergleich10 = kartenvergleich(karte3,karte4);
        vergleich11 = kartenvergleich(karte3,karte5);
        vergleich12 = kartenvergleich(karte3,karte6);
        // verwendbare Karte finden!!!
        if (vergleich10 == 1 && vergleich3 == 1) {
          tauschkarte10 = 1;                                  //1 = tauschbereit 
        } // end of if
        if (vergleich10 == 2 && vergleich3 == 2) {
          tauschkarte10 = 1;
        } // end of if
      
        if (vergleich11 == 1 && vergleich3 == 1) {
          tauschkarte11 = 1;
        } // end of if
        if (vergleich11 == 2 && vergleich3 == 2) {
          tauschkarte11 = 1;
        } // end of if
      
        if (vergleich12 == 1 && vergleich3 == 1) {
          tauschkarte12 = 1;
        } // end of if
        if (vergleich12 == 2 && vergleich3 == 2) {
          tauschkarte12 = 1;
        } // end of if
      
        if (tauschkarte10 == 1) {
          x[13] = kartenvergleich(karte1,karte4);
          x[14] = kartenvergleich(karte2,karte4);   
        } // end of if
        x[13] = x[13]+x[14];
        if (x[13]>=1) {
          x[13]=1;
        } // end of if
        if (tauschkarte11 == 1) {
          x[15] = kartenvergleich(karte1,karte5);
          x[16] = kartenvergleich(karte2,karte5);
        } // end of if
        x[15] = x[15]+x[16];
        if (x[15]>=1) {
          x[15]=1;
        } // end of if
        if (tauschkarte12 == 1) {
          x[17] = kartenvergleich(karte1,karte6);
          x[18] = kartenvergleich(karte2,karte6);
        } // end of if
        x[17] = x[17]+x[18];
        if (x[17]>=1) {
          x[17]=1;
        } // end of if        
      } // end of if
       x[0] =x[1]+x[3]+x[5]+x[7]+x[9]+x[11]+x[13]+x[15]+x[17];
    if (x[0] == 0) {
      tauschkarte4 = ran.nextInt(9);
      if (tauschkarte4 == 0) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (tauschkarte4 == 2) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (tauschkarte4 == 3) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 4) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (tauschkarte4 == 5) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (tauschkarte4 == 6) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 7) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (tauschkarte4 == 8) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
    } // end of if
      if (x[1] == 1) {
        if (eins == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte3;
          karte3 = karte4;
          karte4 = zwischenkarte;
          jTextField1.setText(karte4); 
        } // end of if
        if (zwei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte2;
          karte2 = karte4;
          karte4 = zwischenkarte;
          jTextField1.setText(karte4);
        } // end of if
        if (drei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte1;
          karte1 = karte4;
          karte4 = zwischenkarte;
          jTextField1.setText(karte4);
        } // end of if
      } // end of if      
      
      if (x[3] == 1) {
        if (eins == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte3;
          karte3 = karte5;
          karte5 = zwischenkarte;
          jTextField2.setText(karte5); 
        } // end of if
        if (zwei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte2;
          karte2 = karte5;
          karte5 = zwischenkarte;
          jTextField2.setText(karte5);
        } // end of if
        if (drei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte1;
          karte1 = karte5;
          karte5 = zwischenkarte;
          jTextField2.setText(karte5);
        } // end of if
      } // end of if 
    
      if (x[5] == 1) {
        if (eins == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte3;
          karte3 = karte6;
          karte6 = zwischenkarte; 
          jTextField3.setText(karte6);
        } // end of if
        if (zwei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte2;
          karte2 = karte6;
          karte6 = zwischenkarte;
          jTextField3.setText(karte6);
        } // end of if
        if (drei == 1) {
          String zwischenkarte = " ";
          zwischenkarte = karte1;
          karte1 = karte6;
          karte6 = zwischenkarte;
          jTextField3.setText(karte6);
        } // end of if
      } // end of if 
       if (x[7] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4); 
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);        
      } // end of if
      if (drei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
    } // end of if 
    
    if (x[9] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5); 
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (drei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
    } // end of if 
    
    if (x[11] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6); 
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (drei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
    } // end of if 
    
    if (x[13] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4); 
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (drei == 1) {
       String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
    } // end of if 
    
    if (x[15] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5); 
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (drei == 1) {
       String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
    } // end of if 
    
    if (x[17] == 1) {
      if (eins == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte6;
        karte6 = zwischenkarte; 
        jTextField3.setText(karte6);
      } // end of if
      if (zwei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (drei == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
    } // end of if 
   
    if (vier == 0) {
      tauschkarte4 = ran.nextInt(9);
      if (tauschkarte4 == 0) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 1) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (tauschkarte4 == 2) {
        String zwischenkarte = " ";
        zwischenkarte = karte1;
        karte1 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (tauschkarte4 == 3) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 4) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
      if (tauschkarte4 == 5) {
        String zwischenkarte = " ";
        zwischenkarte = karte2;
        karte2 = karte6;
        karte6 = zwischenkarte;
        jTextField3.setText(karte6);
      } // end of if
      if (tauschkarte4 == 6) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte4;
        karte4 = zwischenkarte;
        jTextField1.setText(karte4);
      } // end of if
      if (tauschkarte4 == 7) {
        String zwischenkarte = " ";
        zwischenkarte = karte3;
        karte3 = karte5;
        karte5 = zwischenkarte;
        jTextField2.setText(karte5);
      } // end of if
        if (tauschkarte4 == 8) {
          String zwischenkarte = " ";
          zwischenkarte = karte3;
          karte3 = karte6;
          karte6 = zwischenkarte;
          jTextField3.setText(karte6);
        } // end of if            
      } // end of if
    } // end of if                               
  } // end of jButton12_ActionPerformed
  
  static int kartenvergleich(String kar1, String kar2) {
    char kar3 ;
    char kar4 ;
    char kar5 ;
    char kar6 ;
    String k1 = " ";
    String k2 = " ";
    String k3 = " ";
    String k4 = " ";
    int r;
    for (int i = 0;i< 5 ;i++ ) {
      kar3=kar1.charAt(i);
      k1=k1+kar3;       
     } // end of for
    for (int i = 0;i< 5 ;i++ ) {
      kar4 = kar2.charAt(i);
      k2=k2+kar4;      
    } // end of for
    if (k2.equals(k1)) {
      r = 1;
      return r;
    } // end of if
    for (int i = 6; i>0; i-- ) {
      kar5 = kar1.charAt(i);
      k3=k3+kar5;
    } // end of for
    for (int i = 6; i>0; i-- ) {
      kar6 = kar2.charAt(i);
      k4=k4+kar6;
    } // end of for
    if (k3.equals(k4)) {
      r = 2;
      return r;
    } // end of if
    return r=0;
  }
  
  private static double punterechnung(String k1, String k2, String k3) {
    char kar1 ;
    String k4 = " ";
    String k5 = " ";
    String k6 = " ";
    String k7 = " ";
    String k8 = " ";
    String k9 = " ";
    double rueck = 0;
    for (int i=0;i<5;i++) {
      kar1=k1.charAt(i);
      k4=k4+kar1; 
    } // end of for
    for (int i=0;i<5;i++) {
      kar1=k2.charAt(i);
      k5=k5+kar1; 
    } // end of for
    for (int i=0;i<5;i++) {
      kar1=k3.charAt(i);
      k6=k6+kar1; 
    } // end of for
    
    if (k4.equals(k5) && k4.equals(k6) && k5.equals(k6)) {
      rueck = punkt(k1) + punkt(k2) + punkt(k3);
      return rueck;
    }else {
      if (k4.equals(k5)) {
        rueck = punkt(k1) + punkt(k2);
        return rueck;
      } // end of if
      if (k4.equals(k6)) {
        rueck = punkt(k1) + punkt(k3);
        return rueck;
      } // end of if
      if (k5.equals(k6)) {
        rueck = punkt(k2) + punkt(k3);
        return rueck;
      } // end of if 
     } // end of if-else 

    
     for (int i = 6; i>0; i-- ) {
      kar1 = k1.charAt(i);
      k7=k7+kar1;
    } // end of for
     for (int i = 6; i>0; i-- ) {
      kar1 = k2.charAt(i);
      k8=k8+kar1;
    } // end of for
     for (int i = 6; i>0; i-- ) {
      kar1 = k3.charAt(i);
      k9=k9+kar1;
    } // end of for
    if (k7.equals(k8) && k7.equals(k9) && k8.equals(k9)) {
      rueck = 30 + 1/2;
      return rueck;
    } // end of if
    return rueck;
  }
  
  private static int punkt(String karte) {
    int p = 0;
    if ( karte.equals("karo 7     ")) {
      p = 7;
      return p;
    }
    if ( karte.equals("karo 8     ")) {
      p = 8;
      return p;
    }
    if ( karte.equals("karo 9     ")) {
      p = 9;
      return p;
    }
    if ( karte.equals("karo 10    ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("karo Bube  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("karo Dane  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("karo Koenig")) {
      p = 10;
      return p;
    }
    if ( karte.equals("karo Ass   ")) {
      p = 11;
      return p;
    }
    if ( karte.equals("herz 7     ")) {
      p = 7;
      return p;
    }
    if ( karte.equals("herz 8     ")) {
      p = 8;
      return p;
    }
    if ( karte.equals("herz 9     ")) {
      p = 9;
      return p;
    }
    if ( karte.equals("herz 10    ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("herz Bube  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("herz Dame  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("herz Koenig")) {
      p = 10;
      return p;
    }
    if ( karte.equals("herz Ass   ")) {
      p = 11;
      return p;
    }
    if ( karte.equals("pik  7     ")) {
      p = 7;
      return p;
    }
    if ( karte.equals("pik  8     ")) {
      p = 8;
      return p;
    }
    if ( karte.equals("pik  9     ")) {
      p = 9;
      return p;
    }
    if ( karte.equals("pik  10    ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("pik  Bube  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("pik  Dame  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("pik  Koenig")) {
      p = 10;
      return p;
    }
    if ( karte.equals("pik  Ass   ")) {
      p = 11;
      return p;
    }
    if ( karte.equals("kreuz7     ")) {
      p = 7;
      return p;
    }
    if ( karte.equals("kreuz8     ")) {
      p = 8;
      return p;
    }
    if ( karte.equals("kreuz9     ")) {
      p = 9;
      return p;
    }
    if ( karte.equals("kreuz10    ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("kreuzBube  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("kreuzDame  ")) {
      p = 10;
      return p;
    }
    if ( karte.equals("kreuzKoenig")) {
      p = 10;
      return p;
    }
    if ( karte.equals("kreuzAss   ")) {
      p = 11;
      return p;
    }
   
    return p; 
  }
  
  public void jButton13_ActionPerformed(ActionEvent evt) {
    leben1 = "III";
    leben2 = "III";
    jTextField7.setText(leben2);
    jTextField8.setText(leben1);
    casio.mon = casio.mon - 10;
    jNumberField1.setDouble(casio.mon);
    jNumberField2.setDouble(10);
  } // end of jButton13_ActionPerformed

  public void jButton14_ActionPerformed(ActionEvent evt) {
    
  } // end of jButton14_ActionPerformed

  public void jButton15_ActionPerformed(ActionEvent evt) {
    
  } // end of jButton15_ActionPerformed

  // Ende Methoden
  
 }// end of class Kartenspiel
