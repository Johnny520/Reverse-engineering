package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.p f4665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h.t f4667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0.d f4668j;

    public g(w0.p r1, java.lang.Object r2, h.t r3, s0.d r4) {
            r0 = this;
            r0.f4665g = r1
            r0.f4666h = r2
            r0.f4667i = r3
            r0.f4668j = r4
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            h.b0 r7 = (h.b0) r7
            i0.h0 r8 = (i0.h0) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0 = r9 & 6
            if (r0 != 0) goto L21
            r0 = r9 & 8
            if (r0 != 0) goto L17
            boolean r0 = r8.f(r7)
            goto L1b
        L17:
            boolean r0 = r8.h(r7)
        L1b:
            if (r0 == 0) goto L1f
            r0 = 4
            goto L20
        L1f:
            r0 = 2
        L20:
            r9 = r9 | r0
        L21:
            r0 = r9 & 19
            r1 = 18
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r2
        L2c:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L85
            w0.p r9 = r6.f4665g
            boolean r0 = r8.f(r9)
            java.lang.Object r1 = r6.f4666h
            boolean r3 = r8.h(r1)
            r0 = r0 | r3
            h.t r3 = r6.f4667i
            boolean r4 = r8.h(r3)
            r0 = r0 | r4
            java.lang.Object r4 = r8.P()
            i0.e r5 = i0.l.f5952a
            if (r0 != 0) goto L51
            if (r4 != r5) goto L5a
        L51:
            b1.g r4 = new b1.g
            r0 = 2
            r4.<init>(r9, r1, r3, r0)
            r8.k0(r4)
        L5a:
            fg.l r4 = (fg.l) r4
            i0.r.c(r7, r4, r8)
            f.k0 r9 = r3.f4756c
            r7.getClass()
            h.c0 r7 = (h.c0) r7
            i0.j1 r7 = r7.f4628a
            r9.m(r1, r7)
            java.lang.Object r7 = r8.P()
            if (r7 != r5) goto L79
            h.n r7 = new h.n
            r7.<init>()
            r8.k0(r7)
        L79:
            h.n r7 = (h.n) r7
            s0.d r9 = r6.f4668j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r9.c(r7, r1, r8, r0)
            goto L88
        L85:
            r8.V()
        L88:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
