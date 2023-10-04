package queuemanagement.QueueManagementSystem;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import queuemanagement.AppointmentRequest;

import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentRequestPanel extends JPanel {

    private JTable appointmentTable;
    private static DefaultTableModel tableModel;
    private RequestAppointmentPanel requestAppointmentPanel;
    private List<AppointmentRequest> appointmentRequests;
    String fileName = "appointment_data.txt";


    public AppointmentRequestPanel(RequestAppointmentPanel requestAppointmentPanel) {
    	
        appointmentRequests = new ArrayList<>();
        
        this.requestAppointmentPanel = requestAppointmentPanel;

        setSize(1016, 637);
        setBackground(new Color(249, 249, 249));

        // Create the table model with appropriate column names
        tableModel = new DefaultTableModel(
                new Object[]{"Last Name", "First Name", "Middle Name", "Email", "Document Type", "Proof Of Payment", "Purpose"}, 0);
        setLayout(null);
        appointmentTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(appointmentTable);
        scrollPane.setBounds(10, 80, 996, 546);
        add(scrollPane);
        
        addAppointmentRequest("Doe", "John", "", "john@example.com", "Form 137", "path/to/proof", "Appointment purpose");
        
     // Read the data from the file and populate the table
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");  // Use comma as the delimiter
                if (data.length == 7) {
                    tableModel.addRow(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    

    }

    public void addAppointmentRequest(String lastName, String firstName, String middleName, String email,
            String documentType, String proofOfPayment, String purpose) {
        // Create a new AppointmentRequest instance
        AppointmentRequest appointmentRequest = new AppointmentRequest(lastName, firstName, middleName, email,
                documentType, proofOfPayment, purpose);

        // Save the data to the file
        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(writer);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(appointmentRequest.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add the appointmentRequest to the list
        appointmentRequests.add(appointmentRequest);
    }

  
}
