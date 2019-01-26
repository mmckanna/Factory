
public class BattleDeploy {

	public static void main(String[] args) {
		
		StormtrooperFactory factory = new StormtrooperFactory();
		DeployStormtrooper deploy = new DeployStormtrooper(factory);

		Stormtrooper stormtrooper = deploy.orderStormtrooper("DefaultStormtrooper");
		System.out.println("Deploying a " + stormtrooper.getModelType() + "\n");
		System.out.println(stormtrooper);
 
		stormtrooper = deploy.orderStormtrooper("Deathtrooper");
		System.out.println("Deploying a " + stormtrooper.getModelType() + "\n");
		System.out.println(stormtrooper);
		
		stormtrooper = deploy.orderStormtrooper("WetWeatherStormtrooper");
		System.out.println("Deploying a " + stormtrooper.getModelType() + "\n");
		System.out.println(stormtrooper);
		
		stormtrooper = deploy.orderStormtrooper("ImperialShocktrooper");
		System.out.println("Deploying a " + stormtrooper.getModelType() + "\n");
		System.out.println(stormtrooper);
		
	}

}
