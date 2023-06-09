import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		
		JLabel ventanaMenu = new JLabel();
    	ventanaMenu.setBounds(200,100,200,200);
    	ventanaMenu.setIcon(new ImageIcon("src/img/acceder.png"));
    	p1.add(ventanaMenu);
		
		JLabel title = new JLabel("Accede a tu cuenta",JLabel.CENTER);
        title.setFont(new Font("Comic Sans", Font.BOLD, 30));
        title.setForeground(new Color(242,242,242));
        title.setSize(getWidth(),40);
        title.setLocation(0, 50);
        p1.add(title);
		
        JLabel nombre = new JLabel("Nombre de usuario");
        nombre.setFont(new Font("Comic Sans", Font.BOLD, 20));
        nombre.setSize(getWidth(), 30);
        nombre.setLocation(100,300);
        p1.add(nombre);
        
        JTextField usuario = new JTextField();
        usuario.setSize(300,30);
        usuario.setLocation(100,350);
        
        p1.add(usuario);
        
        
        JLabel con = new JLabel("Contraseña de acceso");
        con.setFont(new Font("Comic Sans", Font.BOLD, 20));
        con.setSize(getWidth(), 30);
        con.setLocation(100,400);
        p1.add(con);
        
        JPasswordField contra = new JPasswordField();
        contra.setSize(300,30);
        contra.setLocation(100,450);
        p1.add(contra);
        
        JButton cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBackground(Color.RED);
        cancelar.setSize(100, 30);
        cancelar.setLocation(100,600);
        p1.add(cancelar);
        
        JButton iniciar = new JButton();
        iniciar.setText("Iniciar Sesión");
        iniciar.setBackground(Color.BLUE); 
        iniciar.setSize(120, 30);
        iniciar.setLocation(230,600);
        p1.add(iniciar);
        
        JButton registrar = new JButton();
        registrar.setText("Registrarse");
        registrar.setSize(120, 30);
        registrar.setLocation(370,600);
        p1.add(registrar);
        
        cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
        
        iniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String username = usuario.getText();
			        String pwd = new String(contra.getPassword());
			        
			        BufferedReader reader;
			        boolean flag = true;
			        try {
			        	FileReader file = new FileReader("user.txt");
			        	reader = new BufferedReader(file);
			        	
			        	String line = reader.readLine();
			        	
			        	while(line != null) {
			        		String data [] = line.split(",");
			        		System.out.println(data[2]);
			        		if(username.equals(data[2])&& username !=null) {
			        			if(pwd.equals(data[4])&& pwd !=null) {
	    			        			 flag = true;
			        		}
			        		}
			        		
			        		
			        		line = reader.readLine();
			        	}
			        	
			        	if(flag) {
			        		JOptionPane.showMessageDialog(null,"Contraseña Coincide", "יחי בעל זבוב", JOptionPane.DEFAULT_OPTION);
			        		Opciones x = new Opciones();
							x.setVisible(true);
							cmdExitActionPerformed(e);
			        	
			        	}else {
			        		JOptionPane.showMessageDialog(null,"Contraseña NO Coincide", "Error", JOptionPane.ERROR_MESSAGE);
			        	}
			        	
			        }catch (IOException e1){
			        	e1.printStackTrace();
			        }
				
			}
		});
        
        registrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				CrearUsuario name=new CrearUsuario();
				name.setVisible(true);
				cmdExitActionPerformed(e);
			}
		});
        
        
        
        
		this.repaint();
		this.revalidate();
	}
	private void cmdExitActionPerformed(ActionEvent evt) {
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
