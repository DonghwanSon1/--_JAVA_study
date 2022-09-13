import java.text.MessageFormat;

public class programing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] data = {{"세종대왕", 1, "조선"},{"오바마", 2, "미국"},{"징기스탄", 3, "몽고"}};
		
		String[] result = new String[3];
		//MessageFormat f = new MessageFormat("이름 : {0}\n번호 : {1}   국적 : {2}"); 
		for( int i = 0; i < data.length; i++) {
		result[i] = MessageFormat.format("이름 : {0}   번호 : {1}   국적 : {2}", data[i]);
		System.out.println(result[i]);
		}
	}

}
			