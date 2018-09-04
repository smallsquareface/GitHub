package com.qk.fragment_detail;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LifeCycle_Fragment extends Fragment {
    TextView mTextView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mTextView = getActivity().findViewById(R.id.lifecycle_txt);
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onStart() {
        super.onStart();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onResume() {
        super.onResume();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onStop() {
        super.onStop();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        String method = new Exception().getStackTrace()[0].getMethodName();
        Log.d("Jerry Qin", "" + method);
        if (mTextView != null)
            mTextView.setText(String.format("%s\n%s", mTextView.getText(), method));
    }
}
