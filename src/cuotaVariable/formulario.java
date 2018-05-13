package cuotaVariable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class formulario extends JFrame implements ActionListener {
	
	Container contenedor;
	 public JLabel fondo;
	
	public formulario () {
		super("Valor");
		contenedor= getContentPane();
		contenedor.setLayout(null);
	
		
		 fondo = new JLabel(); 
         fondo.setIcon(new ImageIcon("musketeer.jpg"));
         fondo.setBounds(100,100,200,70);
         contenedor.add(fondo); 

	}
			
			
	public static void main(String args[]) {
		
		formulario m = new formulario();
		m.setBounds(0,0,500,500);
		m.setResizable(false);
		m.setVisible(true);
		m.setLocationRelativeTo(null);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


