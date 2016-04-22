package android.vashakidze.zura.homework01;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private int color = Color.WHITE;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        if (savedInstanceState != null){
            color = savedInstanceState.getInt("Color");
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(color);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        setContentView(R.layout.activity_main);

        outState.putInt("Color", color);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://android.vashakidze.zura.homework01/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://android.vashakidze.zura.homework01/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public void click(View buttons) {
        if (buttons.getId() == R.id.red) {
            Toast.makeText(this, "ეკრანი გაწითლდა", Toast.LENGTH_SHORT).show();
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(Color.RED);
            color = Color.RED;
        }
        else if (buttons.getId() == R.id.blue) {
            Toast.makeText(this, "ეკრანი გალურჯდა", Toast.LENGTH_SHORT).show();
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(Color.BLUE);
            color = Color.BLUE;
        }
        else if (buttons.getId() == R.id.white) {
            Toast.makeText(this, "ეკრანი გათეთრდა", Toast.LENGTH_SHORT).show();
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(Color.WHITE);
            color = Color.WHITE;
        }
        else if (buttons.getId() == R.id.green) {
            Toast.makeText(this, "ეკრანი გამწვანდა", Toast.LENGTH_SHORT).show();
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(Color.GREEN);
            color = Color.GREEN;
        }
        else if (buttons.getId() == R.id.yellow) {
            Toast.makeText(this, "ეკრანი გაყვითლდა", Toast.LENGTH_SHORT).show();
            RelativeLayout home_page = (RelativeLayout) findViewById(R.id.home_page);
            home_page.setBackgroundColor(Color.YELLOW);
            color = Color.YELLOW;
        }
    }
}