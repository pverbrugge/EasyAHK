import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Gui {

	public JFrame frame;
	public Readfile fileinput;
	static String filePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		fileinput= new Readfile();
		initialize();
		
	}
	
	public Gui(String input) {
		initialize();
		fileinput= new Readfile(input);
	}

	/**
	 * Initia	lize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		int numcom= fileinput.getLength();
		//int numcom=0;
		JPanel panel1= new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill=GridBagConstraints.HORIZONTAL;
		c.ipady = 40;
		c.insets=new Insets (2,2,2,2);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3, true);
		for(int i = 0; i < numcom;i++){
			
			c.weightx= 0.8;
			c.gridx=0;
			c.gridy=i;
			JLabel temp= new JLabel("test");
			temp.setBorder(border);
			panel1.add(temp,c);
			
			c.weightx= 0.05;
			c.gridx=1;
			c.gridy=i;
			int index2=i;
			JButton temp2=new JButton("Modify");
			temp2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					CommandEdit temp4 = new CommandEdit(fileinput.get(index2),index2, fileinput);
					temp4.frame.setVisible(true);
				}
			});
			
			panel1.add(temp2,c);
			
			
			c.weightx= 0.05;
			c.gridx=2;
			c.gridy=i;
			int index=i;
			JButton temp1 = new JButton("Delete");
			temp1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					System.out.println(index);
					fileinput.delete(index);
				}
			});
			panel1.add(temp1,c);
			
		}
		
		JScrollPane scrollPane = new JScrollPane(panel1);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 732, 396);
		frame.getContentPane().add(scrollPane);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(fc);
				if(returnVal == JFileChooser.APPROVE_OPTION){
					filePath = fc.getSelectedFile().getAbsolutePath();
					System.out.println(filePath);
					
				}else{
					System.out.println("User clicked CANCEL");
					//System.exit(1);
					//JPopupMenu popupMenu = new JPopupMenu();
					//addPopup(getFile, popupMenu);
					
				}
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Command");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New Command");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommandEdit temp = new CommandEdit(fileinput );
				temp.frame.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Settings");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Settings");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		
		
	}
}
