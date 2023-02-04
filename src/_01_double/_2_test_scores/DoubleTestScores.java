package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class DoubleTestScores {
	public static void main(String[] args) {

		String score = JOptionPane.showInputDialog("Enter a test score that has a decimal");
		double dnum = Double.parseDouble(score);

		if (dnum > 99.9) {
			JOptionPane.showMessageDialog(null, "Outstanding!");
		}
		else if (79.9 < dnum && dnum < 100) {
			JOptionPane.showMessageDialog(null, "Nice job!");
		}
		if (dnum <  80) {
			JOptionPane.showMessageDialog(null, "Try harder next time");
		
		}
	}
}
