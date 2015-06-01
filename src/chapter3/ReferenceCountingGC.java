package chapter3;

/**
 * ��֤jvm�Ļ����㷨�������ü�����
 * ����������������־��
 * -Xloggc:D:/gc.log
 * @author skywalker
 *
 */
public class ReferenceCountingGC {
	
	@SuppressWarnings("unused")
	private ReferenceCountingGC instance;
	
	public static void main(String[] args) {
		ReferenceCountingGC rA = new ReferenceCountingGC();
		ReferenceCountingGC rB = new ReferenceCountingGC();
		rA.instance = rB;
		rB.instance = rA;
		
		rA = null;
		rB = null;
		System.gc();
	}

}
