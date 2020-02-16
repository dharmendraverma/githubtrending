package com.example.githubtrendingproject;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class GitHubTabAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public GitHubTabAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TrendingRepoFragment.newInstance();
            case 1:
                return TrendingDeveloperFragment.newInstance();
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
