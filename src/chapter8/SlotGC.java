package chapter8;

/**
 * 239ҳ,slot��GC��Ӱ��
 * JVM����-verbose:gc
 * @author skywalker
 *
 */
public class SlotGC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		{
			byte[] placeholder = new byte[8 * 1024 * 1024];
			placeholder = null;
		}
		//int a = 0;
		System.gc();
	}
	
}
