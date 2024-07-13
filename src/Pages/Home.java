package Pages;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home {
  public Home() {
    JFrame frame = new JFrame("PhoneBook - Home");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 700);
    frame.setResizable(false);
    frame.setVisible(true);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 1));

    JButton addContactButton = new JButton("Add Contact");
    JButton viewContactsButton = new JButton("View Contacts");

    panel.add(addContactButton);
    panel.add(viewContactsButton);

    frame.add(panel);

    addContactButton.addActionListener(e -> addContact());
    viewContactsButton.addActionListener(e -> viewContacts());
  }

  public static void addContact() {
    new AddContact();
  }

  public static void viewContacts() {
    new ContactList();
  }
}
