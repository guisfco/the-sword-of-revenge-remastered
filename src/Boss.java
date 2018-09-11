public class Boss {

	private int health = 100;
	private int damage = 25;

	public Boss() {
	}

	public Boss(int health, int damage) {
		this.health = health;
		this.damage = damage;
	}

	public Boss(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}