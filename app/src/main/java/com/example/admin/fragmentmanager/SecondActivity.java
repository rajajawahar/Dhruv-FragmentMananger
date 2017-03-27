package com.example.admin.fragmentmanager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SecondActivity extends AppCompatActivity {
  FragmentManager mFragmentManager;
  FragmentTransaction mFragmentTransaction;
  FragmentOne fragobj;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    mFragmentManager = getSupportFragmentManager();
    mFragmentTransaction = mFragmentManager.beginTransaction();
    FragmentOne fragobj = new FragmentOne();
    mFragmentTransaction.replace(R.id.container, fragobj).commit();
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      onBackPressed();
    }
    return super.onOptionsItemSelected(item);
  }

  @Override public void onBackPressed() {
    finish();
  }
}
