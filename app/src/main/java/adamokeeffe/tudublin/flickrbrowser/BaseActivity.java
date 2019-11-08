package adamokeeffe.tudublin.flickrbrowser;



import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";
    static final String FLICK_QUERY = "FLICKR_QUERY";
    static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    void activateToolbar(boolean enableHome){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar == null) {

            Toolbar toolBar = findViewById(R.id.toolbar);

            if(toolBar != null){
                setSupportActionBar(toolBar);
                actionBar = getSupportActionBar();
            }
        }

        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(enableHome);
        }
    }
}
