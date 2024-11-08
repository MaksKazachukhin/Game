package com.example.game2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.game2.databinding.ActivityMainBinding;
import com.example.game2.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Warrior warrior = new Warrior("Max",18,100);

        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuFragmentDirections.ActionMenuFragmentToTwoFragment action =
                        MenuFragmentDirections.actionMenuFragmentToTwoFragment(warrior);
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}