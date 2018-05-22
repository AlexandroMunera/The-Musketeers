import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

//Clase principal
public class CuotaVariable extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L; //Salira una alerta, con esto dejo de salir

	//instancio atributos
	private Container contenedor;
	private JLabel lblTitulo, lblIngreseCapital,lblIngreseInteres,lblIngreseTasa,lblTiposIntereses,lblIngreseCuotas;
	private JTextField txtCapital, txtInteres,txtTasa,txtCuotas;
	private JComboBox ddlTipoInteres;

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
		
		lblTitulo = new JLabel("AMORTIZACIÓN CON CUOTA VARIABLE");
		lblTitulo.setBounds(200,10,700,30);
		lblTitulo.setFont(new Font("Courier New", Font.BOLD, 30));
    	lblTitulo.setForeground(Color.black);
		contenedor.add(lblTitulo);

		lblIngreseCapital = new JLabel("Ingrese el capital:");
		lblIngreseCapital.setBounds(10,30,100,30);
		contenedor.add(lblIngreseCapital);

		txtCapital = new JTextField();
		txtCapital.setBounds(10,65,200,20);
		contenedor.add(txtCapital);

		lblIngreseInteres = new JLabel("Interés:");
		lblIngreseInteres.setBounds(10,90,100,30);
		contenedor.add(lblIngreseInteres);

		txtInteres = new JTextField();
		txtInteres.setBounds(10,125,200,20);
		contenedor.add(txtInteres);

		lblIngreseTasa = new JLabel("Tasa:");
		lblIngreseTasa.setBounds(10,150,100,30);
		contenedor.add(lblIngreseTasa);

		txtTasa = new JTextField();
		txtTasa.setBounds(10,185,200,20);
		contenedor.add(txtTasa);

		lblTiposIntereses = new JLabel("Tipo de Interés:");
		lblTiposIntereses.setBounds(220,150,100,30);
		contenedor.add(lblTiposIntereses);

		ddlTipoInteres = new JComboBox();
		ddlTipoInteres.setBounds(220,185,200,20);
		ddlTipoInteres.addItem("Seleccione un interés");
		ddlTipoInteres.addItem("Efectivo anual");
		ddlTipoInteres.addItem("Efectivo semestral");
		ddlTipoInteres.addItem("Efectivo trimestral");
		ddlTipoInteres.addItem("Efectivo mensual");
		ddlTipoInteres.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print(ddlTipoInteres.getSelectedItem().toString());
			}
		});
		contenedor.add(ddlTipoInteres);

		lblIngreseCuotas = new JLabel("Cuotas:");
		lblIngreseCuotas.setBounds(430,150,100,30);
		contenedor.add(lblIngreseCuotas);

		txtCuotas = new JTextField();
		txtCuotas.setBounds(430,185,200,20);
		contenedor.add(txtCuotas);

				
		//dibujo el contenedor en pantalla
		contenedor.repaint();
		
	}
	
	//m�todo de la interfaz de eventos donde se escuchan los eventos
	public void actionPerformed(ActionEvent e)
	{
		//eventos del bot�n
		//if (e.getSource()==btnCuotaFija)
		//{
			
		//}
		
	}

	public static void main(String args[])
	{
		System.setProperty("file.encoding","UTF-8");
		Field charset = Charset.class.getDeclaredField("defaultCharset");
		charset.setAccessible(true);
		charset.set(null,null);
		
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