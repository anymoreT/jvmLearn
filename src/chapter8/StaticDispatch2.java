package chapter8;

/**
 * ��̬�ַ�
 * ������ʵ�������Ľ��
 * ��˵����ֻҪ�Ƿ������ط����ľ��Ǿ�̬�ַ�
 * @author skywalker
 *
 */
public class StaticDispatch2 {

	static abstract class Human {}
	
	static class Man extends Human {}
	
	static class Woman extends Human {}
	
	public void sayHello(Human human) {
		System.out.println("human says hello");
	}
	
	public void sayHello(Man man) {
		System.out.println("man says hello");
	}
	
	public void sayHello(Woman woman) {
		System.out.println("woman says hello");
	}
	
	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		StaticDispatch2 sd = new StaticDispatch2();
		
		sd.sayHello(man);//human says hello
		sd.sayHello(woman);//human says hello
	}
	
}
