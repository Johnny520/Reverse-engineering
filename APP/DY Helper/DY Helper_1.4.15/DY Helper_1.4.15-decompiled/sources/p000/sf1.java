package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sf1 {

    /* JADX INFO: renamed from: α */
    public final int f9887;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f9888;

    /* JADX INFO: renamed from: γ */
    public final int f9889;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9890;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Long f9891;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f9892;

    public sf1(int r1, java.lang.Integer r2, int r3, java.lang.String r4, java.lang.Long r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f9887 = r1
            r0.f9888 = r2
            r0.f9889 = r3
            r0.f9890 = r4
            r0.f9891 = r5
            r0.f9892 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof p000.sf1
            if (r0 != 0) goto L8
            goto L43
        L8:
            sf1 r3 = (p000.sf1) r3
            int r0 = r2.f9887
            int r1 = r3.f9887
            if (r0 == r1) goto L11
            goto L43
        L11:
            java.lang.Integer r0 = r2.f9888
            java.lang.Integer r1 = r3.f9888
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L43
        L1c:
            int r0 = r2.f9889
            int r1 = r3.f9889
            if (r0 == r1) goto L23
            goto L43
        L23:
            java.lang.String r0 = r2.f9890
            java.lang.String r1 = r3.f9890
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            java.lang.Long r0 = r2.f9891
            java.lang.Long r1 = r3.f9891
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L39
            goto L43
        L39:
            java.lang.String r2 = r2.f9892
            java.lang.String r3 = r3.f9892
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
        L43:
            r2 = 0
            return r2
        L45:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f9887
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.f9888
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f9889
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f9890
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f9891
            if (r3 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r3.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r4 = r4.f9892
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rc49cd4760c0d5d50"
            r0.<init>(r1)
            int r1 = r2.f9887
            r0.append(r1)
            java.lang.Integer r1 = r2.f9888
            r0.append(r1)
            int r1 = r2.f9889
            r0.append(r1)
            java.lang.String r1 = r2.f9890
            r0.append(r1)
            java.lang.Long r1 = r2.f9891
            r0.append(r1)
            java.lang.String r2 = r2.f9892
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
