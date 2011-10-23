package com.andrios.lilly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AdventuresofLillyActivity extends Activity {
    
	Button aboutBTN;
	Button lilly_1_BTN;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        setConnections();
        setOnclickListeners();
    }

    
    
	private void setConnections() {
		lilly_1_BTN = (Button) findViewById(R.id.mainActivityLilly_1_BTN);
		aboutBTN = (Button) findViewById(R.id.mainActivityAboutBTN);
	}

	private void setOnclickListeners() {
		
		aboutBTN.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), AboutActivity.class);
				
				startActivity(intent);
			}
			
		});
		
		lilly_1_BTN.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Lilly_1_GetsAdoptedActivity.class);
				
				startActivity(intent);
			}
			
		});
		
	}
}