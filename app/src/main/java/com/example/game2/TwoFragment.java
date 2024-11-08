package com.example.game2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.game2.databinding.FragmentMenuBinding;
import com.example.game2.databinding.FragmentTwoBinding;


public class TwoFragment extends Fragment {

    private FragmentTwoBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTwoBinding.inflate(inflater);
        return binding.getRoot();


    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            Warrior warrior = TwoFragmentArgs.fromBundle(getArguments()).getId();

            binding.tvName.setText("Name: " + warrior.getName());
            binding.tvAge.setText("Age: " + warrior.getAge());
            binding.tvHealth.setText("Health: " + warrior.getHealth());
        }
    }
}