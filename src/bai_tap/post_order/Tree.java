package bai_tap.post_order;

public interface Tree<E> {
    boolean insert(E e);
    void postoder();
    int getSize();
}
