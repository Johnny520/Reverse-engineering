package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vb.a f16113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f16115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16118m;

    public /* synthetic */ fb(vb.a r1, android.content.SharedPreferences r2, fg.a r3, android.content.Context r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f16112g = r7
            r0.f16113h = r1
            r0.f16114i = r2
            r0.f16115j = r3
            r0.f16116k = r4
            r0.f16117l = r5
            r0.f16118m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.f16112g
            switch(r0) {
                case 0: goto Ld2;
                default: goto L5;
            }
        L5:
            wb.wo r9 = (wb.wo) r9
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r9.getClass()
            r11 = r10 & 6
            if (r11 != 0) goto L2a
            r11 = r10 & 8
            if (r11 != 0) goto L20
            boolean r11 = r4.f(r9)
            goto L24
        L20:
            boolean r11 = r4.h(r9)
        L24:
            if (r11 == 0) goto L28
            r11 = 4
            goto L29
        L28:
            r11 = 2
        L29:
            r10 = r10 | r11
        L2a:
            r11 = r10 & 19
            r0 = 18
            r1 = 1
            r7 = 0
            if (r11 == r0) goto L34
            r11 = r1
            goto L35
        L34:
            r11 = r7
        L35:
            r10 = r10 & r1
            boolean r10 = r4.S(r10, r11)
            if (r10 == 0) goto Lcc
            wb.vo r10 = wb.vo.f19791a
            boolean r10 = r9.equals(r10)
            android.content.SharedPreferences r1 = r8.f16114i
            i0.a1 r11 = r8.f16117l
            i0.a1 r0 = r8.f16118m
            i0.e r2 = i0.l.f5952a
            if (r10 == 0) goto L7f
            r9 = 976038098(0x3a2d28d2, float:6.605509E-4)
            r4.a0(r9)
            java.lang.Object r9 = r11.getValue()
            java.util.Set r9 = (java.util.Set) r9
            int r9 = r9.size()
            java.lang.Object r10 = r4.P()
            if (r10 != r2) goto L6c
            c9.x0 r10 = new c9.x0
            r2 = 27
            r10.<init>(r2, r11, r0)
            r4.k0(r10)
        L6c:
            fg.a r10 = (fg.a) r10
            r6 = 24576(0x6000, float:3.4438E-41)
            vb.a r0 = r8.f16113h
            fg.a r3 = r8.f16115j
            r2 = r9
            r5 = r4
            r4 = r10
            wb.ho.s2(r0, r1, r2, r3, r4, r5, r6)
            r4 = r5
            r4.p(r7)
            goto Lcf
        L7f:
            boolean r10 = r9 instanceof wb.uo
            if (r10 == 0) goto Lc4
            r10 = 976062779(0x3a2d893b, float:6.619875E-4)
            r4.a0(r10)
            wb.uo r9 = (wb.uo) r9
            wb.v0 r9 = r9.f19528a
            java.lang.Object r10 = r4.P()
            if (r10 != r2) goto L9d
            wb.bj r10 = new wb.bj
            r3 = 22
            r10.<init>(r0, r3)
            r4.k0(r10)
        L9d:
            fg.a r10 = (fg.a) r10
            boolean r3 = r4.h(r1)
            java.lang.Object r5 = r4.P()
            if (r3 != 0) goto Lab
            if (r5 != r2) goto Lb4
        Lab:
            wb.bc r5 = new wb.bc
            r2 = 6
            r5.<init>(r1, r11, r0, r2)
            r4.k0(r5)
        Lb4:
            r3 = r5
            fg.l r3 = (fg.l) r3
            r5 = 384(0x180, float:5.38E-43)
            android.content.Context r0 = r8.f16116k
            r1 = r9
            r2 = r10
            wb.ho.b0(r0, r1, r2, r3, r4, r5)
            r4.p(r7)
            goto Lcf
        Lc4:
            r9 = 976036625(0x3a2d2311, float:6.6046516E-4)
            af.d r9 = bc.e.d(r4, r9, r7)
            throw r9
        Lcc:
            r4.V()
        Lcf:
            sf.n r9 = sf.n.f12433a
            return r9
        Ld2:
            wb.qo r9 = (wb.qo) r9
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r9.getClass()
            r11 = r10 & 6
            if (r11 != 0) goto Lf7
            r11 = r10 & 8
            if (r11 != 0) goto Led
            boolean r11 = r4.f(r9)
            goto Lf1
        Led:
            boolean r11 = r4.h(r9)
        Lf1:
            if (r11 == 0) goto Lf5
            r11 = 4
            goto Lf6
        Lf5:
            r11 = 2
        Lf6:
            r10 = r10 | r11
        Lf7:
            r11 = r10 & 19
            r0 = 18
            r1 = 1
            r7 = 0
            if (r11 == r0) goto L101
            r11 = r1
            goto L102
        L101:
            r11 = r7
        L102:
            r10 = r10 & r1
            boolean r10 = r4.S(r10, r11)
            if (r10 == 0) goto L19a
            wb.po r10 = wb.po.f18500a
            boolean r10 = r9.equals(r10)
            android.content.SharedPreferences r1 = r8.f16114i
            i0.a1 r11 = r8.f16117l
            i0.a1 r0 = r8.f16118m
            i0.e r2 = i0.l.f5952a
            if (r10 == 0) goto L14c
            r9 = 1045863445(0x3e569c15, float:0.20957978)
            r4.a0(r9)
            java.lang.Object r9 = r11.getValue()
            java.util.Set r9 = (java.util.Set) r9
            int r9 = r9.size()
            java.lang.Object r10 = r4.P()
            if (r10 != r2) goto L139
            c9.x0 r10 = new c9.x0
            r2 = 29
            r10.<init>(r2, r11, r0)
            r4.k0(r10)
        L139:
            fg.a r10 = (fg.a) r10
            r6 = 24576(0x6000, float:3.4438E-41)
            vb.a r0 = r8.f16113h
            fg.a r3 = r8.f16115j
            r2 = r9
            r5 = r4
            r4 = r10
            wb.ho.k2(r0, r1, r2, r3, r4, r5, r6)
            r4 = r5
            r4.p(r7)
            goto L19d
        L14c:
            boolean r10 = r9 instanceof wb.oo
            if (r10 == 0) goto L192
            r10 = 1045887548(0x3e56fa3c, float:0.20993894)
            r4.a0(r10)
            wb.oo r9 = (wb.oo) r9
            wb.v0 r9 = r9.f18148a
            java.lang.Object r10 = r4.P()
            if (r10 != r2) goto L16a
            wb.fk r10 = new wb.fk
            r3 = 16
            r10.<init>(r0, r3)
            r4.k0(r10)
        L16a:
            fg.a r10 = (fg.a) r10
            boolean r3 = r4.h(r1)
            java.lang.Object r5 = r4.P()
            if (r3 != 0) goto L178
            if (r5 != r2) goto L182
        L178:
            wb.bc r5 = new wb.bc
            r2 = 9
            r5.<init>(r1, r11, r0, r2)
            r4.k0(r5)
        L182:
            r3 = r5
            fg.l r3 = (fg.l) r3
            r5 = 384(0x180, float:5.38E-43)
            android.content.Context r0 = r8.f16116k
            r1 = r9
            r2 = r10
            wb.ho.b0(r0, r1, r2, r3, r4, r5)
            r4.p(r7)
            goto L19d
        L192:
            r9 = 1045862107(0x3e5696db, float:0.20955984)
            af.d r9 = bc.e.d(r4, r9, r7)
            throw r9
        L19a:
            r4.V()
        L19d:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
