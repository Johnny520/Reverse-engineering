package q2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10604h;

    public /* synthetic */ c(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f10603g = r2
            r0.f10604h = r1
            r0.<init>()
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            int r0 = r2.f10603g
            switch(r0) {
                case 0: goto L47;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f10604h
            fg.q r0 = (fg.q) r0
            r.d r3 = (r.d) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            r6 = r4 & 6
            if (r6 != 0) goto L26
            boolean r6 = r5.f(r3)
            if (r6 == 0) goto L24
            r6 = 4
            goto L25
        L24:
            r6 = 2
        L25:
            r4 = r4 | r6
        L26:
            r6 = r4 & 131(0x83, float:1.84E-43)
            r1 = 130(0x82, float:1.82E-43)
            if (r6 == r1) goto L2e
            r6 = 1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            r1 = r4 & 1
            boolean r6 = r5.S(r1, r6)
            if (r6 == 0) goto L41
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.b(r3, r5, r4)
            goto L44
        L41:
            r5.V()
        L44:
            sf.n r3 = sf.n.f12433a
            return r3
        L47:
            java.lang.Object r0 = r2.f10604h
            q2.d r0 = (q2.d) r0
            m2.p r3 = (m2.p) r3
            m2.k r4 = (m2.k) r4
            m2.i r5 = (m2.i) r5
            m2.j r6 = (m2.j) r6
            m2.d r1 = r0.f10609e
            int r5 = r5.f8694a
            int r6 = r6.f8695a
            m2.e r1 = (m2.e) r1
            m2.r r3 = r1.b(r3, r4, r5, r6)
            boolean r4 = r3 instanceof m2.r
            if (r4 != 0) goto L74
            b5.c r4 = new b5.c
            b5.c r5 = r0.f10614j
            r4.<init>(r3, r5)
            r0.f10614j = r4
            java.lang.Object r3 = r4.f471c
            r3.getClass()
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            goto L7b
        L74:
            java.lang.Object r3 = r3.f8711g
            r3.getClass()
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
        L7b:
            return r3
    }
}
