package code;

import java.util.Objects;

/**
 * Helper class which contains all the attributes needed for Neo (player/agent).
 */

public class Neo {

    /**
     * We need to track Neo's location on the grid, Neo's health, and how many hostages neo can currently carry
     *
     * When Neo's damage is at 100, he dies and the game is over. When currentCapacity is at 0, he cannot
     * carry any more hostages.
     */

    private Location _location;
    private int _damage;
    private int _currentCapacity;

    public Neo(Location location, int damage, int currentCapacity){
        _location = location;
        _damage = damage;
        _currentCapacity = currentCapacity;
    }

    // ==========================Getters-and-Setters==========================

    public Location getLocation() {
        return _location;
    }

    public void setLocation(Location location) {
        _location = location;
    }

    public int getDamage() {
        return _damage;
    }

    public void setDamage(int damage) {
    	if(damage<=0)
    	{
    		_damage=0;
    	}
    	_damage=damage;
    }

    public int getCurrentCapacity() {
        return _currentCapacity;
    }

    // ============================Additional-Methods===========================

    /**
     * increases current carry capacity by 1
     */

    public void incCurrentCapacity() {
        _currentCapacity ++;
    }

    /**
     * decreases current carry capacity by 1
     */

    public void decCurrentCapacity() {
        _currentCapacity --;
    }

    /**
     * @return true if Neo can carry more hostages, false otherwise.
     */
    public boolean canCarry() {
        return _currentCapacity > 0;
    }

    // ================================Hashing=================================

    @Override
    public int hashCode() {
        return Objects.hash(_location, _damage, _currentCapacity);
    }
}
