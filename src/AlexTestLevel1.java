import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AlexTestLevel1 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public void start() {
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.pack();
		frame.show();
		frame.setSize(500, 500);
		button.setBackground(Color.YELLOW);
		button.setOpaque(true);
		button.addActionListener(this);
		button2.setBackground(Color.RED);
		button2.setOpaque(true);
		button2.addActionListener(this);
		button3.setBackground(Color.BLUE);
		button3.setOpaque(true);
		button3.addActionListener(this);
		button4.setBackground(Color.GREEN);
		button4.setOpaque(true);
		button4.addActionListener(this);
	

	}

	
	public static void main(String[] args) {

	
		new AlexTestLevel1().start();
		
	}

	
	void speak(String words) {
		//			Runtime.getRuntime().exec("say"+ words);
		System.out.println(words);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if((JButton)e.getSource()==button) {
		speak("yellow");
		
	}
	if((JButton)e.getSource()==button2) {
		speak("red");
		
	}
	if((JButton)e.getSource()==button3) {
		speak("blue");
		
	}
	if((JButton)e.getSource()==button4) {
		speak("green");
		
	}
}
}