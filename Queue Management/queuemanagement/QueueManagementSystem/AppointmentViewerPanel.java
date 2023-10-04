package queuemanagement.QueueManagementSystem;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AppointmentViewerPanel extends JPanel {

    /**
     * Create the frame.
     */
    public AppointmentViewerPanel() {
    	
        setSize(1016, 637);

        setLayout(null);
        setBackground(new Color(249, 249, 249));

        JLabel lblAppointmentViewer = new JLabel("Appointment Viewer");
        lblAppointmentViewer.setForeground(new Color(49, 62, 138));
        lblAppointmentViewer.setFont(new Font("Dialog", Font.BOLD, 40));
        lblAppointmentViewer.setBounds(55, 11, 423, 99);
        add(lblAppointmentViewer);

        JPanel panel_viewSchedules = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Define the gradient colors
                Color startColor = new Color(49, 62, 138);
                Color endColor = new Color(36, 59, 85);

                // Create the gradient paint object
                GradientPaint gradient = new GradientPaint(0, 0, startColor, 0, getHeight(), endColor);

                // Set the paint to the graphics object
                g2d.setPaint(gradient);

                // Fill the entire panel with the gradient
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel_viewSchedules.setBounds(546, 0, 470, 637);
        add(panel_viewSchedules);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(249, 249, 249));
        mainPanel.setBounds(0, 0, 1016, 637);
        add(mainPanel);
    }
}
