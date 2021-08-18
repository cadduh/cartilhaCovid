package cartilhaCovid;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Eduardo 
 */


public class loading extends JFrame {
	
	 /**
     * Creates new form home
     */
	
	public loading() {
		// TODO Auto-generated constructor stub
		initComponentes();
		trocarDePagina();
		new Temporizador().start();
	}
	
	public void initComponentes() {
		
		barraDeCarregar = new JProgressBar();
		imagemDeFundo = new JLabel(new ImageIcon("res\\TelaCarregamento.png"));
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(0,0,677,260); // tamanho do JFrame
		setUndecorated(true);
		setLocationRelativeTo(null); // tela fica centralizado
		
		barraDeCarregar.setForeground( Color.green);
		barraDeCarregar.setBounds(0, 225, 677, 7);
		add(barraDeCarregar);
		
		//imagemDeFundo.setIcon( new ImageIcon(getClass().getResource("\\icon\\nomeDaIMagem.png")));
		// falta colocar o tamanho dela 
		imagemDeFundo.setBounds(0,0,677,260);
		add(imagemDeFundo);
		
		
		
	}
	
	public void trocarDePagina() {
		// Quando chegar 100%, esta função chamarar outra tela.	
		barraDeCarregar.addChangeListener(e ->{
			if(barraDeCarregar.getValue() >= 100) {
				this.dispose();
 
				  telaInicial ti = new telaInicial();
				  ti.setVisible(true);
				 
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			    new loading().setVisible(true);
			}
		});
	}
	
	public class Temporizador extends Thread{
        public void run(){
            while(barraDeCarregar.getValue()<100){
                try {
                    sleep(50);
                    barraDeCarregar.setValue(barraDeCarregar.getValue()+1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	
	//Variables declaration
	
	private JLabel imagemDeFundo;
	private JProgressBar barraDeCarregar;
}
