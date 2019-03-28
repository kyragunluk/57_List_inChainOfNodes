/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
    */
    public List_inChainOfNodes(){
	      headReference = new Node(null);
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        Node nextNode = headReference;
    		   int size = 0;
           while (nextNode.getReferenceToNextNode() != null){
                size++;
                nextNode = nextNode.getReferenceToNextNode();
          }
        return size;
    }


    /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
    */
    public String toString() {
        Node nextNode = headReference;
      		 String result = "[";
      		 while (nextNode.getReferenceToNextNode() != null){
        			 nextNode = nextNode.getReferenceToNextNode();
        			 result += nextNode.getCargoReference() + ",";
    		 }
    		 result += "]";
    return result;
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference.setReferenceToNextNode(new Node(val,
                      headReference.getReferenceToNextNode()));
        return true;
     }

     public Object set(int index, Object val){
         Object returnValue = get(index);
     		 Node thisNode;
         int i;
     		 for (i = 0, thisNode = headReference;
              i <= index;
              i++, thisNode = thisNode.getReferenceToNextNode())
              ;
     		 thisNode.setCargoReference(val);
         return returnValue;
     	 }


     	 public Object get(int index){
         Node thisNode;
         int i;
         for (i = 0, thisNode = headReference;
              i <= index;
              i++, thisNode = thisNode.getReferenceToNextNode())
              ;
         return thisNode.getCargoReference();
     	 }


     	 public boolean add(int index, Object val){
       		 if (index == 0){
       			   addAsHead(val);
       		 }
       		 else{
         			 Node otherNode = new Node(val);
               Node thisNode;
               int i;
               for (i = 0, thisNode = headReference;
                    i <= (index - 1);
                    i++, thisNode = thisNode.getReferenceToNextNode())
                    ;
         			 Node anotherNode = thisNode.getReferenceToNextNode();
         			 thisNode.setReferenceToNextNode(otherNode);
         			 otherNode.setReferenceToNextNode(anotherNode);
       		 }
       		 return true;

     	 }

     	 public boolean remove(int index){
       		 if (index == 0)
       			   headReference = headReference.getReferenceToNextNode();
       		 else{
               Node thisNode;
               int i;
               for (i = 0, thisNode = headReference;
                    i <= (index - 1);
                    i++, thisNode = thisNode.getReferenceToNextNode())
                    ;
       		 Node nextNode = thisNode.getReferenceToNextNode();
       		 thisNode.setReferenceToNextNode(nextNode.getReferenceToNextNode());
       		 }
       		 return true;
     }


}
