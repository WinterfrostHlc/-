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
	private JTextField textField_4;
	private JTextField textField_5;
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
		frame.setTitle("Расчёт памяти для камер видеонаблюдения");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField("1050");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(for_text);
		textField.setBounds(250, 20, 225, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume(); 
			      }
			   }
			});
				
		JLabel label = new JLabel("Высота");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(for_label);
		label.setBounds(10, 20, 225, 25);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Ширина");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(for_label);
		label_1.setBounds(10, 55, 225, 25);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField("1680");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setFont(for_text);
		textField_1.setBounds(250, 55, 225, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();
			      }
			   }
			});
		
		JComboBox comboBox = new JComboBox<>();
		comboBox.setFont(for_text);
		comboBox.addItem(new Item (0.769, "HDCAM SR HQ"));
		comboBox.addItem(new Item (0.37, "HDCAM SR SQ"));
		comboBox.addItem(new Item (0.333, "Pure YCbCr 4:2:2 "));
		comboBox.addItem(new Item (0.222, "Prores444"));
		comboBox.addItem(new Item (0.149, "Prores422"));
		comboBox.addItem(new Item (0.133, "REDCODE 42 Codec"));
		comboBox.addItem(new Item (0.132, "PEG2000 250Mbps for 2Kp24"));
		comboBox.addItem(new Item (0.116,"DVCPRO HD 4:2:2 Y'CbCr"));
		comboBox.addItem(new Item (0.11, "REDCODE 36 Codec"));
		comboBox.addItem(new Item (0.1, "REDCODE 28 Codec"));
		comboBox.addItem(new Item (0.065, "JPEG2000 250Mbps for 2Kp48"));
		comboBox.addItem(new Item (0.065, "MPEG2 High"));
		comboBox.addItem(new Item (0.047, "DVD MPEG2"));
		comboBox.addItem(new Item (0.043, "BluRay H.264 "));
		comboBox.addItem(new Item (0.04,"DVCPRO50"));
		comboBox.setBounds(250, 160, 225, 25);
		frame.getContentPane().add(comboBox);
				
		JLabel label_2 = new JLabel("Формат");
		label_2.setFont(for_label);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 160, 225, 25);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Развёртка");
		label_3.setFont(for_label);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 195, 225, 25);
		frame.getContentPane().add(label_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(12, 0, 24, 1));
		spinner_1.setFont(for_text);
		spinner_1.setBounds(250, 230, 225, 25);
		frame.getContentPane().add(spinner_1);
		((JSpinner.DefaultEditor)spinner_1.getEditor()).getTextField().addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume();
			      };
			   };
		});
		
		JLabel label_4 = new JLabel("Часов в день");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(for_label);
		label_4.setBounds(10, 230, 225, 25);
		frame.getContentPane().add(label_4);
		
		textField_2 = new JTextField("1");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(for_text);
		textField_2.setBounds(250, 265, 225, 25);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume(); 
			      }
			   }
			});

		JLabel label_5 = new JLabel("Количество дней");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(for_label);
		label_5.setBounds(10, 265, 225, 25);
		frame.getContentPane().add(label_5);
		
		JButton button = new JButton("Расчитать");
		button.setFont(for_label);
		button.setBounds(10, 301, 474, 50);
		frame.getContentPane().add(button);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(for_text);
		textField_3.setBounds(250, 361, 225, 50);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))) {
			         e.consume(); 
			      }
			   }
			});
		
		JLabel label_6 = new JLabel("Итог");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(for_label);
		label_6.setBounds(10, 361, 225, 50);
		frame.getContentPane().add(label_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(for_text);
		comboBox_1.addItem(new Item (0.5, "Чересстрочный"));
		comboBox_1.addItem(new Item (1, "Прогрессивный"));
		comboBox_1.setBounds(250, 195, 225, 25);
		frame.getContentPane().add(comboBox_1);
		
		JLabel label_7 = new JLabel("Глубина цвета");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(for_label);
		label_7.setBounds(10, 90, 225, 25);
		frame.getContentPane().add(label_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(for_text);
		comboBox_2.addItem(new Item (8, "RAW 8bit"));
		comboBox_2.addItem(new Item (10, "RAW 10bit"));
		comboBox_2.addItem(new Item (12, "RAW 12bit"));
		comboBox_2.addItem(new Item (16, "RAW 16bit"));
		comboBox_2.addItem(new Item (24, "RGB 3x8bit"));
		comboBox_2.addItem(new Item (30,"RGB 3x10bit"));
		comboBox_2.addItem(new Item (36, "RGB 3x12bit"));
		frame.getContentPane().add(comboBox_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setFont(for_text);
		textField_4.setColumns(10);
		textField_4.setBounds(250, 124, 225, 25);
		frame.getContentPane().add(textField_4);
		
		JLabel label_8 = new JLabel("FPS");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(for_label);
		label_8.setBounds(10, 126, 225, 25);
		frame.getContentPane().add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setFont(for_text);
		textField_5.setColumns(10);
		textField_5.setBounds(250, 90, 225, 25);
		frame.getContentPane().add(textField_5);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int h = Integer.parseInt(textField.getText());
				int w = Integer.parseInt(textField_1.getText());
				int deep = Integer.parseInt(textField_5.getText());
				int fps = Integer.parseInt(textField_4.getText());
				try {
				    spinner_1.commitEdit();
				} catch ( java.text.ParseException e ) { }
				int hours = (Integer) spinner_1.getValue();
				//double form = ; комбобоксы
				//float razv = ;
				int days = Integer.parseInt(textField_2.getText());
				textField_3.setText(end_calc(h,w,deep,fps,form,razv,hours,days));
			}
		});
		
	};
	public class Item {		
		double value;
		String Name;
		 public Item(double value, String Name)
		    {
		        this.value = value;
		        this.Name = Name;
		    }
		 @Override
		    public String toString()
		    {
		        return Name;
		    }
	}

	public String end_calc(int h, int w, int deep, int fps, double form, float razv, int hours, int days) {
		Double summbit, summbyte = null;
		summbit = (w*h*deep*fps*form*razv*3600*hours*days);
		String answer = summbit.toString()+"bit/h";
		if(summbit>8){
			answer = answer + " - "	+ summbit/8 + "B/h";
			summbyte = summbit/8;
		}
				if(summbyte>8){
			answer = answer	+ " - "	+ summbyte/1000 + "KB/h";
			
		}
		return answer;
	}
	}