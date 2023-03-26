import java.awt.*;

import javax.swing.*;

public class Opciones extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Opciones() {
		this.setVisible(true);
		this.setSize(600,70);
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(28,113,198));
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	public void menu() {
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
		
		  
		this.repaint();
		this.revalidate();
	}

}
