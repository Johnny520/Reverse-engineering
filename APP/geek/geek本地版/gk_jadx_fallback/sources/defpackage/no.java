package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class no extends defpackage.qb0 {
    @Override // defpackage.hg
    public final void a(defpackage.hg r10) {
            r9 = this;
            pc r10 = r9.b
            e7 r10 = (defpackage.e7) r10
            int r0 = r10.f0
            jg r1 = r9.h
            java.util.ArrayList r2 = r1.l
            int r3 = r2.size()
            r4 = -1
            r5 = 0
            r7 = r4
            r6 = r5
        L12:
            if (r6 >= r3) goto L27
            java.lang.Object r8 = r2.get(r6)
            int r6 = r6 + 1
            jg r8 = (defpackage.jg) r8
            int r8 = r8.g
            if (r7 == r4) goto L22
            if (r8 >= r7) goto L23
        L22:
            r7 = r8
        L23:
            if (r5 >= r8) goto L12
            r5 = r8
            goto L12
        L27:
            if (r0 == 0) goto L34
            r2 = 2
            if (r0 != r2) goto L2d
            goto L34
        L2d:
            int r10 = r10.h0
            int r5 = r5 + r10
            r1.d(r5)
            return
        L34:
            int r10 = r10.h0
            int r7 = r7 + r10
            r1.d(r7)
            return
    }

    @Override // defpackage.qb0
    public final void d() {
            r8 = this;
            pc r0 = r8.b
            boolean r1 = r0 instanceof defpackage.e7
            if (r1 == 0) goto Lf1
            jg r1 = r8.h
            r2 = 1
            r1.b = r2
            java.util.ArrayList r3 = r1.l
            e7 r0 = (defpackage.e7) r0
            int r4 = r0.f0
            boolean r5 = r0.g0
            r6 = 8
            r7 = 0
            if (r4 == 0) goto Lbe
            if (r4 == r2) goto L8a
            r2 = 2
            if (r4 == r2) goto L56
            r2 = 3
            if (r4 == r2) goto L22
            goto Lf1
        L22:
            r2 = 7
            r1.e = r2
        L25:
            int r2 = r0.e0
            if (r7 >= r2) goto L43
            pc[] r2 = r0.d0
            r2 = r2[r7]
            if (r5 != 0) goto L34
            int r4 = r2.V
            if (r4 != r6) goto L34
            goto L40
        L34:
            m90 r2 = r2.e
            jg r2 = r2.i
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        L40:
            int r7 = r7 + 1
            goto L25
        L43:
            pc r0 = r8.b
            m90 r0 = r0.e
            jg r0 = r0.h
            r8.m(r0)
            pc r0 = r8.b
            m90 r0 = r0.e
            jg r0 = r0.i
            r8.m(r0)
            return
        L56:
            r2 = 6
            r1.e = r2
        L59:
            int r2 = r0.e0
            if (r7 >= r2) goto L77
            pc[] r2 = r0.d0
            r2 = r2[r7]
            if (r5 != 0) goto L68
            int r4 = r2.V
            if (r4 != r6) goto L68
            goto L74
        L68:
            m90 r2 = r2.e
            jg r2 = r2.h
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        L74:
            int r7 = r7 + 1
            goto L59
        L77:
            pc r0 = r8.b
            m90 r0 = r0.e
            jg r0 = r0.h
            r8.m(r0)
            pc r0 = r8.b
            m90 r0 = r0.e
            jg r0 = r0.i
            r8.m(r0)
            return
        L8a:
            r2 = 5
            r1.e = r2
        L8d:
            int r2 = r0.e0
            if (r7 >= r2) goto Lab
            pc[] r2 = r0.d0
            r2 = r2[r7]
            if (r5 != 0) goto L9c
            int r4 = r2.V
            if (r4 != r6) goto L9c
            goto La8
        L9c:
            po r2 = r2.d
            jg r2 = r2.i
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        La8:
            int r7 = r7 + 1
            goto L8d
        Lab:
            pc r0 = r8.b
            po r0 = r0.d
            jg r0 = r0.h
            r8.m(r0)
            pc r0 = r8.b
            po r0 = r0.d
            jg r0 = r0.i
            r8.m(r0)
            return
        Lbe:
            r2 = 4
            r1.e = r2
        Lc1:
            int r2 = r0.e0
            if (r7 >= r2) goto Ldf
            pc[] r2 = r0.d0
            r2 = r2[r7]
            if (r5 != 0) goto Ld0
            int r4 = r2.V
            if (r4 != r6) goto Ld0
            goto Ldc
        Ld0:
            po r2 = r2.d
            jg r2 = r2.h
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        Ldc:
            int r7 = r7 + 1
            goto Lc1
        Ldf:
            pc r0 = r8.b
            po r0 = r0.d
            jg r0 = r0.h
            r8.m(r0)
            pc r0 = r8.b
            po r0 = r0.d
            jg r0 = r0.i
            r8.m(r0)
        Lf1:
            return
    }

    @Override // defpackage.qb0
    public final void e() {
            r4 = this;
            pc r0 = r4.b
            boolean r1 = r0 instanceof defpackage.e7
            if (r1 == 0) goto L1c
            r1 = r0
            e7 r1 = (defpackage.e7) r1
            int r1 = r1.f0
            jg r2 = r4.h
            if (r1 == 0) goto L18
            r3 = 1
            if (r1 != r3) goto L13
            goto L18
        L13:
            int r1 = r2.g
            r0.O = r1
            return
        L18:
            int r1 = r2.g
            r0.N = r1
        L1c:
            return
    }

    @Override // defpackage.qb0
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            jg r0 = r1.h
            r0.c()
            return
    }

    @Override // defpackage.qb0
    public final boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void m(defpackage.jg r3) {
            r2 = this;
            jg r0 = r2.h
            java.util.ArrayList r1 = r0.k
            r1.add(r3)
            java.util.ArrayList r3 = r3.l
            r3.add(r0)
            return
    }
}
