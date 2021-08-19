package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Calculadora;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;

public class VentanaCalculadora extends JFrame {

	private JPanel contentPane;
	private Calculadora codigo;
	private JTextField texto;
	private JTextField signo;
	public String primero;
	public String segundo;
	public Boolean coma = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadora frame = new VentanaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculadora() {
		codigo = new Calculadora();
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 6));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(1.0);
		splitPane.setEnabled(false);
		contentPane.add(splitPane, BorderLayout.NORTH);
		
		texto = new JTextField();
		texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		splitPane.setLeftComponent(texto);
		texto.setColumns(12);
		texto.setText("");
		
		signo = new JTextField();
		signo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		signo.setEditable(false);
		splitPane.setRightComponent(signo);
		signo.setColumns(3);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton1);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + "1");
			}
		});
		
		JButton boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton2);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + "2");
			}
		});
		
		JButton boton3 = new JButton("3");
		
		boton3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton3);
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton3.getText());
			}
		});
		
		JButton botonSuma = new JButton("+");
		botonSuma.setToolTipText("Suma dos n\u00FAmeros");
		botonSuma.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonSuma);
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("+");
				primero = texto.getText();
				texto.setText("");
			}
		});
		
		JButton boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton4);
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton4.getText());
			}
		});
		
		JButton boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton5);
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton5.getText());
			}
		});
		
		JButton boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton6);
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton6.getText());
			}
		});
		
		JButton botonResta = new JButton("-");
		botonResta.setToolTipText("Resta dos n\u00FAmeros");
		botonResta.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonResta);
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if()
				if(texto.getText().equals(""))
				{
					texto.setText("-");
				}
				else
				{
					signo.setText("-");
					primero = texto.getText();
					texto.setText("");
				}
				signo.setText("-");
				primero = texto.getText();
				texto.setText("");
			}
		});
		
		JButton boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton7);
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton7.getText());
			}
		});
		
		JButton boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton8);
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton8.getText());
			}
		});
		
		JButton boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton9);
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton9.getText());
			}
		});
		
		JButton botonMultip = new JButton("x");
		botonMultip.setToolTipText("Multiplica dos n\u00FAmeros");
		botonMultip.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonMultip);
		botonMultip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("x");
				primero = texto.getText();
				texto.setText("");
			}
		});
		
		JButton botonDecimal = new JButton(",");
		botonDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonDecimal);
		botonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + ".");
				coma = true;
				
			}
		});
		
		JButton boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(boton0);
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(texto.getText() + boton0.getText());
			}
		});
		JButton botonIgual = new JButton("=");
		botonIgual.setToolTipText("Pulsa para ver el resultado");
		botonIgual.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonIgual);
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundo = texto.getText();
				if(coma == true)
				{
					if(signo.getText().equals("+"))
					{
						texto.setText(codigo.sumarFloat(primero, segundo));
					}
					else if(signo.getText().equals("-"))
					{
						texto.setText(codigo.restarFloat(primero, segundo));
					}
					else if(signo.getText().equals("\u00F7"))
					{
						texto.setText(codigo.dividirFloat(primero, segundo));
					}
					else if(signo.getText().equals("x"))
					{
						texto.setText(codigo.multiplicarFloat(primero, segundo));
					}
				}
				else {
					if(signo.getText().equals("+"))
					{
						texto.setText(codigo.sumarInt(primero, segundo));
					}
					else if(signo.getText().equals("-"))
					{
						texto.setText(codigo.restarInt(primero, segundo));
					}
					else if(signo.getText().equals("\u00F7"))
					{
						texto.setText(codigo.dividirFloat(primero, segundo));
					}
					else if(signo.getText().equals("x"))
					{
						texto.setText(codigo.multiplicarInt(primero, segundo));
					}
				
				}
			}
		});
		
		JButton botonDiv = new JButton("\u00F7");
		botonDiv.setToolTipText("Divide dos n\u00FAmeros");
		botonDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(botonDiv);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
				signo.setText("");
				coma = false;
			}
		});
		botonC.setToolTipText("(Clear) Borra toda la operaci\u00F3n");
		panel_1.add(botonC);
		
		JButton botonCE = new JButton("CE");
		botonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
			}
		});
		botonCE.setToolTipText("(Clear Entry) Borra la \u00FAltima entrada introducida");
		panel_1.add(botonCE);
		botonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signo.setText("\u00F7");
				primero = texto.getText();
				texto.setText("");
			}
		});
		
		
		
		
		
		
		
	}

}
