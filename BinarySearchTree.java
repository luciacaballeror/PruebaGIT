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
        public int factorial(int n) {
            if (n == 0)
                return 1;
            else
                return (n * factorial(n - 1));
        }

        // numOfBST() will calculate the number of binary search trees by calculalting Catalan NUmber for given key
        public int numOfBST(int key) {
            int catalanNumber = factorial(2 * key) / (factorial(key + 1) * factorial(key));
            return catalanNumber;
        }

        public static void main(String args[])
        {
           System.out.println("Hola Java...");
           BinarySearchTree bt = new BinarySearchTree();
           System.out.println("Number of BST for key 3 is: " + bt.numOfBST(3));
        }
    }