import java.awt.Color;

public class dog {
	String Name;
	String Breed;
	double Weight;

public dog(String inputName, 
	       String inputBreed, 
	       double inputWeight) {
	this.Name = inputName;
	this.Breed = inputBreed;
	this.Weight = inputWeight;
}

public void Bark(boolean inputCat) {
	if (inputCat)
		{
		System.out.println("Bark");
		}
}

public double speedingUp(double currentSpeed) {
	currentSpeed += 100;
	return currentSpeed;
}
}
