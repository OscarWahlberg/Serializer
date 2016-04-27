import java.io.IOException;
import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws IOException {

		Person parent = new Person(2, "Mike");
		Person p = new Person(1, "Joe", parent);

		String path = "test.json";
		
		IJsonWriter jsonWriter = new JsonWriter();
		jsonWriter.Write(p, path);
		
		IJsonReader jsonReader = new JsonReader();
		Person bajs = jsonReader.Read(path, Person.class);
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(bajs));
		
	}
}
