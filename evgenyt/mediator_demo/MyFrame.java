package evgenyt.mediator_demo;

import evgenyt.mediator_demo.component.*;

import javax.swing.*;

/**
 * Mediator class draw and implements logic between gui components
 */

public class MyFrame extends JFrame {

    private DogCheck dogCheck;
    private DogName dogName;
    private CatCheck catCheck;
    private CatName catName;

    /** Add new gui component */
    void registerComponent(Component component) {
        add((java.awt.Component) component);
        component.setMediator(this);
        switch (component.getComponentName()) {
            case "DogCheck":
                dogCheck = (DogCheck) component;
                dogCheck.setBounds(10, 10, 100, 20);
                break;
            case "DogName":
                dogName = (DogName) component;
                dogName.setBounds(150, 10, 100, 20);
                dogName.setVisible(false);
                break;
            case "CatCheck":
                catCheck = (CatCheck) component;
                catCheck.setBounds(10, 30, 100, 20);
                break;
            case "CatName":
                catName = (CatName) component;
                catName.setBounds(150, 30, 100, 20);
                catName.setVisible(false);
                break;
        }
    }

    public void dogAction(Component component) {
        dogName.setVisible(((JCheckBox) component).isSelected());
        catCheck.setEnabled(!((JCheckBox) component).isSelected());
    }

    public void catAction(Component component) {
        catName.setVisible(((JCheckBox) component).isSelected());
        dogCheck.setEnabled(!((JCheckBox) component).isSelected());
    }
}
