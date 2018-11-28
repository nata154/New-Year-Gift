package by.training.entity.ingredient;

public class Chocolate extends Sweet{
	
	public String fillingOfChocolate;
	
	private boolean nuts;
	
	@Override
	public String preferring() {
		return ("Children like them");
	}
	
	public Chocolate(String nameOfPartOfGift, int price, double weight, String nameOfSweet, String fillingOfChocolate, boolean nuts) {
		super(nameOfPartOfGift, price, weight, nameOfSweet);
		this.fillingOfChocolate = fillingOfChocolate;
		this.nuts = nuts;
	}

	public String getFillingOfChocolate() {
		return fillingOfChocolate;
	}

	public void setFillingOfChocolate(String fillingOfChocolate) {
		this.fillingOfChocolate = fillingOfChocolate;
	}
	
	public boolean hasNuts() {
		return nuts;
	}

	public void setNuts(boolean nuts) {
		this.nuts = nuts;
	}

}
