import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JPanel buttonPanel = new JPanel();
    JButton openConcertPromoWindowBtn = new JButton();
    JButton purchasedTicketWindowBtn = new JButton();
    JButton openSignupWindowBtn = new JButton();
    JButton openLoginWindowBtn = new JButton();
    WindowManager windowManager = new WindowManager();
    ConfigManager configManager = new ConfigManager();
    final String frameTitle = configManager.getValue("frame.mainMenu.title");
    final String frameHeight = configManager.getValue("frame.default.height");
    final String frameWidth = configManager.getValue("frame.default.width");
    final String purchasedTicketWindowBtnName = configManager.getValue("button.purchasedTicketWindow.name");
    final String purchasedTicketWindowBtnLabel = configManager.getValue("button.purchasedTicketWindow.label");
    final String purchasedTicketWindowBtnAction = configManager.getValue("button.purchasedTicketWindow.action");
    final String openConcertPromoWindowBtnName = configManager.getValue("button.concertPromoWindow.name");
    final String openConcertPromoWindowBtnLabel = configManager.getValue("button.concertPromoWindow.label");
    final String openConcertPromoWindowBtnAction = configManager.getValue("button.concertPromoWindow.action");
    final String openSignupWindowBtnName = configManager.getValue("button.openSignupWindow.name");
    final String openSignupWindowBtnLabel = configManager.getValue("button.openSignupWindow.label");
    final String openSignupWindowBtnAction = configManager.getValue("button.openSignupWindow.action");
    final String openLoginWindowBtnName = configManager.getValue("button.openLoginWindow.name");
    final String openLoginWindowBtnLabel = configManager.getValue("button.openLoginWindow.label");
    final String openLoginWindowBtnAction = configManager.getValue("button.openLoginWindow.action");

    LaunchPage(){

        openConcertPromoWindowBtn.setBounds(100,160,200,40);
        openConcertPromoWindowBtn.setText(openConcertPromoWindowBtnLabel);
        openConcertPromoWindowBtn.setName(openConcertPromoWindowBtnName);
        openConcertPromoWindowBtn.setActionCommand(openConcertPromoWindowBtnAction);
        openConcertPromoWindowBtn.setFocusable(false);
        openConcertPromoWindowBtn.addActionListener(this);
        purchasedTicketWindowBtn.setBounds(100,160,200,40);
        purchasedTicketWindowBtn.setFocusable(false);
        purchasedTicketWindowBtn.setText(purchasedTicketWindowBtnLabel);
        purchasedTicketWindowBtn.setName(purchasedTicketWindowBtnName);
        purchasedTicketWindowBtn.setActionCommand(purchasedTicketWindowBtnAction);
        purchasedTicketWindowBtn.addActionListener(this);
        openSignupWindowBtn.setBounds(100,160,200,40);
        openSignupWindowBtn.setFocusable(false);
        openSignupWindowBtn.setText(openSignupWindowBtnLabel);
        openSignupWindowBtn.setName(openSignupWindowBtnName);
        openSignupWindowBtn.setActionCommand(openSignupWindowBtnAction);
        openSignupWindowBtn.addActionListener(this);
        openLoginWindowBtn.setBounds(100,160,200,40);
        openLoginWindowBtn.setFocusable(false);
        openLoginWindowBtn.setText(openLoginWindowBtnLabel);
        openLoginWindowBtn.setName(openLoginWindowBtnName);
        openLoginWindowBtn.setActionCommand(openLoginWindowBtnAction);
        openLoginWindowBtn.addActionListener(this);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(openConcertPromoWindowBtn);
        buttonPanel.add(openSignupWindowBtn);
        buttonPanel.add(openLoginWindowBtn);
        buttonPanel.add(purchasedTicketWindowBtn);
        frame.add(buttonPanel);
        frame.pack();
        frame.setTitle(frameTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Integer.parseInt(frameWidth),Integer.parseInt(frameHeight));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame.dispose();
        windowManager.navigateTo(e);


    }

}
