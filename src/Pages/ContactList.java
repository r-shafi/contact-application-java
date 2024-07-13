package Pages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ContactList {
  public ContactList() {
    JFrame frame = new JFrame("PhoneBook - Contacts");
    frame.setSize(400, 700);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true);

    List<String> lines = null;

    try {
      lines = Files.readAllLines(Paths.get("contacts.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }

    JPanel panel = new JPanel();

    if (lines.isEmpty()) {
      JLabel label = new JLabel("No contacts found.");
      JButton backButton = new JButton("Back");

      panel.add(label);
      panel.add(backButton);

      backButton.addActionListener(e -> back(frame));
    } else {
      for (String line : lines) {
        String[] parts = line.split(",");

        JPanel contactPanel = new JPanel();
        contactPanel.setBorder(BorderFactory.createTitledBorder(parts[0]));
        
        JLabel phoneLabel = new JLabel(parts[1]);
        JLabel emailLabel = new JLabel(parts[2]);
        JButton deleteButton = new JButton("Delete");
        
        contactPanel.add(phoneLabel);
        contactPanel.add(emailLabel);
        contactPanel.add(deleteButton);

        deleteButton.addActionListener(e -> deleteContact(frame, parts[1]));

        panel.add(contactPanel);
      }
    }
    frame.add(panel);
  }

  public void deleteContact(JFrame frame, String number) {
    try {
      List<String> lines = Files.readAllLines(Paths.get("contacts.txt"));
      for (String line : lines) {
        String[] parts = line.split(",");
        if (parts[1].equals(number)) {
          lines.remove(line);
          break;
        }
      }
      Files.write(Paths.get("contacts.txt"), lines);
      JOptionPane.showMessageDialog(frame, "Contact deleted successfully.");
      frame.setVisible(false);
      frame.dispose();
      new ContactList();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public void back(JFrame frame) {
    frame.setVisible(false);
    frame.dispose();
  }
}
