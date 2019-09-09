package jsonEncode;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonMapExample {

	public static void main(String[] args) {

		//this is writing json data using Map
		Map obj=new HashMap();
		obj.put("name", "kiran");
		obj.put("age", new Integer(21));
		obj.put("salary", new Double(600000));
		String jsonText=JSONValue.toJSONString(obj);
		System.out.println(jsonText);

	}

}
