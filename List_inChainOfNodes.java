/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     public List_inChainOfNodes () {
        headReference = null;
     }

    /**
      @return the number of elements in this list
     */
    public int size() {
        int size = 0;
        Node currentNode = headReference;
        if (headReference == null) {
          return 0;
        } else {
          while (currentNode.getReferenceToNextNode() != null) {
            size++;
            currentNode = currentNode.getReferenceToNextNode();
          }
          return ++size;
        }
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
      String strRep = "[";
      Node currentNode = headReference;
      if (headReference == null) {
        return (strRep + "]");
      }
      while (currentNode.getReferenceToNextNode() != null) {
        strRep += currentNode.getCargoReference() + ",";
      }
      return (strRep + "]");
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
      Node newNode = new Node(val);
      headReference = newNode;
      return true;
     }
}