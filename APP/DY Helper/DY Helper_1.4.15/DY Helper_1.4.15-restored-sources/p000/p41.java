package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class p41 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f8415;

    /* JADX INFO: renamed from: β */
    public final float f8416;

    public p41(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f8415 = r1
            r0.f8416 = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.p41
            if (r1 == 0) goto Lb
            p41 r4 = (p000.p41) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r4 != 0) goto Lf
            goto L24
        Lf:
            float r1 = r3.f8415
            float r2 = r4.f8415
            boolean r1 = p000.C0408iv.m2806(r1, r2)
            if (r1 == 0) goto L24
            float r3 = r3.f8416
            float r4 = r4.f8416
            boolean r3 = p000.C0408iv.m2806(r3, r4)
            if (r3 == 0) goto L24
            return r0
        L24:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f8415
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r2.f8416
            int r2 = p000.lz1.m3676(r2, r0, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OffsetModifierElement(x="
            r0.<init>(r1)
            float r1 = r2.f8415
            java.lang.String r1 = p000.C0408iv.m2807(r1)
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            float r2 = r2.f8416
            java.lang.String r2 = p000.C0408iv.m2807(r2)
            r0.append(r2)
            java.lang.String r2 = ", rtlAware=true)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r2 = this;
            q41 r0 = new q41
            r0.<init>()
            float r1 = r2.f8415
            r0.f8857 = r1
            float r2 = r2.f8416
            r0.f8858 = r2
            r2 = 1
            r0.f8859 = r2
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r5) {
            r4 = this;
            q41 r5 = (p000.q41) r5
            float r0 = r5.f8857
            float r1 = r4.f8415
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            float r4 = r4.f8416
            r2 = 1
            if (r0 == 0) goto L1b
            float r0 = r5.f8858
            boolean r0 = p000.C0408iv.m2806(r0, r4)
            if (r0 == 0) goto L1b
            boolean r0 = r5.f8859
            if (r0 == r2) goto L23
        L1b:
            yp0 r0 = p000.h62.m2445(r5)
            r3 = 0
            r0.m6987(r3)
        L23:
            r5.f8857 = r1
            r5.f8858 = r4
            r5.f8859 = r2
            return
    }
}
