package posist;

import java.util.ArrayList;
import java.util.Date;
import java.lang.*;
import java. util. Date;
import java. sql. Timestamp;
import java.util.HashMap;

public class Posist
{
    class Key {
    String key;
    Key(String key)
    {
        this.key = key;
    }
 
    @Override
    public int hashCode()
    {
        int hash = (int)key.charAt(0);
        System.out.println("hashCode for key: "
                           + key + " = " + hash);
        return hash;
    }
 
    @Override
    public boolean equals(Object obj)
    {
        return key.equals(((Key)obj).key);
    }
}
   class Node
   {
       int data;
       int nodeNumber;
       String NodeID;
        String childRefNodeID;
       String genesisRefNode;
       String Hashvalue;
       String refNodeID;
       Date timestamp;
       
      
       ArrayList<Node> link=new ArrayList();
        int Nodenum;
       public Node(Date timestamp,int data,int node,String nodeID, String refNodeID, String childRefID,String genesisRefNode)
       {
           this.refNodeID=refNodeID;
           this.childRefNodeID=childRefID;
            this.NodeID=nodeID;
           this.data=data;
           this.nodeNumber=node;
           
           this.timestamp=timestamp;
          
           this.genesisRefNode=genesisRefNode;
           String h=data+node+nodeID+refNodeID+childRefID+genesisRefNode+timestamp;
           this.Hashvalue=this.getHashValue(h);
          
       }
      
       public String getHashvalue(String s)
       {
           int ans=s.hashCode();
           String k=ans+"";
           return k;
       }
      
       public void createNode(Node A,Date timestamp,int data,int node,String nodeID, String refNodeID, String childRefID,String genesisRefNode)
       {
           Nodenum++;
           if(A==null)
           {
               genesis=new Node(timestamp,data,node,nodeID,refNodeID,childRefID,genesisRefNode);
           }   
           Node temp=new Node(timestamp,data,node,nodeID,refNodeID,childRefID,genesisRefNode);
           String pid=refNodeID;
           Node parent=findparent(pid);
           int i=0;
           int n=this.link.size();
           int sum=0;
           while(i<n)
           {
               Node n1=this.link.get(i);
               sum=sum+n1.data;
           }
           if(this.data>(parent.data-sum))
           {
              
           }
       }

        private String getHashValue(String h) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Node findparent(String pid) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   }
   
   Node genesis;
    public static void main(String[] args) {
        // TODO code application logic here
        Posist pos=new Posist();
        Date date= new Date();
long time = date. getTime();
System. out. println("Time in Milliseconds: " + time);
Timestamp ts = new Timestamp(time);
System. out. println("Current Time Stamp: " + ts);
         HashMap map = new HashMap();
         Key k = new Key();
        map.put(new Key("date"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);
 
        System.out.println();
        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
    }
   
}

