package p000;

/* JADX INFO: renamed from: rg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0760rg extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9364;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0834tg f9365;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ int f9366;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.lang.String f9367;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.String f9368;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f9369;

    public /* synthetic */ C0760rg(p000.C0834tg r1, int r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6) {
            r0 = this;
            r0.f9364 = r6
            r0.f9365 = r1
            r0.f9366 = r2
            r0.f9367 = r3
            r0.f9368 = r4
            r0.f9369 = r5
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r7) {
            r6 = this;
            int r0 = r6.f9364
            r7.getClass()
            switch(r0) {
                case 0: goto L2b;
                default: goto L8;
            }
        L8:
            java.lang.Object r7 = r7.f5691
            boolean r0 = r7 instanceof android.view.View
            if (r0 == 0) goto L12
            android.view.View r7 = (android.view.View) r7
        L10:
            r1 = r7
            goto L14
        L12:
            r7 = 0
            goto L10
        L14:
            if (r1 != 0) goto L17
            goto L2a
        L17:
            java.lang.String r7 = r6.f9367
            java.lang.String r0 = " attached"
            java.lang.String r3 = r7.concat(r0)
            java.lang.String r4 = r6.f9368
            boolean r5 = r6.f9369
            tg r0 = r6.f9365
            int r2 = r6.f9366
            r0.m5704(r1, r2, r3, r4, r5)
        L2a:
            return
        L2b:
            java.lang.Object r7 = r7.f5691
            boolean r0 = r7 instanceof android.view.View
            if (r0 == 0) goto L35
            android.view.View r7 = (android.view.View) r7
        L33:
            r1 = r7
            goto L37
        L35:
            r7 = 0
            goto L33
        L37:
            if (r1 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r7 = r6.f9367
            java.lang.String r0 = " constructor"
            java.lang.String r3 = r7.concat(r0)
            java.lang.String r4 = r6.f9368
            boolean r5 = r6.f9369
            tg r0 = r6.f9365
            int r2 = r6.f9366
            r0.m5704(r1, r2, r3, r4, r5)
        L4d:
            return
    }
}
