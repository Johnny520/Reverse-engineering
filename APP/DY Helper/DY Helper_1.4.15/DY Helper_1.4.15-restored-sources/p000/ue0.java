package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 {

    /* JADX INFO: renamed from: α */
    public final int f10711;

    /* JADX INFO: renamed from: β */
    public final int f10712;

    /* JADX INFO: renamed from: γ */
    public final int f10713;

    /* JADX INFO: renamed from: δ */
    public final int f10714;

    /* JADX INFO: renamed from: ε */
    public final boolean f10715;

    /* JADX INFO: renamed from: ζ */
    public final boolean f10716;

    public ue0(int r1, int r2, int r3, int r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f10711 = r1
            r0.f10712 = r2
            r0.f10713 = r3
            r0.f10714 = r4
            r0.f10715 = r5
            r0.f10716 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ue0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ue0 r5 = (p000.ue0) r5
            int r1 = r4.f10711
            int r3 = r5.f10711
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f10712
            int r3 = r5.f10712
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f10713
            int r3 = r5.f10713
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.f10714
            int r3 = r5.f10714
            if (r1 == r3) goto L28
            return r2
        L28:
            boolean r1 = r4.f10715
            boolean r3 = r5.f10715
            if (r1 == r3) goto L2f
            return r2
        L2f:
            boolean r4 = r4.f10716
            boolean r5 = r5.f10716
            if (r4 == r5) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f10711
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10712
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10713
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10714
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f10715
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f10716
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", y="
            java.lang.String r1 = ", width="
            java.lang.String r2 = "FrameDisposal(x="
            int r3 = r5.f10711
            int r4 = r5.f10712
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", height="
            java.lang.String r2 = ", blendWithPrevious="
            int r3 = r5.f10713
            int r4 = r5.f10714
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            boolean r1 = r5.f10715
            r0.append(r1)
            java.lang.String r1 = ", clearAfterDisplay="
            r0.append(r1)
            boolean r5 = r5.f10716
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
