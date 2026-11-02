package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class adminLoginActivity extends JFrame implements ActionListener{
    private JLabel lblTitle, lblUser, lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin, btnBack;

    adminLoginActivity(){
        setTitle("Admin Login");
        setSize(360, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Admin Login");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(30, 15, 300, 30);
        add(lblTitle);

        lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 65, 80, 25);
        add(lblUser);

        lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 105, 80, 25);
        add(lblPass);

        //Text Fields
        txtUser = new JTextField();
        txtUser.setBounds(120, 65, 180, 25);
        add(txtUser);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 105, 180, 25);
        add(txtPass);

        //Buttons
        btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 150, 85, 30);
        add(btnLogin);

        btnBack = new JButton("Back");
        btnBack.setBounds(215, 150, 85, 30);
        add(btnBack);

        //Add to ActionListener
        btnLogin.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogin){
            //Temporary: opens the dashboard without checking, the real login comes in Docx 2
            adminDashboardActivity dashboard = new adminDashboardActivity();
            dashboard.setVisible(true);
            dispose();
        }else if(e.getSource() == btnBack){
            dispose();
        }
    }
}
