package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2916b;

    public /* synthetic */ v() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public v(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            int[] r1 = f.m.f2860a
            goto La
        L8:
            int[] r1 = new int[r1]
        La:
            r0.f2915a = r1
            return
    }

    public final void a(int r3) {
            r2 = this;
            int r0 = r2.f2916b
            int r0 = r0 + 1
            r2.b(r0)
            int[] r0 = r2.f2915a
            int r1 = r2.f2916b
            r0[r1] = r3
            int r1 = r1 + 1
            r2.f2916b = r1
            return
    }

    public final void b(int r3) {
            r2 = this;
            int[] r0 = r2.f2915a
            int r1 = r0.length
            if (r1 >= r3) goto L14
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            int[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.f2915a = r3
        L14:
            return
    }

    public final int c(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f2916b
            if (r2 >= r0) goto Lb
            int[] r0 = r1.f2915a
            r2 = r0[r2]
            return r2
        Lb:
            java.lang.String r2 = "Index must be between 0 and size"
            okio.a.i(r2)
            r2 = 0
            return r2
    }

    public final void d(int r4) {
            r3 = this;
            if (r4 < 0) goto L1a
            int r0 = r3.f2916b
            if (r4 >= r0) goto L1a
            int[] r1 = r3.f2915a
            r2 = r1[r4]
            int r2 = r0 + (-1)
            if (r4 == r2) goto L13
            int r2 = r4 + 1
            tf.l.p0(r1, r1, r4, r2, r0)
        L13:
            int r4 = r3.f2916b
            int r4 = r4 + (-1)
            r3.f2916b = r4
            return
        L1a:
            java.lang.String r4 = "Index must be between 0 and size"
            okio.a.i(r4)
            return
    }

    public final void e(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.f2916b
            if (r3 >= r0) goto Ld
            int[] r0 = r2.f2915a
            r1 = r0[r3]
            r0[r3] = r4
            return
        Ld:
            java.lang.String r3 = "Index must be between 0 and size"
            okio.a.i(r3)
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof f.v
            r1 = 0
            if (r0 == 0) goto L2a
            f.v r7 = (f.v) r7
            int r0 = r7.f2916b
            int r2 = r6.f2916b
            if (r0 == r2) goto Le
            goto L2a
        Le:
            int[] r0 = r6.f2915a
            int[] r7 = r7.f2915a
            lg.d r2 = r9.e0.r0(r1, r2)
            int r3 = r2.f8042g
            int r2 = r2.f8043h
            if (r3 > r2) goto L28
        L1c:
            r4 = r0[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L23
            return r1
        L23:
            if (r3 == r2) goto L28
            int r3 = r3 + 1
            goto L1c
        L28:
            r7 = 1
            return r7
        L2a:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            int[] r0 = r5.f2915a
            int r1 = r5.f2916b
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L14:
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int[] r1 = r6.f2915a
            int r2 = r6.f2916b
            r3 = 0
        Lf:
            if (r3 >= r2) goto L29
            r4 = r1[r3]
            r5 = -1
            if (r3 != r5) goto L1c
            java.lang.String r1 = "..."
            r0.append(r1)
            goto L2e
        L1c:
            if (r3 == 0) goto L23
            java.lang.String r5 = ", "
            r0.append(r5)
        L23:
            r0.append(r4)
            int r3 = r3 + 1
            goto Lf
        L29:
            java.lang.String r1 = "]"
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
