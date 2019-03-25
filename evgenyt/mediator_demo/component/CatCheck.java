package evgenyt.mediator_demo.component;

import evgenyt.mediator_demo.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * I have a cat checkbox
 */

public class CatCheck extends JCheckBox implements Component {
    private MyFrame mediator;

    public CatCheck() {
        super("I have a cat");
    }

    @Override
    public String getComponentName() {
        return "CatCheck";
    }

    @Override
    public void setMediator(MyFrame mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        super.fireActionPerformed(event);
        mediator.catAction(this);
    }
}
