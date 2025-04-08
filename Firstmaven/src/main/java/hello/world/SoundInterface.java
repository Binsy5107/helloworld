package hello.world;

public interface SoundInterface {
	public void MakeSound();

	private void MakeNoise()
	{
		System.out.println("animal makes noise");
	}
	default void Noise()
	{
		MakeNoise();
	}
}
