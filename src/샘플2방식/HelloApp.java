package ����2���; //�������̽��� �޼ҵ带 �� �˸� �ȴ�.

public class HelloApp {

	public static void main(String[] args) {
		MessageBean bean;
		
		bean = new MessageBeanEn();
		bean.sayHello("Kim sun dong");
		
		bean = new MessageBeanKr();
		bean.sayHello("�輱��");
	}

}
