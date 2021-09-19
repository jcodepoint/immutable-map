import java.util.Map;

public class InmutableMapEjemplo4 {

	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1,"Geografia", 2, "Fisica");

		map.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}
}
