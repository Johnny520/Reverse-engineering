package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u82 {
    /* JADX INFO: renamed from: α */
    public static p000.oc2 m5820(android.view.View r1, p000.oc2 r2, android.graphics.Rect r3) {
            android.view.WindowInsets r0 = r2.m4226()
            if (r0 == 0) goto Lf
            android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
            oc2 r1 = p000.oc2.m4220(r1, r2)
            return r1
        Lf:
            r3.setEmpty()
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static android.content.res.ColorStateList m5821(android.view.View r0) {
            android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static android.graphics.PorterDuff.Mode m5822(android.view.View r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static float m5823(android.view.View r0) {
            float r0 = r0.getElevation()
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static void m5824(android.view.View r0, android.content.res.ColorStateList r1) {
            r0.setBackgroundTintList(r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m5825(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
            r0.setBackgroundTintMode(r1)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m5826(android.view.View r0, float r1) {
            r0.setElevation(r1)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m5827(android.view.View r1, p000.v41 r2) {
            if (r2 == 0) goto L8
            t82 r0 = new t82
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r2 = 2131296987(0x7f0902db, float:1.8211906E38)
            java.lang.Object r2 = r1.getTag(r2)
            if (r2 == 0) goto L13
            return
        L13:
            if (r0 == 0) goto L19
            r1.setOnApplyWindowInsetsListener(r0)
            return
        L19:
            r2 = 2131296997(0x7f0902e5, float:1.8211926E38)
            java.lang.Object r2 = r1.getTag(r2)
            android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
            r1.setOnApplyWindowInsetsListener(r2)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m5828(android.view.View r0) {
            r0.stopNestedScroll()
            return
    }
}
