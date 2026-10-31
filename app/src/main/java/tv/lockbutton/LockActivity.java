package tv.lockbutton;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

/** Opens Weather Clock's lock screen (the screensaver as a screen) and closes. */
public class LockActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            startActivity(new Intent("tv.weatherclock.LOCK").setPackage("tv.weatherclock"));
        } catch (ActivityNotFoundException ignored) {
            // Weather Clock not installed: nothing to open.
        }
        finish();
    }
}
