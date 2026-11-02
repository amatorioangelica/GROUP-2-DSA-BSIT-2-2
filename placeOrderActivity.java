package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class placeOrderActivity extends JFrame implements ActionListener{
    private int restaurantId;
    private DefaultListModel<String> menuModel, cartModel;
    private JList<String> listMenu, listCart;
    private JScrollPane scrollMenu, scrollCart;
    private JLabel lblTitle, lblRestaurant, lblMenu, lblCart, lblQty, lblCustomer, lblUrgency, lblTime;
    private JTextField txtQty, txtTime;
    private JComboBox<String> cmbCustomer, cmbUrgency;
    private JButton btnAddItem, btnRemoveItem, btnPlace, btnBack;

    placeOrderActivity(int restaurantId){
        this.restaurantId = restaurantId;
        menuModel = new DefaultListModel<>();
        cartModel = new DefaultListModel<>();

        setTitle("Place Order");
        setSize(540, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Place Order");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 10, 300, 30);
        add(lblTitle);

        lblRestaurant = new JLabel("Restaurant:");
        lblRestaurant.setBounds(20, 45, 450, 25);
        add(lblRestaurant);

        lblMenu = new JLabel("Menu:");
        lblMenu.setBounds(20, 80, 100, 20);
        add(lblMenu);

        lblCart = new JLabel("Your Order:");
        lblCart.setBounds(270, 80, 100, 20);
        add(lblCart);

        lblQty = new JLabel("Quantity:");
        lblQty.setBounds(20, 265, 70, 25);
        add(lblQty);

        lblCustomer = new JLabel("Customer:");
        lblCustomer.setBounds(20, 305, 80, 25);
        add(lblCustomer);

        lblUrgency = new JLabel("Urgency:");
        lblUrgency.setBounds(20, 340, 80, 25);
        add(lblUrgency);

        lblTime = new JLabel("Delivery Time (minutes):");
        lblTime.setBounds(20, 375, 190, 25);
        add(lblTime);

        //JLists
        listMenu = new JList<>(menuModel);
        scrollMenu = new JScrollPane(listMenu);
        scrollMenu.setBounds(20, 100, 230, 150);
        add(scrollMenu);

        listCart = new JList<>(cartModel);
        scrollCart = new JScrollPane(listCart);
        scrollCart.setBounds(270, 100, 230, 150);
        add(scrollCart);

        //Text Fields
        txtQty = new JTextField();
        txtQty.setBounds(95, 265, 50, 25);
        add(txtQty);

        txtTime = new JTextField();
        txtTime.setBounds(215, 375, 60, 25);
        add(txtTime);

        //Combo Boxes
        cmbCustomer = new JComboBox<>();
        cmbCustomer.setBounds(100, 305, 220, 25);
        add(cmbCustomer);

        cmbUrgency = new JComboBox<>(new String[]{"Normal", "Urgent"});
        cmbUrgency.setBounds(100, 340, 120, 25);
        add(cmbUrgency);

        //Buttons
        btnAddItem = new JButton("Add Item");
        btnAddItem.setBounds(150, 265, 112, 25);
        add(btnAddItem);

        btnRemoveItem = new JButton("Remove Item");
        btnRemoveItem.setBounds(270, 265, 140, 25);
        add(btnRemoveItem);

        btnPlace = new JButton("Place Order");
        btnPlace.setBounds(20, 420, 150, 35);
        add(btnPlace);

        btnBack = new JButton("Back");
        btnBack.setBounds(180, 420, 100, 35);
        add(btnBack);

        //Add to ActionListener
        btnAddItem.addActionListener(this);
        btnRemoveItem.addActionListener(this);
        btnPlace.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            dispose();
        }
    }
}
