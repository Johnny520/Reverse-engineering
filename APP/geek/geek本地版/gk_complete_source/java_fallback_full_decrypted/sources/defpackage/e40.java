package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e40 implements java.lang.Cloneable {
    public static final java.lang.Object d = null;
    public int[] a;
    public java.lang.Object[] b;
    public int c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.e40.d = r0
            return
    }

    public e40() {
            r4 = this;
            r4.<init>()
            r0 = 4
            r1 = r0
        L5:
            r2 = 32
            r3 = 40
            if (r1 >= r2) goto L16
            r2 = 1
            int r2 = r2 << r1
            int r2 = r2 + (-12)
            if (r3 > r2) goto L13
            r3 = r2
            goto L16
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            int r3 = r3 / r0
            int[] r0 = new int[r3]
            r4.a = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r4.b = r0
            return
    }

    public final void a(int r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.c
            if (r0 == 0) goto L10
            int[] r1 = r7.a
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r8 > r1) goto L10
            r7.c(r8, r9)
            return
        L10:
            int[] r1 = r7.a
            int r1 = r1.length
            r2 = 1
            if (r0 < r1) goto L40
            int r1 = r0 + 1
            r3 = 4
            int r1 = r1 * r3
            r4 = r3
        L1b:
            r5 = 32
            if (r4 >= r5) goto L2a
            int r5 = r2 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L27
            r1 = r5
            goto L2a
        L27:
            int r4 = r4 + 1
            goto L1b
        L2a:
            int r1 = r1 / r3
            int[] r3 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r4 = r7.a
            int r5 = r4.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r3, r6, r5)
            java.lang.Object[] r4 = r7.b
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r6, r1, r6, r5)
            r7.a = r3
            r7.b = r1
        L40:
            int[] r1 = r7.a
            r1[r0] = r8
            java.lang.Object[] r8 = r7.b
            r8[r0] = r9
            int r0 = r0 + r2
            r7.c = r0
            return
    }

    public final java.lang.Object b(int r3, java.lang.Integer r4) {
            r2 = this;
            int[] r0 = r2.a
            int r1 = r2.c
            int r3 = defpackage.ff.c(r1, r3, r0)
            if (r3 < 0) goto L14
            java.lang.Object[] r0 = r2.b
            r3 = r0[r3]
            java.lang.Object r0 = defpackage.e40.d
            if (r3 != r0) goto L13
            goto L14
        L13:
            return r3
        L14:
            return r4
    }

    public final void c(int r8, java.lang.Object r9) {
            r7 = this;
            int[] r0 = r7.a
            int r1 = r7.c
            int r0 = defpackage.ff.c(r1, r8, r0)
            if (r0 < 0) goto Lf
            java.lang.Object[] r8 = r7.b
            r8[r0] = r9
            return
        Lf:
            int r0 = ~r0
            int r1 = r7.c
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r7.b
            r3 = r2[r0]
            java.lang.Object r4 = defpackage.e40.d
            if (r3 != r4) goto L23
            int[] r1 = r7.a
            r1[r0] = r8
            r2[r0] = r9
            return
        L23:
            int[] r2 = r7.a
            int r2 = r2.length
            r3 = 1
            if (r1 < r2) goto L52
            int r1 = r1 + r3
            r2 = 4
            int r1 = r1 * r2
            r4 = r2
        L2d:
            r5 = 32
            if (r4 >= r5) goto L3c
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L39
            r1 = r5
            goto L3c
        L39:
            int r4 = r4 + 1
            goto L2d
        L3c:
            int r1 = r1 / r2
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r4 = r7.a
            int r5 = r4.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r2, r6, r5)
            java.lang.Object[] r4 = r7.b
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r6, r1, r6, r5)
            r7.a = r2
            r7.b = r1
        L52:
            int r1 = r7.c
            int r1 = r1 - r0
            if (r1 == 0) goto L66
            int[] r2 = r7.a
            int r4 = r0 + 1
            java.lang.System.arraycopy(r2, r0, r2, r4, r1)
            java.lang.Object[] r1 = r7.b
            int r2 = r7.c
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r4, r2)
        L66:
            int[] r1 = r7.a
            r1[r0] = r8
            java.lang.Object[] r8 = r7.b
            r8[r0] = r9
            int r8 = r7.c
            int r8 = r8 + r3
            r7.c = r8
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            e40 r0 = (defpackage.e40) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = r2.a     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = (int[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.a = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.b     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.b = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.c
            if (r0 > 0) goto L7
            java.lang.String r0 = "{}"
            return r0
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 28
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            r0 = 0
        L14:
            int r2 = r3.c
            if (r0 >= r2) goto L3d
            if (r0 <= 0) goto L1f
            java.lang.String r2 = ", "
            r1.append(r2)
        L1f:
            int[] r2 = r3.a
            r2 = r2[r0]
            r1.append(r2)
            r2 = 61
            r1.append(r2)
            java.lang.Object[] r2 = r3.b
            r2 = r2[r0]
            if (r2 == r3) goto L35
            r1.append(r2)
            goto L3a
        L35:
            java.lang.String r2 = "(this Map)"
            r1.append(r2)
        L3a:
            int r0 = r0 + 1
            goto L14
        L3d:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
