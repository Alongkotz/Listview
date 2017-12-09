package com.aon.listview;

import android.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kwann on 12/9/2017.
 */

public class listadapter extends BaseAdapter {
    private Context context;
    private List<Shigingami> shigingamiList = new ArrayList<>();

    listadapter(Context c, List<Shigingami> s) {
        this.context = c;
        this.shigingamiList = s;
    }

    @Override
    public int getCount() {
        if(shigingamiList==null)
            return 0;
        return shigingamiList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.character, parent, false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView text = view.findViewById(R.id.Name);
        TextView text2 = view.findViewById(R.id.description);

        imageView.setImageResource(shigingamiList.get(position).getId());
        text.setText(shigingamiList.get(position).getCharacter());
        text2.setText(shigingamiList.get(position).getDescription());
        return view;
    }
}
