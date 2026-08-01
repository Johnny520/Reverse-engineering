package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l31 implements p000.m31 {
    @Override // p000.m31
    /* JADX INFO: renamed from: α */
    public final boolean mo3477(p000.q01 r7) {
            r6 = this;
            r6 = 0
            r0 = r6
        L2:
            r1 = 0
            if (r7 == 0) goto L4d
            boolean r2 = r7 instanceof p000.di1
            r3 = 1
            if (r2 == 0) goto L13
            di1 r7 = (p000.di1) r7
            boolean r7 = r7.mo1751()
            if (r7 == 0) goto L48
            return r3
        L13:
            int r2 = r7.f8773
            r4 = 16
            r2 = r2 & r4
            if (r2 == 0) goto L48
            boolean r2 = r7 instanceof p000.C1014ya
            if (r2 == 0) goto L48
            r2 = r7
            ya r2 = (p000.C1014ya) r2
            q01 r2 = r2.f12512
        L23:
            if (r2 == 0) goto L45
            int r5 = r2.f8773
            r5 = r5 & r4
            if (r5 == 0) goto L42
            int r1 = r1 + 1
            if (r1 != r3) goto L30
            r7 = r2
            goto L42
        L30:
            if (r0 != 0) goto L39
            k21 r0 = new k21
            q01[] r5 = new p000.q01[r4]
            r0.<init>(r5)
        L39:
            if (r7 == 0) goto L3f
            r0.m3127(r7)
            r7 = r6
        L3f:
            r0.m3127(r2)
        L42:
            q01 r2 = r2.f8776
            goto L23
        L45:
            if (r1 != r3) goto L48
            goto L2
        L48:
            q01 r7 = p000.h62.m2387(r0)
            goto L2
        L4d:
            return r1
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: β */
    public final int mo3478() {
            r0 = this;
            r0 = 16
            return r0
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: δ */
    public final void mo3479(p000.yp0 r1, long r2, p000.ne0 r4, int r5, boolean r6) {
            r0 = this;
            r1.m7010(r2, r4, r5, r6)
            return
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: ζ */
    public final boolean mo3480(p000.ne0 r9, p000.yp0 r10) {
            r8 = this;
            k31 r8 = r10.f12733
            q31 r8 = r8.f5727
            r8.getClass()
            r10 = 16
            boolean r0 = p000.r31.m5060(r10)
            q01 r8 = r8.m4739(r0)
            r0 = 0
            if (r8 != 0) goto L16
            goto L89
        L16:
            boolean r1 = r8.f8784
            if (r1 == 0) goto L89
            q01 r1 = r8.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto L25
            java.lang.String r1 = "visitLocalDescendants called on an unattached node"
            p000.am0.m178(r1)
        L25:
            q01 r8 = r8.f8771
            int r1 = r8.f8774
            r1 = r1 & r10
            if (r1 == 0) goto L89
        L2c:
            if (r8 == 0) goto L89
            int r1 = r8.f8773
            r1 = r1 & r10
            if (r1 == 0) goto L86
            r1 = 0
            r2 = r8
            r3 = r1
        L36:
            if (r2 == 0) goto L86
            boolean r4 = r2 instanceof p000.di1
            r5 = 1
            if (r4 == 0) goto L4d
            di1 r2 = (p000.di1) r2
            boolean r2 = r2.mo1748()
            if (r2 == 0) goto L81
            v11 r8 = r9.f7580
            int r8 = r8.f11065
            int r8 = r8 - r5
            r9.f7582 = r8
            return r5
        L4d:
            int r4 = r2.f8773
            r4 = r4 & r10
            if (r4 == 0) goto L81
            boolean r4 = r2 instanceof p000.C1014ya
            if (r4 == 0) goto L81
            r4 = r2
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r6 = r0
        L5c:
            if (r4 == 0) goto L7e
            int r7 = r4.f8773
            r7 = r7 & r10
            if (r7 == 0) goto L7b
            int r6 = r6 + 1
            if (r6 != r5) goto L69
            r2 = r4
            goto L7b
        L69:
            if (r3 != 0) goto L72
            k21 r3 = new k21
            q01[] r7 = new p000.q01[r10]
            r3.<init>(r7)
        L72:
            if (r2 == 0) goto L78
            r3.m3127(r2)
            r2 = r1
        L78:
            r3.m3127(r4)
        L7b:
            q01 r4 = r4.f8776
            goto L5c
        L7e:
            if (r6 != r5) goto L81
            goto L36
        L81:
            q01 r2 = p000.h62.m2387(r3)
            goto L36
        L86:
            q01 r8 = r8.f8776
            goto L2c
        L89:
            return r0
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: θ */
    public final boolean mo3481(p000.yp0 r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
