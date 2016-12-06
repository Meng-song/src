class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class SandWich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public SandWich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new SandWich();
	}
}