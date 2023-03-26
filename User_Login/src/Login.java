import java.awt.*;

import javax.swing.*;

public class Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Login() {
		this.setVisible(true);
		this.setSize(600, 700);
		this.setTitle("Accede a tu cuenta");
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(28,113,198));
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel p1 = new JPanel();
		p1.setSize(getWidth(), getHeight());
		p1.setBackground(new Color(57,72,115));
		p1.setLayout(null);
		this.add(p1);
		
		JLabel title = new JLabel("Accede a tu cuenta",JLabel.CENTER);
        title.setFont(new Font("Comic Sans", Font.BOLD, 30));
        title.setForeground(new Color(242,242,242));
        title.setSize(getWidth(),40);
        title.setLocation(0, 100);
        p1.add(title);
		
        JLabel nombre = new JLabel("Nombre de usuario");
        nombre.setFont(new Font("Comic Sans", Font.BOLD, 20));
        nombre.setSize(getWidth(), 30);
        nombre.setLocation(100,200);
        p1.add(nombre);
        
        JTextField usuario = new JTextField();
        usuario.setSize(300,30);
        usuario.setLocation(100,250);
        
        p1.add(usuario);
        
        
        JLabel con = new JLabel("Contraseña de acceso");
        con.setFont(new Font("Comic Sans", Font.BOLD, 20));
        con.setSize(getWidth(), 30);
        con.setLocation(100,300);
        p1.add(con);
        
        JPasswordField contra = new JPasswordField();
        contra.setSize(300,30);
        contra.setLocation(100,350);
        p1.add(contra);
        
        JButton cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setSize(100, 30);
        cancelar.setLocation(100,500);
        p1.add(cancelar);
        
        JButton iniciar = new JButton();
        iniciar.setText("Iniciar Sesión");
        iniciar.setSize(120, 30);
        iniciar.setLocation(230,500);
        p1.add(iniciar);
        
        JButton registrar = new JButton();
        registrar.setText("Registrarse");
        registrar.setSize(120, 30);
        registrar.setLocation(370,500);
        p1.add(registrar);
        
        
        this.repaint();
		this.revalidate();
	}

}
