package com.example.kannadakali;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class wordAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    List<word> wordList;
    ArrayList<word> arrayList;

    public wordAdapter(Context context, List<word> wordList) {
        mContext = context;
        this.wordList = wordList;
        inflater=LayoutInflater.from(mContext);
        this.arrayList=new ArrayList<word>();
        this.arrayList.addAll(wordList);
    }
    public class ViewHolder {
        TextView a,b,c;
        ImageButton d;
    }

    @Override
    public int getCount() {
        return wordList.size();
    }

    @Override
    public Object getItem(int position) {
        return wordList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null) {
            holder=new ViewHolder();
            view=inflater.inflate(R.layout.list_item,null);
            holder.a=view.findViewById(R.id.text1);
            holder.b=view.findViewById(R.id.text2);
            holder.c=view.findViewById(R.id.text3);
            holder.d=view.findViewById(R.id.image);
            view.setTag(holder);
        }
        else {
            holder=(ViewHolder)view.getTag();
        }
        holder.a.setText(wordList.get(position).getEWord());
        holder.b.setText(wordList.get(position).getKEngWord());
        holder.c.setText(wordList.get(position).getKWord());
        //holder.d.setImageResource(wordList.get(position).getVoice_id());//change

        //code for voice......
        return view;
    }
    public void filter(String charText) {
        charText=charText.toLowerCase(Locale.getDefault());
        wordList.clear();
        if(charText.length()==0) {
            wordList.addAll(arrayList);
        }
        else {
            for(word w:arrayList) {
                if(w.getEWord().toLowerCase(Locale.getDefault()).contains(charText) || w.getKEngWord().toLowerCase(Locale.getDefault()).contains(charText)) {
                    wordList.add(w);
                }
            }
        }
        notifyDataSetChanged();
    }
}