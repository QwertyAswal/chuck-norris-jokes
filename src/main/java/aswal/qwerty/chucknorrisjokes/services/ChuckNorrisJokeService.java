package aswal.qwerty.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService{
    @Override
    public String getJoke() {
        ChuckNorrisQuotes jokeService = new ChuckNorrisQuotes();
        String joke = jokeService.getRandomQuote();
        return joke;
    }
}
