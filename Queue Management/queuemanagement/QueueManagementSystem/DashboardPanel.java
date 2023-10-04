package queuemanagement.QueueManagementSystem;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import queuemanagement.CustomizedPanels.RoundPanels;

public class DashboardPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public DashboardPanel() {
		
        setSize(1016, 637);
		setBackground(new Color(249, 249, 249));
		setLayout(null);
		
		RoundPanels approvedAppointment = new RoundPanels(30);
		approvedAppointment.setLayout(null);
		approvedAppointment.setBackground(new Color(49, 62, 138));
		approvedAppointment.setBounds(63, 75, 276, 157);
		add(approvedAppointment);
		
		JLabel lbl_approved = new JLabel("Approved");
		lbl_approved.setForeground(Color.WHITE);
		lbl_approved.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_approved.setBounds(23, 11, 123, 37);
		approvedAppointment.add(lbl_approved);
		
		JLabel lbl_appointments1 = new JLabel("Appointments");
		lbl_appointments1.setForeground(Color.WHITE);
		lbl_appointments1.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_appointments1.setBounds(23, 40, 166, 33);
		approvedAppointment.add(lbl_appointments1);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Dialog", Font.BOLD, 70));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(23, 59, 253, 98);
		approvedAppointment.add(textField);
		
		JLabel lbl_dashboard = new JLabel("Dashboard");
		lbl_dashboard.setForeground(new Color(49, 62, 138));
		lbl_dashboard.setFont(new Font("Dialog", Font.BOLD, 35));
		lbl_dashboard.setBounds(37, 11, 182, 53);
		add(lbl_dashboard);
		
		RoundPanels declinedAppointment = new RoundPanels(30);
		declinedAppointment.setLayout(null);
		declinedAppointment.setBackground(new Color(49, 62, 138));
		declinedAppointment.setBounds(664, 75, 276, 157);
		add(declinedAppointment);
		
		JLabel lbl_declined = new JLabel("Declined");
		lbl_declined.setForeground(Color.WHITE);
		lbl_declined.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_declined.setBounds(22, 11, 110, 33);
		declinedAppointment.add(lbl_declined);
		
		JLabel lbl_appointments3 = new JLabel("Appointments");
		lbl_appointments3.setForeground(Color.WHITE);
		lbl_appointments3.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_appointments3.setBounds(22, 39, 164, 33);
		declinedAppointment.add(lbl_appointments3);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setOpaque(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 70));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(22, 59, 253, 98);
		declinedAppointment.add(textField_1);
		
		RoundPanels pendingAppointment = new RoundPanels(30);
		pendingAppointment.setLayout(null);
		pendingAppointment.setBackground(new Color(49, 62, 138));
		pendingAppointment.setBounds(365, 75, 276, 157);
		add(pendingAppointment);
		
		JLabel lbl_pending = new JLabel("Pending");
		lbl_pending.setForeground(Color.WHITE);
		lbl_pending.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_pending.setBounds(23, 11, 106, 33);
		pendingAppointment.add(lbl_pending);
		
		JLabel lbl_appointments2 = new JLabel("Appointments");
		lbl_appointments2.setForeground(Color.WHITE);
		lbl_appointments2.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl_appointments2.setBounds(23, 40, 164, 33);
		pendingAppointment.add(lbl_appointments2);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setOpaque(false);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Dialog", Font.BOLD, 70));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(23, 59, 253, 98);
		pendingAppointment.add(textField_2);
		
		RoundPanels panel_visitors = new RoundPanels(30);
		panel_visitors.setLayout(null);
		panel_visitors.setBackground(Color.WHITE);
		panel_visitors.setBounds(37, 255, 936, 371);
		add(panel_visitors);
		
		JLabel lbl_numVisitors = new JLabel("No. Of Visitor(s)");
		lbl_numVisitors.setForeground(new Color(49, 62, 138));
		lbl_numVisitors.setFont(new Font("Dialog", Font.BOLD, 15));
		lbl_numVisitors.setBounds(31, 21, 119, 26);
		panel_visitors.add(lbl_numVisitors);

	}
}
