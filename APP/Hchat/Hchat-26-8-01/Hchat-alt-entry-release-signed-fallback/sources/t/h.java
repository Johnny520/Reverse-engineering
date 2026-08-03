package t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends y0.n implements c2.a, x1.u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m.k f12970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12971v;

    public static final e1.c k1(t.h r2, x1.i1 r3, c1.b r4) {
            boolean r0 = r2.f21832t
            r1 = 0
            if (r0 != 0) goto L6
            goto L24
        L6:
            boolean r0 = r2.f12971v
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            x1.i1 r2 = x1.k.v(r2)
            y0.n r0 = r3.r1()
            boolean r0 = r0.f21832t
            if (r0 == 0) goto L18
            goto L19
        L18:
            r3 = r1
        L19:
            if (r3 != 0) goto L1c
            goto L24
        L1c:
            java.lang.Object r4 = r4.invoke()
            e1.c r4 = (e1.c) r4
            if (r4 != 0) goto L25
        L24:
            return r1
        L25:
            r0 = 0
            e1.c r2 = r2.k0(r3, r0)
            long r2 = r2.d()
            e1.c r2 = r4.i(r2)
            return r2
    }

    @Override // c2.a
    public final java.lang.Object A0(x1.i1 r8, c1.b r9, yf.c r10) {
            r7 = this;
            ab.e r4 = new ab.e
            r0 = 13
            r4.<init>(r7, r8, r9, r0)
            t.g r0 = new t.g
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r8 = qg.v.e(r0, r10)
            xf.a r9 = xf.a.f21579g
            if (r8 != r9) goto L1a
            return r8
        L1a:
            sf.n r8 = sf.n.f12433a
            return r8
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.u
    public final void p0(v1.t r1) {
            r0 = this;
            r1 = 1
            r0.f12971v = r1
            return
    }
}
