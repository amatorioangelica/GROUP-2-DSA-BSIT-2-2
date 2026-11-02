package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class manageMenuActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblRestaurant, lblItem, lblPrice;
    private JComboBox<String> cmbRestaurant;
    private JTextField txtItem, txtPrice;
    private JButton btnShow, btnAdd, btnUpdate, btnDelete, btnBack;

    manageMenuActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Manage Menu and Prices");
        setSize(490, 430);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Manage Menu and Prices");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 350, 30);
        add(lblTitle);

        lblRestaurant = new JLabel("Restaurant:");
        lblRestaurant.setBounds(20, 50, 95, 25);
        add(lblRestaurant);

        lblItem = new JLabel("Item Name:");
        lblItem.setBounds(20, 255, 80, 25);
        add(lblItem);

        lblPrice = new JLabel("Price:");
        lblPrice.setBounds(20, 290, 80, 25);
        add(lblPrice);

        //Combo Box
        cmbRestaurant = new JComboBox<>();
        cmbRestaurant.setBounds(120, 50, 205, 25);
        add(cmbRestaurant);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 90, 430, 150);
        add(scrollPane);

        //Text Fields
        txtItem = new JTextField();
        txtItem.setBounds(105, 255, 200, 25);
        add(txtItem);

        txtPrice = new JTextField();
        txtPrice.setBounds(105, 290, 100, 25);
        add(txtPrice);

        //Buttons
        btnShow = new JButton("Show Menu");
        btnShow.setBounds(335, 50, 125, 25);
        add(btnShow);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(20, 335, 90, 30);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(120, 335, 90, 30);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(220, 335, 90, 30);
        add(btnDelete);

        btnBack = new JButton("Back");
        btnBack.setBounds(320, 335, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnShow.addActionListener(this);
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
