package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculadoraSimples extends JFrame {
	private JPanel painelPrincipal;
	private JLabel lblSinal, lblSinalIgual, lblResposta;
	private JTextField tfN1, tfN2;
	private JButton btnCalcular;
	private JRadioButton rbSoma, rbDivisao, rbMultiplicacao, rbSubitracao;
	private ButtonGroup rbGroup;
	
	public CalculadoraSimples() {
		
		rbGroup = new ButtonGroup();
		rbSoma = new JRadioButton("Somar", false);
		rbDivisao = new JRadioButton("Dividir");
		rbMultiplicacao = new JRadioButton("Multiplicar");
		rbSubitracao = new JRadioButton("Subitrair");
		painelPrincipal = new JPanel();
		lblSinal = new JLabel();
		lblSinalIgual = new JLabel("=");
		lblResposta = new JLabel("Resposta");
		tfN1 = new JTextField();
		tfN2 = new JTextField();
		btnCalcular = new JButton("Calcular");
		
		//setando o tamanho dos componentes
		tfN1.setBounds(10, 10, 80, 25);
		tfN2.setBounds(110, 10, 80, 25);
		lblSinal.setBounds(95, 10, 80, 25);
		lblSinalIgual.setBounds(200, 10, 80, 25);
		lblResposta.setBounds(220, 10, 80, 25);
		btnCalcular.setBounds(10, 40, 100, 25);
		rbSoma.setBounds(20, 80, 65, 15);
		rbDivisao.setBounds(20, 100, 65, 15);
		rbMultiplicacao.setBounds(20, 120, 100, 15);
		rbSubitracao.setBounds(20, 140, 100, 15);
		
		rbGroup.add(rbSoma);
		rbGroup.add(rbDivisao);
		rbGroup.add(rbMultiplicacao);
		rbGroup.add(rbSubitracao);
		
		
		//add os componentes no container.
		painelPrincipal.add(tfN1);
		painelPrincipal.add(tfN2);
		painelPrincipal.add(lblSinal);
		painelPrincipal.add(lblSinalIgual);
		painelPrincipal.add(lblResposta);
		painelPrincipal.add(btnCalcular);
		painelPrincipal.add(rbSoma);
		painelPrincipal.add(rbDivisao);
		painelPrincipal.add(rbMultiplicacao);
		painelPrincipal.add(rbSubitracao);
		
		//configurações da janelaPrincipal.
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setSize(600, 300);
		super.setTitle("Calculadora");
		super.setVisible(true);
		
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lblSinal.getText().equals("X")) {
					int resultado = Integer.parseInt(tfN1.getText()) * Integer.parseInt(tfN2.getText());
					lblResposta.setText(String.valueOf(resultado));
				}
				
				if(lblSinal.getText().equals("+")) {
					int resultado = Integer.parseInt(tfN1.getText()) + Integer.parseInt(tfN2.getText());
					lblResposta.setText(String.valueOf(resultado));
				}
				
				if(lblSinal.getText().equals("÷")) {
					int resultado = Integer.parseInt(tfN1.getText()) / Integer.parseInt(tfN2.getText());
					lblResposta.setText(String.valueOf(resultado));
				}
				
				if(lblSinal.getText().equals("_")) {
					int resultado = Integer.parseInt(tfN1.getText()) - Integer.parseInt(tfN2.getText());
					lblResposta.setText(String.valueOf(resultado));
				}
				
			}
		});
		
		
		
		rbDivisao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rbDivisao.isSelected()) {
					lblSinal.setText("÷");
				}else {
					lblSinal.setText("");
				}
				
			}
		});
		

		
		rbSoma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rbSoma.isSelected()) {
					lblSinal.setText("+");
				}else {
					lblSinal.setText("");
				}
				
			}
		});
		
		rbMultiplicacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rbMultiplicacao.isSelected()) {
					lblSinal.setText("X");
				}else {
					lblSinal.setText("");
				}
				
			}
		});
		
		rbSubitracao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rbSubitracao.isSelected()) {
					lblSinal.setText("_");
				}else {
					lblSinal.setText("");
				}
				
			}
		});
	}
	
	
	
	
}
