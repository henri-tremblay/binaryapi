package org.henri.cocktailfactory.ws;

import java.io.Serializable;

public class Cocktail implements Comparable<Cocktail>, Serializable {

    private static final long serialVersionUID = -7887919083211696529L;

    private String name;
    private String description;

    public Cocktail() {
    }

    public Cocktail(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cocktail cocktail = (Cocktail) o;

        return name.equals(cocktail.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Cocktail o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Cocktail " + name;
    }
}
