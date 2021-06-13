package hammond.sam.spensdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * https://developer.samsung.com/galaxy-spen-remote/overview.html
     * https://developer.samsung.com/codelab/s-pen-remote/air-actions/overview.html
     * Note :
     * Specify the KeyEvent to be mapped to the S Pen Remote Event in a Manifest.
     * Implement KeyEvent-Callback (if needed).
     */
}