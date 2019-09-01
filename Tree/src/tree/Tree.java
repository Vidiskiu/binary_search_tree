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
public class Tree {
    public Node root;
    
    public void addNode(Node node)
    {
        if(root==null)
        {
            root = node;
        }
        else
        {
            insertNode(root,node);
        }
    }
    
    public void insertNode (Node parent, Node child)
    {
        if(parent.getValue()>child.getValue())
        {
            if(parent.leftChild==null)
            {
                parent.leftChild = child;
            }
            else
            {
                insertNode(parent.leftChild,child);
            }
        }
        else
        {
            if(parent.rightChild==null)
            {
                parent.rightChild = child;
            }
            else
            {
                insertNode(parent.rightChild,child);
            }
        }
    }
    
    public static boolean searchValue(Node root, int value)
    {
        if(root==null)
        {
            return false;
        }
        else
        {
            if(root.getValue()==value)
            {
                return true;
            }
            else if(root.getValue()>value)
            {
                return searchValue(root.leftChild,value);
            }
            else
            {
                return searchValue(root.rightChild,value);
            }
        }
    }
}
