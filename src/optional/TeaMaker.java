package optional;

public class TeaMaker {

	/* Figure out how to make a cup of tea using the classes below */
	public static void main(String[] args) {

		Kettle ket = new Kettle();
		ket.getWater();
		ket.boil();
		TeaBag teabag = new TeaBag(TeaBag.MINT);
		Cup cup = new Cup();
		cup.makeTea(teabag, ket.getWater());

	}
}

 class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
