package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12547;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dc0 f12548;

    public /* synthetic */ yb0(p000.dc0 r1, int r2) {
            r0 = this;
            r0.f12547 = r2
            r0.f12548 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f12547
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L3d;
                case 2: goto L2c;
                default: goto L5;
            }
        L5:
            pt r5 = (p000.C0699pt) r5
            r5.getClass()
            java.lang.String r0 = r5.f8694
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L1b
            goto L29
        L1b:
            android.os.Handler r1 = p000.ec0.f3479
            e9 r2 = new e9
            r3 = 15
            dc0 r4 = r4.f12548
            r2.<init>(r4, r5, r0, r3)
            r1.post(r2)
        L29:
            s62 r4 = p000.s62.f9751
            return r4
        L2c:
            ic0 r5 = (p000.ic0) r5
            r5.getClass()
            java.util.List r5 = p000.AbstractC1021yh.m6896(r5)
            dc0 r4 = r4.f12548
            r4.m1689(r5)
        L3a:
            s62 r4 = p000.s62.f9751
            return r4
        L3d:
            db0 r5 = (p000.db0) r5
            r5.getClass()
            p3 r0 = new p3
            r1 = 13
            dc0 r4 = r4.f12548
            r0.<init>(r4, r1, r5)
            r4.m1690(r0)
            goto L3a
        L4f:
            rb0 r5 = (p000.rb0) r5
            r5.getClass()
            p3 r0 = new p3
            r1 = 12
            dc0 r4 = r4.f12548
            r0.<init>(r4, r1, r5)
            r4.m1690(r0)
            goto L3a
    }
}
