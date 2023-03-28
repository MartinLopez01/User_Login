import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Opciones extends JFrame{

	private static final long serialVersionUID = 1L;
	Timer timer;
	public Opciones() {
		this.setVisible(true);
		this.setSize(600,700);
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(28,113,198));
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel ventanaMenu = new JLabel();
	    	ventanaMenu.setBounds(100,50,700,350);
	    	ventanaMenu.setIcon(new ImageIcon("src/img/hola.png"));
	    	add(ventanaMenu);
		
		Menu();
		
		
		this.repaint();
		this.revalidate();
	}

	public void Menu() {

		JMenuBar barra=new JMenuBar();
		barra.setSize(600, 30);
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
				Login name = new Login();
				name.setVisible(true);
				cmdExitActionPerformed(e);				
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
		
		
	}
	
	private void cmdExitActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        
    }

	
	
}
