package configs;
import javax.swing.*;

import booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class PurchaseTicketWindow implements ActionListener {

    JFrame frame1 = new JFrame();
    JButton openMainWindowBtn = new JButton();
    WindowManager windowManager = new WindowManager();
    ConfigManager configManager = new ConfigManager();
    final String openMainWindowBtnName = configManager.getValue("button.mainMenuWindow.name");
    final String openMainWindowBtnLabel = configManager.getValue("button.mainMenuWindow.label");
    final String openMainWindowBtnAction = configManager.getValue("button.mainMenuWindow.action");
    final String purchasedTicketBtnName = configManager.getValue("button.purchasedTicket.name");
    final String purchasedTicketBtnLabel = configManager.getValue("button.purchasedTicket.label");
    final String purchasedTicketBtnAction = configManager.getValue("button.purchasedTicket.action");
    private final Button button = new Button("Book your ticket now!");

    PurchaseTicketWindow(){

        openMainWindowBtn.setBounds(100,160,200,40);
        openMainWindowBtn.setText(openMainWindowBtnLabel);
        openMainWindowBtn.setName(openMainWindowBtnName);
        openMainWindowBtn.setActionCommand(openMainWindowBtnAction);
        openMainWindowBtn.setFocusable(false);
        openMainWindowBtn.addActionListener(this);
        openMainWindowBtn.setLocation(455, 0);
        frame1.getContentPane().add(openMainWindowBtn);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420,420);
        frame1.getContentPane().setLayout(null);
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		booking sf = new booking();
        		sf.setVisible(true);
        		frame1.dispose();
        	}
        });
        button.setBounds(140, 143, 113, 77);
        
        frame1.getContentPane().add(button);
        frame1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame1.dispose();
        windowManager.navigateTo(e);

    }
}
