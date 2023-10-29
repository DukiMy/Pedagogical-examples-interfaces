/**
 * Cat
 */
public class Cat extends Animal {

    @Override
    public void eat(Usable food) {
        if (food.isFoodSafeFor(this)) {
            food.consume();
            makeHappySound();
        } else {
            makeSadSound();
        }
    }

    @Override
    public void playWith(Usable toy) {
        if (toy.isToyEnjoyableFor(this)) {
            toy.consume();
            makeHappySound();
        } else {
            makeSadSound();
        }
    }

    @Override
    public void makeSadSound() {
        System.out.println("Meow...");
    }

    @Override
    public void makeHappySound() {
        System.out.println("Purr...");
    }
}
