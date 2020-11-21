package clusterstorm.rules;

public class RulesAPI {

	public static boolean isConfirmed(String playeruuid) {
		if(playeruuid == null) return false;
		
		return Rules.players().hasPlayer(playeruuid);
	}
}
