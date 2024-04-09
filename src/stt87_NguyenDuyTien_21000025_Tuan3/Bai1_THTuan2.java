package stt87_NguyenDuyTien_21000025_Tuan3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Bai1_THTuan2 extends JFrame implements ActionListener, MouseListener{
	private JTextField txtMa;
	private JTextField txtHo;
	private JTextField txtTen;
	private JTextField txtTuoi;
	private JTable tbNV;
	private JTextField txtTienLuong;
	private JTextField txtNhap;
	private JButton btnTim;
	private JButton btnThem;
	private JButton btnXoaTrang;
	private JButton btnXoa;
	private JButton btnLuu;
	private JRadioButton rNam;
	private JRadioButton rNu;
	private DefaultTableModel modelNV;

	public Bai1_THTuan2() {
		setTitle("^-^");
		setSize(650, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel p = new JPanel();
		JPanel gioiThieu = new JPanel();
		JLabel l1 = new JLabel("THÔNG TIN NHÂN VIÊN");
		l1.setFont(new Font("TimeNewRoman",ABORT, 20));
		l1.setForeground(Color.blue);
		gioiThieu.add(l1, BorderLayout.CENTER);
		this.add(gioiThieu,BorderLayout.NORTH);
		JLabel lMa = new JLabel("Mã nhân viên:");
		p.add(lMa);
		txtMa = new JTextField(48);
		p.add(txtMa);
		JLabel lHo = new JLabel("Họ:");
		p.add(lHo);
		txtHo = new JTextField(25);
		p.add(txtHo);
		JLabel lTen = new JLabel("Tên nhân viên:");
		p.add(lTen);
		txtTen = new JTextField(20);
		p.add(txtTen);
		JLabel lTuoi = new JLabel("Tuổi:");
		p.add(lTuoi);
		txtTuoi = new JTextField(41);
		p.add(txtTuoi);
		JLabel lPhai = new JLabel("Phái:");
		p.add(lPhai);
		rNu = new JRadioButton("Nữ");
		p.add(rNu);
		rNam = new JRadioButton("Nam");
		p.add(rNam);
		ButtonGroup bt = new ButtonGroup();
		bt.add(rNam); bt.add(rNu);
		JLabel ltienLuong = new JLabel("Tiền lương:");
		p.add(ltienLuong);
		txtTienLuong = new JTextField(50);
		p.add(txtTienLuong);
		modelNV = new DefaultTableModel();
		modelNV.addColumn("Mã NV");
		modelNV.addColumn("Họ");
		modelNV.addColumn("Tên");
		modelNV.addColumn("Phái");
		modelNV.addColumn("Tuổi");
		modelNV.addColumn("Tiền lương");
		tbNV = new JTable(modelNV);
		JScrollPane scr = new JScrollPane(tbNV);
		p.add(scr);
		this.add(p, BorderLayout.CENTER);
		JPanel chucNang = new JPanel();
		chucNang.setPreferredSize( new Dimension( 500, 50 ));
		JPanel chucNangNhap = new JPanel();
		chucNangNhap.setBorder(BorderFactory.createLoweredBevelBorder());
		JLabel lNhap = new JLabel("Nhập mã số cần tìm:");
		chucNangNhap.add(lNhap);
		txtNhap = new JTextField(10);
		chucNangNhap.add(txtNhap);
		btnTim = new JButton("Tìm");
		chucNangNhap.add(btnTim);
		chucNang.add(chucNangNhap,BorderLayout.WEST);
		JPanel op = new JPanel();
		op.setBorder(BorderFactory.createLoweredBevelBorder());
		btnThem = new JButton("Thêm");
		op.add(btnThem);
		btnXoaTrang = new JButton("Xóa trắng");
		op.add(btnXoaTrang);
		btnXoa = new JButton("Xóa");
		op.add(btnXoa);
		btnLuu = new JButton("Lưu");
		op.add(btnLuu);
		chucNang.add(op, BorderLayout.EAST);
		this.add(chucNang, BorderLayout.SOUTH);
		
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnTim.addActionListener(this);
		tbNV.addMouseListener(this);
	}
	public static void main(String[] args) {
		new Bai1_THTuan2().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnThem)) {
			validata();
		}if(o.equals(btnXoa)) {
			int opt = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhân viên này không ?", null, JOptionPane.YES_NO_OPTION);
			if (opt == JOptionPane.YES_OPTION) {
			xoa();
			xoaTrang();}
		}if(o.equals(btnXoaTrang)) {
			xoaTrang();
		}if(o.equals(btnTim)) {
			String timKiem = txtNhap.getText();
			timKiem(tbNV, timKiem);
		}
}
	public void Them() {
		String ma = txtMa.getText();
		String ho = txtHo.getText();
		String ten = txtTen.getText();
		String tuoi = txtTuoi.getText();
		String phai = "";
		if(rNam.isSelected()) {
			phai = "Nam";
		}else
			phai = "Nữ";
	
		String tienLuong = txtTienLuong.getText();
		modelNV.addRow(new Object[] {ma,ho,ten,phai,tuoi,tienLuong});
	}
	public void xoaTrang() {
		txtMa.setText("");
		txtHo.setText("");
		txtTen.setText("");
		txtTuoi.setText("");
		txtTienLuong.setText("");
	}
	public void xoa() {
		int row = tbNV.getSelectedRow();
		modelNV.removeRow(row);
	}
	public void timKiem(JTable table, String timKiem) {
		DefaultTableModel modelNV = (DefaultTableModel) table.getModel();
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelNV);
		table.setRowSorter(sorter);

		List<RowFilter<Object, Object>> filters = new ArrayList<>();
		for (int i = 0; i < modelNV.getColumnCount(); i++) {
			filters.add(RowFilter.regexFilter("(?i)" + timKiem, i));
		}

		sorter.setRowFilter(RowFilter.orFilter(filters));

	}
	public void HienThiForm() {
		int row = tbNV.getSelectedRow();
		String phai = tbNV.getValueAt(row, 3).toString();
		txtMa.setText(tbNV.getValueAt(row, 0).toString());
		txtHo.setText(tbNV.getValueAt(row, 1).toString());
		txtTen.setText(tbNV.getValueAt(row, 2).toString());
		if(phai.equals("Nam")){
			rNam.isSelected();
		}else
			rNu.isSelected();
		txtTuoi.setText(tbNV.getValueAt(row, 4).toString());
		txtTienLuong.setText(tbNV.getValueAt(row, 5).toString());		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		HienThiForm();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void validata() {
		String ma = txtMa.getText();
		String ho = txtHo.getText();
		String ten = txtTen.getText();
		String tuoi = txtTuoi.getText();
		String tienLuong = txtTienLuong.getText();
		if(ma.isEmpty() || ho.isEmpty() || ten.isEmpty() || tuoi.isEmpty() || tienLuong.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
			return;
		}
		boolean kt = false;
		for(int i = 0; i < modelNV.getRowCount(); i++) {
			String value = (String) modelNV.getValueAt(i, 0);
			if(ma.equals(value)) {
				kt = true;
				break;
			}
		}
		if(kt) {
			JOptionPane.showMessageDialog(null, "Trùng mã nhân viên");
		}else
			Them();
			xoaTrang();
	}
}
