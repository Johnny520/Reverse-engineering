package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20355h;

    public /* synthetic */ yb(int r1, int r2) {
            r0 = this;
            r0.f20354g = r2
            r0.f20355h = r1
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f20354g
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            switch(r0) {
                case 0: goto Lc4;
                case 1: goto L8a;
                case 2: goto L4f;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r10 == r0) goto L1c
            r10 = r2
            goto L1d
        L1c:
            r10 = r1
        L1d:
            r12 = r12 & r2
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L49
            int r10 = r9.f20355h
            if (r10 != 0) goto L2b
            float r12 = (float) r1
        L29:
            r5 = r12
            goto L2f
        L2b:
            r12 = 10
            float r12 = (float) r12
            goto L29
        L2f:
            r7 = 0
            r8 = 13
            y0.l r3 = y0.l.f21818a
            r4 = 0
            r6 = 0
            y0.o r12 = p.d.p(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            java.lang.String r0 = "第 "
            java.lang.String r2 = " 条"
            java.lang.String r10 = eh.a.m(r10, r0, r2)
            r0 = 12
            sh.s.j(r10, r12, r11, r1, r0)
            goto L4c
        L49:
            r11.V()
        L4c:
            sf.n r10 = sf.n.f12433a
            return r10
        L4f:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r10 == r0) goto L57
            r10 = r2
            goto L58
        L57:
            r10 = r1
        L58:
            r12 = r12 & r2
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L84
            int r10 = r9.f20355h
            if (r10 != 0) goto L66
            float r12 = (float) r1
        L64:
            r5 = r12
            goto L6a
        L66:
            r12 = 10
            float r12 = (float) r12
            goto L64
        L6a:
            r7 = 0
            r8 = 13
            y0.l r3 = y0.l.f21818a
            r4 = 0
            r6 = 0
            y0.o r12 = p.d.p(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            java.lang.String r0 = "第 "
            java.lang.String r2 = " 条"
            java.lang.String r10 = eh.a.m(r10, r0, r2)
            r0 = 12
            sh.s.j(r10, r12, r11, r1, r0)
            goto L87
        L84:
            r11.V()
        L87:
            sf.n r10 = sf.n.f12433a
            return r10
        L8a:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r10 == r0) goto L92
            r10 = r2
            goto L93
        L92:
            r10 = r1
        L93:
            r12 = r12 & r2
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto Lbe
            int r10 = r9.f20355h
            if (r10 != 0) goto La3
            r12 = 10
        La0:
            float r12 = (float) r12
            r5 = r12
            goto La6
        La3:
            r12 = 18
            goto La0
        La6:
            r7 = 0
            r8 = 13
            y0.l r3 = y0.l.f21818a
            r4 = 0
            r6 = 0
            y0.o r12 = p.d.p(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            java.lang.String r0 = "规则 "
            java.lang.String r10 = eh.a.l(r10, r0)
            r0 = 12
            sh.s.j(r10, r12, r11, r1, r0)
            goto Lc1
        Lbe:
            r11.V()
        Lc1:
            sf.n r10 = sf.n.f12433a
            return r10
        Lc4:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r10 == r0) goto Lcc
            r10 = r2
            goto Lcd
        Lcc:
            r10 = r1
        Lcd:
            r12 = r12 & r2
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto Lf8
            int r10 = r9.f20355h
            if (r10 != 0) goto Ldd
            r12 = 10
        Lda:
            float r12 = (float) r12
            r5 = r12
            goto Le0
        Ldd:
            r12 = 18
            goto Lda
        Le0:
            r7 = 0
            r8 = 13
            y0.l r3 = y0.l.f21818a
            r4 = 0
            r6 = 0
            y0.o r12 = p.d.p(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            java.lang.String r0 = "规则 "
            java.lang.String r10 = eh.a.l(r10, r0)
            r0 = 12
            sh.s.j(r10, r12, r11, r1, r0)
            goto Lfb
        Lf8:
            r11.V()
        Lfb:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
