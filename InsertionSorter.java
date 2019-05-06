/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super( usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for ( int alreadyInserted = 1
            ; alreadyInserted < elements.size()
            ; alreadyInserted++) {
            insert1( alreadyInserted);
        }
    }

  public void insert1( int alreadyInserted) {
      String valueToInsert = elements.get( alreadyInserted);
      boolean drop = false;
      for ( int indexToCompare = alreadyInserted - 1
          ; indexToCompare > -1 && drop != true
          ; indexToCompare--) {
          if ( indexToCompare == 0 && valueToInsert.compareTo( elements.get( 0)) < 0) {
              elements.set( 1, elements.get( 0));
              elements.set( 0, valueToInsert);
              drop = true;
          } else if ( valueToInsert.compareTo( elements.get( indexToCompare)) < 0) {
              elements.set( indexToCompare + 1, elements.get( indexToCompare));
          } else {
              elements.set( indexToCompare + 1, valueToInsert);
              drop = true;
          }
      }
  }

}
