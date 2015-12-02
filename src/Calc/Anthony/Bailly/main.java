package Calc.Anthony.Bailly;
import javafx.scene.layout.Border;

import javax.swing.*;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

import java.awt.*;
import java.awt.event.*;

public class main {

	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("Calculatrice");
		
		fenetre.setBounds(200,200,100,100);
		
		fenetre.setSize(400, 400);
		
		
		TextField textAffiche = new TextField("");
		textAffiche.disable();
		
		Button bt0 = new Button("0");
		bt0.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Button bt1 = new Button("1");
		Button bt2 = new Button("2");
		Button bt3 = new Button("3");
		Button bt4 = new Button("4");
		Button bt5 = new Button("5");
		Button bt6 = new Button("6");
		Button bt7 = new Button("7");
		Button bt8 = new Button("8");
		Button bt9 = new Button("9");

		Button btVirgule = new Button(".");		
		Button btEgal = new Button("=");
		btEgal.setBackground(Color.cyan);
		
		Button btPlus = new Button("+");
		btPlus.setBackground(Color.gray);
		
		Button btMoins = new Button("-");
		btMoins.setBackground(Color.gray);
		
		Button btDiv = new Button("/");
		btDiv.setBackground(Color.gray);
		
		Button btFois = new Button("*");
		btFois.setBackground(Color.gray);
		
		Button btPerc = new Button("%");
		btPerc.setBackground(Color.gray);
		
		Button btCancelButton = new Button("C");
		btCancelButton.setBackground(Color.gray);
		
		Button btG = new Button("(");
		btG.setBackground(Color.gray);
		
		Button btD = new Button(")");
		btD.setBackground(Color.gray);
		
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(100,100));
		JPanel p3 = new JPanel();
		p3.setPreferredSize(new Dimension(100, 100));
		JPanel p4 = new JPanel();
		
		
		
		p1.setLayout(new GridLayout(5,1));
		p2.setLayout(new GridLayout(2,1));
		p3.setLayout(new GridLayout(5,1));
		p4.setLayout(new BorderLayout(4,1));
		
		


		
		p1.add(btG,0);
		p1.add(btD,1);
		p1.add(btPerc,2);
		
		p1.add(btCancelButton,3);		
		p1.add(bt7,4);
		p1.add(bt8,5);
		p1.add(bt9,6);
		
		p1.add(btDiv,7);
		p1.add(bt4,8);
		p1.add(bt5,9);
		p1.add(bt6,10);
	
		p1.add(btFois,11);		
		p1.add(bt1,12);
		p1.add(bt2,13);
		p1.add(bt3,14);
		
		p1.add(btPlus,15);
		p1.add(bt0,16);
		p1.add(btVirgule,17);
		p1.add(btEgal,18);

		p1.add(btMoins,19);


		
		p2.add(textAffiche,BorderLayout.NORTH);
		
		p4.add(p1);
		p4.add(p2,BorderLayout.NORTH);


		fenetre.add(p4);
		
		fenetre.setVisible(true);
		
		
	}

}
