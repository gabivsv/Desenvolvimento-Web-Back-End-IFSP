package br.edu.ifsp.graphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifsp.graphql.model.Human;
import br.edu.ifsp.graphql.repository.HumanRepository;

@Service
public class HeroService {
    private final HumanRepository humanRepository;

    public HeroService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public List<Human> getAllHumans() {
        return humanRepository.findAllHumans();
    }

    public List<Human> getAllHeroes() {
        return humanRepository.findAllHumans();
    }

    public Human getHeroById(String id) {
        return humanRepository.findHumanById(id);
    }

    public Human createHuman(Human human) {
        humanRepository.saveHuman(human);
        return human;
    }

    public Human updateHuman(Human human) {
        humanRepository.updateHuman(human);
        return human;
    }

    public void deleteHuman(String id) {
        humanRepository.deleteHuman(id);
    }
}
