package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class adminDashboardActivity extends JFrame implements ActionListener{
    private JLabel lblTitle;
    private JButton btnRestaurants, btnMenu, btnOrders, btnRoutes, btnReports, btnLogout;

    adminDashboardActivity(){
        setTitle("Admin Dashboard");
        setSize(380, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Admin Dashboard");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(100, 15, 250, 30);
        add(lblTitle);

        //Buttons
        btnRestaurants = new JButton("Manage Restaurants");
        btnRestaurants.setBounds(60, 60, 250, 40);
        add(btnRestaurants);

        btnMenu = new JButton("Manage Menu and Prices");
        btnMenu.setBounds(60, 110, 250, 40);
        add(btnMenu);

        btnOrders = new JButton("Manage Orders");
        btnOrders.setBounds(60, 160, 250, 40);
        add(btnOrders);

        btnRoutes = new JButton("Delivery Routes");
        btnRoutes.setBounds(60, 210, 250, 40);
        add(btnRoutes);

        btnReports = new JButton("Reports");
        btnReports.setBounds(60, 260, 250, 40);
        add(btnReports);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(60, 320, 250, 40);
        add(btnLogout);

        //Add to ActionListener
        btnRestaurants.addActionListener(this);
        btnMenu.addActionListener(this);
        btnOrders.addActionListener(this);
        btnRoutes.addActionListener(this);
        btnReports.addActionListener(this);
        btnLogout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRestaurants){
            manageRestaurantActivity restaurant = new manageRestaurantActivity();
            restaurant.setVisible(true);
        }else if(e.getSource() == btnMenu){
            manageMenuActivity menu = new manageMenuActivity();
            menu.setVisible(true);
        }else if(e.getSource() == btnOrders){
            manageOrdersActivity orders = new manageOrdersActivity();
            orders.setVisible(true);
        }else if(e.getSource() == btnRoutes){
            deliveryRoutesActivity routes = new deliveryRoutesActivity();
            routes.setVisible(true);
        }else if(e.getSource() == btnReports){
            reportsActivity reports = new reportsActivity();
            reports.setVisible(true);
        }else if(e.getSource() == btnLogout){
            dispose();
        }
    }
}
