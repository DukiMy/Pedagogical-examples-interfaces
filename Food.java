/**
 * Food
 */
public abstract class Food implements Usable {
    @Override
    public abstract boolean isFoodSafeFor(Animal animal);
}
