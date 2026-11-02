package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class browseMenuActivity extends JFrame implements ActionListener{
    private DefaultListModel<String> restaurantModel, menuModel;
    private JList<String> listRestaurant, listMenu;
    private JScrollPane scrollRestaurant, scrollMenu;
    private JLabel lblTitle, lblLocation, lblRestaurants, lblMenu;
    private JTextField txtLocation;
    private JButton btnSearch, btnViewMenu, btnOrder, btnBack;

    browseMenuActivity(){
        restaurantModel = new DefaultListModel<>();
        menuModel = new DefaultListModel<>();

        setTitle("Browse Menu");
        setSize(500, 410);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Browse Menu");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblLocation = new JLabel("Your Location:");
        lblLocation.setBounds(20, 50, 120, 25);
        add(lblLocation);

        lblRestaurants = new JLabel("Restaurants:");
        lblRestaurants.setBounds(20, 85, 150, 20);
        add(lblRestaurants);

        lblMenu = new JLabel("Menu:");
        lblMenu.setBounds(240, 85, 150, 20);
        add(lblMenu);

        //Text Field
        txtLocation = new JTextField();
        txtLocation.setBounds(145, 50, 180, 25);
        add(txtLocation);

        //JLists
        listRestaurant = new JList<>(restaurantModel);
        scrollRestaurant = new JScrollPane(listRestaurant);
        scrollRestaurant.setBounds(20, 105, 200, 190);
        add(scrollRestaurant);

        listMenu = new JList<>(menuModel);
        scrollMenu = new JScrollPane(listMenu);
        scrollMenu.setBounds(240, 105, 220, 190);
        add(scrollMenu);

        //Buttons
        btnSearch = new JButton("Search");
        btnSearch.setBounds(335, 50, 125, 25);
        add(btnSearch);

        btnViewMenu = new JButton("View Menu");
        btnViewMenu.setBounds(20, 310, 125, 30);
        add(btnViewMenu);

        btnOrder = new JButton("Order Now");
        btnOrder.setBounds(155, 310, 115, 30);
        add(btnOrder);

        btnBack = new JButton("Back");
        btnBack.setBounds(370, 310, 90, 30);
        add(btnBack);

        //Add to ActionListener
        btnSearch.addActionListener(this);
        btnViewMenu.addActionListener(this);
        btnOrder.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOrder){
            //Temporary id, the real one comes in Docx 2
            placeOrderActivity order = new placeOrderActivity(0);
            order.setVisible(true);
        }else if(e.getSource() == btnBack){
            dispose();
        }
    }
}
