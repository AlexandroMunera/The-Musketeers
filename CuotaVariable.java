import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

//Clase principal
public class CuotaVariable extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L; //Salira una alerta, con esto dejo de salir

	//instancio atributos
	Container contenedor;
	
	JButton btnCuotaFija;
	JButton btnCuotaVariable;
	
	JLabel lblIngreseCapital;
	JTextField txtCapital;

	JLabel lblIngreseInteres;
	JTextField txtInteres;

	JLabel lblIngreseTasa;
	JTextField txtTasa;

	JLabel lblTiposIntereses;
	JList ddlTipoInteres;

	JLabel lblIngreseCuotas;
	JTextField txtCuotas;
	
	//M�todo que muestra la venta Principal
	public CuotaVariable()
	{
		super("Cuota Variable - Finanzas Personales - The Musketeers");
		contenedor = getContentPane();
        contenedor.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//setSize(700,600);
		setVisible(true);

		JMenu menu;  
		JMenuItem menuItemSalir; 

          JMenuBar mb = new JMenuBar();  
		  menu=new JMenu("Operaciones");
		  menu.setMnemonic(KeyEvent.VK_O);		 //Alt + O 

          //submenu=new JMenu("Sub Menu");  
		  menuItemSalir=new JMenuItem("Salir");
		  menuItemSalir.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMaskEx()));
		  menuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
		   
          menu.add(menuItemSalir);  
          //menu.add(submenu);  
          mb.add(menu);  
          this.setJMenuBar(mb);  
          
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

		lblIngreseCapital = new JLabel("Ingrese el capital:");
		lblIngreseCapital.setBounds(10,30,100,30);
		contenedor.add(lblIngreseCapital);

		txtCapital = new JTextField();
		txtCapital.setBounds(10,65,100,20);
		contenedor.add(txtCapital);

				
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
		CuotaVariable p = new CuotaVariable();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(700,600);
		p.setVisible(true);
		p.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//p.setUndecorated(true);
		
		ImageIcon img = new ImageIcon("Images/Icono.png");
		p.setIconImage(img.getImage());

		//Image imgBackground = Toolkit.getDefaultToolkit().createImage("Images/background.jpg");

		
	}
	//fin del programa
}