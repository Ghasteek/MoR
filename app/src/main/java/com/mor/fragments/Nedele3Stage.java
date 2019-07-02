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


public class Nedele3Stage extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getActivity()).setTitle(R.string.nedele3Title);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nedele3_stage, container, false);


        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        String minuteS;
        if (minute <= 10) {minuteS = "0" + minute; } else { minuteS = String.valueOf(minute);}
        String time = hour + minuteS;
        int timeInt = Integer.parseInt(time);

        TextView symfobia = view.findViewById(R.id.symfobia);
        TextView serenity = view.findViewById(R.id.serenity);
        TextView seriousBlack = view.findViewById(R.id.seriousBlack);
        TextView citron = view.findViewById(R.id.citron);
        TextView steelPanther = view.findViewById(R.id.steelPanther);
        TextView evergrey = view.findViewById(R.id.evergrey);
        TextView darkTranquillity = view.findViewById(R.id.darkTranquillity);
        TextView primalFear = view.findViewById(R.id.primalFear);


        if (month == 6 && day == 14) {
            if ((timeInt >= 1200) &&  (timeInt <= 1230)) {
                symfobia.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1245) &&  (timeInt <= 1315)) {
                serenity.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1400) &&  (timeInt <= 1430)) {
                seriousBlack.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1445) &&  (timeInt <= 1515)) {
                citron.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1600) &&  (timeInt <= 1630)) {
                steelPanther.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1645) &&  (timeInt <= 1715)) {
                evergrey.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1745) &&  (timeInt <= 1815)) {
                darkTranquillity.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1900) &&  (timeInt <= 1930)) {
                primalFear.setTextColor(getResources().getColor(R.color.colorRed));
            }



            if (timeInt > 1230) {
                symfobia.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1315) {
                serenity.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1430) {
                seriousBlack.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1515) {
                citron.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1630) {
                steelPanther.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1715) {
                evergrey.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1815) {
                darkTranquillity.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1930) {
                primalFear.setTextColor(getResources().getColor(R.color.textDone));
            }
        }


        return view;
    }

}