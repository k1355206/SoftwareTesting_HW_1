package test;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import exercise01.RingBuffer;
import exercise01.RingBufferException;

public class RingBufferTest {

	@Test
	public void testRingBuffer() {
		// TODO
		// fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty_1() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(10);
		assertEquals("Newly created RingBuffer must be empty.", ringBuffer.isEmpty(), true);
	}

	@Test
	public void testIsEmpty_2() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(10);
		ringBuffer.enqueue(1);
		assertEquals("RingBuffer must not be empty.", ringBuffer.isEmpty(), false);

	}

	@Test
	public void testSize_1() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		assertEquals("Newly created RingBuffer must have a size of 0.", ringBuffer.size(), 0);

		ringBuffer.enqueue(1);
		assertEquals("RingBuffer must have a size of 1.", ringBuffer.size(), 1);

	}

	@Test
	public void testSize_2() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		assertEquals("Newly created RingBuffer must have a size of 0.", ringBuffer.size(), 0);

		ringBuffer.enqueue(1);
		assertEquals("RingBuffer must have a size of 1.", ringBuffer.size(), 1);

		ringBuffer.enqueue(2);
		assertEquals("RingBuffer must have a size of 2.", ringBuffer.size(), 2);

		ringBuffer.dequeue();
		assertEquals("RingBuffer must have a size of 1.", ringBuffer.size(), 1);

		ringBuffer.dequeue();
		assertEquals("RingBuffer must have a size of 0.", ringBuffer.size(), 0);

	}

	@Test(expected = RingBufferException.class)
	public void testEnqueue_1() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.enqueue(2);
		ringBuffer.enqueue(3);
	}

	@Test(expected = RingBufferException.class)
	public void testEnqueue_2() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		ringBuffer.enqueue(1);
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_1() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		ringBuffer.dequeue();
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_2() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.dequeue();
	}

	@Test
	public void testDequeue_3() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		assertEquals("Ring buffer should be empty.", ringBuffer.isEmpty(), true);
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_4() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		ringBuffer.dequeue();

	}

	@Test(expected = UnsupportedOperationException.class)
	public void testIterator_1() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		iterator.remove();
	}

	@Test
	public void testIterator_2() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must not have a next element.", iterator.hasNext(), false);
	}
	
	@Test
	public void testIterator_3() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must not have a next element.", iterator.hasNext(), false);
	}
	
	@Test
	public void testIterator_4() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		ringBuffer.enqueue(1);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must have a next element.", iterator.hasNext(), true);
	}
	
	
	@Test(expected = NoSuchElementException.class)
	public void testIterator_5() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		int i = iterator.next();		
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testIterator_6() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		Iterator<Integer> iterator = ringBuffer.iterator();
		int i = iterator.next();		
	}
	
	@Test
	public void testIterator_7() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.enqueue(2);
		Iterator<Integer> iterator = ringBuffer.iterator();
		int first = iterator.next();	
		assertEquals("First Element must have value 1.", first, 1);
		int second = iterator.next();	
		assertEquals("First Element must have value 1.", second, 2);
	}
}
