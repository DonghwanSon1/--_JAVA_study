import java.text.MessageFormat;

public class programing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] data = {{"�������", 1, "����"},{"���ٸ�", 2, "�̱�"},{"¡�⽺ź", 3, "����"}};
		
		String[] result = new String[3];
		//MessageFormat f = new MessageFormat("�̸� : {0}\n��ȣ : {1}   ���� : {2}"); 
		for( int i = 0; i < data.length; i++) {
		result[i] = MessageFormat.format("�̸� : {0}   ��ȣ : {1}   ���� : {2}", data[i]);
		System.out.println(result[i]);
		}
	}

}
			