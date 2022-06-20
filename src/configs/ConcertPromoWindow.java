package configs;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConcertPromoWindow implements ActionListener {

    JFrame frmConcertPromo = new JFrame();
    WindowManager windowManager = new WindowManager();
    Properties prop = new Properties();

//    public static JPanel getBrowserPanel() {
//        JPanel webBrowserPanel = new JPanel(new BorderLayout());
//        JWebBrowser webBrowser = new JWebBrowser();
//        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
//        webBrowser.setBarsVisible(false);
//        webBrowser.navigate("https://www.youtube.com/v/b-Cr0EWwaTk?fs=1");
//        return webBrowserPanel;
//    }

    ConcertPromoWindow(){
        frmConcertPromo.setTitle("Concert Promo");
        frmConcertPromo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConcertPromo.setSize(420,420);
        frmConcertPromo.getContentPane().setLayout(null);
        frmConcertPromo.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //frame.dispose();
        windowManager.navigateTo(e);
        
    }
}
