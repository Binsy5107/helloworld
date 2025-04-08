package hello.world;

public class Bird extends AnimalHybridClass implements Flyable,Swimable 
{

@Override
public void fly()
{
System.out.println("bird is flyable");	
}
@Override
public void swim()
{
System.out.println("bird is swimable");	
}
	}


