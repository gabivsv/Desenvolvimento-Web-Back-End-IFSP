package br.edu.ifsp.graphql.controller;

import br.edu.ifsp.graphql.model.Character;
import br.edu.ifsp.graphql.model.Droid;
import br.edu.ifsp.graphql.model.Human;
import br.edu.ifsp.graphql.model.Starship;
import br.edu.ifsp.graphql.service.DroidService;
import br.edu.ifsp.graphql.service.HeroService;
import br.edu.ifsp.graphql.service.SearchService;
import br.edu.ifsp.graphql.service.StarshipService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StarWarsController {

    private final DroidService droidService;
    private final HeroService heroService;
    private final StarshipService starshipService;
    private final SearchService searchService;

    public StarWarsController(DroidService droidService,
                              HeroService heroService,
                              StarshipService starshipService,
                              SearchService searchService) {
        this.droidService = droidService;
        this.heroService = heroService;
        this.starshipService = starshipService;
        this.searchService = searchService;
    }

    // ============================
    // QUERIES
    // ============================

    @QueryMapping
    public List<Human> humans() {
        return heroService.getAllHumans();
    }

    @QueryMapping
    public List<Droid> droids() {
        return droidService.getAllDroids();
    }

    @QueryMapping
    public List<Starship> starships() {
        return starshipService.getAllStarships();
    }

    @QueryMapping
    public Character character(@Argument String id) {
        return searchService.searchCharacterById(id);
    }

    @QueryMapping
    public List<Human> heroes() {
        return heroService.getAllHeroes();
    }

    // ============================
    // MUTATIONS
    // ============================

    @MutationMapping
    public Human createHuman(@Argument String id,
                             @Argument String name,
                             @Argument Float height) {
        Human human = new Human(id, name, height, new ArrayList<>());
        return heroService.createHuman(human);
    }

    @MutationMapping
    public Droid createDroid(@Argument String id,
                             @Argument String name,
                             @Argument String primaryFunction) {
        Droid droid = new Droid(id, name, primaryFunction, new ArrayList<>());
        return droidService.createDroid(droid);
    }

    @MutationMapping
    public Starship createStarship(@Argument String id,
                                   @Argument String name,
                                   @Argument Float length) {
        Starship starship = new Starship(id, name, length);
        return starshipService.createStarship(starship);
    }

    @MutationMapping
    public Character addFriend(@Argument String characterId,
                               @Argument String friendId) {
        Character character = searchService.searchCharacterById(characterId);
        Character friend = searchService.searchCharacterById(friendId);

        if (character != null && friend != null) {
            character.getFriends().add(friend);
            return character;
        }
        return null;
    }
}
