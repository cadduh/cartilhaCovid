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

public class telaInicial extends JFrame {

	/**
	 * Creates new form home
	 */
	static ImageIcon imgIcon;

	public telaInicial() {
		// TODO Auto-generated constructor stub
		initComponentes();
		definirEventos();
		covid19JPanel.setVisible(false);
		sintomaJPanel.setVisible(false);
		transmissaoJPanel.setVisible(false);
		prevencaoJPanel.setVisible(false);
		setLocationRelativeTo(null);

	}

	public void initComponentes() {

		background = new JLabel();
		imgIcon = new ImageIcon(getClass().getResource("/icon/logo.png"));

		/* HOME -- COVID,SINTOMA,TRANSMISSÂO,PREVENÇÃO INÍCIO */
		homeJPanel = new JPanel();
		tituloTelaInicial1 = new JLabel();
		tituloTelaInicial2 = new JLabel();

		covidLabel = new JLabel();
		covidLabelHover = new JLabel();
		iconCovid = new JLabel();
		tituloCovid_Label = new JLabel();

		sintomasLabel = new JLabel();
		sintomasLabelHover = new JLabel();
		iconSintomas = new JLabel();
		tituloSintomas_label = new JLabel();

		transmissaoLabel = new JLabel();
		transmissaoLabelHover = new JLabel();
		iconTransmissao = new JLabel();
		tituloTransmissao_label = new JLabel();

		prevecaoLabel = new JLabel();
		prevencaoLabelHover = new JLabel();
		iconPrevencao = new JLabel();
		tituloPrevencao_label = new JLabel();

		barraStyle = new JLabel();
		banner = new JLabel();
		/* HOME -- COVID,SINTOMA,TRANSMISSÂO,PREVENÇÃO FIM */

		/* COVID-19(jPanel) -- INÍCIO */
		covid19JPanel = new JPanel();

		jLabel3 = new JLabel();
		jLabel6 = new JLabel();

		jScrollPane1 = new JScrollPane();
		jTextArea1 = new JTextArea();
		jButton2 = new JButton();
		/* COVID-19(jPanel) -- FIM */

		/* SINTOMAS(jPanel) -- INÍCIO */
		sintomaJPanel = new JPanel();

		jLabel7 = new JLabel();
		jLabel8 = new JLabel();

		jScrollPane2 = new JScrollPane();
		jTextArea2 = new JTextArea();
		jButton3 = new JButton();
		/* SINTOMAS(jPanel) -- FIM */

		/* TRANSMISSÂO(jPanel) -- INÍCIO */
		transmissaoJPanel = new JPanel();

		jLabel13 = new JLabel();
		jLabel14 = new JLabel();

		jScrollPane3 = new JScrollPane();
		jTextArea3 = new JTextArea();
		jButton4 = new JButton();
		/* TRANSMISSÂO(jPanel) -- FIM */

		/* PREVENÇÂO(jPanel) -- INÍCIO */
		prevencaoJPanel = new JPanel();

		jLabel15 = new JLabel();
		jLabel16 = new JLabel();

		jScrollPane4 = new JScrollPane();
		jTextArea4 = new JTextArea();
		jButton5 = new JButton();
		/* PREVENÇÂO(jPanel) -- FIM */

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setIconImage(imgIcon.getImage());
		setTitle("COVID-19 ");
		setBounds(0, 0, 730, 360);

		// Título da TelaInicial

		barraStyle.setBackground(new Color(0, 0, 0));
		barraStyle.setOpaque(true);
		barraStyle.setBounds(0, 0, 730, 10);
		homeJPanel.add(barraStyle);

		tituloTelaInicial1.setText("Dicas Oficiais");
		tituloTelaInicial1.setFont(new Font("Segoe UI Black", 0, 24)); // NOI18N
		tituloTelaInicial1.setForeground(new Color(0, 0, 0));
		tituloTelaInicial1.setBounds(20, 20, 180, 40);
		homeJPanel.add(tituloTelaInicial1);

		tituloTelaInicial2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
		tituloTelaInicial2.setForeground(new Color(198, 199, 200));
		tituloTelaInicial2.setText("O que precisa Saber e fazer.");
		tituloTelaInicial2.setBounds(20, 60, 260, 20);
		homeJPanel.add(tituloTelaInicial2);

		banner.setIcon(new ImageIcon(getClass().getResource("/icon/text-001.png")));
		banner.setBounds(0, 282, 730, 40);
		add(banner);

		homeJPanel.setBackground(new Color(255, 255, 255));
		add(homeJPanel);

		// COVID-19

		homeJPanel.setLayout(null);

//        tituloCovid_Label.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
//        tituloCovid_Label.setForeground(new Color(0, 0, 0));
//        tituloCovid_Label.setHorizontalAlignment(SwingConstants.CENTER);
//        tituloCovid_Label.setText("Covid-19");
//        tituloCovid_Label.setBounds(40, 190, 110, 30);
//        homeJPanel.add(tituloCovid_Label);
//        
//        iconCovid.setIcon(new ImageIcon(getClass().getResource("/icon/infeccao.png"))); // NOI18N
//        iconCovid.setBounds(60, 120, 70, 60);
//        homeJPanel.add(iconCovid);

		covidLabel.setOpaque(true);
		covidLabel.setBackground(new Color(219, 238, 255));
		covidLabel.setIcon(new ImageIcon(getClass().getResource("/icon/001.png")));
		covidLabel.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
		covidLabel.setBounds(30, 110, 130, 150);
		homeJPanel.add(covidLabel);

		covidLabelHover.setBackground(new Color(171, 216, 255));
		covidLabelHover.setOpaque(true);
		covidLabelHover.setBounds(20, 100, 150, 170);
		homeJPanel.add(covidLabelHover);

		// Sintomas

//        tituloSintomas_label.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
//        tituloSintomas_label.setForeground(new Color(0, 0, 0));
//        tituloSintomas_label.setHorizontalAlignment(SwingConstants.CENTER);
//        tituloSintomas_label.setText("Sintomas");
//        tituloSintomas_label.setBounds(220, 186, 100, 40);
//        homeJPanel.add(tituloSintomas_label);
//
//        iconSintomas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        iconSintomas.setIcon(new ImageIcon(getClass().getResource("/icon/sintoma.png"))); // NOI18N
//        iconSintomas.setBounds(230, 120, 90, 70);
//        homeJPanel.add(iconSintomas);

		sintomasLabel.setOpaque(true);
		sintomasLabel.setBackground(new Color(219, 238, 255));
		sintomasLabel.setIcon(new ImageIcon(getClass().getResource("/icon/002.png")));
		sintomasLabel.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
		sintomasLabel.setForeground(new Color(0, 0, 0));
		sintomasLabel.setBounds(200, 110, 130, 150);
		homeJPanel.add(sintomasLabel);

		sintomasLabelHover.setBackground(new Color(171, 216, 255));
		sintomasLabelHover.setOpaque(true);
		sintomasLabelHover.setBounds(192, 100, 147, 170);
		homeJPanel.add(sintomasLabelHover);

		// Transmissão

//        tituloTransmissao_label.setFont(new Font("Segoe UI Black", 0, 14)); // NOI18N
//        tituloTransmissao_label.setForeground(new Color(0, 0, 0));
//        tituloTransmissao_label.setHorizontalAlignment(SwingConstants.CENTER);
//        tituloTransmissao_label.setText("Transmissão");
//        tituloTransmissao_label.setBounds(400, 200, 100, 30);
//        homeJPanel.add(tituloTransmissao_label);
//        
//        
//        iconTransmissao.setHorizontalAlignment(SwingConstants.CENTER);
//        iconTransmissao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transmissao.png"))); // NOI18N
//        iconTransmissao.setBounds(400, 120, 100, 70);
//        homeJPanel.add(iconTransmissao);

		transmissaoLabel.setBackground(new Color(219, 238, 255));
		transmissaoLabel.setOpaque(true);
		transmissaoLabel.setIcon(new ImageIcon(getClass().getResource("/icon/003.png")));
		transmissaoLabel.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
		transmissaoLabel.setForeground(new Color(0, 0, 0));
		transmissaoLabel.setBounds(380, 110, 130, 150);
		homeJPanel.add(transmissaoLabel);

		transmissaoLabelHover.setBackground(new java.awt.Color(171, 216, 255));
		transmissaoLabelHover.setOpaque(true);
		transmissaoLabelHover.setBounds(370, 100, 150, 170);
		homeJPanel.add(transmissaoLabelHover);

		// PREVENÇÂO

//        tituloPrevencao_label.setFont(new Font("Segoe UI Black", 0, 14)); // NOI18N
//        tituloPrevencao_label.setForeground(new Color(0, 0, 0));
//        tituloPrevencao_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        tituloPrevencao_label.setText("Prevenção");
//        tituloPrevencao_label.setBounds(580, 200, 90, 30);
//        homeJPanel.add(tituloPrevencao_label);
//        
//        iconPrevencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        iconPrevencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mulher (1).png"))); // NOI18N
//        iconPrevencao.setBounds(580, 130, 100, 60);
//        homeJPanel.add(iconPrevencao);

		prevecaoLabel.setBackground(new Color(219, 238, 255));
		prevecaoLabel.setOpaque(true);
		prevecaoLabel.setIcon(new ImageIcon(getClass().getResource("/icon/004.png")));
		prevecaoLabel.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
		prevecaoLabel.setBounds(560, 110, 130, 150);
		homeJPanel.add(prevecaoLabel);

		prevencaoLabelHover.setBackground(new Color(171, 216, 255));
		prevencaoLabelHover.setOpaque(true);
		prevencaoLabelHover.setBounds(550, 100, 150, 170);
		homeJPanel.add(prevencaoLabelHover);

		background.setBounds(0, 0, 730, 360);
		homeJPanel.add(background);

		// Covid-19 jPanel

		covid19JPanel.setBackground(new Color(255, 255, 255));
		covid19JPanel.setLayout(null);

		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setIcon(new ImageIcon(getClass().getResource("/icon/infeccao.png"))); // NOI18N
		jLabel3.setBounds(25, 20, 113, 88);
		covid19JPanel.add(jLabel3);

		jLabel6.setFont(new Font("Segoe UI Black", 0, 20)); // NOI18N
		jLabel6.setForeground(new Color(0, 0, 0));
		jLabel6.setText("O que é COVID-19 ?");
		jLabel6.setBounds(135, 10, 200, 40);
		covid19JPanel.add(jLabel6);

		jTextArea1.setEditable(false);
		jTextArea1.setBackground(new Color(255, 255, 255));
		jTextArea1.setColumns(20);
		jTextArea1.setForeground(new Color(198, 199, 200));
		jTextArea1.setRows(5);
		jTextArea1.setText(
				" A Covid-19 é uma doença infecciosa que afeta o globo(mundo) inteiro e causa diversas mortes\ntodos os dias.\n \n A maioria das pessoas que adoece em decorrência da COVID-19 apresentará sintomas leves a\nmoderados e se recuperará sem tratamento especial.");
		jScrollPane1.setViewportView(jTextArea1);
		jScrollPane1.setBounds(135, 60, 550, 200);
		covid19JPanel.add(jScrollPane1);

		jButton2.setBackground(new Color(171, 216, 255));
		jButton2.setForeground(new Color(0, 0, 0));
		jButton2.setText("Voltar");
		jButton2.setBounds(600, 20, 70, 20);
		covid19JPanel.add(jButton2);

		// Sintomas jPanel

		sintomaJPanel.setBackground(new Color(255, 255, 255));
		sintomaJPanel.setLayout(null);

		jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel7.setIcon(new ImageIcon(getClass().getResource("/icon/sintoma.png"))); // NOI18N
		jLabel7.setBounds(25, 20, 113, 88);
		sintomaJPanel.add(jLabel7);

		jLabel8.setFont(new Font("Segoe UI Black", 0, 20)); // NOI18N
		jLabel8.setForeground(new Color(0, 0, 0));
		jLabel8.setText("Quais são os sintomas?");
		jLabel8.setBounds(135, 10, 300, 40);
		sintomaJPanel.add(jLabel8);

		jTextArea2.setEditable(false);
		jTextArea2.setBackground(new Color(255, 255, 255));
		jTextArea2.setColumns(20);
		jTextArea2.setForeground(new Color(198, 199, 200));
		jTextArea2.setRows(5);
		jTextArea2.setText(
				"A COVID-19 se apresenta de diferentes maneiras. A maioria dos infectados apresentam sintomas leves\nda doença e não precisam ser hospitalizada. Os sintomas mais comuns são: Febre; Tosse seca;\nCansaço.\n\nSintomas menos comuns: Dores e desconfortos; Dor de garganta; Diarreia; Conjuntivite; Dor de\ncabeça; Perda de paladar ou olfato; Descoloração dos dedos das mãos ou dos pés\n\nSintomas graves: Dificuldade de respirar ou falta de ar; Dor ou pressão no peito; Perda de fala ou\nmovimento \n\nSe você apresentar sintomas graves, a recomendação é ir diretamente ao médico.\n\nEm média, os sintomas aparecem após 5 ou 6 dias depois de ser infectado com o vírus. Mas, isso\npode levar até 14 dias.\n");
		jScrollPane2.setViewportView(jTextArea2);
		jScrollPane2.setBounds(135, 60, 550, 200);
		sintomaJPanel.add(jScrollPane2);

		jButton3.setBackground(new Color(171, 216, 255));
		jButton3.setForeground(new Color(0, 0, 0));
		jButton3.setText("Voltar");
		jButton3.setBounds(600, 20, 70, 20);
		sintomaJPanel.add(jButton3);

		// Transmissão jPanel

		transmissaoJPanel.setBackground(new Color(255, 255, 255));
		transmissaoJPanel.setLayout(null);

		jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel13.setIcon(new ImageIcon(getClass().getResource("/icon/transmissao.png"))); // NOI18N
		jLabel13.setBounds(25, 20, 113, 88);
		transmissaoJPanel.add(jLabel13);

		jLabel14.setFont(new Font("Segoe UI Black", 0, 20)); // NOI18N
		jLabel14.setForeground(new Color(0, 0, 0));
		jLabel14.setText("Como se Transmite ?");
		jLabel14.setBounds(135, 10, 300, 40);
		transmissaoJPanel.add(jLabel14);

		jTextArea3.setEditable(false);
		jTextArea3.setBackground(new Color(255, 255, 255));
		jTextArea3.setColumns(20);
		jTextArea3.setForeground(new Color(198, 199, 200));
		jTextArea3.setRows(5);
		jTextArea3.setText(
				" O vírus que causa a COVID-19 é transmitido principalmente por meio de gotículas geradas quando\numa pessoa infectada tosse, espirra ou exala. Essas gotículas são muito pesadas para permanecerem\nno ar e são rapidamente depositadas em pisos ou superfícies.\n\n  Você pode ser infectado ao inalar o vírus se estiver próximo de alguém que tenha COVID-19 ou ao\ntocar em uma superfície contaminada e, em seguida, passar as mãos nos olhos, no nariz ou na boca\n");
		jScrollPane3.setViewportView(jTextArea3);
		jScrollPane3.setBounds(135, 60, 550, 200);
		transmissaoJPanel.add(jScrollPane3);

		jButton4.setBackground(new Color(171, 216, 255));
		jButton4.setForeground(new Color(0, 0, 0));
		jButton4.setText("Voltar");
		jButton4.setBounds(600, 20, 70, 20);
		transmissaoJPanel.add(jButton4);

		// Prevenção jPanel

		prevencaoJPanel.setBackground(new Color(255, 255, 255));
		prevencaoJPanel.setLayout(null);

		jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel15.setIcon(new ImageIcon(getClass().getResource("/icon/mulher (1).png"))); // NOI18N
		jLabel15.setBounds(25, 20, 113, 88);
		prevencaoJPanel.add(jLabel15);

		jLabel16.setFont(new Font("Segoe UI Black", 0, 20)); // NOI18N
		jLabel16.setForeground(new Color(0, 0, 0));
		jLabel16.setText("Como se prevenir ?");
		jLabel16.setBounds(135, 10, 300, 40);
		prevencaoJPanel.add(jLabel16);

		jTextArea4.setEditable(false);
		jTextArea4.setBackground(new Color(255, 255, 255));
		jTextArea4.setColumns(20);
		jTextArea4.setForeground(new Color(198, 199, 200));
		jTextArea4.setRows(5);
		jTextArea4.setText(
				"A COVID-19 se apresenta de diferentes maneiras. A maioria dos infectados apresentam sintomas leves\nda doença e não precisam ser hospitalizada. Os sintomas mais comuns são: Febre; Tosse seca;\nCansaço.\n\nSintomas menos comuns: Dores e desconfortos; Dor de garganta; Diarreia; Conjuntivite; Dor de\ncabeça; Perda de paladar ou olfato; Descoloração dos dedos das mãos ou dos pés\n\nSintomas graves: Dificuldade de respirar ou falta de ar; Dor ou pressão no peito; Perda de fala ou\nmovimento \n\nSe você apresentar sintomas graves, a recomendação é ir diretamente ao médico.\n\nEm média, os sintomas aparecem após 5 ou 6 dias depois de ser infectado com o vírus. Mas, isso\npode levar até 14 dias.\n");
		jScrollPane4.setViewportView(jTextArea4);
		jScrollPane4.setBounds(135, 60, 550, 200);
		prevencaoJPanel.add(jScrollPane4);

		jButton5.setBackground(new Color(171, 216, 255));
		jButton5.setForeground(new Color(0, 0, 0));
		jButton5.setText("Voltar");
		jButton5.setBounds(600, 20, 70, 20);
		prevencaoJPanel.add(jButton5);

	}

