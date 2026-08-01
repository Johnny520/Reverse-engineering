package p000;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0225dv {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3298;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3299;

    public C0225dv(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f3298 = r1
            r0.f3299 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0225dv
            if (r0 != 0) goto L8
            goto L1f
        L8:
            dv r3 = (p000.C0225dv) r3
            java.lang.String r0 = r2.f3298
            java.lang.String r1 = r3.f3298
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r2 = r2.f3299
            java.lang.String r3 = r3.f3299
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f3298
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f3299
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", subDir="
            java.lang.String r1 = ")"
            java.lang.String r2 = "MediaRootOverride(rootDir="
            java.lang.String r3 = r4.f3298
            java.lang.String r4 = r4.f3299
            java.lang.String r4 = p000.lz1.m3689(r2, r3, r0, r4, r1)
            return r4
    }
}
