package cl.awakelabs.ejerciciorecycler6;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cl.awakelabs.ejerciciorecycler6.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {

    FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }


}