package exercise03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(10);
    ringBuffer11.enqueue((java.lang.Object)'#');
    java.lang.Object obj14 = ringBuffer11.dequeue();
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
    boolean b32 = ringBuffer16.isEmpty();
    java.lang.Object obj33 = ringBuffer16.dequeue();
    ringBuffer11.enqueue(obj33);
    java.util.Spliterator spliterator35 = ringBuffer11.spliterator();
    boolean b36 = ringBuffer11.isEmpty();
    java.lang.Object obj37 = ringBuffer11.dequeue();
    ringBuffer1.enqueue(obj37);
    
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
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '#'+ "'", obj14.equals('#'));
    
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
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    java.lang.Object obj4 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    java.util.Iterator iterator17 = ringBuffer11.iterator();
    ringBuffer9.enqueue((java.lang.Object)iterator17);
    int i19 = ringBuffer9.size();
    boolean b20 = ringBuffer9.isEmpty();
    java.util.Iterator iterator21 = ringBuffer9.iterator();
    int i22 = ringBuffer9.size();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    boolean b29 = ringBuffer24.isEmpty();
    java.util.Iterator iterator30 = ringBuffer24.iterator();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer32.spliterator();
    java.util.Iterator iterator37 = ringBuffer32.iterator();
    int i38 = ringBuffer32.size();
    ringBuffer24.enqueue((java.lang.Object)ringBuffer32);
    java.util.Iterator iterator40 = ringBuffer24.iterator();
    java.util.Spliterator spliterator41 = ringBuffer24.spliterator();
    ringBuffer9.enqueue((java.lang.Object)spliterator41);
    java.util.Iterator iterator43 = ringBuffer9.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator43);
    exercise03.RingBuffer ringBuffer46 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer48 = new exercise03.RingBuffer(1);
    boolean b49 = ringBuffer48.isEmpty();
    java.util.Spliterator spliterator50 = ringBuffer48.spliterator();
    java.util.Spliterator spliterator51 = ringBuffer48.spliterator();
    java.util.Iterator iterator52 = ringBuffer48.iterator();
    boolean b53 = ringBuffer48.isEmpty();
    java.util.Iterator iterator54 = ringBuffer48.iterator();
    exercise03.RingBuffer ringBuffer56 = new exercise03.RingBuffer(1);
    boolean b57 = ringBuffer56.isEmpty();
    java.util.Spliterator spliterator58 = ringBuffer56.spliterator();
    java.util.Spliterator spliterator59 = ringBuffer56.spliterator();
    java.util.Iterator iterator60 = ringBuffer56.iterator();
    boolean b61 = ringBuffer56.isEmpty();
    int i62 = ringBuffer56.size();
    java.util.Spliterator spliterator63 = ringBuffer56.spliterator();
    ringBuffer48.enqueue((java.lang.Object)spliterator63);
    ringBuffer46.enqueue((java.lang.Object)ringBuffer48);
    int i66 = ringBuffer48.size();
    boolean b67 = ringBuffer48.isEmpty();
    java.util.Spliterator spliterator68 = ringBuffer48.spliterator();
    int i69 = ringBuffer48.size();
    ringBuffer1.enqueue((java.lang.Object)i69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }


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
    int i25 = ringBuffer13.size();
    java.util.Iterator iterator26 = ringBuffer13.iterator();
    boolean b27 = ringBuffer13.isEmpty();
    java.util.function.Consumer consumer28 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer13.forEach(consumer28);
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
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    int i14 = ringBuffer1.size();
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
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    java.util.Iterator iterator11 = ringBuffer7.iterator();
    java.util.Iterator iterator12 = ringBuffer7.iterator();
    boolean b13 = ringBuffer7.isEmpty();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    boolean b16 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer15.spliterator();
    ringBuffer7.enqueue((java.lang.Object)ringBuffer15);
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator22 = ringBuffer21.iterator();
    ringBuffer15.enqueue((java.lang.Object)ringBuffer21);
    java.util.Iterator iterator24 = ringBuffer21.iterator();
    boolean b25 = ringBuffer21.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer21.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer21);
    int i28 = ringBuffer21.size();
    java.util.Iterator iterator29 = ringBuffer21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a'+ "'", obj5.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    ringBuffer14.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    int i18 = ringBuffer14.size();
    java.util.Spliterator spliterator19 = ringBuffer14.spliterator();
    java.util.Iterator iterator20 = ringBuffer14.iterator();
    ringBuffer7.enqueue((java.lang.Object)iterator20);
    boolean b22 = ringBuffer7.isEmpty();
    java.util.function.Consumer consumer23 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer7.forEach(consumer23);
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.lang.Object obj7 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    ringBuffer9.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    int i13 = ringBuffer9.size();
    boolean b14 = ringBuffer9.isEmpty();
    boolean b15 = ringBuffer9.isEmpty();
    boolean b16 = ringBuffer9.isEmpty();
    boolean b17 = ringBuffer9.isEmpty();
    int i18 = ringBuffer9.size();
    ringBuffer1.enqueue((java.lang.Object)i18);
    java.util.Spliterator spliterator20 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer22 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer22);
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
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#'+ "'", obj7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }


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
    int i14 = ringBuffer1.size();
    java.lang.Object obj15 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    java.util.Iterator iterator22 = ringBuffer17.iterator();
    java.util.Spliterator spliterator23 = ringBuffer17.spliterator();
    int i24 = ringBuffer17.size();
    boolean b25 = ringBuffer17.isEmpty();
    java.util.Iterator iterator26 = ringBuffer17.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator26);
    java.util.Spliterator spliterator28 = ringBuffer1.spliterator();
    java.lang.Object obj29 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }


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
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    java.util.Spliterator spliterator18 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer12.spliterator();
    int i20 = ringBuffer12.size();
    java.util.Spliterator spliterator21 = ringBuffer12.spliterator();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(10);
    ringBuffer23.enqueue((java.lang.Object)false);
    ringBuffer23.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator spliterator28 = ringBuffer23.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer23);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer23);
    int i31 = ringBuffer23.size();
    boolean b32 = ringBuffer23.isEmpty();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(10);
    ringBuffer34.enqueue((java.lang.Object)'#');
    int i37 = ringBuffer34.size();
    java.util.Iterator iterator38 = ringBuffer34.iterator();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    ringBuffer34.enqueue((java.lang.Object)ringBuffer40);
    int i44 = ringBuffer40.size();
    boolean b45 = ringBuffer40.isEmpty();
    int i46 = ringBuffer40.size();
    java.util.Iterator iterator47 = ringBuffer40.iterator();
    ringBuffer23.enqueue((java.lang.Object)iterator47);
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    java.util.Iterator iterator55 = ringBuffer50.iterator();
    java.util.Spliterator spliterator56 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator57 = ringBuffer50.spliterator();
    int i58 = ringBuffer50.size();
    java.util.Spliterator spliterator59 = ringBuffer50.spliterator();
    exercise03.RingBuffer ringBuffer61 = new exercise03.RingBuffer(1);
    boolean b62 = ringBuffer61.isEmpty();
    java.util.Spliterator spliterator63 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator64 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator65 = ringBuffer61.spliterator();
    java.util.Iterator iterator66 = ringBuffer61.iterator();
    int i67 = ringBuffer61.size();
    int i68 = ringBuffer61.size();
    ringBuffer50.enqueue((java.lang.Object)ringBuffer61);
    java.util.Iterator iterator70 = ringBuffer50.iterator();
    java.lang.Object obj71 = ringBuffer50.dequeue();
    ringBuffer23.enqueue((java.lang.Object)ringBuffer50);
    java.util.function.Consumer consumer73 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer23.forEach(consumer73);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
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
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
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
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj71);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    int i23 = ringBuffer18.size();
    boolean b24 = ringBuffer18.isEmpty();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(10);
    ringBuffer26.enqueue((java.lang.Object)'#');
    ringBuffer18.enqueue((java.lang.Object)ringBuffer26);
    java.util.Iterator iterator30 = ringBuffer18.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator30);
    java.lang.Object obj32 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator33 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
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
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '#'+ "'", obj32.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    ringBuffer13.enqueue((java.lang.Object)(short)0);
    int i17 = ringBuffer13.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    boolean b19 = ringBuffer13.isEmpty();
    boolean b20 = ringBuffer13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }


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
    int i13 = ringBuffer1.size();
    int i14 = ringBuffer1.size();
    java.lang.Object obj15 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    java.util.Iterator iterator22 = ringBuffer17.iterator();
    boolean b23 = ringBuffer17.isEmpty();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    boolean b26 = ringBuffer25.isEmpty();
    java.util.Spliterator spliterator27 = ringBuffer25.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer25.spliterator();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer25);
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator32 = ringBuffer31.iterator();
    ringBuffer25.enqueue((java.lang.Object)ringBuffer31);
    java.util.Iterator iterator34 = ringBuffer31.iterator();
    exercise03.RingBuffer ringBuffer36 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer38 = new exercise03.RingBuffer(1);
    boolean b39 = ringBuffer38.isEmpty();
    java.util.Spliterator spliterator40 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator41 = ringBuffer38.spliterator();
    java.util.Iterator iterator42 = ringBuffer38.iterator();
    boolean b43 = ringBuffer38.isEmpty();
    int i44 = ringBuffer38.size();
    java.util.Spliterator spliterator45 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator46 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator47 = ringBuffer38.spliterator();
    java.util.Spliterator spliterator48 = ringBuffer38.spliterator();
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    boolean b55 = ringBuffer50.isEmpty();
    int i56 = ringBuffer50.size();
    java.util.Spliterator spliterator57 = ringBuffer50.spliterator();
    exercise03.RingBuffer ringBuffer59 = new exercise03.RingBuffer(1);
    boolean b60 = ringBuffer59.isEmpty();
    java.util.Spliterator spliterator61 = ringBuffer59.spliterator();
    java.util.Spliterator spliterator62 = ringBuffer59.spliterator();
    java.util.Spliterator spliterator63 = ringBuffer59.spliterator();
    java.util.Iterator iterator64 = ringBuffer59.iterator();
    ringBuffer50.enqueue((java.lang.Object)iterator64);
    ringBuffer38.enqueue((java.lang.Object)iterator64);
    boolean b67 = ringBuffer38.isEmpty();
    int i68 = ringBuffer38.size();
    ringBuffer36.enqueue((java.lang.Object)ringBuffer38);
    ringBuffer31.enqueue((java.lang.Object)ringBuffer36);
    int i71 = ringBuffer31.size();
    exercise03.RingBuffer ringBuffer73 = new exercise03.RingBuffer(10);
    boolean b74 = ringBuffer73.isEmpty();
    java.util.Iterator iterator75 = ringBuffer73.iterator();
    java.util.Iterator iterator76 = ringBuffer73.iterator();
    ringBuffer31.enqueue((java.lang.Object)iterator76);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer31);
    java.lang.Object obj79 = ringBuffer31.dequeue();
    
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
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj79);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
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
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    boolean b18 = ringBuffer12.isEmpty();
    int i19 = ringBuffer12.size();
    boolean b20 = ringBuffer12.isEmpty();
    int i21 = ringBuffer12.size();
    int i22 = ringBuffer12.size();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(1);
    boolean b31 = ringBuffer30.isEmpty();
    java.util.Spliterator spliterator32 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer30.spliterator();
    ringBuffer24.enqueue((java.lang.Object)spliterator33);
    ringBuffer12.enqueue((java.lang.Object)ringBuffer24);
    java.util.Spliterator spliterator36 = ringBuffer24.spliterator();
    boolean b37 = ringBuffer24.isEmpty();
    java.lang.Object obj38 = ringBuffer24.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue(obj38);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    java.util.Iterator iterator23 = ringBuffer10.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer10);
    int i25 = ringBuffer1.size();
    java.util.function.Consumer consumer26 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer26);
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    java.util.Iterator iterator10 = ringBuffer8.iterator();
    java.util.Iterator iterator11 = ringBuffer8.iterator();
    int i12 = ringBuffer8.size();
    
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
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }


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
    java.util.Spliterator spliterator17 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    java.util.Iterator iterator20 = ringBuffer9.iterator();
    
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
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    int i17 = ringBuffer11.size();
    java.util.Spliterator spliterator18 = ringBuffer11.spliterator();
    ringBuffer3.enqueue((java.lang.Object)spliterator18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    java.util.Iterator iterator29 = ringBuffer22.iterator();
    boolean b30 = ringBuffer22.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    ringBuffer32.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    int i36 = ringBuffer32.size();
    java.util.Spliterator spliterator37 = ringBuffer32.spliterator();
    java.util.Iterator iterator38 = ringBuffer32.iterator();
    java.util.Spliterator spliterator39 = ringBuffer32.spliterator();
    java.util.Iterator iterator40 = ringBuffer32.iterator();
    int i41 = ringBuffer32.size();
    ringBuffer22.enqueue((java.lang.Object)ringBuffer32);
    java.lang.Object obj43 = ringBuffer22.dequeue();
    java.util.Iterator iterator44 = ringBuffer22.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator44);
    exercise03.RingBuffer ringBuffer47 = new exercise03.RingBuffer(1);
    boolean b48 = ringBuffer47.isEmpty();
    java.util.Spliterator spliterator49 = ringBuffer47.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer47.spliterator();
    java.util.Iterator iterator51 = ringBuffer47.iterator();
    exercise03.RingBuffer ringBuffer53 = new exercise03.RingBuffer(10);
    ringBuffer53.enqueue((java.lang.Object)'#');
    int i56 = ringBuffer53.size();
    java.util.Iterator iterator57 = ringBuffer53.iterator();
    exercise03.RingBuffer ringBuffer59 = new exercise03.RingBuffer(1);
    boolean b60 = ringBuffer59.isEmpty();
    java.util.Spliterator spliterator61 = ringBuffer59.spliterator();
    ringBuffer53.enqueue((java.lang.Object)ringBuffer59);
    ringBuffer47.enqueue((java.lang.Object)ringBuffer59);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer47);
    int i65 = ringBuffer1.size();
    java.util.Iterator iterator66 = ringBuffer1.iterator();
    int i67 = ringBuffer1.size();
    java.lang.Object obj68 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj68);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.lang.Object obj12 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }


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
    boolean b14 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    java.util.Iterator iterator16 = ringBuffer1.iterator();
    boolean b17 = ringBuffer1.isEmpty();
    boolean b18 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer1.spliterator();
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    int i11 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    java.util.Iterator iterator18 = ringBuffer13.iterator();
    boolean b19 = ringBuffer13.isEmpty();
    int i20 = ringBuffer13.size();
    boolean b21 = ringBuffer13.isEmpty();
    java.util.Iterator iterator22 = ringBuffer13.iterator();
    boolean b23 = ringBuffer13.isEmpty();
    int i24 = ringBuffer13.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
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
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.lang.Object obj11 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    boolean b16 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer15.spliterator();
    java.util.Iterator iterator19 = ringBuffer15.iterator();
    boolean b20 = ringBuffer15.isEmpty();
    java.util.Iterator iterator21 = ringBuffer15.iterator();
    ringBuffer13.enqueue((java.lang.Object)iterator21);
    int i23 = ringBuffer13.size();
    boolean b24 = ringBuffer13.isEmpty();
    boolean b25 = ringBuffer13.isEmpty();
    boolean b26 = ringBuffer13.isEmpty();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    java.util.Spliterator spliterator34 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer28.spliterator();
    int i36 = ringBuffer28.size();
    int i37 = ringBuffer28.size();
    int i38 = ringBuffer28.size();
    ringBuffer13.enqueue((java.lang.Object)ringBuffer28);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    java.util.Spliterator spliterator41 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer43 = new exercise03.RingBuffer(10);
    ringBuffer43.enqueue((java.lang.Object)'#');
    int i46 = ringBuffer43.size();
    java.util.Iterator iterator47 = ringBuffer43.iterator();
    int i48 = ringBuffer43.size();
    int i49 = ringBuffer43.size();
    java.util.Iterator iterator50 = ringBuffer43.iterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer43);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a'+ "'", obj11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator50);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    boolean b10 = ringBuffer1.isEmpty();
    int i11 = ringBuffer1.size();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }


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
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator32 = ringBuffer28.spliterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    int i34 = ringBuffer28.size();
    int i35 = ringBuffer28.size();
    int i36 = ringBuffer28.size();
    int i37 = ringBuffer28.size();
    java.util.Iterator iterator38 = ringBuffer28.iterator();
    int i39 = ringBuffer28.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer28);
    java.util.Spliterator spliterator41 = ringBuffer28.spliterator();
    int i42 = ringBuffer28.size();
    int i43 = ringBuffer28.size();
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    int i17 = ringBuffer11.size();
    java.util.Spliterator spliterator18 = ringBuffer11.spliterator();
    ringBuffer3.enqueue((java.lang.Object)spliterator18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    java.util.Iterator iterator21 = ringBuffer3.iterator();
    java.util.Iterator iterator22 = ringBuffer3.iterator();
    java.util.Spliterator spliterator23 = ringBuffer3.spliterator();
    java.lang.Object obj24 = ringBuffer3.dequeue();
    java.util.function.Consumer consumer25 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer3.forEach(consumer25);
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }


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
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(10);
    ringBuffer16.enqueue((java.lang.Object)'#');
    int i19 = ringBuffer16.size();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    java.util.Spliterator spliterator21 = ringBuffer16.spliterator();
    int i22 = ringBuffer16.size();
    java.lang.Object obj23 = ringBuffer16.dequeue();
    int i24 = ringBuffer16.size();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer26.spliterator();
    java.util.Iterator iterator31 = ringBuffer26.iterator();
    int i32 = ringBuffer26.size();
    boolean b33 = ringBuffer26.isEmpty();
    boolean b34 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator35 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer26.spliterator();
    java.util.Iterator iterator37 = ringBuffer26.iterator();
    exercise03.RingBuffer ringBuffer39 = new exercise03.RingBuffer(0);
    java.util.Spliterator spliterator40 = ringBuffer39.spliterator();
    ringBuffer26.enqueue((java.lang.Object)ringBuffer39);
    ringBuffer16.enqueue((java.lang.Object)ringBuffer26);
    java.util.Spliterator spliterator43 = ringBuffer16.spliterator();
    java.lang.Object obj44 = ringBuffer16.dequeue();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    int i46 = ringBuffer16.size();
    
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
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#'+ "'", obj23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    boolean b9 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    ringBuffer11.enqueue((java.lang.Object)spliterator20);
    java.util.Iterator iterator22 = ringBuffer11.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer11);
    boolean b24 = ringBuffer1.isEmpty();
    boolean b25 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    ringBuffer27.enqueue((java.lang.Object)(short)0);
    java.util.Iterator iterator31 = ringBuffer27.iterator();
    java.util.Iterator iterator32 = ringBuffer27.iterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer27);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    int i9 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer11.spliterator();
    java.util.Iterator iterator16 = ringBuffer11.iterator();
    int i17 = ringBuffer11.size();
    boolean b18 = ringBuffer11.isEmpty();
    boolean b19 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer11.spliterator();
    java.util.Iterator iterator22 = ringBuffer11.iterator();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(0);
    java.util.Spliterator spliterator25 = ringBuffer24.spliterator();
    ringBuffer11.enqueue((java.lang.Object)ringBuffer24);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer11);
    java.lang.Object obj28 = ringBuffer11.dequeue();
    int i29 = ringBuffer11.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#'+ "'", obj8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    
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
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    boolean b19 = ringBuffer1.isEmpty();
    boolean b20 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    int i30 = ringBuffer22.size();
    boolean b31 = ringBuffer22.isEmpty();
    int i32 = ringBuffer22.size();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(1);
    ringBuffer34.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator37 = ringBuffer34.spliterator();
    java.lang.Object obj38 = ringBuffer34.dequeue();
    java.util.Spliterator spliterator39 = ringBuffer34.spliterator();
    boolean b40 = ringBuffer34.isEmpty();
    int i41 = ringBuffer34.size();
    ringBuffer22.enqueue((java.lang.Object)ringBuffer34);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer34);
    boolean b44 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer46 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer48 = new exercise03.RingBuffer(1);
    boolean b49 = ringBuffer48.isEmpty();
    java.util.Spliterator spliterator50 = ringBuffer48.spliterator();
    java.util.Spliterator spliterator51 = ringBuffer48.spliterator();
    java.util.Iterator iterator52 = ringBuffer48.iterator();
    boolean b53 = ringBuffer48.isEmpty();
    java.util.Iterator iterator54 = ringBuffer48.iterator();
    exercise03.RingBuffer ringBuffer56 = new exercise03.RingBuffer(1);
    boolean b57 = ringBuffer56.isEmpty();
    java.util.Spliterator spliterator58 = ringBuffer56.spliterator();
    java.util.Spliterator spliterator59 = ringBuffer56.spliterator();
    java.util.Iterator iterator60 = ringBuffer56.iterator();
    boolean b61 = ringBuffer56.isEmpty();
    int i62 = ringBuffer56.size();
    java.util.Spliterator spliterator63 = ringBuffer56.spliterator();
    ringBuffer48.enqueue((java.lang.Object)spliterator63);
    ringBuffer46.enqueue((java.lang.Object)ringBuffer48);
    java.lang.Object obj66 = ringBuffer48.dequeue();
    java.util.Spliterator spliterator67 = ringBuffer48.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)spliterator67);
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 'a'+ "'", obj38.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator67);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }


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
    java.util.Spliterator spliterator19 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer15.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(10);
    ringBuffer10.enqueue((java.lang.Object)'#');
    int i13 = ringBuffer10.size();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer16);
    int i20 = ringBuffer16.size();
    boolean b21 = ringBuffer16.isEmpty();
    int i22 = ringBuffer16.size();
    int i23 = ringBuffer16.size();
    java.util.Iterator iterator24 = ringBuffer16.iterator();
    int i25 = ringBuffer16.size();
    java.util.Spliterator spliterator26 = ringBuffer16.spliterator();
    boolean b27 = ringBuffer16.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    java.util.Spliterator spliterator29 = ringBuffer16.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer5 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    java.util.Iterator iterator11 = ringBuffer7.iterator();
    boolean b12 = ringBuffer7.isEmpty();
    java.util.Iterator iterator13 = ringBuffer7.iterator();
    ringBuffer5.enqueue((java.lang.Object)iterator13);
    boolean b15 = ringBuffer5.isEmpty();
    int i16 = ringBuffer5.size();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    boolean b23 = ringBuffer18.isEmpty();
    int i24 = ringBuffer18.size();
    java.util.Spliterator spliterator25 = ringBuffer18.spliterator();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer27.spliterator();
    java.util.Iterator iterator32 = ringBuffer27.iterator();
    ringBuffer18.enqueue((java.lang.Object)iterator32);
    java.lang.Object obj34 = ringBuffer18.dequeue();
    exercise03.RingBuffer ringBuffer36 = new exercise03.RingBuffer(1);
    boolean b37 = ringBuffer36.isEmpty();
    java.util.Spliterator spliterator38 = ringBuffer36.spliterator();
    java.util.Spliterator spliterator39 = ringBuffer36.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer36.spliterator();
    ringBuffer18.enqueue((java.lang.Object)spliterator40);
    java.lang.Object obj42 = ringBuffer18.dequeue();
    boolean b43 = ringBuffer18.isEmpty();
    ringBuffer5.enqueue((java.lang.Object)ringBuffer18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer18);
    int i46 = ringBuffer18.size();
    java.util.Spliterator spliterator47 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator48 = ringBuffer18.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
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
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer20.spliterator();
    java.util.Iterator iterator25 = ringBuffer20.iterator();
    int i26 = ringBuffer20.size();
    boolean b27 = ringBuffer20.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b27);
    java.util.Spliterator spliterator29 = ringBuffer1.spliterator();
    boolean b30 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }


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
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer18);
    int i24 = ringBuffer1.size();
    java.util.Spliterator spliterator25 = ringBuffer1.spliterator();
    java.util.Iterator iterator26 = ringBuffer1.iterator();
    java.lang.Object obj27 = ringBuffer1.dequeue();
    int i28 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(1);
    boolean b31 = ringBuffer30.isEmpty();
    java.util.Spliterator spliterator32 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer30.spliterator();
    java.util.Iterator iterator34 = ringBuffer30.iterator();
    boolean b35 = ringBuffer30.isEmpty();
    int i36 = ringBuffer30.size();
    java.util.Spliterator spliterator37 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator38 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator39 = ringBuffer30.spliterator();
    java.util.Iterator iterator40 = ringBuffer30.iterator();
    boolean b41 = ringBuffer30.isEmpty();
    java.util.Iterator iterator42 = ringBuffer30.iterator();
    int i43 = ringBuffer30.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer30);
    
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
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator9);
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    int i13 = ringBuffer1.size();
    boolean b14 = ringBuffer1.isEmpty();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    java.util.function.Consumer consumer16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer16);
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
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.lang.Object obj11 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    boolean b16 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer15.spliterator();
    java.util.Iterator iterator19 = ringBuffer15.iterator();
    boolean b20 = ringBuffer15.isEmpty();
    java.util.Iterator iterator21 = ringBuffer15.iterator();
    ringBuffer13.enqueue((java.lang.Object)iterator21);
    int i23 = ringBuffer13.size();
    boolean b24 = ringBuffer13.isEmpty();
    boolean b25 = ringBuffer13.isEmpty();
    boolean b26 = ringBuffer13.isEmpty();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    java.util.Spliterator spliterator34 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer28.spliterator();
    int i36 = ringBuffer28.size();
    int i37 = ringBuffer28.size();
    int i38 = ringBuffer28.size();
    ringBuffer13.enqueue((java.lang.Object)ringBuffer28);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    exercise03.RingBuffer ringBuffer42 = new exercise03.RingBuffer(1);
    boolean b43 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator44 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator45 = ringBuffer42.spliterator();
    java.util.Iterator iterator46 = ringBuffer42.iterator();
    java.util.Iterator iterator47 = ringBuffer42.iterator();
    java.util.Spliterator spliterator48 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator49 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer42.spliterator();
    boolean b51 = ringBuffer42.isEmpty();
    exercise03.RingBuffer ringBuffer53 = new exercise03.RingBuffer(1);
    ringBuffer53.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator56 = ringBuffer53.spliterator();
    int i57 = ringBuffer53.size();
    java.util.Spliterator spliterator58 = ringBuffer53.spliterator();
    java.util.Iterator iterator59 = ringBuffer53.iterator();
    java.util.Spliterator spliterator60 = ringBuffer53.spliterator();
    java.lang.Object obj61 = ringBuffer53.dequeue();
    int i62 = ringBuffer53.size();
    ringBuffer42.enqueue((java.lang.Object)i62);
    java.util.Spliterator spliterator64 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator65 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator66 = ringBuffer42.spliterator();
    boolean b67 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator68 = ringBuffer42.spliterator();
    boolean b69 = ringBuffer42.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)b69);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a'+ "'", obj11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 'a'+ "'", obj61.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }


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
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(10);
    ringBuffer12.enqueue((java.lang.Object)false);
    ringBuffer12.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator spliterator17 = ringBuffer12.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
    java.lang.Object obj19 = ringBuffer12.dequeue();
    int i20 = ringBuffer12.size();
    java.util.function.Consumer consumer21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer12.forEach(consumer21);
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false+ "'", obj19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    java.lang.Object obj4 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }


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
    java.util.Spliterator spliterator19 = ringBuffer10.spliterator();
    java.util.Iterator iterator20 = ringBuffer10.iterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer22.spliterator();
    ringBuffer10.enqueue((java.lang.Object)spliterator30);
    boolean b32 = ringBuffer10.isEmpty();
    
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    int i13 = ringBuffer7.size();
    int i14 = ringBuffer7.size();
    java.util.Iterator iterator15 = ringBuffer7.iterator();
    int i16 = ringBuffer7.size();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    boolean b23 = ringBuffer18.isEmpty();
    int i24 = ringBuffer18.size();
    java.util.Spliterator spliterator25 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer18.spliterator();
    java.util.Iterator iterator27 = ringBuffer18.iterator();
    boolean b28 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer18.spliterator();
    java.util.Iterator iterator30 = ringBuffer18.iterator();
    ringBuffer7.enqueue((java.lang.Object)ringBuffer18);
    exercise03.RingBuffer ringBuffer33 = new exercise03.RingBuffer(10);
    ringBuffer33.enqueue((java.lang.Object)'#');
    int i36 = ringBuffer33.size();
    boolean b37 = ringBuffer33.isEmpty();
    int i38 = ringBuffer33.size();
    boolean b39 = ringBuffer33.isEmpty();
    boolean b40 = ringBuffer33.isEmpty();
    exercise03.RingBuffer ringBuffer42 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator43 = ringBuffer42.iterator();
    java.util.Iterator iterator44 = ringBuffer42.iterator();
    java.lang.Object obj45 = null;
    ringBuffer42.enqueue(obj45);
    ringBuffer33.enqueue(obj45);
    exercise03.RingBuffer ringBuffer49 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator50 = ringBuffer49.spliterator();
    int i51 = ringBuffer49.size();
    ringBuffer33.enqueue((java.lang.Object)i51);
    int i53 = ringBuffer33.size();
    java.util.Spliterator spliterator54 = ringBuffer33.spliterator();
    java.util.Iterator iterator55 = ringBuffer33.iterator();
    java.util.Iterator iterator56 = ringBuffer33.iterator();
    java.lang.Object obj57 = ringBuffer33.dequeue();
    ringBuffer18.enqueue((java.lang.Object)ringBuffer33);
    int i59 = ringBuffer18.size();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '#'+ "'", obj57.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.lang.Object obj4 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.lang.Object obj6 = null;
    ringBuffer1.enqueue(obj6);
    int i8 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    boolean b17 = ringBuffer12.isEmpty();
    java.util.Iterator iterator18 = ringBuffer12.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    boolean b25 = ringBuffer20.isEmpty();
    int i26 = ringBuffer20.size();
    java.util.Spliterator spliterator27 = ringBuffer20.spliterator();
    ringBuffer12.enqueue((java.lang.Object)spliterator27);
    ringBuffer10.enqueue((java.lang.Object)ringBuffer12);
    java.lang.Object obj30 = ringBuffer12.dequeue();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(10);
    ringBuffer32.enqueue((java.lang.Object)'#');
    java.lang.Object obj35 = ringBuffer32.dequeue();
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    ringBuffer37.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    int i41 = ringBuffer37.size();
    java.util.Spliterator spliterator42 = ringBuffer37.spliterator();
    ringBuffer32.enqueue((java.lang.Object)spliterator42);
    ringBuffer12.enqueue((java.lang.Object)spliterator42);
    java.lang.Object obj45 = ringBuffer12.dequeue();
    java.util.Iterator iterator46 = ringBuffer12.iterator();
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
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a'+ "'", obj4.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '#'+ "'", obj35.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }


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
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.lang.Object obj15 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    int i11 = ringBuffer1.size();
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    boolean b23 = ringBuffer18.isEmpty();
    java.util.Iterator iterator24 = ringBuffer18.iterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Iterator iterator30 = ringBuffer26.iterator();
    boolean b31 = ringBuffer26.isEmpty();
    int i32 = ringBuffer26.size();
    java.util.Spliterator spliterator33 = ringBuffer26.spliterator();
    ringBuffer18.enqueue((java.lang.Object)spliterator33);
    ringBuffer16.enqueue((java.lang.Object)ringBuffer18);
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    boolean b38 = ringBuffer37.isEmpty();
    java.util.Spliterator spliterator39 = ringBuffer37.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    java.util.Iterator iterator41 = ringBuffer37.iterator();
    java.util.Iterator iterator42 = ringBuffer37.iterator();
    java.util.Spliterator spliterator43 = ringBuffer37.spliterator();
    java.util.Iterator iterator44 = ringBuffer37.iterator();
    boolean b45 = ringBuffer37.isEmpty();
    exercise03.RingBuffer ringBuffer47 = new exercise03.RingBuffer(1);
    ringBuffer47.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator50 = ringBuffer47.spliterator();
    int i51 = ringBuffer47.size();
    java.util.Spliterator spliterator52 = ringBuffer47.spliterator();
    java.util.Iterator iterator53 = ringBuffer47.iterator();
    java.util.Spliterator spliterator54 = ringBuffer47.spliterator();
    java.util.Iterator iterator55 = ringBuffer47.iterator();
    int i56 = ringBuffer47.size();
    ringBuffer37.enqueue((java.lang.Object)ringBuffer47);
    java.lang.Object obj58 = ringBuffer37.dequeue();
    java.util.Iterator iterator59 = ringBuffer37.iterator();
    ringBuffer16.enqueue((java.lang.Object)iterator59);
    ringBuffer1.enqueue((java.lang.Object)iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }


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
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    boolean b17 = ringBuffer12.isEmpty();
    int i18 = ringBuffer12.size();
    java.util.Iterator iterator19 = ringBuffer12.iterator();
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(1);
    boolean b22 = ringBuffer21.isEmpty();
    java.util.Spliterator spliterator23 = ringBuffer21.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer21.spliterator();
    java.util.Iterator iterator25 = ringBuffer21.iterator();
    boolean b26 = ringBuffer21.isEmpty();
    int i27 = ringBuffer21.size();
    java.util.Spliterator spliterator28 = ringBuffer21.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer21);
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    boolean b32 = ringBuffer31.isEmpty();
    java.util.Spliterator spliterator33 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    java.util.Iterator iterator35 = ringBuffer31.iterator();
    boolean b36 = ringBuffer31.isEmpty();
    java.util.Iterator iterator37 = ringBuffer31.iterator();
    exercise03.RingBuffer ringBuffer39 = new exercise03.RingBuffer(1);
    boolean b40 = ringBuffer39.isEmpty();
    java.util.Spliterator spliterator41 = ringBuffer39.spliterator();
    java.util.Spliterator spliterator42 = ringBuffer39.spliterator();
    java.util.Iterator iterator43 = ringBuffer39.iterator();
    java.util.Iterator iterator44 = ringBuffer39.iterator();
    boolean b45 = ringBuffer39.isEmpty();
    ringBuffer31.enqueue((java.lang.Object)ringBuffer39);
    boolean b47 = ringBuffer31.isEmpty();
    ringBuffer21.enqueue((java.lang.Object)ringBuffer31);
    java.util.Spliterator spliterator49 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer31.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator50);
    boolean b52 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
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
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    int i13 = ringBuffer7.size();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    boolean b22 = ringBuffer17.isEmpty();
    java.util.Iterator iterator23 = ringBuffer17.iterator();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    boolean b26 = ringBuffer25.isEmpty();
    java.util.Spliterator spliterator27 = ringBuffer25.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer25.spliterator();
    java.util.Iterator iterator29 = ringBuffer25.iterator();
    boolean b30 = ringBuffer25.isEmpty();
    int i31 = ringBuffer25.size();
    java.util.Spliterator spliterator32 = ringBuffer25.spliterator();
    ringBuffer17.enqueue((java.lang.Object)spliterator32);
    ringBuffer15.enqueue((java.lang.Object)ringBuffer17);
    int i35 = ringBuffer17.size();
    boolean b36 = ringBuffer17.isEmpty();
    ringBuffer7.enqueue((java.lang.Object)b36);
    java.util.Spliterator spliterator38 = ringBuffer7.spliterator();
    java.lang.Object obj39 = ringBuffer7.dequeue();
    java.util.Spliterator spliterator40 = ringBuffer7.spliterator();
    boolean b41 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer7.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj43 = ringBuffer7.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false+ "'", obj39.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    boolean b18 = ringBuffer13.isEmpty();
    int i19 = ringBuffer13.size();
    java.lang.Object obj20 = null;
    ringBuffer13.enqueue(obj20);
    ringBuffer1.enqueue(obj20);
    int i23 = ringBuffer1.size();
    boolean b24 = ringBuffer1.isEmpty();
    java.lang.Object obj25 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }


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
    int i14 = ringBuffer1.size();
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
    java.util.Spliterator spliterator28 = ringBuffer24.spliterator();
    java.util.Iterator iterator29 = ringBuffer24.iterator();
    int i30 = ringBuffer24.size();
    ringBuffer16.enqueue((java.lang.Object)ringBuffer24);
    java.util.Iterator iterator32 = ringBuffer16.iterator();
    java.util.Spliterator spliterator33 = ringBuffer16.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator33);
    java.lang.Object obj35 = ringBuffer1.dequeue();
    java.lang.Object obj36 = ringBuffer1.dequeue();
    boolean b37 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
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
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }


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
    int i17 = ringBuffer9.size();
    java.util.Spliterator spliterator18 = ringBuffer9.spliterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer20.spliterator();
    java.util.Iterator iterator25 = ringBuffer20.iterator();
    int i26 = ringBuffer20.size();
    int i27 = ringBuffer20.size();
    java.util.Spliterator spliterator28 = ringBuffer20.spliterator();
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(1);
    boolean b31 = ringBuffer30.isEmpty();
    java.util.Spliterator spliterator32 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer30.spliterator();
    java.util.Iterator iterator34 = ringBuffer30.iterator();
    java.util.Iterator iterator35 = ringBuffer30.iterator();
    java.util.Spliterator spliterator36 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator37 = ringBuffer30.spliterator();
    int i38 = ringBuffer30.size();
    boolean b39 = ringBuffer30.isEmpty();
    ringBuffer20.enqueue((java.lang.Object)b39);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer20);
    boolean b42 = ringBuffer20.isEmpty();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
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
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    boolean b4 = ringBuffer1.isEmpty();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    boolean b11 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }


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
    int i19 = ringBuffer1.size();
    java.util.Spliterator spliterator20 = ringBuffer1.spliterator();
    java.util.Iterator iterator21 = ringBuffer1.iterator();
    java.util.Iterator iterator22 = ringBuffer1.iterator();
    boolean b23 = ringBuffer1.isEmpty();
    java.util.function.Consumer consumer24 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer24);
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
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.lang.Object obj9 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    java.util.Iterator iterator16 = ringBuffer11.iterator();
    java.util.Spliterator spliterator17 = ringBuffer11.spliterator();
    java.util.Iterator iterator18 = ringBuffer11.iterator();
    boolean b19 = ringBuffer11.isEmpty();
    int i20 = ringBuffer11.size();
    java.util.Iterator iterator21 = ringBuffer11.iterator();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(1);
    boolean b24 = ringBuffer23.isEmpty();
    java.util.Spliterator spliterator25 = ringBuffer23.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer23.spliterator();
    java.util.Iterator iterator27 = ringBuffer23.iterator();
    java.util.Iterator iterator28 = ringBuffer23.iterator();
    boolean b29 = ringBuffer23.isEmpty();
    int i30 = ringBuffer23.size();
    boolean b31 = ringBuffer23.isEmpty();
    java.util.Iterator iterator32 = ringBuffer23.iterator();
    java.util.Iterator iterator33 = ringBuffer23.iterator();
    exercise03.RingBuffer ringBuffer35 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    boolean b38 = ringBuffer37.isEmpty();
    java.util.Spliterator spliterator39 = ringBuffer37.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    java.util.Iterator iterator41 = ringBuffer37.iterator();
    boolean b42 = ringBuffer37.isEmpty();
    java.util.Iterator iterator43 = ringBuffer37.iterator();
    exercise03.RingBuffer ringBuffer45 = new exercise03.RingBuffer(1);
    boolean b46 = ringBuffer45.isEmpty();
    java.util.Spliterator spliterator47 = ringBuffer45.spliterator();
    java.util.Spliterator spliterator48 = ringBuffer45.spliterator();
    java.util.Iterator iterator49 = ringBuffer45.iterator();
    boolean b50 = ringBuffer45.isEmpty();
    int i51 = ringBuffer45.size();
    java.util.Spliterator spliterator52 = ringBuffer45.spliterator();
    ringBuffer37.enqueue((java.lang.Object)spliterator52);
    ringBuffer35.enqueue((java.lang.Object)ringBuffer37);
    int i55 = ringBuffer37.size();
    java.util.Iterator iterator56 = ringBuffer37.iterator();
    ringBuffer23.enqueue((java.lang.Object)iterator56);
    boolean b58 = ringBuffer23.isEmpty();
    ringBuffer11.enqueue((java.lang.Object)ringBuffer23);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer23);
    java.util.Spliterator spliterator61 = ringBuffer23.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#'+ "'", obj9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
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
    org.junit.Assert.assertNotNull(iterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }


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
    int i73 = ringBuffer1.size();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }


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
    boolean b21 = ringBuffer9.isEmpty();
    java.util.Iterator iterator22 = ringBuffer9.iterator();
    java.util.Iterator iterator23 = ringBuffer9.iterator();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    boolean b26 = ringBuffer25.isEmpty();
    java.util.Spliterator spliterator27 = ringBuffer25.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer25.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer25.spliterator();
    java.util.Iterator iterator30 = ringBuffer25.iterator();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(10);
    ringBuffer32.enqueue((java.lang.Object)'#');
    int i35 = ringBuffer32.size();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    int i37 = ringBuffer32.size();
    int i38 = ringBuffer32.size();
    java.util.Iterator iterator39 = ringBuffer32.iterator();
    boolean b40 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator41 = ringBuffer32.spliterator();
    int i42 = ringBuffer32.size();
    java.util.Spliterator spliterator43 = ringBuffer32.spliterator();
    boolean b44 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator45 = ringBuffer32.spliterator();
    ringBuffer25.enqueue((java.lang.Object)spliterator45);
    int i47 = ringBuffer25.size();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer25);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    boolean b10 = ringBuffer1.isEmpty();
    java.lang.Object obj11 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer13.spliterator();
    java.util.Iterator iterator18 = ringBuffer13.iterator();
    int i19 = ringBuffer13.size();
    boolean b20 = ringBuffer13.isEmpty();
    boolean b21 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer13.spliterator();
    java.util.Iterator iterator24 = ringBuffer13.iterator();
    boolean b25 = ringBuffer13.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    java.util.Iterator iterator27 = ringBuffer13.iterator();
    
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(100);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer4 = new exercise03.RingBuffer(1);
    boolean b5 = ringBuffer4.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer4.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer4.spliterator();
    java.util.Iterator iterator8 = ringBuffer4.iterator();
    java.util.Iterator iterator9 = ringBuffer4.iterator();
    boolean b10 = ringBuffer4.isEmpty();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    ringBuffer4.enqueue((java.lang.Object)ringBuffer12);
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator19 = ringBuffer18.iterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer18);
    boolean b21 = ringBuffer12.isEmpty();
    boolean b22 = ringBuffer12.isEmpty();
    java.util.Iterator iterator23 = ringBuffer12.iterator();
    java.util.Spliterator spliterator24 = ringBuffer12.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    ringBuffer1.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.lang.Object obj9 = ringBuffer1.dequeue();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false+ "'", obj9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    boolean b4 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(10);
    ringBuffer6.enqueue((java.lang.Object)false);
    java.lang.Object obj9 = ringBuffer6.dequeue();
    java.util.Spliterator spliterator10 = ringBuffer6.spliterator();
    java.util.Iterator iterator11 = ringBuffer6.iterator();
    java.util.Spliterator spliterator12 = ringBuffer6.spliterator();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer16.spliterator();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    boolean b21 = ringBuffer16.isEmpty();
    java.util.Iterator iterator22 = ringBuffer16.iterator();
    ringBuffer14.enqueue((java.lang.Object)iterator22);
    int i24 = ringBuffer14.size();
    boolean b25 = ringBuffer14.isEmpty();
    java.util.Iterator iterator26 = ringBuffer14.iterator();
    int i27 = ringBuffer14.size();
    exercise03.RingBuffer ringBuffer29 = new exercise03.RingBuffer(1);
    boolean b30 = ringBuffer29.isEmpty();
    java.util.Spliterator spliterator31 = ringBuffer29.spliterator();
    java.util.Spliterator spliterator32 = ringBuffer29.spliterator();
    java.util.Iterator iterator33 = ringBuffer29.iterator();
    boolean b34 = ringBuffer29.isEmpty();
    java.util.Iterator iterator35 = ringBuffer29.iterator();
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    boolean b38 = ringBuffer37.isEmpty();
    java.util.Spliterator spliterator39 = ringBuffer37.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    java.util.Spliterator spliterator41 = ringBuffer37.spliterator();
    java.util.Iterator iterator42 = ringBuffer37.iterator();
    int i43 = ringBuffer37.size();
    ringBuffer29.enqueue((java.lang.Object)ringBuffer37);
    java.util.Iterator iterator45 = ringBuffer29.iterator();
    java.util.Spliterator spliterator46 = ringBuffer29.spliterator();
    ringBuffer14.enqueue((java.lang.Object)spliterator46);
    java.util.Iterator iterator48 = ringBuffer14.iterator();
    ringBuffer6.enqueue((java.lang.Object)iterator48);
    java.lang.Object obj50 = ringBuffer6.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer6);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false+ "'", obj9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
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
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }


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
    java.util.Spliterator spliterator19 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer15.spliterator();
    java.util.Iterator iterator21 = ringBuffer15.iterator();
    
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
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
    org.junit.Assert.assertNotNull(spliterator10);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }


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
    java.util.Spliterator spliterator19 = ringBuffer10.spliterator();
    int i20 = ringBuffer10.size();
    boolean b21 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer10.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)'#');
    java.lang.Object obj12 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#'+ "'", obj12.equals('#'));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }


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
    java.util.Spliterator spliterator19 = ringBuffer10.spliterator();
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(10);
    ringBuffer21.enqueue((java.lang.Object)'#');
    int i24 = ringBuffer21.size();
    boolean b25 = ringBuffer21.isEmpty();
    int i26 = ringBuffer21.size();
    java.lang.Object obj27 = ringBuffer21.dequeue();
    java.lang.Object obj28 = null;
    ringBuffer21.enqueue(obj28);
    java.util.Spliterator spliterator30 = ringBuffer21.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer21);
    int i32 = ringBuffer21.size();
    
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + '#'+ "'", obj27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }


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
    int i17 = ringBuffer9.size();
    java.util.Iterator iterator18 = ringBuffer9.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(10);
    ringBuffer20.enqueue((java.lang.Object)'#');
    int i23 = ringBuffer20.size();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer26);
    boolean b30 = ringBuffer20.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    ringBuffer32.enqueue((java.lang.Object)(short)0);
    int i36 = ringBuffer32.size();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer32);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer20);
    java.util.Iterator iterator39 = ringBuffer9.iterator();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }


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
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    java.util.Spliterator spliterator18 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer12.spliterator();
    int i20 = ringBuffer12.size();
    java.util.Spliterator spliterator21 = ringBuffer12.spliterator();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(10);
    ringBuffer23.enqueue((java.lang.Object)false);
    ringBuffer23.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator spliterator28 = ringBuffer23.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer23);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer23);
    java.util.Spliterator spliterator31 = ringBuffer23.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.lang.Object obj6 = ringBuffer1.dequeue();
    int i7 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(10);
    ringBuffer9.enqueue((java.lang.Object)'#');
    int i12 = ringBuffer9.size();
    boolean b13 = ringBuffer9.isEmpty();
    int i14 = ringBuffer9.size();
    boolean b15 = ringBuffer9.isEmpty();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    boolean b22 = ringBuffer17.isEmpty();
    int i23 = ringBuffer17.size();
    java.util.Spliterator spliterator24 = ringBuffer17.spliterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer26.spliterator();
    java.util.Iterator iterator31 = ringBuffer26.iterator();
    ringBuffer17.enqueue((java.lang.Object)iterator31);
    java.lang.Object obj33 = ringBuffer17.dequeue();
    exercise03.RingBuffer ringBuffer35 = new exercise03.RingBuffer(1);
    boolean b36 = ringBuffer35.isEmpty();
    java.util.Spliterator spliterator37 = ringBuffer35.spliterator();
    java.util.Spliterator spliterator38 = ringBuffer35.spliterator();
    java.util.Spliterator spliterator39 = ringBuffer35.spliterator();
    ringBuffer17.enqueue((java.lang.Object)spliterator39);
    java.lang.Object obj41 = ringBuffer17.dequeue();
    ringBuffer17.enqueue((java.lang.Object)(byte)100);
    java.lang.Object obj44 = ringBuffer17.dequeue();
    ringBuffer9.enqueue(obj44);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    int i47 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a'+ "'", obj6.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (byte)100+ "'", obj44.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    ringBuffer7.enqueue((java.lang.Object)(-1.0d));
    boolean b13 = ringBuffer7.isEmpty();
    java.util.Iterator iterator14 = ringBuffer7.iterator();
    java.lang.Object obj15 = ringBuffer7.dequeue();
    int i16 = ringBuffer7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0d)+ "'", obj15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)(short)0);
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    java.util.Spliterator spliterator16 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer10.spliterator();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    java.util.Iterator iterator23 = ringBuffer19.iterator();
    java.util.Iterator iterator24 = ringBuffer19.iterator();
    boolean b25 = ringBuffer19.isEmpty();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    ringBuffer19.enqueue((java.lang.Object)ringBuffer27);
    java.util.Iterator iterator32 = ringBuffer19.iterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer19);
    java.util.Iterator iterator34 = ringBuffer10.iterator();
    boolean b35 = ringBuffer10.isEmpty();
    int i36 = ringBuffer10.size();
    java.lang.Object obj37 = ringBuffer10.dequeue();
    ringBuffer1.enqueue(obj37);
    java.util.function.Consumer consumer39 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer39);
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
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)0+ "'", obj8.equals((short)0));
    
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
    org.junit.Assert.assertNotNull(spliterator17);
    
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
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    boolean b10 = ringBuffer1.isEmpty();
    int i11 = ringBuffer1.size();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    boolean b16 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer1.spliterator();
    boolean b19 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }


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
    int i17 = ringBuffer9.size();
    java.util.Iterator iterator18 = ringBuffer9.iterator();
    java.util.Iterator iterator19 = ringBuffer9.iterator();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    boolean b23 = ringBuffer10.isEmpty();
    java.util.Iterator iterator24 = ringBuffer10.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator24);
    boolean b26 = ringBuffer1.isEmpty();
    boolean b27 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a'+ "'", obj5.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }


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
    int i17 = ringBuffer9.size();
    java.util.Spliterator spliterator18 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    java.util.Iterator iterator20 = ringBuffer9.iterator();
    int i21 = ringBuffer9.size();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer1.size();
    int i12 = ringBuffer1.size();
    boolean b13 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    boolean b16 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer15.spliterator();
    int i20 = ringBuffer15.size();
    int i21 = ringBuffer15.size();
    int i22 = ringBuffer15.size();
    java.util.Spliterator spliterator23 = ringBuffer15.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer15);
    java.util.Spliterator spliterator25 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }


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
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    boolean b25 = ringBuffer20.isEmpty();
    java.util.Iterator iterator26 = ringBuffer20.iterator();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    boolean b34 = ringBuffer28.isEmpty();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer28);
    boolean b36 = ringBuffer20.isEmpty();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer20);
    java.util.Spliterator spliterator38 = ringBuffer20.spliterator();
    boolean b39 = ringBuffer20.isEmpty();
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    int i13 = ringBuffer7.size();
    int i14 = ringBuffer7.size();
    java.util.Iterator iterator15 = ringBuffer7.iterator();
    java.util.Iterator iterator16 = ringBuffer7.iterator();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    int i17 = ringBuffer11.size();
    java.util.Spliterator spliterator18 = ringBuffer11.spliterator();
    ringBuffer3.enqueue((java.lang.Object)spliterator18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    java.util.Iterator iterator29 = ringBuffer22.iterator();
    boolean b30 = ringBuffer22.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    ringBuffer32.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    int i36 = ringBuffer32.size();
    java.util.Spliterator spliterator37 = ringBuffer32.spliterator();
    java.util.Iterator iterator38 = ringBuffer32.iterator();
    java.util.Spliterator spliterator39 = ringBuffer32.spliterator();
    java.util.Iterator iterator40 = ringBuffer32.iterator();
    int i41 = ringBuffer32.size();
    ringBuffer22.enqueue((java.lang.Object)ringBuffer32);
    java.lang.Object obj43 = ringBuffer22.dequeue();
    java.util.Iterator iterator44 = ringBuffer22.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator44);
    exercise03.RingBuffer ringBuffer47 = new exercise03.RingBuffer(1);
    boolean b48 = ringBuffer47.isEmpty();
    java.util.Spliterator spliterator49 = ringBuffer47.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer47.spliterator();
    java.util.Iterator iterator51 = ringBuffer47.iterator();
    exercise03.RingBuffer ringBuffer53 = new exercise03.RingBuffer(10);
    ringBuffer53.enqueue((java.lang.Object)'#');
    int i56 = ringBuffer53.size();
    java.util.Iterator iterator57 = ringBuffer53.iterator();
    exercise03.RingBuffer ringBuffer59 = new exercise03.RingBuffer(1);
    boolean b60 = ringBuffer59.isEmpty();
    java.util.Spliterator spliterator61 = ringBuffer59.spliterator();
    ringBuffer53.enqueue((java.lang.Object)ringBuffer59);
    ringBuffer47.enqueue((java.lang.Object)ringBuffer59);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer47);
    int i65 = ringBuffer47.size();
    boolean b66 = ringBuffer47.isEmpty();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.lang.Object obj4 = null;
    ringBuffer1.enqueue(obj4);
    java.lang.Object obj6 = ringBuffer1.dequeue();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    java.util.Iterator iterator13 = ringBuffer9.iterator();
    boolean b14 = ringBuffer9.isEmpty();
    int i15 = ringBuffer9.size();
    java.util.Spliterator spliterator16 = ringBuffer9.spliterator();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer18.spliterator();
    java.util.Iterator iterator23 = ringBuffer18.iterator();
    ringBuffer9.enqueue((java.lang.Object)iterator23);
    boolean b25 = ringBuffer9.isEmpty();
    boolean b26 = ringBuffer9.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    java.util.Iterator iterator28 = ringBuffer9.iterator();
    java.util.function.Consumer consumer29 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer9.forEach(consumer29);
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
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
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
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator2 = ringBuffer1.iterator();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    boolean b5 = ringBuffer1.isEmpty();
    boolean b6 = ringBuffer1.isEmpty();
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
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }


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
    int i17 = ringBuffer9.size();
    java.util.Iterator iterator18 = ringBuffer9.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(10);
    ringBuffer20.enqueue((java.lang.Object)'#');
    int i23 = ringBuffer20.size();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer26);
    boolean b30 = ringBuffer20.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    ringBuffer32.enqueue((java.lang.Object)(short)0);
    int i36 = ringBuffer32.size();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer32);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer20);
    int i39 = ringBuffer9.size();
    java.lang.Object obj40 = ringBuffer9.dequeue();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.lang.Object obj7 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    ringBuffer9.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    int i13 = ringBuffer9.size();
    boolean b14 = ringBuffer9.isEmpty();
    boolean b15 = ringBuffer9.isEmpty();
    boolean b16 = ringBuffer9.isEmpty();
    boolean b17 = ringBuffer9.isEmpty();
    int i18 = ringBuffer9.size();
    ringBuffer1.enqueue((java.lang.Object)i18);
    java.util.Iterator iterator20 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    boolean b27 = ringBuffer22.isEmpty();
    int i28 = ringBuffer22.size();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    boolean b32 = ringBuffer31.isEmpty();
    java.util.Spliterator spliterator33 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer31.spliterator();
    java.util.Iterator iterator36 = ringBuffer31.iterator();
    ringBuffer22.enqueue((java.lang.Object)iterator36);
    int i38 = ringBuffer22.size();
    java.util.Iterator iterator39 = ringBuffer22.iterator();
    java.util.Iterator iterator40 = ringBuffer22.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer22);
    boolean b42 = ringBuffer1.isEmpty();
    int i43 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer45 = new exercise03.RingBuffer(10);
    ringBuffer45.enqueue((java.lang.Object)'#');
    int i48 = ringBuffer45.size();
    java.util.Iterator iterator49 = ringBuffer45.iterator();
    exercise03.RingBuffer ringBuffer51 = new exercise03.RingBuffer(1);
    boolean b52 = ringBuffer51.isEmpty();
    java.util.Spliterator spliterator53 = ringBuffer51.spliterator();
    ringBuffer45.enqueue((java.lang.Object)ringBuffer51);
    boolean b55 = ringBuffer45.isEmpty();
    exercise03.RingBuffer ringBuffer57 = new exercise03.RingBuffer(1);
    boolean b58 = ringBuffer57.isEmpty();
    ringBuffer57.enqueue((java.lang.Object)(short)0);
    int i61 = ringBuffer57.size();
    ringBuffer45.enqueue((java.lang.Object)ringBuffer57);
    java.util.Iterator iterator63 = ringBuffer57.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator63);
    java.lang.Object obj65 = ringBuffer1.dequeue();
    java.util.function.Consumer consumer66 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer66);
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
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#'+ "'", obj7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
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
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1+ "'", obj65.equals(1));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }


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
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(10);
    ringBuffer16.enqueue((java.lang.Object)'#');
    int i19 = ringBuffer16.size();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    java.util.Spliterator spliterator21 = ringBuffer16.spliterator();
    int i22 = ringBuffer16.size();
    java.lang.Object obj23 = ringBuffer16.dequeue();
    int i24 = ringBuffer16.size();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer26.spliterator();
    java.util.Iterator iterator31 = ringBuffer26.iterator();
    int i32 = ringBuffer26.size();
    boolean b33 = ringBuffer26.isEmpty();
    boolean b34 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator35 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer26.spliterator();
    java.util.Iterator iterator37 = ringBuffer26.iterator();
    exercise03.RingBuffer ringBuffer39 = new exercise03.RingBuffer(0);
    java.util.Spliterator spliterator40 = ringBuffer39.spliterator();
    ringBuffer26.enqueue((java.lang.Object)ringBuffer39);
    ringBuffer16.enqueue((java.lang.Object)ringBuffer26);
    java.util.Spliterator spliterator43 = ringBuffer16.spliterator();
    java.lang.Object obj44 = ringBuffer16.dequeue();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    boolean b46 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#'+ "'", obj23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }


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
    boolean b18 = ringBuffer9.isEmpty();
    boolean b19 = ringBuffer9.isEmpty();
    java.util.Iterator iterator20 = ringBuffer9.iterator();
    int i21 = ringBuffer9.size();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }


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
    java.lang.Object obj41 = ringBuffer1.dequeue();
    boolean b42 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator43 = ringBuffer1.spliterator();
    int i44 = ringBuffer1.size();
    java.lang.Object obj45 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer47 = new exercise03.RingBuffer(10);
    ringBuffer47.enqueue((java.lang.Object)false);
    java.lang.Object obj50 = ringBuffer47.dequeue();
    java.util.Spliterator spliterator51 = ringBuffer47.spliterator();
    int i52 = ringBuffer47.size();
    boolean b53 = ringBuffer47.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b53);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj50 + "' != '" + false+ "'", obj50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator11 = ringBuffer10.iterator();
    java.util.Iterator iterator12 = ringBuffer10.iterator();
    java.lang.Object obj13 = null;
    ringBuffer10.enqueue(obj13);
    ringBuffer1.enqueue(obj13);
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator18 = ringBuffer17.spliterator();
    int i19 = ringBuffer17.size();
    ringBuffer1.enqueue((java.lang.Object)i19);
    boolean b21 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(1);
    boolean b24 = ringBuffer23.isEmpty();
    java.util.Spliterator spliterator25 = ringBuffer23.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer23.spliterator();
    java.util.Iterator iterator27 = ringBuffer23.iterator();
    boolean b28 = ringBuffer23.isEmpty();
    int i29 = ringBuffer23.size();
    java.util.Iterator iterator30 = ringBuffer23.iterator();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    boolean b37 = ringBuffer32.isEmpty();
    int i38 = ringBuffer32.size();
    java.util.Spliterator spliterator39 = ringBuffer32.spliterator();
    ringBuffer23.enqueue((java.lang.Object)ringBuffer32);
    java.util.Spliterator spliterator41 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator42 = ringBuffer32.spliterator();
    exercise03.RingBuffer ringBuffer44 = new exercise03.RingBuffer(1);
    ringBuffer44.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator47 = ringBuffer44.spliterator();
    int i48 = ringBuffer44.size();
    boolean b49 = ringBuffer44.isEmpty();
    java.util.Spliterator spliterator50 = ringBuffer44.spliterator();
    ringBuffer32.enqueue((java.lang.Object)ringBuffer44);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }


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
    int i34 = ringBuffer1.size();
    java.util.Spliterator spliterator35 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer36 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer36);
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
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    boolean b7 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false+ "'", obj5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    ringBuffer11.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    int i15 = ringBuffer11.size();
    java.util.Spliterator spliterator16 = ringBuffer11.spliterator();
    java.util.Iterator iterator17 = ringBuffer11.iterator();
    java.util.Spliterator spliterator18 = ringBuffer11.spliterator();
    java.util.Iterator iterator19 = ringBuffer11.iterator();
    int i20 = ringBuffer11.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer11);
    java.lang.Object obj22 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    java.util.Iterator iterator29 = ringBuffer24.iterator();
    java.util.Iterator iterator30 = ringBuffer24.iterator();
    java.util.Iterator iterator31 = ringBuffer24.iterator();
    java.util.Spliterator spliterator32 = ringBuffer24.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer24);
    java.lang.Object obj34 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue(obj34);
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
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
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
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Iterator iterator3 = ringBuffer1.iterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }


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
    boolean b14 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    boolean b16 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }


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
    java.util.Spliterator spliterator17 = ringBuffer9.spliterator();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(10);
    ringBuffer19.enqueue((java.lang.Object)'#');
    int i22 = ringBuffer19.size();
    java.util.Iterator iterator23 = ringBuffer19.iterator();
    int i24 = ringBuffer19.size();
    java.lang.Object obj25 = ringBuffer19.dequeue();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    ringBuffer27.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    int i31 = ringBuffer27.size();
    boolean b32 = ringBuffer27.isEmpty();
    boolean b33 = ringBuffer27.isEmpty();
    boolean b34 = ringBuffer27.isEmpty();
    boolean b35 = ringBuffer27.isEmpty();
    int i36 = ringBuffer27.size();
    ringBuffer19.enqueue((java.lang.Object)i36);
    java.util.Iterator iterator38 = ringBuffer19.iterator();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer19);
    java.lang.Object obj40 = ringBuffer9.dequeue();
    exercise03.RingBuffer ringBuffer42 = new exercise03.RingBuffer(1);
    boolean b43 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator44 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator45 = ringBuffer42.spliterator();
    java.util.Iterator iterator46 = ringBuffer42.iterator();
    boolean b47 = ringBuffer42.isEmpty();
    int i48 = ringBuffer42.size();
    java.util.Iterator iterator49 = ringBuffer42.iterator();
    exercise03.RingBuffer ringBuffer51 = new exercise03.RingBuffer(1);
    boolean b52 = ringBuffer51.isEmpty();
    java.util.Spliterator spliterator53 = ringBuffer51.spliterator();
    java.util.Spliterator spliterator54 = ringBuffer51.spliterator();
    java.util.Iterator iterator55 = ringBuffer51.iterator();
    boolean b56 = ringBuffer51.isEmpty();
    int i57 = ringBuffer51.size();
    java.util.Spliterator spliterator58 = ringBuffer51.spliterator();
    ringBuffer42.enqueue((java.lang.Object)ringBuffer51);
    java.util.Spliterator spliterator60 = ringBuffer51.spliterator();
    java.util.Iterator iterator61 = ringBuffer51.iterator();
    exercise03.RingBuffer ringBuffer63 = new exercise03.RingBuffer(1);
    boolean b64 = ringBuffer63.isEmpty();
    java.util.Spliterator spliterator65 = ringBuffer63.spliterator();
    java.util.Spliterator spliterator66 = ringBuffer63.spliterator();
    java.util.Iterator iterator67 = ringBuffer63.iterator();
    java.util.Iterator iterator68 = ringBuffer63.iterator();
    java.util.Spliterator spliterator69 = ringBuffer63.spliterator();
    java.util.Spliterator spliterator70 = ringBuffer63.spliterator();
    java.util.Spliterator spliterator71 = ringBuffer63.spliterator();
    ringBuffer51.enqueue((java.lang.Object)spliterator71);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer51);
    
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
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + '#'+ "'", obj25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator71);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator11 = ringBuffer10.iterator();
    java.util.Iterator iterator12 = ringBuffer10.iterator();
    java.lang.Object obj13 = null;
    ringBuffer10.enqueue(obj13);
    ringBuffer1.enqueue(obj13);
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    java.util.Spliterator spliterator18 = ringBuffer17.spliterator();
    int i19 = ringBuffer17.size();
    ringBuffer1.enqueue((java.lang.Object)i19);
    int i21 = ringBuffer1.size();
    java.util.Spliterator spliterator22 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer23 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer23);
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
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }


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
    java.lang.Object obj17 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator18 = ringBuffer1.spliterator();
    int i19 = ringBuffer1.size();
    java.util.Iterator iterator20 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    ringBuffer22.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator25 = ringBuffer22.iterator();
    java.lang.Object obj26 = ringBuffer22.dequeue();
    boolean b27 = ringBuffer22.isEmpty();
    int i28 = ringBuffer22.size();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer22);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj31 = ringBuffer22.dequeue();
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
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 'a'+ "'", obj26.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    java.util.Spliterator spliterator18 = ringBuffer12.spliterator();
    int i19 = ringBuffer12.size();
    java.util.Spliterator spliterator20 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer12.spliterator();
    boolean b23 = ringBuffer12.isEmpty();
    int i24 = ringBuffer12.size();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(10);
    ringBuffer26.enqueue((java.lang.Object)'#');
    int i29 = ringBuffer26.size();
    boolean b30 = ringBuffer26.isEmpty();
    int i31 = ringBuffer26.size();
    boolean b32 = ringBuffer26.isEmpty();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(10);
    ringBuffer34.enqueue((java.lang.Object)false);
    ringBuffer26.enqueue((java.lang.Object)ringBuffer34);
    ringBuffer12.enqueue((java.lang.Object)ringBuffer34);
    int i39 = ringBuffer34.size();
    exercise03.RingBuffer ringBuffer41 = new exercise03.RingBuffer(1);
    boolean b42 = ringBuffer41.isEmpty();
    java.util.Spliterator spliterator43 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator44 = ringBuffer41.spliterator();
    java.util.Iterator iterator45 = ringBuffer41.iterator();
    boolean b46 = ringBuffer41.isEmpty();
    int i47 = ringBuffer41.size();
    java.util.Spliterator spliterator48 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator49 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator50 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator51 = ringBuffer41.spliterator();
    boolean b52 = ringBuffer41.isEmpty();
    int i53 = ringBuffer41.size();
    ringBuffer34.enqueue((java.lang.Object)i53);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer34);
    exercise03.RingBuffer ringBuffer57 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator58 = ringBuffer57.iterator();
    java.util.Iterator iterator59 = ringBuffer57.iterator();
    java.util.Iterator iterator60 = ringBuffer57.iterator();
    boolean b61 = ringBuffer57.isEmpty();
    boolean b62 = ringBuffer57.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer57);
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
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
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
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    java.lang.Object obj8 = ringBuffer1.dequeue();
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
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a'+ "'", obj8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer13.spliterator();
    java.util.Iterator iterator17 = ringBuffer13.iterator();
    boolean b18 = ringBuffer13.isEmpty();
    int i19 = ringBuffer13.size();
    java.lang.Object obj20 = null;
    ringBuffer13.enqueue(obj20);
    ringBuffer1.enqueue(obj20);
    int i23 = ringBuffer1.size();
    boolean b24 = ringBuffer1.isEmpty();
    boolean b25 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    ringBuffer1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    ringBuffer7.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    boolean b13 = ringBuffer7.isEmpty();
    java.util.Iterator iterator14 = ringBuffer7.iterator();
    int i15 = ringBuffer7.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    java.lang.Object obj17 = ringBuffer7.dequeue();
    boolean b18 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer7.spliterator();
    java.util.function.Consumer consumer20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer7.forEach(consumer20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 'a'+ "'", obj17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(0);
    java.util.Spliterator spliterator2 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
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
    org.junit.Assert.assertNotNull(spliterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(10);
    ringBuffer11.enqueue((java.lang.Object)'#');
    int i14 = ringBuffer11.size();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    ringBuffer11.enqueue((java.lang.Object)ringBuffer17);
    int i21 = ringBuffer17.size();
    boolean b22 = ringBuffer17.isEmpty();
    int i23 = ringBuffer17.size();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer27.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    java.util.Iterator iterator31 = ringBuffer27.iterator();
    boolean b32 = ringBuffer27.isEmpty();
    java.util.Iterator iterator33 = ringBuffer27.iterator();
    exercise03.RingBuffer ringBuffer35 = new exercise03.RingBuffer(1);
    boolean b36 = ringBuffer35.isEmpty();
    java.util.Spliterator spliterator37 = ringBuffer35.spliterator();
    java.util.Spliterator spliterator38 = ringBuffer35.spliterator();
    java.util.Iterator iterator39 = ringBuffer35.iterator();
    boolean b40 = ringBuffer35.isEmpty();
    int i41 = ringBuffer35.size();
    java.util.Spliterator spliterator42 = ringBuffer35.spliterator();
    ringBuffer27.enqueue((java.lang.Object)spliterator42);
    ringBuffer25.enqueue((java.lang.Object)ringBuffer27);
    int i45 = ringBuffer27.size();
    boolean b46 = ringBuffer27.isEmpty();
    ringBuffer17.enqueue((java.lang.Object)b46);
    java.util.Spliterator spliterator48 = ringBuffer17.spliterator();
    java.lang.Object obj49 = ringBuffer17.dequeue();
    ringBuffer1.enqueue(obj49);
    java.util.Spliterator spliterator51 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + false+ "'", obj49.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    java.util.Iterator iterator9 = ringBuffer3.iterator();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    int i17 = ringBuffer11.size();
    java.util.Spliterator spliterator18 = ringBuffer11.spliterator();
    ringBuffer3.enqueue((java.lang.Object)spliterator18);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    int i21 = ringBuffer3.size();
    java.util.Iterator iterator22 = ringBuffer3.iterator();
    java.util.Spliterator spliterator23 = ringBuffer3.spliterator();
    java.lang.Object obj24 = ringBuffer3.dequeue();
    int i25 = ringBuffer3.size();
    boolean b26 = ringBuffer3.isEmpty();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    java.util.Spliterator spliterator34 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer28.spliterator();
    boolean b37 = ringBuffer28.isEmpty();
    exercise03.RingBuffer ringBuffer39 = new exercise03.RingBuffer(1);
    ringBuffer39.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator42 = ringBuffer39.spliterator();
    int i43 = ringBuffer39.size();
    java.util.Spliterator spliterator44 = ringBuffer39.spliterator();
    java.util.Iterator iterator45 = ringBuffer39.iterator();
    java.util.Spliterator spliterator46 = ringBuffer39.spliterator();
    java.lang.Object obj47 = ringBuffer39.dequeue();
    int i48 = ringBuffer39.size();
    ringBuffer28.enqueue((java.lang.Object)i48);
    java.util.Spliterator spliterator50 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator51 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator52 = ringBuffer28.spliterator();
    boolean b53 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator54 = ringBuffer28.spliterator();
    ringBuffer3.enqueue((java.lang.Object)ringBuffer28);
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 'a'+ "'", obj47.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.lang.Object obj9 = null;
    ringBuffer1.enqueue(obj9);
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
    java.util.Iterator iterator25 = ringBuffer12.iterator();
    java.lang.Object obj26 = ringBuffer12.dequeue();
    int i27 = ringBuffer12.size();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)i27);
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a'+ "'", obj5.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
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
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer3.spliterator();
    java.util.Iterator iterator8 = ringBuffer3.iterator();
    int i9 = ringBuffer3.size();
    boolean b10 = ringBuffer3.isEmpty();
    boolean b11 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer3.spliterator();
    java.util.Iterator iterator14 = ringBuffer3.iterator();
    java.util.Spliterator spliterator15 = ringBuffer3.spliterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    java.util.Iterator iterator22 = ringBuffer17.iterator();
    java.util.Spliterator spliterator23 = ringBuffer17.spliterator();
    int i24 = ringBuffer17.size();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    ringBuffer26.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    int i30 = ringBuffer26.size();
    boolean b31 = ringBuffer26.isEmpty();
    boolean b32 = ringBuffer26.isEmpty();
    int i33 = ringBuffer26.size();
    java.lang.Object obj34 = ringBuffer26.dequeue();
    java.util.Iterator iterator35 = ringBuffer26.iterator();
    ringBuffer17.enqueue((java.lang.Object)iterator35);
    ringBuffer3.enqueue((java.lang.Object)ringBuffer17);
    int i38 = ringBuffer3.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    int i40 = ringBuffer1.size();
    java.util.Spliterator spliterator41 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a'+ "'", obj34.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(10);
    ringBuffer11.enqueue((java.lang.Object)'#');
    int i14 = ringBuffer11.size();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    int i16 = ringBuffer11.size();
    java.lang.Object obj17 = ringBuffer11.dequeue();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    ringBuffer19.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    int i23 = ringBuffer19.size();
    boolean b24 = ringBuffer19.isEmpty();
    boolean b25 = ringBuffer19.isEmpty();
    boolean b26 = ringBuffer19.isEmpty();
    boolean b27 = ringBuffer19.isEmpty();
    int i28 = ringBuffer19.size();
    ringBuffer11.enqueue((java.lang.Object)i28);
    java.util.Iterator iterator30 = ringBuffer11.iterator();
    java.util.Iterator iterator31 = ringBuffer11.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer11);
    boolean b33 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer1.spliterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '#'+ "'", obj17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer11.spliterator();
    java.util.Iterator iterator16 = ringBuffer11.iterator();
    ringBuffer8.enqueue((java.lang.Object)ringBuffer11);
    java.util.Spliterator spliterator18 = ringBuffer8.spliterator();
    boolean b19 = ringBuffer8.isEmpty();
    boolean b20 = ringBuffer8.isEmpty();
    java.lang.Object obj21 = ringBuffer8.dequeue();
    java.util.Iterator iterator22 = ringBuffer8.iterator();
    int i23 = ringBuffer8.size();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    boolean b19 = ringBuffer1.isEmpty();
    boolean b20 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer22.spliterator();
    int i30 = ringBuffer22.size();
    boolean b31 = ringBuffer22.isEmpty();
    int i32 = ringBuffer22.size();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(1);
    ringBuffer34.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator37 = ringBuffer34.spliterator();
    java.lang.Object obj38 = ringBuffer34.dequeue();
    java.util.Spliterator spliterator39 = ringBuffer34.spliterator();
    boolean b40 = ringBuffer34.isEmpty();
    int i41 = ringBuffer34.size();
    ringBuffer22.enqueue((java.lang.Object)ringBuffer34);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer34);
    boolean b44 = ringBuffer1.isEmpty();
    java.util.Iterator iterator45 = ringBuffer1.iterator();
    java.util.Spliterator spliterator46 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 'a'+ "'", obj38.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test111"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(1);
    ringBuffer6.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator9 = ringBuffer6.spliterator();
    int i10 = ringBuffer6.size();
    boolean b11 = ringBuffer6.isEmpty();
    boolean b12 = ringBuffer6.isEmpty();
    boolean b13 = ringBuffer6.isEmpty();
    boolean b14 = ringBuffer6.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer6);
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    boolean b22 = ringBuffer17.isEmpty();
    java.util.Iterator iterator23 = ringBuffer17.iterator();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    boolean b26 = ringBuffer25.isEmpty();
    java.util.Spliterator spliterator27 = ringBuffer25.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer25.spliterator();
    java.util.Iterator iterator29 = ringBuffer25.iterator();
    java.util.Iterator iterator30 = ringBuffer25.iterator();
    boolean b31 = ringBuffer25.isEmpty();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer25);
    java.util.Spliterator spliterator33 = ringBuffer25.spliterator();
    exercise03.RingBuffer ringBuffer35 = new exercise03.RingBuffer(10);
    ringBuffer35.enqueue((java.lang.Object)'#');
    int i38 = ringBuffer35.size();
    java.util.Iterator iterator39 = ringBuffer35.iterator();
    int i40 = ringBuffer35.size();
    java.lang.Object obj41 = ringBuffer35.dequeue();
    exercise03.RingBuffer ringBuffer43 = new exercise03.RingBuffer(1);
    ringBuffer43.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator46 = ringBuffer43.spliterator();
    int i47 = ringBuffer43.size();
    boolean b48 = ringBuffer43.isEmpty();
    boolean b49 = ringBuffer43.isEmpty();
    boolean b50 = ringBuffer43.isEmpty();
    boolean b51 = ringBuffer43.isEmpty();
    int i52 = ringBuffer43.size();
    ringBuffer35.enqueue((java.lang.Object)i52);
    java.util.Iterator iterator54 = ringBuffer35.iterator();
    ringBuffer25.enqueue((java.lang.Object)ringBuffer35);
    java.lang.Object obj56 = ringBuffer25.dequeue();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer25);
    java.util.Iterator iterator58 = ringBuffer25.iterator();
    boolean b59 = ringBuffer25.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#'+ "'", obj41.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test112"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a'+ "'", obj5.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test113"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test114"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.lang.Object obj9 = ringBuffer1.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj10 = ringBuffer1.dequeue();
      org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException");
    } catch (exercise03.RingBufferException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("exercise03.RingBufferException")) {
        org.junit.Assert.fail("Expected exception of type exercise03.RingBufferException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#'+ "'", obj9.equals('#'));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test115"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(1);
    ringBuffer6.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator9 = ringBuffer6.spliterator();
    java.lang.Object obj10 = ringBuffer6.dequeue();
    java.util.Spliterator spliterator11 = ringBuffer6.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer6);
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    boolean b15 = ringBuffer14.isEmpty();
    java.util.Spliterator spliterator16 = ringBuffer14.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    java.util.Iterator iterator18 = ringBuffer14.iterator();
    boolean b19 = ringBuffer14.isEmpty();
    java.util.Iterator iterator20 = ringBuffer14.iterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    java.util.Iterator iterator27 = ringBuffer22.iterator();
    boolean b28 = ringBuffer22.isEmpty();
    ringBuffer14.enqueue((java.lang.Object)ringBuffer22);
    boolean b30 = ringBuffer22.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    boolean b37 = ringBuffer32.isEmpty();
    java.util.Iterator iterator38 = ringBuffer32.iterator();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator43 = ringBuffer40.spliterator();
    java.util.Iterator iterator44 = ringBuffer40.iterator();
    java.util.Iterator iterator45 = ringBuffer40.iterator();
    boolean b46 = ringBuffer40.isEmpty();
    ringBuffer32.enqueue((java.lang.Object)ringBuffer40);
    boolean b48 = ringBuffer32.isEmpty();
    java.lang.Object obj49 = ringBuffer32.dequeue();
    boolean b50 = ringBuffer32.isEmpty();
    exercise03.RingBuffer ringBuffer52 = new exercise03.RingBuffer(10);
    ringBuffer52.enqueue((java.lang.Object)'#');
    int i55 = ringBuffer52.size();
    java.util.Iterator iterator56 = ringBuffer52.iterator();
    java.util.Spliterator spliterator57 = ringBuffer52.spliterator();
    ringBuffer32.enqueue((java.lang.Object)ringBuffer52);
    ringBuffer22.enqueue((java.lang.Object)ringBuffer32);
    java.util.Spliterator spliterator60 = ringBuffer32.spliterator();
    int i61 = ringBuffer32.size();
    java.util.Iterator iterator62 = ringBuffer32.iterator();
    java.lang.Object obj63 = ringBuffer32.dequeue();
    ringBuffer6.enqueue((java.lang.Object)ringBuffer32);
    int i65 = ringBuffer32.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a'+ "'", obj10.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
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
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test116"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    boolean b8 = ringBuffer1.isEmpty();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    ringBuffer15.enqueue((java.lang.Object)'a');
    boolean b18 = ringBuffer15.isEmpty();
    java.util.Iterator iterator19 = ringBuffer15.iterator();
    java.util.Spliterator spliterator20 = ringBuffer15.spliterator();
    boolean b21 = ringBuffer15.isEmpty();
    int i22 = ringBuffer15.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer15);
    
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test117"); }


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
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    boolean b25 = ringBuffer20.isEmpty();
    java.util.Iterator iterator26 = ringBuffer20.iterator();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    boolean b34 = ringBuffer28.isEmpty();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer28);
    boolean b36 = ringBuffer20.isEmpty();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer20);
    java.lang.Object obj38 = ringBuffer20.dequeue();
    java.util.Iterator iterator39 = ringBuffer20.iterator();
    boolean b40 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator41 = ringBuffer20.spliterator();
    int i42 = ringBuffer20.size();
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test118"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(10);
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
    boolean b29 = ringBuffer24.isEmpty();
    int i30 = ringBuffer24.size();
    java.util.Spliterator spliterator31 = ringBuffer24.spliterator();
    ringBuffer16.enqueue((java.lang.Object)spliterator31);
    ringBuffer14.enqueue((java.lang.Object)ringBuffer16);
    java.lang.Object obj34 = ringBuffer16.dequeue();
    boolean b35 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator36 = ringBuffer16.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    java.lang.Object obj38 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator39 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer41 = new exercise03.RingBuffer(1);
    boolean b42 = ringBuffer41.isEmpty();
    java.util.Spliterator spliterator43 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator44 = ringBuffer41.spliterator();
    java.util.Iterator iterator45 = ringBuffer41.iterator();
    boolean b46 = ringBuffer41.isEmpty();
    exercise03.RingBuffer ringBuffer48 = new exercise03.RingBuffer(1);
    ringBuffer41.enqueue((java.lang.Object)ringBuffer48);
    exercise03.RingBuffer ringBuffer51 = new exercise03.RingBuffer(1);
    boolean b52 = ringBuffer51.isEmpty();
    java.util.Spliterator spliterator53 = ringBuffer51.spliterator();
    java.util.Spliterator spliterator54 = ringBuffer51.spliterator();
    java.util.Spliterator spliterator55 = ringBuffer51.spliterator();
    java.util.Iterator iterator56 = ringBuffer51.iterator();
    ringBuffer48.enqueue((java.lang.Object)ringBuffer51);
    int i58 = ringBuffer48.size();
    java.lang.Object obj59 = ringBuffer48.dequeue();
    exercise03.RingBuffer ringBuffer61 = new exercise03.RingBuffer(1);
    boolean b62 = ringBuffer61.isEmpty();
    java.util.Spliterator spliterator63 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator64 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator65 = ringBuffer61.spliterator();
    java.util.Iterator iterator66 = ringBuffer61.iterator();
    int i67 = ringBuffer61.size();
    boolean b68 = ringBuffer61.isEmpty();
    boolean b69 = ringBuffer61.isEmpty();
    int i70 = ringBuffer61.size();
    ringBuffer48.enqueue((java.lang.Object)i70);
    java.util.Spliterator spliterator72 = ringBuffer48.spliterator();
    java.util.Iterator iterator73 = ringBuffer48.iterator();
    java.util.Iterator iterator74 = ringBuffer48.iterator();
    java.util.Iterator iterator75 = ringBuffer48.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer48);
    java.lang.Object obj77 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj77);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test119"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator10);
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    ringBuffer17.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.lang.Object obj21 = ringBuffer17.dequeue();
    java.util.Spliterator spliterator22 = ringBuffer17.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer17);
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a'+ "'", obj21.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test120"); }


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
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer16.spliterator();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    java.util.Iterator iterator21 = ringBuffer16.iterator();
    java.util.Spliterator spliterator22 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer16.spliterator();
    int i24 = ringBuffer16.size();
    int i25 = ringBuffer16.size();
    int i26 = ringBuffer16.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    java.util.Spliterator spliterator28 = ringBuffer16.spliterator();
    java.util.Iterator iterator29 = ringBuffer16.iterator();
    java.util.Iterator iterator30 = ringBuffer16.iterator();
    int i31 = ringBuffer16.size();
    
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
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test121"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    boolean b10 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator11 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer9.spliterator();
    java.util.Iterator iterator13 = ringBuffer9.iterator();
    boolean b14 = ringBuffer9.isEmpty();
    int i15 = ringBuffer9.size();
    java.lang.Object obj16 = null;
    ringBuffer9.enqueue(obj16);
    boolean b18 = ringBuffer9.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b18);
    java.util.function.Consumer consumer20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer20);
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
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test122"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    boolean b9 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#'+ "'", obj8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test123"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test124"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.lang.Object obj12 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#'+ "'", obj12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test125"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    java.util.Iterator iterator16 = ringBuffer11.iterator();
    boolean b17 = ringBuffer11.isEmpty();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    ringBuffer11.enqueue((java.lang.Object)ringBuffer19);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer11);
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator30 = ringBuffer26.spliterator();
    java.util.Iterator iterator31 = ringBuffer26.iterator();
    int i32 = ringBuffer26.size();
    boolean b33 = ringBuffer26.isEmpty();
    boolean b34 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator35 = ringBuffer26.spliterator();
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
    java.lang.Object obj53 = ringBuffer37.dequeue();
    ringBuffer26.enqueue(obj53);
    java.util.Spliterator spliterator55 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator56 = ringBuffer26.spliterator();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer26);
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
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
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
    org.junit.Assert.assertNotNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test126"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a'+ "'", obj8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test127"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.lang.Object obj4 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(10);
    ringBuffer7.enqueue((java.lang.Object)'#');
    int i10 = ringBuffer7.size();
    java.util.Iterator iterator11 = ringBuffer7.iterator();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer13.spliterator();
    ringBuffer7.enqueue((java.lang.Object)ringBuffer13);
    int i17 = ringBuffer13.size();
    java.util.Spliterator spliterator18 = ringBuffer13.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    int i20 = ringBuffer1.size();
    boolean b21 = ringBuffer1.isEmpty();
    boolean b22 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a'+ "'", obj4.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test128"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    java.util.Iterator iterator23 = ringBuffer10.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer10);
    java.util.Iterator iterator25 = ringBuffer10.iterator();
    java.util.Iterator iterator26 = ringBuffer10.iterator();
    java.lang.Object obj27 = ringBuffer10.dequeue();
    exercise03.RingBuffer ringBuffer29 = new exercise03.RingBuffer(1);
    boolean b30 = ringBuffer29.isEmpty();
    java.util.Spliterator spliterator31 = ringBuffer29.spliterator();
    java.util.Spliterator spliterator32 = ringBuffer29.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer29.spliterator();
    java.util.Iterator iterator34 = ringBuffer29.iterator();
    int i35 = ringBuffer29.size();
    int i36 = ringBuffer29.size();
    int i37 = ringBuffer29.size();
    int i38 = ringBuffer29.size();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator43 = ringBuffer40.spliterator();
    java.util.Iterator iterator44 = ringBuffer40.iterator();
    java.util.Iterator iterator45 = ringBuffer40.iterator();
    java.util.Spliterator spliterator46 = ringBuffer40.spliterator();
    java.util.Iterator iterator47 = ringBuffer40.iterator();
    java.util.Iterator iterator48 = ringBuffer40.iterator();
    int i49 = ringBuffer40.size();
    ringBuffer29.enqueue((java.lang.Object)i49);
    ringBuffer10.enqueue((java.lang.Object)ringBuffer29);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test129"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    boolean b14 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer16.spliterator();
    java.util.Iterator iterator20 = ringBuffer16.iterator();
    java.util.Iterator iterator21 = ringBuffer16.iterator();
    java.util.Spliterator spliterator22 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer16.spliterator();
    int i24 = ringBuffer16.size();
    int i25 = ringBuffer16.size();
    int i26 = ringBuffer16.size();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
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
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test130"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    java.util.Iterator iterator22 = ringBuffer17.iterator();
    java.util.Spliterator spliterator23 = ringBuffer17.spliterator();
    java.util.Iterator iterator24 = ringBuffer17.iterator();
    boolean b25 = ringBuffer17.isEmpty();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    ringBuffer27.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator30 = ringBuffer27.spliterator();
    int i31 = ringBuffer27.size();
    java.util.Spliterator spliterator32 = ringBuffer27.spliterator();
    java.util.Iterator iterator33 = ringBuffer27.iterator();
    java.util.Spliterator spliterator34 = ringBuffer27.spliterator();
    java.util.Iterator iterator35 = ringBuffer27.iterator();
    int i36 = ringBuffer27.size();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer27);
    boolean b38 = ringBuffer17.isEmpty();
    java.lang.Object obj39 = ringBuffer17.dequeue();
    exercise03.RingBuffer ringBuffer41 = new exercise03.RingBuffer(1);
    ringBuffer41.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator44 = ringBuffer41.spliterator();
    java.util.Iterator iterator45 = ringBuffer41.iterator();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer41);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer17);
    
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
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test131"); }


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
    int i44 = ringBuffer15.size();
    
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
    org.junit.Assert.assertTrue(i44 == 1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test132"); }


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
    boolean b24 = ringBuffer19.isEmpty();
    int i25 = ringBuffer19.size();
    java.util.Iterator iterator26 = ringBuffer19.iterator();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    boolean b33 = ringBuffer28.isEmpty();
    int i34 = ringBuffer28.size();
    java.util.Spliterator spliterator35 = ringBuffer28.spliterator();
    ringBuffer19.enqueue((java.lang.Object)ringBuffer28);
    java.util.Spliterator spliterator37 = ringBuffer28.spliterator();
    boolean b38 = ringBuffer28.isEmpty();
    ringBuffer15.enqueue((java.lang.Object)b38);
    java.util.Spliterator spliterator40 = ringBuffer15.spliterator();
    int i41 = ringBuffer15.size();
    java.util.Iterator iterator42 = ringBuffer15.iterator();
    boolean b43 = ringBuffer15.isEmpty();
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test133"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.lang.Object obj11 = ringBuffer1.dequeue();
    int i12 = ringBuffer1.size();
    boolean b13 = ringBuffer1.isEmpty();
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
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '#'+ "'", obj11.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test134"); }


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
    java.util.Spliterator spliterator19 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer10.spliterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    ringBuffer22.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    int i26 = ringBuffer22.size();
    boolean b27 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer22.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer22);
    java.util.Spliterator spliterator30 = ringBuffer10.spliterator();
    int i31 = ringBuffer10.size();
    java.util.Iterator iterator32 = ringBuffer10.iterator();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(1);
    boolean b35 = ringBuffer34.isEmpty();
    java.util.Spliterator spliterator36 = ringBuffer34.spliterator();
    java.util.Spliterator spliterator37 = ringBuffer34.spliterator();
    int i38 = ringBuffer34.size();
    boolean b39 = ringBuffer34.isEmpty();
    int i40 = ringBuffer34.size();
    java.util.Spliterator spliterator41 = ringBuffer34.spliterator();
    int i42 = ringBuffer34.size();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer10.enqueue((java.lang.Object)i42);
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
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test135"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    boolean b15 = ringBuffer14.isEmpty();
    java.util.Spliterator spliterator16 = ringBuffer14.spliterator();
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    java.util.Iterator iterator18 = ringBuffer14.iterator();
    java.util.Iterator iterator19 = ringBuffer14.iterator();
    boolean b20 = ringBuffer14.isEmpty();
    int i21 = ringBuffer14.size();
    boolean b22 = ringBuffer14.isEmpty();
    java.util.Iterator iterator23 = ringBuffer14.iterator();
    java.util.Iterator iterator24 = ringBuffer14.iterator();
    java.util.Iterator iterator25 = ringBuffer14.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer14);
    int i27 = ringBuffer14.size();
    
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
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test136"); }


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
    boolean b18 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    int i20 = ringBuffer9.size();
    java.lang.Object obj21 = ringBuffer9.dequeue();
    java.util.Spliterator spliterator22 = ringBuffer9.spliterator();
    boolean b23 = ringBuffer9.isEmpty();
    java.util.Iterator iterator24 = ringBuffer9.iterator();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test137"); }


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
    exercise03.RingBuffer ringBuffer42 = new exercise03.RingBuffer(1);
    boolean b43 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator44 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator45 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator46 = ringBuffer42.spliterator();
    java.util.Iterator iterator47 = ringBuffer42.iterator();
    int i48 = ringBuffer42.size();
    boolean b49 = ringBuffer42.isEmpty();
    boolean b50 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator51 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator52 = ringBuffer42.spliterator();
    java.util.Iterator iterator53 = ringBuffer42.iterator();
    exercise03.RingBuffer ringBuffer55 = new exercise03.RingBuffer(0);
    java.util.Spliterator spliterator56 = ringBuffer55.spliterator();
    ringBuffer42.enqueue((java.lang.Object)ringBuffer55);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer55);
    exercise03.RingBuffer ringBuffer60 = new exercise03.RingBuffer(1);
    boolean b61 = ringBuffer60.isEmpty();
    java.util.Spliterator spliterator62 = ringBuffer60.spliterator();
    java.util.Spliterator spliterator63 = ringBuffer60.spliterator();
    java.util.Iterator iterator64 = ringBuffer60.iterator();
    java.util.Iterator iterator65 = ringBuffer60.iterator();
    java.util.Spliterator spliterator66 = ringBuffer60.spliterator();
    java.util.Spliterator spliterator67 = ringBuffer60.spliterator();
    int i68 = ringBuffer60.size();
    java.util.Spliterator spliterator69 = ringBuffer60.spliterator();
    exercise03.RingBuffer ringBuffer71 = new exercise03.RingBuffer(1);
    boolean b72 = ringBuffer71.isEmpty();
    java.util.Spliterator spliterator73 = ringBuffer71.spliterator();
    java.util.Spliterator spliterator74 = ringBuffer71.spliterator();
    java.util.Spliterator spliterator75 = ringBuffer71.spliterator();
    java.util.Iterator iterator76 = ringBuffer71.iterator();
    int i77 = ringBuffer71.size();
    int i78 = ringBuffer71.size();
    ringBuffer60.enqueue((java.lang.Object)ringBuffer71);
    java.util.Iterator iterator80 = ringBuffer71.iterator();
    boolean b81 = ringBuffer71.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer71);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test138"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    boolean b14 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    java.util.Iterator iterator23 = ringBuffer18.iterator();
    java.util.Spliterator spliterator24 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer18.spliterator();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    boolean b28 = ringBuffer27.isEmpty();
    java.util.Iterator iterator29 = ringBuffer27.iterator();
    boolean b30 = ringBuffer27.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    java.util.Iterator iterator37 = ringBuffer32.iterator();
    boolean b38 = ringBuffer32.isEmpty();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator43 = ringBuffer40.spliterator();
    ringBuffer32.enqueue((java.lang.Object)ringBuffer40);
    exercise03.RingBuffer ringBuffer46 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator47 = ringBuffer46.iterator();
    ringBuffer40.enqueue((java.lang.Object)ringBuffer46);
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    boolean b55 = ringBuffer50.isEmpty();
    int i56 = ringBuffer50.size();
    java.util.Iterator iterator57 = ringBuffer50.iterator();
    exercise03.RingBuffer ringBuffer59 = new exercise03.RingBuffer(1);
    boolean b60 = ringBuffer59.isEmpty();
    java.util.Spliterator spliterator61 = ringBuffer59.spliterator();
    java.util.Spliterator spliterator62 = ringBuffer59.spliterator();
    java.util.Iterator iterator63 = ringBuffer59.iterator();
    boolean b64 = ringBuffer59.isEmpty();
    int i65 = ringBuffer59.size();
    java.util.Spliterator spliterator66 = ringBuffer59.spliterator();
    ringBuffer50.enqueue((java.lang.Object)ringBuffer59);
    java.util.Spliterator spliterator68 = ringBuffer59.spliterator();
    boolean b69 = ringBuffer59.isEmpty();
    ringBuffer46.enqueue((java.lang.Object)b69);
    java.util.Spliterator spliterator71 = ringBuffer46.spliterator();
    ringBuffer27.enqueue((java.lang.Object)spliterator71);
    boolean b73 = ringBuffer27.isEmpty();
    java.util.Iterator iterator74 = ringBuffer27.iterator();
    ringBuffer18.enqueue((java.lang.Object)ringBuffer27);
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)ringBuffer27);
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
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator74);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test139"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    boolean b8 = ringBuffer1.isEmpty();
    int i9 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Iterator iterator15 = ringBuffer11.iterator();
    boolean b16 = ringBuffer11.isEmpty();
    java.util.Iterator iterator17 = ringBuffer11.iterator();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer19.spliterator();
    java.util.Iterator iterator24 = ringBuffer19.iterator();
    int i25 = ringBuffer19.size();
    ringBuffer11.enqueue((java.lang.Object)ringBuffer19);
    java.util.Iterator iterator27 = ringBuffer19.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator27);
    java.util.Iterator iterator29 = ringBuffer1.iterator();
    java.util.Iterator iterator30 = ringBuffer1.iterator();
    java.util.Spliterator spliterator31 = ringBuffer1.spliterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test140"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    boolean b13 = ringBuffer1.isEmpty();
    java.util.Iterator iterator14 = ringBuffer1.iterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test141"); }


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
    java.util.Iterator iterator17 = ringBuffer9.iterator();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator22 = ringBuffer19.spliterator();
    java.util.Iterator iterator23 = ringBuffer19.iterator();
    boolean b24 = ringBuffer19.isEmpty();
    int i25 = ringBuffer19.size();
    java.util.Spliterator spliterator26 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer19.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer19.spliterator();
    boolean b29 = ringBuffer19.isEmpty();
    int i30 = ringBuffer19.size();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(1);
    boolean b33 = ringBuffer32.isEmpty();
    java.util.Spliterator spliterator34 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    boolean b37 = ringBuffer32.isEmpty();
    int i38 = ringBuffer32.size();
    java.util.Spliterator spliterator39 = ringBuffer32.spliterator();
    java.util.Spliterator spliterator40 = ringBuffer32.spliterator();
    java.util.Iterator iterator41 = ringBuffer32.iterator();
    ringBuffer19.enqueue((java.lang.Object)ringBuffer32);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer19);
    java.util.Spliterator spliterator44 = ringBuffer19.spliterator();
    exercise03.RingBuffer ringBuffer46 = new exercise03.RingBuffer(1);
    boolean b47 = ringBuffer46.isEmpty();
    java.util.Spliterator spliterator48 = ringBuffer46.spliterator();
    java.util.Spliterator spliterator49 = ringBuffer46.spliterator();
    java.util.Iterator iterator50 = ringBuffer46.iterator();
    boolean b51 = ringBuffer46.isEmpty();
    int i52 = ringBuffer46.size();
    java.util.Iterator iterator53 = ringBuffer46.iterator();
    exercise03.RingBuffer ringBuffer55 = new exercise03.RingBuffer(1);
    boolean b56 = ringBuffer55.isEmpty();
    java.util.Spliterator spliterator57 = ringBuffer55.spliterator();
    java.util.Spliterator spliterator58 = ringBuffer55.spliterator();
    java.util.Iterator iterator59 = ringBuffer55.iterator();
    boolean b60 = ringBuffer55.isEmpty();
    int i61 = ringBuffer55.size();
    java.util.Spliterator spliterator62 = ringBuffer55.spliterator();
    ringBuffer46.enqueue((java.lang.Object)ringBuffer55);
    java.lang.Object obj64 = ringBuffer46.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer19.enqueue((java.lang.Object)ringBuffer46);
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
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj64);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test142"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    java.lang.Object obj10 = null;
    ringBuffer1.enqueue(obj10);
    java.lang.Object obj12 = ringBuffer1.dequeue();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
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
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test143"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    boolean b18 = ringBuffer12.isEmpty();
    int i19 = ringBuffer12.size();
    boolean b20 = ringBuffer12.isEmpty();
    java.util.Iterator iterator21 = ringBuffer12.iterator();
    java.util.Iterator iterator22 = ringBuffer12.iterator();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Iterator iterator30 = ringBuffer26.iterator();
    boolean b31 = ringBuffer26.isEmpty();
    java.util.Iterator iterator32 = ringBuffer26.iterator();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(1);
    boolean b35 = ringBuffer34.isEmpty();
    java.util.Spliterator spliterator36 = ringBuffer34.spliterator();
    java.util.Spliterator spliterator37 = ringBuffer34.spliterator();
    java.util.Iterator iterator38 = ringBuffer34.iterator();
    boolean b39 = ringBuffer34.isEmpty();
    int i40 = ringBuffer34.size();
    java.util.Spliterator spliterator41 = ringBuffer34.spliterator();
    ringBuffer26.enqueue((java.lang.Object)spliterator41);
    ringBuffer24.enqueue((java.lang.Object)ringBuffer26);
    int i44 = ringBuffer26.size();
    java.util.Iterator iterator45 = ringBuffer26.iterator();
    ringBuffer12.enqueue((java.lang.Object)iterator45);
    boolean b47 = ringBuffer12.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b47);
    int i49 = ringBuffer1.size();
    
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
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
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
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test144"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    java.util.Iterator iterator12 = ringBuffer1.iterator();
    java.util.Spliterator spliterator13 = ringBuffer1.spliterator();
    java.lang.Object obj14 = ringBuffer1.dequeue();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(10);
    ringBuffer17.enqueue((java.lang.Object)'#');
    int i20 = ringBuffer17.size();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    int i22 = ringBuffer17.size();
    int i23 = ringBuffer17.size();
    java.util.Iterator iterator24 = ringBuffer17.iterator();
    boolean b25 = ringBuffer17.isEmpty();
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(10);
    ringBuffer27.enqueue((java.lang.Object)'#');
    int i30 = ringBuffer27.size();
    java.util.Iterator iterator31 = ringBuffer27.iterator();
    int i32 = ringBuffer27.size();
    int i33 = ringBuffer27.size();
    ringBuffer17.enqueue((java.lang.Object)i33);
    int i35 = ringBuffer17.size();
    int i36 = ringBuffer17.size();
    int i37 = ringBuffer17.size();
    ringBuffer1.enqueue((java.lang.Object)i37);
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator43 = ringBuffer40.spliterator();
    java.util.Iterator iterator44 = ringBuffer40.iterator();
    java.util.Iterator iterator45 = ringBuffer40.iterator();
    boolean b46 = ringBuffer40.isEmpty();
    exercise03.RingBuffer ringBuffer48 = new exercise03.RingBuffer(1);
    boolean b49 = ringBuffer48.isEmpty();
    java.util.Spliterator spliterator50 = ringBuffer48.spliterator();
    java.util.Spliterator spliterator51 = ringBuffer48.spliterator();
    ringBuffer40.enqueue((java.lang.Object)ringBuffer48);
    exercise03.RingBuffer ringBuffer54 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator55 = ringBuffer54.iterator();
    ringBuffer48.enqueue((java.lang.Object)ringBuffer54);
    exercise03.RingBuffer ringBuffer58 = new exercise03.RingBuffer(1);
    boolean b59 = ringBuffer58.isEmpty();
    java.util.Spliterator spliterator60 = ringBuffer58.spliterator();
    java.util.Spliterator spliterator61 = ringBuffer58.spliterator();
    java.util.Iterator iterator62 = ringBuffer58.iterator();
    boolean b63 = ringBuffer58.isEmpty();
    int i64 = ringBuffer58.size();
    java.util.Iterator iterator65 = ringBuffer58.iterator();
    exercise03.RingBuffer ringBuffer67 = new exercise03.RingBuffer(1);
    boolean b68 = ringBuffer67.isEmpty();
    java.util.Spliterator spliterator69 = ringBuffer67.spliterator();
    java.util.Spliterator spliterator70 = ringBuffer67.spliterator();
    java.util.Iterator iterator71 = ringBuffer67.iterator();
    boolean b72 = ringBuffer67.isEmpty();
    int i73 = ringBuffer67.size();
    java.util.Spliterator spliterator74 = ringBuffer67.spliterator();
    ringBuffer58.enqueue((java.lang.Object)ringBuffer67);
    java.util.Spliterator spliterator76 = ringBuffer67.spliterator();
    boolean b77 = ringBuffer67.isEmpty();
    ringBuffer54.enqueue((java.lang.Object)b77);
    java.util.Spliterator spliterator79 = ringBuffer54.spliterator();
    boolean b80 = ringBuffer54.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.enqueue((java.lang.Object)b80);
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
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a'+ "'", obj14.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test145"); }


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
    int i55 = ringBuffer15.size();
    exercise03.RingBuffer ringBuffer57 = new exercise03.RingBuffer(10);
    boolean b58 = ringBuffer57.isEmpty();
    java.util.Iterator iterator59 = ringBuffer57.iterator();
    java.util.Iterator iterator60 = ringBuffer57.iterator();
    ringBuffer15.enqueue((java.lang.Object)iterator60);
    boolean b62 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator63 = ringBuffer15.spliterator();
    
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
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test146"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.lang.Object obj5 = ringBuffer1.dequeue();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    boolean b9 = ringBuffer8.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer8.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer8.spliterator();
    java.util.Iterator iterator12 = ringBuffer8.iterator();
    java.util.Iterator iterator13 = ringBuffer8.iterator();
    boolean b14 = ringBuffer8.isEmpty();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(1);
    boolean b17 = ringBuffer16.isEmpty();
    java.util.Spliterator spliterator18 = ringBuffer16.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer16.spliterator();
    ringBuffer8.enqueue((java.lang.Object)ringBuffer16);
    int i21 = ringBuffer16.size();
    boolean b22 = ringBuffer16.isEmpty();
    boolean b23 = ringBuffer16.isEmpty();
    boolean b24 = ringBuffer16.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    java.util.Spliterator spliterator26 = ringBuffer16.spliterator();
    boolean b27 = ringBuffer16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a'+ "'", obj5.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test147"); }


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
    int i14 = ringBuffer1.size();
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
    java.util.Spliterator spliterator28 = ringBuffer24.spliterator();
    java.util.Iterator iterator29 = ringBuffer24.iterator();
    int i30 = ringBuffer24.size();
    ringBuffer16.enqueue((java.lang.Object)ringBuffer24);
    java.util.Iterator iterator32 = ringBuffer16.iterator();
    java.util.Spliterator spliterator33 = ringBuffer16.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator33);
    java.util.Spliterator spliterator35 = ringBuffer1.spliterator();
    java.lang.Object obj36 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
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
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test148"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator10);
    java.util.Spliterator spliterator12 = ringBuffer1.spliterator();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    boolean b16 = ringBuffer1.isEmpty();
    boolean b17 = ringBuffer1.isEmpty();
    int i18 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test149"); }


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
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    boolean b25 = ringBuffer20.isEmpty();
    java.util.Iterator iterator26 = ringBuffer20.iterator();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Iterator iterator32 = ringBuffer28.iterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    boolean b34 = ringBuffer28.isEmpty();
    ringBuffer20.enqueue((java.lang.Object)ringBuffer28);
    boolean b36 = ringBuffer20.isEmpty();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer20);
    java.lang.Object obj38 = ringBuffer20.dequeue();
    java.util.Iterator iterator39 = ringBuffer20.iterator();
    boolean b40 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator41 = ringBuffer20.spliterator();
    exercise03.RingBuffer ringBuffer43 = new exercise03.RingBuffer(1);
    boolean b44 = ringBuffer43.isEmpty();
    java.util.Spliterator spliterator45 = ringBuffer43.spliterator();
    java.util.Spliterator spliterator46 = ringBuffer43.spliterator();
    java.util.Iterator iterator47 = ringBuffer43.iterator();
    boolean b48 = ringBuffer43.isEmpty();
    java.util.Spliterator spliterator49 = ringBuffer43.spliterator();
    exercise03.RingBuffer ringBuffer51 = new exercise03.RingBuffer(1);
    boolean b52 = ringBuffer51.isEmpty();
    java.util.Spliterator spliterator53 = ringBuffer51.spliterator();
    java.util.Spliterator spliterator54 = ringBuffer51.spliterator();
    java.util.Iterator iterator55 = ringBuffer51.iterator();
    boolean b56 = ringBuffer51.isEmpty();
    int i57 = ringBuffer51.size();
    java.util.Iterator iterator58 = ringBuffer51.iterator();
    exercise03.RingBuffer ringBuffer60 = new exercise03.RingBuffer(1);
    boolean b61 = ringBuffer60.isEmpty();
    java.util.Spliterator spliterator62 = ringBuffer60.spliterator();
    java.util.Spliterator spliterator63 = ringBuffer60.spliterator();
    java.util.Iterator iterator64 = ringBuffer60.iterator();
    boolean b65 = ringBuffer60.isEmpty();
    int i66 = ringBuffer60.size();
    java.util.Spliterator spliterator67 = ringBuffer60.spliterator();
    ringBuffer51.enqueue((java.lang.Object)ringBuffer60);
    java.util.Iterator iterator69 = ringBuffer60.iterator();
    boolean b70 = ringBuffer60.isEmpty();
    boolean b71 = ringBuffer60.isEmpty();
    exercise03.RingBuffer ringBuffer73 = new exercise03.RingBuffer(1);
    boolean b74 = ringBuffer73.isEmpty();
    java.util.Spliterator spliterator75 = ringBuffer73.spliterator();
    java.util.Spliterator spliterator76 = ringBuffer73.spliterator();
    java.util.Iterator iterator77 = ringBuffer73.iterator();
    boolean b78 = ringBuffer73.isEmpty();
    exercise03.RingBuffer ringBuffer80 = new exercise03.RingBuffer(1);
    ringBuffer73.enqueue((java.lang.Object)ringBuffer80);
    exercise03.RingBuffer ringBuffer83 = new exercise03.RingBuffer(1);
    boolean b84 = ringBuffer83.isEmpty();
    java.util.Spliterator spliterator85 = ringBuffer83.spliterator();
    java.util.Spliterator spliterator86 = ringBuffer83.spliterator();
    java.util.Spliterator spliterator87 = ringBuffer83.spliterator();
    java.util.Iterator iterator88 = ringBuffer83.iterator();
    ringBuffer80.enqueue((java.lang.Object)ringBuffer83);
    ringBuffer60.enqueue((java.lang.Object)ringBuffer80);
    java.util.Spliterator spliterator91 = ringBuffer60.spliterator();
    ringBuffer43.enqueue((java.lang.Object)ringBuffer60);
    boolean b93 = ringBuffer60.isEmpty();
    ringBuffer20.enqueue((java.lang.Object)b93);
    java.lang.Object obj95 = ringBuffer20.dequeue();
    java.util.Iterator iterator96 = ringBuffer20.iterator();
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj95 + "' != '" + false+ "'", obj95.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator96);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test150"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.lang.Object obj8 = null;
    ringBuffer1.enqueue(obj8);
    int i10 = ringBuffer1.size();
    boolean b11 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test151"); }


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
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(1);
    boolean b29 = ringBuffer28.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator31 = ringBuffer28.spliterator();
    java.util.Spliterator spliterator32 = ringBuffer28.spliterator();
    java.util.Iterator iterator33 = ringBuffer28.iterator();
    int i34 = ringBuffer28.size();
    int i35 = ringBuffer28.size();
    int i36 = ringBuffer28.size();
    int i37 = ringBuffer28.size();
    java.util.Iterator iterator38 = ringBuffer28.iterator();
    int i39 = ringBuffer28.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer28);
    int i41 = ringBuffer1.size();
    int i42 = ringBuffer1.size();
    java.lang.Object obj43 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test152"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    boolean b7 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    boolean b15 = ringBuffer10.isEmpty();
    java.util.Iterator iterator16 = ringBuffer10.iterator();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    java.util.Iterator iterator23 = ringBuffer18.iterator();
    boolean b24 = ringBuffer18.isEmpty();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    java.util.Spliterator spliterator26 = ringBuffer18.spliterator();
    int i27 = ringBuffer18.size();
    java.util.Iterator iterator28 = ringBuffer18.iterator();
    int i29 = ringBuffer18.size();
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    boolean b32 = ringBuffer31.isEmpty();
    java.util.Spliterator spliterator33 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    java.util.Iterator iterator35 = ringBuffer31.iterator();
    boolean b36 = ringBuffer31.isEmpty();
    int i37 = ringBuffer31.size();
    java.util.Spliterator spliterator38 = ringBuffer31.spliterator();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator43 = ringBuffer40.spliterator();
    java.util.Spliterator spliterator44 = ringBuffer40.spliterator();
    java.util.Iterator iterator45 = ringBuffer40.iterator();
    ringBuffer31.enqueue((java.lang.Object)iterator45);
    boolean b47 = ringBuffer31.isEmpty();
    boolean b48 = ringBuffer31.isEmpty();
    java.lang.Object obj49 = ringBuffer31.dequeue();
    exercise03.RingBuffer ringBuffer51 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator52 = ringBuffer51.iterator();
    java.util.Iterator iterator53 = ringBuffer51.iterator();
    int i54 = ringBuffer51.size();
    ringBuffer31.enqueue((java.lang.Object)ringBuffer51);
    boolean b56 = ringBuffer31.isEmpty();
    java.lang.Object obj57 = ringBuffer31.dequeue();
    ringBuffer18.enqueue((java.lang.Object)ringBuffer31);
    java.util.Iterator iterator59 = ringBuffer31.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator59);
    int i61 = ringBuffer1.size();
    int i62 = ringBuffer1.size();
    boolean b63 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test153"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(1);
    ringBuffer6.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator9 = ringBuffer6.spliterator();
    int i10 = ringBuffer6.size();
    java.util.Iterator iterator11 = ringBuffer6.iterator();
    int i12 = ringBuffer6.size();
    ringBuffer1.enqueue((java.lang.Object)i12);
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    int i16 = ringBuffer15.size();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    java.util.Iterator iterator22 = ringBuffer18.iterator();
    boolean b23 = ringBuffer18.isEmpty();
    java.util.Iterator iterator24 = ringBuffer18.iterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Iterator iterator30 = ringBuffer26.iterator();
    java.util.Iterator iterator31 = ringBuffer26.iterator();
    boolean b32 = ringBuffer26.isEmpty();
    ringBuffer18.enqueue((java.lang.Object)ringBuffer26);
    boolean b34 = ringBuffer18.isEmpty();
    boolean b35 = ringBuffer18.isEmpty();
    ringBuffer15.enqueue((java.lang.Object)ringBuffer18);
    java.util.Iterator iterator37 = ringBuffer18.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator37);
    java.util.Iterator iterator39 = ringBuffer1.iterator();
    boolean b40 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test154"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
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
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test155"); }


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
    java.util.Iterator iterator18 = ringBuffer9.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(10);
    ringBuffer20.enqueue((java.lang.Object)'#');
    int i23 = ringBuffer20.size();
    boolean b24 = ringBuffer20.isEmpty();
    int i25 = ringBuffer20.size();
    boolean b26 = ringBuffer20.isEmpty();
    int i27 = ringBuffer20.size();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer20);
    boolean b29 = ringBuffer9.isEmpty();
    java.util.Spliterator spliterator30 = ringBuffer9.spliterator();
    
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
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator30);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test156"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    int i8 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    boolean b15 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    ringBuffer10.enqueue((java.lang.Object)ringBuffer17);
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer20.spliterator();
    java.util.Iterator iterator25 = ringBuffer20.iterator();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer20);
    java.util.Spliterator spliterator27 = ringBuffer17.spliterator();
    boolean b28 = ringBuffer17.isEmpty();
    java.lang.Object obj29 = ringBuffer17.dequeue();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer17);
    int i31 = ringBuffer1.size();
    int i32 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test157"); }


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
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    int i12 = ringBuffer1.size();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    boolean b14 = ringBuffer1.isEmpty();
    boolean b15 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test158"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    boolean b19 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(10);
    ringBuffer21.enqueue((java.lang.Object)'#');
    int i24 = ringBuffer21.size();
    java.util.Iterator iterator25 = ringBuffer21.iterator();
    java.util.Spliterator spliterator26 = ringBuffer21.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer21);
    java.lang.Object obj28 = ringBuffer21.dequeue();
    boolean b29 = ringBuffer21.isEmpty();
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    ringBuffer31.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    int i35 = ringBuffer31.size();
    java.util.Spliterator spliterator36 = ringBuffer31.spliterator();
    int i37 = ringBuffer31.size();
    int i38 = ringBuffer31.size();
    java.util.Iterator iterator39 = ringBuffer31.iterator();
    java.util.Iterator iterator40 = ringBuffer31.iterator();
    ringBuffer21.enqueue((java.lang.Object)ringBuffer31);
    java.util.Spliterator spliterator42 = ringBuffer21.spliterator();
    java.lang.Object obj43 = ringBuffer21.dequeue();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj44 = ringBuffer21.dequeue();
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + '#'+ "'", obj28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test159"); }


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
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    
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
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test160"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    boolean b6 = ringBuffer1.isEmpty();
    boolean b7 = ringBuffer1.isEmpty();
    boolean b8 = ringBuffer1.isEmpty();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.lang.Object obj10 = ringBuffer1.dequeue();
    int i11 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a'+ "'", obj10.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test161"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)false);
    java.lang.Object obj4 = ringBuffer1.dequeue();
    boolean b5 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.function.Consumer consumer8 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test162"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    int i11 = ringBuffer7.size();
    boolean b12 = ringBuffer7.isEmpty();
    exercise03.RingBuffer ringBuffer14 = new exercise03.RingBuffer(1);
    ringBuffer14.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator17 = ringBuffer14.spliterator();
    int i18 = ringBuffer14.size();
    java.util.Spliterator spliterator19 = ringBuffer14.spliterator();
    java.util.Iterator iterator20 = ringBuffer14.iterator();
    ringBuffer7.enqueue((java.lang.Object)iterator20);
    boolean b22 = ringBuffer7.isEmpty();
    boolean b23 = ringBuffer7.isEmpty();
    boolean b24 = ringBuffer7.isEmpty();
    int i25 = ringBuffer7.size();
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test163"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.lang.Object obj4 = ringBuffer1.dequeue();
    ringBuffer1.enqueue((java.lang.Object)(short)1);
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a'+ "'", obj4.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test164"); }


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
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer16 = new exercise03.RingBuffer(10);
    ringBuffer16.enqueue((java.lang.Object)'#');
    int i19 = ringBuffer16.size();
    boolean b20 = ringBuffer16.isEmpty();
    int i21 = ringBuffer16.size();
    boolean b22 = ringBuffer16.isEmpty();
    boolean b23 = ringBuffer16.isEmpty();
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator26 = ringBuffer25.iterator();
    java.util.Iterator iterator27 = ringBuffer25.iterator();
    java.lang.Object obj28 = null;
    ringBuffer25.enqueue(obj28);
    ringBuffer16.enqueue(obj28);
    java.lang.Object obj31 = ringBuffer16.dequeue();
    exercise03.RingBuffer ringBuffer33 = new exercise03.RingBuffer(1);
    boolean b34 = ringBuffer33.isEmpty();
    java.util.Spliterator spliterator35 = ringBuffer33.spliterator();
    java.util.Spliterator spliterator36 = ringBuffer33.spliterator();
    java.util.Iterator iterator37 = ringBuffer33.iterator();
    java.util.Iterator iterator38 = ringBuffer33.iterator();
    boolean b39 = ringBuffer33.isEmpty();
    exercise03.RingBuffer ringBuffer41 = new exercise03.RingBuffer(1);
    boolean b42 = ringBuffer41.isEmpty();
    java.util.Spliterator spliterator43 = ringBuffer41.spliterator();
    java.util.Spliterator spliterator44 = ringBuffer41.spliterator();
    ringBuffer33.enqueue((java.lang.Object)ringBuffer41);
    java.util.Iterator iterator46 = ringBuffer33.iterator();
    java.util.Iterator iterator47 = ringBuffer33.iterator();
    java.lang.Object obj48 = ringBuffer33.dequeue();
    ringBuffer16.enqueue((java.lang.Object)ringBuffer33);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer16);
    java.util.Spliterator spliterator51 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + '#'+ "'", obj31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator51);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test165"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator24 = ringBuffer20.spliterator();
    java.util.Iterator iterator25 = ringBuffer20.iterator();
    int i26 = ringBuffer20.size();
    boolean b27 = ringBuffer20.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b27);
    java.util.Iterator iterator29 = ringBuffer1.iterator();
    java.lang.Object obj30 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(10);
    ringBuffer32.enqueue((java.lang.Object)'#');
    java.util.Spliterator spliterator35 = ringBuffer32.spliterator();
    ringBuffer32.enqueue((java.lang.Object)(short)100);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer32);
    java.util.Spliterator spliterator39 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true+ "'", obj30.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test166"); }


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
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    java.util.Iterator iterator17 = ringBuffer12.iterator();
    java.util.Spliterator spliterator18 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator19 = ringBuffer12.spliterator();
    int i20 = ringBuffer12.size();
    java.util.Spliterator spliterator21 = ringBuffer12.spliterator();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(10);
    ringBuffer23.enqueue((java.lang.Object)false);
    ringBuffer23.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator spliterator28 = ringBuffer23.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer23);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer23);
    int i31 = ringBuffer23.size();
    boolean b32 = ringBuffer23.isEmpty();
    exercise03.RingBuffer ringBuffer34 = new exercise03.RingBuffer(10);
    ringBuffer34.enqueue((java.lang.Object)'#');
    int i37 = ringBuffer34.size();
    java.util.Iterator iterator38 = ringBuffer34.iterator();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(1);
    boolean b41 = ringBuffer40.isEmpty();
    java.util.Spliterator spliterator42 = ringBuffer40.spliterator();
    ringBuffer34.enqueue((java.lang.Object)ringBuffer40);
    int i44 = ringBuffer40.size();
    boolean b45 = ringBuffer40.isEmpty();
    int i46 = ringBuffer40.size();
    java.util.Iterator iterator47 = ringBuffer40.iterator();
    ringBuffer23.enqueue((java.lang.Object)iterator47);
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    java.util.Iterator iterator55 = ringBuffer50.iterator();
    java.util.Spliterator spliterator56 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator57 = ringBuffer50.spliterator();
    int i58 = ringBuffer50.size();
    java.util.Spliterator spliterator59 = ringBuffer50.spliterator();
    exercise03.RingBuffer ringBuffer61 = new exercise03.RingBuffer(1);
    boolean b62 = ringBuffer61.isEmpty();
    java.util.Spliterator spliterator63 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator64 = ringBuffer61.spliterator();
    java.util.Spliterator spliterator65 = ringBuffer61.spliterator();
    java.util.Iterator iterator66 = ringBuffer61.iterator();
    int i67 = ringBuffer61.size();
    int i68 = ringBuffer61.size();
    ringBuffer50.enqueue((java.lang.Object)ringBuffer61);
    java.util.Iterator iterator70 = ringBuffer50.iterator();
    java.lang.Object obj71 = ringBuffer50.dequeue();
    ringBuffer23.enqueue((java.lang.Object)ringBuffer50);
    int i73 = ringBuffer50.size();
    java.util.function.Consumer consumer74 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer50.forEach(consumer74);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
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
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
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
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test167"); }


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
    int i13 = ringBuffer1.size();
    boolean b14 = ringBuffer1.isEmpty();
    int i15 = ringBuffer1.size();
    java.lang.Object obj16 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test168"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer10 = new exercise03.RingBuffer(1);
    boolean b11 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator12 = ringBuffer10.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer10.spliterator();
    java.util.Iterator iterator14 = ringBuffer10.iterator();
    java.util.Iterator iterator15 = ringBuffer10.iterator();
    boolean b16 = ringBuffer10.isEmpty();
    exercise03.RingBuffer ringBuffer18 = new exercise03.RingBuffer(1);
    boolean b19 = ringBuffer18.isEmpty();
    java.util.Spliterator spliterator20 = ringBuffer18.spliterator();
    java.util.Spliterator spliterator21 = ringBuffer18.spliterator();
    ringBuffer10.enqueue((java.lang.Object)ringBuffer18);
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator25 = ringBuffer24.iterator();
    ringBuffer18.enqueue((java.lang.Object)ringBuffer24);
    java.util.Iterator iterator27 = ringBuffer24.iterator();
    boolean b28 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator29 = ringBuffer24.spliterator();
    boolean b30 = ringBuffer24.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer24);
    exercise03.RingBuffer ringBuffer33 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer35 = new exercise03.RingBuffer(1);
    boolean b36 = ringBuffer35.isEmpty();
    java.util.Spliterator spliterator37 = ringBuffer35.spliterator();
    java.util.Spliterator spliterator38 = ringBuffer35.spliterator();
    java.util.Iterator iterator39 = ringBuffer35.iterator();
    boolean b40 = ringBuffer35.isEmpty();
    java.util.Iterator iterator41 = ringBuffer35.iterator();
    exercise03.RingBuffer ringBuffer43 = new exercise03.RingBuffer(1);
    boolean b44 = ringBuffer43.isEmpty();
    java.util.Spliterator spliterator45 = ringBuffer43.spliterator();
    java.util.Spliterator spliterator46 = ringBuffer43.spliterator();
    java.util.Iterator iterator47 = ringBuffer43.iterator();
    boolean b48 = ringBuffer43.isEmpty();
    int i49 = ringBuffer43.size();
    java.util.Spliterator spliterator50 = ringBuffer43.spliterator();
    ringBuffer35.enqueue((java.lang.Object)spliterator50);
    ringBuffer33.enqueue((java.lang.Object)ringBuffer35);
    exercise03.RingBuffer ringBuffer54 = new exercise03.RingBuffer(1);
    boolean b55 = ringBuffer54.isEmpty();
    java.util.Spliterator spliterator56 = ringBuffer54.spliterator();
    java.util.Spliterator spliterator57 = ringBuffer54.spliterator();
    java.util.Iterator iterator58 = ringBuffer54.iterator();
    java.util.Iterator iterator59 = ringBuffer54.iterator();
    java.util.Spliterator spliterator60 = ringBuffer54.spliterator();
    java.util.Iterator iterator61 = ringBuffer54.iterator();
    boolean b62 = ringBuffer54.isEmpty();
    exercise03.RingBuffer ringBuffer64 = new exercise03.RingBuffer(1);
    ringBuffer64.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator67 = ringBuffer64.spliterator();
    int i68 = ringBuffer64.size();
    java.util.Spliterator spliterator69 = ringBuffer64.spliterator();
    java.util.Iterator iterator70 = ringBuffer64.iterator();
    java.util.Spliterator spliterator71 = ringBuffer64.spliterator();
    java.util.Iterator iterator72 = ringBuffer64.iterator();
    int i73 = ringBuffer64.size();
    ringBuffer54.enqueue((java.lang.Object)ringBuffer64);
    java.lang.Object obj75 = ringBuffer54.dequeue();
    java.util.Iterator iterator76 = ringBuffer54.iterator();
    ringBuffer33.enqueue((java.lang.Object)iterator76);
    int i78 = ringBuffer33.size();
    ringBuffer24.enqueue((java.lang.Object)ringBuffer33);
    java.util.Spliterator spliterator80 = ringBuffer24.spliterator();
    java.util.function.Consumer consumer81 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer24.forEach(consumer81);
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
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#'+ "'", obj8.equals('#'));
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator80);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test169"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator4 = ringBuffer1.iterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    int i6 = ringBuffer1.size();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    boolean b9 = ringBuffer1.isEmpty();
    int i10 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test170"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    java.util.Iterator iterator10 = ringBuffer1.iterator();
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test171"); }


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
    java.util.Iterator iterator19 = ringBuffer10.iterator();
    boolean b20 = ringBuffer10.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer10.spliterator();
    
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
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test172"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    int i6 = ringBuffer1.size();
    int i7 = ringBuffer1.size();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    int i9 = ringBuffer1.size();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test173"); }


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
    java.util.Iterator iterator19 = ringBuffer10.iterator();
    boolean b20 = ringBuffer10.isEmpty();
    boolean b21 = ringBuffer10.isEmpty();
    int i22 = ringBuffer10.size();
    boolean b23 = ringBuffer10.isEmpty();
    java.util.Iterator iterator24 = ringBuffer10.iterator();
    
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
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test174"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    boolean b11 = ringBuffer1.isEmpty();
    boolean b12 = ringBuffer1.isEmpty();
    java.lang.Object obj13 = ringBuffer1.dequeue();
    
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
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test175"); }


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
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(1);
    ringBuffer21.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator24 = ringBuffer21.iterator();
    java.lang.Object obj25 = ringBuffer21.dequeue();
    java.util.Iterator iterator26 = ringBuffer21.iterator();
    exercise03.RingBuffer ringBuffer28 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(1);
    boolean b31 = ringBuffer30.isEmpty();
    java.util.Spliterator spliterator32 = ringBuffer30.spliterator();
    java.util.Spliterator spliterator33 = ringBuffer30.spliterator();
    java.util.Iterator iterator34 = ringBuffer30.iterator();
    boolean b35 = ringBuffer30.isEmpty();
    java.util.Iterator iterator36 = ringBuffer30.iterator();
    ringBuffer28.enqueue((java.lang.Object)iterator36);
    java.util.Spliterator spliterator38 = ringBuffer28.spliterator();
    exercise03.RingBuffer ringBuffer40 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer42 = new exercise03.RingBuffer(1);
    boolean b43 = ringBuffer42.isEmpty();
    java.util.Spliterator spliterator44 = ringBuffer42.spliterator();
    java.util.Spliterator spliterator45 = ringBuffer42.spliterator();
    java.util.Iterator iterator46 = ringBuffer42.iterator();
    boolean b47 = ringBuffer42.isEmpty();
    java.util.Iterator iterator48 = ringBuffer42.iterator();
    exercise03.RingBuffer ringBuffer50 = new exercise03.RingBuffer(1);
    boolean b51 = ringBuffer50.isEmpty();
    java.util.Spliterator spliterator52 = ringBuffer50.spliterator();
    java.util.Spliterator spliterator53 = ringBuffer50.spliterator();
    java.util.Iterator iterator54 = ringBuffer50.iterator();
    boolean b55 = ringBuffer50.isEmpty();
    int i56 = ringBuffer50.size();
    java.util.Spliterator spliterator57 = ringBuffer50.spliterator();
    ringBuffer42.enqueue((java.lang.Object)spliterator57);
    ringBuffer40.enqueue((java.lang.Object)ringBuffer42);
    int i60 = ringBuffer42.size();
    java.util.Iterator iterator61 = ringBuffer42.iterator();
    java.lang.Object obj62 = ringBuffer42.dequeue();
    ringBuffer28.enqueue((java.lang.Object)ringBuffer42);
    ringBuffer21.enqueue((java.lang.Object)ringBuffer28);
    ringBuffer9.enqueue((java.lang.Object)ringBuffer21);
    boolean b66 = ringBuffer21.isEmpty();
    
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
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a'+ "'", obj25.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test176"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    int i9 = ringBuffer1.size();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    exercise03.RingBuffer ringBuffer12 = new exercise03.RingBuffer(1);
    boolean b13 = ringBuffer12.isEmpty();
    java.util.Spliterator spliterator14 = ringBuffer12.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer12.spliterator();
    java.util.Iterator iterator16 = ringBuffer12.iterator();
    boolean b17 = ringBuffer12.isEmpty();
    java.util.Iterator iterator18 = ringBuffer12.iterator();
    exercise03.RingBuffer ringBuffer20 = new exercise03.RingBuffer(1);
    boolean b21 = ringBuffer20.isEmpty();
    java.util.Spliterator spliterator22 = ringBuffer20.spliterator();
    java.util.Spliterator spliterator23 = ringBuffer20.spliterator();
    java.util.Iterator iterator24 = ringBuffer20.iterator();
    java.util.Iterator iterator25 = ringBuffer20.iterator();
    boolean b26 = ringBuffer20.isEmpty();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer20);
    boolean b28 = ringBuffer12.isEmpty();
    java.lang.Object obj29 = ringBuffer12.dequeue();
    boolean b30 = ringBuffer12.isEmpty();
    exercise03.RingBuffer ringBuffer32 = new exercise03.RingBuffer(10);
    ringBuffer32.enqueue((java.lang.Object)'#');
    int i35 = ringBuffer32.size();
    java.util.Iterator iterator36 = ringBuffer32.iterator();
    java.util.Spliterator spliterator37 = ringBuffer32.spliterator();
    ringBuffer12.enqueue((java.lang.Object)ringBuffer32);
    java.lang.Object obj39 = ringBuffer32.dequeue();
    boolean b40 = ringBuffer32.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)b40);
    
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
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + '#'+ "'", obj39.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test177"); }


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
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(10);
    java.util.Iterator iterator22 = ringBuffer21.iterator();
    java.util.Iterator iterator23 = ringBuffer21.iterator();
    int i24 = ringBuffer21.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer21);
    exercise03.RingBuffer ringBuffer27 = new exercise03.RingBuffer(1);
    ringBuffer27.enqueue((java.lang.Object)'a');
    java.util.Iterator iterator30 = ringBuffer27.iterator();
    java.lang.Object obj31 = ringBuffer27.dequeue();
    boolean b32 = ringBuffer27.isEmpty();
    int i33 = ringBuffer27.size();
    boolean b34 = ringBuffer27.isEmpty();
    exercise03.RingBuffer ringBuffer36 = new exercise03.RingBuffer(1);
    boolean b37 = ringBuffer36.isEmpty();
    java.util.Spliterator spliterator38 = ringBuffer36.spliterator();
    java.util.Spliterator spliterator39 = ringBuffer36.spliterator();
    java.util.Iterator iterator40 = ringBuffer36.iterator();
    java.util.Iterator iterator41 = ringBuffer36.iterator();
    boolean b42 = ringBuffer36.isEmpty();
    exercise03.RingBuffer ringBuffer44 = new exercise03.RingBuffer(1);
    boolean b45 = ringBuffer44.isEmpty();
    java.util.Spliterator spliterator46 = ringBuffer44.spliterator();
    java.util.Spliterator spliterator47 = ringBuffer44.spliterator();
    ringBuffer36.enqueue((java.lang.Object)ringBuffer44);
    boolean b49 = ringBuffer36.isEmpty();
    java.util.Iterator iterator50 = ringBuffer36.iterator();
    ringBuffer27.enqueue((java.lang.Object)iterator50);
    ringBuffer21.enqueue((java.lang.Object)iterator50);
    exercise03.RingBuffer ringBuffer54 = new exercise03.RingBuffer(10);
    ringBuffer54.enqueue((java.lang.Object)'#');
    int i57 = ringBuffer54.size();
    java.util.Iterator iterator58 = ringBuffer54.iterator();
    java.util.Spliterator spliterator59 = ringBuffer54.spliterator();
    int i60 = ringBuffer54.size();
    exercise03.RingBuffer ringBuffer62 = new exercise03.RingBuffer(1);
    ringBuffer62.enqueue((java.lang.Object)'a');
    java.lang.Object obj65 = ringBuffer62.dequeue();
    java.util.Spliterator spliterator66 = ringBuffer62.spliterator();
    ringBuffer54.enqueue((java.lang.Object)ringBuffer62);
    java.util.Iterator iterator68 = ringBuffer54.iterator();
    ringBuffer21.enqueue((java.lang.Object)ringBuffer54);
    boolean b70 = ringBuffer21.isEmpty();
    java.util.Iterator iterator71 = ringBuffer21.iterator();
    boolean b72 = ringBuffer21.isEmpty();
    
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
    org.junit.Assert.assertNotNull(iterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a'+ "'", obj31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 'a'+ "'", obj65.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test178"); }


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
    boolean b18 = ringBuffer9.isEmpty();
    java.lang.Object obj19 = ringBuffer9.dequeue();
    java.util.Iterator iterator20 = ringBuffer9.iterator();
    boolean b21 = ringBuffer9.isEmpty();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(1);
    boolean b24 = ringBuffer23.isEmpty();
    java.util.Spliterator spliterator25 = ringBuffer23.spliterator();
    java.util.Spliterator spliterator26 = ringBuffer23.spliterator();
    java.util.Iterator iterator27 = ringBuffer23.iterator();
    java.util.Iterator iterator28 = ringBuffer23.iterator();
    boolean b29 = ringBuffer23.isEmpty();
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    boolean b32 = ringBuffer31.isEmpty();
    java.util.Spliterator spliterator33 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    ringBuffer23.enqueue((java.lang.Object)ringBuffer31);
    int i36 = ringBuffer31.size();
    java.lang.Object obj37 = null;
    ringBuffer31.enqueue(obj37);
    int i39 = ringBuffer31.size();
    java.util.Spliterator spliterator40 = ringBuffer31.spliterator();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer31);
    java.lang.Object obj42 = ringBuffer31.dequeue();
    boolean b43 = ringBuffer31.isEmpty();
    int i44 = ringBuffer31.size();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test179"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    int i5 = ringBuffer1.size();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    int i10 = ringBuffer1.size();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    boolean b12 = ringBuffer1.isEmpty();
    java.util.Iterator iterator13 = ringBuffer1.iterator();
    java.util.Spliterator spliterator14 = ringBuffer1.spliterator();
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    boolean b16 = ringBuffer1.isEmpty();
    java.lang.Object obj17 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer19 = new exercise03.RingBuffer(1);
    boolean b20 = ringBuffer19.isEmpty();
    java.util.Spliterator spliterator21 = ringBuffer19.spliterator();
    java.util.Iterator iterator22 = ringBuffer19.iterator();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    boolean b29 = ringBuffer24.isEmpty();
    int i30 = ringBuffer24.size();
    java.util.Spliterator spliterator31 = ringBuffer24.spliterator();
    ringBuffer19.enqueue((java.lang.Object)spliterator31);
    int i33 = ringBuffer19.size();
    int i34 = ringBuffer19.size();
    java.util.Iterator iterator35 = ringBuffer19.iterator();
    boolean b36 = ringBuffer19.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer19);
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 'a'+ "'", obj17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator21);
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test180"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    boolean b9 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
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
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test181"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    ringBuffer1.enqueue((java.lang.Object)(short)0);
    int i5 = ringBuffer1.size();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Iterator iterator7 = ringBuffer1.iterator();
    java.lang.Object obj8 = ringBuffer1.dequeue();
    int i9 = ringBuffer1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)0+ "'", obj8.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test182"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Spliterator spliterator6 = ringBuffer1.spliterator();
    int i7 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer9 = new exercise03.RingBuffer(1);
    ringBuffer9.enqueue((java.lang.Object)'a');
    java.lang.Object obj12 = ringBuffer9.dequeue();
    java.util.Spliterator spliterator13 = ringBuffer9.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer9);
    java.util.Iterator iterator15 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer17 = new exercise03.RingBuffer(1);
    boolean b18 = ringBuffer17.isEmpty();
    java.util.Spliterator spliterator19 = ringBuffer17.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer17.spliterator();
    java.util.Iterator iterator21 = ringBuffer17.iterator();
    boolean b22 = ringBuffer17.isEmpty();
    int i23 = ringBuffer17.size();
    java.util.Iterator iterator24 = ringBuffer17.iterator();
    exercise03.RingBuffer ringBuffer26 = new exercise03.RingBuffer(1);
    boolean b27 = ringBuffer26.isEmpty();
    java.util.Spliterator spliterator28 = ringBuffer26.spliterator();
    java.util.Spliterator spliterator29 = ringBuffer26.spliterator();
    java.util.Iterator iterator30 = ringBuffer26.iterator();
    boolean b31 = ringBuffer26.isEmpty();
    int i32 = ringBuffer26.size();
    java.util.Spliterator spliterator33 = ringBuffer26.spliterator();
    ringBuffer17.enqueue((java.lang.Object)ringBuffer26);
    java.lang.Object obj35 = ringBuffer17.dequeue();
    java.util.Iterator iterator36 = ringBuffer17.iterator();
    ringBuffer1.enqueue((java.lang.Object)iterator36);
    java.util.Spliterator spliterator38 = ringBuffer1.spliterator();
    int i39 = ringBuffer1.size();
    java.util.Iterator iterator40 = ringBuffer1.iterator();
    java.util.Spliterator spliterator41 = ringBuffer1.spliterator();
    java.util.Iterator iterator42 = ringBuffer1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator42);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test183"); }


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
    exercise03.RingBuffer ringBuffer21 = new exercise03.RingBuffer(10);
    ringBuffer21.enqueue((java.lang.Object)false);
    exercise03.RingBuffer ringBuffer25 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator26 = ringBuffer25.iterator();
    java.util.Iterator iterator27 = ringBuffer25.iterator();
    ringBuffer21.enqueue((java.lang.Object)iterator27);
    exercise03.RingBuffer ringBuffer30 = new exercise03.RingBuffer(10);
    ringBuffer30.enqueue((java.lang.Object)'#');
    int i33 = ringBuffer30.size();
    java.util.Iterator iterator34 = ringBuffer30.iterator();
    int i35 = ringBuffer30.size();
    exercise03.RingBuffer ringBuffer37 = new exercise03.RingBuffer(1);
    ringBuffer37.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator40 = ringBuffer37.spliterator();
    java.lang.Object obj41 = ringBuffer37.dequeue();
    java.util.Spliterator spliterator42 = ringBuffer37.spliterator();
    boolean b43 = ringBuffer37.isEmpty();
    int i44 = ringBuffer37.size();
    ringBuffer30.enqueue((java.lang.Object)i44);
    ringBuffer21.enqueue((java.lang.Object)i44);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer21);
    boolean b48 = ringBuffer1.isEmpty();
    boolean b49 = ringBuffer1.isEmpty();
    
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
    org.junit.Assert.assertNotNull(iterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 'a'+ "'", obj41.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test184"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    boolean b7 = ringBuffer1.isEmpty();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    int i10 = ringBuffer1.size();
    
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
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test185"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    int i4 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer6 = new exercise03.RingBuffer(1);
    ringBuffer6.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator9 = ringBuffer6.spliterator();
    java.lang.Object obj10 = ringBuffer6.dequeue();
    java.util.Spliterator spliterator11 = ringBuffer6.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer6);
    boolean b13 = ringBuffer1.isEmpty();
    boolean b14 = ringBuffer1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a'+ "'", obj10.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test186"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    exercise03.RingBuffer ringBuffer11 = new exercise03.RingBuffer(1);
    boolean b12 = ringBuffer11.isEmpty();
    java.util.Spliterator spliterator13 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator14 = ringBuffer11.spliterator();
    java.util.Spliterator spliterator15 = ringBuffer11.spliterator();
    java.util.Iterator iterator16 = ringBuffer11.iterator();
    ringBuffer8.enqueue((java.lang.Object)ringBuffer11);
    java.util.Iterator iterator18 = ringBuffer8.iterator();
    java.util.Spliterator spliterator19 = ringBuffer8.spliterator();
    java.lang.Object obj20 = ringBuffer8.dequeue();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Iterator iterator28 = ringBuffer24.iterator();
    boolean b29 = ringBuffer24.isEmpty();
    java.util.Iterator iterator30 = ringBuffer24.iterator();
    ringBuffer22.enqueue((java.lang.Object)iterator30);
    int i32 = ringBuffer22.size();
    boolean b33 = ringBuffer22.isEmpty();
    ringBuffer8.enqueue((java.lang.Object)b33);
    java.util.function.Consumer consumer35 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer8.forEach(consumer35);
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test187"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    int i8 = ringBuffer1.size();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator10 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer1.spliterator();
    boolean b12 = ringBuffer1.isEmpty();
    int i13 = ringBuffer1.size();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(10);
    ringBuffer15.enqueue((java.lang.Object)'#');
    int i18 = ringBuffer15.size();
    boolean b19 = ringBuffer15.isEmpty();
    int i20 = ringBuffer15.size();
    boolean b21 = ringBuffer15.isEmpty();
    exercise03.RingBuffer ringBuffer23 = new exercise03.RingBuffer(10);
    ringBuffer23.enqueue((java.lang.Object)false);
    ringBuffer15.enqueue((java.lang.Object)ringBuffer23);
    ringBuffer1.enqueue((java.lang.Object)ringBuffer23);
    java.lang.Object obj28 = ringBuffer1.dequeue();
    java.util.function.Consumer consumer29 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer1.forEach(consumer29);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test188"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    boolean b5 = ringBuffer1.isEmpty();
    java.lang.Object obj6 = ringBuffer1.dequeue();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    java.util.Iterator iterator9 = ringBuffer8.iterator();
    java.util.Iterator iterator10 = ringBuffer8.iterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer8);
    boolean b12 = ringBuffer8.isEmpty();
    boolean b13 = ringBuffer8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '#'+ "'", obj6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test189"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    java.util.Spliterator spliterator7 = ringBuffer1.spliterator();
    java.util.Iterator iterator8 = ringBuffer1.iterator();
    java.util.Iterator iterator9 = ringBuffer1.iterator();
    java.util.Iterator iterator10 = ringBuffer1.iterator();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
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
    org.junit.Assert.assertNotNull(spliterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test190"); }


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
    java.util.Spliterator spliterator15 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator16 = ringBuffer9.spliterator();
    int i17 = ringBuffer9.size();
    int i18 = ringBuffer9.size();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    int i20 = ringBuffer9.size();
    ringBuffer1.enqueue((java.lang.Object)i20);
    
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
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test191"); }


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
    int i55 = ringBuffer15.size();
    exercise03.RingBuffer ringBuffer57 = new exercise03.RingBuffer(10);
    boolean b58 = ringBuffer57.isEmpty();
    java.util.Iterator iterator59 = ringBuffer57.iterator();
    java.util.Iterator iterator60 = ringBuffer57.iterator();
    ringBuffer15.enqueue((java.lang.Object)iterator60);
    java.util.function.Consumer consumer62 = null;
    // The following exception was thrown during execution in test generation
    try {
      ringBuffer15.forEach(consumer62);
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
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator60);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test192"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer ringBuffer3 = new exercise03.RingBuffer(1);
    boolean b4 = ringBuffer3.isEmpty();
    java.util.Spliterator spliterator5 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator6 = ringBuffer3.spliterator();
    java.util.Iterator iterator7 = ringBuffer3.iterator();
    boolean b8 = ringBuffer3.isEmpty();
    int i9 = ringBuffer3.size();
    java.util.Spliterator spliterator10 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator11 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator12 = ringBuffer3.spliterator();
    java.util.Spliterator spliterator13 = ringBuffer3.spliterator();
    exercise03.RingBuffer ringBuffer15 = new exercise03.RingBuffer(1);
    boolean b16 = ringBuffer15.isEmpty();
    java.util.Spliterator spliterator17 = ringBuffer15.spliterator();
    java.util.Spliterator spliterator18 = ringBuffer15.spliterator();
    java.util.Iterator iterator19 = ringBuffer15.iterator();
    boolean b20 = ringBuffer15.isEmpty();
    int i21 = ringBuffer15.size();
    java.util.Spliterator spliterator22 = ringBuffer15.spliterator();
    exercise03.RingBuffer ringBuffer24 = new exercise03.RingBuffer(1);
    boolean b25 = ringBuffer24.isEmpty();
    java.util.Spliterator spliterator26 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator27 = ringBuffer24.spliterator();
    java.util.Spliterator spliterator28 = ringBuffer24.spliterator();
    java.util.Iterator iterator29 = ringBuffer24.iterator();
    ringBuffer15.enqueue((java.lang.Object)iterator29);
    ringBuffer3.enqueue((java.lang.Object)iterator29);
    boolean b32 = ringBuffer3.isEmpty();
    int i33 = ringBuffer3.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer3);
    java.util.Spliterator spliterator35 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator35);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test193"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    boolean b6 = ringBuffer1.isEmpty();
    int i7 = ringBuffer1.size();
    java.util.Spliterator spliterator8 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator9 = ringBuffer1.spliterator();
    boolean b10 = ringBuffer1.isEmpty();
    java.util.Iterator iterator11 = ringBuffer1.iterator();
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator11);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test194"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(10);
    ringBuffer1.enqueue((java.lang.Object)'#');
    int i4 = ringBuffer1.size();
    java.util.Iterator iterator5 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer7 = new exercise03.RingBuffer(1);
    boolean b8 = ringBuffer7.isEmpty();
    java.util.Spliterator spliterator9 = ringBuffer7.spliterator();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer7);
    boolean b11 = ringBuffer1.isEmpty();
    exercise03.RingBuffer ringBuffer13 = new exercise03.RingBuffer(1);
    boolean b14 = ringBuffer13.isEmpty();
    ringBuffer13.enqueue((java.lang.Object)(short)0);
    int i17 = ringBuffer13.size();
    ringBuffer1.enqueue((java.lang.Object)ringBuffer13);
    int i19 = ringBuffer13.size();
    int i20 = ringBuffer13.size();
    java.util.Iterator iterator21 = ringBuffer13.iterator();
    java.util.Iterator iterator22 = ringBuffer13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator22);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test195"); }


    exercise03.RingBuffer ringBuffer1 = new exercise03.RingBuffer(1);
    boolean b2 = ringBuffer1.isEmpty();
    java.util.Spliterator spliterator3 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator4 = ringBuffer1.spliterator();
    java.util.Spliterator spliterator5 = ringBuffer1.spliterator();
    java.util.Iterator iterator6 = ringBuffer1.iterator();
    exercise03.RingBuffer ringBuffer8 = new exercise03.RingBuffer(1);
    ringBuffer8.enqueue((java.lang.Object)'a');
    java.util.Spliterator spliterator11 = ringBuffer8.spliterator();
    java.lang.Object obj12 = ringBuffer8.dequeue();
    java.util.Spliterator spliterator13 = ringBuffer8.spliterator();
    ringBuffer1.enqueue((java.lang.Object)spliterator13);
    java.util.Spliterator spliterator15 = ringBuffer1.spliterator();
    int i16 = ringBuffer1.size();
    java.lang.Object obj17 = ringBuffer1.dequeue();
    int i18 = ringBuffer1.size();
    java.util.Spliterator spliterator19 = ringBuffer1.spliterator();
    
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
    org.junit.Assert.assertNotNull(spliterator11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test196"); }


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
    boolean b17 = ringBuffer1.isEmpty();
    java.lang.Object obj18 = ringBuffer1.dequeue();
    boolean b19 = ringBuffer1.isEmpty();
    java.util.Iterator iterator20 = ringBuffer1.iterator();
    java.util.Iterator iterator21 = ringBuffer1.iterator();
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator21);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test197"); }


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
    java.util.Iterator iterator17 = ringBuffer9.iterator();
    int i18 = ringBuffer9.size();
    java.util.Spliterator spliterator19 = ringBuffer9.spliterator();
    java.util.Spliterator spliterator20 = ringBuffer9.spliterator();
    exercise03.RingBuffer ringBuffer22 = new exercise03.RingBuffer(1);
    boolean b23 = ringBuffer22.isEmpty();
    java.util.Spliterator spliterator24 = ringBuffer22.spliterator();
    java.util.Spliterator spliterator25 = ringBuffer22.spliterator();
    java.util.Iterator iterator26 = ringBuffer22.iterator();
    boolean b27 = ringBuffer22.isEmpty();
    int i28 = ringBuffer22.size();
    java.util.Iterator iterator29 = ringBuffer22.iterator();
    exercise03.RingBuffer ringBuffer31 = new exercise03.RingBuffer(1);
    boolean b32 = ringBuffer31.isEmpty();
    java.util.Spliterator spliterator33 = ringBuffer31.spliterator();
    java.util.Spliterator spliterator34 = ringBuffer31.spliterator();
    java.util.Iterator iterator35 = ringBuffer31.iterator();
    java.util.Iterator iterator36 = ringBuffer31.iterator();
    boolean b37 = ringBuffer31.isEmpty();
    exercise03.RingBuffer ringBuffer39 = new exercise03.RingBuffer(1);
    boolean b40 = ringBuffer39.isEmpty();
    java.util.Spliterator spliterator41 = ringBuffer39.spliterator();
    java.util.Spliterator spliterator42 = ringBuffer39.spliterator();
    ringBuffer31.enqueue((java.lang.Object)ringBuffer39);
    ringBuffer22.enqueue((java.lang.Object)ringBuffer39);
    int i45 = ringBuffer22.size();
    java.util.Iterator iterator46 = ringBuffer22.iterator();
    boolean b47 = ringBuffer22.isEmpty();
    ringBuffer9.enqueue((java.lang.Object)ringBuffer22);
    
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
    org.junit.Assert.assertNotNull(iterator17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator20);
    
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
    org.junit.Assert.assertNotNull(iterator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

}
