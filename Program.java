import static java.lang.System.out;

/**
 * Program
 */
public class Program {

    public Program() {
        
        Animal dog = new Dog();
        Animal cat = new Cat();
        Usable steak = new Steak();
        Usable fish = new Fish();
        Usable squishy = new Squishy();
        Usable yarn = new Yarn();

        // Downcasting
        out.println(
            "Steak: " + ((Steak)steak).isConsumed +             // Steak: false
            "\nFish: " + ((Fish)fish).isConsumed +              // Fish: false
            "\nSquishy: " + ((Squishy)squishy).isConsumed +     // Squishy: false
            "\nYarn: " + ((Yarn)yarn).isConsumed                // Yarn: false
        );

        cat.playWith(yarn);     // Purr...
        cat.playWith(squishy);  // Meow...
        cat.playWith(steak);    // Meow...
        cat.playWith(fish);     // Meow...

        cat.eat(fish);          // Purr...
        cat.eat(yarn);          // Meow...
        cat.eat(squishy);       // Meow...
        cat.eat(steak);         // Meow...

        dog.playWith(squishy);  // Wag...
        dog.playWith(yarn);     // Woof...
        dog.playWith(steak);    // Woof...
        dog.playWith(fish);     // Woof...

        dog.eat(steak);         // Wag...
        dog.eat(squishy);       // Woof...
        dog.eat(yarn);          // Woof...
        dog.eat(fish);          // Woof...

        // Downcasting
        out.println(
            "Steak: " + ((Steak)steak).isConsumed +         // Steak: true
            "\nFish: " + ((Fish)fish).isConsumed +          // Fish: true
            "\nSquishy: " + ((Squishy)squishy).isConsumed + // Squishy: true
            "\nYarn: " + ((Yarn)yarn).isConsumed            // Yarn: true
        );
    }

    public static void main(String[] args) {
        
        out.println("Testing an interface...");
        new Program();
    }
}
