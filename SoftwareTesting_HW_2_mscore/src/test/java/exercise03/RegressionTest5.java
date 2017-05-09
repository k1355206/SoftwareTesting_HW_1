package exercise03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test001"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test002"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    int i3 = ringBuffer1.size();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test003"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test004"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    int i12 = ringBuffer1.size();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj15 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test005"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test006"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test007"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.function.Consumer consumer13 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer13);
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
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test008"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test009"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test010"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test011"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    int i13 = ringBuffer1.size();
    boolean b14 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test012"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test013"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test014"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test015"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test016"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    boolean b13 = ringBuffer1.isEmpty();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    int i15 = ringBuffer1.size();
    java.util.Iterator iterator16 = ringBuffer1.iterator();
    boolean b17 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test017"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test018"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    boolean b5 = ringBuffer1.isEmpty();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test019"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    int i12 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test020"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    int i13 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test021"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test022"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test023"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test024"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test025"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test026"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test027"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    int i3 = ringBuffer1.size();
    int i4 = ringBuffer1.size();
    java.util.function.Consumer consumer5 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test028"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    int i3 = ringBuffer1.size();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test029"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    int i11 = ringBuffer1.size();
    int i12 = ringBuffer1.size();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test030"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test031"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test032"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test033"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test034"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    int i3 = ringBuffer1.size();
    boolean b4 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test035"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    int i14 = ringBuffer1.size();
    java.util.function.Consumer consumer15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test036"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    int i13 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj14 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test037"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    int i3 = ringBuffer1.size();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test038"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test039"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    int i11 = ringBuffer1.size();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    boolean b13 = ringBuffer1.isEmpty();
    int i14 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test040"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    boolean b14 = ringBuffer1.isEmpty();
    java.util.function.Consumer consumer15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer15);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test041"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    int i11 = ringBuffer1.size();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test042"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test043"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test044"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test045"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    int i12 = ringBuffer1.size();
    int i13 = ringBuffer1.size();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    int i16 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test046"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test047"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj13 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test048"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test049"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test050"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test051"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    int i15 = ringBuffer12.size();
    java.util.Spliterator spliterator16 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer12.spliterator();
    java.util.Iterator iterator18 = ringBuffer12.iterator();
    java.util.Iterator iterator19 = ringBuffer12.iterator();
    java.util.Iterator iterator20 = ringBuffer12.iterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
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
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test052"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test053"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.function.Consumer consumer10 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer10);
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
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test054"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test055"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    int i12 = ringBuffer1.size();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    int i14 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test056"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test057"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test058"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test059"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test060"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    int i13 = ringBuffer1.size();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    int i16 = ringBuffer1.size();
    java.util.function.Consumer consumer17 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer17);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test061"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    boolean b6 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test062"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    int i16 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test063"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj8 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test064"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test065"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test066"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    int i11 = ringBuffer1.size();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test067"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test068"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(10);
    int i8 = ringBuffer7.size();
    java.util.Iterator iterator9 = ringBuffer7.iterator();
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    java.util.Iterator iterator13 = ringBuffer7.iterator();
    boolean b14 = ringBuffer7.isEmpty();
    java.util.Iterator iterator15 = ringBuffer7.iterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)iterator15);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test069"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    int i13 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test070"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test071"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test072"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    int i11 = ringBuffer1.size();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test073"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test074"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test075"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test076"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer10 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer10);
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
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test077"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test078"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test079"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    int i12 = ringBuffer1.size();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.function.Consumer consumer14 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer14);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test080"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    boolean b14 = ringBuffer1.isEmpty();
    int i15 = ringBuffer1.size();
    java.util.Spliterator spliterator16 = ringBuffer1.spliterator();
    boolean b17 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test081"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test082"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test083"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test084"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test085"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test086"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer12);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test087"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    java.util.function.Consumer consumer11 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test088"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test089"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test090"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    boolean b13 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test091"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test092"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test093"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test094"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    int i3 = ringBuffer1.size();
    int i4 = ringBuffer1.size();
    java.util.function.Consumer consumer5 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test095"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test096"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test097"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    int i14 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test098"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.function.Consumer consumer10 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer10);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test099"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    boolean b11 = ringBuffer1.isEmpty();
    boolean b12 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test100"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer17 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer17);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test101"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    int i13 = ringBuffer1.size();
    boolean b14 = ringBuffer1.isEmpty();
    boolean b15 = ringBuffer1.isEmpty();
    boolean b16 = ringBuffer1.isEmpty();
    boolean b17 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test102"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test103"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test104"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    int i3 = ringBuffer1.size();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.function.Consumer consumer7 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer7);
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test105"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    boolean b10 = ringBuffer1.isEmpty();
    boolean b11 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test106"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test107"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test108"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    boolean b14 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj15 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test109"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    boolean b10 = ringBuffer1.isEmpty();
    int i11 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test110"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test111"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    boolean b14 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test112"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test113"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test114"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    int i12 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj13 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test115"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    int i2 = ringBuffer1.size();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test116"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.function.Consumer consumer9 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer9);
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
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test117"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    int i2 = ringBuffer1.size();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    int i13 = ringBuffer1.size();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    java.util.Iterator iterator16 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test118"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test119"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj13 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test120"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj8 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test121"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test122"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    boolean b3 = ringBuffer1.isEmpty();
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test123"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test124"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    boolean b3 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    boolean b13 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test125"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test126"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    int i3 = ringBuffer1.size();
    boolean b4 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test127"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test128"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test129"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    int i3 = ringBuffer1.size();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    boolean b5 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test130"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    int i3 = ringBuffer1.size();
    boolean b4 = ringBuffer1.isEmpty();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test131"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test132"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

}
