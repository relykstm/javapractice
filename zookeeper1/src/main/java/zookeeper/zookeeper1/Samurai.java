package zookeeper.zookeeper1;

public class Samurai extends Human {
    //health of 200
    //deathblow - decrease targets health to 0
    //meditate - samurai back to 200 health
    //howmany - return number of samurai
    static int numberOfSamurai = 0;
    {
        numberOfSamurai +=1;
    }
    public Samurai(){
        setHealth(200);
    }
    public void deathblow(Human human){
        human.setHealth(0);
    }
    public void meditate(){
        setHealth(200);
    }

    public int howMany(){
        return numberOfSamurai;
    }

}