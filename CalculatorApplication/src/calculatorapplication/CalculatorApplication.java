package calculatorapplication;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

class CalculatorApplication implements ActionListener{
	
	double num1 =0, num2 = 0, result =0;
	int calculation;
	
	JFrame calculatorBody = new JFrame("Calculetor");
	JLabel label = new JLabel();
	JTextField textField = new JTextField();
	JRadioButton onRadioButton =new JRadioButton("on");
	JRadioButton offRadioButton =new JRadioButton("off");
	JButton buttonZero = new JButton("0");
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");
	JButton buttonThree = new JButton("3");
	JButton buttonFour = new JButton("4");
	JButton buttonFive = new JButton("5");
	JButton buttonSix = new JButton("6");
	JButton buttonSeven = new JButton("7");
	JButton buttonEight = new JButton("8");
	JButton buttonNine = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonClear = new JButton("C");
	JButton buttonDelete = new JButton("DEL");
	JButton buttonEqual = new JButton("=");
	JButton buttonMul = new JButton("X");
	JButton buttonDiv = new JButton("/");
	JButton buttonPlus = new JButton("+");
	JButton buttonMinus = new JButton("-");
	JButton buttonSquare = new JButton("x\u00B2");
	JButton buttonReciprocal = new JButton("1/x");
	JButton buttonSqrt = new JButton("\u221A");
	public CalculatorApplication() {
		prepareGui();
		addComponents();
		addActionEvent();
	}
	
