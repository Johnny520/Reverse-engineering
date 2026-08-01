package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class op0 {

    /* JADX INFO: renamed from: α */
    public final int f8169;

    /* JADX INFO: renamed from: β */
    public final int f8170;

    /* JADX INFO: renamed from: γ */
    public final boolean f8171;

    public op0(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f8169 = r1
            r0.f8170 = r2
            r0.f8171 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.op0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            op0 r5 = (p000.op0) r5
            int r1 = r4.f8169
            int r3 = r5.f8169
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f8170
            int r3 = r5.f8170
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r4 = r4.f8171
            boolean r5 = r5.f8171
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f8169
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f8170
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r3 = r3.f8171
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BidiRun(start="
            r0.<init>(r1)
            int r1 = r2.f8169
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r2.f8170
            r0.append(r1)
            java.lang.String r1 = ", isRtl="
            r0.append(r1)
            boolean r2 = r2.f8171
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
