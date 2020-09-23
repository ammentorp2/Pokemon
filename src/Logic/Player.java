package Logic;

//The player themself
public class Player {
    private String name;
    private boolean gender;
    private Pokemon[] pokemon;

    public Player(){
        name = null;
        gender = false;
        pokemon = new Pokemon[6];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }
}
