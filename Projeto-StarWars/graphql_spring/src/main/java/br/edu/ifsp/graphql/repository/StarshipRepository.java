package br.edu.ifsp.graphql.repository;

import br.edu.ifsp.graphql.model.Starship;
import java.util.ArrayList;
import java.util.List;

public class StarshipRepository {
    private final List<Starship> starships = new ArrayList<>();

    public List<Starship> findAllStarships() {
        return starships;
    }

    public Starship findStarshipById(String id) {
        return starships.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void saveStarship(Starship starship) {
        starships.add(starship);
    }

    public void updateStarship(Starship starship) {
        deleteStarship(starship.getId());
        starships.add(starship);
    }

    public void deleteStarship(String id) {
        starships.removeIf(s -> s.getId().equals(id));
    }
}
