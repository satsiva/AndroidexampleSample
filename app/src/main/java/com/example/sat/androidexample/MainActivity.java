package com.example.sat.androidexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

/*http://android-er.blogspot.in/2015/09/try-androidelevation-on-textview.html*/
/*http://www.technotalkative.com/android-textview-autolink-attribute/*/
/*https://stackoverflow.com/questions/40348088/textview-buffertype*/

public class MainActivity extends AppCompatActivity {

    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4=(TextView)findViewById(R.id.demo);

//
//        textView4.setText("is a textView of Editable BufferType",TextView.BufferType.EDITABLE);
//        Editable editable = textView4.getEditableText();
//        editable.insert(0,"This ");
//
//        textView4.setText("textView of Spannable BufferType",TextView.BufferType.SPANNABLE);
//        Spannable span = (Spannable)textView4.getText();
//        span.setSpan(new ForegroundColorSpan(0xff0000ff),11,"textView of Spannable BufferType".length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);


        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,Examplebutton.class);
               startActivity(in);
            }
        });


    }
}
