import java.util.*;
public class Example15 {
	public static void main(String[] args) {
		Map map = new HashMap(); // ����Map����
		map.put("1", "Jack");     // �洢����ֵ
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println("1��" + map.get("1"));  // ���ݼ���ȡֵ
		System.out.println("2��" + map.get("2"));
		System.out.println("3��" + map.get("3"));
	}
}