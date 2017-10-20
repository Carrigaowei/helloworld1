public class Hiker {

    public static int answer() {
        return 6 * 9;
    }
    public static int testanswer() {
        return 6 * 9;
    }
    
    public static int calculateAndSetFinalMatchResult() {
        return 0;
    }
    public static int getfinalMatchResult() {
        return 6 * 9;
    }
    public static String outputCompare(int pointsOfPlayerMax, int pointsOfPlayerMin) {
        String O1 = "";
        String O2 = "";
        if (pointsOfPlayerMax == 1) { O1 = "Fifteen"; O2 = "Love";}
        else if (pointsOfPlayerMax == 2) { 
                O1 = "Thirty"; 
                if (pointsOfPlayerMin == 0) O2 = "Love";
                else O2 = "Fifteen";
            }
       else if (pointsOfPlayerMax == 3) { 
                O1 = "Forty"; 
                if (pointsOfPlayerMin == 0) O2 = "Love";
                else if (pointsOfPlayerMin == 1) O2 = "Fifteen"; 
                else if (pointsOfPlayerMin == 2) O2 = "Thirty"; 
                else O2 = "Others ";
            }
        else {
            O1 = String.valueOf(pointsOfPlayerMax);
            O2 = String.valueOf(pointsOfPlayerMin);
        }
        String outputstr = O1 + "-" + O2;
        return outputstr;
    }
    
    public static String getScore(int pointsOfPlayer1, int pointsOfPlayer2){
        String outputstr = "";
        
        
        if (pointsOfPlayer1 == pointsOfPlayer2 )
           {
              if ( pointsOfPlayer1 == 0) outputstr = "Love-All";
              if ( pointsOfPlayer1 == 1) outputstr = "Fifteen-All";
              if ( pointsOfPlayer1 == 2) outputstr = "Thirty-All";
              if ( pointsOfPlayer1 >=3) outputstr = "Deuce";
           }
        else if ((pointsOfPlayer1 >= (pointsOfPlayer2+2))& (pointsOfPlayer1 >= 4))
        {
            outputstr = "Win for " + "Player1";
        }
        else if ((pointsOfPlayer2 >= (pointsOfPlayer1+2))& (pointsOfPlayer2 >= 4))
        {
            outputstr = "Win for " + "Player2";
        }
           else if (pointsOfPlayer1>=3 & pointsOfPlayer2 >= 3 & (pointsOfPlayer1 == pointsOfPlayer2+1))
           {
               outputstr = "Advantage  " + "Player1";
           }
        else if (pointsOfPlayer1>=3 & pointsOfPlayer2 >= 3 & (pointsOfPlayer2 == pointsOfPlayer1+1))
           {
               outputstr = "Advantage  " + "Player2";
           }
        else if (pointsOfPlayer1 > pointsOfPlayer2)
           {            
            outputstr = outputCompare(pointsOfPlayer1,pointsOfPlayer2);                                   
            
           }
        else if (pointsOfPlayer2 > pointsOfPlayer1)
           {            
            outputstr = outputCompare(pointsOfPlayer2,pointsOfPlayer1);                                   
            if (outputstr.indexOf("-")>=0)
            {
                String converseStr2 = outputstr.substring(outputstr.indexOf("-")+1);
                System.out.println("===converse1=="+converseStr);
                converseStr = converseStr2 + "-" + outputstr.substring(0,outputstr.indexOf("-"));
                System.out.println("===converse1=="+converseStr);
            }
           }
                                      
        System.out.println("comeing in ---outputstr---"+outputstr+"---input1--"+pointsOfPlayer1+"---input2--"+pointsOfPlayer2);
        return outputstr;
    }

}
