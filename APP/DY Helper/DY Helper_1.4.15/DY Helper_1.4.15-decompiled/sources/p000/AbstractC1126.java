package p000;

/* JADX INFO: renamed from: ш */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1126 {
    /* JADX INFO: renamed from: α */
    public static final p000.C0063b3 m7343(java.lang.String r2) {
            r2.getClass()
            b3 r0 = new b3
            android.graphics.RuntimeShader r1 = new android.graphics.RuntimeShader
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static android.content.pm.PackageInfo m7344(android.content.pm.PackageManager r2, android.content.Context r3) {
            java.lang.String r3 = r3.getPackageName()
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m7345(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.String r0 = r0.getUniqueId()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m7346(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isTextSelectable()
            return r0
    }
}
