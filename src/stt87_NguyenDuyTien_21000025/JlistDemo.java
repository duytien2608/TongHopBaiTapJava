package stt87_NguyenDuyTien_21000025;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class JlistDemo extends JFrame implements MouseListener {
	private JList lstEntry;
	private JTextField txt;

	public JlistDemo() {
		setTitle("Creating a Simple Jlist");
		setVisible(true);
		setSize(250,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		String[] entries = {"Entry 1", "Entry 2", "Entry 3", "Entry 4", "Entry 6", "Entry 6"};
		lstEntry = new JList(entries);
		lstEntry.setVisibleRowCount(4);
		lstEntry.addMouseListener(this);
		JScrollPane scr = new JScrollPane(lstEntry);
		scr.addMouseListener(this);
		JPanel pnl = new JPanel();
		pnl.setBorder(BorderFactory.createTitledBorder("Simple Jlist"));
		pnl.add(scr);
		this.add(pnl, BorderLayout.CENTER);
		JPanel p1 = new JPanel();
		p1.setBorder(BorderFactory.createTitledBorder("List Selection"));
		JLabel lbl = new JLabel("Last selection");
		txt = new JTextField(10);
		p1.add(lbl); p1.add(txt);
		this.add(p1,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new JlistDemo().setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String chon = lstEntry.getName();
		txt.setText(chon);	
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
}
