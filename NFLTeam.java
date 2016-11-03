import java.util.*;
/**
 * NFLTeam.java
 * 
 * @author Joe Dunne, Joe Dementri, Michael Matthews
 * @Revisions Team IR October 24th, 2016  
 */

/**
 * TODO: Conflict between current Player and NFLPlayer here.
 * Note: Controller builds Teams and loads players.
 */
public class NFLTeam 
{  
    /**
     * Team name.
     */
    private String team;
       
    /**
     * List of all of the players on the team.
     */
    private ArrayList<Player> offense;
    
    /**
     * 
     */
    private ArrayList<Player> defense;

    /**
     * Constructor for objects of class NFLTeam.
     * 
     * @param team - the team name.
     */
    public NFLTeam(String team) 
    {
        this.team = team;
        offense = new ArrayList<Player>();
        defense = new ArrayList<Player>();
    }
       
    /** 
     * Adds player to offense.
     * @param player - the player to add to offense.
     */
    public void addPlayerToOffense(Player player) 
    {
        offense.add(player);
    }
    
    /**
     * Adds player to defense.
     * @param player the player to add to defense.
     */
    public void addPlayerToDefense(Player player) 
    {
        defense.add(player);
    }

    /**
     * Gets all of the players on the team
     * 
     * @return     the list of players
     */    
    public ArrayList<Player> getOffense() 
    {
        return offense;
    }
    /**
     * Gets all of the players on the team
     * 
     * @return     the list of players
     */    
    public ArrayList<Player> getDefense() 
    {
        return defense;
    }
    
    /**
     * Gets the team name.
     * 
     * @return team name.
     */
    public String getTeamName() 
    {
        return team;
    }
}