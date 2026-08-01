package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p90 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8461;

    public p90(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f8461 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.p90
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p90 r4 = (p000.p90) r4
            java.lang.String r3 = r3.f8461
            java.lang.String r4 = r4.f8461
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f8461
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CachedResolution(value="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f8461
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            return r2
    }
}
