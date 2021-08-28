package com.example.convert_er;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Units extends Fragment implements View.OnClickListener
{
    public CardView lengthcard,areacard,tempcard,speedcard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_units, container, false);
    }


    @Override
    public void onClick(View view) {

    }
}