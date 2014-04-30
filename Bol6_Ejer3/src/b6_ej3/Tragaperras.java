package b6_ej3;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class Tragaperras extends JFrame implements ActionListener {


	JTextField caja1;
	JTextField caja2;
	JTextField caja3;
	JButton botonJuego;
	JLabel etiquetaInfo;
	
	private int num1=0, num2=0, num3=0;
	private String cadena=""; 
	
	public Tragaperras(){
		super("Máquina Tragaperras");
		this.setLayout(new FlowLayout());
		
		//Caja1 (no editable)
		caja1=new JTextField("Numero1");
		caja1.setEditable(false);
		this.add(caja1);
		
		
		//Caja2 (no editable)
		caja2=new JTextField("Numero2");
		caja2.setEditable(false);
		this.add(caja2);
		
		
		//Caja3 (no editable)
		caja3=new JTextField("Numero3");
		caja3.setEditable(false);
		this.add(caja3);
		
		//BotonJuego
		botonJuego=new JButton("Prueba tu suerte");
		botonJuego.addActionListener(this);
		this.add(botonJuego);
		
		//Etiqueta indica premio/derrota
		etiquetaInfo=new JLabel("Aquí se recogerá el resultado");
		this.add(etiquetaInfo);
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		
		if(evento.getSource()==botonJuego){

			final int MAX=6;
			num1=(int)(Math.random()*MAX+1);
			num2=(int)(Math.random()*MAX+1);
			num3=(int)(Math.random()*MAX+1);
			
			caja1.setText(String.format("%s",num1));
			caja2.setText(String.format("%s",num2));
			caja3.setText(String.format("%s", num3));
			
			if(num1== num2 && num2==num3)
				cadena="PREMIO: ¡¡¡¡Has Ganado!!!";
			else{
				cadena="Lo sentimos: Sigue Jugando";
			}
				
			etiquetaInfo.setText(String.format("%s", cadena));
			
		}
	}

}
