package com.techwenlearn.urbanclapclone.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.techwenlearn.urbanclapclone.R;


public class MyBookingFragment extends Fragment {


    public MyBookingFragment() {
        // Required empty public constructor
    }

    Button bookNowButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_booking, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        bookNowButton=view.findViewById(R.id.booknow_button);
        bookNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Open Book Service Fragment", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
