package zookeeper.zookeeper1;

public class Ninja extends Human {

    public Ninja(){
        setStealth(10);
    }

    public void steal(Human human){
        int targetsHealth = human.getHealth();
        human.setHealth(targetsHealth - this.getStealth());
        int ninjaHealth = getHealth();
        setHealth(ninjaHealth + this.getStealth());
    }

    public void run(){
        int ninjaHealth = getHealth();
        setHealth(ninjaHealth - 10);
    }
    
}