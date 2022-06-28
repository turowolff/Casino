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
  Random ran = new Random(); 
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  // Ende Attribute
  
  public Kartenspiel() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 324; 
    int frameHeight = 300;
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
    
      for (int i = 0;i < 32 ;i++ ){
      karten[i] = i; 
      }// end of for
    

    
    jTextField1.setBounds(21, 31, 62, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(105, 29, 54, 20);
    cp.add(jTextField2);
    jTextField3.setBounds(178, 33, 62, 20);
    cp.add(jTextField3);
    jButton1.setBounds(18, 59, 67, 25);
    jButton1.setText("h1 und m1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(21, 88, 59, 25);
    jButton2.setText("h1 und m2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(14, 123, 67, 25);
    jButton3.setText("h1 und m3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jTextField4.setBounds(12, 168, 70, 20);
    cp.add(jTextField4);
    jTextField5.setBounds(112, 168, 54, 20);
    cp.add(jTextField5);
    jTextField6.setBounds(189, 170, 62, 20);
    cp.add(jTextField6);
    jButton4.setBounds(259, 97, 43, 25);
    jButton4.setText("spielende");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(100, 62, 59, 25);
    jButton5.setText("h2 und m1");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(106, 94, 59, 25);
    jButton6.setText("h2 und m2");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(106, 127, 59, 25);
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
    jTextField7.setBounds(182, 231, 78, 20);
    jTextField7.setText("III");
    cp.add(jTextField7);
    jButton8.setBounds(3, 229, 75, 25);
    jButton8.setText("spielstart");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
        
              
        
      }
    });
    cp.add(jButton8);
    jTextField8.setBounds(185, 7, 70, 20);
    jTextField8.setText("III");
    cp.add(jTextField8);
    jButton9.setBounds(176, 61, 75, 25);
    jButton9.setText("h3 und m1");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(175, 99, 75, 25);
    jButton10.setText("h3 und m2");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(178, 129, 75, 25);
    jButton11.setText("h3 und m3");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Kartenspiel

  // Anfang Methoden
  
  public static void main(String[] args) {
    new Kartenspiel();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte4;
    karte4 = karte7;
    karte7 = zwispei;
    
    jTextField1.setText(karte4);
    jTextField4.setText(karte7);
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte5;
    karte5 = karte7;
    karte7 = zwispei;
    jTextField2.setText(karte5);
    jTextField4.setText(karte7);
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte6;
    karte6 = karte7;
    karte7 = zwispei;
    jTextField3.setText(karte6);
    jTextField4.setText(karte7);
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {  // void entfernen? lösung für die Leben?
    // TODO hier Quelltext einfügen
    int ps1 = 2;      // Punkte errechnen
    int ps2 = 1;      // Punkte errechnen 
    if (ps1 < ps2) {
      leben1 = lebabzug(leben1);     // Leben speichern
      }else{
      leben2 = lebabzug(leben2);    // Leben speichern
      } 
    jTextField7.setText(leben1);
    jTextField8.setText(leben2);
    jTextField1.setText(" ");
    jTextField2.setText(" ");
    jTextField3.setText(" ");
    jTextField4.setText(" ");
    jTextField5.setText(" ");
    jTextField6.setText(" ");
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte4;
    karte4 = karte8;
    karte8 = zwispei;
    jTextField1.setText(karte4);
    jTextField5.setText(karte8);
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte5;
    karte5 = karte8;
    karte8 = zwispei;
    jTextField2.setText(karte5);
    jTextField5.setText(karte8);
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte6;
    karte6 = karte8;
    karte8 = zwispei;
    jTextField3.setText(karte6);
    jTextField5.setText(karte8);
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
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
     karte = "karo7";
     return karte;
   }
   if ( a == 1) {
     karte = "karo8";
     return karte;
   }   
   if ( a == 2) {
     karte = "karo9";
     return karte;
   }   
   if ( a == 3) {
     karte = "karo10";
     return karte;
   }   
   if ( a == 4) {
     karte = "karoBube";
     return karte;
   }  
   if ( a == 5) {
     karte = "karoDame";
     return karte;
   }    
   if ( a == 6) {
     karte = "karoKoenig";
     return karte;
   }   
   if ( a == 7) {
     karte = "karoAss";
     return karte;
   }   
   if ( a == 8) {
     karte = "herz7";
     return karte;
   }   
   if ( a == 9) {
     karte = "herz8";
     return karte;
   }   
   if ( a == 10) {
     karte = "herz9";
     return karte;
   }   
   if ( a == 11) {
     karte = "herz10";
     return karte;
   }   
   if ( a == 12) {
     karte = "herzBube";
     return karte;
   }   
   if ( a == 13) {
     karte = "herzDame";
     return karte;
   }   
   if ( a == 14) {
     karte = "herzKoenig";
     return karte;
   }  
   if ( a == 15) {
     karte = "herzAss";
     return karte;
   }   
   if ( a == 16) {
     karte = "pik7";
     return karte;
   }   
   if ( a == 17) {
     karte = "pik8";
     return karte;
   }      
   if ( a == 18) {
     karte = "pik9";
     return karte;
   }   
   if ( a == 19) {
     karte = "pik10";
     return karte;
   }   
   if ( a == 20) {
     karte = "pikBube";
     return karte;
   }   
   if ( a == 21) {
     karte = "pikDame";
     return karte;
   }   
   if ( a == 22) {
     karte = "pikKoenig";
     return karte;
   }   
   if ( a == 23) {
     karte = "pikAss";
     return karte;
   }    
   if ( a == 24) {
     karte = "kreuz7";
     return karte;
   }   
   if ( a == 25) {
     karte = "kreuz8";
     return karte;
   }   
   if ( a == 26) {
     karte = "kreuz9";
     return karte;
   }    
   if ( a == 27) {
     karte = "kreuz10";
     return karte;
   }   
   if ( a == 28) {
     karte = "kreuzBube";
     return karte;
   }   
   if ( a == 29) {
     karte = "kreuzDame";
     return karte;
   }   
   if ( a == 30) {
     karte = "kreuzKoenig";
     return karte;
   }   
   if ( a == 31) {
     karte = "kreuzAss";
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
    // TODO hier Quelltext einfügen
    String zwispei = karte4;
    karte4 = karte9;
    karte9 = zwispei;
    jTextField1.setText(karte4);
    jTextField6.setText(karte9);
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte5;
    karte5 = karte9;
    karte9 = zwispei;
    jTextField2.setText(karte5);
    jTextField6.setText(karte9);
  } // end of jButton10_ActionPerformed

  public void jButton11_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    String zwispei = karte6;
    karte6 = karte9;
    karte9 = zwispei;
    jTextField3.setText(karte6);
    jTextField6.setText(karte9);
  } // end of jButton11_ActionPerformed

  // Ende Methoden
} // end of class Kartenspiel

