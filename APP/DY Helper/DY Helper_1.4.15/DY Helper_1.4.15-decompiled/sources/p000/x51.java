package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x51 extends p000.o61 {

    /* JADX INFO: renamed from: δ */
    public static final p000.x51 f12056 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.x51 f12057 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.x51 f12058 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.x51 f12059 = null;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ int f12060;

    static {
            x51 r0 = new x51
            r1 = 2
            r2 = 0
            r3 = 1
            r0.<init>(r3, r1, r2)
            p000.x51.f12056 = r0
            x51 r0 = new x51
            r1 = 1
            r2 = 1
            r0.<init>(r1, r1, r2)
            p000.x51.f12057 = r0
            x51 r0 = new x51
            r1 = 2
            r2 = 2
            r0.<init>(r3, r1, r2)
            p000.x51.f12058 = r0
            x51 r0 = new x51
            r1 = 1
            r2 = 3
            r0.<init>(r1, r1, r2)
            p000.x51.f12059 = r0
            return
    }

    public /* synthetic */ x51(int r1, int r2, int r3) {
            r0 = this;
            r0.f12060 = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r2, p000.InterfaceC0676p6 r3, p000.rw1 r4, p000.en1 r5, p000.r71 r6) {
            r1 = this;
            int r1 = r1.f12060
            switch(r1) {
                case 0: goto L93;
                case 1: goto L76;
                case 2: goto L39;
                default: goto L5;
            }
        L5:
            r1 = 0
            java.lang.Object r3 = r2.m2056(r1)
            int r1 = r2.m2055(r1)
            boolean r2 = r3 instanceof p000.a90
            if (r2 == 0) goto L1f
            r2 = r3
            a90 r2 = (p000.a90) r2
            k21 r6 = r5.f3607
            r6.m3127(r2)
            c21 r6 = r5.f3606
            r6.m1107(r2)
        L1f:
            int r2 = r4.f9557
            java.lang.Object r1 = r4.m5140(r2, r1, r3)
            boolean r2 = r1 instanceof p000.a90
            if (r2 == 0) goto L2f
            a90 r1 = (p000.a90) r1
            r5.m1940(r1)
            goto L38
        L2f:
            boolean r2 = r1 instanceof p000.bl1
            if (r2 == 0) goto L38
            bl1 r1 = (p000.bl1) r1
            r1.m980()
        L38:
            return
        L39:
            r1 = 0
            java.lang.Object r3 = r2.m2056(r1)
            r6 = 1
            java.lang.Object r6 = r2.m2056(r6)
            q80 r6 = (p000.q80) r6
            int r1 = r2.m2055(r1)
            boolean r2 = r3 instanceof p000.a90
            if (r2 == 0) goto L5a
            r2 = r3
            a90 r2 = (p000.a90) r2
            k21 r0 = r5.f3607
            r0.m3127(r2)
            c21 r0 = r5.f3606
            r0.m1107(r2)
        L5a:
            int r2 = r4.m5153(r6)
            java.lang.Object r1 = r4.m5140(r2, r1, r3)
            boolean r2 = r1 instanceof p000.a90
            if (r2 == 0) goto L6c
            a90 r1 = (p000.a90) r1
            r5.m1940(r1)
            goto L75
        L6c:
            boolean r2 = r1 instanceof p000.bl1
            if (r2 == 0) goto L75
            bl1 r1 = (p000.bl1) r1
            r1.m980()
        L75:
            return
        L76:
            r1 = 0
            java.lang.Object r5 = r2.m2056(r1)
            q80 r5 = (p000.q80) r5
            int r1 = r2.m2055(r1)
            r3.mo3780()
            r5.getClass()
            int r2 = r4.m5153(r5)
            java.lang.Object r2 = r4.m5133(r2)
            r3.mo3772(r1, r2)
            return
        L93:
            r1 = 0
            java.lang.Object r5 = r2.m2056(r1)
            p70 r5 = (p000.p70) r5
            java.lang.Object r5 = r5.invoke()
            r6 = 1
            java.lang.Object r6 = r2.m2056(r6)
            q80 r6 = (p000.q80) r6
            int r1 = r2.m2055(r1)
            r6.getClass()
            int r2 = r4.m5153(r6)
            r4.m5150(r2, r5)
            r3.mo3775(r1, r5)
            r3.mo3773(r5)
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: β */
    public p000.q80 mo4213(p000.f81 r2) {
            r1 = this;
            int r0 = r1.f12060
            switch(r0) {
                case 0: goto L12;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            q80 r1 = super.mo4213(r2)
            return r1
        La:
            r1 = 0
            java.lang.Object r1 = r2.m2056(r1)
            q80 r1 = (p000.q80) r1
            return r1
        L12:
            r1 = 1
            java.lang.Object r1 = r2.m2056(r1)
            q80 r1 = (p000.q80) r1
            return r1
    }
}
