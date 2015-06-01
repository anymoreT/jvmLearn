package chapter3;

import java.util.concurrent.TimeUnit;

/**
 * ����finalize������������
 * ˵�����ɴ����㷨�ж�Ϊû�����õĶ���󲢲������Ͼ����ˣ����л��Ḵ��...
 * finalizeֻ��ִ��һ��
 * @author skywalker
 *
 */
public class FinalizeEscapeGC {

	/**
	 * ����ʹ�õĹ���
	 */
	public static FinalizeEscapeGC hook = null;
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize��ִ��");
		hook = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		hook = new FinalizeEscapeGC();
		
		//��һ��
		hook = null;
		System.gc();
		TimeUnit.MICROSECONDS.sleep(500);
		if(hook == null) {
			System.out.println("����");
		}else {
			System.out.println("�Ծȳɹ�");
		}
		
		//�ڶ���
		hook = null;
		System.gc();
		TimeUnit.MICROSECONDS.sleep(500);
		if(hook == null) {
			System.out.println("����");
		}else {
			System.out.println("�Ծȳɹ�");
		}
	}
	
}
