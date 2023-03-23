package bai_tap.delete_binary;



public class TreeNode_Delete<E> {
    protected E element;
    protected TreeNode_Delete<E> left;
    protected TreeNode_Delete<E> right;

    public TreeNode_Delete(E element) {
        this.element= element;
    }

    @Override
    public String toString() {
        return "TreeNode_Delete{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
