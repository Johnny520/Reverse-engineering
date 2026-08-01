package p000;

/* JADX INFO: renamed from: vu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0923vu implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11402;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f11403;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f11404;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.ScrollView f11405;

    public /* synthetic */ RunnableC0923vu(android.app.Activity r2, android.widget.ScrollView r3, android.view.View r4) {
            r1 = this;
            r0 = 0
            r1.f11402 = r0
            r1.<init>()
            r1.f11404 = r2
            r1.f11405 = r3
            r1.f11403 = r4
            return
    }

    public /* synthetic */ RunnableC0923vu(android.view.View r2, android.app.Activity r3, android.widget.ScrollView r4) {
            r1 = this;
            r0 = 1
            r1.f11402 = r0
            r1.<init>()
            r1.f11403 = r2
            r1.f11404 = r3
            r1.f11405 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f11402
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.View r0 = r4.f11403
            int r0 = r0.getTop()
            r1 = 1098907648(0x41800000, float:16.0)
            android.app.Activity r2 = r4.f11404
            int r1 = p000.ia0.m2690(r2, r1)
            int r0 = r0 - r1
            r1 = 0
            if (r0 >= 0) goto L18
            r0 = r1
        L18:
            android.widget.ScrollView r4 = r4.f11405
            r4.smoothScrollTo(r1, r0)
            return
        L1e:
            android.app.Activity r0 = r4.f11404
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r1 = 1063004406(0x3f5c28f6, float:0.86)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.widget.ScrollView r1 = r4.f11405
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getHeight()
            if (r3 > r0) goto L44
            android.view.View r4 = r4.f11403
            int r4 = r4.getMeasuredHeight()
            if (r4 <= r0) goto L49
        L44:
            r2.height = r0
            r1.setLayoutParams(r2)
        L49:
            return
    }
}
