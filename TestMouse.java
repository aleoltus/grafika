import java.awt.EventQueue;

import javax.swing.JFrame;

public class TestMouse extends JFrame{
	public TestMouse() {
		super("MouseTest");
		add(new MouseTestPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TestMouse();
			}
		});
	}

}
