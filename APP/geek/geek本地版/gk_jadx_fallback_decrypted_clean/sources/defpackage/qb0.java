package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb0 implements defpackage.hg {
    public int a;
    public defpackage.pc b;
    public defpackage.j10 c;
    public int d;
    public final defpackage.sg e;
    public int f;
    public boolean g;
    public final defpackage.jg h;
    public final defpackage.jg i;
    public int j;

    public qb0(defpackage.pc r2) {
            r1 = this;
            r1.<init>()
            sg r0 = new sg
            r0.<init>(r1)
            r1.e = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            jg r0 = new jg
            r0.<init>(r1)
            r1.h = r0
            jg r0 = new jg
            r0.<init>(r1)
            r1.i = r0
            r0 = 1
            r1.j = r0
            r1.b = r2
            return
    }

    public static void b(defpackage.jg r1, defpackage.jg r2, int r3) {
            java.util.ArrayList r0 = r1.l
            r0.add(r2)
            r1.f = r3
            java.util.ArrayList r2 = r2.k
            r2.add(r1)
            return
    }

    public static defpackage.jg h(defpackage.cc r3) {
            cc r3 = r3.d
            if (r3 != 0) goto L5
            goto L20
        L5:
            pc r0 = r3.b
            po r1 = r0.d
            m90 r0 = r0.e
            int r3 = r3.c
            int r3 = defpackage.z30.t(r3)
            r2 = 1
            if (r3 == r2) goto L2e
            r2 = 2
            if (r3 == r2) goto L2b
            r2 = 3
            if (r3 == r2) goto L28
            r1 = 4
            if (r3 == r1) goto L25
            r1 = 5
            if (r3 == r1) goto L22
        L20:
            r3 = 0
            return r3
        L22:
            jg r3 = r0.k
            return r3
        L25:
            jg r3 = r0.i
            return r3
        L28:
            jg r3 = r1.i
            return r3
        L2b:
            jg r3 = r0.h
            return r3
        L2e:
            jg r3 = r1.h
            return r3
    }

    public static defpackage.jg i(defpackage.cc r1, int r2) {
            cc r1 = r1.d
            if (r1 != 0) goto L5
            goto L20
        L5:
            pc r0 = r1.b
            if (r2 != 0) goto Lc
            po r2 = r0.d
            goto Le
        Lc:
            m90 r2 = r0.e
        Le:
            int r1 = r1.c
            int r1 = defpackage.z30.t(r1)
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L25
            r0 = 3
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 == r0) goto L22
        L20:
            r1 = 0
            return r1
        L22:
            jg r1 = r2.i
            return r1
        L25:
            jg r1 = r2.h
            return r1
    }

    public final void c(defpackage.jg r3, defpackage.jg r4, int r5, defpackage.sg r6) {
            r2 = this;
            java.util.ArrayList r0 = r3.l
            r0.add(r4)
            java.util.ArrayList r0 = r3.l
            sg r1 = r2.e
            r0.add(r1)
            r3.h = r5
            r3.i = r6
            java.util.ArrayList r4 = r4.k
            r4.add(r3)
            java.util.ArrayList r4 = r6.k
            r4.add(r3)
            return
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L15
            pc r3 = r1.b
            int r0 = r3.n
            int r3 = r3.m
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L12
            int r3 = java.lang.Math.min(r0, r2)
        L12:
            if (r3 == r2) goto L28
            return r3
        L15:
            pc r3 = r1.b
            int r0 = r3.q
            int r3 = r3.p
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L25
            int r3 = java.lang.Math.min(r0, r2)
        L25:
            if (r3 == r2) goto L28
            return r3
        L28:
            return r2
    }

    public long j() {
            r2 = this;
            sg r0 = r2.e
            boolean r1 = r0.j
            if (r1 == 0) goto La
            int r0 = r0.g
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    public abstract boolean k();

    public final void l(defpackage.cc r12, defpackage.cc r13, int r14) {
            r11 = this;
            jg r0 = h(r12)
            jg r1 = h(r13)
            boolean r2 = r0.j
            if (r2 == 0) goto Le6
            boolean r2 = r1.j
            if (r2 != 0) goto L12
            goto Le6
        L12:
            int r2 = r0.g
            int r12 = r12.c()
            int r12 = r12 + r2
            int r2 = r1.g
            int r13 = r13.c()
            int r2 = r2 - r13
            int r13 = r2 - r12
            sg r3 = r11.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto Laf
            int r4 = r11.d
            r6 = 3
            if (r4 != r6) goto Laf
            int r4 = r11.a
            if (r4 == 0) goto La8
            r7 = 1
            if (r4 == r7) goto L9a
            r8 = 2
            if (r4 == r8) goto L72
            if (r4 == r6) goto L3d
            goto Laf
        L3d:
            pc r4 = r11.b
            po r8 = r4.d
            m90 r9 = r4.e
            int r10 = r8.d
            if (r10 != r6) goto L54
            int r10 = r8.a
            if (r10 != r6) goto L54
            int r10 = r9.d
            if (r10 != r6) goto L54
            int r10 = r9.a
            if (r10 != r6) goto L54
            goto Laf
        L54:
            if (r14 != 0) goto L57
            r8 = r9
        L57:
            sg r6 = r8.e
            boolean r8 = r6.j
            if (r8 == 0) goto Laf
            float r4 = r4.L
            if (r14 != r7) goto L68
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L6e
        L68:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L6e:
            r3.d(r4)
            goto Laf
        L72:
            pc r4 = r11.b
            pc r6 = r4.I
            if (r6 == 0) goto Laf
            if (r14 != 0) goto L7d
            po r6 = r6.d
            goto L7f
        L7d:
            m90 r6 = r6.e
        L7f:
            sg r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto Laf
            if (r14 != 0) goto L8a
            float r4 = r4.o
            goto L8c
        L8a:
            float r4 = r4.r
        L8c:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto Laf
        L9a:
            int r4 = r3.m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto Laf
        La8:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        Laf:
            boolean r4 = r3.j
            if (r4 != 0) goto Lb4
            goto Le6
        Lb4:
            int r4 = r3.g
            jg r6 = r11.i
            jg r7 = r11.h
            if (r4 != r13) goto Lc3
            r7.d(r12)
            r6.d(r2)
            return
        Lc3:
            pc r13 = r11.b
            if (r14 != 0) goto Lca
            float r13 = r13.S
            goto Lcc
        Lca:
            float r13 = r13.T
        Lcc:
            if (r0 != r1) goto Ld3
            int r12 = r0.g
            int r2 = r1.g
            r13 = r5
        Ld3:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r14 = (float) r2
            float r14 = r14 * r13
            float r14 = r14 + r12
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.g
            int r13 = r3.g
            int r12 = r12 + r13
            r6.d(r12)
        Le6:
            return
    }
}
