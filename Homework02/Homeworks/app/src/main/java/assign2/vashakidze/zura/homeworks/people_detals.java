package assign2.vashakidze.zura.homeworks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class people_detals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_detals);

        TextView tevxtView = (TextView) findViewById(R.id.desc);
        Intent intent = getIntent();
        tevxtView.setText(intent.getStringExtra("Description"));

    }
}
