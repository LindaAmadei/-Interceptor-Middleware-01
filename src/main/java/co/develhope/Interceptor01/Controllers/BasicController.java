package co.develhope.Interceptor01.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public String time (String LocalDateTime){
        return LocalDateTime;
    }
}
