/**
  Implement a selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super( usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for ( int index = 0; index < elements.size(); index++) {
            int lowestIndex = champIndex( index);
            String currentVal = elements.get( index);
            elements.set( index, elements.get( lowestIndex));
            elements.set( lowestIndex, currentVal);
        }
    }

    private int champIndex( int startIndex) {
        int champIndex = startIndex;
        String champ = elements.get( startIndex);
        for ( int index = startIndex; index < elements.size(); index++) {
            if ( champ.compareTo( elements.get( index)) > 1)  {
                champIndex = index;  
                champ = elements.get( index);
            }
        }
        return champIndex;
      }

}