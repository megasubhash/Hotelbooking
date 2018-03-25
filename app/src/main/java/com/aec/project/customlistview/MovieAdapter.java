package com.aec.project.customlistview;

/**
 * Created by Rocky on 3/24/2018.
 */

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private List<Movie> moviesList = new ArrayList<>();

    public MovieAdapter(@NonNull Context context, ArrayList<Movie> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Movie currentMovie = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.himage);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.hname);
        name.setText(currentMovie.getmName());

        TextView address = (TextView) listItem.findViewById(R.id.haddress);
        address.setText(currentMovie.getmAddress());

        TextView price = (TextView) listItem.findViewById(R.id.hprice);
        price.setText(currentMovie.getmPrice());

        return listItem;
    }
}