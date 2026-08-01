package p082p;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p022L.AbstractC0174d;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0785c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Intent m1451a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        if ((i2 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC0503h.m980h(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AbstractC0174d.m353i("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ComponentName m1452b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
