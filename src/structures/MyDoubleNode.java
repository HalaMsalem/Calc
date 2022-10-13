//https://github.com/jakemitchellxyz/Java-Calculator

package structures;

public class MyDoubleNode<AnyType> {
    public AnyType data;
    public MyDoubleNode(AnyType d) { data = d; }
    public MyDoubleNode<AnyType> next = null;
    public MyDoubleNode<AnyType> prev = null;
}
