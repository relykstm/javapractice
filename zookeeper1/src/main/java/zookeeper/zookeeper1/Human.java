package zookeeper.zookeeper1;

public class Human {
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public int getStength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public Human(){
        this.stealth = 3;
        this.strength = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void attack(Human human){
        int targetsHealth = human.getHealth();
        human.setHealth(targetsHealth - this.strength);
    }
}