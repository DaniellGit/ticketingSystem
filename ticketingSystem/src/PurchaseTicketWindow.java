
import javax.swing.*;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class PurchaseTicketWindow implements ActionListener {

    JFrame frame = new JFrame();
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
        frame.getContentPane().add(openMainWindowBtn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.getContentPane().setLayout(null);
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		booking sf = new booking();
        		sf.setVisible(true);
        		frame.dispose();
        	}
        });
        button.setBounds(140, 143, 113, 77);
        
        frame.getContentPane().add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame.dispose();
        windowManager.navigateTo(e);

    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
