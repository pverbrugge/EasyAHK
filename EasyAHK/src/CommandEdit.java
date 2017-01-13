import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import java.util.Collections.*;

public class CommandEdit {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public ListofCommands C= new ListofCommands();
	JScrollPane scrollPane = new JScrollPane();
	JScrollPane scrollPane_1 = new JScrollPane();
	JList list;
	ButtonGroup group= new ButtonGroup();
	ButtonGroup group2= new ButtonGroup();
	public Command com;
	int place;
	Boolean newcommand;
	public Readfile fileinput;
	

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommandEdit window = new CommandEdit();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 * @wbp.parser.constructor
	 */
	public CommandEdit(Readfile x) {
		this.fileinput=x;
		this.com= new Command();
		Boolean newcommand =true;
		initialize();
	}
	
	public CommandEdit(Command x,int place, Readfile y) {
		this.com=x;
		this.place=place;
		Boolean newcommand = false;
		this.fileinput=y;
		initialize();
	}
	
	public void setList(String s){
		DefaultListModel listModel= new DefaultListModel<String>();
		Set<String> temp= C.getKeys(s);
		TreeSet<String> mySet = new TreeSet<String>(temp);
		for(String x: mySet){
			System.out.println(x);
			listModel.addElement(x);
		}
		JList<String> list = new JList<String>(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
	}
	
	public void setList2(String s){
		DefaultListModel listModel2= new DefaultListModel<String>();
		Set<String> temp2= C.getKeys(s);
		TreeSet<String> mySet2 = new TreeSet<String>(temp2);
		for(String x: mySet2){
			System.out.println(x);
			listModel2.addElement(x);
		}
		JList<String> list2 = new JList<String>(listModel2);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list2);
	}
	
	public void addCom(Command x){
		fileinput.add(com);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FrameInitialize();
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 70, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(90, 12, 142, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Output");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(252, 13, 61, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Command");
		btnNewButton.addActionListener(new ActionListener() {
			Readfile tmp;
			Command tmpcom;
			public void actionPerformed(ActionEvent e) {
				//add save to command stuff
				if(true){
					
					
					tmp.add(tmpcom);
					System.out.println("apple");
					//addComm();
				}else{
					System.out.println("bananna");
					//fileinput.add(place,com);
				}
				
				frame.dispose();
			}
			private ActionListener init(Readfile var, Command var1){
				this.tmp=var;
				this.tmpcom=var1;
				return this;
			}
			
		}.init(fileinput,com));
		btnNewButton.setBounds(365, 468, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 173, 222, 208);
		frame.getContentPane().add(scrollPane);
		
		InputButtonInitialize();
		OutputButtonInitialize();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Window Active");
		chckbxNewCheckBox.setBounds(10, 468, 132, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(252, 173, 222, 208);
		frame.getContentPane().add(scrollPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(323, 15, 151, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
	
	}
	
	private void FrameInitialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
	
	private void InputButtonInitialize(){
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Letters");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setList("letters");	
			}
		});
		group.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 39, 83, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Media Keys");
		group.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList("media");
			}
		});
		rdbtnNewRadioButton_6.setBounds(10, 143, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Manual Input");
		group.add(rdbtnNewRadioButton_11);
		rdbtnNewRadioButton_11.setBounds(123, 65, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Special Keys");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList("Specialkeys");
			}
		});
		group.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 65, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("F Keys");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList("fkeys");
			}
		});
		group.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 91, 83, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Number Pad");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList("numpad");
			}
		});
		group.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(10, 117, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("ScanCode");
		group.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(123, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Mouse Click");
		rdbtnNewRadioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList("mouse");
			}
		});
		group.add(rdbtnNewRadioButton_12);
		rdbtnNewRadioButton_12.setBounds(123, 91, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_12);
	}

	private void OutputButtonInitialize(){

	
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Mouse Movement");
		group2.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(365, 117, 132, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Letters");
		group2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("letters");
			}
		});
		rdbtnNewRadioButton_7.setBounds(252, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("F Keys");
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("fkeys");
			}
		});
		group2.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setBounds(252, 91, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Number Pad");
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("numpad");
			}
		});
		group2.add(rdbtnNewRadioButton_10);
		rdbtnNewRadioButton_10.setBounds(252, 117, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Media Keys");
		rdbtnNewRadioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("media");
			}
		});
		group2.add(rdbtnNewRadioButton_13);
		rdbtnNewRadioButton_13.setBounds(252, 143, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Scan Code");
		group2.add(rdbtnNewRadioButton_14);
		rdbtnNewRadioButton_14.setBounds(365, 39, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Manual Input");
		group2.add(rdbtnNewRadioButton_15);
		rdbtnNewRadioButton_15.setBounds(365, 65, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Mouse Click");
		rdbtnNewRadioButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("Mouse");
			}
		});
		group2.add(rdbtnNewRadioButton_16);
		rdbtnNewRadioButton_16.setBounds(365, 91, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Special Keys");
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList2("specialkeys");
			}
		});
		group2.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(252, 65, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
	}
}
