package com.example.lexx.fragtofragcomms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Display extends Fragment {

    private TextView textView;

    public Display() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        textView = view.findViewById(R.id.display_txt);

        Bundle bundle = getArguments();
        String message = bundle.getString("message");

        textView.setText(message);

        return view;
    }

}
