package com.example.basketball;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	private int scoreA=0;
	private int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void increaseOnePoint_A(View view){
    	scoreA++;
    	displayForTeamA(scoreA);
    	
    }
    
    public void increaseTwoPoint_A(View view){
    	scoreA=scoreA+2;
    	displayForTeamA(scoreA);
    	
    }
    
    public void increaseThreePoint_A(View view){
    	scoreA=scoreA+3;
    	displayForTeamA(scoreA);
    	
    }
    
    
    
    
    public void displayForTeamA(int score){
    	TextView scoreView=(TextView) findViewById(R.id.team_a_score);
    	scoreView.setText(String.valueOf(score));
    }
   
    
    public void increaseOnePoint_B(View view){
    	scoreB++;
    	displayForTeamB(scoreB);
    	
    }
    
    public void increaseTwoPoint_B(View view){
    	scoreB=scoreB+2;
    	displayForTeamB(scoreB);
    	
    }
    
    public void increaseThreePoint_B(View view){
    	scoreB=scoreB+3;
    	displayForTeamB(scoreB);
    	
    }
    
    
    
    public void displayForTeamB(int score){
    	TextView scoreView=(TextView) findViewById(R.id.team_b_score);
    	scoreView.setText(String.valueOf(score));
    }
    
   public void refreshScore(View view){
	   scoreA=0;
	   scoreB=0;
	   displayForTeamA(scoreA);
	   displayForTeamB(scoreB);
   }
    }

