package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class trackOrderActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JLabel lblTitle, lblOrderId;
    private JTextField txtOrderId;
    private JButton btnTrack, btnBack;

    trackOrderActivity(){
        listModel = new DefaultListModel<>();

        setTitle("Track Order");
        setSize(410, 390);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Track Order");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblOrderId = new JLabel("Order ID:");
        lblOrderId.setBounds(20, 50, 70, 25);
        add(lblOrderId);

        //Text Field
        txtOrderId = new JTextField();
        txtOrderId.setBounds(95, 50, 100, 25);
        add(txtOrderId);

        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 90, 350, 200);
        add(scrollPane);

        //Buttons
        btnTrack = new JButton("Track");
        btnTrack.setBounds(205, 50, 80, 25);
        add(btnTrack);

        btnBack = new JButton("Back");
        btnBack.setBounds(20, 305, 100, 30);
        add(btnBack);

        //Add to ActionListener
        btnTrack.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
