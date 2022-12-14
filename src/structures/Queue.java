//https://github.com/jakemitchellxyz/Java-Calculator

package structures;

public interface Queue<AnyType> {
    boolean isEmpty();
    void enqueue(AnyType x);
    AnyType dequeue();
    AnyType peek();
}
