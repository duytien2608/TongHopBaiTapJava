package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bai5 extends JFrame implements ActionListener {
	private JLabel lbl;
	private JCheckBox cbBold;
	private JCheckBox cbItalic;

	public Bai5() {
	setTitle("Style Options");	
	setSize(400,200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	lbl = new JLabel("Say it with style!");
	lbl.setFont(new Font("Time New Roman", Font.PLAIN, 26));
	cbBold = new JCheckBox("Bold");
	cbItalic = new JCheckBox("Italic");
	add(lbl);
	add(cbBold);
	add(cbItalic);
	cbBold.addActionListener(this);
	cbItalic.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(cbBold)) {
			lbl.setFont(new Font("Time New Roman", Font.BOLD, 26));
		}else if(o.equals(cbItalic)) {
			lbl.setFont(new Font("Time New Roman",Font.ITALIC,26));
		}else if(o.equals(cbBold)&&o.equals(o)) {
			lbl.setFont(new Font("Time New Roman", Font.BOLD | Font.ITALIC, 26));
		}
	}
	public static void main(String[] args) {
		new Bai5().setVisible(true);
	}
}
