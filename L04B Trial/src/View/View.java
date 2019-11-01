package View;

        import Model.Student;

        import javax.swing.*;
        import java.awt.*;
        import java.util.ArrayList;

public class View {
    private InitialPanel ip;

    public View() {
        this.console("View Loaded");

        JFrame frame = new JFrame("FrameDemo"); // creates a new frame called "FrameDemo"

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the frame to exit on close

        ip = new InitialPanel(); // creates a new panel called ip (initial panel)
        frame.add(ip); //adds the button panel to the j frame

        frame.setSize(640, 480); // creates the default size of the frame
        frame.setVisible(true); //makes the frame visible on the panel
    }


    public void console(String text) {
        System.out.println("++" + text);
    }

    public void updateButtonText(ArrayList<Student> students) {
        ip.updateButtonText(students);
    }

    public InitialPanel getInitialPanel() {
        return ip;
    }
}



