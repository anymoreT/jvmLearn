package chapter3;

/**
 * ���Զ������������������(Ĭ��15)
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	-XX:MaxTenuringThreshold=15 -XX:+UseSerialGC
	-XX:+PrintTenuringDistribution
	��ʵ��û�гɹ� why? ��֪��...
 * @author skywalker
 *
 */
public class TenuringThreshold {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte []b1 = new byte[Constants._MB / 4];
		byte []b2 = new byte[Constants._MB * 4];
		byte []b3 = new byte[Constants._MB * 4];
		b3 = null;
		b3 = new byte[Constants._MB * 4];
	}
	
}
