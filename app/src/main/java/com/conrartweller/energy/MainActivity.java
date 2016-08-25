package com.conrartweller.energy;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
//import com.conrartweller.energy.SpatialExample.*;

import org.w3c.dom.Text;

/*public class MainActivity extends Activity{

*/
public class MainActivity extends AppCompatActivity {

    public native String helloWorld();
    static {
        System.loadLibrary("helloworld");
    }

    private TextView mExampleTextView;
    private TextView mAccTextView;
    private TextView mAngTextView;
    private TextView mMAgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

        //setContentView(R.layout.activity_main);
        //((TextView)findViewById(R.id.text_hello_world)).setText(helloWorld());
        //((TextView) findViewById(R.id.text_hello_world)).setText("Hello this is Paki");
        //mExampleTextView = (TextView) findViewByID(R.id.text_hello_world);


        //mExampleTextView = (TextView)findViewById(R.id.text_hello_world);
        //mExampleTextView.setText(helloWorld());


        //mExampleTextView.setText("This should work please");
        //((TextView)findViewById(R.id.text_hello_world)).setText("This should work please");

//        mAccTextView = (TextView)findViewById(R.id.tvAcc);
        mAccTextView = (TextView)findViewById(R.id.tvAcc);

        mAccTextView.setText("This is accelerartion");


        mAngTextView = (TextView)findViewById(R.id.tvAng);
        mAngTextView.setText(helloWorld());

        mMAgTextView = (TextView)findViewById(R.id.tvMag);
        mMAgTextView.setText("Hello from the other sideeeeee... magnetic field check check check 2");


    }

}

/*
    public native String HelloJNI();
    static
    {
        System.loadLibrary("HelloJNI");
    }


    static {
        System.loadLibrary("hello"); // Load native library at runtime
        // hello.dll (Windows) or libhello.so (Unixes)
    }

    // Declare a native method sayHello() that receives nothing and returns void
    private native void sayHello();

    // Test Driver
    public static void main(String[] args) {
        new MainActivity().sayHello();  // invoke the native method
    }
*/