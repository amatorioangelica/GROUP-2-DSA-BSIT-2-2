package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class deliveryRoutesActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblFrom, lblTo, lblDistance, lblStart, lblEnd, lblRoute, lblTotal;
    private JTextField txtFrom, txtTo, txtDistance;
    private JComboBox<String> cmbStart, cmbEnd;
    private JButton btnAddRoute, btnFind, btnBack;

    deliveryRoutesActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Delivery Routes");
        setSize(560, 480);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Delivery Routes");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(20, 50, 50, 25);
        add(lblFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(215, 50, 30, 25);
        add(lblTo);

        lblDistance = new JLabel("Distance (km):");
        lblDistance.setBounds(20, 85, 125, 25);
        add(lblDistance);

        lblStart = new JLabel("Start:");
        lblStart.setBounds(20, 265, 50, 25);
        add(lblStart);

        lblEnd = new JLabel("End:");
        lblEnd.setBounds(240, 265, 40, 25);
        add(lblEnd);

        lblRoute = new JLabel("Route:");
        lblRoute.setBounds(20, 340, 500, 25);
        add(lblRoute);

        lblTotal = new JLabel("Total distance:");
        lblTotal.setBounds(20, 365, 500, 25);
        add(lblTotal);

        //Text Fields
        txtFrom = new JTextField();
        txtFrom.setBounds(70, 50, 130, 25);
        add(txtFrom);

        txtTo = new JTextField();
        txtTo.setBounds(245, 50, 130, 25);
        add(txtTo);

        txtDistance = new JTextField();
        txtDistance.setBounds(150, 85, 70, 25);
        add(txtDistance);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 125, 500, 120);
        add(scrollPane);

        //Combo Boxes
        cmbStart = new JComboBox<>();
        cmbStart.setBounds(70, 265, 150, 25);
        add(cmbStart);

        cmbEnd = new JComboBox<>();
        cmbEnd.setBounds(285, 265, 150, 25);
        add(cmbEnd);

        //Buttons
        btnAddRoute = new JButton("Add Route");
        btnAddRoute.setBounds(235, 85, 120, 25);
        add(btnAddRoute);

        btnFind = new JButton("Find Shortest Route");
        btnFind.setBounds(20, 300, 180, 30);
        add(btnFind);

        btnBack = new JButton("Back");
        btnBack.setBounds(20, 400, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnAddRoute.addActionListener(this);
        btnFind.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
