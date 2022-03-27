
package io.github.shantoswe029.personal;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class FileInputOutputAssignmentGUI extends JFrame implements ActionListener{

    private JTextField locationField;
    private JTextArea textArea;
    private BaseButton btnOpen, btnSave, btnClear;
    private Container cp;
    private Font f;
    private String fileName;

    FileInputOutputAssignmentGUI() {
        this.setLayout(null);
        this.setSize(600, 600);
        this.setTitle("Notepad");
        this.setLocationRelativeTo(null);
        cp = this.getContentPane();

        init();
    }

    private void init() {
        // font
        f = new Font("Courier New", Font.PLAIN, 16);

        initTextField();
        initTextArea();
        initButtons();
    }

    private void initButtons() {
        btnOpen = new BaseButton(cp, "Open", 450, 50, 100, 50);
        btnSave = new BaseButton(cp, "Save", 50, 500, 100, 50);
        btnClear = new BaseButton(cp, "Clear", 450, 500, 100, 50);

        btnOpen.addActionListener(this);
        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
    }

    private void initTextArea() {
        textArea = new JTextArea();
        textArea.setSize(500, 300);
        textArea.setFont(f);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setVisible(true);
        scrollPane.setBounds(50, 150, 500, 300);
        cp.add(scrollPane);
    }

    private void initTextField() {
        locationField = new JTextField();
        locationField.setBounds(50, 50, 350, 50);
        locationField.setFont(f);
        cp.add(locationField);
    }

    public static void main(String[] args) {
        FileInputOutputAssignmentGUI frame = new FileInputOutputAssignmentGUI();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if( e.getSource() == btnOpen ) {
            fileName = locationField.getText();
            try {
                BufferedReader inputStr = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(fileName)
                        )
                );
                String myText = "";
                String temp;
                while( (temp = inputStr.readLine()) != null ) {
                    myText += temp + "\n";
                }
                textArea.setText(myText);
                inputStr.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if( e.getSource() == btnSave ) {
            String editedText = textArea.getText();
            fileName = locationField.getText();
            try {
                BufferedWriter outputStr = new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(fileName)
                        ));

                outputStr.write(editedText);
                outputStr.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if( e.getSource() == btnClear ) {
            textArea.setText("");
            locationField.setText("");
            fileName = null;
        }
    }
}
