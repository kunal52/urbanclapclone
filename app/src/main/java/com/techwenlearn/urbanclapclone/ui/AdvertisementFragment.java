package com.techwenlearn.urbanclapclone.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techwenlearn.urbanclapclone.R;


public class AdvertisementFragment extends Fragment {

    public static final String TAG=AdvertisementFragment.class.getSimpleName();

    public static AdvertisementFragment getInstance(String url)
    {
        AdvertisementFragment advertisementFragment=new AdvertisementFragment();
        Bundle bundle=new Bundle();
        bundle.putString("url",url);
        advertisementFragment.setArguments(bundle);
        return advertisementFragment;
    }

    public AdvertisementFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "onCreateView: Advertisement Fragment");
        return inflater.inflate(R.layout.fragment_advertisement, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      //  ImageView advertisementImageview= view.findViewById(R.id.advertisement_imageview);
        //advertisementImageview.setImageDrawable(getActivity().getResources().getDrawable(R.drawable.ic_launcher_background));
    }
}
