package a87_NguyenDuyTien_21000025_Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GiaiPhuongTrinhBac2 extends JFrame implements ActionListener {
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtKQ;
	private JButton btnGiai;
	private JButton btnXoaRong;
	private JButton btnThoat;
	public GiaiPhuongTrinhBac2() {
		setTitle("^-^");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		p.setSize(50,50);
		JLabel lbl = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2");
		lbl.setFont(new Font("TimeNewRoman", ABORT, 26));
		p.add(lbl, BorderLayout.CENTER);
		this.add(p, BorderLayout.NORTH);
		JPanel p1 = new JPanel();
		JLabel lbla = new JLabel("Nhập a: ");
		txta = new JTextField(29);
		JLabel lblb = new JLabel("Nhập b: ");
		txtb = new JTextField(29);
		JLabel lblc = new JLabel("Nhập c: ");
		txtc = new JTextField(29);
		JLabel lblKQ = new JLabel("Kết quả: ");
		txtKQ = new JTextField(29);
		txtKQ.setEditable(false);
		p1.add(lbla); p1.add(txta);
		p1.add(lblb); p1.add(txtb);
		p1.add(lblc); p1.add(txtc);
		p1.add(lblKQ); p1.add(txtKQ);
		this.add(p1, BorderLayout.CENTER);
		JPanel p2 = new JPanel();
		p2.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		btnGiai = new JButton("Giải");
		btnXoaRong = new JButton("Xóa rỗng");
		btnThoat = new JButton("Thoát");
		p2.add(btnGiai, BorderLayout.CENTER);
		btnGiai.addActionListener(this);
		p2.add(btnXoaRong, BorderLayout.CENTER);
		btnXoaRong.addActionListener(this);
		p2.add(btnThoat, BorderLayout.CENTER);
		btnThoat.addActionListener(this);
		this.add(p2, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new GiaiPhuongTrinhBac2().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btnGiai)) {
			giaiPTBac2();
		}else if(o.equals(btnXoaRong)) {
			XoaRong();
		}else
			System.exit(0);
		
	}
	public void giaiPTBac2() {
        // kiểm tra các hệ số
		String astr = txta.getText();
		float a = Integer.parseInt(astr);
		String bstr = txtb.getText();
		float b = Integer.parseInt(astr);
		String cstr = txtc.getText();
		float c = Integer.parseInt(astr);
        if (a == 0) {
            if (b == 0) {
                txtKQ.setText("Phương trình vô nghiệm!");
            } else {
            	txtKQ.setText("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            txtKQ.setText("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            txtKQ.setText("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
        	txtKQ.setText("Phương trình vô nghiệm!");
        }
    }
	public void XoaRong() {
		txta.setText("");
		txtb.setText("");
		txtc.setText("");
		txtKQ.setText("");
	}
}
