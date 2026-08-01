package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends defpackage.qb0 {
    @Override // defpackage.hg
    public final void a(defpackage.hg r3) {
            r2 = this;
            jg r3 = r2.h
            boolean r0 = r3.c
            if (r0 != 0) goto L7
            goto Lb
        L7:
            boolean r0 = r3.j
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            java.util.ArrayList r0 = r3.l
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            jg r0 = (defpackage.jg) r0
            pc r1 = r2.b
            go r1 = (defpackage.go) r1
            int r0 = r0.g
            float r0 = (float) r0
            float r1 = r1.d0
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r3.d(r0)
            return
    }

    @Override // defpackage.qb0
    public final void d() {
            r7 = this;
            pc r0 = r7.b
            r1 = r0
            go r1 = (defpackage.go) r1
            int r2 = r1.e0
            int r3 = r1.f0
            int r1 = r1.h0
            r4 = -1
            jg r5 = r7.h
            r6 = 1
            if (r1 != r6) goto L79
            if (r2 == r4) goto L2e
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.h
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
            r5.f = r2
            goto L66
        L2e:
            if (r3 == r4) goto L4c
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.i
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
            int r0 = -r3
            r5.f = r0
            goto L66
        L4c:
            r5.b = r6
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.i
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            po r0 = r0.d
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
        L66:
            pc r0 = r7.b
            po r0 = r0.d
            jg r0 = r0.h
            r7.m(r0)
            pc r0 = r7.b
            po r0 = r0.d
            jg r0 = r0.i
            r7.m(r0)
            return
        L79:
            if (r2 == r4) goto L96
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.h
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
            r5.f = r2
            goto Lce
        L96:
            if (r3 == r4) goto Lb4
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.i
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
            int r0 = -r3
            r5.f = r0
            goto Lce
        Lb4:
            r5.b = r6
            java.util.ArrayList r1 = r5.l
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.i
            r1.add(r0)
            pc r0 = r7.b
            pc r0 = r0.I
            m90 r0 = r0.e
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r5)
        Lce:
            pc r0 = r7.b
            m90 r0 = r0.e
            jg r0 = r0.h
            r7.m(r0)
            pc r0 = r7.b
            m90 r0 = r0.e
            jg r0 = r0.i
            r7.m(r0)
            return
    }

    @Override // defpackage.qb0
    public final void e() {
            r4 = this;
            pc r0 = r4.b
            r1 = r0
            go r1 = (defpackage.go) r1
            int r1 = r1.h0
            r2 = 1
            jg r3 = r4.h
            if (r1 != r2) goto L11
            int r1 = r3.g
            r0.N = r1
            return
        L11:
            int r1 = r3.g
            r0.O = r1
            return
    }

    @Override // defpackage.qb0
    public final void f() {
            r1 = this;
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
