package com.example.navigationdrawer.ui.player;

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
import com.example.navigationdrawer.model.PlayerItem;

import java.util.ArrayList;

public class PlayerAdapter  extends ArrayAdapter<PlayerItem> {
    public PlayerAdapter(@NonNull Context context, ArrayList<PlayerItem> courseModelArrayList){
        super(context,0,courseModelArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if (listItemView ==  null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.home_item,parent,false);
        }

        PlayerItem courseModel = getItem(position);
        TextView courseTv = listItemView.findViewById(R.id.tv_menu);
        ImageView courseIv = listItemView.findViewById(R.id.iv_menu);


        courseTv.setText(courseModel.getNamePlayer());
        courseIv.setImageResource(courseModel.getImgPlayer());
        return listItemView;
    }
}
