package by.training.entity.ingredient;

import java.util.Comparator;

public class Sweet extends PartOfTheGift{
	
	private String nameOfSweet;
	
	public String preferring() {
		return "Children like/dislike them";
	}
		
	public Sweet() {
		super();
	}
	
	public Sweet(String nameOfPartOfGift, int price, double weight, String nameOfSweet) {
		super(nameOfPartOfGift, price, weight);
		this.nameOfSweet = nameOfSweet;
	}

	public String getNameOfSweet() {
		return nameOfSweet;
	}

	public void setNameOfSweet(String nameOfSweet) {
		this.nameOfSweet = nameOfSweet;
	}
	
	public static final Comparator<Sweet> COMPARE_BY_PRICE = new Comparator<Sweet>() {
	    @Override
	    public int compare(Sweet sw1, Sweet sw2) {
	        return sw1.getPrice() - (sw2.getPrice());
	    }
	};
 
}
