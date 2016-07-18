package com.basti.testautotextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView textview;
   // private ArrayAdapter<Part> arrayAdapter;
    private MyAdapter<Part> myAdapter;
    private List<Part> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (AutoCompleteTextView) findViewById(R.id.textview);
        textview.setThreshold(1);
        String [] arr={"aa","aab","aac"};
        mList = new ArrayList<>();
        mList.add(new Part("1","aaa"));
        mList.add(new Part("2","aab"));
        mList.add(new Part("3","bba"));
        mList.add(new Part("4","bbb"));
        mList.add(new Part("5","bbc"));
      //  arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mList);
        myAdapter = new MyAdapter<>(this, android.R.layout.simple_list_item_1, mList);
        textview.setAdapter(myAdapter);

        textview.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 3){
                    myAdapter.clear();
                    myAdapter.add(new Part("1","zzz"));
                    myAdapter.add(new Part("2","zzy"));
                    myAdapter.add(new Part("3","yyz"));
                    myAdapter.add(new Part("4","yzz"));
                    myAdapter.add(new Part("5","zzza"));
                    myAdapter.add(new Part("5","zzza"));
                    myAdapter.add(new Part("5","zzza"));
                    myAdapter.add(new Part("5","zzza"));
                    Log.i("size",""+myAdapter.getCount());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
