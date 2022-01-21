package 샘플2방식; //인터페이스는 메소드를 잘 알면 된다.

public class HelloApp {

	public static void main(String[] args) {
		MessageBean bean;
		
		bean = new MessageBeanEn();
		bean.sayHello("Kim sun dong");
		
		bean = new MessageBeanKr();
		bean.sayHello("김선동");
	}

}
