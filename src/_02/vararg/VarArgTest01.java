package _02.vararg;

public class VarArgTest01 {

	public static void main(String[] args) {
		method();
		method(1);
		method(2,4);
		method(2,6,7);
	}
	// 1 metot icerisinde vararg en sonda olmalidir
	// 1 metot icersinde 1 tane olamli
	// ... degisken isminden once olamlidir
	
	public static void method(int ... numbers) {
		System.out.println(numbers.length);
	}
}
