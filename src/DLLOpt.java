/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */
public class DLLOpt  {
    
    public DoublyNode head;
    public DoublyNode tail;
    public DoublyNode last;
    
        public static int num=1;
    DLLOpt()
    {
        head=null;
        tail=null;
                
    }
    
    public boolean isEmpty()
    {
        return head==null;
    }
    
     public DoublyNode set()
    {
        return head;
    }
    
   
    
    public void insertFirst(String name, String author)
    {
        DoublyNode newNode=new DoublyNode(name, author);
        
        if (isEmpty())
        {
            head=tail=newNode;
        }
        
        else
        {
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
            
        }
    }
    
    public void insertAtEnd(String name, String author)
    {
        DoublyNode newNode=new DoublyNode(name, author);
        if (isEmpty())
        {
            head=tail=newNode;
        }
        
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            newNode.next=null;
            tail=newNode;
        }
        

    }
    
    
     public void DeleteatFirst()
    {
        DoublyNode temp=head;
        
        if (temp.next==null)
        {
            head=null;
        }
        else
        {
            head=temp.next;
            temp.next.prev=null;
            temp.next=null;
        }
            
    }
    
    
    
    
    void deleteNode(DoublyNode del)
    {
    
        if (head == null || del == null) {
            return;
        }
 
     
        if (head == del) {
            head = del.next;
        }
 
      
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
       
        if (del.prev != null) {
            del.prev.next = del.next;
        }
 
        
        return;
    }
    
     public DoublyNode getNode(String n)
    {
         last=head;
        while(last!=null)
        {
            if(last.author==n)     
            {
               return last;
            
            }
            last=last.next;
        }
        return null;
        
    }
    
   
    
    public DoublyNode check(DoublyNode navigate)
    {
            if(navigate.next!=null)
            {
                navigate=navigate.next;
                return navigate;
            }
            
            else{
                if(navigate.prev!=null)
                {
                    navigate=navigate.prev;
                    num=num-1;
                    return navigate;
                    
                }
            
                 else
                {
                    return null;
                }
            }
    }
    
      public DoublyNode forward(DoublyNode navigate)
    {
        if (navigate.next==null)
        {
            return navigate;
        }
        else{
            num=num+1;
        navigate=navigate.next;
        return navigate;
        }
    }
    
    public DoublyNode backward(DoublyNode navigate)
    {
         if (navigate.prev==null)
        {
            return navigate;
        }
        else{
             num=num-1;
        navigate=navigate.prev;
        return navigate;
        }
    }
    
    public DoublyNode moveForward(DoublyNode navigate)
    {
        if (navigate.next==null)
        {
            return null;
        }
        else{
        navigate=navigate.next;
        return navigate;
        }
        
    }
    
    
     
      public void Delete(String key)
    {
        DoublyNode temp=head;
        
        while(temp.next!=null)
        {
            if (temp.name==key)
            {
                break;
            }
            temp=temp.next;
        }
        
         if (head == null || temp == null) {
            return;
        }
 
     
        if (head == temp) {
            head = temp.next;
        }
 
      
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
 
       
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
 
        
        return;
       
    }
      
}

