package services;

import model.Superhero;
import org.springframework.stereotype.Service;
import repositories.SuperheltRepository;

import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;


    public SuperheltService(){
        this.superheltRepository = new SuperheltRepository();

    }
    public List<Superhero> getSuperhero(){
        return superheltRepository.getHeros();
    }
}
