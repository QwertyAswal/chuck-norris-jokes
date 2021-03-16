package aswal.qwerty.chucknorrisjokes.controllers;

import aswal.qwerty.chucknorrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService joke;

    @Autowired
    public JokesController(@Qualifier("chuckNorrisJokeService") JokeService joke) {
        this.joke = joke;
    }

    @RequestMapping
    public String getChuckNorrisJoke(Model model){
        model.addAttribute("joke",joke.getJoke());
        return "index";
    }
}
