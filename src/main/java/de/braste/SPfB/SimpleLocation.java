package de.braste.SPfB;

import org.bukkit.Location;
import java.io.Serializable;

public class SimpleLocation implements Serializable {
    private static final long serialVersionUID = -1249619403579340650L;
    public String worldName;
    public int x, y, z;

    public SimpleLocation(String world, int xLocation, int yLocation, int zLocation) {
        worldName = world;
        x = xLocation;
        y = yLocation;
        z = zLocation;
    }

    public SimpleLocation(Location loc) {
        worldName = loc.getWorld().getName();
        x = loc.getBlockX();
        y = loc.getBlockY();
        z = loc.getBlockZ();
    }
}
