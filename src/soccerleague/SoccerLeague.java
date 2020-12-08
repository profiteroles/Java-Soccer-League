
package soccerleague;


public class SoccerLeague {

   
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        
        Goal g1 = new Goal();
        Team t1 = new Team();
        Team t2 = new Team();
        League league1 = new League();
        Game firstGame = new Game();
        
        
        
        System.out.println(p1.getPlayerId(11, 30, "Nick"));
        System.out.println(p2.getPlayerId(7, 28, "Cal"));
        System.out.println(p3.getPlayerId(3, 25, "Dan"));
        System.out.println(p4.getPlayerId(1, 31, "John"));
        System.out.println(league1.finalsLeagues());
        System.out.println(league1.leagueName[0] + ": N/A");
        System.out.println(" ");
        System.out.println(firstGame.Games());
        System.out.print(t1.teams[1] + " vs ");
        System.out.print(t2.teams[0]);
        System.out.println(g1.scoreGoal(0));
        System.out.println(t1.wonGames());
    }    
}
/**
 *
 * @author 30023737
 */