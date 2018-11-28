package by.training.entity.ingredient;

public class Toy extends PartOfTheGift{

	private String nameOfToy;
	
	public Toy(String nameOfPartOfGift, int price, double weight, String nameOfToy) {
		super(nameOfPartOfGift,price, weight);
		this.nameOfToy = nameOfToy;
	}

	public String getNameOfToy() {
		return nameOfToy;
	}

	public void setNameOfToy(String nameOfToy) {
		this.nameOfToy = nameOfToy;
	}

	@Override
	public String toString() {
		return "Toy [nameOfToy=" + nameOfToy + "]";
	}
	
}
