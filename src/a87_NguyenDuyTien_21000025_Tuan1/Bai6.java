package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Bai6 extends JFrame{
	private Border blueLineBorder;
	public Bai6() {
		setTitle("Border Demo");
		setSize(280,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		JLabel lbl1 = new JLabel("Line Border");
		Border LineBorder = null;
		lbl1.setBorder(BorderFactory.createLineBorder(Color.red));
		add(lbl1);
		JLabel lbl2 = new JLabel("Etched Border");
		lbl2.setBorder(BorderFactory.createEtchedBorder());
		add(lbl2);
		JLabel lbl3 = new JLabel("Raise Bevel Border");
		lbl3.setBorder(BorderFactory.createRaisedBevelBorder());
		add(lbl3);
		JLabel lbl4 = new JLabel("Lowered Bevel Border");
		lbl4.setBorder(BorderFactory.createLoweredBevelBorder());
		add(lbl4);
		JLabel lbl5 = new JLabel("Title Border");
		lbl5.setBorder(BorderFactory.createTitledBorder("Title"));
		add(lbl5);
		JLabel lbl6 = new JLabel("Title Border (right)");
		lbl6.setBorder(BorderFactory.createTitledBorder(LineBorder, "Title",TitledBorder.RIGHT,TitledBorder.TOP));
		add(lbl6);
		blueLineBorder = BorderFactory.createLineBorder(Color.blue);
		JLabel lbl7 = new JLabel("Compound Border");
		lbl7.setBorder(BorderFactory.createCompoundBorder(blueLineBorder, lbl7.getBorder()));
		add(lbl7);
		JLabel lbl8 = new JLabel("Matte Border");
		lbl8.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.red));
		add(lbl8);
	}
public static void main(String[] args) {
	new Bai6().setVisible(true);
	}
}
