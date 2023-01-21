import java.util.Scanner;

public class Faktoriyel {

	static long FaktoriyelHesap(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * FaktoriyelHesap(n - 1);
		}
	}

	public static void main(String[] args) {

		int gsayi, gsayi1;
		long kombinasyon;
		Scanner inp = new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz: ");
		gsayi = inp.nextInt();
		System.out.println("ikinci Sayýsýnýyý Giriniz: ");
		gsayi1 = inp.nextInt();
		kombinasyon = FaktoriyelHesap(gsayi) / (FaktoriyelHesap(gsayi1) * FaktoriyelHesap(gsayi - gsayi1));
		System.out.println(kombinasyon);

	}

}
