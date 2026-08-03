package p034S;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: S.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333m {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m751a(PackageManager r2, Context r3) throws PackageManager.NameNotFoundException {
        return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }
}
