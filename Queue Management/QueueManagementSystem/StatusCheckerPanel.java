package queuemanagement.QueueManagementSystem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import queuemanagement.DocumentStatusChecker;
import queuemanagement.CustomizedPanels.RoundedCornerTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatusCheckerPanel extends JPanel {
	
    private JTextField textField_trackNumber;
    private DocumentStatusChecker statusChecker;

    /**
     * Create the frame.
     */
    
    public StatusCheckerPanel() {
        setBounds(0, 0, 1232, 640);
        setLayout(null);

        JTextArea txtr_note = new JTextArea();
        txtr_note.setBounds(393, 400, 457, 44);
        add(txtr_note);
        txtr_note.setForeground(new Color(255, 255, 255));
        txtr_note.setFont(new Font("Dialog", Font.BOLD, 15));
        txtr_note.setText("   Enter the tracking number sent to your email to see the status \r\n      (pending/approved/declined) of your requested document.");
        txtr_note.setOpaque(false);

        JButton btn_search = new JButton("");
        btn_search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String trackingCode = textField_trackNumber.getText();
                checkStatus(trackingCode);
            }
        });
        btn_search.setBounds(836, 320, 43, 40);
        add(btn_search);
        btn_search.setIcon(new ImageIcon("D:\\LAZARO\\QueueManagementSystem\\imgs\\btn_search.png"));
        btn_search.setBorder(null);
        btn_search.setOpaque(false);
        btn_search.setFocusPainted(false);
        btn_search.setContentAreaFilled(false); // Remove default content area fill
        btn_search.setBorderPainted(false);

        textField_trackNumber = new RoundedCornerTextField();
        textField_trackNumber.setBounds(347, 303, 546, 73);
        add(textField_trackNumber);
        textField_trackNumber.setForeground(new Color(49, 62, 138));
        textField_trackNumber.setFont(new Font("Dialog", Font.PLAIN, 25));
        textField_trackNumber.setBorder(null);
        textField_trackNumber.setColumns(10);

        JLabel lbl_statusChecker = new JLabel("STATUS CHECKER");
        lbl_statusChecker.setBounds(260, 176, 740, 100);
        add(lbl_statusChecker);
        lbl_statusChecker.setFont(new Font("Dialog", Font.BOLD, 80));
        lbl_statusChecker.setForeground(new Color(255, 255, 255));

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 1232, 641);
        add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon("D:\\LAZARO\\QueueManagementSystem\\imgs\\bg_statusTracker.png"));

        // Initialize the DocumentStatusChecker
        statusChecker = new DocumentStatusChecker();
    }

    public void checkStatus(String trackingCode) {
        String status = statusChecker.getStatus(trackingCode);

        if (status != null) {
            JOptionPane.showMessageDialog(null, "Your document status: " + status, "Document Status",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid tracking code.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}




