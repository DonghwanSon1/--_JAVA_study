package challenge.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class DicTest {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();

		dic.put("cat", "꼬네이");
		dic.put("head", "대가빠리");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		dic.put("teacher", "쌤");
		dic.put("child", "얼라");

		dic.forEach((x, y) -> System.out.print(x + "=" + y + "  "));
		System.out.println();

		Collection<String> collection1 = dic.values();
		List<String> list1 = new ArrayList<>(collection1);
		Collections.shuffle(list1);
		list1.forEach(x -> System.out.print(x + "  "));
		System.out.println();

		Collection<String> collection2 = dic.keySet();
		collection2.forEach(x -> System.out.print(x + " "));
		System.out.println();

		Stream<String> stream = collection2.stream();
		stream.sorted().filter(x -> x.length() > 4).forEach(x -> System.out.print(x + " "));
	}
}