package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: uy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0798uy {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m2500a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
