package me.streafe.basicarena.kits;

public enum KitType {

	BARBARIAN("Barbarian"),
	WIZARD("Wizard"),
	ARCHER("Archer"),
	PROTEINPOWDER("");
	
	private final String name;
	
	KitType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static KitType getKit(String name) {
		
		for(KitType type : KitType.values()) {
			if(type.toString().equalsIgnoreCase(name)) {
				return type;
			}
		}
		return null;
	}
	
	
	
}
