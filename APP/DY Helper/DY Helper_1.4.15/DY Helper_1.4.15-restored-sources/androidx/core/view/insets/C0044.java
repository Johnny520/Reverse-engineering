package androidx.core.view.insets;

/* JADX INFO: renamed from: androidx.core.view.insets.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0044 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f1020;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f1021;

    /* JADX INFO: renamed from: γ */
    public p000.nm0 f1022;

    /* JADX INFO: renamed from: δ */
    public p000.nm0 f1023;

    /* JADX INFO: renamed from: ε */
    public int f1024;

    public C0044(android.view.ViewGroup r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f1021 = r0
            nm0 r0 = p000.nm0.f7673
            r4.f1022 = r0
            r4.f1023 = r0
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            r2 = 0
            if (r1 == 0) goto L20
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L21
        L20:
            r0 = r2
        L21:
            r4.f1024 = r0
            androidx.core.view.insets.SystemBarStateMonitor$1 r0 = new androidx.core.view.insets.SystemBarStateMonitor$1
            android.content.Context r1 = r5.getContext()
            r0.<init>(r4, r1, r5)
            r4.f1020 = r0
            r1 = 1
            r0.setWillNotDraw(r1)
            hi0 r1 = new hi0
            r1.<init>(r4)
            java.util.WeakHashMap r3 = p000.b92.f1572
            p000.u82.m5827(r0, r1)
            i22 r1 = new i22
            r1.<init>(r4)
            xb2 r4 = new xb2
            r4.<init>(r1)
            r0.setWindowInsetsAnimationCallback(r4)
            r5.addView(r0, r2)
            return
    }
}
