package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;

public class Bai1 extends JFrame {
	private JButton btn;
	private BasicArrowButton up;
	private BasicArrowButton down;
	private BasicArrowButton right;
	private BasicArrowButton left;

	public Bai1() {
		setTitle("Types of buttons");
		setSize(300,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		btn = new JButton("JButton");
		add(btn);
		JToggleButton togg = new JToggleButton("JToggleButton");
		add(togg);
		JCheckBox cb = new JCheckBox();
		add(cb);
		JRadioButton rd = new JRadioButton();
		add(rd);
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		up = new BasicArrowButton(BasicArrowButton.NORTH);
		down = new BasicArrowButton(BasicArrowButton.SOUTH);
		right = new BasicArrowButton(BasicArrowButton.EAST);
		left = new BasicArrowButton(BasicArrowButton.WEST);
		jp.add(up);
		jp.add(down);
		jp.add(right);
		jp.add(left);
		add(jp);
	}
	public static void main(String[] args) {
		new Bai1().setVisible(true);
	}
}
