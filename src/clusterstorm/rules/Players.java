package clusterstorm.rules;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Players {

	private File f;
	private FileConfiguration c;
	
	private List<String> players = new ArrayList<>();
	
	public Players() {
		f = new File(Rules.getInstance().getDataFolder() + File.separator + "players.yml");
		try {
			if(!f.exists()) f.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		c = YamlConfiguration.loadConfiguration(f);
		
		players = c.getStringList("players");
		if(players == null) players = new ArrayList<>();
	}
	
	
	public boolean hasPlayer(String playeruuid) {
		return players.contains(playeruuid);
	}
	
	public void writePlayer(String playeruuid) {
		if(players.contains(playeruuid)) return;
		players.add(playeruuid);
		c.set("players", players);
		save();
	}
	
	public void removePlayer(String playeruuid) {
		if(players.contains(playeruuid)) {
			players.remove(playeruuid);
			c.set("players", players);
			save();
		}
	}
	
	public void clear() {
		players.clear();
		c.set("players", null);
		save();
	}
	
	private void save() {
		try {
			c.save(f);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}
