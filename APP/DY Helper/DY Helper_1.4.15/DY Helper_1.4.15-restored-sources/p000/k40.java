package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k40 implements p000.g40 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5751;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f5752;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f5753;

    /* JADX INFO: renamed from: θ */
    public final p000.y12 f5754;

    public k40(p000.g40 r3, p000.InterfaceC0880up r4) {
            r2 = this;
            r0 = 1
            r2.f5751 = r0
            r2.<init>()
            r2.f5752 = r4
            java.lang.Object r4 = p000.pd2.m4478(r4)
            r2.f5753 = r4
            oe r4 = new oe
            r0 = 0
            r1 = 3
            r4.<init>(r3, r0, r1)
            r2.f5754 = r4
            return
    }

    public k40(p000.qm1 r2, p000.g40 r3, p000.gl1 r4) {
            r1 = this;
            r0 = 0
            r1.f5751 = r0
            r1.<init>()
            r1.f5752 = r2
            r1.f5753 = r3
            r1.f5754 = r4
            return
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r8, p000.InterfaceC0631op r9) {
            r7 = this;
            int r0 = r7.f5751
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f5752
            up r0 = (p000.InterfaceC0880up) r0
            y12 r1 = r7.f5754
            oe r1 = (p000.C0620oe) r1
            java.lang.Object r7 = r7.f5753
            java.lang.Object r7 = p000.kn0.m3357(r0, r8, r7, r1, r9)
            cq r8 = p000.EnumC0184cq.f2716
            if (r7 != r8) goto L18
            goto L1a
        L18:
            s62 r7 = p000.s62.f9751
        L1a:
            return r7
        L1b:
            boolean r0 = r9 instanceof p000.j40
            if (r0 == 0) goto L2e
            r0 = r9
            j40 r0 = (p000.j40) r0
            int r1 = r0.f5312
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.f5312 = r1
            goto L33
        L2e:
            j40 r0 = new j40
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.f5310
            int r1 = r0.f5312
            r2 = 3
            r3 = 2
            s62 r4 = p000.s62.f9751
            r5 = 1
            cq r6 = p000.EnumC0184cq.f2716
            if (r1 == 0) goto L59
            if (r1 == r5) goto L46
            if (r1 == r3) goto L51
            if (r1 != r2) goto L4a
        L46:
            p000.i81.m2649(r9)
            goto La2
        L4a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r4 = 0
            goto La2
        L51:
            java.lang.Object r8 = r0.f5309
            k40 r7 = r0.f5308
            p000.i81.m2649(r9)
            goto L82
        L59:
            p000.i81.m2649(r9)
            java.lang.Object r9 = r7.f5752
            qm1 r9 = (p000.qm1) r9
            boolean r9 = r9.f9050
            if (r9 == 0) goto L71
            java.lang.Object r7 = r7.f5753
            g40 r7 = (p000.g40) r7
            r0.f5312 = r5
            java.lang.Object r7 = r7.mo1985(r8, r0)
            if (r7 != r6) goto La2
            goto La1
        L71:
            y12 r9 = r7.f5754
            gl1 r9 = (p000.gl1) r9
            r0.f5308 = r7
            r0.f5309 = r8
            r0.f5312 = r3
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r6) goto L82
            goto La1
        L82:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto La2
            java.lang.Object r9 = r7.f5752
            qm1 r9 = (p000.qm1) r9
            r9.f9050 = r5
            java.lang.Object r7 = r7.f5753
            g40 r7 = (p000.g40) r7
            r9 = 0
            r0.f5308 = r9
            r0.f5309 = r9
            r0.f5312 = r2
            java.lang.Object r7 = r7.mo1985(r8, r0)
            if (r7 != r6) goto La2
        La1:
            r4 = r6
        La2:
            return r4
    }
}
