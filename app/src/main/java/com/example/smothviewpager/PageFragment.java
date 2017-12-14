package com.example.smothviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class PageFragment extends Fragment {
    private View rootView;
    private BannerView bannerView;
    private BannerViewpagerAdapter pagerAdapter;
    private RelativeLayout rlBanner;
    private int[] pics = new int[]{R.mipmap.banner1,R.mipmap.banner2,R.mipmap.banner3,R.mipmap.banner4};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_page,null);
        init();
        return rootView;
    }

    private void init() {
        rlBanner = (RelativeLayout) rootView.findViewById(R.id.rl_banner);
        pagerAdapter = new BannerViewpagerAdapter(getActivity(),pics);
        bannerView = new BannerView(getActivity(),pics,pagerAdapter,R.layout.customviewpager);
        rlBanner.addView(bannerView.getBannerView());
    }
}
