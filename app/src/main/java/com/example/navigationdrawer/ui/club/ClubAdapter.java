package com.example.navigationdrawer.ui.club;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationdrawer.DetailActivity;
import com.example.navigationdrawer.R;
import com.example.navigationdrawer.model.ClubItem;

import java.util.ArrayList;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder>{

    public ArrayList<ClubItem> list;
    private Context context;

    public ClubAdapter(ArrayList<ClubItem> list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClubItem item = list.get(position);
        holder.tvNama.setText(item.getTvNamaClub());
        holder.tvJuara.setText(String.valueOf(item.getTvJuara()));
        holder.ivLogo.setImageResource(item.getImgClub());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("logo",item.getImgClub());
            intent.putExtra("nama",item.getTvNamaClub());
            intent.putExtra("detail",item.getDetailTeam());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama,tvJuara,tvDetail;

        private ImageView ivLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvJuara = itemView.findViewById(R.id.tv_juara);
            tvDetail = itemView.findViewById(R.id.tvDetail);
            ivLogo = itemView.findViewById(R.id.iv_club);
        }
    }
}
