package View;

import Model.Student;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View
{
    private JFrame frame;
    private JPanel left;
    private JPanel right;

    public View() {
        this.console("View Loaded");

        JFrame frame = new JFrame("FrameDemo"); // creates a new frame called "FrameDemo"

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the frame to exit on close

        GridLayout grid = new GridLayout(1,3); //created a grid layout
        frame.setLayout(grid); // sets the frame layout to the above grid layout

        JPanel left = new JPanel(); // creates a new panel called left
        left.setBackground(Color.PINK); //sets the background color of this panel to pink
        JLabel l1 = new JLabel("a label on the left panel"); //creates a label on this panel with the text given
        left.add(l1); //adds the label to the left panel
        frame.add(left); //adds the left panel to the j frame

        JPanel right = new JPanel(); //creates a new panel called right
        right.setBackground(Color.green); //sets the background color of this panel to green
        JLabel r1 = new JLabel("a label on the right panel"); //creates a label on this panel with the text given
        right.add(r1); //adds the label to the left panel
        frame.add(right);//adds the left panel to the j frame

        frame.setSize(640,480); // creates the default size of the frame
        frame.setVisible(true); //makes the frame visible on the panel
    }


    public void console(String text) {
        System.out.println("++" + text);
    }

    public void addStudentstoPanel(ArrayList<Student> students) {
        for (Student student: students) {
            JLabel label = new JLabel(students.toString());
            right.add(label);
        }



}
}

