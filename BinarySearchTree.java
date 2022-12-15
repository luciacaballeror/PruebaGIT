    public class BinarySearchTree {
        // represent the node of binary tree
        public static class Node {
            int key;
            Node left, right;
     
            public Node(int item) {
                // assign item to the new node, set left and rigth children to null
                key = item;
                left = right = null;
            }
        }

        // represent the root of binary tree
        public Node root;

        // BinarySearchTree constructor
        public BinarySearchTree() {
            root = null;
        }

        // factorial() method to calculate factorial of given number
        public String factorial(int n) {
            if (n == 0)
                return 1;
            else
                return (n * factorial(n - 1));
        }

        public static void main(String args[])
        {
           System.out.println("Hola Java...");
        }
    }