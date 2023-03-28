import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;
public class ListaDeUsuarios extends JFrame{
	private static final long serialVersionUID = 1L;

	public ListaDeUsuarios() {
		this.setVisible(true);
		this.setSize(600, 700);
		this.setTitle("Accede a tu cuenta");
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(28,113,198));
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Menu();

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
		
		
		JPanel p1 = new JPanel();
		p1.setSize(getWidth(), getHeight());
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		this.add(p1);
		
		JLabel title = new JLabel("Lista de usuarios",JLabel.CENTER);
        title.setFont(new Font("Comic Sans", Font.BOLD, 30));
        title.setForeground(new Color(242,242,242));
        title.setSize(getWidth(),40);
        title.setLocation(0, 70);
        p1.add(title);
        
        JLabel tex1 = new JLabel("Editar");
        tex1.setFont(new Font("Comic Sans", Font.BOLD, 20));
        tex1.setForeground(new Color(242,242,242));
        tex1.setSize(getWidth(), 30);
        tex1.setLocation(100, 120);
        p1.add(tex1);
        
        
        
        JButton edit = new JButton();
        edit.setText("Editar a ");
        
        
        Object [] Columnas={"Usuario", "Nombre", "Acciones"} ;
        Object [] [] datosUsuarios= new Object[5][3];
        
        DefaultTableModel tabla = new DefaultTableModel(datosUsuarios, Columnas);
        JTable tablaUsuarios=new JTable(tabla) ;
        p1.add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER) ;
        JScrollPane name = new JScrollPane(tablaUsuarios);
        name.setSize(400, 120);
		name.setLocation(40, 200);
        p1.add(name);
		
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
