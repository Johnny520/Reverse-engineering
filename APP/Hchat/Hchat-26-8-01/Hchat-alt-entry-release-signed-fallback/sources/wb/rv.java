package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class rv implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f18966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f18968i;

    public rv(i0.a1 r1, java.util.ArrayList r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f18966g = r2
            r0.f18967h = r1
            r0.f18968i = r3
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r7 = this;
            r.d r8 = (r.d) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            r11 = r10 & 6
            if (r11 != 0) goto L20
            boolean r8 = r4.f(r8)
            if (r8 == 0) goto L1d
            r8 = 4
            goto L1e
        L1d:
            r8 = 2
        L1e:
            r8 = r8 | r10
            goto L21
        L20:
            r8 = r10
        L21:
            r10 = r10 & 48
            if (r10 != 0) goto L31
            boolean r10 = r4.d(r9)
            if (r10 == 0) goto L2e
            r10 = 32
            goto L30
        L2e:
            r10 = 16
        L30:
            r8 = r8 | r10
        L31:
            r10 = r8 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            r6 = 0
            r0 = 1
            if (r10 == r11) goto L3b
            r10 = r0
            goto L3c
        L3b:
            r10 = r6
        L3c:
            r8 = r8 & r0
            boolean r8 = r4.S(r8, r10)
            if (r8 == 0) goto L90
            java.util.ArrayList r8 = r7.f18966g
            java.lang.Object r8 = r8.get(r9)
            r1 = r8
            wb.jv r1 = (wb.jv) r1
            r8 = 1985782921(0x765ca489, float:1.1187915E33)
            r4.a0(r8)
            wb.y2 r0 = wb.y2.f20291p
            i0.a1 r8 = r7.f18967h
            java.lang.Object r9 = r8.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.lang.String r10 = r1.f17140a
            boolean r2 = r9.contains(r10)
            boolean r9 = r4.f(r8)
            boolean r10 = r4.h(r1)
            r9 = r9 | r10
            boolean r10 = r7.f18968i
            boolean r11 = r4.g(r10)
            r9 = r9 | r11
            java.lang.Object r11 = r4.P()
            if (r9 != 0) goto L7c
            i0.e r9 = i0.l.f5952a
            if (r11 != r9) goto L84
        L7c:
            wb.qv r11 = new wb.qv
            r11.<init>(r1, r10, r8)
            r4.k0(r11)
        L84:
            r3 = r11
            fg.a r3 = (fg.a) r3
            r5 = 3072(0xc00, float:4.305E-42)
            r0.h(r1, r2, r3, r4, r5)
            r4.p(r6)
            goto L93
        L90:
            r4.V()
        L93:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
