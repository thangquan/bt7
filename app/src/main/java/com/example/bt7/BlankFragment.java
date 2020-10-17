package com.example.bt7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class BlankFragment extends Fragment {
    ListView lvProfile;
    ArrayList<pro> arrayProfile;
    ProfileAdapter adapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
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
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_blank, container, false);
        lvProfile= (ListView) root.findViewById(R.id.lvProfile);
        arrayProfile = new ArrayList<>();
        arrayProfile.add(new pro("Java","Java là một ngôn ngữ lập lập trình, được phát triển bởi Sun Microsystem vào năm 1995, " +
                "là ngôn ngữ kế thừa trực tiếp từ C/C++ và là một ngôn ngữ lập trình hướng đối tượng.",R.drawable.h_java));
        arrayProfile.add(new pro("Python","Python là một ngôn ngữ lập trình thông dịch (interpreted), hướng đối tượng (object-oriented), " +
                "và là một ngôn ngữ bậc cao (high-level)  ngữ nghĩa động (dynamic semantics)",R.drawable.python));
        arrayProfile.add(new pro("NodeJS","NodeJS là một môi trường chạy JavaScript ( JavaScript Runtime Environment) bên ngoài trình duyệt. " +
                "NodeJS cũng bao gồm các thành phần thư viện khác để nó có thể hoạt động như một Web Application Server.",R.drawable.nodejs));
        arrayProfile.add(new pro("ReactJS","React (Hay ReactJS, React.js) là một thư viện Javascript mã " +
                "nguồn mở để xây dựng các thành phần giao diện có thể tái sử dụng.",R.drawable.react));
        arrayProfile.add(new pro("Oracle APEX","Oracle Application Express (Oracle APEX), trước đây gọi là HTML DB, " +
                "là một công cụ phát triển ứng dụng web nhanh chóng cho các cơ sở dữ liệu Oracle.",R.drawable.orc));
        adapter= new ProfileAdapter(this.getActivity(),R.layout.lv_item, arrayProfile);
        lvProfile.setAdapter(adapter);
        return root;

    }
}
