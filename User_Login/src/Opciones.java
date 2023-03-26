import java.awt.*;

import javax.swing.*;

public class Opciones extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Opciones() {
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
		p1.setBackground(Color.CYAN);
		this.add(p1);
		
		this.repaint();
		this.revalidate();
	}

}
