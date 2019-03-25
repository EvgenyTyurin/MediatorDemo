package evgenyt.mediator_demo.component;

import evgenyt.mediator_demo.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * I have a dog checkbox
 */

public class DogCheck extends JCheckBox implements Component {
    private MyFrame mediator;

    public DogCheck() {
        super("I have a dog");
    }

    @Override
    public String getComponentName() {
        return "DogCheck";
    }

    @Override
    public void setMediator(MyFrame mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        super.fireActionPerformed(event);
        mediator.dogAction(this);
    }
}
