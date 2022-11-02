package com.droiddev26.datasaverexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        if(savedInstanceState != null) {
            textView.setText(savedInstanceState.getString("textToBundle"))
        }

        Log.d("Lifecycle method: ", "onCreate()");
        textView.append("onCreate()" + "\n");

    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle method: ", "onStart()");
        textView.append("onStart()" + "\n");
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle method: ", "onResume()");
        textView.append("onResume()" + "\n");
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle method: ", "onPause()");
        textView.append("onPause()" + "\n");
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle method: ", "onStop()");
        textView.append("onStop()" + "\n");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle method: ", "onDestroy()");
        textView.append("onDestroy()" + "\n");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle method: ", "onRestart()");
        textView.append("onRestart()" + "\n");
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d("onSaveInstanceState: ", "onSaveInstanceState()")
        textView.append("onSaveInstanceState()" + "\n")
        outState.putString("textToBundle", textView.getText().toString())
    }

}