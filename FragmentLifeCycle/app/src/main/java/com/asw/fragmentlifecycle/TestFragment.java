package com.asw.fragmentlifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class TestFragment extends Fragment {

    private void printLog(String s) {
// display a message in Log File
        Log.d("LifeCycle:", s);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        printLog("onActivityCreated Called");
        Toast.makeText(getActivity(), "onActivityCreated Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test, container, false);
        printLog("onCreateView Called");
        Toast.makeText(getActivity(), "onCreateView Called" , Toast.LENGTH_SHORT).show();
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        printLog("onViewCreated Called");
        Toast.makeText(getActivity(), "onViewCreated Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        printLog("onAttach Called");
        Toast.makeText(getActivity(), "onAttach Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog("onCreate Called");
        Toast.makeText(getActivity(), "onCreate Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        printLog("onDestroy Called");
        Toast.makeText(getActivity(), "onDestroy Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        printLog("onDestroyView Called");
        Toast.makeText(getActivity(), "onDestroyView Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        printLog("onDetach Called");
        Toast.makeText(getActivity(), "onDetach Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        printLog("onPause Called");
        Toast.makeText(getActivity(), "onPause Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        printLog("onResume Called");
        Toast.makeText(getActivity(), "onResume Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        printLog("onStart Called");
        Toast.makeText(getActivity(), "onStart Called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        printLog("onStop Called");
        Toast.makeText(getActivity(), "onStop Called" , Toast.LENGTH_SHORT).show();
    }
}
