package p089g0;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: renamed from: g0.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2477n0 {

    /* JADX INFO: renamed from: a */
    public static final C2477n0 f6701a = new C2477n0();

    /* JADX INFO: renamed from: a */
    public final void m8934a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e10) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e10);
        }
    }
}
