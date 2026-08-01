package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6768;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ps0 f6769;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ boolean f6770;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.a80 f6771;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.a80 f6772;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.ep0 f6773;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f6774;

    public /* synthetic */ lt0(p000.C0534m2 r2, p000.ep0 r3, p000.ps0 r4, boolean r5, p000.a80 r6, p000.a80 r7) {
            r1 = this;
            r0 = 0
            r1.f6768 = r0
            r1.<init>()
            r1.f6774 = r2
            r1.f6773 = r3
            r1.f6769 = r4
            r1.f6770 = r5
            r1.f6771 = r6
            r1.f6772 = r7
            return
    }

    public /* synthetic */ lt0(p000.ps0 r1, boolean r2, p000.a80 r3, p000.a80 r4, p000.r01 r5, p000.ep0 r6, int r7) {
            r0 = this;
            r7 = 1
            r0.f6768 = r7
            r0.<init>()
            r0.f6769 = r1
            r0.f6770 = r2
            r0.f6771 = r3
            r0.f6772 = r4
            r0.f6774 = r5
            r0.f6773 = r6
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f6768
            switch(r0) {
                case 0: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f6774
            r5 = r0
            r01 r5 = (p000.r01) r5
            r7 = r11
            v80 r7 = (p000.v80) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            r11 = 24577(0x6001, float:3.444E-41)
            int r8 = p000.v81.m6136(r11)
            ps0 r1 = r10.f6769
            boolean r2 = r10.f6770
            a80 r3 = r10.f6771
            a80 r4 = r10.f6772
            ep0 r6 = r10.f6773
            p000.pt0.m4592(r1, r2, r3, r4, r5, r6, r7, r8)
            s62 r10 = p000.s62.f9751
            return r10
        L28:
            java.lang.Object r0 = r10.f6774
            r1 = r0
            m2 r1 = (p000.C0534m2) r1
            r5 = r11
            v80 r5 = (p000.v80) r5
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r7 = 0
            r2 = 1
            if (r12 == r0) goto L3f
            r12 = r2
            goto L40
        L3f:
            r12 = r7
        L40:
            r11 = r11 & r2
            boolean r11 = r5.m6075(r11, r12)
            if (r11 == 0) goto L85
            r11 = r7
            ep0 r7 = r10.f6773
            if (r1 == 0) goto L6c
            r12 = -1394735359(0xffffffffacde0701, float:-6.310397E-12)
            r5.m6082(r12)
            u30 r12 = p000.AbstractC0978xb.f12112
            r0 = 0
            r2 = 520187(0x7effb, float:7.28937E-40)
            r01 r12 = p000.h62.m2427(r12, r0, r2)
            r01 r3 = p000.AbstractC1021yh.m6871(r12, r7)
            r2 = 0
            r6 = 24624(0x6030, float:3.4506E-41)
            i2 r4 = p000.C0440jp.f5533
            p000.AbstractC1021yh.m6875(r1, r2, r3, r4, r5, r6)
        L68:
            r5.m6100(r11)
            goto L73
        L6c:
            r12 = -1400418868(0xffffffffac874dcc, float:-3.845568E-12)
            r5.m6082(r12)
            goto L68
        L73:
            u30 r6 = p000.AbstractC0978xb.f12112
            r9 = 24576(0x6000, float:3.4438E-41)
            ps0 r2 = r10.f6769
            boolean r3 = r10.f6770
            a80 r4 = r10.f6771
            a80 r10 = r10.f6772
            r8 = r5
            r5 = r10
            p000.pt0.m4592(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L88
        L85:
            r5.m6078()
        L88:
            s62 r10 = p000.s62.f9751
            return r10
    }
}
