package View;

import Model.Student;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class InitialPanel extends JPanel
{

    private ArrayList<JButton> buttons;


    public InitialPanel()
    {
        super();
        setBackground(Color.darkGray);
        buttons = new ArrayList<>();
        buttons.add(new JButton("Button 1"));
        buttons.add(new JButton("Button 2"));
        buttons.add(new JButton("Button 3"));

        for (JButton button: buttons){
            this.add(button);
        }



    }

    public void updateButtonText(ArrayList<Student> sts){
        for (int i=0; i <this.buttons.size(); i++){
            this.buttons.get(i).setText(sts.get(i).toString());
        }

    }


}
