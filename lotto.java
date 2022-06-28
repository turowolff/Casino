import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.06.2022
 * @author 
 */

public class lotto extends JFrame {
    ArrayList<Integer> lottoinputbyuser = new ArrayList<Integer>();
//    Arrays.sort(lottoinputbyuser);
  
   //Arrays.sort(lottoinputbyuser);
   //int[] lottoinput = new int[6];
  //int[] lotto = {1,32};
    //int[] geordnetlotto = new int[6];
    /*int zaehler;
    for(int i=0; i<lottoinput.length; i++) {
    zaehler=1;
    do {

      if (lottoinput[i]==geordnetlotto[zaehler]) {
      System.out.println(lottoinput[i]);
      zaehler=geordnetlotto.length;
      }
      zaehler++;                                
    } while (zaehler<geordnetlotto.length);   
    */
   // int zaehler= 0;
    /*do {
     lottoinput[a]  = ;
    } while (zaehler < input );
      */
    //inputField1.setText(lotto);
    //System.out.println(inputField1);
  
    
  // Anfang Attribute
  private JButton b1 = new JButton();
  private JButton b2 = new JButton();
  private JButton b3 = new JButton();
  private JButton b4 = new JButton();
  private JButton b5 = new JButton();
  private JButton b6 = new JButton();
  private JButton b7 = new JButton();
  private JButton b8 = new JButton();
  private JButton b9 = new JButton();
  private JButton b10 = new JButton();
  private JButton b11 = new JButton();
  private JButton b12 = new JButton();
  private JButton b13 = new JButton();
  private JButton b14 = new JButton();
  private JButton b15 = new JButton();
  private JButton b16 = new JButton();
  private JButton b17 = new JButton();
  private JButton b18 = new JButton();
  private JButton b19 = new JButton();
  private JButton b20 = new JButton();
  private JButton b21 = new JButton();
  private JButton b22 = new JButton();
  private JButton b23 = new JButton();
  private JButton b24 = new JButton();
  private JButton b25 = new JButton();
  private JButton b26 = new JButton();
  private JButton b27 = new JButton();
  private JButton b28 = new JButton();
  private JButton b29 = new JButton();
  private JButton b30 = new JButton();
  private JButton b31 = new JButton();
  private JButton b32 = new JButton();
  private JButton b33 = new JButton();
  private JButton b34 = new JButton();
  private JButton b35 = new JButton();
  private JButton b36 = new JButton();
  private JButton b37 = new JButton();
  private JButton b38 = new JButton();
  private JButton b39 = new JButton();
  private JButton b40 = new JButton();
  private JButton b41 = new JButton();
  private JButton b42 = new JButton();
  private JButton b43 = new JButton();
  private JButton b44 = new JButton();
  private JButton b45 = new JButton();
  private JButton b46 = new JButton();
  private JButton b47 = new JButton();
  private JButton b48 = new JButton();
  private JButton b49 = new JButton();
  private JTextField inputField = new JTextField();
  private JTextField inputField1 = new JTextField();
  private JTextField sameFigures = new JTextField();
  private JButton bZeigemeineZahlen = new JButton();
  private JLabel lBittewaehledeine6Zahlenaus = new JLabel();
  private JLabel lDeinegleichenZahlen = new JLabel();
  private JButton bStarten = new JButton();
  private JLabel lGezogeneZahlen = new JLabel();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JLabel lDeinGeld = new JLabel();
  // Ende Attribute
  
