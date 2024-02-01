package com.example.myapplicationnopmuon.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

import java.util.ArrayList;

public class A43647_T3_Adapter extends BaseAdapter {
    private ArrayList<A43647T3Contact> A43647ls;
    private Context context;

    public A43647_T3_Adapter(ArrayList<A43647T3Contact> a43647ls, Context context) {
        A43647ls = a43647ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return A43647ls.size();
    }

    @Override
    public Object getItem(int position) {
        return A43647ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        A43647ViewAX A43647ax;
        if(convertView==null)
        {
            A43647ax = new A43647ViewAX();
            convertView= LayoutInflater.from(context).inflate(R.layout.a43647t3_listview_item,null);
            A43647ax.img_hinh=convertView.findViewById(R.id.A43647ItemImage);
            A43647ax.tv_name=convertView.findViewById(R.id.A43647t3ItemName);
            A43647ax.tv_age=convertView.findViewById(R.id.A43647ItemAge);
            convertView.setTag(A43647ax);
        }else
        {
            A43647ax=(A43647ViewAX) convertView.getTag();
        }
        A43647ax.img_hinh.setImageResource(A43647ls.get(position).getA43647image());
        A43647ax.tv_name.setText(A43647ls.get(position).getA43647name());
        A43647ax.tv_age.setText(A43647ls.get(position).getA43647age());
        return convertView;
    }

    class A43647ViewAX{
        ImageView img_hinh;
        TextView tv_name, tv_age;
    }
}
