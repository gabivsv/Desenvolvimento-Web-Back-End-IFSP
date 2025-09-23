package br.edu.ifsp.graphql.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.graphql.model.Character;
import br.edu.ifsp.graphql.model.Droid;
import br.edu.ifsp.graphql.model.Human;
import br.edu.ifsp.graphql.repository.DroidRepository;
import br.edu.ifsp.graphql.repository.HumanRepository;
import br.edu.ifsp.graphql.repository.StarshipRepository;

@Service
public class SearchService {
    private final HumanRepository humanRepository;
    private final DroidRepository droidRepository;
    private final StarshipRepository starshipRepository;

    public SearchService(HumanRepository humanRepository, DroidRepository droidRepository, StarshipRepository starshipRepository) {
        this.humanRepository = humanRepository;
        this.droidRepository = droidRepository;
        this.starshipRepository = starshipRepository;
    }

    public Character searchCharacterById(String id) {
        Human human = humanRepository.findHumanById(id);
        if (human != null) return human;

        Droid droid = droidRepository.findDroidById(id);
        if (droid != null) return droid;

        return null;
    }
}
