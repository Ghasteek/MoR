package com.mor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.mor.R;
import com.mor.constants.NavigationDrawerConstants;

import java.util.Calendar;


public class Patek extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(NavigationDrawerConstants.TAG_Patek);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_patek, container, false);

        int id = (R.id.ten);

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);

        if (month == 6 && day == 12 && hour >= 3) {
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
        } else if (month == 6 && day == 13 && hour <= 2) {
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
        }


        final View targetView = view.findViewById(id);
        final ScrollView sv = view.findViewById(R.id.scrollViewId);
        sv.post(new Runnable() {
            @Override
            public void run() {
                sv.scrollTo(0, targetView.getTop());
            }
        });

        return view;
    }

}