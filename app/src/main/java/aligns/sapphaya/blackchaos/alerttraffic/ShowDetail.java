package aligns.sapphaya.blackchaos.alerttraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    //ImageView trafficImageView; เหมือนกับ
    private ImageView trafficImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //bind Widget
        titleTextView = (TextView) findViewById(R.id.textView4);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        detailTextView = (TextView) findViewById(R.id.textView5);

        //Receive and show
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);
        int intImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index",0);
        String[] detailStrings = getResources().getStringArray(R.array.detail);

        detailTextView.setText(detailStrings[intIndex]);


    }//main method
}// main class
