package _07_duck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner implements ActionListener{
public static void main(String[] args) {
	new Runner().run();
}
JButton doggoWoof = new JButton();
JButton doggoWalk = new JButton();
JButton duckQuack = new JButton();
JButton duckWaddle = new JButton();
Duck daffy = new Duck("donuts",69420);
Dog doggo = new Dog("David",3);	
public void run() {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	frame.add(panel);
	panel.add(doggoWalk);
	panel.add(doggoWoof);
	panel.add(duckQuack);
	panel.add(duckWaddle);
	doggoWalk.setText("BArk");
	doggoWoof.setText("Woof!");
	duckQuack.setText("Quack");
	duckWaddle.setText("Waddle");
	doggoWalk.addActionListener(this);
	doggoWoof.addActionListener(this);
	duckQuack.addActionListener(this);
	duckWaddle.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if (buttonPressed == doggoWalk) {
		doggo.bark();
	}
	else if (buttonPressed == doggoWoof) {
		doggo.woof();
	}
	else if (buttonPressed == duckQuack) {
		daffy.quack();
	}
	else if (buttonPressed == duckWaddle) {
		daffy.waddle();
	}
	
	
}
}
