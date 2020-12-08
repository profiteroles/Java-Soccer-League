
package soccerleague;


public class Goal {
    
    String date;
    int goal;
    
    
    void recordedGoal(String date){
        System.out.println(date);
    }
    Player p1 = new Player();
    
    public int scoreGoal(int goal){
        goal = 0;
        goal++;
        System.out.print(" score a GOAL! " );
        return goal;
    }
    
}
