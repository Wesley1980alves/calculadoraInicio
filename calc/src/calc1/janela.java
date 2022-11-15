package calc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField resultado;
	String opcao;
	double valor1;
	double valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		resultado = new JTextField();
		resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		resultado.setBounds(10, 35, 210, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton botao1 = new JButton("4");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"4");
			}
		});
		botao1.setBounds(10, 115, 53, 54);
		contentPane.add(botao1);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"2");
			}
		});
		btnNewButton.setBounds(73, 115, 55, 54);
		contentPane.add(btnNewButton);
		
		JButton somar = new JButton("+");
		somar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				valor1=Double.parseDouble(resultado.getText());
		        resultado.setText(" " );
		        opcao = "soma";
			}
		});
		somar.setBounds(159, 115, 89, 23);
		contentPane.add(somar);
		
		JButton igual = new JButton("igual");
		igual.addActionListener(new ActionListener() {
			private double valor2;

			public void actionPerformed(ActionEvent e) {
				valor2=Double.parseDouble(resultado.getText());
		        if(opcao=="soma"){
		            resultado.setText(  String.valueOf(valor1 + valor2));
		        }
			}
		});
		igual.setBounds(39, 194, 89, 23);
		contentPane.add(igual);
	}
}
