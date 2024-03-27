package app;

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);

        tree.root.left = new Node(30);
        tree.root.right = new Node(55);

        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(35);
        tree.root.right.left = new Node(53);
        tree.root.right.right = new Node(60);

        tree.root.left.left.left = new Node(10);
        tree.root.left.right.left = new Node(29);
        tree.root.left.right.right = new Node(37);
        tree.root.right.right.right = new Node(62);

        tree.root.left.left.left.right = new Node(15);


        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }

    BinaryTree() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Траверс вліво
        inorder(node.left);
        // Траверс кореневий
        System.out.print(node.item + " ");
        // Траверс вправо
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Траверс кореневий
        System.out.print(node.item + " ");
        // Траверс вліво
        preorder(node.left);
        // Траверс вправо
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;

        // Траверс вліво
        postorder(node.left);
        // Траверс вправо
        postorder(node.right);
        // Траверс кореневий
        System.out.print(node.item + " ");
    }
}
