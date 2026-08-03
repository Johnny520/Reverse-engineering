package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z4.j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z4.g f22550k = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f22551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22553j;

    static {
            z4.g r0 = new z4.g
            r1 = 0
            r0.<init>(r1)
            z4.g.f22550k = r0
            r0.f22555g = r1
            return
    }

    public g(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            int[] r2 = new int[r2]     // Catch: java.lang.NegativeArraySizeException -> Le
            r1.f22551h = r2     // Catch: java.lang.NegativeArraySizeException -> Le
            r2 = 0
            r1.f22552i = r2
            r1.f22553j = r0
            return
        Le:
            java.lang.String r2 = "size < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public static z4.g o(int r2) {
            z4.g r0 = new z4.g
            r1 = 1
            r0.<init>(r1)
            r0.l(r2)
            r2 = 0
            r0.f22555g = r2
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof z4.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z4.g r6 = (z4.g) r6
            boolean r1 = r5.f22553j
            boolean r3 = r6.f22553j
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r5.f22552i
            int r3 = r6.f22552i
            if (r1 == r3) goto L1a
            return r2
        L1a:
            r1 = r2
        L1b:
            int r3 = r5.f22552i
            if (r1 >= r3) goto L2d
            int[] r3 = r5.f22551h
            r3 = r3[r1]
            int[] r4 = r6.f22551h
            r4 = r4[r1]
            if (r3 == r4) goto L2a
            return r2
        L2a:
            int r1 = r1 + 1
            goto L1b
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.f22552i
            if (r0 >= r2) goto L10
            int r1 = r1 * 31
            int[] r2 = r3.f22551h
            r2 = r2[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L10:
            return r1
    }

    public final void l(int r6) {
            r5 = this;
            r5.j()
            int r0 = r5.f22552i
            int[] r1 = r5.f22551h
            int r2 = r1.length
            r3 = 0
            if (r0 != r2) goto L18
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 10
            int[] r2 = new int[r2]
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f22551h = r2
        L18:
            int[] r0 = r5.f22551h
            int r1 = r5.f22552i
            int r2 = r1 + 1
            r5.f22552i = r2
            r0[r1] = r6
            boolean r4 = r5.f22553j
            if (r4 == 0) goto L32
            r4 = 1
            if (r2 <= r4) goto L32
            int r1 = r1 + (-1)
            r0 = r0[r1]
            if (r6 < r0) goto L30
            r3 = r4
        L30:
            r5.f22553j = r3
        L32:
            return
    }

    public final int m(int r6) {
            r5 = this;
            int r0 = r5.f22552i
            boolean r1 = r5.f22553j
            if (r1 != 0) goto L15
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            int[] r2 = r5.f22551h
            r2 = r2[r1]
            if (r2 != r6) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            int r6 = -r0
            return r6
        L15:
            r1 = -1
            r2 = r0
        L17:
            int r3 = r1 + 1
            if (r2 <= r3) goto L2a
            int r3 = r2 - r1
            int r3 = r3 >> 1
            int r3 = r3 + r1
            int[] r4 = r5.f22551h
            r4 = r4[r3]
            if (r6 > r4) goto L28
            r2 = r3
            goto L17
        L28:
            r1 = r3
            goto L17
        L2a:
            if (r2 == r0) goto L37
            int[] r0 = r5.f22551h
            r0 = r0[r2]
            if (r6 != r0) goto L33
            return r2
        L33:
            int r6 = -r2
        L34:
            int r6 = r6 + (-1)
            return r6
        L37:
            int r6 = -r0
            goto L34
    }

    public final int n(int r2) {
            r1 = this;
            int r0 = r1.f22552i
            if (r2 >= r0) goto L10
            int[] r0 = r1.f22551h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r2
        L9:
            java.lang.String r2 = "n < 0"
            okio.a.i(r2)
        Le:
            r2 = 0
            return r2
        L10:
            java.lang.String r2 = "n >= size()"
            okio.a.i(r2)
            goto Le
    }

    public final z4.g p() {
            r4 = this;
            int r0 = r4.f22552i
            z4.g r1 = new z4.g
            r1.<init>(r0)
            r2 = 0
        L8:
            if (r2 >= r0) goto L14
            int[] r3 = r4.f22551h
            r3 = r3[r2]
            r1.l(r3)
            int r2 = r2 + 1
            goto L8
        L14:
            return r1
    }

    public final void q(int r2, int r3) {
            r1 = this;
            r1.j()
            int r0 = r1.f22552i
            if (r2 >= r0) goto L18
            int[] r0 = r1.f22551h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            r0[r2] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            r3 = 0
            r1.f22553j = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            return
        Lf:
            if (r2 < 0) goto L12
            return
        L12:
            java.lang.String r2 = "n < 0"
            j8.o.t(r2)
            return
        L18:
            java.lang.String r2 = "n >= size()"
            okio.a.i(r2)
            return
    }

    public final void r(int r2) {
            r1 = this;
            if (r2 < 0) goto L12
            int r0 = r1.f22552i
            if (r2 > r0) goto Lc
            r1.j()
            r1.f22552i = r2
            return
        Lc:
            java.lang.String r2 = "newSize > size"
            j8.o.t(r2)
            return
        L12:
            java.lang.String r2 = "newSize < 0"
            j8.o.t(r2)
            return
    }

    public final void s() {
            r3 = this;
            r3.j()
            boolean r0 = r3.f22553j
            if (r0 != 0) goto L12
            int[] r0 = r3.f22551h
            r1 = 0
            int r2 = r3.f22552i
            java.util.Arrays.sort(r0, r1, r2)
            r0 = 1
            r3.f22553j = r0
        L12:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f22552i
            int r1 = r1 * 5
            int r1 = r1 + 10
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L11:
            int r2 = r3.f22552i
            if (r1 >= r2) goto L26
            if (r1 == 0) goto L1c
            java.lang.String r2 = ", "
            r0.append(r2)
        L1c:
            int[] r2 = r3.f22551h
            r2 = r2[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L11
        L26:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
