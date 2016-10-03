package ashishrpa.session_04_assignment_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by ASHISH KUMAR on 10/3/2016.
 * This MyAdapter class is used to customize BaseAdapter for displaying Android Version images
 * Constructor requires two parameters context (Current_Context) and an ArrayList<Integer> for imagesID
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Integer> al_imageNumber;

    //CONSTRUCTOR
    protected MyAdapter(Context context1, ArrayList<Integer> al_imageNumber1){
        context = context1;
        al_imageNumber = al_imageNumber1;
    }
    @Override
    public int getCount() {
        return al_imageNumber.size();
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
        ViewHolder holder;
        //inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        inflater = LayoutInflater.from(context);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.android_logos,parent,false);
            holder = new ViewHolder();
            holder.bindView(convertView);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.imageLogo.setImageResource(al_imageNumber.get(position));
        return convertView;
    }
    public class ViewHolder{
        ImageView imageLogo;
        void bindView(View convertView){
            imageLogo = (ImageView) convertView.findViewById(R.id.image_number);
        }
    }
}
