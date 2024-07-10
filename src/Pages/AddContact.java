package Pages;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddContact {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // frame.setBounds(100, 100, 500, 300);
    frame.setSize(400, 700);
    frame.setTitle("Add New Contact");
    frame.setResizable(false);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    Font font = new Font("Arial", Font.PLAIN, 20);

    JLabel label1 = new JLabel("Name");
    label1.setFont(font);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    panel.add(label1, gbc);

    JTextField t1 = new JTextField(20);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    panel.add(t1, gbc);

    JLabel label2 = new JLabel("Number");
    label2.setFont(font);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.NONE;
    panel.add(label2, gbc);

    JTextField t2 = new JTextField(20);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    panel.add(t2, gbc);

    JLabel label3 = new JLabel("Email");
    label3.setFont(font);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.NONE;
    panel.add(label3, gbc);

    JTextField t3 = new JTextField(20);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    panel.add(t3, gbc);

    JButton button = new JButton("Save Contact");
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.CENTER;
    panel.add(button, gbc);

    frame.add(panel);
    frame.setVisible(true);
  }
}
