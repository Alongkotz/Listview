package com.aon.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Shigingami> shigingamiList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listv);
        listadapter adapter = new listadapter(MainActivity.this,shigingamiList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                a.putExtra("Image",shigingamiList.get(position).getId());
                 a.putExtra("Name",shigingamiList.get(position).getCharacter());
                 a.putExtra("Description",shigingamiList.get(position).getDescription());
                startActivity(a);
            }
        });

        prepareData();
    }

    private void prepareData() {
        int Id[] = {R.drawable.pricee, R.drawable.flower, R.drawable.helll, R.drawable.dojicc, R.drawable.tenguu, R.drawable.shutenn};
        String Character[] = {"Youtouhime", "Kachou Fuugetsu", "Enma", "Ibaraki douji", "Otengu", "Shuten douji"};
        String Description[] = {getString(R.string.youtouhime), getString(R.string.flower), getString(R.string.enma), getString(R.string.ibarakidouji), getString(R.string.otengu), getString(R.string.shutendouji)};

        int dataSize = Id.length;
        for (int i = 0; i < dataSize; i++) {
            Shigingami shigi = new Shigingami(Id[i], Character[i], Description[i]);
            shigingamiList.add(shigi);
        }
    }
}
