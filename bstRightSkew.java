public class bstRightSkew{
      //Binary search node
    static class Node{
        int key;
        Node left,right;
        };

        //creation of new node
        static Node newNode(int data){
            Node temp = new Node();

            temp.key=data;
            
            temp.left=null;
            temp.right=null;

            return temp;
          }
        
    //Inorder traversal of the binary tree
    public void inOrder(Node root){
         if(root == null){
                return;
            }
        else{
            inOrder(root.left);
            System.out.print(root.key+ " ");
            inOrder(root.right);
                
            }
        }
    public static void main(String[] args) {
        bstRightSkew obj = new bstRightSkew();
        Node root=null;
        //hard code value into the binary tree
        root=newNode(50);
        root.left=newNode(30);
        root.right=newNode(60);
        root.left.left=newNode(10);
        root.right.left=newNode(55);
        System.out.println("Modified BST in Ascending order\n");
        obj.inOrder(root);
        System.out.println("\n\nProgram Completed successfully");
        }       
}
