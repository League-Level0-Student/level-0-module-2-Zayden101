package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollcost {
	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("how tall are you");
		int x = Integer.parseInt(a);
		if (x > 1) {
			JOptionPane.showMessageDialog(null, "you are to tall, you will hit your head and get a concusen");
		} else {
			JOptionPane.showMessageDialog(null, "you are safe");
		}

	}
}
