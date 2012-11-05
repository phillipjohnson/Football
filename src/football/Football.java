package football;

import java.util.Random;
import java.util.TreeMap;
        
public class Football
{

    private TreeMap<Float,Integer> frequencyTable = new TreeMap<>();
    private Random r = new Random();
    private int myWeeklyPick = 0;
    private int myMoney = 0;
    private int gamesPerSeason = 12;
    private int payoutMultiplier = 5;
            
    public static void main(String[] args)
    {
        Football fb = new Football();
        
        fb.generateTable();
        
        int totalMoney = 0;
        int iterations = 10000;
        for(int i = 0; i < iterations; i++)
        {
            fb.playSeason();
            totalMoney += fb.myMoney;
            System.out.println(fb.myMoney);
        }
        
        System.out.println("AVERAGE: " + (float)totalMoney / (float)iterations);
        
    }
    
    private void generateTable()
    {
        //Pre-calculated cumulative frequencies of total scores' "ones" place
        frequencyTable.put(.1070f,0);
        frequencyTable.put(.2233f,1);
        frequencyTable.put(.3194f,2);
        frequencyTable.put(.4078f,3);
        frequencyTable.put(.5210f,4);
        frequencyTable.put(.6032f,5);
        frequencyTable.put(.6807f,6);
        frequencyTable.put(.8140f,7);
        frequencyTable.put(.9055f,8);
        frequencyTable.put(1.0f,9);
    }
    
    private void setWeeklyNumber()
    {
        myWeeklyPick = r.nextInt(10);
    }
    
    private int getScore()
    {
        return frequencyTable.ceilingEntry(r.nextFloat()).getValue();
    }
    
    private void playGame(int costPerGame)
    {
        setWeeklyNumber();
        myMoney -= costPerGame;
        int halfTimeScore = getScore();
        if(halfTimeScore == myWeeklyPick)
        {
            myMoney += payoutMultiplier*costPerGame;
        }
        int finalScore = getScore();
        if(finalScore == myWeeklyPick)
        {
            myMoney += payoutMultiplier*costPerGame;
        }       
    }
    
    private void playSeason()
    {
        myMoney = 0;
        
        //Regular season games
        for(int i = 0; i < gamesPerSeason - 1; i++)
        {
            playGame(2);
        }
        //One Michigan game
        playGame(5);
        //One bowl game
        playGame(5);
    }
}
