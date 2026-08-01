package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛷᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0783 {
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.content.pm.PackageInfo m1325(android.content.pm.PackageManager r2, android.content.Context r3) {
            java.lang.String r3 = r3.getPackageName()
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            return r2
    }
}
