import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start {
	static String filePath = null;
	private JFrame frame;
	private JFrame frame1;
	public Boolean visability=true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/*
	 final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(fc);
		String filePath = null;
		if(returnVal == JFileChooser.APPROVE_OPTION){
			filePath = fc.getSelectedFile().getAbsolutePath();
		}else{
			System.out.println("User clicked CANCEL");
			System.exit(1);
		}
	 */
	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton createNew = new JButton("New Script");
		createNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			filePath="new";
			frame.setVisible(false);
			try {
				Gui window1 = new Gui();
				window1.frame.setVisible(true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}	
			
				
			}
		});
		createNew.setBounds(114, 40, 218, 54);
		frame.getContentPane().add(createNew);
		
		JButton getFile = new JButton("Edit Script");
		getFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(fc);
				
				if(returnVal == JFileChooser.APPROVE_OPTION){
					filePath = fc.getSelectedFile().getAbsolutePath();
					System.out.println(filePath);
					frame.setVisible(false);
					try {
						Gui window1 = new Gui(filePath);
						window1.frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}else{
					System.out.println("User clicked CANCEL");
					//System.exit(1);
					JPopupMenu popupMenu = new JPopupMenu();
					addPopup(getFile, popupMenu);
					
				}
				
				
			}
		});
		getFile.setBounds(114, 130, 218, 65);
		frame.getContentPane().add(getFile);
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
