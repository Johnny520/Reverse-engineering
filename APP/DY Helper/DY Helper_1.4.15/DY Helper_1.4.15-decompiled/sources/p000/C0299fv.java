package p000;

/* JADX INFO: renamed from: fv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0299fv {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4139;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4140;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4141;

    public C0299fv(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f4139 = r1
            r0.f4140 = r2
            r0.f4141 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0299fv m2204(p000.C0299fv r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = r1.f4139
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            java.lang.String r3 = r1.f4140
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            java.lang.String r4 = r1.f4141
        L12:
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            fv r1 = new fv
            r1.<init>(r2, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0299fv
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fv r5 = (p000.C0299fv) r5
            java.lang.String r1 = r4.f4139
            java.lang.String r3 = r5.f4139
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4140
            java.lang.String r3 = r5.f4140
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.f4141
            java.lang.String r5 = r5.f4141
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4139
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4140
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f4141
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", fileStem="
            java.lang.String r1 = ", preview="
            java.lang.String r2 = "ResolvedPath(relativeDir="
            java.lang.String r3 = r5.f4139
            java.lang.String r4 = r5.f4140
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f4141
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
