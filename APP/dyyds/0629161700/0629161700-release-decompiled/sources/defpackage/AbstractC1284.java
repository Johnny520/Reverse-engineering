package defpackage;

/* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1284 {
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static boolean m2410(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isTextSelectable()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.content.pm.PackageInfo m2411(android.content.pm.PackageManager r2, android.content.Context r3) {
            java.lang.String r3 = r3.getPackageName()
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m2412(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.String r0 = r0.getUniqueId()
            return r0
    }
}
