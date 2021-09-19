import java.util.AbstractMap;
import java.util.Map;

public class InmutableMapEjemplo5 {

	public static void main(String[] args) {

		Map<Integer, String> map = Map.ofEntries(
				new AbstractMap.SimpleEntry<Integer, String>(1, "Mar"),
				new AbstractMap.SimpleEntry<Integer, String>(2, "Lago"),
				new AbstractMap.SimpleEntry<Integer, String>(3, "Rio"),
				new AbstractMap.SimpleEntry<Integer, String>(4, "Arroyo")
			);

		map.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}
}
