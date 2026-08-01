package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g52 {

    /* JADX INFO: renamed from: α */
    public final int f4256;

    public g52(int r1) {
            r0 = this;
            r0.<init>()
            r0.f4256 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.g52
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g52 r4 = (p000.g52) r4
            int r3 = r3.f4256
            int r4 = r4.f4256
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f4256
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Style(bgAlphaPercent="
            java.lang.String r1 = ")"
            int r2 = r2.f4256
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r0, r2, r1)
            return r2
    }
}
