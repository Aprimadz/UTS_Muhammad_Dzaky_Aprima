package com.example.navigationdrawer.ui.player;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentPlayerBinding;
import com.example.navigationdrawer.model.MenuItem;
import com.example.navigationdrawer.model.PlayerItem;
import com.example.navigationdrawer.ui.home.HomeAdapter;

import java.util.ArrayList;


public class PlayerFragment extends Fragment {

    private FragmentPlayerBinding binding;

    private PlayerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPlayerBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        adapter = new PlayerAdapter(getContext(),getData());
        binding.gvPlayer.setAdapter(adapter);
    }
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private ArrayList<PlayerItem> getData() {
        ArrayList<PlayerItem> data = new ArrayList<>();
        data.add(new PlayerItem("E. Haaland", R.drawable.haaland));
        data.add(new PlayerItem("Cristiano Ronaldo", R.drawable.ronaldo));
        data.add(new PlayerItem("K. Mbappe", R.drawable.mbappe));
        data.add(new PlayerItem("Lionel Messi", R.drawable.messi));

        return data;
    }


}