package Pages;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddContact {
    public AddContact() {
        JFrame frame = new JFrame("Add New Contact");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(10, 10, 10, 10);

        JLabel nameLabel = new JLabel("Name");
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.anchor = GridBagConstraints.WEST;
        panel.add(nameLabel, constraint);

        JTextField nameInput = new JTextField(20);
        constraint.gridx = 1;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.HORIZONTAL;
        panel.add(nameInput, constraint);

        JLabel phoneLabel = new JLabel("Number");
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.NONE;
        panel.add(phoneLabel, constraint);

        JTextField phoneInput = new JTextField(20);
        constraint.gridx = 1;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.HORIZONTAL;
        panel.add(phoneInput, constraint);

        JLabel emailLabel = new JLabel("Email");
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.NONE;
        panel.add(emailLabel, constraint);
        
        JTextField emailInput = new JTextField(20);
        constraint.gridx = 1;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.HORIZONTAL;
        panel.add(emailInput, constraint);

        JButton button = new JButton("Save Contact");
        constraint.gridx = 1;
        constraint.gridy = 3;
        constraint.fill = GridBagConstraints.NONE;
        constraint.anchor = GridBagConstraints.CENTER;
        panel.add(button, constraint);

        button.addActionListener(e -> submit(frame, nameInput, phoneInput, emailInput));

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void submit(JFrame frame, JTextField name, JTextField number, JTextField email) {
        String nameText = name.getText();
        String numberText = number.getText();
        String emailText = email.getText();

        if (nameText.isEmpty() || numberText.isEmpty() || emailText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields");
        } else {
            if (numberText.matches("^[0-9]{11}$")) {
                if (emailText.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
                    JOptionPane.showMessageDialog(frame, "Contact saved successfully");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid email address");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid phone number");
            }
        }
    }
}
