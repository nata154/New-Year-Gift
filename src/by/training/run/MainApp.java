package by.training.run;

import java.util.ArrayList;
import java.util.List;

import by.training.entity.CollectTheGift;
import by.training.entity.ingredient.Boxing;
import by.training.entity.ingredient.Chocolate;
import by.training.entity.ingredient.Lozenges;
import by.training.entity.ingredient.PartOfTheGift;
import by.training.entity.ingredient.Toy;
import by.training.exception.NumMinSweetException;

public class MainApp {

	public static void main(String[] args) throws NumMinSweetException  {
		
//		�������������� ��������� ������ ��� �������� ���������� �������. 
//		������������ (������������������ ������ ��������):
//			- ������ (abstract ������ � �� �����������),
//			- ����������,
//			- ������������,
//			- �����������,
//			- ������������,
//			- ���������,
//			- ����������.
//			������ �����, ����� � ���������� ������ ����� ������������� ����� 
//			�������� � ������������� ������. ���������� ����� ���������, ����� 
//			������ ���������� ��� ������� ������. ������������ ������ ����������� 
//			������ �����, ����� ��� ����� �����. ������ ������ ���� �������� 
//			������������� �� �������. ����������� ������ ������ ���� ���������� 
//			� ���� ���������, �� ����� ������ ���������� ���� ��� ����� ������ 
//			��������� ����� ������. ������� ������������ ����� ���������� �������, 
//			� ������� ��������� �������� ����������� �������� ������� � ����������� 
//			�� � ������� ���. � ������ ������ ����� ���� ���� � ������, ������� �� 
//			���������� ������������. ��������� ������ ��������� ������� ��������� 
//			������� � ���������� ���������� �������, ���������� �� � �����-�� ����� 
//			�������� (������������ ���������). ��� �������, ������� ������� ��������� 
//			�����-�� �������� ��� ��������� � ��������� �������� �� �������� ���������.
//
//			2.	���������� �������. ���������� �������� ������ � ������ ���������. 
//			������� ��������� ��������-������. ������� ������� ������� � ������������ 
//			��� ����. �������� ���������� ������ � ������� �� ������ ������ �� ����������. 
//			����� ������� � �������, ��������������� ��������� ��������� ����������.
		
		
		Chocolate choco1 = new Chocolate("Sweet", 5, 25.5, "choco1", "milk", true);
		Chocolate choco2 = new Chocolate("Sweet", 4, 20.0, "choco2", "dark", false);
		Lozenges lozeng1 = new Lozenges("Sweet", 1, 10.5, "lozeng1", true, "orange");
		Lozenges lozeng2 = new Lozenges("Sweet", 1, 10.0, "lozeng1", false, "milk");
		Toy toyBoy = new Toy("Toy", 30, 50,  "for boy");
		Toy toyGirl = new Toy("Toy", 30, 50, "for girl");
		Boxing box1 = new Boxing("Boxing", 15, 50, "box1", "plywood");
		Boxing bag2 = new Boxing("Boxing", 15, 1, "bag2", "biodegradable plastic");
		
		CollectTheGift gift1 = new CollectTheGift();
		List <PartOfTheGift> partOfTheGift1 = new ArrayList<PartOfTheGift>();
		partOfTheGift1.add(choco1);
		partOfTheGift1.add(choco1);
		partOfTheGift1.add(choco1);
		partOfTheGift1.add(choco2);
		partOfTheGift1.add(lozeng1);
		partOfTheGift1.add(lozeng2);
		partOfTheGift1.add(toyBoy);
		partOfTheGift1.add(box1);
		gift1.setPartOfTheGift(partOfTheGift1);
		gift1.countPrice();
		
		CollectTheGift gift2 = new CollectTheGift();
		List <PartOfTheGift> partOfTheGift2 = new ArrayList<PartOfTheGift>();
		partOfTheGift2.add(choco1);
		partOfTheGift2.add(choco1);
		partOfTheGift2.add(choco2);
		partOfTheGift2.add(choco2);
		partOfTheGift2.add(lozeng1);
		partOfTheGift2.add(lozeng2);
		partOfTheGift2.add(toyGirl);
		partOfTheGift2.add(bag2);
		gift2.setPartOfTheGift(partOfTheGift2);
		gift2.countPrice();
		
		System.out.println("Price of the first gift is: " + gift1.countPrice() + " BYN.");
		System.out.println("Price of the second gift is: " + gift2.countPrice() + " BYN.");
		System.out.println("Weight of the first gift is: " + gift1.countWeightOfGift() + " g.");
		System.out.println("Weight of the second gift is: " + gift2.countWeightOfGift() + " g.");
		System.out.println();
		
		System.out.println("Preferring of sweets: ");
		gift1.preferring();
		System.out.println();
		
		System.out.println("Sweets sorted by price: ");
		gift1.sortByPrice();
		gift2.sortByPrice();
		System.out.println();
		
		System.out.println("Sweets in weight range: 15-50 g");
		gift1.sortByWeight(15, 50);
		System.out.println();
		
		
		CollectTheGift gift3 = new CollectTheGift();
		List <PartOfTheGift> partOfTheGift3 = new ArrayList<PartOfTheGift>();
		partOfTheGift3.add(choco1);
		partOfTheGift3.add(choco1);
		partOfTheGift3.add(toyGirl);
		partOfTheGift3.add(bag2);
		
		try {
		gift3.setPartOfTheGift(partOfTheGift3);
		} catch (NumMinSweetException ex) {
			ex.printStackTrace();
		}
		
		gift3.countPrice();
		
		System.out.println("Price of the third gift is: " + gift3.countPrice() + " BYN.");
	}

}
