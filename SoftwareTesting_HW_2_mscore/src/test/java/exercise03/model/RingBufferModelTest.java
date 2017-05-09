package exercise03.model;

import org.junit.Test;

import exercise03.RingBuffer;
import exercise03.RingBufferException;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.StopOnFailureListener;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

public class RingBufferModelTest {

	@Test
	public void testRingBufferModel() {
		int capacity = 2;
		RingBuffer<Integer> ringBuffer = new RingBuffer<>(capacity);
		Tester tester = new GreedyTester(new RingBufferModelWithAdapter(ringBuffer, capacity));
		tester.addCoverageMetric(new TransitionCoverage());
		tester.addListener(new VerboseListener());
		tester.addListener(new StopOnFailureListener());
		tester.generate(60);
		tester.printCoverage(); // print the model coverage information
	}


}
