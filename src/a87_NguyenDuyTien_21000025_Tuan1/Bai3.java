package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai3 extends JFrame implements ActionListener {
	private JTextField txtF;
	private JLabel lbl2;

	public Bai3() {
		setTitle("Fahrenheit");
		setSize(300,200);
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		JLabel lbl1 = new JLabel("Enter Fahrenheit temperature: ");
		txtF = new JTextField(6);
		lbl2 = new JLabel();
		add(lbl1);
		add(txtF);
		add(lbl2);
		txtF.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Fstr = txtF.getText();
		int F = Integer.parseInt(Fstr);
		lbl2.setText("Temperature in Celsius: " +(F-32)*5/9);
	}
	public static void main(String[] args) {
		new Bai3().setVisible(true);
	}
}
