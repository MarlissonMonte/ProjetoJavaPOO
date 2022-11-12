import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class viewLogin {

	private JFrame frame;
	private JTextField interactiveLogin;
	private JTextField interactiveSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {   // Primeiro deve rodar a class "viewLogin" para dps abrir o feed.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLogin window = new viewLogin();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.CYAN);
		getFrame().setBounds(100, 100, 500, 400);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel txtLogin = new JLabel("Login:");
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtLogin.setForeground(Color.WHITE);
		txtLogin.setBounds(140, 100, 46, 14);
		getFrame().getContentPane().add(txtLogin);
		
		interactiveLogin = new JTextField();
		interactiveLogin.setBounds(140, 125, 200, 23);
		getFrame().getContentPane().add(interactiveLogin);
		interactiveLogin.setColumns(10);
		
		JLabel txtSenha = new JLabel("Senha:");
		txtSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSenha.setForeground(Color.WHITE);
		txtSenha.setBounds(140, 170, 46, 14);
		getFrame().getContentPane().add(txtSenha);
		
		interactiveSenha = new JPasswordField();
		interactiveSenha.setBounds(140, 195, 200, 23);
		interactiveSenha.setColumns(10);
		getFrame().getContentPane().add(interactiveSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrar.setBounds(194, 244, 89, 23);
		btnEntrar.setBackground(Color.CYAN);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(interactiveLogin.getText(), new String(((JPasswordField) interactiveSenha).getPassword()))) {
					feed window = new feed();
					window.getFrame().setVisible(true);
					getFrame().setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Dados inválidos!", "Solar",JOptionPane.ERROR_MESSAGE);
				}
					
			}
		});
		getFrame().getContentPane().add(btnEntrar);
		
		JLabel background = new JLabel("img");
		background.setIcon(new ImageIcon("back1.2.png"));
		background.setBounds(-77, -5, 561, 430);
		getFrame().getContentPane().add(background);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("terra") && senha.equals("2022"); //Opção de trocar de senha && criar uma nova variar em um varias...
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
