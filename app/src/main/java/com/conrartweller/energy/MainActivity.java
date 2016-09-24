package com.conrartweller.energy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.conrartweller.energy.SpatialExample.*;

import com.phidgets.PhidgetException;
import com.phidgets.SpatialPhidget;
import com.phidgets.event.AttachEvent;
import com.phidgets.event.AttachListener;

import org.w3c.dom.Text;

/*public class MainActivity extends Activity{

*/
public class MainActivity extends AppCompatActivity {

    public native String .helloWorld();
    static {
        System.loadLibrary("helloworld");
    }

    private TextView mExampleTextView;
    private TextView mAccTextView;
    private TextView mAngTextView;
    private TextView mMAgTextView;
    private TextView mErrorTextView;

    SpatialPhidget spatial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

        mAccTextView = (TextView)findViewById(R.id.tvAcc);

        mAccTextView.setText("This is acceleration");

        mMAgTextView = (TextView)findViewById(R.id.tvMag);
        mMAgTextView.setText("Magnetic");

        mAngTextView = (TextView)findViewById(R.id.tvAng);
        mAngTextView.setText(helloWorld()+" Angular");


        mErrorTextView = (TextView)findViewById(R.id.tvError);
        mErrorTextView.setText("Here it shows the Error");

        final Button button = (Button) findViewById(R.id.btnStart);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*
                // Perform action on click
                try {
                    spatial = new SpatialPhidget();//spatial is a new object
                    //mMAgTextView.setText("it was trying this");
                }catch(Exception e) {
                    //mMAgTextView.setText("Magnetic was sent to exception");
                }*/

                Intent intent = new Intent(MainActivity.this, wifiDemo.class);
                startActivity(intent);
            }
        });




        /*
        spatial.addAttachListener(new AttachListener() {
            public void attached(AttachEvent ae){
                System.out.println("attachment of " + ae);//will try to find the attached spatical
                try
                {
                    ((SpatialPhidget)ae.getSource()).setDataRate(496); //set data rate to 496ms
                }
                catch (PhidgetException pe)
                {
                    mErrorTextView.setText("Problem setting data rate!");
                }
            }
        });
        */

        //setContentView(R.layout.activity_main);
        //((TextView)findViewById(R.id.text_hello_world)).setText(helloWorld());
        //((TextView) findViewById(R.id.text_hello_world)).setText("Hello this is Paki");
        //mExampleTextView = (TextView) findViewByID(R.id.text_hello_world);


        //mExampleTextView = (TextView)findViewById(R.id.text_hello_world);
        //mExampleTextView.setText(helloWorld());


        //mExampleTextView.setText("This should work please");
        //((TextView)findViewById(R.id.text_hello_world)).setText("This should work please");

//        mAccTextView = (TextView)findViewById(R.id.tvAcc);


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