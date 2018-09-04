package posist;

import java.util.ArrayList;
import posist.NodeFiles.Node;

/**
 *
 * @author Student
 */
public class NodeTree {
    private void addRecursive(Node current, String ownerID, String ownerName, float value) {
        if (current == null) {
            Node genesis = new Node(ownerID, ownerName, value, current);
        }
    
        ArrayList<Node> childNodes = current.getChildReferenceID();
        
        float sum = 0;
        for(Node child : childNodes){
            sum += child.getValue();
        }
        
        if(sum < current.getValue()){
            Node node = new Node(ownerID, ownerName, value, current);
        }else{
            for(Node child : childNodes){
             addRecursive(child, ownerID, ownerName, value);
            }
        }
    }
    
    
}