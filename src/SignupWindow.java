import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton openMainWindowBtn = new JButton();
    JPanel signupPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel userEmailLbl = new JLabel();
    JLabel userPasswordLbl = new JLabel();
    JTextField userEmailTxt = new JTextField(10);
    JTextField userPasswordTxt = new JTextField(10);
    JButton signupSubmitBtn = new JButton();
    JButton signupCancelBtn = new JButton();
    WindowManager windowManager = new WindowManager();
    ConfigManager configManager = new ConfigManager();
    final String frameTitle = configManager.getValue("frame.signupWindow.title");
    final String frameHeight = configManager.getValue("frame.default.height");
    final String frameWidth = configManager.getValue("frame.default.width");
    final String signupPanelTitle = configManager.getValue("panel.signup.title");
    final String openMainWindowBtnName = configManager.getValue("button.mainMenuWindow.name");
    final String openMainWindowBtnLabel = configManager.getValue("button.mainMenuWindow.label");
    final String openMainWindowBtnAction = configManager.getValue("button.mainMenuWindow.action");
    final String userEmailLblName = configManager.getValue("label.userEmail.name");
    final String userEmailLblLbl = configManager.getValue("label.userEmail.label");
    final String userPasswordLblName = configManager.getValue("label.userPassword.name");
    final String userPasswordLblLbl = configManager.getValue("label.userPassword.label");
    final String signupSubmitBtnName = configManager.getValue("button.signupSubmit.name");
    final String signupSubmitBtnLabel = configManager.getValue("button.signupSubmit.label");
    final String signupSubmitBtnAction = configManager.getValue("button.signupSubmit.action");
    final String signupCancelBtnName = configManager.getValue("button.signupCancel.name");
    final String signupCancelBtnLabel = configManager.getValue("button.signupCancel.label");
    final String signupCancelBtnAction = configManager.getValue("button.signupCancel.action");

    SignupWindow() {

        openMainWindowBtn.setBounds(100,160,200,40);
        openMainWindowBtn.setText(openMainWindowBtnLabel);
        openMainWindowBtn.setName(openMainWindowBtnName);
        openMainWindowBtn.setActionCommand(openMainWindowBtnAction);
        openMainWindowBtn.setFocusable(false);
        openMainWindowBtn.addActionListener(this);
        userEmailLbl.setName(userEmailLblName);
        userEmailLbl.setText(userEmailLblLbl);
        userPasswordLbl.setName(userPasswordLblName);
        userPasswordLbl.setText(userPasswordLblLbl);
        signupSubmitBtn.setBounds(100,160,200,40);
        signupSubmitBtn.setFocusable(false);
        signupSubmitBtn.addActionListener(this);
        signupSubmitBtn.setText(signupSubmitBtnLabel);
        signupSubmitBtn.setName(signupSubmitBtnName);
        signupSubmitBtn.setActionCommand(signupSubmitBtnAction);
        signupCancelBtn.setBounds(100,160,200,40);
        signupCancelBtn.setFocusable(false);
        signupCancelBtn.addActionListener(this);
        signupCancelBtn.setText(signupCancelBtnLabel);
        signupCancelBtn.setName(signupCancelBtnName);
        signupCancelBtn.setActionCommand(signupCancelBtnAction);
        signupPanel.setLayout(new GridLayout(3,2));
        signupPanel.add(userEmailLbl);
        signupPanel.add(userEmailTxt);
        signupPanel.add(userPasswordLbl);
        signupPanel.add(userPasswordTxt);
        signupPanel.add(signupSubmitBtn);
        signupPanel.add(signupCancelBtn);
        signupPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupPanel.setPreferredSize(new Dimension(400, 100));
        signupPanel.setMaximumSize(new Dimension(400, 100));
        signupPanel.setBorder(BorderFactory.createTitledBorder(signupPanelTitle));
        frame.getContentPane().add(signupPanel);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(openMainWindowBtn);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(signupPanel,BorderLayout.CENTER);
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
