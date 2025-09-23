package br.edu.ifsp.graphql.service;

import br.edu.ifsp.graphql.model.Starship;
import br.edu.ifsp.graphql.repository.StarshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarshipService {
    private final StarshipRepository starshipRepository;

    public StarshipService(StarshipRepository starshipRepository) {
        this.starshipRepository = starshipRepository;
    }

    public List<Starship> getAllStarships() {
        return starshipRepository.findAllStarships();
    }

    public Starship getStarshipById(String id) {
        return starshipRepository.findStarshipById(id);
    }

    public Starship createStarship(Starship starship) {
        starshipRepository.saveStarship(starship);
        return starship;
    }

    public Starship updateStarship(Starship starship) {
        starshipRepository.updateStarship(starship);
        return starship;
    }

    public void deleteStarship(String id) {
        starshipRepository.deleteStarship(id);
    }
}
