//Package or folder for all types of code in this project
package calculator;
//main impports needed
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Main class
public class Calculator implements ActionListener {
	
	// Main java GUI components 
	// Main window
	JFrame frame;
	//textfield
	JTextField textfield;
	// buttons 0-9
	JButton[] numberButtons = new JButton[10];
	//fucntion buttons
	JButton[] fucntuonButtons = new JButton[8];
	// adding buttons
	JButton addButton, subButton, mulButtom, divButton;
	JButton decButton, equButton, delButton, clrButton;
	// main panel
	JPanel panel;
	
	//creating font object
	Font myFont = new Font("Arial", Font.BOLD, 30);
	
	// initilizing the main numbers as doubles and the result 
	double num1=0,num2=0, reuslt = 0;
	
	// operaters var
	char operator;
	
	
	
// constructor 
	Calculator() {
		// TODO Auto-generated constructor stub
		
		// frame title
		frame = new JFrame("Calculator");
		
		// Closes app when winoow is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting gui size
		frame.setSize(420, 550);
		
		// new text field
		textfield = new JTextField();
		
		//setting sixe of textfield
		textfield.setBounds(50,25,300,50);
		
		//setting textfield font
		textfield.setFont(myFont);
		
		//limit func
		textfield.setEditable(false);
		
		
		// adding buttons
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButtom = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		
		fucntuonButtons[0] = addButton;
		fucntuonButtons[1] = subButton;
		fucntuonButtons[2] = mulButtom;
		fucntuonButtons[3] = divButton;
		fucntuonButtons[4] = decButton;
		fucntuonButtons[5] = equButton;
		fucntuonButtons[6] = delButton;
		fucntuonButtons[7] = clrButton;
		
		// sets font and cleans up buttons
		for (int i = 0; i < 8; i ++) {
			fucntuonButtons[i].addActionListener(this);
			fucntuonButtons[i].setFont(myFont);
			fucntuonButtons[i].setFocusable(false);
			
			
		}
		
		// sets font and cleans up buttons
				for (int i = 0; i < 10; i ++) {
					numberButtons[i] = new JButton(String.valueOf(i));
					numberButtons[i].addActionListener(this);
					numberButtons[i].setFont(myFont);
					numberButtons[i].setFocusable(false);
					
				}
				
		delButton.setBounds(50,430,145,50);
		clrButton.setBounds(205,430,145,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButtom);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		
		
		
		frame.add(panel);
		
		
		//adding delete and clear button
		frame.add(delButton);
		frame.add(clrButton);
		
		//adding textfield
		frame.add(textfield);
		
		// Visualziing the frame
		frame.setVisible(true);
	}
// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// empty constcrute call (instance of the class)
		Calculator calc = new Calculator();

	}
// Main method to handle button use in java
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 10; i ++) {
			if (e.getSource() == numberButtons[i]);{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
			if (e.getSource() == decButton);{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
			if (e.getSource() == addButton);{
				num1 = Double.parseDouble(textfield.getText());
				operator = '+';
				textfield.setText("");
			}
			
		}
	}


}