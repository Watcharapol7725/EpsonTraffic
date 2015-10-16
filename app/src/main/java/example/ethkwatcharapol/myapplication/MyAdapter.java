package example.ethkwatcharapol.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ETHKWATCHARAPOL on 10/16/2015.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;

    public MyAdapter(Context objContext, int[] iconInts, String[] title1String, String[] title2String) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.title1String = title1String;
        this.title2String = title2String;
    }

    private int[] iconInts;
    private  String [] title1String, title2String;


    @Override
    public int getCount() {
        return title1String.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, viewGroup,false);

       //Setup For ICON
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvicon);
        iconImageView.setImageResource(iconInts[i]);

        //Setup For Title1
        TextView title1TextView = (TextView) objView1.findViewById(R.id.txtTitle1);
        title1TextView.setText(title1String[i]);

        //Setup For Title2
        TextView title2Textview = (TextView) objView1.findViewById(R.id.txtTitle2);
        title2Textview.setText(title2String[i]);



        return objView1;
    }
} // Main Class
