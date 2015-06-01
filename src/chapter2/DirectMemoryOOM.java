package chapter2;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * ֱ�����ڴ����
 * ���������
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 * Ĭ������µڶ��������Ĵ�С����java heap�Ĵ�С������һ������
 * @author skywalker
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		//ֻ��BootstrapClassLoader�ſ���ʹ��
		//Unsafe unsafe = Unsafe.getUnsafe();
		Field field = Unsafe.class.getDeclaredFields()[0];
		field.setAccessible(true);
		Unsafe unsafe = (Unsafe) field.get(null);
		while(true) {
			unsafe.allocateMemory(_1MB);
		}
	}
	
}
