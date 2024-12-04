package $package;

import java.io.Serial;
import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;


@Named
@SessionScoped
public class HelloWorld implements Serializable {
    @Serial
    private static final long serialVersionUID = -6913972022251814607L;

    private String s1 = "Hello World!!";

    public String getS1() {
        System.out.println(s1);
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
}