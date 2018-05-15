import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

//Clase principal
public class CuotaVariable extends JFrame implements ActionListener
{
	//instancio atributos
	Container contenedor;
	
	JButton btnCuotaFija;
	JButton btnCuotaVariable;	
	
	//M�todo que muestra la venta Principal
	public CuotaVariable()
	{
		super("Cuota Variable - Finanzas Personales - The Musketeers");
		contenedor = getContentPane();
        contenedor.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,600);
		setVisible(true);
		
		ImageIcon img = new ImageIcon("Images/Icono.png");
		setIconImage(img.getImage());
		
		btnCuotaFija = new JButton("Cuota Fija");
		btnCuotaFija.setBounds(440,10,100,30);
		btnCuotaFija.addActionListener(this);
		contenedor.add(btnCuotaFija);

		btnCuotaVariable = new JButton("Cuota Variable");
		btnCuotaVariable.setBounds(540,10,130,30);
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
	//fin del programa
}