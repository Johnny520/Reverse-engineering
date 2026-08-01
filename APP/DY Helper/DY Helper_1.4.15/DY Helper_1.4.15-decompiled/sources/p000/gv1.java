package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f4480;

    /* JADX INFO: renamed from: β */
    public final p000.iv1 f4481;

    /* JADX INFO: renamed from: γ */
    public final long f4482;

    /* JADX INFO: renamed from: δ */
    public final long f4483;

    public gv1(float r1, p000.iv1 r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f4480 = r1
            r0.f4481 = r2
            r0.f4482 = r3
            r0.f4483 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L37
        L3:
            boolean r0 = r5 instanceof p000.gv1
            if (r0 != 0) goto L8
            goto L35
        L8:
            gv1 r5 = (p000.gv1) r5
            float r0 = r4.f4480
            float r1 = r5.f4480
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            iv1 r0 = r4.f4481
            iv1 r1 = r5.f4481
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            long r0 = r4.f4482
            long r2 = r5.f4482
            boolean r0 = p000.C0114ci.m1192(r0, r2)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            long r0 = r4.f4483
            long r4 = r5.f4483
            boolean r4 = p000.C0114ci.m1192(r0, r4)
            if (r4 != 0) goto L37
        L35:
            r4 = 0
            return r4
        L37:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.f4480
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            iv1 r2 = r4.f4481
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            int r0 = p000.lz1.m3678(r2, r1, r0)
            int r2 = p000.C0114ci.f2126
            long r2 = r4.f4482
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f4483
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShadowGraphicsLayerElement(elevation="
            r0.<init>(r1)
            float r1 = r3.f4480
            java.lang.String r1 = p000.C0408iv.m2807(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            iv1 r1 = r3.f4481
            r0.append(r1)
            java.lang.String r1 = ", clip=false, ambientColor="
            r0.append(r1)
            long r1 = r3.f4482
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotColor="
            r0.append(r1)
            long r1 = r3.f4483
            java.lang.String r3 = p000.C0114ci.m1198(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            ia r0 = new ia
            b0 r1 = new b0
            r2 = 20
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r3) {
            r2 = this;
            ia r3 = (p000.C0389ia) r3
            b0 r0 = new b0
            r1 = 20
            r0.<init>(r1, r2)
            r3.f4970 = r0
            q01 r2 = r3.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L12
            goto L1f
        L12:
            r2 = 2
            q31 r2 = p000.h62.m2443(r3, r2)
            q31 r2 = r2.f8840
            if (r2 == 0) goto L1f
            r3 = 1
            r2.m4758(r0, r3)
        L1f:
            return
    }
}
