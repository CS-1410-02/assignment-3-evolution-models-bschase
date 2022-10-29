
//actions
interface Actions{
    public void attack();
    public void walk();
    public void createCreature();
}

// Rabbit "implements" the animal interface
class Rabbit extends Chances implements Actions{

    public void createCreature(){
        System.out.println("Creature has been created");
    }
    public void attack(){
        System.out.println("Creature has attacked");
    }
    
    public void walk(){
        System.out.println("Creature has walked");
    }
    
}

// Chances "implements"
class Chances{
    public void spawnChance(){

    }
    public void deathChance(){

    }
    public void reproduceChance(){

    }
    public void trySpawn(){

    }
    public void tryDeath(){

    }
    public void tryReproduce(){

    }
}

class Game {
    public static void main(String[] args){
        

    }
}