package com.example.diary_project.ui.home2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.diary_project.databinding.FragmentHome2Binding;

public class Home2Fragment extends Fragment {

    private FragmentHome2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Home2ViewModel home2ViewModel =
                new ViewModelProvider(this).get(Home2ViewModel.class);

        binding = FragmentHome2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome2;
        home2ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}