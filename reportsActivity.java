package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class reportsActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblCustomer, lblReport, lblAverage;
    private JComboBox<String> cmbCustomer;
    private JButton btnHistory, btnTimes, btnBack;

    reportsActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Reports");
        setSize(580, 490);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Reports");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblCustomer = new JLabel("Customer:");
        lblCustomer.setBounds(20, 50, 80, 25);
        add(lblCustomer);

        lblReport = new JLabel("Report:");
        lblReport.setBounds(20, 120, 100, 20);
        add(lblReport);

        lblAverage = new JLabel("Average delivery time: -");
        lblAverage.setBounds(20, 365, 400, 25);
        add(lblAverage);

        //Combo Box
        cmbCustomer = new JComboBox<>();
        cmbCustomer.setBounds(100, 50, 220, 25);
        add(cmbCustomer);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 140, 520, 215);
        add(scrollPane);

        //Buttons
        btnHistory = new JButton("Order History");
        btnHistory.setBounds(330, 50, 140, 25);
        add(btnHistory);

        btnTimes = new JButton("Delivery Times of All Orders");
        btnTimes.setBounds(20, 85, 230, 25);
        add(btnTimes);

        btnBack = new JButton("Back");
        btnBack.setBounds(20, 405, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnHistory.addActionListener(this);
        btnTimes.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
