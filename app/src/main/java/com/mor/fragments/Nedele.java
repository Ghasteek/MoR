package com.mor.fragments;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.mor.R;
import com.mor.constants.NavigationDrawerConstants;

import java.util.Calendar;
import java.util.Objects;


public class Nedele extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getActivity()).setTitle(NavigationDrawerConstants.TAG_Nedele);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nedele, container, false);

        int id = (R.id.ten);

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int minute = cal.get(Calendar.MINUTE);
        boolean showPointer = false;

        if (month == 6 && day == 14 && hour >=3) {
            switch (hour) {
                case 12:
                    id = (R.id.eleven);
                    break;
                case 13:
                    id = (R.id.twelve);
                    break;
                case 14:
                    id = (R.id.thirteen);
                    break;
                case 15:
                    id = (R.id.fourteen);
                    break;
                case 16:
                    id = (R.id.fifteen);
                    break;
                case 17:
                    id = (R.id.sixteen);
                    break;
                case 18:
                    id = (R.id.seventeen);
                    break;
                case 19:
                    id = (R.id.eighteen);
                    break;
                case 20:
                    id = (R.id.nineteen);
                    break;
                case 21:
                    id = (R.id.twenty);
                    break;
                case 22:
                    id = (R.id.twentyone);
                    break;
                case 23:
                    id = (R.id.twentytwo);
                    break;
                default:
                    id = (R.id.ten);
            }
            showPointer = true;
        } else if (month == 6 && day == 15 && hour <= 2) {
            switch (hour) {
                case 0:
                    id = (R.id.twentythree);
                    break;
                case 1:
                    id = (R.id.zero);
                    break;
                case 2:
                    id = (R.id.one);
                    break;
                default:
                    id = (R.id.ten);
            }
            hour = hour + 24;
            showPointer = true;
        }

        final View targetView = view.findViewById(id);
        final ScrollView sv = view.findViewById(R.id.scrollViewId);
        final View pointer = view.findViewById(R.id.pointerNedeleId);

        if (showPointer) {
            int pointerPosition = ((hour - 10) * 120) + (minute * 2) + 43 - 4;

            Resources r = Objects.requireNonNull(getActivity()).getResources();
            int px = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    pointerPosition,
                    r.getDisplayMetrics()
            );

            ObjectAnimator animY = ObjectAnimator.ofFloat(pointer, "y", px);
            AnimatorSet animSetXY = new AnimatorSet();
            animSetXY.playTogether(animY);
            animSetXY.start();
        } else {pointer.setVisibility(View.INVISIBLE);}

        sv.post(new Runnable() {
            @Override
            public void run() {
                sv.scrollTo(0, targetView.getTop());

            }
        });
        return view;
    }

}