package edu.TabbedDemo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JTabbedPaneDemo {
	JTabbedPane jp;
	JTextField jt;
	JPanel c;
	JFrame jf;
	JTabbedPaneDemo()
	{
		jp = new JTabbedPane();
		//HEADING
		jp.add("sis", new SisPanel());
		jp.add("radio", new ColorPanel());
		c = new JPanel();
		//FLOWLAYOUT = LEFT TO RIGHT
		c.setLayout(new FlowLayout());
		c.add(jp);
		jf = new JFrame();
		jf.add(c);
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JTabbedPaneDemo();
	}
}

class SisPanel extends JPanel {
	JComboBox jc;
	SisPanel(){
		jc =  new JComboBox();
		jc.addItem("abc");
		jc.addItem("pqr");
		jc.addItem("xyz");
		add(jc);
	}
}

class ColorPanel extends JPanel {
	
	JRadioButton r1, r2, r3, r4;
	ButtonGroup bg;
	ColorPanel(){
		r1 = new JRadioButton("A");
		r2 = new JRadioButton("B");
		r3 = new JRadioButton("C");
		r4 = new JRadioButton("D");
		bg =  new ButtonGroup(); //BUTTONGROUP IS FOR SELECTING ONLY ONE OPTION
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		
	}

	
}
