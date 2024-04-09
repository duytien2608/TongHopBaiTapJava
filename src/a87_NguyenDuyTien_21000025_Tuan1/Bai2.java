package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bai2 extends JFrame implements ActionListener {
	private JLabel lbl;
	private JButton btnPush;
	private int count = 0;

	public Bai2() {
	setTitle("Push Counter");	
	setSize(200,100);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	btnPush = new JButton("Push Me!");
	lbl = new JLabel("Pushes:");
	add(btnPush);
	add(lbl);
	btnPush.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count ++;
		lbl.setText("Pushes: " +count);
	}
	public static void main(String[] args) {
		new Bai2().setVisible(true);
	}
}
