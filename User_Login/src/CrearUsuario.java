import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.*;

public class CrearUsuario extends JFrame{
	private static final long serialVersionUID = 1L;

	public CrearUsuario() {
		this.setVisible(true);
		this.setSize(600, 700);
		this.setTitle("Crear Usuario");
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(28,113,198));
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Menu();
		
		JPanel p1 = new JPanel();
		p1.setSize(getWidth(), getHeight());
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		this.add(p1);
		
		JLabel title = new JLabel("Crear Usuario",JLabel.CENTER);
        title.setFont(new Font("Comic Sans", Font.BOLD, 30));
        title.setForeground(new Color(242,242,242));
        title.setSize(getWidth(),40);
        title.setLocation(0, 40);
        p1.add(title);
		
		JPanel p2 = new JPanel();
		p2.setSize(500,500);
		p2.setLocation(50,150);
		p2.setBackground(Color.WHITE);
		p2.setLayout(null);
		p1.add(p2);
		
        JLabel nombre = new JLabel("Nombre:");
        nombre.setFont(new Font("Comic Sans", Font.BOLD, 15));
        nombre.setSize(getWidth(), 30);
        nombre.setLocation(10,20);
        p2.add(nombre);
        
        JTextField nom = new JTextField();
        nom.setSize(300,30);
        nom.setLocation(10,55);
        p2.add(nom);
        
        
        JLabel apellido = new JLabel("Apellidos:");
        apellido.setFont(new Font("Comic Sans", Font.BOLD, 15));
        apellido.setSize(getWidth(), 30);
        apellido.setLocation(10,90);
        p2.add(apellido);
        
        JTextField ap = new JTextField();
        ap.setSize(300,30);
        ap.setLocation(10,125);
        p2.add(ap);
        
        JLabel us = new JLabel("Usuario:");
        us.setFont(new Font("Comic Sans", Font.BOLD, 15));
        us.setSize(getWidth(), 30);
        us.setLocation(10,160);
        p2.add(us);
        
        JTextField nus = new JTextField();
        nus.setSize(300,30);
        nus.setLocation(10,195);
        p2.add(nus);
        
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Comic Sans", Font.BOLD, 15));
        email.setSize(getWidth(), 30);
        email.setLocation(10,230);
        p2.add(email);
        
        JTextField em = new JTextField();
        em.setSize(300,30);
        em.setLocation(10,265);
        p2.add(em);
        
        JLabel con = new JLabel("Contraseña:");
        con.setFont(new Font("Comic Sans", Font.BOLD, 15));
        con.setSize(getWidth(), 30);
        con.setLocation(10,300);
        p2.add(con);
        
        JPasswordField contra = new JPasswordField();
        contra.setSize(300,30);
        contra.setLocation(10,335);
        p2.add(contra);
        
        JLabel con2 = new JLabel("Confirmar contraseña:");
        con2.setFont(new Font("Comic Sans", Font.BOLD, 15));
        con2.setSize(getWidth(), 30);
        con2.setLocation(10,370);
        p2.add(con2);
        
        JPasswordField contra2 = new JPasswordField();
        contra2.setSize(300,30);
        contra2.setLocation(10,405);
        p2.add(contra2);
        
        
        JButton cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBackground(Color.RED);
        cancelar.setSize(100, 30);
        cancelar.setLocation(10,450);
        p2.add(cancelar);
        
        JButton crearu = new JButton();
        crearu.setText("Crear Usuario");
        crearu.setBackground(Color.BLUE);
        crearu.setSize(130, 30);
        crearu.setLocation(230,450);
        p2.add(crearu);	
		
        cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"A ocurrido un error!", "יחי בעל זבוב", JOptionPane.DEFAULT_OPTION);
	        	
				cmdExitActionPerformed(e);
			}

		});
		
        crearu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(!(Arrays.equals(contra.getPassword(), contra2.getPassword()))) {
  					JOptionPane.showMessageDialog(crearu,"Contraseña NO Coincide", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Registro Exitoso!", "יחי בעל זבוב", JOptionPane.DEFAULT_OPTION);
	        	
  				String name = nom.getText();
  				String ape = ap.getText();
  				String usu = nus.getText();
  				String email = em.getText();
  				char[] pwd = contra.getPassword();
  			
  				
  				FileWriter writer = null;
  				PrintWriter escritor;
  				
  				try {
  					writer = new FileWriter("C:\\Users\\HP\\Documents\\Java 2\\User_Login\\user.txt",true);
  					escritor = new PrintWriter(writer);
  					
  					escritor.print(name+","+ape+","+usu+","+email+","+ pwd);
							writer.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
				Login name1 = new Login();
				name1.setVisible(true);
				cmdExitActionPerformed(e);	
				}
			}
		});
		
        p1.repaint();
        p1.revalidate();
		this.repaint();
		this.revalidate();
	}

	public void cmdExitActionPerformed(ActionEvent e) {
		this.setVisible(false);
		
	}
	

	public void Menu() {
		JMenuBar barra=new JMenuBar();
		barra.setSize(600, 30);
		barra.setLocation(0, 0);
		JMenu cuenta=new JMenu("Cuenta");
		JMenu usuarios=new JMenu("Usuarios");
		JMenu ayuda=new JMenu("Ayuda");
		JMenuItem micuenta = new JMenuItem("Mi Cuenta");
		JMenuItem cerrar = new JMenuItem("Cerrar Sesión");
		JMenuItem lista = new JMenuItem("Lista de usuarrios");
		JMenuItem crear = new JMenuItem("Crear Usuario");
		JMenuItem como = new JMenuItem("Como crear usuario?");
		barra.add(cuenta);
		barra.add(usuarios);
		barra.add(ayuda);
		cuenta.add(micuenta);
		cuenta.add(cerrar);
		usuarios.add(lista);
		usuarios.add(crear);
		ayuda.add(como);
		this.add(barra);
		
		micuenta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MiCuenta name = new MiCuenta();
				name.setVisible(true);
				cmdExitActionPerformed(e);
			}
		});
		cerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		lista.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListaDeUsuarios name = new ListaDeUsuarios();
				name.setVisible(true);
				cmdExitActionPerformed(e);
			}
		});
		crear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CrearUsuario name = new CrearUsuario();
				name.setVisible(true);
				cmdExitActionPerformed(e);
				
			}
		});
		como.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Ayuda name = new Ayuda();
				name.setVisible(true);
				cmdExitActionPerformed(e);
			}
		});
		
		
		
		this.repaint();
		this.revalidate();
	}
	
}
