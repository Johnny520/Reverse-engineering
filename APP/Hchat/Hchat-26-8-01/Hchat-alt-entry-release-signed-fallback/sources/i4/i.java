package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class i implements i4.k, u4.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6461g;

    public i() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f6461g = r0
            return
    }

    public i(int r1) {
            r0 = this;
            r0.<init>()
            r0.f6461g = r1
            return
    }

    @Override // i4.k
    public void a(int r1, int r2, w4.c r3) {
            r0 = this;
            return
    }

    @Override // i4.k
    public void b(int r1, int r2, int r3, v4.a r4, int r5) {
            r0 = this;
            return
    }

    @Override // i4.k
    public void c(int r1, int r2, v4.d0 r3, java.util.ArrayList r4) {
            r0 = this;
            return
    }

    @Override // i4.k
    public void d(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // u4.h
    public void e(u4.v r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    @Override // i4.k
    public int f() {
            r1 = this;
            int r0 = r1.f6461g
            return r0
    }

    @Override // i4.k
    public void g(int r1, int r2, i4.n r3, int r4) {
            r0 = this;
            return
    }

    @Override // i4.k
    public void h(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // i4.k
    public void i(int r1, int r2, int r3, int r4, w4.c r5, int r6) {
            r0 = this;
            return
    }

    @Override // u4.h
    public void j(u4.j r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    public int k() {
            r2 = this;
            int r0 = r2.f6461g
            int r1 = r0 + 1
            r2.f6461g = r1
            return r0
    }

    @Override // u4.h
    public void l(u4.u r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    @Override // u4.h
    public void m(u4.l r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    public void n(u4.i r5) {
            r4 = this;
            u4.o r0 = r5.f13384i
            if (r0 == 0) goto L11
            int r1 = r0.f13400g
            int r0 = r0.j()
            int r0 = r0 + r1
            int r1 = r4.f6461g
            if (r0 <= r1) goto L11
            r4.f6461g = r0
        L11:
            u4.p r5 = r5.f13385j
            java.lang.Object[] r0 = r5.f22543h
            int r0 = r0.length
            r1 = 0
        L17:
            if (r1 >= r0) goto L2f
            java.lang.Object r2 = r5.l(r1)
            u4.o r2 = (u4.o) r2
            int r3 = r2.f13400g
            int r2 = r2.j()
            int r2 = r2 + r3
            int r3 = r4.f6461g
            if (r2 <= r3) goto L2c
            r4.f6461g = r2
        L2c:
            int r1 = r1 + 1
            goto L17
        L2f:
            return
    }

    @Override // u4.h
    public void o(u4.m r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    @Override // u4.h
    public void u(u4.g r1) {
            r0 = this;
            r0.n(r1)
            return
    }

    @Override // u4.h
    public void x(u4.u r1) {
            r0 = this;
            r0.n(r1)
            return
    }
}
