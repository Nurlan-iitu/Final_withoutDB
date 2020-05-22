package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match1 extends Container{
    private JLabel matchLabel = new JLabel("Borussia D  -  PSG");
    private JLabel actionLabel = new JLabel("select a bid");

    private JButton back = new JButton("Back");
    private JButton add = new JButton("Add to Cart");
    private JButton Cart= new JButton("Cart");

    private JComboBox betsBox;
    private String[] bids = {"W1 - 4.56", "X - 3.23", "W2 - 1.89", "TM(2.5) - 1.5", "TL(2.5) - 2.67"};


   public Match1(){


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
               String matchName = "Borussia D  -  PSG";
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
               MainFrame.match1.setVisible(false);
               MainFrame.cart.setVisible(true);
           }
       });



       back.setBounds(40, 20, 70,20);
       add(back);
       back.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               MainFrame.match1.setVisible(false);
               MainFrame.mainMenu.setVisible(true);
           }
       });


   }











}
