package exercise03.model;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class RingBufferModel implements FsmModel {

	private RingBufferState state;
	private int i = 0;
	private int N;

	public RingBufferModel(int N) {
		this.state = RingBufferState.EMPTY;
		this.N = N;
	}

	@Override
	public Object getState() {
		return state.toString();
	}

	@Override
	public void reset(boolean testing) {
		state = RingBufferState.EMPTY;
		i = 0;
	}

	@Action
	public void enqueue() {
		if (i < N - 1) {
			i++;
			state = RingBufferState.FILLED;
		} else if (i == N - 1) {
			i++;
			state = RingBufferState.FULL;
		}
	}

	@Action
	public void dequeue() {
		if (i > 1) {
			i--;
			state = RingBufferState.FILLED;
		} else if (i == 1) {
			i--;
			state = RingBufferState.EMPTY;
		}
	}

	/** An example of generating tests from this model. */
	public static void main(String[] args) {
		Tester tester = new GreedyTester(new RingBufferModel(2));
		tester.addListener(new VerboseListener());
		tester.generate(100);
	}

}
