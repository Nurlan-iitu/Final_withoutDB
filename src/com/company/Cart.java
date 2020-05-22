package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cart extends Container{
    private JTextArea text = new JTextArea();
    private JButton list = new JButton("List");
    private JButton back = new JButton("Back to Menu");
    private JButton clear = new JButton("Clear the cart");



    public Cart() {
        setSize(500,500);
        setLayout(null);

        text.setBounds(100, 100,300,350);

        add(text);


        list.setBounds(100,470,60,30);
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s= "";
                for(int i=0; i<Main.betCount; i++){
                    s+=Main.bets[i]+"\n";
                }
                text.setText(s);
            }
        });
        add(list);

        clear.setBounds(250, 470, 150, 30);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {for (int i=0; i<Main.betCount; i++){
                    Main.betCount = 0;
                }



                }catch (Exception p) {
                }
                String s ="";
                text.setText(s);
            }
        });
        add(clear);







        back.setBounds(40, 20, 150,30);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.cart.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });


    }
}
