package zookeeper.zookeeper1;

public class Bat extends Mammal {
    public Bat(){
        this.setEnergyLevel(300);
    }
    public void fly(){
        System.out.println("Flap, flap, flap - bat is flying!");
        int currentenergy = getEnergyLevel();
        setEnergyLevel(currentenergy-50);
    }
    public void eatHumans(){
        System.out.println("Bat ate a human for energy.");
        int currentenergy = getEnergyLevel();
        setEnergyLevel(currentenergy+25);
    }

    public void attachTown(){
        System.out.println("Bat attacks town and loses 100 energy.");
        int currentenergy = getEnergyLevel();
        setEnergyLevel(currentenergy-100);
    }
}