package _05.inheritance;

public class InheritanceTest {

}

abstract class Car{
	
	//abstract tanimlanan metotlari yeniden kullanmak icin override etmek zorundayiz.
	
	public abstract String getBrand();
	
	public abstract int getPrice();
	
	
	//bu metotlar kalitim/ extends vasitasiyla kullanilabilir
	//boylelikle BMW,Mercedes,... siniflar icin yeniden yazmamis oluruz.
	//code duplication onlendi!
	
	public void drive() {
		System.out.println("drive...");
	}
	public void stop() {
		System.out.println("stop...");
	}
	public int door() {
		return 5;
	}
}

class BMW extends Car{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW modeli";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}
	
	public int door() {
		return 2;
	}
}

class Mercedes extends Car{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "MERCEDES 55";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 980000;
	}
	
}

class Toyota extends Car{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Toyota ";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 720000;
	}
}
class Ford extends Car{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Ford";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 600500;
	}
}
// n tane subclass olabilir