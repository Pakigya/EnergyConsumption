package com.conrartweller.energy;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

/*public class MainActivity extends Activity{

*/
public class MainActivity extends AppCompatActivity {

    public native String helloWorld();
    static {
        System.loadLibrary("helloworld");
    }

    private TextView mExampleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //((TextView)findViewById(R.id.text_hello_world)).setText(helloWorld());
        //((TextView) findViewById(R.id.text_hello_world)).setText("Hello this is Paki");
        //mExampleTextView = (TextView) findViewByID(R.id.text_hello_world);
        mExampleTextView = (TextView)findViewById(R.id.text_hello_world);
        mExampleTextView.setText(helloWorld());
        //mExampleTextView.setText("This should work please");
        //((TextView)findViewById(R.id.text_hello_world)).setText("This should work please");

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