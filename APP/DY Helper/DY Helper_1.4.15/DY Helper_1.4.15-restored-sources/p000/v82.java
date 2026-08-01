package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class v82 {
    /* JADX INFO: renamed from: α */
    public static p000.oc2 m6137(android.view.View r2) {
            android.view.WindowInsets r0 = r2.getRootWindowInsets()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            oc2 r0 = p000.oc2.m4220(r1, r0)
            lc2 r1 = r0.f8033
            r1.mo1914(r0)
            android.view.View r2 = r2.getRootView()
            r1.mo1904(r2)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m6138(android.view.View r0, int r1, int r2) {
            r0.setScrollIndicators(r1, r2)
            return
    }
}
