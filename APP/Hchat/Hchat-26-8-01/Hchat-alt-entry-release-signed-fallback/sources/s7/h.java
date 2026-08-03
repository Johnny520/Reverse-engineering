package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends s7.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12376o;

    @Override // o7.b
    public final void W(k7.a r1) {
            r0 = this;
            r7.u r1 = (r7.u) r1
            r1.R()
            return
    }

    @Override // s7.d, o7.b
    public final void X() {
            r0 = this;
            super.X()
            r0.n0()
            return
    }

    public final void m0() {
            r5 = this;
            boolean r0 = r5.f12376o
            if (r0 != 0) goto L35
            r0 = 1
            r5.f12376o = r0
            z7.c r0 = r5.f9563k
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L35
            k7.a r2 = r5.Q(r1)
            r7.u r2 = (r7.u) r2
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()
            r7.w r3 = (r7.w) r3
            r7.v r3 = r3.f11591m
            r7.s r4 = r3.a()
            if (r4 == 0) goto L1a
            r4.P(r3)
            goto L1a
        L32:
            int r1 = r1 + 1
            goto Le
        L35:
            return
    }

    public final void n0() {
            r7 = this;
            java.lang.Class<u7.c> r0 = u7.c.class
            k7.a r1 = r7.v(r0)
            u7.c r1 = (u7.c) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            s7.g r1 = r1.f13531p
            boolean r1 = r1.f12375q
            r1 = r1 ^ r3
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 != 0) goto L16
            return
        L16:
            super.e0()
            z7.c r1 = r7.f9563k
            java.util.Iterator r1 = r1.b()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            r7.u r4 = (r7.u) r4
            r7.s r5 = r4.f11590p
            if (r5 == 0) goto L1f
            int r5 = r5.f7388g
            int r6 = r4.f7388g
            if (r5 == r6) goto L1f
            r7.T(r5, r4)
            r2 = r3
            goto L1f
        L3a:
            if (r2 == 0) goto L45
            k7.a r0 = r7.v(r0)
            u7.c r0 = (u7.c) r0
            r0.X()
        L45:
            if (r2 == 0) goto L4b
            boolean r0 = super.e0()
        L4b:
            ce.n r0 = new ce.n
            r1 = 29
            r0.<init>(r1)
            r7.f0(r0)
            return
    }
}
