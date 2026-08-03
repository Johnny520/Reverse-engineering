package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements x1.e1 {
    public static final int g(int r1, long r2) {
            int r0 = x1.c2.f20854b
            int r1 = r1 * 15
            long r1 = r2 >> r1
            int r1 = (int) r1
            r1 = r1 & 32767(0x7fff, float:4.5916E-41)
            return r1
    }

    public static long h(int r3, int r4, int r5, int r6) {
            r3 = r3 & 32767(0x7fff, float:4.5916E-41)
            long r0 = (long) r3
            r3 = r4 & 32767(0x7fff, float:4.5916E-41)
            long r3 = (long) r3
            r2 = 15
            long r3 = r3 << r2
            long r3 = r3 | r0
            r5 = r5 & 32767(0x7fff, float:4.5916E-41)
            long r0 = (long) r5
            r5 = 30
            long r0 = r0 << r5
            long r3 = r3 | r0
            r5 = r6 & 32767(0x7fff, float:4.5916E-41)
            long r5 = (long) r5
            r0 = 45
            long r5 = r5 << r0
            long r3 = r3 | r5
            r5 = -9223372036854775808
            long r3 = r3 | r5
            return r3
    }

    @Override // x1.e1
    public int a() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // x1.e1
    public boolean b(y0.n r2) {
            r1 = this;
            x1.f0 r2 = x1.k.w(r2)
            r0 = 0
            f2.q r2 = f2.t.a(r2, r0)
            boolean r2 = f2.t.h(r2)
            return r2
    }

    @Override // x1.e1
    public boolean c(x1.f0 r3) {
            r2 = this;
            f2.m r3 = r3.w()
            r0 = 0
            r1 = 1
            if (r3 == 0) goto Ld
            boolean r3 = r3.f3207j
            if (r3 != r1) goto Ld
            r0 = r1
        Ld:
            r3 = r0 ^ 1
            return r3
    }

    @Override // x1.e1
    public boolean d(x1.p r1, x1.f0 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // x1.e1
    public void e(x1.f0 r9, long r10, x1.p r12, int r13, boolean r14) {
            r8 = this;
            x1.b1 r9 = r9.L
            x1.i1 r13 = r9.f20842d
            f1.o0 r0 = x1.i1.T
            long r3 = r13.o1(r10)
            x1.i1 r1 = r9.f20842d
            x1.d1 r2 = x1.i1.X
            r6 = 1
            r5 = r12
            r7 = r14
            r1.w1(r2, r3, r5, r6, r7)
            return
    }

    @Override // x1.e1
    public boolean f(y0.n r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