	public void prepareGui(){
		
		calculatorBody.setSize(305,510);
		calculatorBody.getContentPane().setLayout(null);
		calculatorBody.getContentPane().setBackground(Color.black);
		calculatorBody.setLocationRelativeTo(null);
		calculatorBody.setVisible(true);
		calculatorBody.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void addComponents() {
		
		label.setBounds(250,0,50,50);
		label.setForeground(Color.white);
		calculatorBody.add(label);
		
		textField.setBounds(10,40,270,40);
		textField.setFont(new Font("Arial",Font.BOLD,20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		calculatorBody.add(textField);
		
		onRadioButton.setBounds(10,95,60,40);
		onRadioButton.setSelected(true);
		onRadioButton.setFont(new Font("Arail",Font.BOLD,14));
		onRadioButton.setBackground(Color.BLACK);
		onRadioButton.setForeground(Color.WHITE);
		onRadioButton.setFocusable(false);
		calculatorBody.add(onRadioButton);
		
		offRadioButton.setBounds(10,125,60,40);
		offRadioButton.setSelected(false);
		offRadioButton.setFont(new Font("Arail",Font.BOLD,14));
		offRadioButton.setBackground(Color.BLACK);
		offRadioButton.setForeground(Color.WHITE);
		offRadioButton.setFocusable(false);
		calculatorBody.add(offRadioButton);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(onRadioButton);
		buttonGroup.add(offRadioButton);
		
		buttonSeven.setBounds(10,230,60,40);
		buttonSeven.setFont(new Font("Arail",Font.BOLD,20));
		buttonSeven.setFocusable(false);
		calculatorBody.add(buttonSeven);
		
		buttonEight.setBounds(80,230,60,40);
		buttonEight.setFont(new Font("Arail",Font.BOLD,20));
		buttonEight.setFocusable(false);
		calculatorBody.add(buttonEight);
		
		buttonNine.setBounds(150,230,60,40);
		buttonNine.setFont(new Font("Arail",Font.BOLD,20));
		buttonNine.setFocusable(false);
		calculatorBody.add(buttonNine);
		
		buttonFour.setBounds(10,290,60,40);
		buttonFour.setFont(new Font("Arail",Font.BOLD,20));
		buttonFour.setFocusable(false);
		calculatorBody.add(buttonFour);
		
		buttonFive.setBounds(80,290,60,40);
		buttonFive.setFont(new Font("Arail",Font.BOLD,20));
		buttonFive.setFocusable(false);
		calculatorBody.add(buttonFive);
		
		buttonSix.setBounds(150,290,60,40);
		buttonSix.setFont(new Font("Arail",Font.BOLD,20));
		buttonSix.setFocusable(false);
		calculatorBody.add(buttonSix);
		
		buttonOne.setBounds(10,350,60,40);
		buttonOne.setFont(new Font("Arail",Font.BOLD,20));
		buttonOne.setFocusable(false);
		calculatorBody.add(buttonOne);
		
		buttonTwo.setBounds(80,350,60,40);
		buttonTwo.setFont(new Font("Arail",Font.BOLD,20));
		buttonTwo.setFocusable(false);
		calculatorBody.add(buttonTwo);
		
		buttonThree.setBounds(150,350,60,40);
		buttonThree.setFont(new Font("Arail",Font.BOLD,20));
		buttonThree.setFocusable(false);
		calculatorBody.add(buttonThree);
		
		buttonZero.setBounds(10,410,130,40);
		buttonZero.setFont(new Font("Arail",Font.BOLD,20));
		buttonZero.setFocusable(false);
		calculatorBody.add(buttonZero);
		
		buttonDot.setBounds(150,410,60,40);
		buttonDot.setFont(new Font("Arail",Font.BOLD,20));
		buttonDot.setFocusable(false);
		calculatorBody.add(buttonDot);
		
		buttonEqual.setBounds(220,350,60,100);
		buttonEqual.setFont(new Font("Arail",Font.BOLD,20));
		buttonEqual.setBackground(Color.CYAN);
		buttonEqual.setFocusable(false);
		calculatorBody.add(buttonEqual);
		
		buttonPlus.setBounds(220,290,60,40);
		buttonPlus.setFont(new Font("Arail",Font.BOLD,20));
		buttonPlus.setBackground(new Color(239,188,2));
		buttonPlus.setFocusable(false);
		calculatorBody.add(buttonPlus);
		
		buttonMinus.setBounds(220,230,60,40);
		buttonMinus.setFont(new Font("Arail",Font.BOLD,20));
		buttonMinus.setBackground(new Color(239,188,2));
		buttonMinus.setFocusable(false);
		calculatorBody.add(buttonMinus);
		
		buttonMul.setBounds(220,170,60,40);
		buttonMul.setFont(new Font("Arail",Font.BOLD,20));
		buttonMul.setBackground(new Color(239,188,2));
		buttonMul.setFocusable(false);
		calculatorBody.add(buttonMul);
		
		buttonDiv.setBounds(220,110,60,40);
		buttonDiv.setFont(new Font("Arail",Font.BOLD,20));
		buttonDiv.setBackground(new Color(239,188,2));
		buttonDiv.setFocusable(false);
		calculatorBody.add(buttonDiv);
		
		buttonSquare.setBounds(80,170,60,40);
		buttonSquare.setFont(new Font("Arail",Font.BOLD,20));
		buttonSquare.setBackground(Color.cyan);
		buttonSquare.setFocusable(false);
		calculatorBody.add(buttonSquare);
		
		buttonReciprocal.setBounds(150,170,60,40);
		buttonReciprocal.setFont(new Font("Arail",Font.BOLD,15));
		buttonReciprocal.setBackground(Color.CYAN);
		buttonReciprocal.setFocusable(false);
		calculatorBody.add(buttonReciprocal);
		
		buttonDelete.setBounds(150,110,60,40);
		buttonDelete.setFont(new Font("Arail",Font.BOLD,12));
		buttonDelete.setBackground(Color.red);
		buttonDelete.setForeground(Color.white);
		buttonDelete.setFocusable(false);
		calculatorBody.add(buttonDelete);
		
		buttonClear.setBounds(80,110,60,40);
		buttonClear.setFont(new Font("Arail",Font.BOLD,12));
		buttonClear.setBackground(Color.red);
		buttonClear.setForeground(Color.white);
		buttonClear.setFocusable(false);
		calculatorBody.add(buttonClear);
		
		buttonSqrt.setBounds(10,170,60,40);
		buttonSqrt.setFont(new Font("Arail",Font.BOLD,12));
		buttonSqrt.setBackground(Color.cyan);
		buttonSqrt.setFocusable(false);
		calculatorBody.add(buttonSqrt);
		
		
		

		
		
	}
	public static void main(String[] args) {
		
		CalculatorApplication Calculator = new CalculatorApplication();
	}

	
	public void addActionEvent() {
		onRadioButton.addActionListener(this);
		offRadioButton.addActionListener(this);
		buttonClear.addActionListener(this);	
		buttonDelete.addActionListener(this);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		buttonFive.addActionListener(this);
		buttonSix.addActionListener(this);
		buttonSeven.addActionListener(this);
		buttonEight.addActionListener(this);
		buttonNine.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonSquare.addActionListener(this);
		buttonReciprocal.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonSqrt.addActionListener(this);
		buttonZero.addActionListener(this);
		buttonDot.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == onRadioButton)
			enable();
		else if(source == offRadioButton) {
			disable();
		} 
		else if(source == buttonClear) {
			label.setText("");
			textField.setText("");
			num1 = 0;
		}
		else if(source == buttonDelete) {
			int length = textField.getText().length();
			int number = length - 1;
			if(length > 0) {
				StringBuilder back = new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				textField.setText(back.toString());
			}if(textField.getText().endsWith(""))
				label.setText("");
			
		}else if(source == buttonZero) {
			if(textField.getText().equals("0")) {
				return;
				}else {
					textField.setText(textField.getText()+"0");
				}
		}else if(source == buttonOne) {
			textField.setText(textField.getText()+"1");
		}
		else if(source == buttonTwo) {
			textField.setText(textField.getText()+"2");
		}
		else if(source == buttonThree) {
			textField.setText(textField.getText()+"3");
		}
		else if(source == buttonFour) {
			textField.setText(textField.getText()+"4");
		}
		else if(source == buttonFive) {
			textField.setText(textField.getText()+"5");
		}
		else if(source == buttonSix) {
			textField.setText(textField.getText()+"6");
		}
		else if(source == buttonSeven) {
			textField.setText(textField.getText()+"7");
		}
		else if(source == buttonEight) {
			textField.setText(textField.getText()+"8");
		}
		else if(source == buttonNine) {
			textField.setText(textField.getText()+"9");
		}
		else if(source == buttonDot) {
			if(textField.getText().contains(".")) {
				return;
			}else {
				textField.setText(textField.getText() + ".");
			}
		}else if(source ==buttonPlus) {
			String str = textField.getText();
			num1 = Double.parseDouble(textField.getText());
			calculation = 1;
			textField.setText("");
			label.setText(str+"+");
		}else if(source ==buttonMinus) {
			String str = textField.getText();
			num1 = Double.parseDouble(textField.getText());
			calculation = 2;
			textField.setText("");
			label.setText(str+"-");
		}else if(source ==buttonMul) {
			String str = textField.getText();
			num1 = Double.parseDouble(textField.getText());
			calculation = 3;
			textField.setText("");
			label.setText(str+"X");
		}else if(source ==buttonDiv) {
			String str = textField.getText();
			num1 = Double.parseDouble(textField.getText());
			calculation = 4;
			textField.setText("");
			label.setText(str+"/");
		}else if(source ==buttonSquare) {
			num1 = Double.parseDouble(textField.getText());
			double square = Math.pow(num1, 2);
			String str = Double.toString(square);
			if(str.endsWith(".0")) {
				
				textField.setText(str.replace(".0",""));
			}else {
				textField.setText(str);
			}
		}else if(source ==buttonSqrt) {
			num1 = Double.parseDouble(textField.getText());
			double sqrt = Math.sqrt(num1);
			String str = Double.toString(sqrt);
			if(str.endsWith(".0")) {
				
				textField.setText(str.replace(".0",""));
			}else {
				textField.setText(str);
			}
		}else if(source ==buttonReciprocal){
			num1 = Double.parseDouble(textField.getText());
			double reciprocal = 1/num1;
			String str = Double.toString(reciprocal);
			if(str.endsWith(".0")) {
				textField.setText(str.replace(".0",""));
			}else {
				textField.setText(str);
			}
		}else if(source ==buttonEqual) {
			num2 = Double.parseDouble(textField.getText());
			switch(calculation) {
				case 1:
					result = num1 + num2;
					break;
				case 2:
					result = num1 - num2;
					break;
				case 3:
					result = num1 * num2;
					break;
				case 4:
					result = num1 / num2;
					break;
				}
			String str = Double.toString(result);
			if(str.endsWith(".0")) {
				textField.setText(str.replace(".0",""));
				}else {
					textField.setText(str);
				}
				label.setText("");
				num1 = result;
		}
	}
	public void enable() {
		
		onRadioButton.setEnabled(false);
		offRadioButton.setEnabled(true);
		textField.setEditable(true);
		label.setEnabled(true);
		buttonClear.setEnabled(true);
		buttonDelete.setEnabled(true);
		buttonZero.setEnabled(true);
		buttonOne.setEnabled(true);
		buttonTwo.setEnabled(true);
		buttonThree.setEnabled(true);
		buttonFour.setEnabled(true);
		buttonFive.setEnabled(true);
		buttonSix.setEnabled(true);
		buttonSeven.setEnabled(true);
		buttonEight.setEnabled(true);
		buttonNine.setEnabled(true);
		buttonPlus.setEnabled(true);
		buttonMinus.setEnabled(true);
		buttonMul.setEnabled(true);
		buttonDiv.setEnabled(true);
		buttonEqual.setEnabled(true);
		buttonSquare.setEnabled(true);
		buttonReciprocal.setEnabled(true);
		buttonSqrt.setEnabled(true);
		buttonDot.setEnabled(true);
	}
	public void disable() {
		onRadioButton.setEnabled(true);
		offRadioButton.setEnabled(false);
		textField.setEditable(false);
		label.setEnabled(false);
		label.setText("");
		textField.setText("");
		buttonClear.setEnabled(false);
		buttonDelete.setEnabled(false);
		buttonZero.setEnabled(false);
		buttonOne.setEnabled(false);
		buttonTwo.setEnabled(false);
		buttonThree.setEnabled(false);
		buttonFour.setEnabled(false);
		buttonFive.setEnabled(false);
		buttonSix.setEnabled(false);
		buttonSeven.setEnabled(false);
		buttonEight.setEnabled(false);
		buttonNine.setEnabled(false);
		buttonPlus.setEnabled(false);
		buttonMinus.setEnabled(false);
		buttonMul.setEnabled(false);
		buttonDiv.setEnabled(false);
		buttonEqual.setEnabled(false);
		buttonSquare.setEnabled(false);
		buttonReciprocal.setEnabled(false);
		buttonSqrt.setEnabled(false);
		buttonDot.setEnabled(false);
	}
}