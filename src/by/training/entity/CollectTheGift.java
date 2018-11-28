package by.training.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.training.entity.ingredient.PartOfTheGift;
import by.training.entity.ingredient.Sweet;
import by.training.exception.NumMinSweetException;

public class CollectTheGift {

	List<PartOfTheGift> partOfTheGift;
	int price;
	double weightOfGift;

	public CollectTheGift() {
		this.partOfTheGift = new ArrayList<PartOfTheGift>();
	}

	public CollectTheGift(List<PartOfTheGift> partOfTheGift, int price, double weightOfGift) {
		this.partOfTheGift = partOfTheGift;
		this.price = price;
		this.weightOfGift = weightOfGift;
	}

	public List<PartOfTheGift> getPartOfTheGift() {
		return partOfTheGift;
	}

	public void setPartOfTheGift(List<PartOfTheGift> partOfTheGift) throws NumMinSweetException {
		this.partOfTheGift = partOfTheGift;
		int numOfSweets = 0;
		for (int i = 0; i < partOfTheGift.size(); i++) {
			if (partOfTheGift.get(i) instanceof Sweet) {
				numOfSweets++;
			}
		}
		if (numOfSweets <= 3) {
			throw new NumMinSweetException("Too little sweets!");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeightOfGift() {
		return weightOfGift;
	}

	public void setWeightOfGift(double weightOfGift) {
		this.weightOfGift = weightOfGift;
	}

	@Override
	public String toString() {
		return "CollectTheGift partOfTheGift = " + partOfTheGift + ", price = " + price + "BYN" + ", weight = "
				+ weightOfGift + "g";
	}

	public int countPrice() {
		price = 0;
		for (int i = 0; i < partOfTheGift.size(); i++) {
			price += partOfTheGift.get(i).getPrice();
		}
		return price;
	}

	public double countWeightOfGift() {
		Sweet sweet1 = new Sweet();
		weightOfGift = 0;
		for (int i = 0; i < partOfTheGift.size(); i++) {
			if (partOfTheGift.get(i) instanceof Sweet) {
				sweet1 = (Sweet) partOfTheGift.get(i);
				weightOfGift += sweet1.getWeight();
			}
		}
		return weightOfGift;
	}

	public void preferring() {
		Sweet sweet1 = new Sweet();
		List<Sweet> sweet2 = new ArrayList<Sweet>();
		for (int i = 0; i < partOfTheGift.size(); i++) {
			if (partOfTheGift.get(i) instanceof Sweet) {
				sweet1 = (Sweet) partOfTheGift.get(i);
				sweet2.add(sweet1);
			}
		}
		for (Sweet sweet : sweet2) {
			System.out.println(sweet.getNameOfSweet() + " - " + sweet.preferring());
		}
	}

	public void sortByPrice() {
		Sweet sweet1 = new Sweet();
		List<Sweet> sweet2 = new ArrayList<Sweet>();
		for (int i = 0; i < partOfTheGift.size(); i++) {
			if (partOfTheGift.get(i) instanceof Sweet) {
				sweet1 = (Sweet) partOfTheGift.get(i);
				sweet2.add(sweet1);
			}
		}
		Collections.sort(sweet2, Sweet.COMPARE_BY_PRICE);
		System.out.println(sweet2);
	}

	public void sortByWeight(int min, int max) {
		Sweet sweet1 = new Sweet();
		List<Sweet> sweet2 = new ArrayList<Sweet>();
		for (int i = 0; i < partOfTheGift.size(); i++) {
			if (partOfTheGift.get(i) instanceof Sweet) {
				sweet1 = (Sweet) partOfTheGift.get(i);
				if (sweet1.getWeight() >= min && sweet1.getWeight() <= max) {
					sweet2.add(sweet1);
				}
			}
		}
		for (Sweet sweet : sweet2) {
			System.out.print(sweet.getNameOfSweet() + " - " + sweet.getWeight() + ";  ");
		}
	}

}
