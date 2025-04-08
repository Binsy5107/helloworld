package hello.world;

public interface AnimalInterface {
	public void eat();
	public void sleep();
	
	default void run()
	{
		System.out.println("animal runs");
	}
	static void breath()
	{
		System.out.println("animal breath");
	}
}

