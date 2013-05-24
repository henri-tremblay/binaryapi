package org.henri.cocktailfactory.ws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CocktailServiceDemo implements CocktailService {

    @Override
    public List<Cocktail> list() {
        return new ArrayList<Cocktail>(Arrays.asList(new Cocktail("a", "a"), new Cocktail("b", "b")));
    }
}