  public lotto() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 650; 
    int frameHeight = 647;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("lotto");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    lDeinGeld.setBounds(520, 525, 110, 20);
    lDeinGeld.setText("Dein Geld:");
    cp.add(lDeinGeld);
    jNumberField1.setBounds(517, 554, 75, 20);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jTextField3.setBounds(91, 544, 400, 40);
    cp.add(jTextField3);
    jTextField2.setBounds(176, 504, 150, 20);
    cp.add(jTextField2);
    lGezogeneZahlen.setBounds(178, 473, 110, 20);
    lGezogeneZahlen.setText("Gezogene Zahlen");
    cp.add(lGezogeneZahlen);
    bStarten.setBounds(5, 546, 75, 25);
    bStarten.setText("Starten");
    bStarten.setMargin(new Insets(2, 2, 2, 2));
    bStarten.addActionListener(new ActionListener() { ;
      public int actionPerformed(ActionEvent evt) { 
        bStarten_ActionPerformed(evt);
      }
    });
    cp.add(bStarten);
    lDeinegleichenZahlen.setBounds(345, 471, 150, 20);
    lDeinegleichenZahlen.setText("Deine gleichen Zahlen");
    cp.add(lDeinegleichenZahlen);
    lBittewaehledeine6Zahlenaus.setBounds(13, 73, 176, 40);
    lBittewaehledeine6Zahlenaus.setText("Bitte wähle deine 6 Zahlen aus");
    cp.add(lBittewaehledeine6Zahlenaus);
    
