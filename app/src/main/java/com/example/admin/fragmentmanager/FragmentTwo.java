package com.example.admin.fragmentmanager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_second_two, container, false);
        Button button=(Button)view.findViewById(R.id.fragmenttwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentManager=getFragmentManager();
                mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.addToBackStack(null);
                FragmentThree fragobj = new FragmentThree();
                mFragmentTransaction.replace(R.id.container, fragobj).commit();
            }
        });
        return view;
    }
 /*   @Override
    public void onResume() {
        super.onResume();
        ActionBar actionBar = ((ActionBarActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("TWO Fragment");
        actionBar.setDisplayHomeAsUpEnabled(true);
     //   actionBar.setHomeButtonEnabled(true);
    }*/
}
