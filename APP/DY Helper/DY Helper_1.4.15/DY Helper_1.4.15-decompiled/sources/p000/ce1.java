package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f2088;

    /* JADX INFO: renamed from: β */
    public final int f2089;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f2090;

    public ce1(int r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f2088 = r2
            r0.f2089 = r1
            r0.f2090 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.ce1
            if (r0 != 0) goto L8
            goto L26
        L8:
            ce1 r3 = (p000.ce1) r3
            java.lang.String r0 = r2.f2088
            java.lang.String r1 = r3.f2088
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            int r0 = r2.f2089
            int r1 = r3.f2089
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.util.List r2 = r2.f2090
            java.util.List r3 = r3.f2090
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2088
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f2089
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.List r3 = r3.f2090
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", color="
            java.lang.String r1 = ", values="
            int r2 = r5.f2089
            java.lang.String r3 = "Series(label="
            java.lang.String r4 = r5.f2088
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r2, r3, r4, r0, r1)
            java.util.List r5 = r5.f2090
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
