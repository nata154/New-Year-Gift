package by.training.entity.ingredient;

public class Lozenges extends Sweet{
	
	public boolean filling;
	
	public String taste;
	
	@Override
	public String preferring() {
		return ("Children dislike them");
	}

	public Lozenges(String nameOfPartOfGift, int price, double weight, String nameOfSweet, boolean filling, String taste) {
		super(nameOfPartOfGift, price, weight, nameOfSweet);
		this.filling = filling;
		this.taste = taste;
	}

	public boolean isFilling() {
		return filling;
	}

	public void setFilling(boolean filling) {
		this.filling = filling;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}
