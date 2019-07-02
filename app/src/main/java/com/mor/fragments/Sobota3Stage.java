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


public class Sobota3Stage extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getActivity()).setTitle(R.string.sobota3Title);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sobota3_stage, container, false);


        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        String minuteS;
        if (minute <= 10) {minuteS = "0" + minute; } else { minuteS = String.valueOf(minute);}
        String time = hour + minuteS;
        int timeInt = Integer.parseInt(time);

        TextView darkGamballe = view.findViewById(R.id.darkGamballe);
        TextView nightFlightOrchestra = view.findViewById(R.id.nightFlightOrchestra);
        TextView legionOfThEeDamned = view.findViewById(R.id.legionOfThEeDamned);
        TextView triStateCorner = view.findViewById(R.id.triStateCorner);
        TextView followTheCipher = view.findViewById(R.id.followTheCipher);
        TextView rage = view.findViewById(R.id.rage);
        TextView brainstorm = view.findViewById(R.id.brainstorm);
        TextView withinTemptation = view.findViewById(R.id.withinTemptation);
        TextView tarja = view.findViewById(R.id.tarja);
        TextView firewind = view.findViewById(R.id.firewind);
        TextView soulfly = view.findViewById(R.id.soulfly);

        if (month == 6 && day == 13) {
            if ((timeInt >= 1200) &&  (timeInt <= 1230)) {
                darkGamballe.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1245) &&  (timeInt <= 1315)) {
                nightFlightOrchestra.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1330) &&  (timeInt <= 1400)) {
                legionOfThEeDamned.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1415) &&  (timeInt <= 1445)) {
                triStateCorner.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1500) &&  (timeInt <= 1530)) {
                followTheCipher.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1545) &&  (timeInt <= 1615)) {
                rage.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1630) &&  (timeInt <= 1700)) {
                brainstorm.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1715) &&  (timeInt <= 1745)) {
                withinTemptation.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1800) &&  (timeInt <= 1830)) {
                tarja.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1845) &&  (timeInt <= 1915)) {
                firewind.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 2045) &&  (timeInt <= 2115)) {
                soulfly.setTextColor(getResources().getColor(R.color.colorRed));
            }


            if (timeInt > 1230) {
                darkGamballe.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1315) {
                nightFlightOrchestra.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1400) {
                legionOfThEeDamned.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1445) {
                triStateCorner.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1530) {
                followTheCipher.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1615) {
                rage.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1700) {
                brainstorm.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1745) {
                withinTemptation.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1830) {
                tarja.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1915) {
                firewind.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 2115) {
                soulfly.setTextColor(getResources().getColor(R.color.textDone));
            }
        }

        return view;
    }

}