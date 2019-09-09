package jsonDecode;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecodeExample1 {

	public static void main(String[] args) {

		// Decoding JSON String in java
		String s = "{\"empid\":3,\"empname\":\"naresh\",\"salary\":50000.0,\"department\":{\"deptid\":103,\"deptname\":\"AI\"}}";
		Object object = JSONValue.parse(s);
		JSONObject jsonObject = (JSONObject) object;

		Long empid = (Long) jsonObject.get("empid");
		String empname = (String) jsonObject.get("empname");
		Double salary = (Double) jsonObject.get("salary");
		String department = (String) jsonObject.get("dpartment");
		System.out.println(empid + " " + empname + " " + salary + " " + department);

	}

}
