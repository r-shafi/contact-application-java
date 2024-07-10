package Pages;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home {
  public static void main(String[] args) {
    JFrame frame = new JFrame("PhoneBook - Home");
    frame.setSize(400, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    System.out.println("Add Contact Page");
  }

  public static void viewContacts() {
    new ContactList();
  }
}
