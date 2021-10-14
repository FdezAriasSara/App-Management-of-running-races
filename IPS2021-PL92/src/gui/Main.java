package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_soy;
	private JButton btnAtleta;
	private JButton btnOrganizador;
	private JPanel panel_card;
	private JPanel panel_atleta;
	private JPanel panel_organizador;
	private JTextPane textPane;
	private JButton btnListarCompeticionesAbiertas;
	private JTextField txtFIDCompeticion;
	private JLabel lblInscribirse;
	private JPanel panel_default;
	private JLabel lblBienvenida;
	private JLabel lblSeleccion;
	private JButton btnAtletaBienvenida;
	private JButton btnOrganizadorBienvenida;
	private JLabel lblIDAtleta;
	private JLabel lblEmailAtleta;
	private JTextField txtFEmail;
	private JTextField txtFIDAtleta;
	private JButton btnInscribirse;
	private JLabel lblInscripcionResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_soy(), BorderLayout.NORTH);
		contentPane.add(getPanel_card(), BorderLayout.CENTER);
	}
	private JPanel getPanel_soy() {
		if (panel_soy == null) {
			panel_soy = new JPanel();
			panel_soy.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_soy.add(getBtnAtleta());
			panel_soy.add(getBtnOrganizador());
		}
		return panel_soy;
	}
	private JButton getBtnAtleta() {
		if (btnAtleta == null) {
			btnAtleta = new JButton("Soy un Atleta");
			btnAtleta.setEnabled(false);
		}
		return btnAtleta;
	}
	private JButton getBtnOrganizador() {
		if (btnOrganizador == null) {
			btnOrganizador = new JButton("Soy un Organizador");
			btnOrganizador.setEnabled(false);
		}
		return btnOrganizador;
	}
	private JPanel getPanel_card() {
		if (panel_card == null) {
			panel_card = new JPanel();
			panel_card.setLayout(new CardLayout(0, 0));
			panel_card.add(getPanel_atleta(), "name_2076409144306400");
			panel_card.add(getPanel_organizador(), "name_2076409154311600");
			panel_card.add(getPanel_default(), "name_2077158837437300");
		}
		return panel_card;
	}
	private JPanel getPanel_atleta() {
		if (panel_atleta == null) {
			panel_atleta = new JPanel();
			panel_atleta.setLayout(null);
			panel_atleta.add(getTextPane());
			panel_atleta.add(getBtnListarCompeticionesAbiertas());
			panel_atleta.add(getTxtFIDCompeticion());
			panel_atleta.add(getLblInscribirse());
			panel_atleta.add(getLblIDAtleta());
			panel_atleta.add(getLblEmailAtleta());
			panel_atleta.add(getTxtFEmail());
			panel_atleta.add(getTxtFIDAtleta());
			panel_atleta.add(getBtnInscribirse());
			panel_atleta.add(getLblInscripcionResultado());
		}
		return panel_atleta;
	}
	private JPanel getPanel_organizador() {
		if (panel_organizador == null) {
			panel_organizador = new JPanel();
		}
		return panel_organizador;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setEditable(false);
			textPane.setBounds(10, 54, 848, 307);
		}
		return textPane;
	}
	private JButton getBtnListarCompeticionesAbiertas() {
		if (btnListarCompeticionesAbiertas == null) {
			btnListarCompeticionesAbiertas = new JButton("Listar Competiciones");
			
			btnListarCompeticionesAbiertas.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnListarCompeticionesAbiertas.setBounds(10, 10, 169, 34);
		}
		return btnListarCompeticionesAbiertas;
	}
	private JTextField getTxtFIDCompeticion() {
		if (txtFIDCompeticion == null) {
			txtFIDCompeticion = new JTextField();
			txtFIDCompeticion.setHorizontalAlignment(SwingConstants.CENTER);
			txtFIDCompeticion.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtFIDCompeticion.setBounds(327, 377, 51, 29);
			txtFIDCompeticion.setColumns(10);
		}
		return txtFIDCompeticion;
	}
	private JLabel getLblInscribirse() {
		if (lblInscribirse == null) {
			lblInscribirse = new JLabel("ID Competicion en la que te quieres inscribir:");
			lblInscribirse.setFont(new Font("Dialog", Font.PLAIN, 15));
			lblInscribirse.setBounds(10, 374, 307, 34);
		}
		return lblInscribirse;
	}
	private JPanel getPanel_default() {
		if (panel_default == null) {
			panel_default = new JPanel();
			panel_default.setLayout(null);
			panel_default.add(getLblBienvenida());
			panel_default.add(getLblSeleccion());
			panel_default.add(getBtnAtletaBienvenida());
			panel_default.add(getBtnOrganizadorBienvenida());
		}
		return panel_default;
	}
	private JLabel getLblBienvenida() {
		if (lblBienvenida == null) {
			lblBienvenida = new JLabel("Bienvenido a su gestor de carreras");
			lblBienvenida.setFont(new Font("Dialog", Font.PLAIN, 40));
			lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
			lblBienvenida.setBounds(108, 163, 682, 101);
		}
		return lblBienvenida;
	}
	private JLabel getLblSeleccion() {
		if (lblSeleccion == null) {
			lblSeleccion = new JLabel("Por favor, seleccione su rol:");
			lblSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
			lblSeleccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSeleccion.setBounds(108, 263, 682, 47);
		}
		return lblSeleccion;
	}
	private JButton getBtnAtletaBienvenida() {
		if (btnAtletaBienvenida == null) {
			btnAtletaBienvenida = new JButton("Atleta");
			
			btnAtletaBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnAtletaBienvenida.setBounds(219, 354, 183, 47);
		}
		return btnAtletaBienvenida;
	}
	private JButton getBtnOrganizadorBienvenida() {
		if (btnOrganizadorBienvenida == null) {
			btnOrganizadorBienvenida = new JButton("Organizador");
			btnOrganizadorBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnOrganizadorBienvenida.setBounds(433, 354, 183, 47);
		}
		return btnOrganizadorBienvenida;
	}
	private JLabel getLblIDAtleta() {
		if (lblIDAtleta == null) {
			lblIDAtleta = new JLabel("Introduzca su ID de Atleta:");
			lblIDAtleta.setFont(new Font("Dialog", Font.PLAIN, 15));
			lblIDAtleta.setBounds(10, 418, 307, 34);
		}
		return lblIDAtleta;
	}
	private JLabel getLblEmailAtleta() {
		if (lblEmailAtleta == null) {
			lblEmailAtleta = new JLabel("Introduzca el email con el que se registr\u00F3:");
			lblEmailAtleta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEmailAtleta.setBounds(10, 462, 307, 34);
		}
		return lblEmailAtleta;
	}
	private JTextField getTxtFEmail() {
		if (txtFEmail == null) {
			txtFEmail = new JTextField();
			txtFEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtFEmail.setHorizontalAlignment(SwingConstants.CENTER);
			txtFEmail.setBounds(327, 467, 240, 29);
			txtFEmail.setColumns(10);
		}
		return txtFEmail;
	}
	private JTextField getTxtFIDAtleta() {
		if (txtFIDAtleta == null) {
			txtFIDAtleta = new JTextField();
			txtFIDAtleta.setFont(new Font("Dialog", Font.PLAIN, 15));
			txtFIDAtleta.setHorizontalAlignment(SwingConstants.CENTER);
			txtFIDAtleta.setBounds(327, 423, 96, 29);
			txtFIDAtleta.setColumns(10);
		}
		return txtFIDAtleta;
	}
	private JButton getBtnInscribirse() {
		if (btnInscribirse == null) {
			btnInscribirse = new JButton("Inscribirse");
			btnInscribirse.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnInscribirse.setBounds(614, 418, 193, 34);
		}
		return btnInscribirse;
	}
	private JLabel getLblInscripcionResultado() {
		if (lblInscripcionResultado == null) {
			lblInscripcionResultado = new JLabel("Error: Ya estabas inscrito en dicha competicion");
			lblInscripcionResultado.setVisible(false);
			lblInscripcionResultado.setForeground(Color.RED);
			lblInscripcionResultado.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblInscripcionResultado.setBounds(10, 517, 558, 34);
		}
		return lblInscripcionResultado;
	}
}