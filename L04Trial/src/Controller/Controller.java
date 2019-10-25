package Controller;


import Model.Model;
import View.View;

public class Controller {
    public Controller(Model model, View view) {
        view.console("Controller loaded");

        view.addStudentstoPanel(model.findStudent());


    }
}