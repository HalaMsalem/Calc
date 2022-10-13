//https://github.com/jakemitchellxyz/Java-Calculator

package structures;

public interface Stack<AnyType> {
    boolean isEmpty();
    void push(AnyType x);
    AnyType pop();
    AnyType peek();
}
