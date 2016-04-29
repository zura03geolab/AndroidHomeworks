package assign2.vashakidze.zura.homeworks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import assign2.vashakidze.zura.homeworks.adapters.MathsAdapter;
import assign2.vashakidze.zura.homeworks.model.MathCompCharacters;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MathCompCharacters> list = new ArrayList<>();

        for (int i = 0; i < Mathematicians.names.length; i++){
            MathCompCharacters character = new MathCompCharacters(Mathematicians.names[i], Mathematicians.descriptions[i], Mathematicians.images[i]);
            list.add(character);
        }

        MathsAdapter adapter = new MathsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MathCompCharacters character = (MathCompCharacters) parent.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(), character.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
