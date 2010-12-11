package jp.sblo.pandora.togglestatusbar;

import java.lang.reflect.Method;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String STATUS_BAR_SERVICE = "statusbar";
        Object statusbarmanager = getSystemService(STATUS_BAR_SERVICE);

        Method method;
        try {
            method = statusbarmanager.getClass().getMethod("expand", null);
            method.invoke(statusbarmanager, null);
        } catch (Exception e) {
        }
        finish();
    }
}