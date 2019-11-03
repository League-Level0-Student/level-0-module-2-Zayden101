import javax.swing.JOptionPane;

public class votboth {
public static void main(String[] args) {
	
	
	
	String a = JOptionPane.showInputDialog("how old are you");
	int x = Integer.parseInt(a);
	if (x > 5) {
		JOptionPane.showMessageDialog(null, "you are to old, you will die befor you can vote");
	} else {
		JOptionPane.showMessageDialog(null, "you can  vote");
	
	
	}
}
}
