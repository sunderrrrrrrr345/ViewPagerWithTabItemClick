package sunder.com.khstm.viewpagerwithtabitemclick.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import sunder.com.khstm.viewpagerwithtabitemclick.MainActivity;
import sunder.com.khstm.viewpagerwithtabitemclick.R;


public class HomeFragment extends Fragment {
    public static final String TITLE = "Home";

    public static HomeFragment newInstance() {

        return new HomeFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, null);
        Hello(view);
        return view;
    }

    public  void Hello(View view) {

        TextView text= (TextView) view.findViewById(R.id.textView);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ((MainActivity)getActivity()).setCurrentItem (2, true);
              //  ((MainActivity)getActivity()).mViewPager.setCurrentItem(1);
                ((MainActivity)getActivity()).setCurrentItem(1,true);
            }
        });

    }


}