	public void definirEventos() {

		// COVID-19 Eventos

		covidLabel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				covidLabelHover.setVisible(true);
			}
		});
		covidLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				homeJPanel.setVisible(false);
				add(covid19JPanel);
				covid19JPanel.setVisible(true);
			}
		});

		// Sintomas

		sintomasLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				sintomasLabelHover.setVisible(true);
			}
		});
		sintomasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				homeJPanel.setVisible(false);
				add(sintomaJPanel);
				sintomaJPanel.setVisible(true);
			}
		});

		// Transmissão

		transmissaoLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				transmissaoLabelHover.setVisible(true);
			}
		});
		transmissaoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				homeJPanel.setVisible(false);
				add(transmissaoJPanel);
				transmissaoJPanel.setVisible(true);
			}
		});

		// Prevenção

		prevecaoLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				prevencaoLabelHover.setVisible(true);
			}
		});
		prevecaoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				homeJPanel.setVisible(false);
				add(prevencaoJPanel);
				prevencaoJPanel.setVisible(true);
			}
		});

		background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				covidLabelHover.setVisible(false);
				sintomasLabelHover.setVisible(false);
				transmissaoLabelHover.setVisible(false);
				prevencaoLabelHover.setVisible(false);
			}
		});

		// Button

		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				voltar();
			}
		});

		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				voltar();
			}
		});

		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				voltar();
			}
		});

		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				voltar();
			}
		});
	}

	public void voltar() {
		covid19JPanel.setVisible(false);
		sintomaJPanel.setVisible(false);
		transmissaoJPanel.setVisible(false);
		prevencaoJPanel.setVisible(false);
		homeJPanel.setVisible(true);
	}

	public static void main(String[] args) {
		loading l = new loading();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new telaInicial().setVisible(true);
			}
		});
	}

	// Variables declaration
	private JLabel background, tituloTelaInicial1, tituloTelaInicial2,

			covidLabel, covidLabelHover, iconCovid, tituloCovid_Label,

			sintomasLabel, sintomasLabelHover, iconSintomas, tituloSintomas_label,

			transmissaoLabel, transmissaoLabelHover, iconTransmissao, tituloTransmissao_label,

			prevecaoLabel, prevencaoLabelHover, iconPrevencao, tituloPrevencao_label,

			jLabel13, jLabel14, jLabel15, jLabel16, jLabel3, jLabel6, jLabel7, jLabel8,

			banner, barraStyle;

	private JPanel homeJPanel, covid19JPanel, prevencaoJPanel, sintomaJPanel, transmissaoJPanel;
	private JButton jButton2, jButton3, jButton4, jButton5;
	private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4;
	private JTextArea jTextArea1, jTextArea2, jTextArea3, jTextArea4;

}
