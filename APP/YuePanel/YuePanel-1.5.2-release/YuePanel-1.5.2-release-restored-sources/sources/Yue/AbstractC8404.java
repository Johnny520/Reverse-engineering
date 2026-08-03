package Yue;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC8404 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3471 = "androidx.contentpager.content.wakelockid";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final SparseArray<PowerManager.WakeLock> f3472 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int f25103 = 1;

    /* JADX INFO: renamed from: ۥ */
    public static boolean m4382(Intent intent) {
        int intExtra = intent.getIntExtra(f3471, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f3472;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static ComponentName m4383(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f3472;
        synchronized (sparseArray) {
            try {
                int i = f25103;
                int i2 = i + 1;
                f25103 = i2;
                if (i2 <= 0) {
                    f25103 = 1;
                }
                intent.putExtra(f3471, i);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(C7033.f21235);
                sparseArray.put(i, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
