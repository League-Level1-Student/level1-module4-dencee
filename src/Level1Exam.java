import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton yellowButton = new JButton();
	private JButton redButton = new JButton();
	private JButton blueButton = new JButton();
	private JButton greenButton = new JButton();
	
	public static void main(String[] args) {
		new Level1Exam().setUp();
	}
	
	private void setUp() {
		addButton(yellowButton, Color.YELLOW);
		addButton(redButton, Color.RED);
		addButton(blueButton, Color.BLUE);
		addButton(greenButton, Color.GREEN);
		frame.add(panel);
		frame.setTitle("Color Teacher");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	private void addButton(JButton button, Color color) {
		button.setPreferredSize(new Dimension(100, 50));
		button.setOpaque(true);
		button.setBackground(color);
		button.addActionListener(this);
		panel.add(button);
	}

	void speak(String words) {
		System.out.println(words);
/*
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton whichOne = (JButton) e.getSource();
		if (whichOne == yellowButton) {
			speak("yellow");
		} else
		if (whichOne == redButton) {
			speak("red");
		} else
		if (whichOne == blueButton) {
			speak("blue");
		} else
		if (whichOne == greenButton) {
			speak("green");
		}
	}

}
