package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 {

    /* JADX INFO: renamed from: α */
    public final int f10447;

    /* JADX INFO: renamed from: β */
    public final int f10448;

    /* JADX INFO: renamed from: γ */
    public final int f10449;

    /* JADX INFO: renamed from: δ */
    public final int f10450;

    public tt0(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f10447 = r1
            r0.f10448 = r2
            r0.f10449 = r3
            r0.f10450 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.tt0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tt0 r5 = (p000.tt0) r5
            int r1 = r4.f10447
            int r3 = r5.f10447
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f10448
            int r3 = r5.f10448
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f10449
            int r3 = r5.f10449
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.f10450
            int r5 = r5.f10450
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f10447
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10448
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10449
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f10450
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", top="
            java.lang.String r1 = ", right="
            java.lang.String r2 = "LiquidGlassPanelBounds(left="
            int r3 = r5.f10447
            int r4 = r5.f10448
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            int r1 = r5.f10449
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r5 = r5.f10450
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
