package agendaElectronica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtApellidos;
	private JTextField txtNombre;
	private JTextField txtFechaNac;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtIndice;

	/**


	/**
	 * Create the frame.
	 */
	
	String dnis [] =new String [10];
	String nombres [] = new String [10];
	String apellidos[]=new String [10];
	String direccion []= new String [10];
	String telefono []= new String [10];
	String fechasNac[] = new String [10];
	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 622, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel titulo = new JLabel("AGENDA ELECTRONICA");
		sl_contentPane.putConstraint(SpringLayout.NORTH, titulo, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, titulo, 196, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, titulo, 31, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, titulo, 396, SpringLayout.WEST, contentPane);
		titulo.setFont(new Font("Stencil", Font.PLAIN, 18));
		contentPane.add(titulo);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String indice =txtIndice.getText();
			int indi=Integer.parseInt(indice);
			dnis [indi]=txtDni.getText();
			nombres [indi]=txtNombre.getText();
			apellidos [indi] = txtApellidos.getText();
			direccion [indi]= txtDireccion.getText();
			telefono [indi]= txtTelefono.getText();
			fechasNac[indi]= txtFechaNac.getText();
			
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnGuardar, 218, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGuardar, 344, SpringLayout.WEST, contentPane);
		btnGuardar.setFont(new Font("Sitka Text", Font.BOLD, 16));
		contentPane.add(btnGuardar);
		
		JLabel dni = new JLabel("DNI:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, dni, 73, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dni, 44, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, dni, 86, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, dni, 89, SpringLayout.WEST, contentPane);
		dni.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(dni);
		
		JLabel nombre = new JLabel("Nombre:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, nombre, 96, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, nombre, 44, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, nombre, 109, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, nombre, 127, SpringLayout.WEST, contentPane);
		nombre.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(nombre);
		
		JLabel apellido = new JLabel("Apellidos");
		sl_contentPane.putConstraint(SpringLayout.NORTH, apellido, 119, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, apellido, 44, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, apellido, 132, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, apellido, 127, SpringLayout.WEST, contentPane);
		apellido.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(apellido);
		
		txtDni = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDni, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDni, 114, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtDni, 90, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDni, 246, SpringLayout.WEST, contentPane);
		txtDni.setFont(new Font("Dialog", Font.BOLD, 12));
		txtDni.setColumns(10);
		contentPane.add(txtDni);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDireccion, 76, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDireccion, 341, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDireccion, 89, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDireccion, 411, SpringLayout.WEST, contentPane);
		lblDireccion.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTelefono, 99, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTelefono, 341, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblTelefono, 112, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTelefono, 424, SpringLayout.WEST, contentPane);
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lblTelefono);
		
		JLabel fechaNac = new JLabel("Fecha Nac:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, fechaNac, 122, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, fechaNac, 341, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, fechaNac, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, fechaNac, 424, SpringLayout.WEST, contentPane);
		fechaNac.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(fechaNac);
		
		txtApellidos = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGuardar, 48, SpringLayout.SOUTH, txtApellidos);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtApellidos, 119, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtApellidos, 114, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtApellidos, 138, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtApellidos, 246, SpringLayout.WEST, contentPane);
		txtApellidos.setFont(new Font("Dialog", Font.BOLD, 12));
		txtApellidos.setColumns(10);
		contentPane.add(txtApellidos);
		
		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 94, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 114, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtNombre, 113, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombre, 246, SpringLayout.WEST, contentPane);
		txtNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);
		
		txtFechaNac = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtFechaNac, 121, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtFechaNac, 421, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtFechaNac, 140, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtFechaNac, 553, SpringLayout.WEST, contentPane);
		txtFechaNac.setFont(new Font("Dialog", Font.BOLD, 12));
		txtFechaNac.setColumns(10);
		contentPane.add(txtFechaNac);
		
		txtTelefono = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTelefono, 96, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTelefono, 421, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtTelefono, 115, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTelefono, 553, SpringLayout.WEST, contentPane);
		txtTelefono.setFont(new Font("Dialog", Font.BOLD, 12));
		txtTelefono.setColumns(10);
		contentPane.add(txtTelefono);
		
		txtDireccion = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDireccion, 73, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDireccion, 421, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtDireccion, 92, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDireccion, 553, SpringLayout.WEST, contentPane);
		txtDireccion.setFont(new Font("Dialog", Font.BOLD, 12));
		txtDireccion.setColumns(10);
		contentPane.add(txtDireccion);
		
		JButton btnAdelante = new JButton(">>");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAdelante, 223, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAdelante, 397, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAdelante, 268, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAdelante, 473, SpringLayout.WEST, contentPane);
		btnAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indi=0;
				String indice =txtIndice.getText();
				indi=Integer.parseInt(indice);
				if(indi<9) {
					indi++;
					indice=String.valueOf(indi);
					txtIndice.setText(indice);}
				
				txtDni.setText(dnis[indi]);
				txtNombre.setText(nombres[indi]);
				txtApellidos.setText(apellidos[indi]);
				txtDireccion.setText(direccion[indi]);
				txtTelefono.setText(telefono[indi]);
				txtFechaNac.setText(fechasNac[indi]);
			}
		});
		btnAdelante.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnAdelante);
		
		JLabel lblNewLabel = new JLabel("INDICE:");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnGuardar, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 275, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 222, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 267, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		txtIndice = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtIndice, 272, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtIndice, 322, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtIndice, 356, SpringLayout.WEST, contentPane);
		txtIndice.setEditable(false);
		txtIndice.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndice.setText("0");
		contentPane.add(txtIndice);
		txtIndice.setColumns(10);
		
		JButton btnAtras = new JButton("<<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indi= 0;
				String indice =txtIndice.getText();
				indi=Integer.parseInt(indice);
				
				if(indi >0) {
					indi--;
					indice=String.valueOf(indi);
					txtIndice.setText(indice);
					
					txtDni.setText(dnis[indi]);
					txtNombre.setText(nombres[indi]);
					txtApellidos.setText(apellidos[indi]);
					txtDireccion.setText(direccion[indi]);
					txtTelefono.setText(telefono[indi]);
					txtFechaNac.setText(fechasNac[indi]);
				}
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAtras, 223, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAtras, 115, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAtras, 268, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAtras, 191, SpringLayout.WEST, contentPane);
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnAtras);
	}
}
