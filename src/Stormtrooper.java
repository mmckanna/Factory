
public class Stormtrooper {
	static String modelType = "";
	static String weaponType ;
	static String mission;
	static String armorType;

	public String getModelType() {
		return modelType;
	}

	public void getWeaponType() {
		System.out.println("Weapon type: " + weaponType);
	}

	public void getMission() {
		System.out.println("Mission: " + mission);
	}

	public void getArmorType() {
		System.out.println("Armor Type: " + armorType);
	}

	public String toString() {
		
		StringBuffer display = new StringBuffer();
		display.append("**** " + modelType + " ****\n");
		display.append(weaponType + "\n");
		display.append(mission + "\n");
		display.append(armorType + "\n");
		display.append("\n*******************\n");
			
		return display.toString();
	}
}
