package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class go extends defpackage.pc {
    public float d0;
    public int e0;
    public int f0;
    public defpackage.cc g0;
    public int h0;

    public go() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d0 = r0
            r0 = -1
            r4.e0 = r0
            r4.f0 = r0
            cc r0 = r4.y
            r4.g0 = r0
            r0 = 0
            r4.h0 = r0
            java.util.ArrayList r1 = r4.G
            r1.clear()
            java.util.ArrayList r1 = r4.G
            cc r2 = r4.g0
            r1.add(r2)
            cc[] r1 = r4.F
            int r1 = r1.length
        L22:
            if (r0 >= r1) goto L2d
            cc[] r2 = r4.F
            cc r3 = r4.g0
            r2[r0] = r3
            int r0 = r0 + 1
            goto L22
        L2d:
            return
    }

    @Override // defpackage.pc
    public final void A(defpackage.ar r4) {
            r3 = this;
            pc r0 = r3.I
            if (r0 != 0) goto L5
            return
        L5:
            cc r0 = r3.g0
            r4.getClass()
            int r4 = defpackage.ar.m(r0)
            int r0 = r3.h0
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L25
            r3.N = r4
            r3.O = r2
            pc r4 = r3.I
            int r4 = r4.i()
            r3.v(r4)
            r3.y(r2)
            return
        L25:
            r3.N = r2
            r3.O = r4
            pc r4 = r3.I
            int r4 = r4.l()
            r3.y(r4)
            r3.v(r2)
            return
    }

    public final void B(int r4) {
            r3 = this;
            int r0 = r3.h0
            if (r0 != r4) goto L5
            goto L2c
        L5:
            r3.h0 = r4
            java.util.ArrayList r4 = r3.G
            r4.clear()
            int r0 = r3.h0
            r1 = 1
            if (r0 != r1) goto L16
            cc r0 = r3.x
            r3.g0 = r0
            goto L1a
        L16:
            cc r0 = r3.y
            r3.g0 = r0
        L1a:
            cc r0 = r3.g0
            r4.add(r0)
            cc[] r4 = r3.F
            int r0 = r4.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L2c
            cc r2 = r3.g0
            r4[r1] = r2
            int r1 = r1 + 1
            goto L23
        L2c:
            return
    }

    @Override // defpackage.pc
    public final void a(defpackage.ar r10) {
            r9 = this;
            pc r0 = r9.I
            qc r0 = (defpackage.qc) r0
            if (r0 != 0) goto L8
            goto La2
        L8:
            r1 = 2
            cc r2 = r0.g(r1)
            r3 = 4
            cc r3 = r0.g(r3)
            pc r4 = r9.I
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L20
            int[] r4 = r4.c0
            r4 = r4[r6]
            if (r4 != r1) goto L20
            r4 = r5
            goto L21
        L20:
            r4 = r6
        L21:
            int r7 = r9.h0
            r8 = 5
            if (r7 != 0) goto L3c
            r2 = 3
            cc r2 = r0.g(r2)
            cc r3 = r0.g(r8)
            pc r0 = r9.I
            if (r0 == 0) goto L3a
            int[] r0 = r0.c0
            r0 = r0[r5]
            if (r0 != r1) goto L3a
            goto L3b
        L3a:
            r5 = r6
        L3b:
            r4 = r5
        L3c:
            int r0 = r9.e0
            r1 = 8
            r5 = -1
            if (r0 == r5) goto L5c
            cc r0 = r9.g0
            a40 r0 = r10.j(r0)
            a40 r2 = r10.j(r2)
            int r5 = r9.e0
            r10.e(r0, r2, r5, r1)
            if (r4 == 0) goto La2
            a40 r1 = r10.j(r3)
            r10.f(r1, r0, r6, r8)
            return
        L5c:
            int r0 = r9.f0
            if (r0 == r5) goto L7d
            cc r0 = r9.g0
            a40 r0 = r10.j(r0)
            a40 r3 = r10.j(r3)
            int r5 = r9.f0
            int r5 = -r5
            r10.e(r0, r3, r5, r1)
            if (r4 == 0) goto La2
            a40 r1 = r10.j(r2)
            r10.f(r0, r1, r6, r8)
            r10.f(r3, r0, r6, r8)
            return
        L7d:
            float r0 = r9.d0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La2
            cc r0 = r9.g0
            a40 r0 = r10.j(r0)
            a40 r2 = r10.j(r3)
            float r3 = r9.d0
            p6 r4 = r10.k()
            o6 r5 = r4.d
            r5.i(r0, r1)
            o6 r0 = r4.d
            r0.i(r2, r3)
            r10.c(r4)
        La2:
            return
    }

    @Override // defpackage.pc
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.pc
    public final defpackage.cc g(int r3) {
            r2 = this;
            int r0 = defpackage.z30.t(r3)
            switch(r0) {
                case 0: goto L21;
                case 1: goto Lf;
                case 2: goto L8;
                case 3: goto Lf;
                case 4: goto L8;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto L7;
            }
        L7:
            goto L17
        L8:
            int r0 = r2.h0
            if (r0 != 0) goto L17
            cc r3 = r2.g0
            return r3
        Lf:
            int r0 = r2.h0
            r1 = 1
            if (r0 != r1) goto L17
            cc r3 = r2.g0
            return r3
        L17:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = defpackage.z30.s(r3)
            r0.<init>(r3)
            throw r0
        L21:
            r3 = 0
            return r3
    }
}
