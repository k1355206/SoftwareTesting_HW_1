package exercise03.model;

import java.util.Collections;

import exercise03.RingBuffer;
import exercise03.RingBufferException;
import junit.framework.Assert;
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class RingBufferModelWithAdapter implements FsmModel {

	private RingBuffer sut_;
	private RingBufferState state;
	private int i = 0;
	private int N;

	public RingBufferModelWithAdapter(RingBuffer ringBuffer, int capacity) {
		this.state = RingBufferState.EMPTY;
		this.sut_ = ringBuffer;
		N = capacity;
	}

	@Override
	public Object getState() {
		return state.toString();
	}

	@Override
	public void reset(boolean testing) {
		sut_ = new RingBuffer<>(N);
		state = RingBufferState.EMPTY;
		i = 0;
	}

	@Action
	public void enqueue() throws RingBufferException {
		// Action methods are not allowed to have parameter, therefore we set
		// here a fixed value
		if (i < N - 1) {
			i++;
			state = RingBufferState.FILLED;
			sut_.enqueue(new Object());
		} else if (i == N - 1) {
			i++;
			state = RingBufferState.FULL;
			sut_.enqueue(new Object());
		}
		checkSUT();

	}

	@Action
	public void dequeue() throws RingBufferException {
		if (i > 1) {
			i--;
			state = RingBufferState.FILLED;
			sut_.dequeue();
		} else if (i == 1) {
			i--;
			state = RingBufferState.EMPTY;
			sut_.dequeue();
		}
		checkSUT();
	}

	protected void checkSUT() {
		switch(state){
		case EMPTY:
			Assert.assertEquals(0,sut_.size());
			break;
		case FILLED:
			Assert.assertTrue(sut_.size() > 0);
			Assert.assertTrue(sut_.size() < N);
			break;
		case FULL:
			Assert.assertEquals(N, sut_.size());
			break;
		}
	}

	/** An example of generating tests from this model. */
	public static void main(String[] args) {
		int capacity = 2;
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(capacity);
		Tester tester = new GreedyTester(new RingBufferModelWithAdapter(ringBuffer, capacity));
		tester.addListener(new VerboseListener());
		tester.generate(100);
	}

}
