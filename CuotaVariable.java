import java.awt.*; //se importa para el manejo de objetos gr�ficos
import java.awt.event.*; //se importa para el manejo de eventos
import javax.swing.*; //librer�a para manejar gr�ficos en ventanas

import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;

//Clase principal
public class CuotaVariable extends JFrame implements ActionListener,PropertyChangeListener
{
	private static final long serialVersionUID = 1L; //Salía una alerta, con esto dejo de salir

	//instancio atributos
	private Container contenedor;
	private JLabel lblTitulo, lblIngreseCapital,lblIngreseInteres,lblIngreseTasa,lblTiposIntereses,lblIngreseCuotas;	
	private JComboBox ddlTipoInteres;
	private JFormattedTextField txtCapital,txtInteres,txtTasa,txtCuotas;

	//Values for the fields
    private double capital = 0;
	private double intereses = 7.5;  //7.5%
	private double tasa = 0;  
	private int numCuotas = 12;	

	private NumberFormat capitalFormat;	

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

		
		capitalFormat = NumberFormat.getCurrencyInstance();
		capitalFormat.setMaximumFractionDigits(0);
		txtCapital = new JFormattedTextField(capitalFormat);
		txtCapital.setBounds(10,65,200,20);
		txtCapital.setValue(capital);	
		txtCapital.addPropertyChangeListener("value", this);
		contenedor.add(txtCapital);

		lblIngreseInteres = new JLabel("Interés:");
		lblIngreseInteres.setBounds(10,90,100,30);
		contenedor.add(lblIngreseInteres);

		txtInteres = new JFormattedTextField();
		txtInteres.setBounds(10,125,200,20);
		txtInteres.setValue(intereses);	
		txtInteres.addPropertyChangeListener("value", this);

		contenedor.add(txtInteres);

		lblIngreseTasa = new JLabel("Tasa:");
		lblIngreseTasa.setBounds(10,150,100,30);
		contenedor.add(lblIngreseTasa);

		txtTasa = new JFormattedTextField();
		txtTasa.setBounds(10,185,200,20);
		txtTasa.setValue(tasa);	
		txtTasa.addPropertyChangeListener("value", this);

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

		txtCuotas = new JFormattedTextField();
		txtCuotas.setBounds(430,185,200,20);	
		txtCuotas.setValue(numCuotas);	
		txtCuotas.addPropertyChangeListener("value", this);
		contenedor.add(txtCuotas);

				
		//dibujo el contenedor en pantalla
		contenedor.repaint();
		
	}

	/** Called when a field's "value" property changes. */
    public void propertyChange(PropertyChangeEvent e) {
        Object source = e.getSource();
	   
		if (source == txtInteres) {
            intereses = ((Number)txtInteres.getValue()).doubleValue();
		}
		else if (source == txtTasa) {
            tasa = ((Number)txtTasa.getValue()).doubleValue();
        }
		else if (source == txtCuotas) {
            numCuotas = ((Number)txtCuotas.getValue()).intValue();
        }

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