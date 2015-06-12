package portfolio.farrukhaziz.com.project_0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSpotify(View view) {
        showMessage(getString(R.string.spotify_toast_message));
    }

    public void onClickScores(View view) {
        showMessage(getString(R.string.scores_toast_message));
    }

    public void onClickLibrary(View view) {
        showMessage(getString(R.string.library_toast_message));
    }

    public void onClickBigger(View view) {
        showMessage(getString(R.string.build_it_bigger_toast_message));
    }

    public void onClickXYZ(View view) {
        showMessage(getString(R.string.xyz_toast_message));
    }

    public void onClickCapstone(View view) {
        showMessage(getString(R.string.capstone_toast_message));
    }

    public void showMessage(String message) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, message, duration).show();
    }
}
