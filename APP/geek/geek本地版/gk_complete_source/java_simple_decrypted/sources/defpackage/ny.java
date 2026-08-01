package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny {
    public static PackageInfo a(PackageManager r2, Context r3) {
        return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }
}
