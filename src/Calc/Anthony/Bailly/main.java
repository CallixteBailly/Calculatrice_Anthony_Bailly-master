package Calc.Anthony.Bailly;

import javax.annotation.processing.Messager;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;

public class main {
	
	static TextField textAffiche = new TextField("");
	static TextField textAfficheH = new TextField("");
	static String chiffre,chiffre2;
	static String operateur = "";
	static boolean bool = false;
	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("Calculatrice");
		
		fenetre.setBounds(200,200,100,100);
		
		fenetre.setSize(400, 400);
		
		
		
		textAffiche.disable();
		textAfficheH.disable();
		

		JButton bt0 =  new JButton(),
				bt1 =  new JButton(),
				bt2 =  new JButton(),
				bt3 =  new JButton(),
				bt4 =  new JButton(),
				bt5 =  new JButton(),
				bt6 =  new JButton(),
				bt7 =  new JButton(),
				bt8 =  new JButton(),
				bt9 =  new JButton(),
				btnVirgule = new JButton(),
				btPlus = new JButton(),
				btMoins = new JButton(),
				btDiv = new JButton(),
				btFois = new JButton(),
				btPerc = new JButton(),
				btCancelButton = new JButton(),
				btCos = new JButton(),
				btSin = new JButton(),
				btTan = new JButton(),
				btPow = new JButton(),
				btPuis= new JButton(),
				btnEgal = new JButton();
		
		addButton(bt0,"0");
		addButton(bt1,"1");
		addButton(bt2,"2");
		addButton(bt3,"3");
		addButton(bt4,"4");
		addButton(bt5,"5");
		addButton(bt6,"6");
		addButton(bt7,"7");
		addButton(bt8,"8");
		addButton(bt9,"9");
		addButton(btnVirgule,".");
		textAffiche.setText("");
		
