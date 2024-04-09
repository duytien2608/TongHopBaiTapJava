package stt87_NguyenDuyTien_21000025;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

public class EditJTable extends JFrame implements ActionListener {
	private JTextField txtHo;
	private JTextField txtTen;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnThoat;
	private JTable tb;
	private DefaultTableModel model;

	public EditJTable() {
		setTitle("Edit Table");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("Ho: ");
		txtHo = new JTextField(20);
		JLabel l2 = new JLabel("Ten: ");
		txtTen = new JTextField(20);
		btnThem = new JButton("Them");
		btnThem.addActionListener(this);
		btnXoa = new JButton("Xoa");
		btnXoa.addActionListener(this);
		btnThoat = new JButton("Thoat");
		btnThoat.addActionListener(this);
		model = new DefaultTableModel();
		model.addColumn("Ho");
		model.addColumn("Ten");
		model.addRow(new Object[] {"Duy", "Tien"});
		tb = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(tb);
	    scrollPane.setPreferredSize(new Dimension(300, 150));
		p.add(l1);
		p.add(txtHo);
		p.add(l2);
		p.add(txtTen);
		p.add(btnThem);
		p.add(btnXoa);
		p.add(btnThoat);
		p.add(scrollPane);
		this.add(p);
	}

	public static void main(String[] args) {
		new EditJTable().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
//		hienThiForm();
		if(o.equals(btnThem)) {
			Them();
		}else if(o.equals(btnXoa)) {
			int row = tb.getSelectedRow();
			model.removeRow(row);
		}else
			System.exit(0);
	}

	public void hienThiForm() {
		int row = tb.getSelectedRow();
		txtHo.setText(tb.getValueAt(row, 0).toString());
		txtTen.setText(tb.getValueAt(row, 1).toString());
	}

	public void Them() {
		String ho = txtHo.getText();
		String ten = txtTen.getText();
		
		model.addRow(new Object[] {ho,ten});
		txtHo.setText("");
		txtTen.setText("");
	}
}
