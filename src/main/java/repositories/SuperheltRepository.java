package repositories;

import model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class SuperheltRepository {
    public SuperheltRepository() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21));
    }

    private ArrayList<Superhero> heroes = new ArrayList<>();

    public void addArraySuperhero(ArrayList<Superhero> s) {
        heroes = s;
    }

    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
    }

    public Boolean removeSuperhero(int nr) {
        if (nr <= heroes.size()) {
            heroes.remove(nr - 1);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Superhero> getHeros() {
        return heroes;
    }

    public ArrayList<Superhero> searchByAlias(String alias) {
        ArrayList<Superhero> heroList = new ArrayList<>();

        for (Superhero superhero : heroes) {
            if (superhero.getAlias().toLowerCase().contains(alias.toLowerCase())) {
                heroList.add(superhero);
            }
        }
        return heroList;
    }
}

