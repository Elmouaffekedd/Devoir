package ex1.q3;

abstract class Fa {
	protected int value = 5;

	abstract void f();

	void g() {
		System.out.println("Traitement 1 de g:" + value);
	}

	@Override
	public String toString() {
		return "(" + value + ")";
	}
}

class Ma extends Fa {
	void f() {
		System.out.println("Traitement de f");
		this.value++;
	}

	@Override
	void g() {
		System.out.println("Traitement 2 de g:" + value);
		this.value++;
	}

	void h() {
		System.out.println("je suis un traitement de h");
		this.value++;
	}
}

class Ta extends Ma {
}

public class Question3 {
	public static void main(String[] args) {
		Fa ma = new Ma();
		ma.f();
		ma.g();
		((Ma)ma).h();
		System.out.print(ma);
		Fa ta = new Ta();
		ta.f();
		ta.g();
		((Ma)ta).h();
		System.out.print(ta);
	}
}
