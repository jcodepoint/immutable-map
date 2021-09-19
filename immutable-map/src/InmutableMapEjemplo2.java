import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InmutableMapEjemplo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mar");
		map.put(2, "Lago");
		map.put(3, "Rio");
		map.put(4, "Arroyo");

		Map<Integer, String> umap = Collections.unmodifiableMap(map);

		umap.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
		
		map.put(5, "Volcan");

		System.out.println("\n");
		umap.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}

}
