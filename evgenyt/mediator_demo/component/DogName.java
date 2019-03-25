package evgenyt.mediator_demo.component;

import evgenyt.mediator_demo.MyFrame;

import javax.swing.*;

/**
 * Dog name input
 */

public class DogName extends JTextField implements Component {
    private MyFrame mediator;
    @Override
    public void setMediator(MyFrame mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getComponentName() {
        return "DogName";
    }
}
