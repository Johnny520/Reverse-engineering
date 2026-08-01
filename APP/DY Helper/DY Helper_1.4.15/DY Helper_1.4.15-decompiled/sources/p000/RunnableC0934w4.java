package p000;

/* JADX INFO: renamed from: w4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0934w4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11559;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.app.LayoutInflaterFactory2C0026 f11560;

    public /* synthetic */ RunnableC0934w4(androidx.appcompat.app.LayoutInflaterFactory2C0026 r1, int r2) {
            r0 = this;
            r0.f11559 = r2
            r0.f11560 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f11559
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            androidx.appcompat.app.β r0 = r5.f11560
            android.widget.PopupWindow r1 = r0.f375
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f374
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            x92 r1 = r0.f377
            if (r1 == 0) goto L18
            r1.m6541()
        L18:
            boolean r1 = r0.f378
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L43
            android.view.ViewGroup r1 = r0.f379
            if (r1 == 0) goto L43
            boolean r1 = r1.isLaidOut()
            if (r1 == 0) goto L43
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f374
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f374
            x92 r1 = p000.b92.m823(r1)
            r1.m6540(r2)
            r0.f377 = r1
            y4 r0 = new y4
            r2 = 0
            r0.<init>(r2, r5)
            r1.m6543(r0)
            goto L4d
        L43:
            androidx.appcompat.widget.ActionBarContextView r5 = r0.f374
            r5.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r5 = r0.f374
            r5.setVisibility(r4)
        L4d:
            return
        L4e:
            androidx.appcompat.app.β r5 = r5.f11560
            int r0 = r5.f415
            r0 = r0 & 1
            r1 = 0
            if (r0 == 0) goto L5a
            r5.m228(r1)
        L5a:
            int r0 = r5.f415
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L65
            r0 = 108(0x6c, float:1.51E-43)
            r5.m228(r0)
        L65:
            r5.f414 = r1
            r5.f415 = r1
            return
    }
}
