package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9996;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f9997;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Class f9998;

    public /* synthetic */ sq0(int r1, java.lang.Class r2, java.lang.String r3) {
            r0 = this;
            r0.f9996 = r1
            r0.f9997 = r3
            r0.f9998 = r2
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r6) {
            r5 = this;
            int r0 = r5.f9996
            java.lang.Class r1 = r5.f9998
            r2 = 4
            r3 = 7
            r4 = 0
            java.lang.String r5 = r5.f9997
            r6.getClass()
            switch(r0) {
                case 0: goto L5c;
                default: goto Lf;
            }
        Lf:
            java.lang.Object[] r6 = r6.f5692
            r6.getClass()
            java.lang.Object r6 = p000.AbstractC0312g7.m2250(r6)
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L1f
            r4 = r6
            android.view.View r4 = (android.view.View) r4
        L1f:
            if (r4 != 0) goto L22
            goto L5b
        L22:
            q10 r6 = p000.q10.f8786
            p3 r6 = new p3
            r6.<init>(r5, r3, r4)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L3b
            r6.invoke()
            goto L45
        L3b:
            android.os.Handler r0 = p000.q10.f8788
            r0 r3 = new r0
            r3.<init>(r2, r6)
            r0.post(r3)
        L45:
            boolean r6 = p000.ui1.m5904(r5)
            if (r6 != 0) goto L4c
            goto L5b
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.tq0.f10430
            java.lang.String r6 = r1.getSimpleName()
            java.lang.String r0 = "onViewCreated:"
            java.lang.String r6 = r0.concat(r6)
            p000.tq0.m5728(r4, r5, r6)
        L5b:
            return
        L5c:
            java.lang.Object r6 = r6.f5694
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L65
            r4 = r6
            android.view.View r4 = (android.view.View) r4
        L65:
            if (r4 != 0) goto L68
            goto La1
        L68:
            q10 r6 = p000.q10.f8786
            p3 r6 = new p3
            r6.<init>(r5, r3, r4)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L81
            r6.invoke()
            goto L8b
        L81:
            android.os.Handler r0 = p000.q10.f8788
            r0 r3 = new r0
            r3.<init>(r2, r6)
            r0.post(r3)
        L8b:
            boolean r6 = p000.ui1.m5904(r5)
            if (r6 != 0) goto L92
            goto La1
        L92:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.tq0.f10430
            java.lang.String r6 = r1.getSimpleName()
            java.lang.String r0 = "onCreateView:"
            java.lang.String r6 = r0.concat(r6)
            p000.tq0.m5728(r4, r5, r6)
        La1:
            return
    }
}
