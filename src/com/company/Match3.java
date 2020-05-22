package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match3 extends Container {
    private JLabel matchLabel = new JLabel("Atalanta  -  Valencia");
    private JLabel actionLabel = new JLabel("select a bid");
    private JComboBox betsBox;
    private String[] bids = {"W1 -1.56", "X - 4.33", "W2 - 3.89", "TM(2.5) - 1.12", "TL(2.5) - 3.67"};

    private JButton back = new JButton("Back");
    private JButton add = new JButton("Add to Cart");
    private JButton Cart= new JButton("Cart");






    public Match3(){

        setSize(500, 500);
        setLayout(null);

        betsBox = new JComboBox(bids);
        betsBox.setBounds(40,100,200,40);
        add(betsBox);
        matchLabel.setBounds(150,20,200,20);
        add(matchLabel);

        actionLabel.setBounds(40,60,200,20);
        add(actionLabel);

        add.setBounds(350,400,100,30);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matchName = "Atalanta  -  Valencia";
                String bet = (String)betsBox.getSelectedItem();
                BetsCart bets = new BetsCart(matchName, bet);
                Main.add(bets);



            }
        });
        Cart.setBounds(380,440,70,30);
        add(Cart);
        Cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.match3.setVisible(false);
                MainFrame.cart.setVisible(true);
            }
        });


        back.setBounds(40, 20, 70,20);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.match3.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });

    }















}