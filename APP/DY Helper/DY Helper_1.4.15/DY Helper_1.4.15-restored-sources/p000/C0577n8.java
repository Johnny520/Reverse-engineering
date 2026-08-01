package p000;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class C0577n8 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final long f7453;

    /* JADX INFO: renamed from: β */
    public final float f7454;

    /* JADX INFO: renamed from: γ */
    public final p000.iv1 f7455;

    public C0577n8(long r1, p000.iv1 r3) {
            r0 = this;
            r0.<init>()
            r0.f7453 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f7454 = r1
            r0.f7455 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p000.C0577n8
            if (r0 == 0) goto L7
            n8 r5 = (p000.C0577n8) r5
            goto L8
        L7:
            r5 = 0
        L8:
            if (r5 != 0) goto Lb
            goto L29
        Lb:
            long r0 = r4.f7453
            long r2 = r5.f7453
            boolean r0 = p000.C0114ci.m1192(r0, r2)
            if (r0 == 0) goto L29
            float r0 = r4.f7454
            float r1 = r5.f7454
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L29
            iv1 r4 = r4.f7455
            iv1 r5 = r5.f7455
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L29
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r3 = this;
            int r0 = p000.C0114ci.f2126
            long r0 = r3.f7453
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 961
            float r1 = r3.f7454
            r2 = 31
            int r0 = p000.lz1.m3676(r1, r0, r2)
            iv1 r3 = r3.f7455
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            o8 r0 = new o8
            r0.<init>()
            long r1 = r3.f7453
            r0.f7978 = r1
            iv1 r3 = r3.f7455
            r0.f7979 = r3
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.f7980 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r3) {
            r2 = this;
            o8 r3 = (p000.C0614o8) r3
            long r0 = r2.f7453
            r3.f7978 = r0
            iv1 r0 = r3.f7979
            iv1 r2 = r2.f7455
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L15
            r3.f7979 = r2
            p000.i91.m2685(r3)
        L15:
            p000.AbstractC1021yh.m6865(r3)
            return
    }
}
