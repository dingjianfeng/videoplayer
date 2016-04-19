package nwu.ding.dingvideoplayerv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class wel extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    
	 
	     new Handler().postDelayed(new Runnable(){

		 @Override
		 public void run() {
		     Intent intent = new Intent(wel.this,VideoPlayerActivity.class);
		     startActivity(intent);
		     wel.this.finish();
		 }

		 }, 2500);

	}
}