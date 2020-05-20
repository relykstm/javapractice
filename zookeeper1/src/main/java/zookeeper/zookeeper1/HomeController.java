package zookeeper.zookeeper1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin

public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/gorillatest")
    public String gorillaTest() {
        Gorilla George = new Gorilla();
        George.eatBananas();
        George.eatBananas();
        George.eatBananas();
        George.throwsomething();
        George.climb();
        int results = George.getEnergyLevel();
        return "George's Final Energy is " + results + " !!";
    }

    @GetMapping("/battest")
    public String batTest() {
        Bat Dracula = new Bat();
        Dracula.eatHumans();
        Dracula.eatHumans();
        Dracula.attachTown();
        Dracula.attachTown();
        Dracula.fly();

        int results = Dracula.getEnergyLevel();
        return "After eating, attacking and flying - Dracula's energy is: " + results + " !!";
    }

    @GetMapping("/humantest")
    public String humanTest(){
        Human Bob = new Human();
        Human Sam = new Human();

        Bob.attack(Sam);
        Bob.attack(Sam);
        Bob.attack(Sam);

        return "Bob Attacked Same 3 times, leaving Sam with " + Sam.getHealth() + " health.";
    }

    @GetMapping("/master")
    public String masterTest(){
        Wizard Merlin = new Wizard();
        Samurai Sam = new Samurai();
        Ninja Bob = new Ninja();


        Bob.steal(Merlin);
        Bob.steal(Sam);
        int merlinsHealth = Merlin.getHealth();
        int samhealth = Sam.getHealth();

        Sam.deathblow(Merlin);
        Sam.deathblow(Bob);

        int merlinfinal = Merlin.getHealth();
        int bobfinal = Bob.getHealth();

        Sam.meditate();

        int samfinal = Sam.getHealth();


        return "Merlin and sam were attacked by Ninja Bob using steal, reducing their health to: "+ merlinsHealth +" and "+ samhealth + " and then Samurai Sam performed deathblow on all and reduced their health to "+ merlinfinal + "and "+ bobfinal+". Then sam meditated restoring his health to:"+samfinal+". there are this many Samurai: "+ Sam.howMany();
    }
    
    
}