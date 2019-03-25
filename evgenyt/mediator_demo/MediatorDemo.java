package evgenyt.mediator_demo;

import evgenyt.mediator_demo.component.CatCheck;
import evgenyt.mediator_demo.component.CatName;
import evgenyt.mediator_demo.component.DogCheck;
import evgenyt.mediator_demo.component.DogName;
import javax.swing.*;

/**
 * Mediator pattern demo
 * Mar 2019 Tey
 * We have check-buttons and text fields classes, which are connected with complicated logic
 * that we implement in mediator class (MyFrame)
 */

public class MediatorDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.registerComponent(new DogCheck());
        frame.registerComponent(new DogName());
        frame.registerComponent(new CatCheck());
        frame.registerComponent(new CatName());
        frame.setBounds(500, 500, 500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
