package jsonEncode;

import org.json.simple.JSONArray;

public class JsonArrayExample {

	public static void main(String[] args) {

		//this is writing json data using Array
		JSONArray arr = new JSONArray();
		arr.add("kiran");//creating string 1st way
		arr.add(new String("a"));// we can create string in this way also
		arr.add(new Integer(21));
		arr.add(new Double(600000));

		System.out.println(arr);

	}

}
