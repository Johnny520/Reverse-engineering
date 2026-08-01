package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class fp implements java.lang.Iterable {
    public final int a;
    public final int b;
    public final int c;

    public fp(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L50
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L48
            r2.a = r3
            if (r5 <= 0) goto L23
            if (r3 < r4) goto L10
            goto L3b
        L10:
            int r0 = r4 % r5
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r5
        L16:
            int r3 = r3 % r5
            if (r3 < 0) goto L1a
            goto L1b
        L1a:
            int r3 = r3 + r5
        L1b:
            int r0 = r0 - r3
            int r0 = r0 % r5
            if (r0 < 0) goto L20
            goto L21
        L20:
            int r0 = r0 + r5
        L21:
            int r4 = r4 - r0
            goto L3b
        L23:
            if (r5 >= 0) goto L40
            if (r3 > r4) goto L28
            goto L3b
        L28:
            int r0 = -r5
            int r3 = r3 % r0
            if (r3 < 0) goto L2d
            goto L2e
        L2d:
            int r3 = r3 + r0
        L2e:
            int r1 = r4 % r0
            if (r1 < 0) goto L33
            goto L34
        L33:
            int r1 = r1 + r0
        L34:
            int r3 = r3 - r1
            int r3 = r3 % r0
            if (r3 < 0) goto L39
            goto L3a
        L39:
            int r3 = r3 + r0
        L3a:
            int r4 = r4 + r3
        L3b:
            r2.b = r4
            r2.c = r5
            return
        L40:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step is zero."
            r3.<init>(r4)
            throw r3
        L48:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r3.<init>(r4)
            throw r3
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be non-zero."
            r3.<init>(r4)
            throw r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.fp
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            fp r0 = (defpackage.fp) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            fp r3 = (defpackage.fp) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 != r0) goto L29
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L29
            int r0 = r2.c
            int r3 = r3.c
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            int r0 = r5.c
            r1 = 0
            r2 = 1
            int r3 = r5.b
            int r4 = r5.a
            if (r0 <= 0) goto Le
            if (r4 <= r3) goto Ld
            return r2
        Ld:
            return r1
        Le:
            if (r4 >= r3) goto L11
            return r2
        L11:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            gp r0 = new gp
            int r1 = r4.b
            int r2 = r4.c
            int r3 = r4.a
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = " step "
            int r1 = r5.b
            int r2 = r5.a
            int r3 = r5.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r3 <= 0) goto L25
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ".."
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            r4.append(r3)
        L20:
            java.lang.String r0 = r4.toString()
            return r0
        L25:
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " downTo "
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            int r0 = -r3
            r4.append(r0)
            goto L20
    }
}
