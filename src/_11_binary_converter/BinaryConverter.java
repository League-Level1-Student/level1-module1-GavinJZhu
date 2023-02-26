package _11_binary_converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryConverter implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton();
    JTextField answer = new JTextField(20);
    JButton reset = new JButton();
    JLabel label = new JLabel();

    public void main() {
        frame.add(panel);
        panel.add(answer);
        panel.add(button);
        panel.add(reset);
        frame.setVisible(true);
        button.setText("Convert");
        reset.setText("Reset Text");
        frame.pack();
        button.addActionListener(this);
        reset.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 if(e.getSource()==button) {
	 label.setText(label.getText()+convert(answer.getText()));
 	panel.add(label);
 	frame.add(panel);
 	frame.pack();
 }
    	if(e.getSource()==reset) {
    		label.setText(" ");
    	}
    }

    String convert(String input) {
        if (input.length() != 8) {
            JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
            return "-";
        }
        String binary = "[0-1]+";//must contain numbers in the given range
        if (!input.matches(binary)) {
            JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
            return "-";
        }
        try {
            int asciiValue = Integer.parseInt(input, 2);
            char theLetter = (char) asciiValue;
            return "" + theLetter;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
            return "-";
        }
    }
}
