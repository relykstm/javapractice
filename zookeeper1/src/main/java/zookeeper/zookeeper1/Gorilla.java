package zookeeper.zookeeper1;

public class Gorilla extends Mammal {

    public void throwsomething(){
        System.out.println("The Gorilla threw something (used 5 energy) !");
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy-5);
    }

    public void eatBananas(){
        System.out.println("Yummy Banannas, now I have 10 more energy.");
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy+10);
    }

    public void climb(){
        System.out.println("Climbed the tree and burned 10 energy.");
        int currentEnergy = getEnergyLevel();
        setEnergyLevel(currentEnergy-10);
    }
    
}