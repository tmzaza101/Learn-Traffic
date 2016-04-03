package aligns.sapphaya.blackchaos.alerttraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //statement
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget คือการผูกความสัมพันธ์ของตัวแปร กับ widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์ click about me
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                mediaPlayer.start();

                //set url web wiew
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/SkZXDboDqhk"));
                startActivity(intent);
            } //onclick
        });

        //set, create ListView
        //การกำหนด Value ให้ตัวแปร Array
        //Type 1
        final int[] iconInts = {R.drawable.traffic_01,
                R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07,
                R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13,
                R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19,
                R.drawable.traffic_20};

        //Type 2
        final String[] titleString = new String[20];
        titleString[0] = "หัวข้อ 1";
        titleString[1] = "หัวข้อ 2";
        titleString[2] = "หัวข้อ 3";
        titleString[3] = "หัวข้อ 4";
        titleString[4] = "หัวข้อ 5";
        titleString[5] = "หัวข้อ 6";
        titleString[6] = "หัวข้อ 7";
        titleString[7] = "หัวข้อ 8";
        titleString[8] = "หัวข้อ 9";
        titleString[9] = "หัวข้อ 10";
        titleString[10] = "หัวข้อ 11";
        titleString[11] = "หัวข้อ 12";
        titleString[12] = "หัวข้อ 13";
        titleString[13] = "หัวข้อ 14";
        titleString[14] = "หัวข้อ 15";
        titleString[15] = "หัวข้อ 16";
        titleString[16] = "หัวข้อ 17";
        titleString[17] = "หัวข้อ 18";
        titleString[18] = "หัวข้อ 19";
        titleString[19] = "หัวข้อ 20";

        //type 3
        final String[] descStrings = getResources().getStringArray(R.array.description);

        // Create List view
        myAdapter myAdapter = new myAdapter(this,titleString, descStrings, iconInts);
        trafficListView.setAdapter(myAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, ShowDetail.class);//ย้ายจาก Main ไป ยัง Detail
                intent.putExtra("Title", titleString[position]);
                intent.putExtra("Icon", iconInts[position]);
                intent.putExtra("Index", position);
                startActivity(intent);

            }// item click
        });
    }//main mathod

}//main Class
