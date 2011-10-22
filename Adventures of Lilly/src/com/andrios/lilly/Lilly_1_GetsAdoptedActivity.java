package com.andrios.lilly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Lilly_1_GetsAdoptedActivity extends Activity {
   
	Button fwdBTN, backBTN;
	ViewFlipper flipper;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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