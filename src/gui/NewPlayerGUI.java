package gui;

import engine.NewPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by Marko on 18.12.2014.
 */

public class NewPlayerGUI extends JFrame {
    private JTextField nameField;
    private JButton createButton;
    private JButton exitButton;
    private JTextArea infoField;
    private JPanel rootPanel;

    public NewPlayerGUI() {
        super("New Player");

        setContentPane(rootPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                NewPlayer.createPlayer(name);
                infoField.append("| [Sys] Player created! ");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
