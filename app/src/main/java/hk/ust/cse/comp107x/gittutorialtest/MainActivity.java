package hk.ust.cse.comp107x.gittutorialtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_MESSAGE = "log message 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test1("hello there");
    }
    int i = 9;
    int ii = 99;
    private void test1(String message){
        Log.i(LOG_MESSAGE, message);
        if(i <= ii){
            i *= ii*i;
        }
    }

}
