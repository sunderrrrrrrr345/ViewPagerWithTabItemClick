package sunder.com.khstm.viewpagerwithtabitemclick.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sunder.com.khstm.viewpagerwithtabitemclick.MainActivity;
import sunder.com.khstm.viewpagerwithtabitemclick.R;


public class LogoutFragment extends Fragment {
    public static final String TITLE = "Logout";

    public static LogoutFragment newInstance() {

        return new LogoutFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_logout, null);
        Hello(view);
        return view;
    }

    public  void Hello(View view) {

        TextView back= (TextView) view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).NavigationClick();
            }
        });
    }


}
