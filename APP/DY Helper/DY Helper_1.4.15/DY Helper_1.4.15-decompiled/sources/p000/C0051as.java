package p000;

/* JADX INFO: renamed from: as */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0051as implements p000.InterfaceC1031yr {

    /* JADX INFO: renamed from: ε */
    public final float f1289;

    /* JADX INFO: renamed from: ζ */
    public final float f1290;

    /* JADX INFO: renamed from: η */
    public final p000.y50 f1291;

    public C0051as(float r1, float r2, p000.y50 r3) {
            r0 = this;
            r0.<init>()
            r0.f1289 = r1
            r0.f1290 = r2
            r0.f1291 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C0051as
            if (r0 != 0) goto L8
            goto L2a
        L8:
            as r3 = (p000.C0051as) r3
            float r0 = r2.f1289
            float r1 = r3.f1289
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L2a
        L15:
            float r0 = r2.f1290
            float r1 = r3.f1290
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L2a
        L20:
            y50 r2 = r2.f1291
            y50 r3 = r3.f1291
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f1289
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f1290
            int r0 = p000.lz1.m3676(r2, r0, r1)
            y50 r3 = r3.f1291
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityWithConverter(density="
            r0.<init>(r1)
            float r1 = r2.f1289
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r1 = r2.f1290
            r0.append(r1)
            java.lang.String r1 = ", converter="
            r0.append(r1)
            y50 r2 = r2.f1291
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Θ */
    public final float mo581(long r5) {
            r4 = this;
            long r0 = p000.y32.m6819(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = p000.z32.m7086(r0, r2)
            if (r0 == 0) goto L1a
            y50 r4 = r4.f1291
            float r5 = p000.y32.m6820(r5)
            float r4 = r4.mo44(r5)
            return r4
        L1a:
            java.lang.String r4 = "Only Sp can convert to Px"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            float r0 = r0.f1289
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            float r0 = r0.f1290
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: σ */
    public final long mo592(float r3) {
            r2 = this;
            y50 r2 = r2.f1291
            float r2 = r2.mo43(r3)
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = p000.u81.m5814(r0, r2)
            return r2
    }
}
