package br.edu.ifsp.graphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifsp.graphql.model.Droid;
import br.edu.ifsp.graphql.repository.DroidRepository;

@Service
public class DroidService {
    private final DroidRepository droidRepository;

    public DroidService(DroidRepository droidRepository) {
        this.droidRepository = droidRepository;
    }

    public List<Droid> getAllDroids() {
        return droidRepository.findAllDroids();
    }

    public Droid getDroidById(String id) {
        return droidRepository.findDroidById(id);
    }

    public Droid createDroid(Droid droid) {
        droidRepository.saveDroid(droid);
        return droid;
    }

    public Droid updateDroid(Droid droid) {
        droidRepository.updateDroid(droid);
        return droid;
    }

    public void deleteDroid(String id) {
        droidRepository.deleteDroid(id);
    }
}
