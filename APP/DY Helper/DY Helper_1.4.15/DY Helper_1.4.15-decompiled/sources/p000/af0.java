package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f212;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f213;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ boolean f214;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ boolean f215;

    public /* synthetic */ af0(android.view.ViewGroup r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 2
            r1.f212 = r0
            r1.<init>()
            r1.f214 = r3
            r1.f213 = r2
            r1.f215 = r4
            return
    }

    public /* synthetic */ af0(p000.z81 r1, boolean r2, boolean r3, int r4) {
            r0 = this;
            r0.f212 = r4
            r0.f213 = r1
            r0.f214 = r2
            r0.f215 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f212
            switch(r0) {
                case 0: goto L67;
                case 1: goto L57;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f213
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = r5.f215
            s62 r2 = p000.s62.f9751
            p000.AbstractC0551mj.m3842(r0, r1)     // Catch: java.lang.Throwable -> L12
            r3 = r2
            goto L18
        L12:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
        L18:
            java.lang.Throwable r1 = p000.fo1.m2190(r3)
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "apply failed: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            p000.AbstractC0551mj.m3859(r1)
        L33:
            boolean r5 = r5.f214
            if (r5 == 0) goto L56
            gj r5 = new gj
            r1 = 0
            r5.<init>(r0, r1)
            r0.post(r5)
            gj r5 = new gj
            r1 = 1
            r5.<init>(r0, r1)
            r3 = 180(0xb4, double:8.9E-322)
            r0.postDelayed(r5, r3)
            gj r5 = new gj
            r1 = 2
            r5.<init>(r0, r1)
            r3 = 520(0x208, double:2.57E-321)
            r0.postDelayed(r5, r3)
        L56:
            return r2
        L57:
            java.lang.Object r0 = r5.f213
            z81 r0 = (p000.z81) r0
            boolean r1 = r5.f215
            tg r2 = p000.AbstractC0871ug.f10771
            boolean r5 = r5.f214
            r2.m5690(r0, r5, r1)
        L64:
            s62 r5 = p000.s62.f9751
            return r5
        L67:
            java.lang.Object r0 = r5.f213
            z81 r0 = (p000.z81) r0
            boolean r1 = r5.f215
            tg r2 = p000.AbstractC0871ug.f10771
            boolean r5 = r5.f214
            r2.m5690(r0, r5, r1)
            goto L64
    }
}
