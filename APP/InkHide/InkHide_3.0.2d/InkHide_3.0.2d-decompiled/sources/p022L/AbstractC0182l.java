package p022L;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: L.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0182l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static PackageInfo m385a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
