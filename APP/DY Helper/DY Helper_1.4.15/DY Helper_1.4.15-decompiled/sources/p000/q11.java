package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q11 {

    /* JADX INFO: renamed from: α */
    public long[] f8793;

    /* JADX INFO: renamed from: β */
    public int f8794;

    public q11(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            long[] r1 = p000.yv0.f12838
            goto La
        L8:
            long[] r1 = new long[r1]
        La:
            r0.f8793 = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof p000.q11
            r1 = 0
            if (r0 == 0) goto L2c
            q11 r8 = (p000.q11) r8
            int r0 = r8.f8794
            int r2 = r7.f8794
            if (r0 == r2) goto Le
            goto L2c
        Le:
            long[] r7 = r7.f8793
            long[] r8 = r8.f8793
            xm0 r0 = p000.j81.m2893(r1, r2)
            int r2 = r0.f11347
            int r0 = r0.f11348
            if (r2 > r0) goto L2a
        L1c:
            r3 = r7[r2]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L25
            return r1
        L25:
            if (r2 == r0) goto L2a
            int r2 = r2 + 1
            goto L1c
        L2a:
            r7 = 1
            return r7
        L2c:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            long[] r0 = r5.f8793
            int r5 = r5.f8794
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r5) goto L14
            r3 = r0[r1]
            int r3 = java.lang.Long.hashCode(r3)
            int r3 = r3 * 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            long[] r1 = r6.f8793
            int r6 = r6.f8794
            r2 = 0
        Lf:
            if (r2 >= r6) goto L29
            r3 = r1[r2]
            r5 = -1
            if (r2 != r5) goto L1c
            java.lang.String r6 = "..."
            r0.append(r6)
            goto L2e
        L1c:
            if (r2 == 0) goto L23
            java.lang.String r5 = ", "
            r0.append(r5)
        L23:
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L29:
            java.lang.String r6 = "]"
            r0.append(r6)
        L2e:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* JADX INFO: renamed from: α */
    public final void m4709(long r4) {
            r3 = this;
            int r0 = r3.f8794
            int r0 = r0 + 1
            long[] r1 = r3.f8793
            int r2 = r1.length
            if (r2 >= r0) goto L18
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            int r0 = java.lang.Math.max(r0, r2)
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f8793 = r0
        L18:
            long[] r0 = r3.f8793
            int r1 = r3.f8794
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f8794 = r1
            return
    }
}
