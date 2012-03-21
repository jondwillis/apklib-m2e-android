package com.jondwillis.apklibm2eandroid.app;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.jondwillis.apklibm2eandroid.R;

public class HomeActivity extends SherlockFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.main);
    }
}
