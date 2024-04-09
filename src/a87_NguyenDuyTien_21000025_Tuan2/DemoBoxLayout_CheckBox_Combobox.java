package a87_NguyenDuyTien_21000025_Tuan2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DemoBoxLayout_CheckBox_Combobox extends JFrame {
	public DemoBoxLayout_CheckBox_Combobox() {
		setTitle("DemoLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,250);
		setLocationRelativeTo(null);
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		p1.add(new JLabel("CheckBox: "));
		p1.add(new JCheckBox());
		p2.add(new JLabel("Combobox: "));
		Object E[] = {"Class 1","Class 2","Class 3", "Class 4"};
		p2.add(new JComboBox<>(E));
		p.add(Box.createRigidArea(new Dimension(10,10)));
		p.add(p1);
		p.add(Box.createRigidArea(new Dimension(10,10)));
		p.add(p2);
		this.add(p,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new DemoBoxLayout_CheckBox_Combobox().setVisible(true);
	}
}
