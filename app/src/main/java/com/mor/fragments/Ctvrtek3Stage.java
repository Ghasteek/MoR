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


public class Ctvrtek3Stage extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getActivity()).setTitle(R.string.ctvrtek3Title);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ctvrtek3_stage, container, false);


        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        String minuteS;
        if (minute <= 10) {minuteS = "0" + minute; } else { minuteS = String.valueOf(minute);}
        String time = hour + minuteS;
        int timeInt = Integer.parseInt(time);

        TextView mayan = view.findViewById(R.id.mayan);
        TextView turilli = view.findViewById(R.id.turilliLioneRhapsody);
        TextView cyhra = view.findViewById(R.id.cyhra);
        TextView delain = view.findViewById(R.id.delain);
        TextView xandria = view.findViewById(R.id.xandria);
        TextView gammaRay = view.findViewById(R.id.gammaRay);
        TextView saltatio = view.findViewById(R.id.saltatioMortis);
        TextView eluveitie = view.findViewById(R.id.eluveitie);
        TextView uriahHeep = view.findViewById(R.id.uriahHeep);
        TextView deathstars = view.findViewById(R.id.deathstars);


        if (month == 6 && day == 11) {
            if ((timeInt >= 1330) &&  (timeInt <= 1400)) {
                mayan.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1415) &&  (timeInt <= 1445)) {
                turilli.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1500) &&  (timeInt <= 1530)) {
                cyhra.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1545) &&  (timeInt <= 1615)) {
                delain.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1630) &&  (timeInt <= 1700)) {
                xandria.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1715) &&  (timeInt <= 1745)) {
                gammaRay.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1800) &&  (timeInt <= 1830)) {
                saltatio.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1845) &&  (timeInt <= 1915)) {
                eluveitie.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 1930) &&  (timeInt <= 2000)) {
                uriahHeep.setTextColor(getResources().getColor(R.color.colorRed));
            }
            else if ((timeInt >= 2200) &&  (timeInt <= 2230)) {
                deathstars.setTextColor(getResources().getColor(R.color.colorRed));
            }


            if (timeInt > 1400) {
                mayan.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1445) {
                turilli.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1530) {
                cyhra.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1615) {
                delain.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1700) {
                xandria.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1745) {
                gammaRay.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1830) {
                saltatio.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 1915) {
                eluveitie.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 2000) {
                uriahHeep.setTextColor(getResources().getColor(R.color.textDone));
            }
            if (timeInt > 2230) {
                deathstars.setTextColor(getResources().getColor(R.color.textDone));
            }
        }

       return view;
    }

}