package sec02;

import java.util.HashMap;
import java.util.Map;

public class HashMap2Demo {
	public static void main(String[] args) {
		Map<Element, Integer> map = new HashMap<>();
		map.put(new Element("�ȳ�"), 1);
		map.put(new Element("�ȳ�"), 2);
		map.put(null, 3);
		System.out.println(map.size());
		System.out.println(map);
	}
}