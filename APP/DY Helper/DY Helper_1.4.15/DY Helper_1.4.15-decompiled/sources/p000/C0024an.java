package p000;

/* JADX INFO: renamed from: an */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0024an implements p000.e80, p000.f80, p000.g80, p000.h80, p000.i80, p000.j80, p000.k80, p000.l80, p000.q70, p000.r70, p000.t70, p000.u70, p000.v70, p000.w70, p000.x70, p000.y70, p000.z70, p000.b80, p000.c80 {

    /* JADX INFO: renamed from: ε */
    public final int f328;

    /* JADX INFO: renamed from: ζ */
    public final boolean f329;

    /* JADX INFO: renamed from: η */
    public p000.m80 f330;

    /* JADX INFO: renamed from: θ */
    public p000.bl1 f331;

    /* JADX INFO: renamed from: ι */
    public java.util.ArrayList f332;

    public C0024an(int r1, boolean r2, p000.m80 r3) {
            r0 = this;
            r0.<init>()
            r0.f328 = r1
            r0.f329 = r2
            r0.f330 = r3
            return
    }

    @Override // p000.e80
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            v80 r1 = (p000.v80) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.m180(r1, r2)
            return r0
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final /* bridge */ /* synthetic */ java.lang.Object mo10(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            v80 r2 = (p000.v80) r2
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.m181(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m180(p000.v80 r7, int r8) {
            r6 = this;
            int r0 = r6.f328
            r7.m6083(r0)
            r6.m184(r7)
            boolean r0 = r7.m6090(r6)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L15
            int r0 = p000.kn0.m3366(r1, r2)
            goto L1a
        L15:
            r0 = 1
            int r0 = p000.kn0.m3366(r0, r2)
        L1a:
            r8 = r8 | r0
            m80 r0 = r6.f330
            p000.h62.m2394(r1, r0)
            e80 r0 = (p000.e80) r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r0.invoke(r7, r8)
            bl1 r7 = r7.m6101()
            if (r7 == 0) goto L3f
            zm r0 = new zm
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"
            r1 = 2
            java.lang.Class<an> r2 = p000.C0024an.class
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f1780 = r0
        L3f:
            return r8
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m181(java.lang.Object r4, p000.v80 r5, int r6) {
            r3 = this;
            int r0 = r3.f328
            r5.m6083(r0)
            r3.m184(r5)
            boolean r0 = r5.m6090(r3)
            r1 = 1
            if (r0 == 0) goto L15
            r0 = 2
            int r0 = p000.kn0.m3366(r0, r1)
            goto L19
        L15:
            int r0 = p000.kn0.m3366(r1, r1)
        L19:
            r0 = r0 | r6
            m80 r1 = r3.f330
            r2 = 3
            p000.h62.m2394(r2, r1)
            f80 r1 = (p000.f80) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.mo10(r4, r5, r0)
            bl1 r5 = r5.m6101()
            if (r5 == 0) goto L38
            ym r1 = new ym
            r2 = 0
            r1.<init>(r6, r2, r3, r4)
            r5.f1780 = r1
        L38:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m182(java.lang.Object r4, java.lang.Object r5, p000.v80 r6, int r7) {
            r3 = this;
            int r0 = r3.f328
            r6.m6083(r0)
            r3.m184(r6)
            boolean r0 = r6.m6090(r3)
            r1 = 2
            if (r0 == 0) goto L14
            int r0 = p000.kn0.m3366(r1, r1)
            goto L19
        L14:
            r0 = 1
            int r0 = p000.kn0.m3366(r0, r1)
        L19:
            r0 = r0 | r7
            m80 r1 = r3.f330
            r2 = 4
            p000.h62.m2394(r2, r1)
            g80 r1 = (p000.g80) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.mo183(r4, r5, r6, r0)
            bl1 r6 = r6.m6101()
            if (r6 == 0) goto L37
            jc r1 = new jc
            r1.<init>(r3, r4, r5, r7)
            r6.f1780 = r1
        L37:
            return r0
    }

    @Override // p000.g80
    /* JADX INFO: renamed from: ε */
    public final /* bridge */ /* synthetic */ java.lang.Object mo183(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            v80 r3 = (p000.v80) r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.m182(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m184(p000.v80 r4) {
            r3 = this;
            boolean r0 = r3.f329
            if (r0 == 0) goto L47
            bl1 r4 = r4.m6107()
            if (r4 == 0) goto L47
            int r0 = r4.f1778
            r0 = r0 | 1
            r4.f1778 = r0
            bl1 r0 = r3.f331
            boolean r0 = p000.kn0.m3350(r0, r4)
            if (r0 == 0) goto L1b
            r3.f331 = r4
            return
        L1b:
            java.util.ArrayList r0 = r3.f332
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f332 = r0
            r0.add(r4)
            return
        L2a:
            int r3 = r0.size()
            r1 = 0
        L2f:
            if (r1 >= r3) goto L44
            java.lang.Object r2 = r0.get(r1)
            bl1 r2 = (p000.bl1) r2
            boolean r2 = p000.kn0.m3350(r2, r4)
            if (r2 == 0) goto L41
            r0.set(r1, r4)
            return
        L41:
            int r1 = r1 + 1
            goto L2f
        L44:
            r0.add(r4)
        L47:
            return
    }
}
