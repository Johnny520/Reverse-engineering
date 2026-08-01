package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 {

    /* JADX INFO: renamed from: α */
    public final int f12684;

    /* JADX INFO: renamed from: β */
    public final int f12685;

    /* JADX INFO: renamed from: γ */
    public final int f12686;

    /* JADX INFO: renamed from: δ */
    public final int f12687;

    public ym0(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f12684 = r1
            r0.f12685 = r2
            r0.f12686 = r3
            r0.f12687 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ym0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ym0 r5 = (p000.ym0) r5
            int r1 = r4.f12684
            int r3 = r5.f12684
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f12685
            int r3 = r5.f12685
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f12686
            int r3 = r5.f12686
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.f12687
            int r5 = r5.f12687
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f12684
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f12685
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f12686
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f12687
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntRect.fromLTRB("
            r0.<init>(r1)
            int r1 = r3.f12684
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r2 = r3.f12685
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.f12686
            r0.append(r2)
            r0.append(r1)
            int r3 = r3.f12687
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
