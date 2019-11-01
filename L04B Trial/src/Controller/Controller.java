package Controller;


import Model.Model;
import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.console("Controller loaded");

        view.updateButtonText(model.getStudents());


    }

    private void addListeners() {
        for (JButton button : view.getInitialPanel().getButtons()) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    model.randomGPA();

                    view.updateButtonText(model.getStudents());

                    System.out.println("Button clicked: " + e.getActionCommand());

                }
            });
        }
    }


}