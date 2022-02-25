package com.example.mamlaka_grill.ui.DailyMeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mamlaka_grill.databinding.FragmentDailMealyBinding;

public class DailyFragmentMeal extends Fragment {

    private FragmentDailyMealBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDailyMealBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDailyMeal;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}