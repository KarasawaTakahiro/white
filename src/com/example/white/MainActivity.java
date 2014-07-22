package com.example.white;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toplayout);
		
		
		Button btn = (Button)findViewById(R.id.update);
		btn.setText("push");
		ll.addView(btn);
		
		for(int i=0; i<5; i++){
			ll.addView(new Panel(ll.getContext()));
		
		}
	}
	public class Panel extends View {
		LinearLayout leftLayout;
		LinearLayout rightLayout;
		TextView leftText;
		TextView rightText;

		public Panel(Context context) {
			super(context);
			
			leftLayout = new LinearLayout(context);
			rightLayout = new LinearLayout(context);
			leftLayout.setOrientation(LinearLayout.VERTICAL);
			rightLayout.setOrientation(LinearLayout.VERTICAL);
			
			leftText = new TextView(context);
			rightText = new TextView(context);
			leftText.setText("lefttttttttttttttttt");
			rightText.setText("righttttttttttttttt");
			
			/*
			addView(leftLayout);
			addView(rightLayout);
			*/
			
		}

	}
		
		

}
