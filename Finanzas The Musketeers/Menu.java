import java.awt.*; //se importa para el manejo de objetos grï¿½ficos
import java.awt.event.*; //se importa para el manejo de eventos
import java.net.URL;
import javax.swing.*; //librerï¿½a para manejar grï¿½ficos en ventanas

@SuppressWarnings("serial")
public class Menu extends JFrame implements ActionListener
{
	Container contenedor;
	JButton btnCuotaFija, btnCuotaVariable;
	JLabel imgImagen;
	
	public Menu(){
		setTitle("Finanzas Personales - The Musketeers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,450);
		setVisible(true);
		setLocationRelativeTo(null);
		Image icon = Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("./img/logo.png"));
        setIconImage(icon);
		
		contenedor = getContentPane();
		contenedor.setBackground(new Color(255,255,255));
		contenedor.setLayout(null);
		
		imgImagen = new JLabel();
		imgImagen.setBounds(210, 10, 178, 178);
		String path = "./img/logo.png";  
		URL url = this.getClass().getResource(path);  
		ImageIcon logo = new ImageIcon(url); 
		imgImagen.setIcon(logo); 
		contenedor.add(imgImagen);
		
		btnCuotaFija = new JButton("CUOTA FIJA");
		btnCuotaFija.setBounds(140,200,150,150);
		btnCuotaFija.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCuotaFija.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        				//Aquï¿½ va el cï¿½digo para entrar al mï¿½dulo de Cuota Fija.
        	      	}
        	      });
		contenedor.add(btnCuotaFija);
		
		btnCuotaVariable = new JButton("CUOTA VARIABLE");
		btnCuotaVariable.setBounds(310,200,150,150);
		btnCuotaVariable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCuotaVariable.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        				CuotaVariable ventana = new CuotaVariable();
        				ventana.setVisible(true);
        				Menu.this.dispose();
        			}
        	      });
		contenedor.add(btnCuotaVariable);
		
		//dibujo el contenedor en pantalla
		contenedor.repaint();
	}
	
	public static void main(String[] args) {
		//Esto es para crear una instancia del otro JFrame para que no se bloquee o para que no salga solamente la barra de tï¿½tulo
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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