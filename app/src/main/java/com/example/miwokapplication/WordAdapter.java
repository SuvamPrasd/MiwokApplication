package com.example.miwokapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    ArrayList<Word> word = new ArrayList<Word>();

    public WordAdapter(Context context, ArrayList<Word> objects, int colorResourceID){
        super(context,0,objects);
        mColorResourceId = colorResourceID;
        word = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        Word currentWord = getItem(position);
        //LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //v = inflater.inflate(R.layout.list_item,null);
        if (v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView textView = (TextView) v.findViewById(R.id.miwok_text_view);
        TextView textView1 = (TextView) v.findViewById(R.id.default_text_view);


        ImageView imageView = (ImageView) v.findViewById(R.id.imageResource);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        
        textView.setText(currentWord.getMiwokTranslation());
        textView1.setText(currentWord.getDefaultTranslation());

        View textContainer = v.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return v;
    }
}
