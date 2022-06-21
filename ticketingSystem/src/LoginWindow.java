import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton openMainWindowBtn = new JButton();
//    JButton submitLoginBtn = new JButton();
    JPanel loginPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel userEmailLbl = new JLabel();
    JLabel userPasswordLbl = new JLabel();
    JTextField userEmailTxt = new JTextField(10);
    JTextField userPasswordTxt = new JTextField(10);
    JButton loginSubmitBtn = new JButton();
    JButton loginCancelBtn = new JButton();
    WindowManager windowManager = new WindowManager();
    ConfigManager configManager = new ConfigManager();
    final String frameTitle = configManager.getValue("frame.loginWindow.title");
    final String frameHeight = configManager.getValue("frame.default.height");
    final String frameWidth = configManager.getValue("frame.default.width");
    final String loginPanelTitle = configManager.getValue("panel.login.title");
    final String openMainWindowBtnName = configManager.getValue("button.mainMenuWindow.name");
    final String openMainWindowBtnLabel = configManager.getValue("button.mainMenuWindow.label");
    final String openMainWindowBtnAction = configManager.getValue("button.mainMenuWindow.action");
//    final String submitLoginBtnName = configManager.getValue("button.submitLogin.name");
//    final String submitLoginBtnLabel = configManager.getValue("button.submitLogin.label");
//    final String submitLoginBtnAction = configManager.getValue("button.submitLogin.action");
    final String userEmailLblName = configManager.getValue("label.userEmail.name");
    final String userEmailLblLbl = configManager.getValue("label.userEmail.label");
    final String userPasswordLblName = configManager.getValue("label.userPassword.name");
    final String userPasswordLblLbl = configManager.getValue("label.userPassword.label");
    final String loginSubmitBtnName = configManager.getValue("button.loginSubmit.name");
    final String loginSubmitBtnLabel = configManager.getValue("button.loginSubmit.label");
    final String loginSubmitBtnAction = configManager.getValue("button.loginSubmit.action");
    final String loginCancelBtnName = configManager.getValue("button.loginCancel.name");
    final String loginCancelBtnLabel = configManager.getValue("button.loginCancel.label");
    final String loginCancelBtnAction = configManager.getValue("button.loginCancel.action");

    LoginWindow(){

        openMainWindowBtn.setBounds(100,160,200,40);
        openMainWindowBtn.setText(openMainWindowBtnLabel);
        openMainWindowBtn.setName(openMainWindowBtnName);
        openMainWindowBtn.setActionCommand(openMainWindowBtnAction);
        openMainWindowBtn.setFocusable(false);
        openMainWindowBtn.addActionListener(this);
//        submitLoginBtn.setBounds(100,160,200,40);
//        submitLoginBtn.setFocusable(false);
//        submitLoginBtn.setText(submitLoginBtnLabel);
//        submitLoginBtn.setName(submitLoginBtnName);
//        submitLoginBtn.setActionCommand(submitLoginBtnAction);
//        submitLoginBtn.addActionListener(this);
        userEmailLbl.setName(userEmailLblName);
        userEmailLbl.setText(userEmailLblLbl);
        userPasswordLbl.setName(userPasswordLblName);
        userPasswordLbl.setText(userPasswordLblLbl);
        loginSubmitBtn.setBounds(100,160,200,40);
        loginSubmitBtn.setText(loginSubmitBtnLabel);
        loginSubmitBtn.setName(loginSubmitBtnName);
        loginSubmitBtn.setActionCommand(loginSubmitBtnAction);
        loginSubmitBtn.setFocusable(false);
        loginSubmitBtn.addActionListener(this);
        loginCancelBtn.setBounds(100,160,200,40);
        loginCancelBtn.setText(loginCancelBtnLabel);
        loginCancelBtn.setName(loginCancelBtnName);
        loginCancelBtn.addActionListener(this);
        loginCancelBtn.setActionCommand(loginCancelBtnAction);
        loginCancelBtn.setFocusable(false);
        loginPanel.setLayout(new GridLayout(3,2));
        loginPanel.add(userEmailLbl);
        loginPanel.add(userEmailTxt);
        loginPanel.add(userPasswordLbl);
        loginPanel.add(userPasswordTxt);
        loginPanel.add(loginSubmitBtn);
        loginPanel.add(loginCancelBtn);
        loginPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.setPreferredSize(new Dimension(400, 100));
        loginPanel.setMaximumSize(new Dimension(400, 100));
        loginPanel.setBorder(BorderFactory.createTitledBorder(loginPanelTitle));
        frame.getContentPane().add(loginPanel);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(openMainWindowBtn);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(loginPanel,BorderLayout.CENTER);
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
