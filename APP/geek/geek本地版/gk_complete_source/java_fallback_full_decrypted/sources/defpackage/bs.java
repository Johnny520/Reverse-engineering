package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs implements java.lang.Cloneable {
    public static final java.lang.Object e = null;
    public boolean a;
    public long[] b;
    public java.lang.Object[] c;
    public int d;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.bs.e = r0
            return
    }

    public bs() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = 4
        L7:
            r1 = 32
            r2 = 80
            if (r0 >= r1) goto L18
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto L15
            r2 = r1
            goto L18
        L15:
            int r0 = r0 + 1
            goto L7
        L18:
            int r2 = r2 / 8
            long[] r0 = new long[r2]
            r3.b = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3.c = r0
            return
    }

    public final void a() {
            r5 = this;
            int r0 = r5.d
            java.lang.Object[] r1 = r5.c
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.d = r2
            r5.a = r2
            return
    }

    public final void b() {
            r9 = this;
            int r0 = r9.d
            long[] r1 = r9.b
            java.lang.Object[] r2 = r9.c
            r3 = 0
            r4 = r3
            r5 = r4
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = defpackage.bs.e
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r9.a = r3
            r9.d = r5
            return
    }

    public final java.lang.Object c(long r3, java.lang.Long r5) {
            r2 = this;
            long[] r0 = r2.b
            int r1 = r2.d
            int r3 = defpackage.ff.d(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r4 = r2.c
            r3 = r4[r3]
            java.lang.Object r4 = defpackage.bs.e
            if (r3 != r4) goto L13
            goto L14
        L13:
            return r3
        L14:
            return r5
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            bs r0 = (defpackage.bs) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r2.b     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.b = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.c     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.c = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public final void d(long r8, java.lang.Object r10) {
            r7 = this;
            long[] r0 = r7.b
            int r1 = r7.d
            int r0 = defpackage.ff.d(r0, r1, r8)
            if (r0 < 0) goto Lf
            java.lang.Object[] r8 = r7.c
            r8[r0] = r10
            return
        Lf:
            int r0 = ~r0
            int r1 = r7.d
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r7.c
            r3 = r2[r0]
            java.lang.Object r4 = defpackage.bs.e
            if (r3 != r4) goto L23
            long[] r1 = r7.b
            r1[r0] = r8
            r2[r0] = r10
            return
        L23:
            boolean r2 = r7.a
            if (r2 == 0) goto L38
            long[] r2 = r7.b
            int r2 = r2.length
            if (r1 < r2) goto L38
            r7.b()
            long[] r0 = r7.b
            int r1 = r7.d
            int r0 = defpackage.ff.d(r0, r1, r8)
            int r0 = ~r0
        L38:
            int r1 = r7.d
            long[] r2 = r7.b
            int r2 = r2.length
            r3 = 1
            if (r1 < r2) goto L6a
            int r1 = r1 + r3
            int r1 = r1 * 8
            r2 = 4
        L44:
            r4 = 32
            if (r2 >= r4) goto L53
            int r4 = r3 << r2
            int r4 = r4 + (-12)
            if (r1 > r4) goto L50
            r1 = r4
            goto L53
        L50:
            int r2 = r2 + 1
            goto L44
        L53:
            int r1 = r1 / 8
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r4 = r7.b
            int r5 = r4.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r2, r6, r5)
            java.lang.Object[] r4 = r7.c
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r6, r1, r6, r5)
            r7.b = r2
            r7.c = r1
        L6a:
            int r1 = r7.d
            int r1 = r1 - r0
            if (r1 == 0) goto L7e
            long[] r2 = r7.b
            int r4 = r0 + 1
            java.lang.System.arraycopy(r2, r0, r2, r4, r1)
            java.lang.Object[] r1 = r7.c
            int r2 = r7.d
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r4, r2)
        L7e:
            long[] r1 = r7.b
            r1[r0] = r8
            java.lang.Object[] r8 = r7.c
            r8[r0] = r10
            int r8 = r7.d
            int r8 = r8 + r3
            r7.d = r8
            return
    }

    public final int e() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L7
            r1.b()
        L7:
            int r0 = r1.d
            return r0
    }

    public final java.lang.Object f(int r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L7
            r1.b()
        L7:
            java.lang.Object[] r0 = r1.c
            r2 = r0[r2]
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.e()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.d
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r5.d
            if (r1 >= r2) goto L48
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            boolean r2 = r5.a
            if (r2 == 0) goto L2a
            r5.b()
        L2a:
            long[] r2 = r5.b
            r3 = r2[r1]
            r0.append(r3)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r5.f(r1)
            if (r2 == r5) goto L40
            r0.append(r2)
            goto L45
        L40:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L45:
            int r1 = r1 + 1
            goto L18
        L48:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
