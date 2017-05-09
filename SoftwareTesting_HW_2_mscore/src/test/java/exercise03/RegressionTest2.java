package exercise03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.lang.Object obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue(obj8);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.lang.Object obj4 = null;
    ringBuffer1.enqueue(obj4);
    int i6 = ringBuffer1.size();
    java.lang.Object obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue(obj7);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    ringBuffer13.enqueue((java.lang.Object)spliterator22);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    java.lang.Object obj25 = ringBuffer13.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj26 = ringBuffer13.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer10.spliterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator15);
    boolean b17 = ringBuffer1.isEmpty();
    boolean b18 = ringBuffer1.isEmpty();
    java.lang.Object obj19 = ringBuffer1.dequeue();
    boolean b20 = ringBuffer1.isEmpty();
    java.util.function.Consumer consumer21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.lang.Object obj7 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    boolean b10 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(10);
    ringBuffer12.enqueue((java.lang.Object)'#');
    int i15 = ringBuffer12.size();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    int i17 = ringBuffer12.size();
    java.lang.Object obj18 = ringBuffer12.dequeue();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    ringBuffer20.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    int i24 = ringBuffer20.size();
    boolean b25 = ringBuffer20.isEmpty();
    boolean b26 = ringBuffer20.isEmpty();
    boolean b27 = ringBuffer20.isEmpty();
    boolean b28 = ringBuffer20.isEmpty();
    int i29 = ringBuffer20.size();
    ringBuffer12.enqueue((java.lang.Object)i29);
    java.util.Iterator iterator31 = ringBuffer12.iterator();
    java.util.Iterator iterator32 = ringBuffer12.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
    java.util.Spliterator spliterator34 = ringBuffer12.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#'+ "'", obj7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + '#'+ "'", obj18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    java.util.Iterator iterator18 = ringBuffer13.iterator();
    java.util.Spliterator spliterator19 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer13.spliterator();
    int i21 = ringBuffer13.size();
    java.util.Spliterator spliterator22 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer13.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    java.util.Spliterator spliterator25 = ringBuffer13.spliterator();
    java.util.function.Consumer consumer26 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer13.forEach(consumer26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator16 = ringBuffer15.iterator();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer15);
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    java.util.Iterator iterator23 = ringBuffer19.iterator();
    java.util.Iterator iterator24 = ringBuffer19.iterator();
    java.util.Spliterator spliterator25 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer19.spliterator();
    int i27 = ringBuffer19.size();
    java.util.Spliterator spliterator28 = ringBuffer19.spliterator();
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(1);
    boolean b31 = ringBuffer30.isEmpty();
    java.util.Spliterator spliterator32 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer30.spliterator();
    java.util.Iterator iterator35 = ringBuffer30.iterator();
    int i36 = ringBuffer30.size();
    int i37 = ringBuffer30.size();
    ringBuffer19.enqueue((java.lang.Object)ringBuffer30);
    java.util.Iterator iterator39 = ringBuffer19.iterator();
    int i40 = ringBuffer19.size();
    java.util.Iterator iterator41 = ringBuffer19.iterator();
    java.lang.Object obj42 = ringBuffer19.dequeue();
    ringBuffer15.enqueue((java.lang.Object)ringBuffer19);
    exercise03.RingBuffer ringBuffer45 = new exercise03.RingBuffer(1);
    ringBuffer45.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator48 = ringBuffer45.spliterator();
    int i49 = ringBuffer45.size();
    boolean b50 = ringBuffer45.isEmpty();
    boolean b51 = ringBuffer45.isEmpty();
    boolean b52 = ringBuffer45.isEmpty();
    boolean b53 = ringBuffer45.isEmpty();
    int i54 = ringBuffer45.size();
    boolean b55 = ringBuffer45.isEmpty();
    java.util.Spliterator spliterator56 = ringBuffer45.spliterator();
    ringBuffer15.enqueue((java.lang.Object)ringBuffer45);
    int i58 = ringBuffer15.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    int i14 = ringBuffer9.size();
    boolean b15 = ringBuffer9.isEmpty();
    boolean b16 = ringBuffer9.isEmpty();
    boolean b17 = ringBuffer9.isEmpty();
    java.util.function.Consumer consumer18 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer9.forEach(consumer18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    java.util.Iterator iterator13 = ringBuffer9.iterator();
    java.util.Iterator iterator14 = ringBuffer9.iterator();
    boolean b15 = ringBuffer9.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    boolean b17 = ringBuffer9.isEmpty();
    boolean b18 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer9.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    java.util.Iterator iterator18 = ringBuffer13.iterator();
    java.util.Spliterator spliterator19 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer13.spliterator();
    int i21 = ringBuffer13.size();
    java.util.Spliterator spliterator22 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer13.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    java.util.Spliterator spliterator25 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    java.util.Iterator iterator31 = ringBuffer27.iterator();
    java.util.Iterator iterator32 = ringBuffer27.iterator();
    java.util.Spliterator spliterator33 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer27.spliterator();
    int i35 = ringBuffer27.size();
    java.util.Spliterator spliterator36 = ringBuffer27.spliterator();
    exercise03.RingBuffer ringBuffer38 = new exercise03.RingBuffer(1);
    boolean b39 = ringBuffer38.isEmpty();
    java.util.Spliterator spliterator40 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator41 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator42 = ringBuffer38.spliterator();
    java.util.Iterator iterator43 = ringBuffer38.iterator();
    int i44 = ringBuffer38.size();
    int i45 = ringBuffer38.size();
    ringBuffer27.enqueue((java.lang.Object)ringBuffer38);
    int i47 = ringBuffer27.size();
    ringBuffer1.enqueue((java.lang.Object)i47);
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    java.util.Iterator iterator55 = ringBuffer50.iterator();
    java.util.Spliterator spliterator56 = ringBuffer50.spliterator();
    java.util.Iterator iterator57 = ringBuffer50.iterator();
    boolean b58 = ringBuffer50.isEmpty();
    exercise03.RingBuffer ringBuffer60 = new exercise03.RingBuffer(1);
    ringBuffer60.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator63 = ringBuffer60.spliterator();
    int i64 = ringBuffer60.size();
    java.util.Spliterator spliterator65 = ringBuffer60.spliterator();
    java.util.Iterator iterator66 = ringBuffer60.iterator();
    java.util.Spliterator spliterator67 = ringBuffer60.spliterator();
    java.util.Iterator iterator68 = ringBuffer60.iterator();
    int i69 = ringBuffer60.size();
    ringBuffer50.enqueue((java.lang.Object)ringBuffer60);
    java.lang.Object obj71 = ringBuffer50.dequeue();
    ringBuffer1.enqueue(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj71);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer9.spliterator();
    java.util.Iterator iterator14 = ringBuffer9.iterator();
    int i15 = ringBuffer9.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    boolean b17 = ringBuffer9.isEmpty();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(1);
    boolean b22 = ringBuffer21.isEmpty();
    java.util.Spliterator spliterator23 = ringBuffer21.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer21.spliterator();
    java.util.Iterator iterator25 = ringBuffer21.iterator();
    boolean b26 = ringBuffer21.isEmpty();
    java.util.Iterator iterator27 = ringBuffer21.iterator();
    ringBuffer19.enqueue((java.lang.Object)iterator27);
    int i29 = ringBuffer19.size();
    boolean b30 = ringBuffer19.isEmpty();
    boolean b31 = ringBuffer19.isEmpty();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.lang.Object obj14 = ringBuffer1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator8 = ringBuffer7.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)spliterator8);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    boolean b15 = ringBuffer10.isEmpty();
    int i16 = ringBuffer10.size();
    java.util.Spliterator spliterator17 = ringBuffer10.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer10);
    java.lang.Object obj19 = ringBuffer1.dequeue();
    java.util.Iterator iterator20 = ringBuffer1.iterator();
    boolean b21 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    int i12 = ringBuffer7.size();
    java.util.function.Consumer consumer13 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer7.forEach(consumer13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    boolean b18 = ringBuffer12.isEmpty();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer20);
    boolean b25 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer12.spliterator();
    boolean b27 = ringBuffer12.isEmpty();
    java.util.Iterator iterator28 = ringBuffer12.iterator();
    java.util.Spliterator spliterator29 = ringBuffer12.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test20"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    boolean b15 = ringBuffer10.isEmpty();
    int i16 = ringBuffer10.size();
    java.util.Spliterator spliterator17 = ringBuffer10.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer10);
    java.lang.Object obj19 = ringBuffer1.dequeue();
    boolean b20 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    boolean b14 = ringBuffer1.isEmpty();
    boolean b15 = ringBuffer1.isEmpty();
    boolean b16 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    boolean b10 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
    java.lang.Object obj15 = ringBuffer1.dequeue();
    java.util.Iterator iterator16 = ringBuffer1.iterator();
    int i17 = ringBuffer1.size();
    java.util.function.Consumer consumer18 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
    int i12 = ringBuffer1.size();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test27"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    java.lang.Object obj12 = null;
    ringBuffer1.enqueue(obj12);
    java.lang.Object obj14 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer16.spliterator();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    boolean b21 = ringBuffer16.isEmpty();
    java.util.Iterator iterator22 = ringBuffer16.iterator();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    java.util.Iterator iterator29 = ringBuffer24.iterator();
    boolean b30 = ringBuffer24.isEmpty();
    ringBuffer16.enqueue((java.lang.Object)ringBuffer24);
    java.util.Spliterator spliterator32 = ringBuffer24.spliterator();
    int i33 = ringBuffer24.size();
    java.util.Iterator iterator34 = ringBuffer24.iterator();
    int i35 = ringBuffer24.size();
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    boolean b38 = ringBuffer37.isEmpty();
    java.util.Spliterator spliterator39 = ringBuffer37.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    java.util.Iterator iterator41 = ringBuffer37.iterator();
    boolean b42 = ringBuffer37.isEmpty();
    int i43 = ringBuffer37.size();
    java.util.Spliterator spliterator44 = ringBuffer37.spliterator();
    exercise03.RingBuffer ringBuffer46 = new exercise03.RingBuffer(1);
    boolean b47 = ringBuffer46.isEmpty();
    java.util.Spliterator spliterator48 = ringBuffer46.spliterator();
    java.util.Spliterator spliterator49 = ringBuffer46.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer46.spliterator();
    java.util.Iterator iterator51 = ringBuffer46.iterator();
    ringBuffer37.enqueue((java.lang.Object)iterator51);
    boolean b53 = ringBuffer37.isEmpty();
    boolean b54 = ringBuffer37.isEmpty();
    java.lang.Object obj55 = ringBuffer37.dequeue();
    exercise03.RingBuffer ringBuffer57 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator58 = ringBuffer57.iterator();
    java.util.Iterator iterator59 = ringBuffer57.iterator();
    int i60 = ringBuffer57.size();
    ringBuffer37.enqueue((java.lang.Object)ringBuffer57);
    boolean b62 = ringBuffer37.isEmpty();
    java.lang.Object obj63 = ringBuffer37.dequeue();
    ringBuffer24.enqueue((java.lang.Object)ringBuffer37);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj63);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    boolean b9 = ringBuffer8.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer8.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer8.spliterator();
    java.util.Iterator iterator12 = ringBuffer8.iterator();
    boolean b13 = ringBuffer8.isEmpty();
    int i14 = ringBuffer8.size();
    java.util.Spliterator spliterator15 = ringBuffer8.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer8.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer8.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer8.spliterator();
    java.util.Iterator iterator19 = ringBuffer8.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer12.spliterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    int i18 = ringBuffer12.size();
    int i19 = ringBuffer12.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
    java.util.Iterator iterator21 = ringBuffer1.iterator();
    int i22 = ringBuffer1.size();
    java.util.Spliterator spliterator23 = ringBuffer1.spliterator();
    java.lang.Object obj24 = ringBuffer1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator16 = ringBuffer15.iterator();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer15);
    java.util.Iterator iterator18 = ringBuffer15.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    boolean b27 = ringBuffer22.isEmpty();
    int i28 = ringBuffer22.size();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator32 = ringBuffer22.spliterator();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(1);
    boolean b35 = ringBuffer34.isEmpty();
    java.util.Spliterator spliterator36 = ringBuffer34.spliterator();
    java.util.Spliterator spliterator37 = ringBuffer34.spliterator();
    java.util.Iterator iterator38 = ringBuffer34.iterator();
    boolean b39 = ringBuffer34.isEmpty();
    int i40 = ringBuffer34.size();
    java.util.Spliterator spliterator41 = ringBuffer34.spliterator();
    exercise03.RingBuffer ringBuffer43 = new exercise03.RingBuffer(1);
    boolean b44 = ringBuffer43.isEmpty();
    java.util.Spliterator spliterator45 = ringBuffer43.spliterator();
    java.util.Spliterator spliterator46 = ringBuffer43.spliterator();
    java.util.Spliterator spliterator47 = ringBuffer43.spliterator();
    java.util.Iterator iterator48 = ringBuffer43.iterator();
    ringBuffer34.enqueue((java.lang.Object)iterator48);
    ringBuffer22.enqueue((java.lang.Object)iterator48);
    boolean b51 = ringBuffer22.isEmpty();
    int i52 = ringBuffer22.size();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer22);
    ringBuffer15.enqueue((java.lang.Object)ringBuffer20);
    java.lang.Object obj55 = ringBuffer20.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj56 = ringBuffer20.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj55);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.lang.Object obj7 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    java.util.Spliterator spliterator16 = ringBuffer10.spliterator();
    int i17 = ringBuffer10.size();
    java.util.Spliterator spliterator18 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer10.spliterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(10);
    ringBuffer22.enqueue((java.lang.Object)false);
    java.lang.Object obj25 = ringBuffer22.dequeue();
    java.util.Spliterator spliterator26 = ringBuffer22.spliterator();
    boolean b27 = ringBuffer22.isEmpty();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer22);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer10);
    java.lang.Object obj30 = ringBuffer1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#'+ "'", obj7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false+ "'", obj25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    boolean b11 = ringBuffer1.isEmpty();
    int i12 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    boolean b15 = ringBuffer14.isEmpty();
    java.util.Spliterator spliterator16 = ringBuffer14.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    java.util.Iterator iterator18 = ringBuffer14.iterator();
    boolean b19 = ringBuffer14.isEmpty();
    int i20 = ringBuffer14.size();
    java.util.Spliterator spliterator21 = ringBuffer14.spliterator();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(1);
    boolean b24 = ringBuffer23.isEmpty();
    java.util.Spliterator spliterator25 = ringBuffer23.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer23.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer23.spliterator();
    java.util.Iterator iterator28 = ringBuffer23.iterator();
    ringBuffer14.enqueue((java.lang.Object)iterator28);
    java.lang.Object obj30 = ringBuffer14.dequeue();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer32.spliterator();
    ringBuffer14.enqueue((java.lang.Object)spliterator36);
    java.lang.Object obj38 = ringBuffer14.dequeue();
    boolean b39 = ringBuffer14.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer14);
    java.util.function.Consumer consumer41 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer14.forEach(consumer41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    exercise03.RingBuffer ringBuffer5 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator6 = ringBuffer5.iterator();
    java.util.Iterator iterator7 = ringBuffer5.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator7);
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(10);
    ringBuffer10.enqueue((java.lang.Object)'#');
    int i13 = ringBuffer10.size();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    int i15 = ringBuffer10.size();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    ringBuffer17.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.lang.Object obj21 = ringBuffer17.dequeue();
    java.util.Spliterator spliterator22 = ringBuffer17.spliterator();
    boolean b23 = ringBuffer17.isEmpty();
    int i24 = ringBuffer17.size();
    ringBuffer10.enqueue((java.lang.Object)i24);
    ringBuffer1.enqueue((java.lang.Object)i24);
    java.util.Spliterator spliterator27 = ringBuffer1.spliterator();
    java.util.Iterator iterator28 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a'+ "'", obj21.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    java.lang.Object obj4 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(1);
    boolean b7 = ringBuffer6.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer6.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer6.spliterator();
    java.util.Iterator iterator10 = ringBuffer6.iterator();
    boolean b11 = ringBuffer6.isEmpty();
    java.util.Iterator iterator12 = ringBuffer6.iterator();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    boolean b15 = ringBuffer14.isEmpty();
    java.util.Spliterator spliterator16 = ringBuffer14.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    java.util.Iterator iterator18 = ringBuffer14.iterator();
    java.util.Iterator iterator19 = ringBuffer14.iterator();
    boolean b20 = ringBuffer14.isEmpty();
    ringBuffer6.enqueue((java.lang.Object)ringBuffer14);
    boolean b22 = ringBuffer6.isEmpty();
    java.lang.Object obj23 = ringBuffer6.dequeue();
    ringBuffer1.enqueue(obj23);
    java.util.Spliterator spliterator25 = ringBuffer1.spliterator();
    boolean b26 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    ringBuffer28.enqueue((java.lang.Object)'a');
    java.lang.Object obj31 = ringBuffer28.dequeue();
    java.util.Spliterator spliterator32 = ringBuffer28.spliterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator33);
    java.util.Spliterator spliterator35 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '#'+ "'", obj4.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a'+ "'", obj31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);

  }

}
