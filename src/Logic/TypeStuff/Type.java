package Logic.TypeStuff;

public class Type {

    public enum types {
        normal, water, grass, fire,
        fighting, flying, poison, ground,
        rock, bug, ghost, electric,
        physic, ice, dragon, dark,
        steel, fairy;
    }

    private String name;
    public Type(final String type){
        this.name = type;
    }

    public Type(types type){
        setType(String.valueOf(type));
    }

    public String getType(){
        return this.name;
    }
    public void setType(final String type){
        this.name = type;
    }

    public boolean isSuperEffective(Type other){
        if(this.getType().equals("normal")){
            //normal doesn't beat anything
            return false;
        }
        else if(this.getType().equals("fire")){
            return other.getType().equals("grass") ||
                    other.getType().equals("ice") ||
                    other.getType().equals("bug") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("water")){
            return other.getType().equals("fire") ||
                    other.getType().equals("ground") ||
                    other.getType().equals("rock");
        }
        else if(this.getType().equals("electric")){
            return other.getType().equals("water") ||
                    other.getType().equals("flying");
        }
        else if(this.getType().equals("grass")){
            return other.getType().equals("water") ||
                    other.getType().equals("ground") ||
                    other.getType().equals("rock");
        }
        else if(this.getType().equals("ice")){
            return other.getType().equals("grass") ||
                    other.getType().equals("ground") ||
                    other.getType().equals("flying") ||
                    other.getType().equals("dragon");
        }
        else if(this.getType().equals("fighting")){
            return other.getType().equals("normal") ||
                    other.getType().equals("ice") ||
                    other.getType().equals("rock") ||
                    other.getType().equals("dark") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("poison")){
            return other.getType().equals("grass") ||
                    other.getType().equals("fairy");
        }
        else if(this.getType().equals("ground")){
            return other.getType().equals("fire") ||
                    other.getType().equals("electric") ||
                    other.getType().equals("poison") ||
                    other.getType().equals("rock") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("flying")){
            return other.getType().equals("grass") ||
                    other.getType().equals("fighting") ||
                    other.getType().equals("bug");
        }
        else if(this.getType().equals("physic")){
            return other.getType().equals("fighting") ||
                    other.getType().equals("poison");
        }
        else if(this.getType().equals("bug")){
            return other.getType().equals("grass") ||
                    other.getType().equals("physic") ||
                    other.getType().equals("dark");
        }
        else if(this.getType().equals("rock")){
            return other.getType().equals("fire") ||
                    other.getType().equals("ice") ||
                    other.getType().equals("flying") ||
                    other.getType().equals("bug");
        }
        else if(this.getType().equals("ghost")){
            return other.getType().equals("physic") ||
                    other.getType().equals("ghost");
        }
        else if(this.getType().equals("dragon")){
            return other.getType().equals("dragon");
        }
        else if(this.getType().equals("dark")){
            return other.getType().equals("physic") ||
                    other.getType().equals("ghost");
        }
        else if(this.getType().equals("steel")){
            return other.getType().equals("ice") ||
                    other.getType().equals("rock") ||
                    other.getType().equals("fairy");
        }
        else if(this.getType().equals("fairy")){
            return other.getType().equals("fighting") ||
                    other.getType().equals("dragon") ||
                    other.getType().equals("dark");
        }
        else
            return false;
    }
    public boolean isNotEffective(Type other){
        //TODO do this
        if(this.getType().equals("normal")){
            return other.getType().equals("rock") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("fire")){
            return other.getType().equals("fire") ||
                    other.getType().equals("water") ||
                    other.getType().equals("rock") ||
                    other.getType().equals("dragon");
        }
        else if(this.getType().equals("water")){
            return other.getType().equals("water") ||
                    other.getType().equals("grass") ||
                    other.getType().equals("dragon");
        }
        else if(this.getType().equals("electric")){
            return other.getType().equals("electric") ||
                    other.getType().equals("grass")||
                    other.getType().equals("dragon");
        }
        else if(this.getType().equals("grass")){
            return other.getType().equals("fire") ||
                    other.getType().equals("grass") ||
                    other.getType().equals("poison") ||
                    other.getType().equals("flying") ||
                    other.getType().equals("bug")||
                    other.getType().equals("dragon") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("ice")){
            return other.getType().equals("fire") ||
                    other.getType().equals("water") ||
                    other.getType().equals("ice") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("fighting")){
            return other.getType().equals("poison") ||
                    other.getType().equals("flying") ||
                    other.getType().equals("physic") ||
                    other.getType().equals("bug") ||
                    other.getType().equals("fairy");
        }
        else if(this.getType().equals("poison")){
            return other.getType().equals("poison") ||
                    other.getType().equals("ground")||
                    other.getType().equals("rock")||
                    other.getType().equals("ghost");
        }
        else if(this.getType().equals("ground")){
            return other.getType().equals("grass") ||
                    other.getType().equals("bug");
        }
        else if(this.getType().equals("flying")){
            return other.getType().equals("electric") ||
                    other.getType().equals("rock") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("physic")){
            return other.getType().equals("physic") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("bug")){
            return other.getType().equals("fire") ||
                    other.getType().equals("fighting") ||
                    other.getType().equals("poison")||
                    other.getType().equals("flying") ||
                    other.getType().equals("ghost")||
                    other.getType().equals("steel") ||
                    other.getType().equals("fairy");
        }
        else if(this.getType().equals("rock")){
            return other.getType().equals("fighting") ||
                    other.getType().equals("ground") ||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("ghost")){
            return other.getType().equals("dragon");
        }
        else if(this.getType().equals("dragon")){
            return other.getType().equals("steel");
        }
        else if(this.getType().equals("dark")){
            return other.getType().equals("fighting") ||
                    other.getType().equals("dark") ||
                    other.getType().equals("fairy");
        }
        else if(this.getType().equals("steel")){
            return other.getType().equals("fire") ||
                    other.getType().equals("water") ||
                    other.getType().equals("electric")||
                    other.getType().equals("steel");
        }
        else if(this.getType().equals("fairy")){
            return other.getType().equals("fire") ||
                    other.getType().equals("poison") ||
                    other.getType().equals("steel");
        }
        else
            return false;
    }
    public boolean isNoEffect(Type other){
        if(this.getType().equals("normal") ||
            this.getType().equals("fighting")){
            //normal and fighting don't effect ghost
            return other.getType().equals("ghost");
        }
        if(this.getType().equals("ghost")){
            //ghost doesn't effect normal
            return other.getType().equals("normal");
        }
        if(this.getType().equals("electric")){
            return other.getType().equals("ground");
        }
        if(this.getType().equals("poison")){
            return other.getType().equals("steel");
        }
        if(this.getType().equals("ground")){
            return other.getType().equals("flying");
        }
        if(this.getType().equals("physic")){
            return other.getType().equals("dark");
        }
        if(this.getType().equals("dragon")){
            return other.getType().equals("fairy");
        }

        return false;
    }


}
