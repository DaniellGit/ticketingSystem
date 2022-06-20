import javax.swing.*;
import java.awt.event.ActionEvent;

import static javax.swing.JOptionPane.showMessageDialog;

public class WindowManager {

    JFrame frame = new JFrame();
    ConfigManager configManager = new ConfigManager();
    final String mainMenuWindowAction = configManager.getValue("button.mainMenuWindow.action");
    final String purchasedTicketAction = configManager.getValue("button.purchasedTicket.action");
    final String openPurchasedTicketWindowAction = configManager.getValue("button.purchasedTicketWindow.action");
    final String openConcertPromoWindowAction = configManager.getValue("button.concertPromoWindow.action");
    final String openLoginWindowAction = configManager.getValue("button.openLoginWindow.action");
    final String openSignupWindowAction = configManager.getValue("button.openSignupWindow.action");

    WindowManager() {

    }

    public void navigateTo(ActionEvent e) {

        final String actionId = e.getActionCommand();

        if(actionId.equals(openConcertPromoWindowAction)){

            ConcertPromoWindow concertPromoWindow = new ConcertPromoWindow();

        }
        else if (actionId.equals(openPurchasedTicketWindowAction)){

            PurchaseTicketWindow purchaseTicketWindow = new PurchaseTicketWindow();

        }
        else if (actionId.equals(mainMenuWindowAction)){

              LaunchPage launchPage = new LaunchPage();

        }
        else if (actionId.equals(openLoginWindowAction)){

              LoginWindow loginWindow = new LoginWindow();
        }
        else if (actionId.equals(openSignupWindowAction)){

              SignupWindow signupWindow = new SignupWindow();

        }
        else if (actionId.equals(purchasedTicketAction)){

              showMessageDialog(null, "Under construction");

        }
        else {

            LaunchPage launchPage = new LaunchPage();

          }

    }


}
