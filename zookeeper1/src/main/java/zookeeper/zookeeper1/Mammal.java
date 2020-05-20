package zookeeper.zookeeper1;

public class Mammal {
    private int energyLevel;

    public int getEnergyLevel(){
        System.out.println(this.energyLevel);
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
}