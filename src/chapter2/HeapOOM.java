package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * java���ڴ��������
 * �����������
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError(�����ڴ��ת������)
 * @author skywalker
 *
 */
public class HeapOOM {

	public static void main(String[] args) {
		List<OOMObject> objects = new ArrayList<HeapOOM.OOMObject>();
		while(true) {
			objects.add(new OOMObject());
		}
	}
	
	static class OOMObject {
	}
	
}
