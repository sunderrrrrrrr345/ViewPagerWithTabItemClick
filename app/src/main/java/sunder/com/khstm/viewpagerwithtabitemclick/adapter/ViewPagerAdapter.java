package sunder.com.khstm.viewpagerwithtabitemclick.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import sunder.com.khstm.viewpagerwithtabitemclick.fragment.HomeFragment;
import sunder.com.khstm.viewpagerwithtabitemclick.fragment.LogoutFragment;
import sunder.com.khstm.viewpagerwithtabitemclick.fragment.ProfileFragment;
import sunder.com.khstm.viewpagerwithtabitemclick.fragment.SettingsFragment;

/**
 * Created by Admin on 10/16/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private static int TAB_COUNT = 4;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return ProfileFragment.newInstance();
            case 2:
                return SettingsFragment.newInstance();
            case 3:
                return LogoutFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

   /* @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return HomeFragment.TITLE;

            case 1:
                return ProfileFragment.TITLE;

        }
        return super.getPageTitle(position);
    }*/
}
