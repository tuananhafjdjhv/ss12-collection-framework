package bai_tap.delete_binary;


public class BST<E extends Comparable<E>> extends Abstract_Delete<E> {
    private TreeNode_Delete<E> root;
    private int size;

    private TreeNode_Delete<E> createNewNode(E e) {
        return new TreeNode_Delete<E>(e);
    }

    @Override
    public TreeNode_Delete<E> delete(E e) {
        TreeNode_Delete<E> current = root;
        TreeNode_Delete<E> parent = null;
        while (current.element != e) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        if (e.compareTo(parent.element) < 0) {
            parent.left = current.left;
        } else {
            parent.right = current.right;
        }
        return current;
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode_Delete<E> current = null;
            TreeNode_Delete<E> parent = root;
            while (current.element != e) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else {
                    parent = current;
                    current = current.right;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }

        }
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                ", size=" + size +
                '}' + super.toString();
    }
}

