package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends z4.j implements z4.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f22543h;

    public e(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NegativeArraySizeException -> Ld
            r1.f22543h = r2     // Catch: java.lang.NegativeArraySizeException -> Ld
            return
        Ld:
            java.lang.String r2 = "size < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public java.lang.String a() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = "{"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "}"
            java.lang.String r0 = r3.n(r0, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            z4.e r3 = (z4.e) r3
            java.lang.Object[] r0 = r2.f22543h
            java.lang.Object[] r3 = r3.f22543h
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public w4.c getType(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.l(r1)
            w4.c r1 = (w4.c) r1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object[] r0 = r1.f22543h
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.Object l(int r4) {
            r3 = this;
            java.lang.String r0 = "unset: "
            java.lang.Object[] r1 = r3.f22543h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            r2.<init>(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            r2.append(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            r1.<init>(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
            throw r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1b
        L1b:
            if (r4 >= 0) goto L24
            java.lang.String r4 = "n < 0"
            okio.a.i(r4)
        L22:
            r4 = 0
            return r4
        L24:
            java.lang.String r4 = "n >= size()"
            okio.a.i(r4)
            goto L22
    }

    public final void m(int r2, java.lang.Object r3) {
            r1 = this;
            r1.j()
            java.lang.Object[] r0 = r1.f22543h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8
            r0[r2] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8
            return
        L8:
            if (r2 >= 0) goto L10
            java.lang.String r2 = "n < 0"
            okio.a.i(r2)
            return
        L10:
            java.lang.String r2 = "n >= size()"
            okio.a.i(r2)
            return
    }

    public final java.lang.String n(java.lang.String r4, java.lang.String r5, boolean r6) {
            r3 = this;
            java.lang.Object[] r0 = r3.f22543h
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 10
            int r2 = r2 + 10
            r1.<init>(r2)
            r1.append(r4)
            r4 = 0
        L10:
            if (r4 >= r0) goto L31
            if (r4 == 0) goto L19
            java.lang.String r2 = ", "
            r1.append(r2)
        L19:
            java.lang.Object[] r2 = r3.f22543h
            if (r6 == 0) goto L29
            r2 = r2[r4]
            z4.k r2 = (z4.k) r2
            java.lang.String r2 = r2.a()
            r1.append(r2)
            goto L2e
        L29:
            r2 = r2[r4]
            r1.append(r2)
        L2e:
            int r4 = r4 + 1
            goto L10
        L31:
            if (r5 == 0) goto L36
            r1.append(r5)
        L36:
            java.lang.String r4 = r1.toString()
            return r4
    }

    public final int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.f22543h
            int r0 = r0.length
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = "{"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "}"
            r2 = 0
            java.lang.String r0 = r3.n(r0, r1, r2)
            return r0
    }
}
