package p000;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0101c5 {
    /* JADX INFO: renamed from: α */
    public static android.window.OnBackInvokedDispatcher m1129(android.app.Activity r0) {
            android.window.OnBackInvokedDispatcher r0 = p000.AbstractC1124.m7330(r0)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static android.window.OnBackInvokedCallback m1130(java.lang.Object r2, androidx.appcompat.app.LayoutInflaterFactory2C0026 r3) {
            java.util.Objects.requireNonNull(r3)
            b5 r0 = new b5
            r1 = 0
            r0.<init>(r1, r3)
            android.window.OnBackInvokedDispatcher r2 = p000.AbstractC1124.m7331(r2)
            p000.AbstractC1124.m7339(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m1131(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedCallback r1 = p000.AbstractC1124.m7328(r1)
            android.window.OnBackInvokedDispatcher r0 = p000.AbstractC1124.m7331(r0)
            p000.AbstractC1124.m7340(r0, r1)
            return
    }
}
