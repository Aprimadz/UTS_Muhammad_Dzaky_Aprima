package com.example.navigationdrawer.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.model.MenuItem;

import java.util.ArrayList;

public class HomeAdapter extends ArrayAdapter<MenuItem> {

    public HomeAdapter(@NonNull Context context, ArrayList<MenuItem> courseModelArrayList){
        super(context,0,courseModelArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if (listItemView ==  null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.home_item,parent,false);
        }

        MenuItem courseModel = getItem(position);
        TextView courseTv = listItemView.findViewById(R.id.tv_menu);
        ImageView courseIv = listItemView.findViewById(R.id.iv_menu);


        courseTv.setText(courseModel.getTxtMenu());
        courseIv.setImageResource(courseModel.getImgMenu());
        return listItemView;
    }
}
