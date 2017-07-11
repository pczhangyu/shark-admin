import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pczhangyu on 2017/7/11.
 */
@RestController("/bootDemo")
@EnableAutoConfiguration
public class BootDemo {


    @RequestMapping(value = "test")
    public String bootTest(){
        return "SUCCESS";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
