import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
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
import java.awt.SystemColor;

public class Frame1 {

	private JFrame frame;
	private JTextArea textArea;
 
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initialize() {
		Font for_label=new Font ("Tahoma", Font.PLAIN, 20);
		Font for_text=new Font ("Dialog", Font.PLAIN, 16);

		frame = new JFrame();
		frame.setFont(for_label);
		frame.setTitle("Расчёт памяти для камер видеонаблюдения");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] label_name = {"Высота", "Ширина", "Глубина цвета", "FPS", "Формат", "Развёртка", "Количество камер", "Часов в день", "Количество дней"};
		JLabel[] labels = new JLabel[9];
        for (int i = 0; i < 9; i++) {
        	labels[i] = new JLabel();
        	labels[i].setText(label_name[i]);
        	labels[i].setHorizontalAlignment(SwingConstants.RIGHT);
        	labels[i].setFont(for_label);
        	labels[i].setBounds(10, 20+35*i, 225, 25);
        	frame.getContentPane().add(labels[i]);
        }
		/*
		JLabel label_1 = new JLabel("Ширина");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(for_label);
		label_1.setBounds(10, 55, 225, 25);
		frame.getContentPane().add(label_1);
		
		JLabel label_7 = new JLabel("Глубина цвета");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(for_label);
		label_7.setBounds(10, 90, 225, 25);
		frame.getContentPane().add(label_7);
			
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
		
		JLabel label_4 = new JLabel("Часов в день");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(for_label);
		label_4.setBounds(10, 265, 225, 25);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Количество дней");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(for_label);
		label_5.setBounds(10, 300, 225, 25);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Итог");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(for_label);
		label_6.setBounds(10, 425, 225, 50);
		frame.getContentPane().add(label_6);
				
		JLabel label_8 = new JLabel("FPS");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(for_label);
		label_8.setBounds(10, 126, 225, 25);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Количество камер");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(for_label);
		label_9.setBounds(10, 230, 225, 25);
		frame.getContentPane().add(label_9);
		*/
        String[] text_name = {"1050", "1680", "20", "1", "1"};
        int[] y_position_fields = {20, 55, 125, 230, 300};
        JTextField[] textFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
        	textFields[i]= new JTextField();  
        	textFields[i].setText(text_name[i]);
        	textFields[i].setFont(for_text);
        	textFields[i].setBounds(250, y_position_fields[i], 225, 25);
        	frame.getContentPane().add(textFields[i]);
        	textFields[i].setColumns(10);
        	textFields[i].addKeyListener(new KeyAdapter() {
 			   public void keyTyped(KeyEvent e) {
 			      char c = e.getKeyChar();
 			      if ( ((c < '0') || (c > '9'))) {
 			         e.consume(); 
 			      }
 			   }
 			});
        }
        /*
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
		textField_2 = new JTextField("1");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(for_text);
		textField_2.setBounds(250, 300, 225, 25);
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
		textField_4 = new JTextField("20");
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setFont(for_text);
		textField_4.setColumns(10);
		textField_4.setBounds(250, 124, 225, 25);
		frame.getContentPane().add(textField_4);
				
		textField_3 = new JTextField("1");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(for_text);
		textField_3.setColumns(10);
		textField_3.setBounds(250, 231, 225, 25);
		frame.getContentPane().add(textField_3);
		*/
        double[] form_value = {0.769, 0.37, 0.333, 0.222, 0.149, 0.133, 0.132, 0.116, 0.11, 0.1, 0.065, 0.065, 0.047, 0.043, 0.04};
        String[] form_name = {"HDCAM SR HQ", "HDCAM SR SQ", "Pure YCbCr 4:2:2", "Prores444", "Prores422", "REDCODE 42 Codec", "PEG2000 250Mbps for 2Kp24", "DVCPRO HD 4:2:2 Y'CbCr", "REDCODE 36 Codec", "REDCODE 28 Codec", "JPEG2000 250Mbps for 2Kp48", "MPEG2 High", "DVD MPEG2", "BluRay H.264", "DVCPRO50"};
        float[] razv_value = {1, (float) 0.5};
        String[] razv_name = {"Прогрессивный", "Чересстрочный"};
        int[] deep_value = {8, 10, 12, 16, 24, 30, 36};
        String[] deep_name = {"RAW 8bit", "RAW 10bit", "RAW 12bit", "RAW 16bit", "RGB 3x8bit", "RGB 3x10bit", "RGB 3x12bit"};
        int[] y_position_boxes = {90, 160, 195};

		JComboBox[] ComboBoxes = new JComboBox[3];
        for (int i = 0; i < 3; i++) {
        	ComboBoxes[i] = new JComboBox<Object>();
        	ComboBoxes[i].setFont(for_text);
        	if(i==0) {
        		for (int j = 0; j < 7; j++) {
        	        ComboBoxes[i].addItem(new Item(deep_value[j], deep_name[j]));
        		}
        	}
        	if(i==1) {
        		for (int j = 0; j < 2; j++) {
                    ComboBoxes[i].addItem(new Item(razv_value[j], razv_name[j]));
        		}
            }
        	if(i==2) {
        		for (int j = 0; j < 14; j++) {
        			ComboBoxes[i].addItem(new Item(form_value[j], form_name[j]));
        		}
        	}
        	ComboBoxes[i].setBounds(250, y_position_boxes[i], 225, 25);
        	frame.getContentPane().add(ComboBoxes[i]);
        }    
        /*
		JComboBox<Object> comboBox = new JComboBox<>();
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
		*/
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 24, 1));
		spinner_1.setFont(for_text);
		spinner_1.setBounds(250, 265, 225, 25);
		frame.getContentPane().add(spinner_1);
		((JSpinner.DefaultEditor)spinner_1.getEditor()).getTextField().setEditable(false);
		((JSpinner.DefaultEditor)spinner_1.getEditor()).getTextField().setHorizontalAlignment(SwingConstants.LEFT);
	
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setColumns(1);
		textArea.setEditable(false);
		textArea.setFont(for_text);
		textArea.setBounds(250, 345, 225, 130);
		textArea.setBorder(BorderFactory.createLoweredBevelBorder());
		frame.getContentPane().add(textArea);
		textArea.setRows(6);
				
		/*
		JComboBox<Object> comboBox_1 = new JComboBox<>();
		comboBox_1.setFont(for_text);
		comboBox_1.addItem(new Item (0.5, "Чересстрочный"));
		comboBox_1.addItem(new Item (1, "Прогрессивный"));
		comboBox_1.setBounds(250, 195, 225, 25);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox<Object> comboBox_2 = new JComboBox<>();
		comboBox_2.setFont(for_text);
		comboBox_2.addItem(new Item (8, "RAW 8bit"));
		comboBox_2.addItem(new Item (10, "RAW 10bit"));
		comboBox_2.addItem(new Item (12, "RAW 12bit"));
		comboBox_2.addItem(new Item (16, "RAW 16bit"));
		comboBox_2.addItem(new Item (24, "RGB 3x8bit"));
		comboBox_2.addItem(new Item (30,"RGB 3x10bit"));
		comboBox_2.addItem(new Item (36, "RGB 3x12bit"));
		comboBox_2.setBounds(250, 90, 225, 25);
		frame.getContentPane().add(comboBox_2);
		*/		
		JButton button = new JButton();
		button.setIcon(new ImageIcon("D:\\Users\\winte\\Documents\\GitHub\\-\\Calc\\src\\images\\button.png"));
		button.setForeground(SystemColor.menu);
		button.setFont(for_label);
		button.setBounds(62, 345, 130, 130);
		frame.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int h = Integer.parseInt(textFields[0].getText());
				int w = Integer.parseInt(textFields[1].getText());
				double deep = ((Item) ComboBoxes[0].getSelectedItem()).getvalue();
				int fps = Integer.parseInt(textFields[2].getText());
				int hours = (Integer) spinner_1.getValue();
				double form = ((Item) ComboBoxes[1].getSelectedItem()).getvalue();
				double razv = ((Item) ComboBoxes[2].getSelectedItem()).getvalue();
				int cam = Integer.parseInt(textFields[3].getText());
				int days = Integer.parseInt(textFields[4].getText());
				end_calc(h,w,deep,fps,form,razv,cam,hours,days);
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
		 public double getvalue() {
			 return value;
		 }
	}

	public void end_calc(int h, int w, double deep, int fps, double form, double razv,int cam, int hours, int days) {
		Double answer = (h*w*deep*fps*form*razv*cam*3600*hours*days);
	
		int[] del = {8, 1000, 1000, 1000, 1000};
		String[] name = {"B/hr", "KB/hr", "MB/hr", "GB/h", "TB/hr"};
		
		textArea.setText(String.format("%.4f",answer)+" bit/h");
		for(int i = 0; i < 5; i++){
			answer = answer/del[i];
			if (answer>=0.0001)	{textArea.append("\n" +String.format("%.4f",answer)+ " " +name[i]);}
			else if (answer>=0.00001) {textArea.append("\n" +String.format("%.5f",answer)+ " " +name[i]);}
			else if (answer>=0.000001) {textArea.append("\n" +String.format("%.6f",answer)+ " " +name[i]);}
			else if (answer>=0.0000001) {textArea.append("\n" +String.format("%.7f",answer)+ " " +name[i]);}
			else if (answer>=0.00000001) {textArea.append("\n" +String.format("%.8f",answer)+ " " +name[i]);}
			else if (answer>=0.000000001) {textArea.append("\n" +String.format("%.9f",answer)+ " " +name[i]);}
			}
	}
	}