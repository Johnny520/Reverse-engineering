package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9095;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ps0 f9096;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f9097;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.a80 f9098;

    public /* synthetic */ qs0(p000.ps0 r2, p000.a80 r3, p000.a80 r4) {
            r1 = this;
            r0 = 0
            r1.f9095 = r0
            r1.<init>()
            r1.f9096 = r2
            r1.f9097 = r3
            r1.f9098 = r4
            return
    }

    public /* synthetic */ qs0(p000.ps0 r1, p000.a80 r2, p000.a80 r3, int r4, int r5) {
            r0 = this;
            r0.f9095 = r5
            r0.f9096 = r1
            r0.f9097 = r2
            r0.f9098 = r3
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f9095
            v80 r6 = (p000.v80) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L57;
                case 2: goto L44;
                case 3: goto L31;
                case 4: goto L1e;
                default: goto L9;
            }
        L9:
            r7.getClass()
            r7 = 9
            int r7 = p000.v81.m6136(r7)
            ps0 r0 = r5.f9096
            a80 r1 = r5.f9097
            a80 r5 = r5.f9098
            p000.pt0.m4591(r0, r1, r5, r6, r7)
        L1b:
            s62 r5 = p000.s62.f9751
            return r5
        L1e:
            r7.getClass()
            r7 = 9
            int r7 = p000.v81.m6136(r7)
            ps0 r0 = r5.f9096
            a80 r1 = r5.f9097
            a80 r5 = r5.f9098
            p000.pt0.m4591(r0, r1, r5, r6, r7)
            goto L1b
        L31:
            r7.getClass()
            r7 = 9
            int r7 = p000.v81.m6136(r7)
            ps0 r0 = r5.f9096
            a80 r1 = r5.f9097
            a80 r5 = r5.f9098
            p000.jx0.m3036(r0, r1, r5, r6, r7)
            goto L1b
        L44:
            r7.getClass()
            r7 = 9
            int r7 = p000.v81.m6136(r7)
            ps0 r0 = r5.f9096
            a80 r1 = r5.f9097
            a80 r5 = r5.f9098
            p000.jx0.m3036(r0, r1, r5, r6, r7)
            goto L1b
        L57:
            r7.getClass()
            r7 = 9
            int r7 = p000.v81.m6136(r7)
            ps0 r0 = r5.f9096
            a80 r1 = r5.f9097
            a80 r5 = r5.f9098
            p000.jx0.m3037(r0, r1, r5, r6, r7)
            goto L1b
        L6a:
            int r7 = r7.intValue()
            r0 = r7 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L76
            r0 = r2
            goto L77
        L76:
            r0 = 0
        L77:
            r7 = r7 & r2
            boolean r7 = r6.m6075(r7, r0)
            if (r7 == 0) goto L9b
            u30 r7 = p000.AbstractC0978xb.f12112
            aa r0 = p000.C0966x.f11944
            xs0 r1 = new xs0
            r2 = 0
            ps0 r3 = r5.f9096
            a80 r4 = r5.f9097
            a80 r5 = r5.f9098
            r1.<init>(r3, r4, r5, r2)
            r5 = 1470599731(0x57a79233, float:3.6849273E14)
            an r5 = p000.kn0.m3349(r5, r1, r6)
            r1 = 3126(0xc36, float:4.38E-42)
            p000.AbstractC1021yh.m6872(r7, r0, r5, r6, r1)
            goto L9e
        L9b:
            r6.m6078()
        L9e:
            s62 r5 = p000.s62.f9751
            return r5
    }
}
