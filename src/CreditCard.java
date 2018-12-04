
public class CreditCard {

	private long cardNumber;

	public CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean sumCertainDigits() {
		long n = cardNumber;
		int sum = 0;
		int count = 0;
		while (n > 0) {
			count++;
			int digit = (int) (n % 10);
			if (count % 2 != 0) {// Esto del count es para poner la posición impar
				sum = sum + digit;
			} else if (digit < 5) {
				sum = sum + 2 * digit;
			} else {
				sum = sum + 2 * digit - 9;
			}n = n / 10;
		}
		return sum % 10 == 0;
	}

	public static void main(String[] args) {
		CreditCard miPrograma = new CreditCard(123456789);
		System.out.println(miPrograma.sumCertainDigits());
	}

}
