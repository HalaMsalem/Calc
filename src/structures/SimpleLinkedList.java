//https://github.com/jakemitchellxyz/Java-Calculator

package structures;

public interface SimpleLinkedList<AnyType> {
    void insert(AnyType x);
    boolean contains(AnyType x);
    AnyType delete(int index);
    AnyType delete(AnyType x);
    AnyType get(int index);
    boolean isEmpty();
    void printList(String title);
}
