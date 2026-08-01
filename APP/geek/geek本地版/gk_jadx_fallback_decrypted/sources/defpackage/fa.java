package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa {
    public long a;
    public defpackage.fa b;

    public fa() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            return
    }

    public final void a(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto Ld
            fa r1 = r4.b
            if (r1 == 0) goto Lc
            int r5 = r5 - r0
            r1.a(r5)
        Lc:
            return
        Ld:
            long r0 = r4.a
            r2 = 1
            long r2 = r2 << r5
            long r2 = ~r2
            long r0 = r0 & r2
            r4.a = r0
            return
    }

    public final int b(int r7) {
            r6 = this;
            fa r0 = r6.b
            r1 = 64
            r2 = 1
            if (r0 != 0) goto L1c
            if (r7 < r1) goto L11
            long r0 = r6.a
            int r7 = java.lang.Long.bitCount(r0)
            return r7
        L11:
            long r0 = r6.a
            long r4 = r2 << r7
            long r4 = r4 - r2
            long r0 = r0 & r4
            int r7 = java.lang.Long.bitCount(r0)
            return r7
        L1c:
            if (r7 >= r1) goto L29
            long r0 = r6.a
            long r4 = r2 << r7
            long r4 = r4 - r2
            long r0 = r0 & r4
            int r7 = java.lang.Long.bitCount(r0)
            return r7
        L29:
            int r7 = r7 - r1
            int r7 = r0.b(r7)
            long r0 = r6.a
            int r0 = java.lang.Long.bitCount(r0)
            int r0 = r0 + r7
            return r0
    }

    public final void c() {
            r1 = this;
            fa r0 = r1.b
            if (r0 != 0) goto Lb
            fa r0 = new fa
            r0.<init>()
            r1.b = r0
        Lb:
            return
    }

    public final boolean d(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto Lf
            r4.c()
            fa r1 = r4.b
            int r5 = r5 - r0
            boolean r5 = r1.d(r5)
            return r5
        Lf:
            long r0 = r4.a
            r2 = 1
            long r2 = r2 << r5
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1d
            r5 = 1
            return r5
        L1d:
            r5 = 0
            return r5
    }

    public final void e(int r10, boolean r11) {
            r9 = this;
            r0 = 64
            if (r10 < r0) goto Le
            r9.c()
            fa r1 = r9.b
            int r10 = r10 - r0
            r1.e(r10, r11)
            return
        Le:
            long r0 = r9.a
            r2 = -9223372036854775808
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            r5 = 1
            long r7 = r5 << r10
            long r7 = r7 - r5
            long r5 = r0 & r7
            long r7 = ~r7
            long r0 = r0 & r7
            long r0 = r0 << r4
            long r0 = r0 | r5
            r9.a = r0
            if (r11 == 0) goto L31
            r9.h(r10)
            goto L34
        L31:
            r9.a(r10)
        L34:
            if (r2 != 0) goto L3c
            fa r10 = r9.b
            if (r10 == 0) goto L3b
            goto L3c
        L3b:
            return
        L3c:
            r9.c()
            fa r10 = r9.b
            r10.e(r3, r2)
            return
    }

    public final boolean f(int r11) {
            r10 = this;
            r0 = 64
            if (r11 < r0) goto Lf
            r10.c()
            fa r1 = r10.b
            int r11 = r11 - r0
            boolean r11 = r1.f(r11)
            return r11
        Lf:
            r0 = 1
            long r2 = r0 << r11
            long r4 = r10.a
            long r6 = r4 & r2
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r11 == 0) goto L21
            r11 = r6
            goto L22
        L21:
            r11 = r7
        L22:
            long r8 = ~r2
            long r4 = r4 & r8
            r10.a = r4
            long r2 = r2 - r0
            long r0 = r4 & r2
            long r2 = ~r2
            long r2 = r2 & r4
            long r2 = java.lang.Long.rotateRight(r2, r6)
            long r0 = r0 | r2
            r10.a = r0
            fa r0 = r10.b
            if (r0 == 0) goto L46
            boolean r0 = r0.d(r7)
            if (r0 == 0) goto L41
            r0 = 63
            r10.h(r0)
        L41:
            fa r0 = r10.b
            r0.f(r7)
        L46:
            return r11
    }

    public final void g() {
            r2 = this;
            r0 = 0
            r2.a = r0
            fa r0 = r2.b
            if (r0 == 0) goto Lb
            r0.g()
        Lb:
            return
    }

    public final void h(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto Le
            r4.c()
            fa r1 = r4.b
            int r5 = r5 - r0
            r1.h(r5)
            return
        Le:
            long r0 = r4.a
            r2 = 1
            long r2 = r2 << r5
            long r0 = r0 | r2
            r4.a = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            fa r0 = r3.b
            if (r0 != 0) goto Lb
            long r0 = r3.a
            java.lang.String r0 = java.lang.Long.toBinaryString(r0)
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            fa r1 = r3.b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "xx"
            r0.append(r1)
            long r1 = r3.a
            java.lang.String r1 = java.lang.Long.toBinaryString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
