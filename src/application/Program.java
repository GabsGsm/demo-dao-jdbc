package application;

import java.text.ParseException;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.ISellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		ISellerDao sellerDao = DaoFactory.createSellerDao(DB.getConnection());

		System.out.println("=== find by id ===");
		System.out.println();

		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		System.out.println();

		System.out.println("=== find all ===");
		System.out.println();

		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
		System.out.println();

		System.out.println("=== find by department ===");
		System.out.println();

		List<Seller> listByDepartment = sellerDao.findByDepartment(seller.getDepartment());
		listByDepartment.forEach(System.out::println);
		System.out.println();

		System.out.println("=== insert seller ===");
		System.out.println();

		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 *seller.setName("Catarina Valentim");
		 *seller.setBaseSalary(11000.00);
		 *seller.setBirthDate(sdf.parse("12/12/2001"));
		 *seller.setEmail("catarina@gmail.com");
		 *seller.setDepartment(new Department(4, null));
		 * sellerDao.insert(seller); 
		 * System.out.println("new seller: id " + seller.getId()); 
		 * System.out.println();
		 */
		System.out.println("=== update seller ===");
		System.out.println();

		/*seller.setBaseSalary(15000.00);
		 *sellerDao.update(seller);
		 *System.out.println("update seller: id " + seller.getId()); 
		 *System.out.println();
		*/
		
		System.out.println("=== delete seller ===");
		System.out.println();
		//sellerDao.deleteById(2);

		DB.closeConnection();

	}

}
