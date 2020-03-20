public class BinarySearchTree {

    Node root;

    public void addNode(int key, String name){

        Node newNode = new Node(key,name);
        if (root == null) {
            root = newNode;
        }else{
            Node focusNode = root;
            Node parent;

            while(true){//This is where we start
                parent = focusNode; // Making the comparison logic
                if(key < focusNode.key) { //The smaller side in the tree.
                    focusNode = focusNode.leftChild; //Will create a new entry in the left side, if none can be found.
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }                     //Self explanatory: If left neither is a node nor a smaller entry -> Go Right
                }else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }

    public class Node {

        int key;
        String name;

        Node leftChild;
        Node rightChild;

        Node(int key, String name){
            this.key = key;

            this.name = name;
        }

        public String toString(){
            return name + "has a key " + key;
        }
    }
}
