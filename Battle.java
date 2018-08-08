import java.util.Random;

public class Battle {
	private Boss boss;
	private Player player;
	private String messageMiss = "Você errou o ataque e perdeu "
			+ boss.getDamage() + "HP";
	private String messageHit = "Você acertou o ataque e deu "
			+ player.getDamage() + " de dano!";
	private String messageBattle = "Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas";

	public void hit() {
		boss.setHealth(boss.getHealth() - player.getDamage());
		System.out.println(messageHit);
	}

	public void miss() {
		player.setHealth(player.getHealth() - boss.getDamage());
		System.out.println(messageMiss);
	}

	private int random() {
		Random random = new Random();
		int number = random.nextInt(4) + 1;
		return number;
	}

	public boolean battle(int attack) {
		while (boss.getHealth() > 0 && player.getHealth() > 0) {
			System.out.println(messageBattle);
			if (attack == random()) {
				this.hit();
			} else {
				this.miss();
			}
		}

		if (boss.getHealth() == 0) {
			return true;
		} else {
			return false;
		}

	}
}
