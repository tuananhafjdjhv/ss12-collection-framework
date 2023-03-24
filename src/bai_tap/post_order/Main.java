package bai_tap.post_order;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("quan");
        tree.insert("khoa");
        tree.insert("ngan");
        tree.insert("tuan");
        tree.insert("minh");
        tree.insert("cha");
        tree.insert("thang");
        System.out.println("Inorder (sorted): ");
        tree.postoder();
        System.out.println("số node là: " + tree.getSize());
        System.out.println(tree);
    }
}
