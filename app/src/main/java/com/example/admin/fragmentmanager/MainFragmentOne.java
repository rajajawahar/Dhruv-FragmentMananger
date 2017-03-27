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
public class MainFragmentOne extends Fragment {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    public MainFragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main_one, container, false);
        Button btm=(Button)view.findViewById(R.id.click);
        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentManager=getFragmentManager();
                mFragmentTransaction=mFragmentManager.beginTransaction();
                MainFragmentTwo fragobj = new MainFragmentTwo();
                mFragmentTransaction.replace(R.id.container, fragobj).commit();
            }
        });

        return view;
    }

}
