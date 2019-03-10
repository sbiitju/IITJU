package com.shahin.acer.iitju;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Value> {
    ArrayList<Value> arrayList;
    Context context;

    public MyAdapter(Context context, ArrayList<Value> arrayList) {
        super(context,R.layout.mylist,arrayList);
        this.context=context;
        this.arrayList=arrayList;

    }
    class ViewHolder{
        ImageView imageView;
        TextView name;
        TextView phone;
        TextView email;
        TextView temp;
    }
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder holder;
        if(convertView==null) {
            holder=new ViewHolder();
            convertView=inflater.inflate(R.layout.mylist,parent,false);
            holder.imageView = convertView.findViewById(R.id.imageview);
            holder.name = convertView.findViewById(R.id.nameview);
            holder.phone = convertView.findViewById(R.id.phoneview);
            holder.email = convertView.findViewById(R.id.emailview);
            holder.temp = convertView.findViewById(R.id.tempview);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

            holder.imageView.setImageResource(arrayList.get(position).getImage());
           holder.name.setText(arrayList.get(position).getName());
            holder.phone.setText(arrayList.get(position).getPhone());
            holder.email.setText(arrayList.get(position).getEmail());
            holder.temp.setText(arrayList.get(position).getTemp());
            return convertView;
    }

}
