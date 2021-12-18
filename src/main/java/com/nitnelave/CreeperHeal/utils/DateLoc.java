package com.nitnelave.CreeperHeal.utils;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Date;

/**
 * A simple utility class to store a date and a location.
 *
 * @author nitnelave
 */
public record DateLoc(Date date, Location location) {

  /**
   * Get the stored date.
   *
   * @return The stored date.
   */
  public Date getTime() {
    return date;
  }

  /**
   * The stored location.
   *
   * @return The stored location.
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Get the location's world.
   *
   * @return The location's world.
   */
  public World getWorld() {
    return location.getWorld();
  }
}
