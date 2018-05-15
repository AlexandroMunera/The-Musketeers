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
	
	JButton boton;
	JButton boton_limpiar;
	JButton botonSalir;
	
	JTextField texto_a;
	JTextField texto_b;
	JPasswordField txtPassword;
	JLabel lblTitulo;
	
	
	//M�todo que muestra la venta Principal
	public Menu()
	{
		super("EJEMPLO DE GUI");
		contenedor = getContentPane();
		contenedor.setLayout(null);
		contenedor.setBackground(Color.GREEN);
		
		lblTitulo = new JLabel("PASTEL PARA TENER COMO REFERENCIA");
		lblTitulo.setBounds(100,20,800,25);
		contenedor.add(lblTitulo);
		
		// txtPassword = new JPasswordField(10);
		// txtPassword.setBounds(10,10,200,25);
		// contenedor.add(txtPassword);
		
		texto_a = new JTextField(10);
		texto_a.setBounds(100,100,200,25);
		contenedor.add(texto_a);
		
		texto_b = new JTextField(10);
		texto_b.setBounds(100,400,200,25);
		texto_b.setEditable(false);
		contenedor.add(texto_b);
		
		boton = new JButton("TRASLADO");
		boton.setBounds(100,200,200,30);
		boton.addActionListener(this);
		contenedor.add(boton);
		
		boton_limpiar = new JButton("LIMPIAR");
		boton_limpiar.setBounds(100,300,200,30);
		boton_limpiar.addActionListener(this);
		contenedor.add(boton_limpiar);

		botonSalir = new JButton("Salir");
		botonSalir.setBounds(100,500,200,30);
		botonSalir.addActionListener(this);
		contenedor.add(botonSalir);
				
		//dibujo el contenedor en pantalla
		contenedor.repaint();
		
	}
	
	//m�todo de la interfaz de eventos donde se escuchan los eventos
	public void actionPerformed(ActionEvent e)
	{
		//eventos del bot�n
		if (e.getSource()==boton)
		{
			texto_b.setText(texto_a.getText());
			//texto_b.setBackground( new Color(107, 106, 104));
			texto_b.setBackground(Color.red);
		}
		
		if (e.getSource()==boton_limpiar)
		{
			texto_b.setText("");
			texto_a.setText("");
		}
		
		if (e.getSource()==botonSalir)
		{
			System.exit(0);
		}
		
	}
	
	public static void main(String args[])
	{
		//m�todo principal
		Menu p = new Menu();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(700,700);
		p.setVisible(true);
		
		ImageIcon img = new ImageIcon("Icono.png");
		p.setIconImage(img.getImage());
		
	}
	
	//fin del programa
}