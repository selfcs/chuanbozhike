import java.util.ArrayList;
public class Example24 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// ����ArrayList���ϣ�ʹ�÷���
		list.add("String");             // �����ַ�������
		list.add("Collection");
		for (String str : list) {     // ��������
			System.out.println(str); // ǿ��ת����String����
		}
	}
}