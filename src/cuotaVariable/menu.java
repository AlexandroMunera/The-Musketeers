package cuotaVariable;

//Librerias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class menu extends JFrame implements ActionListener {
	// Contenedor
	Container contenedor;
	JButton cuotaFija;
	JButton cuotaVariable;
	JLabel fondo;

	public menu() {
		super("Intereses");
		contenedor = getContentPane();
		this.getContentPane().setBackground(new Color(190, 190, 190));
		contenedor.setLayout(null);

		setIconImage(new ImageIcon(getClass().getResource("/img/icono.jpg")).getImage());

		ImageIcon imagen = new ImageIcon("musketeer.jpg");
		fondo = new JLabel(imagen);
		fondo.setBounds(100, 40, 400, 200);
		contenedor.add(fondo);

		cuotaFija = new JButton("Cuota Fija");
		cuotaFija.setBounds(30, 300, 200, 30);
		cuotaFija.addActionListener(this);
		contenedor.add(cuotaFija);

		cuotaVariable = new JButton("Cuota Variable");
		cuotaVariable.setBounds(350, 300, 200, 30);
		cuotaVariable.addActionListener(this);
		contenedor.add(cuotaVariable);

		contenedor.repaint();

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cuotaFija) {

			JOptionPane.showMessageDialog(null, "La célula 2 esta trabajando en este desarrollo",
					"Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
			;

		}

	}

	public static void main(String args[]) {

		menu m = new menu();
		m.setSize(600, 400);
		m.setResizable(false);
		m.setVisible(true);
		m.setLocationRelativeTo(null);

	}

}
