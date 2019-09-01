/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Vidiskiu
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.addNode(new Node(5));
        tree.addNode(new Node(4));
        tree.addNode(new Node(6));
        tree.addNode(new Node(7));
        tree.addNode(new Node(3));
        
        System.out.println(Tree.searchValue(tree.root,1));
    }
    
}
