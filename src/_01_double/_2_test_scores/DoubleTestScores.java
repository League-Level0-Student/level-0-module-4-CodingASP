package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class DoubleTestScores {

	String score = JOptionPane.showInputDialog("Enter a test score that has a decimal");
	int number = Integer.parseInt(score);
	
	if (number > 100) {
	JOptionPane.showMessageDialog(null, "Outstanding!");
	//ask for help next class
	}
}
}


	
