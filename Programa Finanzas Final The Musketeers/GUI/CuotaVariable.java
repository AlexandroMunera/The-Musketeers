import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

//Clase principal
@SuppressWarnings("serial")
public class CuotaVariable extends JFrame implements ActionListener
{
	//instancio atributos
	Container contenedor;
	JLabel lblTitulo, lblCapital, lblInteres, lblTasa, lblTipo, lblCuotas;
	JTextField txtCapital, txtInteres, txtTasa, txtCuotas;
	JComboBox<String> cmbTipo;
	
	//M�todo que muestra la venta Principal
	public CuotaVariable()
	{
		super("Amortizaci\u00f3n con Cuota Variable");
		contenedor = getContentPane();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(0,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//setSize(700,600);
		setVisible(true);

		JMenu menu;  
		JMenuItem menuItemSalir, menuItemOperaciones; 

          JMenuBar mb = new JMenuBar();  
		  menu=new JMenu("Men\u00fa");
		  Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
		  menu.setCursor(handCursor);
		  menuItemOperaciones=new JMenuItem("Operaciones");
		  menuItemOperaciones.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		  menuItemOperaciones.setCursor(handCursor);
		  menu.add(menuItemOperaciones);
		  menuItemSalir=new JMenuItem("Salir");
		  menuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		  menuItemSalir.setCursor(handCursor);
		  menuItemSalir.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}); 
          menu.add(menuItemSalir); 
          mb.add(menu);  
          this.setJMenuBar(mb);

		lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 20, 1000, 36);
		lblTitulo.setText("AMORTIZACI\u00d3N CON CUOTA VARIABLE");
		Font fuente=new Font("", Font.BOLD, 36);
        lblTitulo.setFont(fuente);
		contenedor.add(lblTitulo);
				
		lblCapital = new JLabel();
		lblCapital.setBounds(50, 80, 200, 25);
		lblCapital.setText("Ingrese el Capital:");
		contenedor.add(lblCapital);
		
		txtCapital = new JTextField();
		txtCapital.setBounds(50,100,200,25);
		txtCapital.requestFocus();
		txtCapital.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent evt) {
        		int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        		if (k<8 || k>8 && k<48 || k>57) {//Si el caracter ingresado es una letra o un caracter especial, excepto la tecla retroceso  
        			evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
          		  JOptionPane.showMessageDialog(null, "No puedes ingresar letras \u00f3 caracteres especiales! :(", "Validando Datos",
          		  JOptionPane.INFORMATION_MESSAGE);
          		  txtCapital.setText("");
          		  txtCapital.requestFocus();
        		}
        	}
		});
		contenedor.add(txtCapital);
		
		lblInteres = new JLabel();
		lblInteres.setBounds(50, 130, 200, 25);
		lblInteres.setText("Ingrese el Inter\u00e9s:");
		contenedor.add(lblInteres);
		
		txtInteres = new JTextField();
		txtInteres.setBounds(50,150,200,25);
		txtInteres.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent evt) {
        		int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        		if (k<8 || k>8 && k<48 || k>57) {//Si el caracter ingresado es una letra o un caracter especial, excepto la tecla retroceso 
        		  evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
        		  JOptionPane.showMessageDialog(null, "No puedes ingresar letras \u00f3 caracteres especiales! :(", "Validando Datos",
        		  JOptionPane.INFORMATION_MESSAGE);
        		  txtInteres.setText("");
        		  txtInteres.requestFocus();
        		}
        	}
		});
		contenedor.add(txtInteres);
		
		lblTasa = new JLabel();
		lblTasa.setBounds(50, 180, 200, 25);
		lblTasa.setText("Ingrese la Tasa:");
		contenedor.add(lblTasa);
		
		txtTasa = new JTextField();
		txtTasa.setBounds(50,200,200,25);
		txtTasa.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent evt) {
        		int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        		if (k<8 || k>8 && k<48 || k>57) {//Si el caracter ingresado es una letra o un caracter especial, excepto la tecla retroceso 
        		  evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
        		  JOptionPane.showMessageDialog(null, "No puedes ingresar letras \u00f3 caracteres especiales! :(", "Validando Datos",
        		  JOptionPane.INFORMATION_MESSAGE);
        		  txtTasa.setText("");
        		  txtTasa.requestFocus();
        		}
        	}
		});
		contenedor.add(txtTasa);
		
		lblTipo = new JLabel();
		lblTipo.setBounds(50, 230, 200, 25);
		lblTipo.setText("Tipo de Inter\u00e9s:");
		contenedor.add(lblTipo);
		
		String[] tipoInteres = { "Seleccione un inter\u00e9s", "Efectivo Anual", "Efectivo Semestral", "Efectivo Trimestral", "Efectivo Mensual"};
		cmbTipo = new JComboBox<String>(tipoInteres);
		cmbTipo.setBounds(50, 250, 200, 25);
		cmbTipo.setSelectedIndex(0);
		cmbTipo.addActionListener(this);
		cmbTipo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbTipo.setBackground(new Color(255,255,255));
		contenedor.add(cmbTipo);
		
		lblCuotas = new JLabel();
		lblCuotas.setBounds(50, 280, 200, 25);
		lblCuotas.setText("Ingrese las Cuotas:");
		contenedor.add(lblCuotas);
		
		txtCuotas = new JTextField();
		txtCuotas.setBounds(50,300,200,25);
		txtCuotas.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent evt) {
        		int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
        		if (k<8 || k>8 && k<48 || k>57) {//Si el caracter ingresado es una letra o un caracter especial, excepto la tecla retroceso 
        		  evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
        		  JOptionPane.showMessageDialog(null, "No puedes ingresar letras \u00f3 caracteres especiales! :(", "Validando Datos",
        		  JOptionPane.INFORMATION_MESSAGE);
        		  txtCuotas.setText("");;
        		  txtCuotas.requestFocus();
        		}
        	}
		});
		contenedor.add(txtCuotas);
		
		//dibujo el contenedor en pantalla
				contenedor.repaint();
		
	}
	
	//m�todo de la interfaz de eventos donde se escuchan los eventos
	public void actionPerformed(ActionEvent e)
	{
		
	}

	public static void main(String args[])
	{
		//m�todo principal
		CuotaVariable p = new CuotaVariable();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(700,600);
		p.setVisible(true);
		p.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		ImageIcon img = new ImageIcon("../Images/logo.png");
		p.setIconImage(img.getImage());

		//Image imgBackground = Toolkit.getDefaultToolkit().createImage("Images/background.jpg");

		
	}
	//fin del programa
}