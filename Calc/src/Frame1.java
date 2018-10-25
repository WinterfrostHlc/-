import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;


public class Frame1 {

	private JFrame frame;
	private static JTextField textField;
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
	};
	
	public Frame1() {
		initialize();
	}

	public void initialize() {
		Font for_label=new Font ("Tahoma", Font.PLAIN, 20);
		Font for_text=new Font ("Dialog", Font.PLAIN, 16);

		frame = new JFrame();
		frame.setFont(for_label);
		frame.setTitle("Калькулятор памяти для камер видеонаблюдения");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(for_text);
		textField.setBounds(250, 20, 225, 25);
		frame.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();  // игнорим введенные буквы и пробел
			      }
			   }
			});
				
		
		JLabel label = new JLabel("Высота");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(for_label);
		label.setBounds(10, 20, 225, 25);
		frame.add(label);
		
		JLabel label_1 = new JLabel("Ширина");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(for_label);
		label_1.setBounds(10, 55, 225, 25);
		frame.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(for_text);
		textField_1.setBounds(250, 55, 225, 25);
		frame.add(textField_1);
		textField_1.setColumns(10);
		textField_1.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();  // игнорим введенные буквы и пробел
			      }
			   }
			});
		
		JComboBox comboBox = new JComboBox<>();
		comboBox.setFont(for_text);
		comboBox.addItem("HDCAM SR HQ");
		comboBox.addItem("HDCAM SR SQ");
		comboBox.addItem("Pure YCbCr 4:2:2 ");
		comboBox.addItem("Prores444");
		comboBox.addItem("Prores422");
		comboBox.addItem("REDCODE 42 Codec");
		comboBox.addItem("PEG2000 250Mbps for 2Kp24");
		comboBox.addItem("DVCPRO HD 4:2:2 Y'CbCr");
		comboBox.addItem("REDCODE 36 Codec");
		comboBox.addItem("REDCODE 28 Codec");
		comboBox.addItem("JPEG2000 250Mbps for 2Kp48");
		comboBox.addItem("MPEG2 High");
		comboBox.addItem("DVD MPEG2");
		comboBox.addItem("BluRay H.264 ");
		comboBox.addItem("DVCPRO50");
		comboBox.setBounds(250, 125, 225, 25);
		frame.getContentPane().add(comboBox);
				
		JLabel label_2 = new JLabel("Формат сжатия");
		label_2.setFont(for_label);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 125, 225, 25);
		frame.add(label_2);
		
		JLabel label_3 = new JLabel("Развёртка");
		label_3.setFont(for_label);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 160, 225, 25);
		frame.add(label_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(12, 0, 24, 1));
		spinner_1.setFont(for_text);
		spinner_1.setBounds(250, 195, 225, 25);
		frame.add(spinner_1);
		
		JLabel label_4 = new JLabel("Часов в день");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(for_label);
		label_4.setBounds(10, 195, 225, 25);
		frame.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(for_text);
		textField_2.setBounds(250, 230, 225, 25);
		frame.add(textField_2);
		textField_2.setColumns(10);
		textField_2.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();  // игнорим введенные буквы и пробел
			      }
			   }
			});
		
		JLabel label_5 = new JLabel("Количество дней");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(for_label);
		label_5.setBounds(10, 230, 225, 25);
		frame.add(label_5);
		
		JButton button = new JButton("Посчитать");
		button.setFont(for_label);
		button.setBounds(10, 290, 474, 50);
		frame.add(button);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(for_text);
		textField_3.setBounds(250, 350, 225, 50);
		frame.add(textField_3);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();  // игнорим введенные буквы и пробел
			      }
			   }
			});
		
		JLabel label_6 = new JLabel("Итого");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(for_label);
		label_6.setBounds(10, 350, 225, 50);
		frame.add(label_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(for_text);
		comboBox_1.addItem("Чересстрочная");
		comboBox_1.addItem("Прогрессивная");
		comboBox_1.setBounds(250, 160, 225, 25);
		frame.add(comboBox_1);
		
		JLabel label_7 = new JLabel("Глубина цвета");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(for_label);
		label_7.setBounds(10, 90, 225, 25);
		frame.add(label_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(for_text);
		comboBox_2.addItem("RAW 8bit");
		comboBox_2.addItem("RAW 12bit");
		comboBox_2.addItem("RAW 16bit");
		comboBox_2.addItem("RGB 3x8bit");
		comboBox_2.addItem("RGB 3x8bit");
		comboBox_2.addItem("RGB 3x10bit");
		comboBox_2.addItem("RGB 3x12bit");
		comboBox_2.setBounds(250, 90, 225, 25);
		frame.add(comboBox_2);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int h = Integer.parseInt(textField.getText());
				int w = Integer.parseInt(textField_1.getText());
		//		float razv = ComboItem(null, razv);
				int days = Integer.parseInt(textField_2.getText());
						try {
				    spinner_1.commitEdit();
				} catch ( java.text.ParseException e ) { }
				int hours = (Integer) spinner_1.getValue();
				textField_3.setText(end_calc(w,h,1,1,8,days,hours));
			}
		});
		
	};
	//  public float ComboItem(String key, float value)
	//    {
	//        return value;
	//   }


	public String end_calc(int w, int h, float form, float razv, int deep, int days, int hours) {
		Float summ = (w*h*form*razv*deep*days*hours);
		return summ.toString();
	}
	}