		btnEgal = new JButton("=");
		btnEgal.setBackground(Color.WHITE);
		btnEgal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{	
					Double resultat = calcul(operateur);
					textAffiche.setText("");
					textAfficheH.setText("" + resultat);
					chiffre = ""+resultat;
					bool = true;
				} catch (Exception e2) {
					textAfficheH.setText("Erreur");
				}
			}
		});
		

		btPlus = new JButton("+");
		btPlus.setBackground(Color.WHITE);
		btPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAfficheH.setText("+");
				operateur = textAfficheH.getText();
				textAffiche.setText("");
				
			}
		});
		
		btMoins = new JButton("-");
		btMoins.setBackground(Color.WHITE);
		btMoins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("-");
				textAfficheH.setText("-");
				operateur = textAffiche.getText();
				textAffiche.setText("-");

				
			}
		});
		
		btDiv = new JButton("/");
		btDiv.setBackground(Color.WHITE);
		btDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("/");
				textAfficheH.setText("/");
				operateur = textAffiche.getText();
				textAffiche.setText("");
				
			}
		});
		btFois = new JButton("*");
		btFois.setBackground(Color.WHITE);
		btFois.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("*");
				textAfficheH.setText("*");
				operateur = textAffiche.getText();
				textAffiche.setText("");
				
			}
		});
		
		btPerc = new JButton("√");
		btPerc.setBackground(Color.WHITE);
		btPerc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("√");
				textAfficheH.setText("√");
				operateur = textAffiche.getText();
				textAffiche.setText("√"+ chiffre);
				
			}
		});
		btCancelButton = new JButton("C");
		btCancelButton.setBackground(Color.WHITE);
		btCancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAffiche.setText("");
				textAfficheH.setText("");
				textAfficheH.setText("Reset");
				
			}
		});
		
		btCos = new JButton("Cos()");
		btCos.setBackground(Color.WHITE);
		btCos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("Cos()");
				textAfficheH.setText("Cos()");
				operateur = textAffiche.getText();
				textAffiche.setText("Cos("+ chiffre +")");

				
			}
		});
		
		btSin = new JButton("Sin()");
		btSin.setBackground(Color.WHITE);
		btSin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("Sin()");
				textAfficheH.setText("Sin()");
				operateur = textAffiche.getText();
				textAffiche.setText("Sin("+ chiffre +")");
				
			}
		});
		btTan = new JButton("Tan()");
		btTan.setBackground(Color.WHITE);
		btTan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("Tan()");
				textAfficheH.setText("Tan()");
				operateur = textAffiche.getText();
				textAffiche.setText("Tan("+ chiffre +")");
				
			}
		});
		btPow = new JButton("Pow");
		btPow.setBackground(Color.WHITE);
		btPow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAfficheH.setText("pow");
				operateur = "Pow";
				textAfficheH.setText("Pow");
				
			}
		});
		btPuis = new JButton("%");
		btPuis.setBackground(Color.WHITE);
		btPuis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAfficheH.setText("");
				if(!bool) chiffre = textAffiche.getText();
				
				textAffiche.setText("%");
				textAfficheH.setText("%");
				operateur = textAffiche.getText();
				textAffiche.setText("");
				
			}
		});
		
		
		
		
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
		
		p1.add(btTan,0);
		p1.add(btCos,1);
		p1.add(btSin,2);
		p1.add(btPerc,3);
		
		p1.add(btCancelButton,4);		
		p1.add(bt7,5);
		p1.add(bt8,6);
		p1.add(bt9,7);
		
		p1.add(btDiv,8);
		p1.add(btMoins,9);
		p1.add(bt4,10);
		p1.add(bt5,11);
		p1.add(bt6,12);
	
		p1.add(btFois,13);		
		p1.add(btPlus,14);
		p1.add(bt1,15);
		p1.add(bt2,16);
		p1.add(bt3,17);

		p1.add(btnEgal,18);
		p1.add(btnVirgule,19);
		p1.add(btPow,20);
		p1.add(btPuis,21);
		p1.add(bt0,22);




		
		p2.add(textAffiche,BorderLayout.NORTH);
		p2.add(textAfficheH, BorderLayout.NORTH);
		
		p4.add(p1);
		p4.add(p2,BorderLayout.NORTH);


		fenetre.add(p4);
		
		fenetre.setVisible(true);
		
		
		
	}
	public static Double calcul(String operateur)
	{
		switch (operateur) {
		case "+":
			return  Double.parseDouble(chiffre)+ Double.parseDouble(textAffiche.getText());
		case "-":
			return Double.parseDouble(chiffre)+ Double.parseDouble(textAffiche.getText());
		case "*":
			return Double.parseDouble(chiffre) * Double.parseDouble(textAffiche.getText());
		case "/":
			return Double.parseDouble(chiffre) / Double.parseDouble(textAffiche.getText());
		case "√":
			return Math.sqrt(Double.parseDouble(chiffre));
		case "Cos()":
			return Math.cos(Double.parseDouble(chiffre));
		case "Sin()":
			return Math.sin(Double.parseDouble(chiffre));
		case "Tan()":
			return Math.tan(Double.parseDouble(chiffre));
		case "Pow":
			return Math.pow(Double.parseDouble(chiffre), Double.parseDouble(textAffiche.getText()));
		case "%":
			return (Double.parseDouble(chiffre) * 100)/ Double.parseDouble(textAffiche.getText());
		default:
			return (double) 0;
		}

		
	}
	public static void addButton(JButton btn,final String valeur){
		btn.setText(valeur);
		textAffiche.setText(valeur);
		btn.setBackground(Color.LIGHT_GRAY);;
		btn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {}

			public void mouseEntered(MouseEvent e) {
				JButton source = (JButton)e.getSource();
				source.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			}

			public void mouseExited(MouseEvent e) {
				JButton source = (JButton)e.getSource();
				source.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			}

			public void mousePressed(MouseEvent e) {}

			public void mouseReleased(MouseEvent e) {}
		});
		btn.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e) {							
					String s = textAffiche.getText() + valeur;
					textAffiche.setText(s);
					bool = false;

				}
			});
	}
	

}
