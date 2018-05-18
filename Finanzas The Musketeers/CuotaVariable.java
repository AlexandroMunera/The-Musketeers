import java.awt.*; //se importa para el manejo de objetos gráficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librería para manejar gráficos en ventanas

@SuppressWarnings("serial")
public class CuotaVariable extends JFrame implements ActionListener
{
	//instancio atributos
	Container contenedor;
	JButton btnAtras;
	JLabel lblCapital, lblInteres, lblTasa, lblTipo, lblCuotas;
	JTextField txtCapital, txtInteres, txtTasa, txtCuotas;
	JComboBox<String> cmbTipo;

	//Método que muestra la venta Principal
	public CuotaVariable()
	{
		setTitle("Finanzas Personales :: Cuota Variable");
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setSize(700,700);
		Image icon = Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("./img/logo.png"));
		setIconImage(icon);
		setVisible(true);
		setLocationRelativeTo(null);
		
		contenedor = getContentPane();
		contenedor.setBackground(new Color(255,255,255));
		contenedor.setLayout(null);
		
		btnAtras = new JButton("Atr\u00e1s");
		btnAtras.setBounds(12, 12, 84, 30);
		//Evento botón Atrás
		btnAtras.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		        		cerrar();
        	      	}
        	      });
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contenedor.add(btnAtras);
		
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
		//Esto es para controlar el botón cerrar de la ventana
		addWindowListener(new java.awt.event.WindowAdapter() {
		  @Override
		  public void windowClosing(java.awt.event.WindowEvent evt) {
			  cerrar();
		            }
		        });
		
	}
	//Función para cerrar la ventana y abrir el menú.
	private void cerrar()
	{
		Menu ventana = new Menu();
  		ventana.setVisible(true);
  		CuotaVariable.this.dispose();
	}
	public static void main() {
		//Esto es para crear una instancia del otro JFrame para que no se bloquee o para que no salga solamente la barra de título
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuotaVariable frame = new CuotaVariable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}