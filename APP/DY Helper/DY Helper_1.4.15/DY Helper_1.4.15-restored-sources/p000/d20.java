package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d20 {

    /* JADX INFO: renamed from: α */
    public final long f2846;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f2847;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f2848;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f2849;

    public d20(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f2846 = r3
            r0.f2847 = r1
            r0.f2848 = r2
            r0.f2849 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof p000.d20
            if (r0 != 0) goto L8
            goto L33
        L8:
            d20 r5 = (p000.d20) r5
            long r0 = r4.f2846
            long r2 = r5.f2846
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L33
        L13:
            java.lang.String r0 = r4.f2847
            java.lang.String r1 = r5.f2847
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L33
        L1e:
            java.lang.String r0 = r4.f2848
            java.lang.String r1 = r5.f2848
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L33
        L29:
            java.lang.String r4 = r4.f2849
            java.lang.String r5 = r5.f2849
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
        L33:
            r4 = 0
            return r4
        L35:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f2846
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2847
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f2848
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f2849
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayTextCache(generation="
            r0.<init>(r1)
            long r1 = r4.f2846
            r0.append(r1)
            java.lang.String r1 = ", awemeId="
            r0.append(r1)
            java.lang.String r1 = r4.f2847
            r0.append(r1)
            java.lang.String r1 = ", format="
            java.lang.String r2 = ", text="
            java.lang.String r3 = r4.f2848
            java.lang.String r4 = r4.f2849
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
