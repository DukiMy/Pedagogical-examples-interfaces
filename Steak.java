/**
 * Steak
 */
public class Steak extends Food {

    public boolean isConsumed = false;
    
    @Override
    public void consume() {
        isConsumed = true;
    }

    @Override
    public boolean isFoodSafeFor(Animal animal) {
        return animal instanceof Dog ? true : false;
    }
    
@Override
    public boolean isToyEnjoyableFor(Animal animal) {
        return false;
    };
}
