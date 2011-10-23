package com.andrios.lilly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Lilly_1_GetsAdoptedActivity extends Activity {
   
	Button fwdBTN, backBTN;
	ViewFlipper flipper;
	TextView lilly_1_1_TXT;
	TextView lilly_1_2_TXT;
	TextView lilly_1_3_TXT;
	TextView lilly_1_4_TXT;
	TextView lilly_1_5_TXT;
	TextView lilly_1_6_TXT;
	TextView lilly_1_7_TXT;
	TextView lilly_1_8_TXT;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lilly_1_getsadoptedactivity);
        
        setConnections();
        setOnClickListeners();
        
    }

	private void setConnections() {
		fwdBTN = (Button) findViewById(R.id.lilly_1_fwdBTN);
		backBTN = (Button) findViewById(R.id.lilly_1_backBTN);
		
		flipper = (ViewFlipper) findViewById(R.id.viewFlipper1); 
		flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_in));
	    flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_out));  
	    
	    lilly_1_1_TXT = (TextView) findViewById(R.id.lilly_1_1_TXT);
	    lilly_1_1_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_2_TXT = (TextView) findViewById(R.id.lilly_1_2_TXT);
	    lilly_1_2_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_3_TXT = (TextView) findViewById(R.id.lilly_1_3_TXT);
	    lilly_1_3_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_4_TXT = (TextView) findViewById(R.id.lilly_1_4_TXT);
	    lilly_1_4_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_5_TXT = (TextView) findViewById(R.id.lilly_1_5_TXT);
	    lilly_1_5_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_6_TXT = (TextView) findViewById(R.id.lilly_1_6_TXT);
	    lilly_1_6_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_7_TXT = (TextView) findViewById(R.id.lilly_1_7_TXT);
	    lilly_1_7_TXT.getBackground().setAlpha(90);
	    
	    lilly_1_8_TXT = (TextView) findViewById(R.id.lilly_1_8_TXT);
	    lilly_1_8_TXT.getBackground().setAlpha(90);
	}

	private void setOnClickListeners() {
		fwdBTN.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				flipper.showNext();
				
			}
			
		});
		
		backBTN.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				flipper.showPrevious();
				
			}
			
		});
		
	}
}