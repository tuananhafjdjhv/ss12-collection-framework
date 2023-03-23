package thuc_hanh.tim_kiem_nhi_phan;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
