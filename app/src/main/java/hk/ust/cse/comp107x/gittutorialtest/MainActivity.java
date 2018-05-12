package hk.ust.cse.comp107x.gittutorialtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_MESSAGE = "log message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test1("hello there");
    }

    private void test1(String message){
        Log.i(LOG_MESSAGE, message);
    }

}
