package p034S;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: S.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333m {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m751a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
