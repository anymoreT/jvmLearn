package chapter2;

/**
 * ����java�����ջ��StackOverFlowError
 * @author skywalker
 *
 */
public class JavaVMStackSOF {

	/**
	 * ��ջ���
	 */
	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength ++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF sof = new JavaVMStackSOF();
		try {
			sof.stackLeak();
		}catch(Throwable t) {
			System.out.println("���:" + sof.stackLength);
			t.printStackTrace();
		}
	}
	
}
