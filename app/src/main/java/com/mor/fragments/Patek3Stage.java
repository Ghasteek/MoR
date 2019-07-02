package com.mor.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mor.R;
import java.util.Calendar;
import java.util.Objects;


public class Patek3Stage extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getActivity()).setTitle(R.string.patek3Title);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_patek3_stage, container, false);


        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        String minuteS;
        if (minute <= 10) {minuteS = "0" + minute; } else { minuteS = String.valueOf(minute);}
        String time = hour + minuteS;
        int timeInt = Integer.parseInt(time);

        TextView rhemorha = view.findViewById(R.id.rhemorha);
        TextView rats = view.findViewById(R.id.ratsAndWolves);
        TextView twilight = view.findViewById(R.id.twilightForce);
        TextView hardline = view.findViewById(R.id.hardline);
        TextView battlebeast = view.findViewById(R.id.battleBeast);
        TextView equilibrium = view.findViewById(R.id.equilibrium);
        TextView amaranthe = view.findViewById(R.id.amaranthe);

        if (month == 6 && day == 12) {
            if ((timeInt >= 1245) &&  (timeInt <= 1315)) {
                rhemorha.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1500) &&  (timeInt <= 1530)) {
                rats.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1545) &&  (timeInt <= 1615)) {
                twilight.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1715) &&  (timeInt <= 1745)) {
                hardline.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1845) &&  (timeInt <= 1915)) {
                battlebeast.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 2015) &&  (timeInt <= 2045)) {
                equilibrium.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 2100) &&  (timeInt <= 2130)) {
                amaranthe.setTextColor(getResources().getColor(R.color.colorRed));
            }


            if (timeInt > 1315) {
                rhemorha.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1530) {
                rats.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1615) {
                twilight.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1745) {
                hardline.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1915) {
                battlebeast.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 2045) {
                equilibrium.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 2130) {
                amaranthe.setTextColor(getResources().getColor(R.color.textDone));
            }
        }

        return view;
    }

}