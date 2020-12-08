
package soccerleague;

import java.util.ArrayList;
import java.util.List;

public class Team {
         String[] teams = {"VIC", "WA", "QLD", "NSW", "SA","NT"};
  
   public String teamPrintName(String teams[]){
       System.out.println(teams[2]);
       return null;
   }
   public String wonGames(){
       System.out.print("The Winning Team is ");
       return teams[1];
   }
}
