package appliction;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department dep = new Department(1, "developer");
		Seller sel = new Seller(1, "Gabriel", "gabs.gsm19@gmail.com", sdf.parse("21/05/1999"), 5000.00, dep);
		
		System.out.println(sel);

	}

}
