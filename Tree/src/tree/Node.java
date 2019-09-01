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
public class Node {
    private int value;
    public Node leftChild;
    public Node rightChild;
    
    public Node(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return this.value;
    }
}
