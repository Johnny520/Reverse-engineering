package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements i.p1, i0.a, u4.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f5818i;

    public u1(int r1, int r2, fg.a r3) {
            r0 = this;
            r0.<init>()
            r0.f5816g = r1
            r0.f5817h = r2
            r0.f5818i = r3
            return
    }

    public u1(int r3, int r4, i.v r5) {
            r2 = this;
            r2.<init>()
            r2.f5816g = r3
            r2.f5817h = r4
            hb.c r0 = new hb.c
            i.b0 r1 = new i.b0
            r1.<init>(r3, r4, r5)
            r0.<init>(r1)
            r2.f5818i = r0
            return
    }

    public u1(i0.a r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f5818i = r1
            r0.f5816g = r2
            return
    }

    public u1(boolean[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5818i = r1
            r0.f5816g = r2
            r0.f5817h = r3
            return
    }

    @Override // i0.a
    public void c(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.f5818i
            i0.a r0 = (i0.a) r0
            int r1 = r2.f5817h
            if (r1 != 0) goto Lb
            int r1 = r2.f5816g
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int r3 = r3 + r1
            r0.c(r3, r4)
            return
    }

    @Override // i0.a
    public void d(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5817h
            int r0 = r0 + 1
            r1.f5817h = r0
            java.lang.Object r0 = r1.f5818i
            i0.a r0 = (i0.a) r0
            r0.d(r2)
            return
    }

    @Override // u4.h
    public void e(u4.v r1) {
            r0 = this;
            return
    }

    @Override // i0.a
    public void f() {
            r1 = this;
            java.lang.Object r0 = r1.f5818i
            i0.a r0 = (i0.a) r0
            r0.f()
            return
    }

    @Override // i0.a
    public void h(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f5817h
            if (r0 != 0) goto L7
            int r0 = r2.f5816g
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Object r1 = r2.f5818i
            i0.a r1 = (i0.a) r1
            int r3 = r3 + r0
            int r4 = r4 + r0
            r1.h(r3, r4, r5)
            return
    }

    @Override // i0.a
    public void i(int r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.f5818i
            i0.a r0 = (i0.a) r0
            int r1 = r2.f5817h
            if (r1 != 0) goto Lb
            int r1 = r2.f5816g
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int r3 = r3 + r1
            r0.i(r3, r4)
            return
    }

    @Override // u4.h
    public void j(u4.j r1) {
            r0 = this;
            return
    }

    @Override // i0.a
    public void k() {
            r1 = this;
            int r0 = r1.f5817h
            if (r0 <= 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "OffsetApplier up called with no corresponding down"
            i0.m.a(r0)
        La:
            int r0 = r1.f5817h
            int r0 = r0 + (-1)
            r1.f5817h = r0
            java.lang.Object r0 = r1.f5818i
            i0.a r0 = (i0.a) r0
            r0.k()
            return
    }

    @Override // u4.h
    public void l(u4.u r1) {
            r0 = this;
            return
    }

    @Override // u4.h
    public void m(u4.l r6) {
            r5 = this;
            u4.r r0 = r6.f13382g
            int r0 = r0.f13406a
            r1 = 3
            if (r0 != r1) goto L27
            v4.a r0 = r6.f13370k
            v4.o r0 = (v4.o) r0
            int r0 = r0.f14121g
            java.lang.Object r1 = r5.f5818i
            boolean[] r1 = (boolean[]) r1
            r2 = 0
            boolean r3 = r1[r2]
            if (r3 == 0) goto L24
            int r3 = r5.f5816g
            int r4 = r5.f5817h
            int r3 = r3 - r4
            int r3 = r3 + r0
            u4.o r6 = r6.f13384i
            int r6 = r6.f13400g
            if (r3 != r6) goto L24
            r6 = 1
            goto L25
        L24:
            r6 = r2
        L25:
            r1[r2] = r6
        L27:
            return
    }

    @Override // i.n1
    public i.q n(long r8, i.q r10, i.q r11, i.q r12) {
            r7 = this;
            java.lang.Object r0 = r7.f5818i
            r1 = r0
            hb.c r1 = (hb.c) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            i.q r8 = r1.n(r2, r4, r5, r6)
            return r8
    }

    @Override // u4.h
    public void o(u4.m r1) {
            r0 = this;
            return
    }

    @Override // i0.a
    public void p(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.f5818i
            i0.a r0 = (i0.a) r0
            int r1 = r2.f5817h
            if (r1 != 0) goto Lb
            int r1 = r2.f5816g
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int r3 = r3 + r1
            r0.p(r3, r4)
            return
    }

    @Override // i0.a
    public java.lang.Object r() {
            r1 = this;
            java.lang.Object r0 = r1.f5818i
            i0.a r0 = (i0.a) r0
            java.lang.Object r0 = r0.r()
            return r0
    }

    @Override // i.p1
    public int s() {
            r1 = this;
            int r0 = r1.f5817h
            return r0
    }

    @Override // i0.a
    public void t(fg.p r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.f5818i
            i0.a r0 = (i0.a) r0
            r0.t(r2, r3)
            return
    }

    @Override // u4.h
    public void u(u4.g r1) {
            r0 = this;
            return
    }

    @Override // i.p1
    public int v() {
            r1 = this;
            int r0 = r1.f5816g
            return r0
    }

    @Override // i.n1
    public i.q w(long r8, i.q r10, i.q r11, i.q r12) {
            r7 = this;
            java.lang.Object r0 = r7.f5818i
            r1 = r0
            hb.c r1 = (hb.c) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            i.q r8 = r1.w(r2, r4, r5, r6)
            return r8
    }

    @Override // u4.h
    public void x(u4.u r1) {
            r0 = this;
            return
    }
}
