package queuemanagement.QueueManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import queuemanagement.CustomizedPanels.RoundPanels;
import queuemanagement.CustomizedPanels.RoundedCornerTextArea;
import queuemanagement.CustomizedPanels.RoundedCornerTextField;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScheduleViewerPanel extends JPanel {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ScheduleViewerPanel() {
		
		setBounds(0, 0, 1232, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1232, 641);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrViewScheduledAppointment = new JTextArea();
		txtrViewScheduledAppointment.setText("View Scheduled Appointment");
		txtrViewScheduledAppointment.setOpaque(false);
		txtrViewScheduledAppointment.setForeground(new Color(49, 62, 138));
		txtrViewScheduledAppointment.setFont(new Font("Dialog", Font.BOLD, 60));
		txtrViewScheduledAppointment.setEditable(false);
		txtrViewScheduledAppointment.setAlignmentY(0.0f);
		txtrViewScheduledAppointment.setBounds(78, 77, 868, 81);
		panel.add(txtrViewScheduledAppointment);
		
		JTextArea txtrTrackNumber = new JTextArea();
		txtrTrackNumber.setText("Track Number:");
		txtrTrackNumber.setOpaque(false);
		txtrTrackNumber.setForeground(new Color(49, 62, 138));
		txtrTrackNumber.setFont(new Font("Dialog", Font.PLAIN, 40));
		txtrTrackNumber.setEditable(false);
		txtrTrackNumber.setAlignmentY(0.0f);
		txtrTrackNumber.setBounds(88, 149, 267, 56);
		panel.add(txtrTrackNumber);
		
		JTextArea trackNum = new JTextArea();
		trackNum.setText("83598465");
		trackNum.setOpaque(false);
		trackNum.setForeground(new Color(49, 62, 138));
		trackNum.setFont(new Font("Dialog", Font.BOLD, 40));
		trackNum.setBounds(371, 149, 256, 56);
		panel.add(trackNum);
		
		RoundPanels panel_1 = new RoundPanels(30);
		panel_1.setBackground(new Color(49, 62, 138));
		panel_1.setBorder(null);
		panel_1.setBounds(78, 216, 759, 343);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrAppointmentDetails = new JTextArea();
		txtrAppointmentDetails.setText("Appointment Details");
		txtrAppointmentDetails.setOpaque(false);
		txtrAppointmentDetails.setForeground(new Color(255, 255, 255));
		txtrAppointmentDetails.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtrAppointmentDetails.setEditable(false);
		txtrAppointmentDetails.setAlignmentY(0.0f);
		txtrAppointmentDetails.setBounds(49, 44, 241, 37);
		panel_1.add(txtrAppointmentDetails);
		
		JTextArea txtrAppointmentDate = new JTextArea();
		txtrAppointmentDate.setText("Appointment Date");
		txtrAppointmentDate.setOpaque(false);
		txtrAppointmentDate.setForeground(Color.WHITE);
		txtrAppointmentDate.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtrAppointmentDate.setEditable(false);
		txtrAppointmentDate.setAlignmentY(0.0f);
		txtrAppointmentDate.setBounds(495, 45, 241, 37);
		panel_1.add(txtrAppointmentDate);
		
		JTextArea txtrAmpm = new JTextArea();
		txtrAmpm.setText("AM/PM");
		txtrAmpm.setOpaque(false);
		txtrAmpm.setForeground(Color.WHITE);
		txtrAmpm.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtrAmpm.setEditable(false);
		txtrAmpm.setAlignmentY(0.0f);
		txtrAmpm.setBounds(495, 141, 105, 37);
		panel_1.add(txtrAmpm);
		
		RoundedCornerTextArea textArea_appointmentDetails = new RoundedCornerTextArea();
		textArea_appointmentDetails.setBounds(49, 88, 351, 193);
		panel_1.add(textArea_appointmentDetails);
		
		RoundedCornerTextField textField_appointmentDate = new RoundedCornerTextField();
		textField_appointmentDate.setBorder(null);
		textField_appointmentDate.setBounds(495, 93, 205, 37);
		panel_1.add(textField_appointmentDate);
		textField_appointmentDate.setColumns(10);
		
		RoundedCornerTextField textField_daySchedule = new RoundedCornerTextField();
		textField_daySchedule.setColumns(10);
		textField_daySchedule.setBorder(null);
		textField_daySchedule.setBounds(495, 189, 205, 37);
		panel_1.add(textField_daySchedule);
		
		JTextArea txtr_note = new JTextArea();
		txtr_note.setText("A.M Schedule: 8-12nn\r\nP.M Schedule: 1-4pm");
		txtr_note.setOpaque(false);
		txtr_note.setForeground(Color.WHITE);
		txtr_note.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtr_note.setEditable(false);
		txtr_note.setAlignmentY(0.0f);
		txtr_note.setBounds(505, 237, 158, 44);
		panel_1.add(txtr_note);
	}
}
