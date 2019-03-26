/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        //Tests
    		list.set(2,"a");
    		System.out.println("testing set method, expecting Stay: " + list);
    		System.out.println("testing get method, expectint a: " + list.get(2));
    		list.add(3, "d");
    		System.out.println("testing add in middle, expecting Stady: " + list);
    		list.add(0, "!");
    		System.out.println("testing add at beginning, expecting !Stady: " + list);
    		list.add(6, "!");
    		System.out.println("testing add at end, expecting !Stady!: " + list);
    		list.remove(0);
    		System.out.println("remove method, at start, expecting Stady!: " + list);
    		list.remove(3);
    		System.out.println("remove method, at middle, expecting Stay!: " + list);
    		list.remove(1);
    		System.out.println("remove method, at end, expecting Say!: " + list);
        }
}
