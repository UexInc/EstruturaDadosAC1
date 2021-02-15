package arranjos;

public class Arranjo {

	Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	public Integer menor() {
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}
		return m;
	}

	// TODO: Criar o método do maior no array
	public Integer maior() {
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}

	// TODO: Criar o método da soma no array
	public Integer soma() {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	// TODO: Criar o método das repetições no array
	public Integer repeticoes(int n) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				c += 1;
			}
		}
		return c;
	}

}
