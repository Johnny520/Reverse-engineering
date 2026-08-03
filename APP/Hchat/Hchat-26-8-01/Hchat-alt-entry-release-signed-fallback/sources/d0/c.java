package d0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.d f1891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.h1 f1892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.j1 f1893c;

    public c(s0.d r1) {
            r0 = this;
            r0.<init>()
            r0.f1891a = r1
            k.h1 r1 = new k.h1
            r1.<init>()
            r0.f1892b = r1
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f1893c = r1
            return
    }

    @Override // d0.e
    public final java.lang.Object a(d0.d r4, yf.i r5) {
            r3 = this;
            d0.b r0 = new d0.b
            r0.<init>(r4)
            b0.g r4 = new b0.g
            r1 = 0
            r2 = 1
            r4.<init>(r3, r0, r1, r2)
            k.h1 r0 = r3.f1892b
            java.lang.Object r4 = k.h1.b(r0, r4, r5)
            xf.a r5 = xf.a.f21579g
            if (r4 != r5) goto L17
            return r4
        L17:
            sf.n r4 = sf.n.f12433a
            return r4
    }

    public final void b(fg.a r8, i0.h0 r9, int r10) {
            r7 = this;
            r0 = 723898654(0x2b25d11e, float:5.8909984E-13)
            r9.b0(r0)
            boolean r0 = r9.f(r7)
            if (r0 == 0) goto Lf
            r0 = 32
            goto L11
        Lf:
            r0 = 16
        L11:
            r0 = r0 | r10
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0 = r0 & r3
            boolean r0 = r9.S(r0, r1)
            if (r0 == 0) goto L4d
            i0.j1 r0 = r7.f1893c
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            d0.b r2 = (d0.b) r2
            if (r2 != 0) goto L3d
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto L60
            d0.a r0 = new d0.a
            r1 = 0
            r0.<init>(r7, r8, r10, r1)
            r9.f6035d = r0
            return
        L3d:
            d0.d r3 = r2.f1889a
            r0 = 384(0x180, float:5.38E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            s0.d r1 = r7.f1891a
            r4 = r8
            r5 = r9
            r1.d(r2, r3, r4, r5, r6)
            goto L52
        L4d:
            r4 = r8
            r5 = r9
            r5.V()
        L52:
            i0.r1 r8 = r5.t()
            if (r8 == 0) goto L60
            d0.a r9 = new d0.a
            r0 = 1
            r9.<init>(r7, r4, r10, r0)
            r8.f6035d = r9
        L60:
            return
    }
}
