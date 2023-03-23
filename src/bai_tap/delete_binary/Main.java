package bai_tap.delete_binary;

public class Main {
    public static void main(String[] args) {
        BST<String> bst = new BST<>();
        bst.insert("quan");
        bst.insert("tuan anh");
        bst.insert("khoa");
        System.out.println("Inorder (sorted): ");
        System.out.println("The number of nodes is: " + bst.getSize());
        System.out.println(bst);
        System.out.println(bst.delete("Michael"));
        System.out.println(bst);
    }
}
