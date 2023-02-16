package Controllers;

import model.Superhero;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.SuperheltService;

import java.util.List;

@Controller
public class SuperheroController {

    private SuperheltService superheltService = new SuperheltService();

    public SuperheroController(SuperheltService superheltService){
        this.superheltService = superheltService;
    }
    @GetMapping("/")
    public ResponseEntity<List<Superhero>> allSuperheroes(){
        System.out.println("Test");
        List<Superhero> superheroes = superheltService.getSuperhero();
        return new ResponseEntity<>(superheroes,HttpStatus.OK);
    }

}
