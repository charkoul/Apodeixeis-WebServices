package gr.apodeixeis.web.services.ApodeixeisWebServices;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiRestController {

    @GetMapping("/healthCheck")
    public String healthCheck() {  return "Status OK!!!";  }
}
