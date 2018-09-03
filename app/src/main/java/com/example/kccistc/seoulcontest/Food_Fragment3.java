package com.example.kccistc.seoulcontest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Food_Fragment3 extends Fragment {

    View v;

    public Food_Fragment3() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup vg, @Nullable Bundle bundle) {
        v = inflater.inflate(R.layout.food_fragment1, vg, false);

        ListView listView = v.findViewById(R.id.list_view);

        ArrayList<ShopVO> list = new ArrayList<>();

        ShopVO vo1 = new ShopVO(R.drawable.a, "한방왕족발", "도마에 가지런히 담긴 부드러운 족발");
        list.add(vo1);

        ShopVO vo2 = new ShopVO(R.drawable.b, "귀화식당", "제철 생선회와 다양한 요리가 있는 선술집");
        list.add(vo2);

        ShopVO vo3 = new ShopVO(R.drawable.c, "맛순대", "개금골목시장 대표 순대집");
        list.add(vo3);

        ShopVO vo4 = new ShopVO(R.drawable.d, "황산밀면", "밀면의 참맛을 느낄 수 있는 곳");
        list.add(vo4);

        ShopVO vo5 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo5);

        ShopVO vo6 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo6);

        ShopVO vo7 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo7);

        ShopVO vo8 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo8);

        ShopVO vo9 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo9);

        ShopVO vo10 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo10);

        ShopVO vo11 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo11);

        ShopVO vo12 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo12);

        ShopVO vo13 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo13);

        ShopVO vo14 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo14);

        ShopVO vo15 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo15);

        ShopVO vo16 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo16);

        ShopVO vo17 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo17);

        ShopVO vo18 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo18);

        ShopVO vo19 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo19);

        ShopVO vo20 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo20);

        ListViewAdapter adapter2 = new ListViewAdapter(getActivity(), R.layout.item_info_fragment1, list);

        listView.setAdapter(adapter2);


        return v;

    }
}
