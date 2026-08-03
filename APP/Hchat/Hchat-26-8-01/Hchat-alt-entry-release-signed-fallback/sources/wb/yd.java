package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f20376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20378j;

    public /* synthetic */ yd(java.lang.String r2, boolean r3, fg.a r4) {
            r1 = this;
            r0 = 1
            r1.f20375g = r0
            r1.<init>()
            r1.f20377i = r2
            r1.f20376h = r3
            r1.f20378j = r4
            return
    }

    public /* synthetic */ yd(boolean r2, fg.l r3, java.util.List r4) {
            r1 = this;
            r0 = 0
            r1.f20375g = r0
            r1.<init>()
            r1.f20376h = r2
            r1.f20377i = r3
            r1.f20378j = r4
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r0 = r4.f20375g
            switch(r0) {
                case 0: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f20377i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f20378j
            fg.a r1 = (fg.a) r1
            r.d r5 = (r.d) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.getClass()
            r5 = r7 & 17
            r2 = 16
            r3 = 1
            if (r5 == r2) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = 0
        L24:
            r7 = r7 & r3
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L40
            wb.zf r5 = new wb.zf
            boolean r7 = r4.f20376h
            r5.<init>(r0, r7, r1)
            r7 = 715358498(0x2aa38122, float:2.904422E-13)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r3)
            goto L43
        L40:
            r6.V()
        L43:
            sf.n r5 = sf.n.f12433a
            return r5
        L46:
            java.lang.Object r0 = r4.f20377i
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r4.f20378j
            java.util.List r1 = (java.util.List) r1
            r.d r5 = (r.d) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.getClass()
            r5 = r7 & 17
            r2 = 16
            r3 = 1
            if (r5 == r2) goto L64
            r5 = r3
            goto L65
        L64:
            r5 = 0
        L65:
            r7 = r7 & r3
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L81
            wb.zf r5 = new wb.zf
            boolean r7 = r4.f20376h
            r5.<init>(r7, r0, r1)
            r7 = 427485979(0x197aeb1b, float:1.2972176E-23)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r3)
            goto L84
        L81:
            r6.V()
        L84:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
