package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny {
    public static android.content.pm.PackageInfo a(android.content.pm.PackageManager r2, android.content.Context r3) {
            java.lang.String r3 = r3.getPackageName()
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            return r2
    }
}
