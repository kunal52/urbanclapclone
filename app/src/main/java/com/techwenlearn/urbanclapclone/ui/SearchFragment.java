package com.techwenlearn.urbanclapclone.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.techwenlearn.urbanclapclone.Adapter.AdvertisementViewpager;
import com.techwenlearn.urbanclapclone.R;
import com.techwenlearn.urbanclapclone.util.UtilityClass;


public class SearchFragment extends Fragment implements View.OnClickListener {

    LinearLayout linearLayout;
    ViewPager viewPager;
    String []productName=new String[]{"Health At Home","Home Tutors","Party Decorations"};
    String []productSub=new String[]{"Top-Rated Trainers At Home","For Class V to X","Birthday & Aniversaries"};
    EditText searchEdittext;
    public SearchFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager=view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new AdvertisementViewpager(getActivity().getSupportFragmentManager()));
        linearLayout=view.findViewById(R.id.root_view_search);
        searchEdittext=view.findViewById(R.id.search_edittext);
        searchEdittext.setOnClickListener(this);

        int initialPosition=2;
        int margin=UtilityClass.toPixels(8,getActivity().getResources().getDisplayMetrics());
        for (int i=0;i<productName.length;i++)
        {
            View view1=getActivity().getLayoutInflater().inflate(R.layout.product_list_layout,null);
            TextView pT=view1.findViewById(R.id.product_title);
            TextView pST=view1.findViewById(R.id.product_subtitle);
            pT.setText(productName[i]);
            pST.setText(productSub[i]);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,margin,0,margin);
            linearLayout.addView(view1,initialPosition+i,layoutParams);


        }


    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getActivity(), "Open Search Fragment", Toast.LENGTH_SHORT).show();
    }
}
