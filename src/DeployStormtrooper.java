
public class DeployStormtrooper {
	
	StormtrooperFactory factory;
	 
	public DeployStormtrooper(StormtrooperFactory factory) { 
		this.factory = factory;
	}
 
	public Stormtrooper orderStormtrooper(String type) {
		Stormtrooper stormtrooper;
 
		stormtrooper = factory.createStormtrooper(type);
 
		stormtrooper.getModelType();
		stormtrooper.getWeaponType();
		stormtrooper.getMission();
		stormtrooper.getArmorType();

		return stormtrooper;
	}

}
