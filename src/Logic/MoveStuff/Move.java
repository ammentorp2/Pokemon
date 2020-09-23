package Logic.MoveStuff;

import Logic.TypeStuff.Type;

//Like a pokemon's move itself not battle logic
public class Move {
    private Type moveType; //fire/water/grass
    private String name;
    private Integer power;
    private Integer accuracy;
    private int pp;
    private MoveCategory typeOfMove; //physical/special/status

    public Move(){
        moveType = null;
        name = null;
        power = null;
        accuracy = null;
        pp = 0;
        typeOfMove = MoveCategory.PHYSICAL;
    }

    public Move(Type t, String n, Integer p, Integer a, int pp, MoveCategory m){
        moveType = t;
        name = n;
        power = p;
        accuracy = a;
        this.pp = pp;
        this.typeOfMove = m;
    }


    public Type getMoveType() {
        return moveType;
    }

    public void setMoveType(Type moveType) {
        this.moveType = moveType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public MoveCategory getTypeOfMove() {
        return typeOfMove;
    }

    public void setTypeOfMove(MoveCategory typeOfMove) {
        this.typeOfMove = typeOfMove;
    }

    public boolean isCritical() {
        //TODO make a random number every time
        return false;
    }
}
