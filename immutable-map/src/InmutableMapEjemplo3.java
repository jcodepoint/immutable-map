import java.util.Collections;
import java.util.Map;

public class InmutableMapEjemplo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = Collections.singletonMap(1, "Geografia");

		map.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}
}
