package com.example.admin.fragmentmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {

  public FragmentThree() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_second_three, container, false);
    Button button = (Button) view.findViewById(R.id.thrid);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        // getActivity().onBackPressed();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
          fm.popBackStack();
          getActivity().onBackPressed();
        }
      }
    });
    return view;
  }
}
