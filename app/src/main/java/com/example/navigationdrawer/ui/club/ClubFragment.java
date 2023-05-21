package com.example.navigationdrawer.ui.club;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentClubBinding;
import com.example.navigationdrawer.model.ClubItem;

import java.util.ArrayList;


public class ClubFragment extends Fragment {

    private FragmentClubBinding binding;
    private ClubAdapter adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentClubBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ClubAdapter(getData(),getContext());
        binding.rvClub.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @NonNull
    private ArrayList<ClubItem> getData() {
        ArrayList<ClubItem> data = new ArrayList<>();
        data.add(
                new ClubItem("Chelsea",
                        "Chelsea merupakan team liga inggris dengan 2 kali champions",
                        R.drawable.chelsea,2)
        );
        data.add(
                new ClubItem("Real Madrid",
                        "Real Madrid merupakan team liga spanyol dengan 13 kali champions",
                        R.drawable.realmadrid,13)
        );
        data.add(
                new ClubItem("Barcelona",
                        "Barcelona merupakan team liga spanyol dengan 5 kali champions",
                        R.drawable.barcelona,6)
        );
        data.add(
                new ClubItem("Manchester United",
                        "Manchester United merupakan team liga spanyol dengan 3 kali champions",
                        R.drawable.manchesterunited,3)
        );
        return data;
    }
}