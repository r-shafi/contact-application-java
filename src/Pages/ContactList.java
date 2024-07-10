package Pages;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContactList {
  public ContactList() {
    JFrame frame = new JFrame("PhoneBook - Contacts");
    frame.setSize(400, 700);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 1));

    JLabel label = new JLabel("Todo: Display Contact List");
    panel.add(label);

    JButton backButton = new JButton("Back");
    panel.add(backButton);

    frame.add(panel);

    backButton.addActionListener(e -> back(frame));
  }

  public void back(JFrame frame) {
    frame.setVisible(false);
    frame.dispose();
  }
}
