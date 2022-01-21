package 샘플2방식;
//클래스이름 implements 인터페이스이름 ~를 해야한다 구현시킨다. //인터페이스는 구현하는 방법만 알려준다. 
public class MessageBeanEn implements MessageBean{

	@Override//약속 개념이다. =>해야한다.
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
		
	}

}
