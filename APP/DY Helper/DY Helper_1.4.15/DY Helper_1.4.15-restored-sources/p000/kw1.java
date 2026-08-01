package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class kw1 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f6140;

    /* JADX INFO: renamed from: β */
    public final float f6141;

    /* JADX INFO: renamed from: γ */
    public final float f6142;

    /* JADX INFO: renamed from: δ */
    public final float f6143;

    /* JADX INFO: renamed from: ε */
    public final boolean f6144;

    public kw1(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f6140 = r1
            r0.f6141 = r2
            r0.f6142 = r3
            r0.f6143 = r4
            r1 = 1
            r0.f6144 = r1
            return
    }

    public /* synthetic */ kw1(float r3, float r4, float r5, float r6, int r7) {
            r2 = this;
            r0 = r7 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r7 & 4
            if (r0 == 0) goto L11
            r5 = r1
        L11:
            r7 = r7 & 8
            if (r7 == 0) goto L16
            r6 = r1
        L16:
            r2.<init>(r3, r4, r5, r6)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof p000.kw1
            if (r0 != 0) goto L8
            goto L3c
        L8:
            kw1 r3 = (p000.kw1) r3
            float r0 = r3.f6140
            float r1 = r2.f6140
            boolean r0 = p000.C0408iv.m2806(r1, r0)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            float r0 = r2.f6141
            float r1 = r3.f6141
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            float r0 = r2.f6142
            float r1 = r3.f6142
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            float r0 = r2.f6143
            float r1 = r3.f6143
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r2.f6144
            boolean r3 = r3.f6144
            if (r2 == r3) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f6140
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f6141
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f6142
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f6143
            int r0 = p000.lz1.m3676(r2, r0, r1)
            boolean r3 = r3.f6144
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r2 = this;
            lw1 r0 = new lw1
            r0.<init>()
            float r1 = r2.f6140
            r0.f6824 = r1
            float r1 = r2.f6141
            r0.f6825 = r1
            float r1 = r2.f6142
            r0.f6826 = r1
            float r1 = r2.f6143
            r0.f6827 = r1
            boolean r2 = r2.f6144
            r0.f6828 = r2
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r2) {
            r1 = this;
            lw1 r2 = (p000.lw1) r2
            float r0 = r1.f6140
            r2.f6824 = r0
            float r0 = r1.f6141
            r2.f6825 = r0
            float r0 = r1.f6142
            r2.f6826 = r0
            float r0 = r1.f6143
            r2.f6827 = r0
            boolean r1 = r1.f6144
            r2.f6828 = r1
            return
    }
}
