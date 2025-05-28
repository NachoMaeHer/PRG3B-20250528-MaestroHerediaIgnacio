package jcolonia.daw2024.e3b;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.event.KeyEvent;

public class Menú extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jpanelGeneral;
	private JPanel jpanelExterior;
	private JPopupMenu popupMenu;
	private JMenuBar subMenu;
	private JMenu NewSubMenu;
	private JMenuItem subMenuAyuda;
	private JMenuItem subMenuArchivo;

	/**
	 * Lanza la aplicación.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menú frame = new Menú();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea el frame.
	 */
	public Menú() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		jpanelGeneral = new JPanel();
		jpanelGeneral.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(new BorderLayout());
		setContentPane(jpanelGeneral);
		jpanelGeneral.setLayout(new BorderLayout(0, 0));
		jpanelGeneral.add(getJpanelExterior(), BorderLayout.CENTER);
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 10));
			jpanelExterior.add(getMenuBar_1(), BorderLayout.NORTH);
		}
		return jpanelExterior;
	}
	private JMenuBar getMenuBar_1() {
		if (subMenu == null) {
			subMenu = new JMenuBar();
			subMenu.setToolTipText("Menú");
			subMenu.add(getNewSubMenu());
		}
		return subMenu;
	}
	private JMenu getNewSubMenu() {
		if (NewSubMenu == null) {
			NewSubMenu = new JMenu("Menú");
			NewSubMenu.add(getSubMenuAyuda());
			NewSubMenu.add(getSubMenuArchivo());
		}
		return NewSubMenu;
	}
	private JMenuItem getSubMenuAyuda() {
		if (subMenuAyuda == null) {
			subMenuAyuda = new JMenuItem("Ayuda");
			subMenuAyuda.setMnemonic(KeyEvent.VK_U);
		}
		return subMenuAyuda;
	}
	private JMenuItem getSubMenuArchivo() {
		if (subMenuArchivo == null) {
			subMenuArchivo = new JMenuItem("Archivo");
			subMenuArchivo.setMnemonic(KeyEvent.VK_A);
		}
		return subMenuArchivo;
	}
}
