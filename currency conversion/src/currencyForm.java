import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class currencyForm extends JFrame {

	
public currencyForm () 	{
	
	
	
	setSize(600,600);
    setDefaultCloseOperation(3);
    setLocationRelativeTo(null);
    setResizable(false);
    setLayout(null);
    
    
    Font font = ((new Font("Arial",Font.BOLD,35)));
  
    
    JPanel p1 = new JPanel();
    p1.setBounds(0, 0, 600, 80);
    p1.setBackground( new Color(225,255,0) );
    p1.setLayout(null);
    
    
    JLabel label1 = new JLabel("tem Converter");
    label1.setBounds(150,0,500,80);
    label1.setFont(font);
    label1.setLayout(null);
    p1.add(label1);
    add(p1);
    
    
   
    JPanel p2 = new JPanel();
    p2.setBounds(0,80,600,620);
    p2.setBackground(new Color(255,255,204));
    p2.setLayout(null);
    add(p2);
    
    JLabel Address = new JLabel("Input:", JLabel.RIGHT);
	Address.setFont(font);
	Address.setBounds(50,120,20,30);
	p2.add(Address);
	add(p2);
	
	JTextField text1 = new JTextField();
	text1.setFont(font);
	text1.setBounds(80,120,100,50);
	p2.add(Address);
	p2.add(text1);
	
	
	 JLabel output = new JLabel("Output:", JLabel.RIGHT);
		output.setFont(font);
		output.setBounds(20,180,130,70);
		p2.add(output);
		add(p2);
		
		JTextField text2 = new JTextField();
		text2.setFont(font);
		text2.setBounds(160,180,200,50);
		p2.add(output);
		p2.add(text2);
    
		
	
		JButton indbtn = new JButton("IND");
		indbtn.setBounds(20,200,120,50);
		indbtn.setFont(font);
		p2.add(indbtn);
		
		indbtn.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String  s =	text1.getText();
			double x =Double.valueOf(s);
			x=x*0.86;
			s= String.valueOf(x);
			text2.setText(s);
				
			}
		});

		JButton usabtn = new JButton("USA");
		usabtn.setBounds(50,200,120,50);
		usabtn.setFont(font);
		p2.add(usabtn);
		
        usabtn.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String  s =	text1.getText();
			double x =Double.valueOf(s);
			x=x*0.012;
			s= String.valueOf(x);
			text2.setText(s);
		
			}
		});
		
		JButton ausbtn = new JButton("AUS");
		ausbtn.setBounds(280,200,120,50);
		ausbtn.setFont(font);
		p2.add(ausbtn);
		
		
		 ausbtn.addActionListener(new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e) {
				String  s =	text1.getText();
				double x =Double.valueOf(s);
				x=x*0.016;
				s= String.valueOf(x);
				text2.setText(s);
			
				}
			});
		
		
		  

JLabel l1 = new JLabel("Input:", JLabel.RIGHT);
l1.setFont(font);
l1.setBounds(50,250,100,70);
p2.add(l1);
add(p2);

JTextField text3 = new JTextField();
text3.setFont(font);
text3.setBounds(160,250,200,50);
p2.add(l1);
p2.add(text3);


 JLabel l2 = new JLabel("Output:", JLabel.RIGHT);
	l2.setFont(font);
	l2.setBounds(20,90,250,70);
	p2.add(l2);
	add(p2);
	
	JTextField text4 = new JTextField();
	text4.setFont(font);
	text4.setBounds(160,100,250,50);
	p2.add(output);
	p2.add(text4);

	

	JButton btn5 = new JButton("IND");
	btn5.setBounds(20,200,120,50);
	btn5.setFont(font);
	p2.add(btn5);
	
	indbtn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
		String  s =	text1.getText();
		double x =Double.valueOf(s);
		x=x*0.86;
		s= String.valueOf(x);
		text2.setText(s);
			
		}
	});

	JButton btn4 = new JButton("USA");
	btn4.setBounds(150,200,120,50);
	btn4.setFont(font);
	p2.add(btn4);
	
    usabtn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
		String  s =	text1.getText();
		double x =Double.valueOf(s);
		x=x*0.012;
		s= String.valueOf(x);
		text2.setText(s);
	
		}
	});
	
	JButton btn7 = new JButton("AUS");
	btn7.setBounds(280,200,120,50);
	btn7.setFont(font);
	p2.add(btn7);
	
	
	 ausbtn.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String  s =	text1.getText();
			double x =Double.valueOf(s);
			x=x*0.016;
			s= String.valueOf(x);
			text2.setText(s);
		
			}
		});
	
	
	setVisible(true);
	
	}
}   
	

