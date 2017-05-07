package exercise03;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import exercise03.RingBuffer;
import exercise03.RingBufferException;

public class RingBufferTest {

	@Test
	public void testIsEmpty_NewRingBuffer_True() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(10);
		assertEquals("Newly created RingBuffer must be empty.", ringBuffer.isEmpty(), true);
	}

	@Test
	public void testIsEmpty_OneElement_False() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(10);
		ringBuffer.enqueue(1);
		assertEquals("RingBuffer must not be empty.", ringBuffer.isEmpty(), false);
	}

	@Test
	public void testSize_OneEnqueue_SizeIncrement() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		assertEquals("Newly created RingBuffer must have a size of 0.", ringBuffer.size(), 0);

		ringBuffer.enqueue(1);
		assertEquals("RingBuffer must have a size of 1.", ringBuffer.size(), 1);
	}

	@Test
	public void testSize_MultipleEnqueueDequeue_SizeIncrementAndDecrement() throws RingBufferException {
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
	public void testEnqueue_EnqueueCountExceedsCapacity_ExceptionThrown() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.enqueue(2);
		ringBuffer.enqueue(3);
	}

	@Test(expected = RingBufferException.class)
	public void testEnqueue_EnqueueOnZeroCapacity_ExceptionThrown() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		ringBuffer.enqueue(1);
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_DequeueOnZeroCapacity_ExceptionThrown() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		ringBuffer.dequeue();
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_DequeueOnEmptyRingBuffer_ExceptionThrown() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.dequeue();
	}

	@Test
	public void testDequeue_DequeueOnSizeOne_IsEmpty() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		assertEquals("Ring buffer should be empty.", ringBuffer.isEmpty(), true);
	}

	@Test(expected = RingBufferException.class)
	public void testDequeue_DequeueCountExceedsSize_ExceptionThrown() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		ringBuffer.dequeue();
	}
	
	@Test
	public void testDequeue_DequeueSingle_CorrectElementRetrieved() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		int elementEnqueued = 3;
		ringBuffer.enqueue(elementEnqueued);
		int elementDequeued = ringBuffer.dequeue();
		assertEquals("Enqueued element should be retrieved on dequeue.", elementEnqueued, elementDequeued);
	}
	
	@Test
	public void testDequeue_DequeueMultiple_ElementsRetrievedInCorrectOrder() throws RingBufferException {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(3);
		int elementEnqueued1 = 3;
		int elementEnqueued2 = 7;
		int elementEnqueued3 = 2;
		ringBuffer.enqueue(elementEnqueued1);
		ringBuffer.enqueue(elementEnqueued2);
		ringBuffer.enqueue(elementEnqueued3);
		int elementDequeued1 = ringBuffer.dequeue();
		assertEquals("First retrieved element not correct", elementEnqueued1, elementDequeued1);
		int elementDequeued2 = ringBuffer.dequeue();
		assertEquals("Second retrieved element not correct", elementEnqueued2, elementDequeued2);
		int elementDequeued3 = ringBuffer.dequeue();
		assertEquals("Third retrieved element not correct", elementEnqueued3, elementDequeued3);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testIterator_Remove_NotImplemented() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		iterator.remove();
	}

	@Test
	public void testIterator_ZeroCapacityHasNext_False() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must not have a next element.", iterator.hasNext(), false);
	}
	
	@Test
	public void testIterator_IsEmptyHasNext_False() {
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must not have a next element.", iterator.hasNext(), false);
	}
	
	@Test
	public void testIterator_InitialContainingOneElementHasNext_True() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		ringBuffer.enqueue(1);
		Iterator<Integer> iterator = ringBuffer.iterator();
		assertEquals("Iterator must have a next element.", iterator.hasNext(), true);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testIterator_ZeroCapacityNext_ExceptionThrown() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(0);
		Iterator<Integer> iterator = ringBuffer.iterator();
		@SuppressWarnings("unused")
		int i = iterator.next();		
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testIterator_IsEmptyNext_ExceptionThrown() throws RingBufferException{
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(1);
		ringBuffer.enqueue(1);
		ringBuffer.dequeue();
		Iterator<Integer> iterator = ringBuffer.iterator();
		@SuppressWarnings("unused")
		int i = iterator.next();		
	}
	
	@Test
	public void testIterator_IterateTwoEnqueuedElements_RetrieveCorrectOrderedElements() throws RingBufferException{
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
