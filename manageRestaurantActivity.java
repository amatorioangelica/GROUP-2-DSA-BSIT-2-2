package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class manageRestaurantActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblName, lblLocation;
    private JTextField txtName, txtLocation;
    private JButton btnAdd, btnUpdate, btnDelete, btnBack;

    manageRestaurantActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Manage Restaurants");
        setSize(450, 380);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Manage Restaurants");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblName = new JLabel("Name:");
        lblName.setBounds(20, 215, 80, 25);
        add(lblName);

        lblLocation = new JLabel("Location:");
        lblLocation.setBounds(20, 250, 80, 25);
        add(lblLocation);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 50, 400, 150);
        add(scrollPane);

        //Text Fields
        txtName = new JTextField();
        txtName.setBounds(100, 215, 220, 25);
        add(txtName);

        txtLocation = new JTextField();
        txtLocation.setBounds(100, 250, 220, 25);
        add(txtLocation);

        //Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(20, 295, 90, 30);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(120, 295, 90, 30);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(220, 295, 90, 30);
        add(btnDelete);

        btnBack = new JButton("Back");
        btnBack.setBounds(320, 295, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
