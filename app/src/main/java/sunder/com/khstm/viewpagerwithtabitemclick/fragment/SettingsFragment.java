package sunder.com.khstm.viewpagerwithtabitemclick.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sunder.com.khstm.viewpagerwithtabitemclick.MainActivity;
import sunder.com.khstm.viewpagerwithtabitemclick.R;


public class SettingsFragment extends Fragment {
    public static final String TITLE = "Setting";

    public static SettingsFragment newInstance() {

        return new SettingsFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_settings, null);
        Hello(view);
        return view;
    }

    public  void Hello(View view) {

        TextView forward= (TextView) view.findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setCurrentItem(3,true);
            }
        });


   TextView back= (TextView) view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).NavigationClick();
            }
        });
    }


}
