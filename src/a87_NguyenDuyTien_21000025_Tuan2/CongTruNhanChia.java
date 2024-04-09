package a87_NguyenDuyTien_21000025_Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CongTruNhanChia extends JFrame implements ActionListener {
	private JButton btnGiai;
	private JButton btnXoa;
	private JButton btnThoat;
	private JTextField txta;
	private JTextField txtb;
	private JRadioButton rdCong;
	private JRadioButton rdTru;
	private JRadioButton rdNhan;
	private JRadioButton rdChia;
	private JTextField txtKQ;
	public CongTruNhanChia() {
		setTitle("Cộng - Trừ - Nhân - Chia");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel p = new JPanel();
		JLabel lbl1 = new JLabel("CỘNG TRỪ NHÂN CHIA");
		lbl1.setFont(new Font("TimeNewRoman", ABORT, 26));
		lbl1.setBackground(Color.blue);
		p.add(lbl1, BorderLayout.CENTER);
		this.add(p, BorderLayout.NORTH);
		JPanel p1 = new JPanel();
		p1.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
//		BoxLayout boxlayout = new BoxLayout(p1, BoxLayout.Y_AXIS);
//		p1.setLayout(boxlayout);
		btnGiai = new JButton("Giải");
		btnGiai.addActionListener(this);
		btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(this);
		btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(this);
		p1.add(btnGiai);
		p1.add(btnXoa);
		p1.add(btnThoat);
		this.add(p1, BorderLayout.WEST);
		JPanel p2 = new JPanel();
		p2.setBorder(BorderFactory.createTitledBorder("Tính toán"));
		JLabel lbla = new JLabel("Nhập a: ");
		txta = new JTextField(18);
		JLabel lblb = new JLabel("Nhập b: ");
		txtb = new JTextField(18);
		p2.add(lbla); p2.add(txta);
		p2.add(lblb); p2.add(txtb);
		JPanel phepToan = new JPanel();
		phepToan.setBorder(BorderFactory.createTitledBorder("Phép toán"));
		rdCong = new JRadioButton("Cộng");
		rdTru = new JRadioButton("Trừ");
		rdNhan = new JRadioButton("Nhân");
		rdChia = new JRadioButton("Chia");
		ButtonGroup bt = new ButtonGroup();
		bt.add(rdCong);
		bt.add(rdTru);
		bt.add(rdNhan);
		bt.add(rdChia);
		phepToan.add(rdCong);
		phepToan.add(rdTru);
		phepToan.add(rdNhan);
		phepToan.add(rdChia);
		p2.add(phepToan);
		JLabel lblKQ = new JLabel("Kết quả: ");
		txtKQ = new JTextField(18);
		txtKQ.setEditable(false);
		p2.add(lblKQ);
		p2.add(txtKQ);
		this.add(p2);
	}
	public static void main(String[] args) {
		new CongTruNhanChia().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnGiai)) {
			String astr = txta.getText();
			int a = Integer.parseInt(astr);
			String bstr = txtb.getText();
			int b = Integer.parseInt(bstr);
			if(o.equals(btnGiai)) {
			if(rdCong.isSelected()) {
				txtKQ.setText((a+b)+"");
			}else if(rdTru.isSelected()) {
				txtKQ.setText((a-b) +"");
			}else if(rdNhan.isSelected()) {
				txtKQ.setText((a*b) +"");
			}else if(rdChia.isSelected()) {
				txtKQ.setText((a/b) +"");
				}
			}
		}else if(o.equals(btnXoa)) {
			txta.setText("");
			txtb.setText("");
			txtKQ.setText("");
		}else
			System.exit(0);
	}

}