    bZeigemeineZahlen.setBounds(0, 471, 150, 25);
    bZeigemeineZahlen.setText("Zeige meine Zahlen");
    bZeigemeineZahlen.setMargin(new Insets(2, 2, 2, 2));
    bZeigemeineZahlen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //inputField.setText(""+ bZeigemeineZahlen_ActionPerformed(evt));
        bZeigemeineZahlen_ActionPerformed(evt);
      }
    });
    bZeigemeineZahlen.setBackground(Color.YELLOW);
    cp.add(bZeigemeineZahlen);
    inputField.setBounds(4, 506, 150, 20);
    cp.add(inputField);
    b49.setBounds(536, 432, 75, 25);
    b49.setText("49");
    b49.setMargin(new Insets(2, 2, 2, 2));
    b49.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b49_ActionPerformed(evt);
      }
    });
    cp.add(b49);
    b48.setBounds(448, 432, 75, 25);
    b48.setText("48");
    b48.setMargin(new Insets(2, 2, 2, 2));
    b48.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b48_ActionPerformed(evt);
      }
    });
    cp.add(b48);
    b47.setBounds(360, 432, 75, 25);
    b47.setText("47");
    b47.setMargin(new Insets(2, 2, 2, 2));
    b47.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b47_ActionPerformed(evt);
      }
    });
    cp.add(b47);
    b46.setBounds(272, 432, 75, 25);
    b46.setText("46");
    b46.setMargin(new Insets(2, 2, 2, 2));
    b46.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b46_ActionPerformed(evt);
      }
    });
    cp.add(b46);
    b45.setBounds(184, 432, 75, 25);
    b45.setText("45");
    b45.setMargin(new Insets(2, 2, 2, 2));
    b45.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b45_ActionPerformed(evt);
      }
    });
    cp.add(b45);
    b44.setBounds(96, 432, 75, 25);
    b44.setText("44");
    b44.setMargin(new Insets(2, 2, 2, 2));
    b44.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b44_ActionPerformed(evt);
      }
    });
    cp.add(b44);
    b43.setBounds(8, 432, 75, 25);
    b43.setText("43");
    b43.setMargin(new Insets(2, 2, 2, 2));
    b43.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b43_ActionPerformed(evt);
      }
    });
    cp.add(b43);
    b42.setBounds(536, 384, 75, 25);
    b42.setText("42");
    b42.setMargin(new Insets(2, 2, 2, 2));
    b42.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b42_ActionPerformed(evt);
      }
    });
    cp.add(b42);
    b41.setBounds(448, 384, 75, 25);
    b41.setText("41");
    b41.setMargin(new Insets(2, 2, 2, 2));
    b41.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b41_ActionPerformed(evt);
      }
    });
    cp.add(b41);
    b40.setBounds(360, 384, 75, 25);
    b40.setText("40");
    b40.setMargin(new Insets(2, 2, 2, 2));
    b40.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b40_ActionPerformed(evt);
      }
    });
    cp.add(b40);
    b39.setBounds(272, 384, 75, 25);
    b39.setText("39");
    b39.setMargin(new Insets(2, 2, 2, 2));
    b39.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b39_ActionPerformed(evt);
      }
    });
    cp.add(b39);
    b38.setBounds(184, 385, 76, 24);
    b38.setText("38");
    b38.setMargin(new Insets(2, 2, 2, 2));
    b38.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b38_ActionPerformed(evt);
      }
    });
    cp.add(b38);
    b37.setBounds(96, 384, 75, 25);
    b37.setText("37");
    b37.setMargin(new Insets(2, 2, 2, 2));
    b37.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b37_ActionPerformed(evt);
      }
    });
    b37.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(b37);
    b36.setBounds(8, 384, 75, 25);
    b36.setText("36");
    b36.setMargin(new Insets(2, 2, 2, 2));
    b36.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b36_ActionPerformed(evt);
      }
    });
    cp.add(b36);
    b35.setBounds(536, 336, 75, 25);
    b35.setText("35");
    b35.setMargin(new Insets(2, 2, 2, 2));
    b35.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b35_ActionPerformed(evt);
      }
    });
    cp.add(b35);
    b34.setBounds(448, 336, 75, 25);
    b34.setText("34");
    b34.setMargin(new Insets(2, 2, 2, 2));
    b34.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b34_ActionPerformed(evt);
      }
    });
    cp.add(b34);
    b33.setBounds(360, 336, 75, 25);
    b33.setText("33");
    b33.setMargin(new Insets(2, 2, 2, 2));
    b33.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b33_ActionPerformed(evt);
      }
    });
    cp.add(b33);
    b32.setBounds(272, 336, 75, 25);
    b32.setText("32");
    b32.setMargin(new Insets(2, 2, 2, 2));
    b32.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b32_ActionPerformed(evt);
      }
    });
    cp.add(b32);
    b31.setBounds(184, 336, 75, 25);
    b31.setText("31");
    b31.setMargin(new Insets(2, 2, 2, 2));
    b31.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b31_ActionPerformed(evt);
      }
    });
    cp.add(b31);
    b30.setBounds(96, 336, 75, 25);
    b30.setText("30");
    b30.setMargin(new Insets(2, 2, 2, 2));
    b30.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b30_ActionPerformed(evt);
      }
    });
    cp.add(b30);
    b29.setBounds(8, 336, 75, 25);
    b29.setText("29");
    b29.setMargin(new Insets(2, 2, 2, 2));
    b29.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b29_ActionPerformed(evt);
      }
    });
    cp.add(b29);
    b28.setBounds(536, 288, 75, 25);
    b28.setText("28");
    b28.setMargin(new Insets(2, 2, 2, 2));
    b28.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b28_ActionPerformed(evt);
      }
    });
    cp.add(b28);
    b27.setBounds(448, 288, 75, 25);
    b27.setText("27");
    b27.setMargin(new Insets(2, 2, 2, 2));
    b27.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b27_ActionPerformed(evt);
      }
    });
    cp.add(b27);
    b26.setBounds(360, 288, 75, 25);
    b26.setText("26");
    b26.setMargin(new Insets(2, 2, 2, 2));
    b26.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b26_ActionPerformed(evt);
      }
    });
    cp.add(b26);
    b25.setBounds(272, 288, 75, 25);
    b25.setText("25");
    b25.setMargin(new Insets(2, 2, 2, 2));
    b25.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b25_ActionPerformed(evt);
      }
    });
    cp.add(b25);
    b24.setBounds(184, 288, 75, 25);
    b24.setText("24");
    b24.setMargin(new Insets(2, 2, 2, 2));
    b24.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b24_ActionPerformed(evt);
      }
    });
    cp.add(b24);
    b23.setBounds(96, 288, 75, 25);
    b23.setText("23");
    b23.setMargin(new Insets(2, 2, 2, 2));
    b23.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b23_ActionPerformed(evt);
      }
    });
    cp.add(b23);
    b22.setBounds(8, 288, 75, 25);
    b22.setText("22");
    b22.setMargin(new Insets(2, 2, 2, 2));
    b22.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b22_ActionPerformed(evt);
      }
    });
    cp.add(b22);
    b21.setBounds(536, 240, 75, 25);
    b21.setText("21");
    b21.setMargin(new Insets(2, 2, 2, 2));
    b21.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //b2_ActionPerformed(evt);  
         //inputField.setText(""+ b2_ActionPerformed(evt));
        b21_ActionPerformed(evt);
      }
    });
    cp.add(b2);
    b20.setBounds(448, 240, 75, 25);
    b20.setText("20");
    b20.setMargin(new Insets(2, 2, 2, 2));
    b20.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b20_ActionPerformed(evt);
      }
    });
    cp.add(b20);
    b19.setBounds(360, 240, 75, 25);
    b19.setText("19");
    b19.setMargin(new Insets(2, 2, 2, 2));
    b19.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b19_ActionPerformed(evt);
      }
    });
    cp.add(b19);
    b18.setBounds(272, 240, 75, 25);
    b18.setText("18");
    b18.setMargin(new Insets(2, 2, 2, 2));
    b18.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b18_ActionPerformed(evt);
      }
    });
    cp.add(b18);
    b17.setBounds(184, 240, 75, 25);
    b17.setText("17");
    b17.setMargin(new Insets(2, 2, 2, 2));
    b17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b17_ActionPerformed(evt);
      }
    });
    cp.add(b17);
    b16.setBounds(96, 240, 75, 25);
    b16.setText("16");
    b16.setMargin(new Insets(2, 2, 2, 2));
    b16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b16_ActionPerformed(evt);
      }
    });
    cp.add(b16);
    b15.setBounds(8, 240, 75, 25);
    b15.setText("15");
    b15.setMargin(new Insets(2, 2, 2, 2));
    b15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b15_ActionPerformed(evt);
      }
    });
    cp.add(b15);
    b14.setBounds(536, 192, 75, 25);
    b14.setText("14");
    b14.setMargin(new Insets(2, 2, 2, 2));
    b14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b14_ActionPerformed(evt);
      }
    });
    cp.add(b14);
    b13.setBounds(448, 192, 75, 25);
    b13.setText("13");
    b13.setMargin(new Insets(2, 2, 2, 2));
    b13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b13_ActionPerformed(evt);
      }
    });
    cp.add(b13);
    b12.setBounds(360, 192, 75, 25);
    b12.setText("12");
    b12.setMargin(new Insets(2, 2, 2, 2));
    b12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b12_ActionPerformed(evt);
      }
    });
    cp.add(b12);
    b11.setBounds(272, 192, 75, 25);
    b11.setText("11");
    b11.setMargin(new Insets(2, 2, 2, 2));
    b11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b11_ActionPerformed(evt);
      }
    });
    cp.add(b11);
    b10.setBounds(184, 192, 75, 25);
    b10.setText("10");
    b10.setMargin(new Insets(2, 2, 2, 2));
    b10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b10_ActionPerformed(evt);
      }
    });
    cp.add(b10);
    b9.setBounds(96, 192, 75, 25);
    b9.setText("9");
    b9.setMargin(new Insets(2, 2, 2, 2));
    b9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b9_ActionPerformed(evt);
      }
    });
    cp.add(b9);
    b8.setBounds(8, 192, 75, 25);
    b8.setText("8");
    b8.setMargin(new Insets(2, 2, 2, 2));
    b8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b8_ActionPerformed(evt);
      }
    });
    cp.add(b8);
    b7.setBounds(536, 144, 75, 25);
    b7.setText("7");
    b7.setMargin(new Insets(2, 2, 2, 2));
    b7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b7_ActionPerformed(evt);
      }
    });
    cp.add(b7);
    b6.setBounds(448, 144, 75, 25);
    b6.setText("6");
    b6.setMargin(new Insets(2, 2, 2, 2));
    b6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b6_ActionPerformed(evt);
      }
    });
    cp.add(b6);
    b5.setBounds(360, 144, 75, 25);
    b5.setText("5");
    b5.setMargin(new Insets(2, 2, 2, 2));
    b5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b5_ActionPerformed(evt);
      }
    });
    cp.add(b5);
    b4.setBounds(272, 144, 75, 25);
    b4.setText("4");
    b4.setMargin(new Insets(2, 2, 2, 2));
    b4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b4_ActionPerformed(evt);
      }
    });
    cp.add(b4);
    b3.setBounds(184, 144, 75, 25);
    b3.setText("3");
    b3.setMargin(new Insets(2, 2, 2, 2));
    b3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b3_ActionPerformed(evt);
      }
    });
    cp.add(b3);
    b2.setBounds(96, 144, 75, 25);
    b2.setText("2");
    b2.setMargin(new Insets(2, 2, 2, 2));
    b2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b2_ActionPerformed(evt);
      }
    });
    
    
    cp.add(b21);
    b1.setBounds(8, 144, 75, 25);
    b1.setText("1");
    b1.setMargin(new Insets(2, 2, 2, 2));
    b1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //inputField.setText(""+ b1_ActionPerformed(evt));
        b1_ActionPerformed(evt);
      }
    });
    cp.add(b1);
    
    cp.setBackground(new Color(0x22DD30));
    setUndecorated(true);
    cp.add(sameFigures);
    sameFigures.setBounds(344, 504, 150, 20);
    // Ende Komponenten
    
    setVisible(true);
   // end of public lotto
   }
  // Anfang Methoden
     
 
  
  public static void main(String[] args) {
    new lotto();
    int geld= 1000;
    bStarten_ActionPerformed(geld);
    
  }  
  // end of main
   
  public void b1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
      
    lottoinputbyuser.add(1);
  } // end of b1_ActionPerformed

  public void b2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    // return //lottoinputbyuser.add(2);
   lottoinputbyuser.add(2);
  }
   

  public void b3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(3);
  } // end of b3_ActionPerformed

  public void b4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
          lottoinputbyuser.add(4);
  } // end of b4_ActionPerformed

  public void b5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
      lottoinputbyuser.add(5);
  } // end of b5_ActionPerformed

  public void b6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(6);
  } // end of b6_ActionPerformed

  public void b7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(7);
  } // end of b7_ActionPerformed

  public void b8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(8);
  } // end of b8_ActionPerformed

  public void b9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(9);
  } // end of b9_ActionPerformed

  public void b10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(10);
  } // end of b10_ActionPerformed

  public void b11_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(11);
  } // end of b11_ActionPerformed

  public void b12_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(12);
  } // end of b12_ActionPerformed

  public void b13_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(13);
  } // end of b13_ActionPerformed

  public void b14_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(14);
  } // end of b14_ActionPerformed

  public void b15_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(15);
  } // end of b15_ActionPerformed

  public void b16_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(16);
  } // end of b16_ActionPerformed

  public void b17_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(17);
  } // end of b17_ActionPerformed

  public void b18_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(18);
  } // end of b18_ActionPerformed

  public void b19_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(19);
  } // end of b19_ActionPerformed

  public void b20_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(20);
  } // end of b20_ActionPerformed

  public void b21_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(21);
  } // end of b2_ActionPerformed

  public void b22_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(22);
  } // end of b22_ActionPerformed

  public void b23_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(23);
  } // end of b23_ActionPerformed

  public void b24_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(24);
  } // end of b24_ActionPerformed

  public void b25_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(25);
  } // end of b25_ActionPerformed

  public void b26_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(26);
  } // end of b26_ActionPerformed

  public void b27_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(27);
  } // end of b27_ActionPerformed

  public void b28_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(28);
  } // end of b28_ActionPerformed

  public void b29_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(29);
  } // end of b29_ActionPerformed

  public void b30_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(30);
  } // end of b30_ActionPerformed

  public void b31_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(31);
  } // end of b31_ActionPerformed

  public void b32_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(32);
  } // end of b32_ActionPerformed

  public void b33_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(33);
  } // end of b33_ActionPerformed

  public void b34_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(34);
  } // end of b34_ActionPerformed

  public void b35_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(35);
  } // end of b35_ActionPerformed

  public void b36_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(36);
  } // end of b36_ActionPerformed

  public void b37_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(37);
  } // end of b37_ActionPerformed

  public void b38_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(38);
  } // end of b38_ActionPerformed

  public void b39_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(39);
  } // end of b39_ActionPerformed

  public void b40_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(40);
  } // end of b40_ActionPerformed

  public void b41_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(41);
  } // end of b41_ActionPerformed

  public void b42_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(42);
  } // end of b42_ActionPerformed

  public void b43_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(43);
  } // end of b43_ActionPerformed

  public void b44_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(44);
  } // end of b44_ActionPerformed

  public void b45_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(45);
  } // end of b45_ActionPerformed

  public void b46_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    lottoinputbyuser.add(46);
  } // end of b46_ActionPerformed

  public void b47_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(47);
  } // end of b47_ActionPerformed

  public void b48_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(48);
  } // end of b48_ActionPerformed

  public void b49_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     lottoinputbyuser.add(49);
  } // end of b49_ActionPerformed

  public void bZeigemeineZahlen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     //return System.out.println(lottoinputbyuser);
    inputField.setText("" +lottoinputbyuser);
  } // end of bZeigemeineZahlen_ActionPerformed

  public int bStarten_ActionPerformed(ActionEvent evt, int geld) {
  //bei bStarten steht jetzt auch int statt void
    // TODO hier Quelltext einfügen
    
    int geld = geld -10;
   
    
    
        int[] zahlen = new int[6]; 
    
    for(int i =0; i<6; i++) {
  
    Random zufall = new Random();
    
    zahlen[i] = zufall.nextInt(49)+1;
          
    }
    
    Arrays.sort(zahlen);
    
    ArrayList<Integer> hilfe = new ArrayList<Integer>();
    
    for(int i =0; i<6; i++) {
      hilfe.add(zahlen[i]);
     
    }   
   jTextField2.setText("" +hilfe);
    //System.out.println("" + zahlen);
    //Random zahlen fertig 
                    
       int i=0;
       int anzahlRichtige =0;
    
    ArrayList<Integer> hilfe1 = new ArrayList<Integer>();
           
          do {

          if (lottoinputbyuser.get(i)==zahlen[i]) {
            
               hilfe1.add(zahlen[i]);
           // inputField1.setText("Deine gleichen Zahlen: " +lottoinputbyuser.get(i));
           
            anzahlRichtige++;
           }  
          i++;                                
        } while (i<6);
    
    if (hilfe1.isEmpty()) {
          sameFigures.setText("0" );
      jTextField3.setText("Du hast leider nicht gewonnen");
      } else {
          sameFigures.setText("" +hilfe1);
      int y =anzahlRichtige*anzahlRichtige +4;//9;//Gewinnfunktion 
        jTextField3.setText("Du hast " +y +" Euro gewonnen");
      int geld = geld +y;
        } // end of if-else     
    
    
      return geld; 
       
           
  }
  } // end of bStarten_ActionPerformed

  // Ende Methoden
//} 
// end of class lotto
  