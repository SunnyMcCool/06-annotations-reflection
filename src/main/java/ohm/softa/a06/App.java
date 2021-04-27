package ohm.softa.a06;

import com.google.gson.Gson;
import ohm.softa.a06.model.Joke;


//class Employee {
//	private Integer id;
//	private String firstName;
//	private String lastName;
//
//	@SerializedName(value = "emailId", alternate = "emailAddress")
//	private String email;
//
//	Employee(Integer id, String f, String l, String m)
//	{
//		this.id = id;
//		this.firstName=f;
//		this.lastName=l;
//		this.email=m;
//	}
//}

public class App {

	public static void main(String[] args) {
		// TODO fetch a random joke and print it to STDOUT
//		Employee emp = new Employee(1001, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
//
//		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
//
//		System.out.println(gson1.toJson(emp));
//
		Gson gson = new Gson();
		// JSON String --> Object
		Joke j = gson.fromJson("{\"id\": 0, \"joke\": \"Haha.\"}", Joke.class);
		// categories remains `null`
		// Objec --> JSON String
		String json = gson.toJson(j);


	}

}
