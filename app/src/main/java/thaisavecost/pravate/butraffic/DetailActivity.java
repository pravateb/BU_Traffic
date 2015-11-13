package thaisavecost.pravate.butraffic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static thaisavecost.pravate.butraffic.R.id.imageView2;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();

        // Receive Value from Intent
        receiveFromIntent();

    }  // Main Method

    private void receiveFromIntent() {

        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01); // 01 เป็นค่า Default กรณีรับค่าไม่ได้
        trafficImageView.setImageResource(intImage);

        String[] strDetail = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(strDetail[intIndex]);

    }

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView3);
        detailTextView = (TextView) findViewById(R.id.textView4);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }

}  // Main Class
