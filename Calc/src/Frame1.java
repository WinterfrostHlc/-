import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;


public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setTitle("\u041A\u0430\u043B\u043A");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField.setBounds(259, 20, 225, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u0414\u043B\u0438\u043D\u0430");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(10, 21, 225, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(10, 57, 225, 25);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_1.setBounds(259, 56, 225, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0415\u0431\u0443\u0447\u0438\u0439 \u0448\u0430\u043A\u0430\u043B"}));
		comboBox.setBounds(259, 92, 225, 25);
		frame.getContentPane().add(comboBox);
		
		JLabel label_2 = new JLabel("\u0424\u043E\u0440\u043C\u0430\u0442 \u0441\u0436\u0430\u0442\u0438\u044F");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 93, 225, 25);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0420\u0430\u0437\u0432\u0451\u0440\u0442\u043A\u0430");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 129, 225, 25);
		frame.getContentPane().add(label_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_1.setBounds(259, 164, 225, 25);
		frame.getContentPane().add(spinner_1);
		
		JLabel label_4 = new JLabel("\u0427\u0430\u0441\u043E\u0432 \u0432 \u0434\u0435\u043D\u044C");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(10, 165, 225, 25);
		frame.getContentPane().add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_2.setBounds(259, 200, 225, 25);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u043D\u0435\u0439");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBounds(10, 201, 225, 25);
		frame.getContentPane().add(label_5);
		
		JButton button = new JButton("\u041F\u043E\u0441\u0447\u0438\u0442\u0430\u0442\u0431");
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(10, 236, 474, 50);
		frame.getContentPane().add(button);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_3.setBounds(259, 297, 225, 50);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_6 = new JLabel("\u0418\u0442\u043E\u0433\u043E");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(10, 297, 225, 50);
		frame.getContentPane().add(label_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u0427\u0435\u0440\u0435\u0441\u0441\u0442\u0440\u043E\u0447\u043D\u0430\u044F", "\u041F\u0440\u043E\u0433\u0440\u0435\u0441\u0441\u0438\u0432\u043D\u0430\u044F"}));
		comboBox_1.setBounds(259, 128, 225, 27);
		frame.getContentPane().add(comboBox_1);
	}
}
