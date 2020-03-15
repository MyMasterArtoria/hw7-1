import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
        
    }

    @Test
    public void remove() {
    	ArrayDictionary dict0 = new ArrayDictionary(0);
    	
        assertTrue(false);  // place holder
    }

    @Test
    public void contains() {
    	ArrayDictionary dict0 = new ArrayDictionary(0);
    	boolean set1a=dict0.contains(-1);
    	boolean set1b=dict0.contains(0);
    	boolean set1c=dict0.contains(1);
    	 assertEquals(set1a,false);
    	 assertEquals(set1b,false);
    	 assertEquals(set1c,false);
    	
    	 ArrayDictionary dict1 = new ArrayDictionary(1);
   	 	 dict1.add(0, 103);
    	 boolean set2a= dict1.contains(2);
    	 boolean set2b= dict1.contains(0);
    	 assertEquals(set2a,false);
    	 assertEquals(set2b,true);
    	 
    	 ArrayDictionary dict2 = new ArrayDictionary(2);
   	 	 dict2.add(0, 103);dict2.add(1, 105);
    	 boolean set3a= dict2.contains(0);
    	 boolean set3b= dict2.contains(1);
    	 boolean set3c= dict2.contains(2);
    	 boolean set3d= dict2.contains(3);
    	 assertEquals(set3a,true);
    	 assertEquals(set3b,true);
    	 assertEquals(set3c,false);
    	 assertEquals(set3d,false);
    	 
    	 ArrayDictionary dict3 = new ArrayDictionary(3);
   	 	 dict3.add(0, 103);dict3.add(1, 105);
    	 boolean set4a= dict3.contains(3);
    	 dict3.add(2, 206);
    	 boolean set4b= dict3.contains(1);
    	 assertEquals(set4a,false);
    	 assertEquals(set4b,true);
    	 
    	 ArrayDictionary dict4 = new ArrayDictionary(3);
   	 	 dict4.add(0, 103);dict4.add(1, 105);dict4.add(2, 206);dict4.add(4, 407);
    	 boolean set5a= dict4.contains(1);
    	 boolean set5b= dict4.contains(4);
    	 boolean set5c= dict4.contains(7);
    	 boolean set5d= dict4.contains(8);
    	 assertEquals(set5a,true);
    	 assertEquals(set5b,true);
    	 assertEquals(set5c,false);
    	 assertEquals(set5d,false);

    }
}