/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     public List_inChainOfNodes () {
     }

    /**
      @return the number of elements in this list
     */
    public int size() {
        int size = 0;
        Node currentNode = headReference;
        if (headReference == null) {
          return size;
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
       return "[" + toString(headReference);
     }

     public String toString(Node reference){
       if(reference == null){
         return "]";
       }
       else return reference.getCargoReference() + "," 
                   + toString(reference.getReferenceToNextNode());
      }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
      Node newNode = new Node(val);
      Node currentHeadReference = headReference;
      headReference = newNode;
      newNode.setReferenceToNextNode(currentHeadReference);
      return true;
     }

     /**
      Get the value of the list at @index

      @return the Object value
     */

      public Object get( int index) {
        int counter = 0;
        Node currentNode = headReference;
        while (counter < index) {
          currentNode = currentNode.getReferenceToNextNode();
          counter ++;
        }
        return currentNode.getCargoReference();
      }

      public void set( int index, Object value) {
        int counter = 0;
        Node currentNode = headReference;
        while (counter < index) {
          currentNode = currentNode.getReferenceToNextNode();
          counter ++;
        }
        currentNode.setCargoReference(value);
      }

      public boolean add ( int index, Object value) {
        if (index <= 0) {
          addAsHead(value);
          return true;
        }
        int counter = 0;
        Node currentNode = headReference;
        while (counter < index - 1) {
          currentNode = currentNode.getReferenceToNextNode();
          counter ++;
        }
        Node newNode = new Node(value, currentNode.getReferenceToNextNode());
        currentNode.setReferenceToNextNode(newNode);
        return true;
      }

      public boolean remove( int index) {
        if (index <= 0) {
          headReference = headReference.getReferenceToNextNode();
          return true;
        }
        int counter = 0;
        Node currentNode = headReference;
        while (counter < index - 1) {
          currentNode = currentNode.getReferenceToNextNode();
          counter ++;
        }
        currentNode.setReferenceToNextNode(currentNode.getReferenceToNextNode().getReferenceToNextNode());
        return true;
      }
}

