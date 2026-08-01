package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: ny */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539ny {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m1952a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
