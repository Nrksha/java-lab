import java.awt.*;
import java.applet.*;

/*
<applet code="awtdemo" width=500 height=500>
</applet>
*/

public class awtdemo extends Applet {

    public void init() {


        // Labels
        Label label1 = new Label("Login");
        add(label1);

        // Text Fields
        Label lblName = new Label("Enter name:");
        TextField txtName = new TextField(20);
        Label lblPhone = new Label("Enter phone number:");
        TextField txtPhone = new TextField(40);
        Label lblPasswd = new Label("Enter password:");
        TextField txtPasswd = new TextField(40);

        add(lblName);
        add(txtName);
        add(lblPhone);
        add(txtPhone);
        add(lblPasswd);
        add(txtPasswd);

        // Buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Cancel");

        add(button1);
        add(button2);
    }
}
