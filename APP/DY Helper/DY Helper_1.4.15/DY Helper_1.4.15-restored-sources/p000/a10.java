package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a10 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f42;

    /* JADX INFO: renamed from: β */
    public final boolean f43;

    public a10(java.util.ArrayList r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f42 = r1
            r0.f43 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.a10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a10 r5 = (p000.a10) r5
            java.util.List r1 = r4.f42
            java.util.List r3 = r5.f42
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r4 = r4.f43
            boolean r5 = r5.f43
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.f42
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            boolean r1 = r1.f43
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoData(urls="
            r0.<init>(r1)
            java.util.List r1 = r2.f42
            r0.append(r1)
            java.lang.String r1 = ", hasWatermark="
            r0.append(r1)
            boolean r2 = r2.f43
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m12() {
            r0 = this;
            boolean r0 = r0.f43
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.util.List m13() {
            r0 = this;
            java.util.List r0 = r0.f42
            return r0
    }
}
