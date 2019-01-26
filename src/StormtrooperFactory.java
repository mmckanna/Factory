
public class StormtrooperFactory {
	
	public Stormtrooper createStormtrooper(String type) {
		Stormtrooper stormtrooper = null;

		if (type.equals("DefaultStormtrooper")) {
			stormtrooper = new DefaultStormtrooper();
		} else if (type.equals("WetWeatherStormtrooper")) {
			stormtrooper = new WetWeatherStormtrooper();
		} else if (type.equals("ImperialShocktrooper")) {
			stormtrooper = new ImperialShocktrooper();
		} else if (type.equals("Deathtrooper")) {
			stormtrooper = new Deathtrooper();
		}
		return stormtrooper;
	}

}
