package com.example.bt7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment1 extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
    }
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ListView lvmonhoc;
        ArrayList<String> dsmon;
        // Inflate the layout for this fragment

        View root= inflater.inflate(R.layout.fragment_1, container, false);
        lvmonhoc = (ListView)root.findViewById(R.id.lvMonHoc);
        dsmon = new ArrayList<>();
        dsmon.add("Khóc Một Mình");
        dsmon.add("Thương");
        dsmon.add("Từng là tất cả");
        dsmon.add("Cạn cả nước mắt");
        dsmon.add("Anh là của em ");
        dsmon.add("Người lạ ơi!");

        ArrayAdapter adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_1,dsmon);
        lvmonhoc.setAdapter(adapter);
        return root;

    }
}
