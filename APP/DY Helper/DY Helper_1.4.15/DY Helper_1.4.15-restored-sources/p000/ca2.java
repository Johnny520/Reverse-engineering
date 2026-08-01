package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ca2 {
    /* JADX INFO: renamed from: α */
    public static void m1173(android.view.View r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            android.graphics.Insets r1 = android.graphics.Insets.of(r3)
            android.view.WindowInsets$Builder r0 = r0.setSystemWindowInsets(r1)
            android.view.WindowInsets r0 = r0.build()
            android.view.WindowInsets r2 = r2.computeSystemWindowInsets(r0, r4)
            android.graphics.Insets r2 = r2.getSystemWindowInsets()
            int r4 = r2.left
            int r0 = r2.top
            int r1 = r2.right
            int r2 = r2.bottom
            r3.set(r4, r0, r1, r2)
            return
    }
}
