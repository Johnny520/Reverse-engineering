package p082p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Intent m1453a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2);
    }
}
