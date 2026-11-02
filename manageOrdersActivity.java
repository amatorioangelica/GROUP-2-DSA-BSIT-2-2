package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class manageOrdersActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblNote, lblStatus;
    private JComboBox<String> cmbStatus;
    private JButton btnUpdate, btnBack;

    manageOrdersActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Manage Orders");
        setSize(560, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Manage Orders");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblNote = new JLabel("Orders not yet delivered: urgent first, then the shortest delivery time");
        lblNote.setBounds(20, 40, 500, 20);
        add(lblNote);

        lblStatus = new JLabel("New Status:");
        lblStatus.setBounds(20, 285, 90, 25);
        add(lblStatus);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 70, 500, 200);
        add(scrollPane);

        //Combo Box
        cmbStatus = new JComboBox<>(new String[]{"Pending", "Preparing", "Out for Delivery", "Delivered"});
        cmbStatus.setBounds(115, 285, 160, 25);
        add(cmbStatus);

        //Buttons
        btnUpdate = new JButton("Update Status");
        btnUpdate.setBounds(290, 285, 150, 25);
        add(btnUpdate);

        btnBack = new JButton("Back");
        btnBack.setBounds(20, 330, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnUpdate.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
