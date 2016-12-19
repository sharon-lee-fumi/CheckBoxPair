package finaltwo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Xiaowen Li
 */
public class TextFieldPair extends HBox
{
    private TextField tf1;
    private TextField tf2;
    
    public TextFieldPair()
    {
        this(new TextField(), new TextField());
    }
    
    public TextFieldPair(TextField tf1, TextField tf2)
    {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.getChildren().add(this.tf1);
        this.getChildren().add(this.tf2);
        this.tf1.textProperty().addListener(new ChangeText1());
        this.tf2.textProperty().addListener(new ChangeText2());
    }
    
    private class ChangeText1 implements ChangeListener<String>
    {
        @Override
        public void changed(ObservableValue<? extends String> ov,
                String oldValue, String newValue)
        {
            String text = tf1.getText();
            tf2.setText(text);
        }
    }
    
    private class ChangeText2 implements ChangeListener<String>
    {
        @Override
        public void changed(ObservableValue<? extends String> ov,
                String oldValue, String newValue)
        {
            String text = tf2.getText();
            tf1.setText(text);
        }
    }
}
