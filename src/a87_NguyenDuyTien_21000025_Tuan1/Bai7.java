package a87_NguyenDuyTien_21000025_Tuan1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.w3c.dom.Text;

public class Bai7 extends JFrame implements ActionListener {
	private JButton btnUpdate;
	private JLabel lbl1;
	private JLabel lbl2;
	private JTextArea txt;
	public Bai7(){
		setTitle("Text Statistics");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		JPanel pnlText = new JPanel();
		pnlText.setBorder(BorderFactory.createTitledBorder("Text Container"));
		txt = new JTextArea(10, 20);
		pnlText.add(txt);
		add(pnlText);
		JPanel pnlThongTin = new JPanel();
		pnlThongTin.setPreferredSize(new Dimension(250, 120));
		pnlThongTin.setOpaque(false);
		pnlThongTin.setBorder(BorderFactory.createTitledBorder("Text Statistics"));
		pnlThongTin.setLayout(new FlowLayout());
		btnUpdate = new JButton("Update Text Statistics");
		pnlThongTin.add(btnUpdate);
		lbl1 = new JLabel("Number of words:       ");
		pnlThongTin.add(lbl1);
		lbl2 = new JLabel("Average word length: ");
		pnlThongTin.add(lbl2);
		btnUpdate.addActionListener(this);
		add(pnlThongTin);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnUpdate)) {
			String s = txt.getText();
			String[] words = s.split(" ");
			int soKiTu = s.length();
			float tb = ((soKiTu - words.length +0.1f)/words.length);
			lbl1.setText("Number of words: "+String.valueOf(soKiTu));
			lbl2.setText("Average word length: " +String.valueOf(tb));
		}
	}
	public static void main(String[] args) {
		new Bai7().setVisible(true);
	}

}
