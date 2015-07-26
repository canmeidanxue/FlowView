package com.example.warpos.testandroidannotions;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.warpos.testandroidannotions.view.FlowLayout;

import org.androidannotations.annotations.EActivity;

//@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
private String[] data={"hun","orc","zz","ud","ne","am","mk","dk","ht","bmg","bb","cc"};
    private FlowLayout flowLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowLayout= (FlowLayout) findViewById(R.id.flowLayout);
//        initData();
        initTextView();
    }
    private void initTextView(){
        LayoutInflater mInflater = LayoutInflater.from(this);
        for (int i = 0; i < data.length; i++)
        {
         TextView textView= (TextView) mInflater.inflate(R.layout.tv,flowLayout,false);
            textView.setText(data[i]);
            flowLayout.addView(textView);
        }

    }
    /**
     * 添加button
     */
    private void initData(){
    for (int i=0;i<data.length;i++){
        Button btn=new Button(this);
      ViewGroup.MarginLayoutParams layoutParams=new ViewGroup.MarginLayoutParams(
                ViewGroup.MarginLayoutParams.WRAP_CONTENT,
                ViewGroup.MarginLayoutParams.WRAP_CONTENT);

        btn.setText(data[i]);
        flowLayout.addView(btn,layoutParams);


    }

}


}
