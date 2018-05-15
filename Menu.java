/* Menu.java
 * Descripci�n: Clase de muestra para ilustrar como funcionan las interfaces gr�ficas de usuario en Java
 * Fecha de creaci�n: 03 de mayo de 2108
 * @author: Carlos Monsalve
 * @mail: remonsa@gmail.com
 * @versi�n: 1.0
 */

//imports: aqui se importan las librer�as necesarias para la ejecuci�n

import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

//Clase principal
public class Menu extends JFrame implements ActionListener
{
	//instancio atributos
	Container contenedor;
	
	JButton btnCuotaFija;
	JButton btnCuotaVariable;
	JLabel fondo;
	
	//M�todo que muestra la venta Principal
	public Menu()
	{
		super("Finanzas Personales - The Musketeers");
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		//setContentPane(new JLabel(new ImageIcon("Images/background.png"))); //Imagen de fondo

		//contenedor.setBackground(Color.GREEN);

		ImageIcon imagen = new ImageIcon("Images/background.png");
		fondo = new JLabel(imagen);
		fondo.setBounds(200, 20, 300, 300);
		contenedor.add(fondo);		
		
		btnCuotaFija = new JButton("Cuota Fija");
		btnCuotaFija.setBounds(100,400,200,100);
		btnCuotaFija.addActionListener(this);
		contenedor.add(btnCuotaFija);

		btnCuotaVariable = new JButton("Cuota Variable");
		btnCuotaVariable.setBounds(400,400,200,100);
		btnCuotaVariable.addActionListener(this);
		contenedor.add(btnCuotaVariable);
				
		//dibujo el contenedor en pantalla
		contenedor.repaint();
		
	}
	
	//m�todo de la interfaz de eventos donde se escuchan los eventos
	public void actionPerformed(ActionEvent e)
	{
		//eventos del bot�n
		if (e.getSource()==btnCuotaFija)
		{
			
		}
		
		if (e.getSource()==btnCuotaVariable)
		{			
			//this.setVisible(false); //Or this.dispose()
			//new CuotaVariable().setVisible(true); // Main Form to show after the Login Form..
			
			CuotaVariable frame = new CuotaVariable();			
			frame.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
	public static void main(String args[])
	{
		//m�todo principal
		Menu p = new Menu();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(700,600);
		p.setVisible(true);
		
		ImageIcon img = new ImageIcon("Images/Icono.png");
		p.setIconImage(img.getImage());

		//Image imgBackground = Toolkit.getDefaultToolkit().createImage("Images/background.jpg");

		
	}

	
	//fin del programa
}