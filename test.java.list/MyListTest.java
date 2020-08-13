import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {

    MyList<String> myList = new MyArrayList<>();

    List<String> tmp = new ArrayList<>();
    @Test
    public void testAddElement() {
        Assert.assertEquals(0, myList.size());
        Assert.assertTrue(myList.isEmpty());
        myList.add("mazda");
        myList.add("mercedes");
        Assert.assertEquals(2, myList.size());
        Assert.assertFalse(myList.isEmpty());
    }

    @Test
    public void testCheckElementsOrder() {
        Assert.assertEquals(0, myList.size());
        String car1 = "mazda1";
        myList.add(car1);
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(1, myList.size());
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(car2, myList.get(1));
        Assert.assertEquals(2, myList.size());
    }

    @Test
    public void testAddIndexElements() {
        Assert.assertEquals(0, myList.size());
        String car1 = "mazda1";
        myList.add(car1);
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(1, myList.size());
        String car2 = "mazda2";
        myList.add(0, car2);
        Assert.assertEquals(car2, myList.get(0));
        Assert.assertEquals(car1, myList.get(1));
        Assert.assertEquals(2, myList.size());
    }

    @Test
    public void testClear() {
        myList.add("mazda1");
        myList.add("mazda2");
        Assert.assertEquals(2, myList.size());
        myList.clear();
        Assert.assertEquals(0, myList.size());
    }

    @Test
    public void testCheckContainedElement() {
        String car1 = "mazda1";
        myList.add(car1);
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertTrue(myList.contains(car1));
        Assert.assertTrue(myList.contains(car2));
        String car3 = "mazda3";
        Assert.assertFalse(myList.contains(car3));
    }

    @Test
    public void testGetElement() {
        String car1 = "mazda1";
        myList.add(car1);
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(car2, myList.get(1));
    }

    @Test
    public void testIndexOf() {
        String car1 = "mazda1";
        myList.add(car1);
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertEquals(0, myList.indexOf(car1));
        Assert.assertEquals(1, myList.indexOf(car2));
        String car3 = "mazda3";
        Assert.assertEquals(-1, myList.indexOf(car3));
    }

    @Test
    public void testRemoveElement() {
        String car1 = "mazda1";
        myList.add(car1);
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertEquals(2, myList.size());
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(car2, myList.get(1));
        Assert.assertEquals(2, myList.size());
        myList.remove(0);
        Assert.assertEquals(1, myList.size());
        Assert.assertEquals(car2, myList.get(0));
    }

    @Test
    public void testRemoveIndexedElement() {
        String car1 = "mazda1";
        myList.add(car1);
        String car2 = "mazda2";
        myList.add(car2);
        Assert.assertEquals(2, myList.size());
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(car2, myList.get(1));
        Assert.assertEquals(2, myList.size());
        myList.remove(car1);
        Assert.assertEquals(1, myList.size());
        Assert.assertEquals(car2, myList.get(0));
    }

    @Test
    public void testSetElements() {
        Assert.assertEquals(0, myList.size());
        String car1 = "mazda1";
        myList.add(car1);
        Assert.assertEquals(car1, myList.get(0));
        Assert.assertEquals(1, myList.size());
        String car2 = "mazda2";
        myList.add(0, car2);
        Assert.assertEquals(car2, myList.get(0));
        Assert.assertEquals(car1, myList.get(1));
        Assert.assertEquals(2, myList.size());
        String car3 = "mazda3";
        myList.set(0, car3);
        Assert.assertEquals(car3, myList.get(0));
        Assert.assertEquals(car1, myList.get(1));
        Assert.assertEquals(2, myList.size());
    }
}
