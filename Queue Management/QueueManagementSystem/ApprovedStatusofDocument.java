package queuemanagement.QueueManagementSystem;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import queuemanagement.CustomizedPanels.RoundPanels;
import queuemanagement.CustomizedPanels.RoundedButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApprovedStatusofDocument extends JPanel {

	/**
	 * Create the panel.
	 */
	public ApprovedStatusofDocument() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1232, 641);
		add(panel);
		panel.setLayout(null);
		
		RoundPanels panel_1 = new RoundPanels(30);
		panel_1.setBackground(new Color(49, 62, 138));
		panel_1.setBounds(281, 65, 635, 511);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Status Checker");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 50));
		lblNewLabel.setBounds(45, 11, 384, 78);
		panel_1.add(lblNewLabel);
		
		JLabel lblTrackingNumber = new JLabel("Tracking Number:");
		lblTrackingNumber.setForeground(new Color(255, 255, 255));
		lblTrackingNumber.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblTrackingNumber.setBounds(45, 79, 246, 39);
		panel_1.add(lblTrackingNumber);
		
		RoundPanels panel_2 = new RoundPanels(30);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(45, 138, 547, 337);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblApproved = new JLabel("Approved");
		lblApproved.setForeground(new Color(0, 64, 0));
		lblApproved.setFont(new Font("Dialog", Font.BOLD, 50));
		lblApproved.setBounds(37, 28, 298, 78);
		panel_2.add(lblApproved);
		
		JLabel lblDetails = new JLabel("Details:");
		lblDetails.setForeground(new Color(49, 62, 138));
		lblDetails.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblDetails.setBounds(37, 112, 110, 39);
		panel_2.add(lblDetails);
		
		RoundedButton btn_viewSched = new RoundedButton("Sign in");
		btn_viewSched.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ScheduleViewerPanel schedViewer = new ScheduleViewerPanel();
				schedViewer.setVisible(true);
				
			}
		});
		btn_viewSched.setText("View your scheduled appointment");
		btn_viewSched.setBorder(null);
		btn_viewSched.setForeground(new Color(255, 255, 255));
		btn_viewSched.setFont(new Font("Dialog", Font.BOLD, 13));
		btn_viewSched.setBackground(new Color(49, 62, 138));
		btn_viewSched.setBounds(37, 274, 244, 33);
		panel_2.add(btn_viewSched);

	}
}
