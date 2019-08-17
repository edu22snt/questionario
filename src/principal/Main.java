package principal;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.QuestionarioView;

/**
 * @author eduardo.andrade
 * @since 07/08/2019
 */
public class Main {

	public static void main(String[] args) {	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				QuestionarioView thisClass = new QuestionarioView();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});

	}

}
