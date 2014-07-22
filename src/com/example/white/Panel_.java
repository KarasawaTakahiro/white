package com.example.white;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Panel_ extends LinearLayout {
	LinearLayout leftLayout;
	LinearLayout rightLayout;
	TextView leftText;
	TextView rightText;

	public Panel_(Context context) {
		super(context);
		setOrientation(LinearLayout.HORIZONTAL);
		
		leftLayout = new LinearLayout(context);
		rightLayout = new LinearLayout(context);
		leftLayout.setOrientation(LinearLayout.VERTICAL);
		rightLayout.setOrientation(LinearLayout.VERTICAL);
		
		leftText = new TextView(context);
		rightText = new TextView(context);
		leftText.setText("lefttttttttttttttttt");
		rightText.setText("righttttttttttttttt");
		
		addView(leftLayout);
		addView(rightLayout);
		
	}

}
