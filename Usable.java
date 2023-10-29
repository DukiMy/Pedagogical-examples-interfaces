/**
 * Item
 */
public interface Usable {

    public abstract boolean isFoodSafeFor(Animal animal);
    public abstract boolean isToyEnjoyableFor(Animal animal);
    public abstract void consume();
    
    default void setConsume() {
        consume();
    }
}
