package by.training.entity.ingredient;

public class PartOfTheGift {

	private String nameOfPartOfGift;

	private int price;
	
	private double weight;

	public PartOfTheGift() {
		
	}
	
	public PartOfTheGift(String nameOfPartOfGift, int price, double weight) {
		this.nameOfPartOfGift = nameOfPartOfGift;
		this.price = price;
		this.weight = weight;
	}

	public String getNameOfPartOfGift() {
		return nameOfPartOfGift;
	}

	public void setNameOfPartOfGift(String nameOfPartOfGift) {
		this.nameOfPartOfGift = nameOfPartOfGift;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PartOfGift " + nameOfPartOfGift + " = " + price + " BYN ";
	}

}
