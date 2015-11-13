package thaisavecost.pravate.butraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;
import static thaisavecost.pravate.butraffic.R.id.textView2;

/**
 * Created by student on 11/12/2015.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] titleStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //Setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);

        //Setup Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);

        return objView1;
    }
}   // Main Class
