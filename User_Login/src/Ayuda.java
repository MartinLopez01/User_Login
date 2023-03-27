import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ayuda extends JFrame{
	private static final long serialVersionUID = 1L;
	JButton crear1 = new JButton();
	public Ayuda() {
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
		p1.add(barra);
		
			
		JPanel p2 = new JPanel();
		p2.setSize(500,450);
		p2.setLocation(50,200);
		p2.setBackground(Color.WHITE);
		p2.setLayout(null);
		p1.add(p2);
		
		JLabel nombre = new JLabel();
		nombre.setText("1. Hacer click en la opción \"Usuarios\" en el menú superior\n"
				+ "2. Hacer click en la opción \"Crear Usuario\" en el menú desplegado\n"
				+ "3. Llenar los campos solicitados\r\n"
				+ "4. Escribri una pequeña descripción de ti\r\n"
				+ "5. Seleccionar tu comida favorita\r\n"
				+ "6. Seleccionar tu color favorito\r\n"
				+ "7. Hacer click en el botón \"Crear Usuario\"\r\n"
				+ "8. Listo, el usuario se ha creado");
        nombre.setFont(new Font("Comic Sans", Font.BOLD, 15));
        nombre.setSize(300, 120);
        nombre.setLocation(10,20);
        p2.add(nombre);
		
        
        crear1.setText("Crear un usuario ahora");	
        crear1.setSize(250,30);
        crear1.setLocation(120, 300);
        crear1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        p2.add(crear1);
        
        crear1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cmdExitActionPerformed(e);
			}
		});
        
        
        
        
		this.repaint();
		this.revalidate();
	}
	private void cmdExitActionPerformed(ActionEvent evt) {
    	CrearUsuario name=new CrearUsuario();
        name.setVisible(true);
        name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }
	
}
