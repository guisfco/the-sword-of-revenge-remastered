public class Player {
	private int health = 100;
	private int damage = 50;

	public Player() {
	}

	public Player(int health, int damage) {
		this.health = health;
		this.damage = damage;
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
