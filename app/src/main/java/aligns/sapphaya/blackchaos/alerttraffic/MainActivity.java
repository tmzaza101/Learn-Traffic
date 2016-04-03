package aligns.sapphaya.blackchaos.alerttraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }//main mathod


}//main Class
