package evgenyt.mediator_demo.component;

import evgenyt.mediator_demo.MyFrame;

/**
 * All gui must have name and mediator
 */

public interface Component {
    void setMediator(MyFrame mediator);
    String getComponentName();
}
