package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class MonHocAdapter extends BaseAdapter {
    private  Context context;
    private  int layout;
    private List<MonHoc> monHocs ;

    public MonHocAdapter(Context context, int layout, List<MonHoc> monHocs) {
        this.context = context;
        this.layout = layout;
        this.monHocs = monHocs;
    }

    @Override
    public int getCount() {
        return monHocs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        return null;
    }
}
