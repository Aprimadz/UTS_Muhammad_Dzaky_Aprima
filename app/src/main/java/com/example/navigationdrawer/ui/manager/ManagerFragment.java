package com.example.navigationdrawer.ui.manager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentManagerBinding;
import com.example.navigationdrawer.databinding.FragmentPlayerBinding;
import com.example.navigationdrawer.model.ManagerItem;
import com.example.navigationdrawer.model.PlayerItem;
import com.example.navigationdrawer.ui.player.PlayerAdapter;

import java.util.ArrayList;


public class ManagerFragment extends Fragment {
    private FragmentManagerBinding binding;
    private ManagerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentManagerBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        adapter = new ManagerAdapter(getContext(),getData());
        binding.gvManager.setAdapter(adapter);
    }
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private ArrayList<ManagerItem> getData() {
        ArrayList<ManagerItem> data = new ArrayList<>();
        data.add(new ManagerItem("Jose Mourinho", R.drawable.jose_mourinho));
        data.add(new ManagerItem("Pep Guardiola", R.drawable.pep_guardiola));
        data.add(new ManagerItem("Erik Ten Hag", R.drawable.erik_ten_hag));
        data.add(new ManagerItem("Mikel Arteta", R.drawable.mikel_arteta));

        return data;
    }
}