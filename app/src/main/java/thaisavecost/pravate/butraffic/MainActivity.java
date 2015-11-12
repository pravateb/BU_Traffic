package thaisavecost.pravate.butraffic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static thaisavecost.pravate.butraffic.R.id.listView;

public class MainActivity extends AppCompatActivity {

    // พื้นที่ประกาศตัวแปล คือประกาศใน Class แต่ อยู่นอก Method เสมอ
    // Explicit แปลว่าการประกาศตัวแปล
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget ผูก Widget
        bindWidget();

        //Button Controller
        buttonController();

    }   // Main Method จบด้วย ; เสมอ และ ต้องมี onCreate เสมอ

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog);
                buttonPlayer.start();

                //Intent to WebView
                

            }  // event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}   // Main Class นี่คือคลาสหลัก
