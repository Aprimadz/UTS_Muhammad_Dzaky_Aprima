package com.example.navigationdrawer.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentHomeBinding;
import com.example.navigationdrawer.model.MenuItem;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeAdapter adapter;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        adapter = new HomeAdapter(getContext(),getData());
        binding.gvGaleri.setAdapter(adapter);
    }
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private ArrayList<MenuItem> getData() {
        ArrayList<MenuItem> data = new ArrayList<>();
        data.add(new MenuItem("Player", R.drawable.soccer_player));
        data.add(new MenuItem("Manager",R.drawable.manager));
        data.add(new MenuItem("Club",R.drawable.football_club));
        data.add(new MenuItem("About Us",R.drawable.info));
        return data;
    }


}