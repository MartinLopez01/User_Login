import java.awt.*;

import javax.swing.*;

public class MiCuenta extends JFrame{
	private static final long serialVersionUID = 1L;

	public MiCuenta() {
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
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		this.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setSize(400,400);
		p2.setLocation(100,250);
		p2.setBackground(Color.WHITE);
		p2.setLayout(null);
		p1.add(p2);
		
        JLabel nombre = new JLabel("Nombre:");
        nombre.setFont(new Font("Comic Sans", Font.BOLD, 20));
        nombre.setSize(getWidth(), 30);
        nombre.setLocation(100,200);
        p2.add(nombre);
        
        JTextField nom = new JTextField();
        nom.setSize(300,30);
        nom.setLocation(100,250);
        
        p2.add(nom);
        
        
        JLabel apellido = new JLabel("Apellidos:");
        apellido.setFont(new Font("Comic Sans", Font.BOLD, 20));
        apellido.setSize(getWidth(), 30);
        apellido.setLocation(100,300);
        p2.add(apellido);
        
        JTextField ap = new JTextField();
        ap.setSize(300,30);
        ap.setLocation(100,350);
        p2.add(ap);
        
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Comic Sans", Font.BOLD, 20));
        email.setSize(getWidth(), 30);
        email.setLocation(100,300);
        p2.add(email);
        
        JTextField em = new JTextField();
        em.setSize(300,30);
        em.setLocation(100,350);
        p2.add(em);
        
        JLabel con = new JLabel("Contraseña:");
        con.setFont(new Font("Comic Sans", Font.BOLD, 20));
        con.setSize(getWidth(), 30);
        con.setLocation(100,300);
        p2.add(con);
        
        JTextField contra = new JTextField();
        contra.setSize(300,30);
        contra.setLocation(100,350);
        p2.add(contra);
        
        
        JButton cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setSize(100, 30);
        cancelar.setLocation(100,500);
        p2.add(cancelar);
        
        JButton iniciar = new JButton();
        iniciar.setText("Iniciar Sesión");
        iniciar.setSize(120, 30);
        iniciar.setLocation(230,500);
        p2.add(iniciar);	
		
        
        
		this.repaint();
		this.revalidate();
	}

}
