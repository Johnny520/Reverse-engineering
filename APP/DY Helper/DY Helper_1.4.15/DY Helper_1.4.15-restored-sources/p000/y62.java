package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y62 extends p000.q01 implements p000.qp0 {

    /* JADX INFO: renamed from: τ */
    public float f12474;

    /* JADX INFO: renamed from: υ */
    public float f12475;

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r5, p000.kx0 r6, long r7) {
            r4 = this;
            float r0 = r4.f12474
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 != 0) goto L21
            int r0 = p000.C1028yo.m6955(r7)
            if (r0 != 0) goto L21
            float r0 = r4.f12474
            int r0 = r5.mo583(r0)
            int r2 = p000.C1028yo.m6953(r7)
            if (r0 >= 0) goto L1c
            r0 = r1
        L1c:
            if (r0 <= r2) goto L1f
            goto L25
        L1f:
            r2 = r0
            goto L25
        L21:
            int r2 = p000.C1028yo.m6955(r7)
        L25:
            int r0 = p000.C1028yo.m6953(r7)
            float r3 = r4.f12475
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L4a
            int r3 = p000.C1028yo.m6954(r7)
            if (r3 != 0) goto L4a
            float r4 = r4.f12475
            int r4 = r5.mo583(r4)
            int r3 = p000.C1028yo.m6952(r7)
            if (r4 >= 0) goto L44
            goto L45
        L44:
            r1 = r4
        L45:
            if (r1 <= r3) goto L48
            goto L4e
        L48:
            r3 = r1
            goto L4e
        L4a:
            int r3 = p000.C1028yo.m6954(r7)
        L4e:
            int r4 = p000.C1028yo.m6952(r7)
            long r7 = p000.AbstractC1065zo.m7207(r2, r0, r3, r4)
            ch1 r4 = r6.mo2146(r7)
            int r6 = r4.f2115
            int r7 = r4.f2116
            v30 r8 = new v30
            r0 = 3
            r8.<init>(r4, r0)
            kz r4 = p000.C0493kz.f6332
            qx0 r4 = r5.mo1612(r6, r7, r4, r8)
            return r4
    }
}
