package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d62 implements java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f2926;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f2927;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f2928;

    public d62(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f2926 = r1
            r0.f2927 = r2
            r0.f2928 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.d62
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d62 r5 = (p000.d62) r5
            java.lang.Object r1 = r4.f2926
            java.lang.Object r3 = r5.f2926
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.f2927
            java.lang.Object r3 = r5.f2927
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object r4 = r4.f2928
            java.lang.Object r5 = r5.f2928
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f2926
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f2927
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r3 = r3.f2928
            if (r3 != 0) goto L1f
            goto L23
        L1f:
            int r0 = r3.hashCode()
        L23:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r3.f2926
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r2 = r3.f2927
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.f2928
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m1666() {
            r0 = this;
            java.lang.Object r0 = r0.f2926
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m1667() {
            r0 = this;
            java.lang.Object r0 = r0.f2927
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m1668() {
            r0 = this;
            java.lang.Object r0 = r0.f2928
            return r0
    }
}
