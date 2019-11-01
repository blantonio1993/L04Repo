package View;

import Model.Student;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InitialPanel extends JPanel implements ActionListener {

    private ArrayList<JButton> buttons;


    public InitialPanel() {
        super();
        GridLayout layoutOne = new GridLayout(3, 1);
        this.setLayout(layoutOne);

        buttons = new ArrayList<>();
        buttons.add(new JButton("Button 1"));
        buttons.add(new JButton("Button 2"));
        buttons.add(new JButton("Button 3"));

        for (JButton button : buttons) {
            button.addActionListener(this);
            this.add(button);
        }
    }

    public void updateButtonText(ArrayList<Student> sts) {
        for (int i = 0; i < this.buttons.size(); i++) {
            this.buttons.get(i).setText(sts.get(i).toString());
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked:" + e.getActionCommand());

    }

    public ArrayList<JButton> getButtons() {
        return this.buttons;
    }


}

