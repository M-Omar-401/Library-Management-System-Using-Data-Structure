/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */
public class DoublyNode {
    
    public String name;
    public String author;
    public DoublyNode next;
    public DoublyNode prev;
    
    DoublyNode(String n, String a)
    {
        name =n;
        author=a;
        next=null;
        prev=null;
    }
      public void displayNode()
    {
        System.out.println(name + " "+author);
    }
  
}


