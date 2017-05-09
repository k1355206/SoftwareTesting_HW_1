package exercise03.model;

public enum RingBufferState {

	EMPTY("empty"), FILLED("filled"), FULL("full");

	private String value;

	RingBufferState(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}
}
