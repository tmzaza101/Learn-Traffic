package aligns.sapphaya.blackchaos.alerttraffic;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tum_i_000 on 4/3/2016.
 */
public class myAdapter extends BaseAdapter {
    //valiable
    private Context context;
    private String[] titleStrings, descripttionStrings;
    private int[] iconInts;

    public myAdapter(Context context, String[] titleStrings, String[] descripttionStrings, int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.descripttionStrings = descripttionStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return iconInts.length;//ตัวนับ image ใน folder ว่ามีเท่าไร เพื่อที่จะให้ Dynamic ในการทำงาน
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);//openservice inflater
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //for TextView
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView descTextView = (TextView) view1.findViewById(R.id.textView3);
        descTextView.setText(descripttionStrings[i]);

        // for Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        return view1;
    }
}// main Class
