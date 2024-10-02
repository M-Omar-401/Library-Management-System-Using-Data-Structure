/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */
class Entry
{
    int pin;
    String name;
    
    public Entry (int k, String v)
    {
        pin=k;
        name=v;
    }
}

public class Hash{
    Entry[] hashArray;
    int size;
    int count;
    
    Hash(int s)
    {
        size=s;
        count=0;
        hashArray =new Entry[size];  
    }
    
    int hashFunc(int theKey)
    {
        int hashVal=theKey% size;
        
        if(hashVal<0)
        {
            hashVal=hashVal+size;
            
            
        }
        return hashVal;
    }
    
    boolean isFull()
    {
        return count==size;
    }
    
    void insert(int theKey, String value)
    {
        if (!isFull())
        {
           int hval=hashFunc(theKey);
           
           while (hashArray[hval]!=null)
           {
               ++hval;
               hval=hval%size; 
               
           }
           hashArray[hval]=new Entry(theKey, value);
           count++;
        }
        
        else
        {
            System.out.println("Table is Full. ");
        }
    }
    
  
    public boolean SearchName(String nameCame)
    {
       for (int i=0; i<size; i++)
       {
           if(hashArray[i]!=null)
           {
           if(hashArray[i].name.equals(nameCame))
           {
              return true;
           }
           }
       }
      return false;
    }
    
    public boolean SearchPin(String nameCame,int pinCame)
    {
       for (int i=0; i<size; i++)
       {
           if(hashArray[i]!=null)
           {
           if(hashArray[i].pin==pinCame && hashArray[i].name.equals(nameCame))
           {
              return true;
           }
           }
       }
      return false;
    }
    
    
}