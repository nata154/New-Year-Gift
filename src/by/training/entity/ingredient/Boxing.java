package by.training.entity.ingredient;

public class Boxing extends PartOfTheGift{

	private String nameOfBoxing;
	
	private String material;

	public Boxing(String nameOfPartOfGift, int price, double  weight, String nameOfBoxing, String material) {
		super(nameOfPartOfGift, price,  weight);
		this.nameOfBoxing = nameOfBoxing;
		this.material = material;
	}

	public String getNameOfBoxing() {
		return nameOfBoxing;
	}

	public void setNameOfBoxing(String nameOfBoxing) {
		this.nameOfBoxing = nameOfBoxing;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Boxing [nameOfBoxing=" + nameOfBoxing + ", material=" + material + "]";
	}
	
}
