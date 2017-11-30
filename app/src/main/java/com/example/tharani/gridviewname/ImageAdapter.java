package com.example.tharani.gridviewname;
/*import is libraries imported for writing the code*/
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends BaseAdapter {
    private  Activity context;
     /*An activity represents a single screen with a user interface just like window or frame
    Context allows access to application-specific resources and classes
    calls for application-level operations such as launching activities, broadcasting and receiving intents
    */

    public ImageAdapter(Activity context) {
        this.context=context;
    }
    @Override
    public int getCount() {
        // getCount returns the numbers of rows in the cursor.
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        //getItem get  the data item associated with the specified position in the data set.
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    //getView gets the type of view
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null);
        {
            //Layout Inflater is used to get the View object which you define in a layout xml
            LayoutInflater layoutInflater=context.getLayoutInflater();
            view=layoutInflater.inflate(R.layout.gridview_activity,null);
             /*Here we can do changes to the View*/
        }
        //R is a resource and it is auto generate file
        ImageView imageView= view.findViewById(R.id.imageView);
        TextView textView= view.findViewById(R.id.textView);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //center crop scale type is used in android to Scale the image uniformly
        imageView.setImageResource(mThumbIds[i]);
       // Sets a drawable as the content of this ImageView
        textView.setText(titles[i]);

        return view;
    }
    private Integer[] mThumbIds= {

            R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lollipop
            //these are images which are uploaded in drawable folder

    };
    /*string is a sequence of characters*
            by using string giving titles to the images */
    private String[]  titles=  {
            "GingerBread", "Honeycomb", "IceCream", "JellyBean", "KitKat", "Lollipop"

    };
}
