package jsonEncode;

import org.json.simple.JSONObject;

public class JsonObjectExample {

	public static void main(String[] args) {

		//this is writing json data using JsonObject
		JSONObject obj = new JSONObject();
		obj.put("name", "kiran");
		obj.put("age", new Integer(21));
		obj.put("salary", new Double(600000));
		System.out.println(obj);

	}

}
