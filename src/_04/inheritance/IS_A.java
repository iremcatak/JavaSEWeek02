package _04.inheritance;

public class IS_A {

}

class Vehicle{
	
}
class Car extends Vehicle implements Speedy{
	
}

class BMW extends Car implements Speedy{
	
}
interface Speedy{
	
}

// Car IS-A Vehicle onermesi DOGRUDUR!
// Vehicle IS-A Car onermesi dogru DEGILDIR!

/* BMW IS-A Car
 * BMW IS-A Speedy onermeleri dogrudur.
 * BMW IS-A Vehicle onermesi dogrudur.
 */

