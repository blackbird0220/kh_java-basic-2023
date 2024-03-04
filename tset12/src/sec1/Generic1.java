package sec1;
//제너릭은 데이터와 관계없이 아무거나, 모두 받아서 처리하는 클래스
public class Generic1<T> { //<T>타입에 관계없이 사용하게 하겠다는 
	private T field1;
	public Generic1() {
	}
	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}
	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}
	
}
