package com.andrios.lilly;


import android.app.Activity;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class Lilly_1_GetsAdoptedActivity extends Activity implements OnGesturePerformedListener {
   
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
	TextView lilly_1_9_TXT;
	TextView lilly_1_10_TXT;
	
	Button autoRead;
	Button textToggle;
	
	MediaPlayer mp;
	GestureLibrary mLibrary;
	
	boolean isText, isRead;
	
	/** Called when the activity is first created. */
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lilly_1_getsadoptedactivity);
        
        setConnections();
        setOnClickListeners();
        mLibrary = GestureLibraries.fromRawResource(this, R.raw.gestures);
        if (!mLibrary.load()) {
            finish();
        }
        
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);//TODO... this is a blank file i just made
	    //menu.getItem(0).setIcon(R.drawable.button_text_on);
	    //menu.getItem(1).setIcon(R.drawable.button_speech_off);
	    
	    return true;
	}
    
    public void onPause(){
    	super.onPause();
    	stopRead();
    }

	private void setConnections() {
		
		//autoRead = (Button) findViewById(R.id.lilly_1_autoRead_ToggleButton);
		isRead = false;
		//textToggle = (Button) findViewById(R.id.lilly_1_text_ToggleButton);
	
		isText = true;
		
		//fwdBTN = (Button) findViewById(R.id.lilly_1_fwdBTN);
		//backBTN = (Button) findViewById(R.id.lilly_1_backBTN);
		
		flipper = (ViewFlipper) findViewById(R.id.viewFlipper1); 
		flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_in));
	    flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_out));  
	    
	    	lilly_1_1_TXT = (TextView) findViewById(R.id.lilly_1_1_TXT);
	 	    lilly_1_1_TXT.getBackground().setAlpha(99);
	 	    
	 	    lilly_1_2_TXT = (TextView) findViewById(R.id.lilly_1_2_TXT);
	 	    lilly_1_2_TXT.getBackground().setAlpha(99);
	 	    
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
	 	    
	 	    lilly_1_9_TXT = (TextView) findViewById(R.id.lilly_1_9_TXT);
	 	    lilly_1_9_TXT.getBackground().setAlpha(90);
	 	    
	 	    lilly_1_10_TXT = (TextView) findViewById(R.id.lilly_1_10_TXT);
	 	    lilly_1_10_TXT.getBackground().setAlpha(90);
	   
	   
	 	   GestureOverlayView gestures = (GestureOverlayView) findViewById(R.id.lilly_1_gestureOverlay);
	 	  gestures.addOnGesturePerformedListener(this);
	}
	
	private void toggleText(){
		isText = !isText;
		if(!isText){
			
			//textToggle.setBackgroundResource(R.drawable.button_text_off);
			lilly_1_1_TXT.setVisibility(View.GONE);
			lilly_1_2_TXT.setVisibility(View.GONE);
			lilly_1_3_TXT.setVisibility(View.GONE);
			lilly_1_4_TXT.setVisibility(View.GONE);
			lilly_1_5_TXT.setVisibility(View.GONE);
			lilly_1_6_TXT.setVisibility(View.GONE);
			lilly_1_7_TXT.setVisibility(View.GONE);
			lilly_1_8_TXT.setVisibility(View.GONE);
			lilly_1_9_TXT.setVisibility(View.GONE);
			lilly_1_10_TXT.setVisibility(View.GONE);
	   
		}else{
			//textToggle.setBackgroundResource(R.drawable.button_text_on);
			lilly_1_1_TXT.setVisibility(View.VISIBLE);
			lilly_1_2_TXT.setVisibility(View.VISIBLE);
			lilly_1_3_TXT.setVisibility(View.VISIBLE);
			lilly_1_4_TXT.setVisibility(View.VISIBLE);
			lilly_1_5_TXT.setVisibility(View.VISIBLE);
			lilly_1_6_TXT.setVisibility(View.VISIBLE);
			lilly_1_7_TXT.setVisibility(View.VISIBLE);
			lilly_1_8_TXT.setVisibility(View.VISIBLE);
			lilly_1_9_TXT.setVisibility(View.VISIBLE);
			lilly_1_10_TXT.setVisibility(View.VISIBLE);
		}
	}
	private void toggleAutoRead(){
		isRead = !isRead;
		if(!isRead){
			//autoRead.setBackgroundResource(R.drawable.button_speech_off);
			stopRead();
	   
		}else{
			//autoRead.setBackgroundResource(R.drawable.button_speech_on);
			startAutoRead();
		}
	}
	private void setOnClickListeners() {
		/*textToggle.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				toggleText();
				
			}

			
			
		});
		
		autoRead.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				toggleAutoRead();
				
			}

			
			
		});*/
		
//		fwdBTN.setOnClickListener(new OnClickListener(){
//
//			public void onClick(View v) {
//				stopRead();
//				if(flipper.getDisplayedChild() < flipper.getChildCount()-1){
//					flipper.showNext();
//					startAutoRead();
//				}
//				
//				
//			}
//			
//		});
//		
//		backBTN.setOnClickListener(new OnClickListener(){
//
//			public void onClick(View v) {
//				stopRead();
//				if(flipper.getDisplayedChild() > 0){
//					flipper.showPrevious();
//					startAutoRead();
//				}
//			}
//			
//		});
		
		lilly_1_1_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {

				 playAudio(1);
				
			}
			
		});
		
		lilly_1_2_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(2);
				
			}
			
		});
		
		lilly_1_3_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(3);
				
			}
			
		});
		
		lilly_1_4_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(4);
				
			}
			
		});
		
		lilly_1_5_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(5);
				
			}
			
		});
		
		lilly_1_6_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(6);
				
			}
			
		});
		
		lilly_1_7_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(7);
				
			}
			
		});
		
		lilly_1_8_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(8);
				
			}
			
		});
		
		lilly_1_9_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(9);
				
			}
			
		});
		
		lilly_1_10_TXT.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				 playAudio(10);
				
			}
			
		});
		
	}
	
	private void playAudio(int audio){
		int audioFile = 0;
		switch (audio){

			case 1:
				audioFile = R.raw.audio_lilly_1_1;
				break;
			case 2:
				audioFile = R.raw.audio_lilly_1_2;
				break;  
			case 3:
				audioFile = R.raw.audio_lilly_1_3;
				break; 
			case 4:
				audioFile = R.raw.audio_lilly_1_4;
				break; 
			case 5:
				audioFile = R.raw.audio_lilly_1_5;
				break; 
			case 6:
				audioFile = R.raw.audio_lilly_1_6;
				break; 
			case 7:
				audioFile = R.raw.audio_lilly_1_7;
				break; 
			case 8:
				audioFile = R.raw.audio_lilly_1_8;
				break; 	 
			case 9:
				audioFile = R.raw.audio_lilly_1_9;
				break; 	 
			case 10:
				audioFile = R.raw.audio_lilly_1_10;
				break; 	
				
		}
		try{
			mp.stop();
		}catch(Exception e){
			
		}
		
		try{
			
				mp = MediaPlayer.create(Lilly_1_GetsAdoptedActivity.this, audioFile);  
				  mp.start();
				  mp.setOnCompletionListener(new OnCompletionListener() {

                       public void onCompletion(MediaPlayer mp) {
                           mp.release();
                           if(isRead){
                        	   if(flipper.getDisplayedChild() < flipper.getChildCount()-1){
               					pageNext();
               					startAutoRead();
               					}
                        	  
                           }
                       }

                   });
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	
	private void startAutoRead(){
		if(isRead){
			playAudio(flipper.getDisplayedChild() + 1);
		}
	}
	
	private void stopRead(){
		try{
			mp.stop();
		}catch(Exception e){
			
		}
	}
	
	public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
	    ArrayList<Prediction> predictions = mLibrary.recognize(gesture);
	    System.out.println("GESTURE");
	    // We want at least one prediction
	    if (predictions.size() > 0 && predictions.get(0).score > 1.0) {
	        String action = predictions.get(0).name;
	        System.out.println("Action Name: " + action);
	        if ("left".equals(action)) {
	        	if(flipper.getDisplayedChild() < flipper.getChildCount()-1){
	        		pageNext();
					startAutoRead();
				}
	        } else if ("right".equals(action)) {
	        	if(flipper.getDisplayedChild() > 0){
	        		pagePrevious();
					startAutoRead();
				}
	        }
	    }
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    /**
        switch (item.getItemId()) {

            case R.id.menuTextBTN:
	    	toggleText();
	    	
	        return true;
	    	
	    case R.id.menuReadBTN:
	    	toggleAutoRead();
	    	
	        return true;
	  
	    default:
	        return super.onOptionsItemSelected(item);
	    }
         **/
        return false;
	}
	
	private void pagePrevious(){
		flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_in));
	    flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_out));  
		flipper.showPrevious();
	}
	
	private void pageNext(){
		flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_in));
	    flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_out));  
		flipper.showNext();
	}
}