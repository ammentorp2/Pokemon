package Logic;

import Logic.MoveStuff.Move;
import Logic.TypeStuff.Type;

import java.util.Vector;

//An actual pokemon itself
public class Pokemon {
    //basic data
    private String name;
    private int dexNumber;

    //battle stuff
    private int level;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private Type primaryType;
    private Type secondaryType;
    private Vector<Move> moves;

    //Leveling up and evolution
    private int xp;
    private Integer xpNeeded;
    private boolean canEvolve;
    private Integer evolutionLevel;

    public Pokemon() {
        name = null;
        dexNumber = 0;
        level = 0;
        attack = 0;
        defense = 0;
        specialAttack = 0;
        specialDefense = 0;
        speed = 0;
        primaryType = null;
        secondaryType = null;
        moves = new Vector<Move>(4);
        xp = 0;
        xpNeeded = 0;
        canEvolve = false;
        evolutionLevel = null;
    }

    public Pokemon(String name){
        this.name = name;
        dexNumber = 0;
        level = 0;
        attack = 0;
        defense = 0;
        specialAttack = 0;
        specialDefense = 0;
        speed = 0;
        primaryType = null;
        secondaryType = null;
        moves = new Vector<Move>(4);
        xp = 0;
        xpNeeded = 0;
        canEvolve = false;
        evolutionLevel = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDexNumber() {
        return dexNumber;
    }

    public void setDexNumber(int dexNumber) {
        this.dexNumber = dexNumber;
    }
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(Type primaryType) {
        this.primaryType = primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public Vector<Move> getMoves() {
        return moves;
    }

    public void setMoves(Vector<Move> moves) {
        this.moves = moves;
    }

    public void addMove(Move move){
        if(this.moves.size() < this.moves.capacity()){
            this.moves.add(move);
        }
        else{
            //TODO
            //Trigger learning a new move sequence
        }
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Integer getXpNeeded() {
        return xpNeeded;
    }

    public void setXpNeeded(Integer xpNeeded) {
        this.xpNeeded = xpNeeded;
    }

    public boolean isCanEvolve() {
        return canEvolve;
    }

    public void setCanEvolve(boolean canEvolve) {
        this.canEvolve = canEvolve;
    }

    public Integer getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setEvolutionLevel(Integer evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }
}
