package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v11 {

    /* JADX INFO: renamed from: α */
    public java.lang.Object[] f11064;

    /* JADX INFO: renamed from: β */
    public int f11065;

    public /* synthetic */ v11() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public v11(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            java.lang.Object[] r1 = p000.a41.f64
            goto La
        L8:
            java.lang.Object[] r1 = new java.lang.Object[r1]
        La:
            r0.f11064 = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof p000.v11
            r1 = 0
            if (r0 == 0) goto L2e
            v11 r6 = (p000.v11) r6
            int r0 = r6.f11065
            int r2 = r5.f11065
            if (r0 == r2) goto Le
            goto L2e
        Le:
            java.lang.Object[] r5 = r5.f11064
            java.lang.Object[] r6 = r6.f11064
            xm0 r0 = p000.j81.m2893(r1, r2)
            int r2 = r0.f11347
            int r0 = r0.f11348
            if (r2 > r0) goto L2c
        L1c:
            r3 = r5[r2]
            r4 = r6[r2]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L27
            return r1
        L27:
            if (r2 == r0) goto L2c
            int r2 = r2 + 1
            goto L1c
        L2c:
            r5 = 1
            return r5
        L2e:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.f11064
            int r5 = r5.f11065
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r5) goto L19
            r4 = r0[r2]
            if (r4 == 0) goto L12
            int r4 = r4.hashCode()
            goto L13
        L12:
            r4 = r1
        L13:
            int r4 = r4 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L7
        L19:
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            b0 r0 = new b0
            r1 = 14
            r0.<init>(r1, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            java.lang.Object[] r2 = r6.f11064
            int r6 = r6.f11065
            r3 = 0
        L13:
            if (r3 >= r6) goto L33
            r4 = r2[r3]
            r5 = -1
            if (r3 != r5) goto L20
            java.lang.String r6 = "..."
            r1.append(r6)
            goto L38
        L20:
            if (r3 == 0) goto L27
            java.lang.String r5 = ", "
            r1.append(r5)
        L27:
            java.lang.Object r4 = r0.invoke(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.append(r4)
            int r3 = r3 + 1
            goto L13
        L33:
            java.lang.String r6 = "]"
            r1.append(r6)
        L38:
            java.lang.String r6 = r1.toString()
            return r6
    }

    /* JADX INFO: renamed from: α */
    public final void m6015(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f11065
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.f11064
            int r2 = r1.length
            if (r2 >= r0) goto Lc
            r3.m6027(r0, r1)
        Lc:
            java.lang.Object[] r0 = r3.f11064
            int r1 = r3.f11065
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f11065 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6016(p000.v11 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = r6.m6022()
            if (r0 == 0) goto La
            goto L2a
        La:
            int r0 = r5.f11065
            int r1 = r6.f11065
            int r0 = r0 + r1
            java.lang.Object[] r1 = r5.f11064
            int r2 = r1.length
            if (r2 >= r0) goto L17
            r5.m6027(r0, r1)
        L17:
            java.lang.Object[] r0 = r5.f11064
            java.lang.Object[] r1 = r6.f11064
            int r2 = r5.f11065
            int r3 = r6.f11065
            r4 = 0
            p000.AbstractC0312g7.m2238(r1, r0, r2, r4, r3)
            int r0 = r5.f11065
            int r6 = r6.f11065
            int r0 = r0 + r6
            r5.f11065 = r0
        L2a:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m6017(java.util.List r7) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            goto L33
        L7:
            int r0 = r6.f11065
            int r1 = r7.size()
            int r1 = r1 + r0
            java.lang.Object[] r2 = r6.f11064
            int r3 = r2.length
            if (r3 >= r1) goto L16
            r6.m6027(r1, r2)
        L16:
            java.lang.Object[] r1 = r6.f11064
            int r2 = r7.size()
            r3 = 0
        L1d:
            if (r3 >= r2) goto L2a
            int r4 = r3 + r0
            java.lang.Object r5 = r7.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L1d
        L2a:
            int r0 = r6.f11065
            int r7 = r7.size()
            int r7 = r7 + r0
            r6.f11065 = r7
        L33:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m6018() {
            r4 = this;
            java.lang.Object[] r0 = r4.f11064
            int r1 = r4.f11065
            r2 = 0
            r3 = 0
            p000.AbstractC0312g7.m2244(r2, r1, r3, r0)
            r4.f11065 = r2
            return
    }

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object m6019() {
            r1 = this;
            boolean r0 = r1.m6022()
            if (r0 != 0) goto Lc
            java.lang.Object[] r1 = r1.f11064
            r0 = 0
            r1 = r1[r0]
            return r1
        Lc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "ObjectList is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object m6020(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f11065
            if (r2 >= r0) goto Lb
            java.lang.Object[] r1 = r1.f11064
            r1 = r1[r2]
            return r1
        Lb:
            r1.m6028(r2)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: η */
    public final int m6021(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f11064
            r1 = 0
            if (r4 != 0) goto L11
            int r3 = r3.f11065
        L7:
            if (r1 >= r3) goto L21
            r4 = r0[r1]
            if (r4 != 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L7
        L11:
            int r3 = r3.f11065
        L13:
            if (r1 >= r3) goto L21
            r2 = r0[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1e
            return r1
        L1e:
            int r1 = r1 + 1
            goto L13
        L21:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m6022() {
            r0 = this;
            int r0 = r0.f11065
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m6023() {
            r0 = this;
            int r0 = r0.f11065
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m6024(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m6021(r1)
            if (r1 < 0) goto Lb
            r0.m6025(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m6025(int r6) {
            r5 = this;
            r0 = 0
            if (r6 < 0) goto L1d
            int r1 = r5.f11065
            if (r6 >= r1) goto L1d
            java.lang.Object[] r2 = r5.f11064
            r3 = r2[r6]
            int r4 = r1 + (-1)
            if (r6 == r4) goto L14
            int r4 = r6 + 1
            p000.AbstractC0312g7.m2238(r2, r2, r6, r4, r1)
        L14:
            int r6 = r5.f11065
            int r6 = r6 + (-1)
            r5.f11065 = r6
            r2[r6] = r0
            return r3
        L1d:
            r5.m6028(r6)
            throw r0
    }

    /* JADX INFO: renamed from: μ */
    public final void m6026(int r4, int r5) {
            r3 = this;
            java.lang.String r0 = "Start ("
            if (r4 < 0) goto L44
            int r1 = r3.f11065
            if (r4 > r1) goto L44
            if (r5 < 0) goto L44
            if (r5 > r1) goto L44
            if (r5 < r4) goto L25
            if (r5 == r4) goto L24
            if (r5 >= r1) goto L17
            java.lang.Object[] r0 = r3.f11064
            p000.AbstractC0312g7.m2238(r0, r0, r4, r5, r1)
        L17:
            int r0 = r3.f11065
            int r5 = r5 - r4
            int r4 = r0 - r5
            java.lang.Object[] r5 = r3.f11064
            r1 = 0
            p000.AbstractC0312g7.m2244(r4, r0, r1, r5)
            r3.f11065 = r4
        L24:
            return
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = ") is more than end ("
            r3.append(r4)
            r3.append(r5)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        L44:
            java.lang.String r1 = ") and end ("
            java.lang.String r2 = ") must be in 0.."
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r0, r4, r1, r5, r2)
            int r3 = r3.f11065
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ν */
    public final void m6027(int r3, java.lang.Object[] r4) {
            r2 = this;
            r4.getClass()
            int r0 = r4.length
            int r1 = r0 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            p000.AbstractC0312g7.m2238(r4, r3, r1, r1, r0)
            r2.f11064 = r3
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m6028(int r3) {
            r2 = this;
            java.lang.String r0 = "Index "
            java.lang.String r1 = " must be in 0.."
            java.lang.StringBuilder r3 = p000.a12.m19(r3, r0, r1)
            int r2 = r2.f11065
            int r2 = r2 + (-1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }
}
