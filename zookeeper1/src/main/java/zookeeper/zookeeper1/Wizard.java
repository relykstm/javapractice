package zookeeper.zookeeper1;

public class Wizard extends Human{
    //default health of 50 and intelligence of 8
    //method called heal that adds health equla to wizards intelligence
    //method fireball that attacks for 3x intelligence of wizard
    public Wizard(){
        setHealth(50);
        setIntelligence(8);
    }
    public void heal(Human human){
        int targetsHealth = human.getHealth();
        human.setHealth(targetsHealth + this.getIntelligence());
    }
    public void fireball(Human human){
        int targetsHealth = human.getHealth();
        human.setHealth(targetsHealth - this.getIntelligence()*3);
    }

}