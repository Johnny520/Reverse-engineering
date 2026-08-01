package com.p001mr.elaris;

import android.app.Activity;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsToast {
    private static final long RESTART_HINT_TOAST_THROTTLE_MS = 2200;
    private Toast activeToast;
    private final Activity activity;
    private long lastRestartHintToastAt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsToast(Activity activity) {
        this.activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toast(String str) {
        try {
            Toast toast = this.activeToast;
            if (toast != null) {
                toast.cancel();
            }
        } catch (Throwable unused) {
        }
        Toast toastMakeText = Toast.makeText(this.activity, str, 0);
        this.activeToast = toastMakeText;
        toastMakeText.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toastRestartHint(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastRestartHintToastAt < RESTART_HINT_TOAST_THROTTLE_MS) {
            return;
        }
        this.lastRestartHintToastAt = jCurrentTimeMillis;
        toast(str);
    }
}
