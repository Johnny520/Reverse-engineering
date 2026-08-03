package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18031i;

    public /* synthetic */ oa(android.content.Context r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18029g = r3
            r0.f18030h = r1
            r0.f18031i = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
            r27 = this;
            r0 = r27
            int r1 = r0.f18029g
            switch(r1) {
                case 0: goto L2f6;
                case 1: goto L2b4;
                case 2: goto L10f;
                case 3: goto Lcd;
                case 4: goto L8b;
                case 5: goto L49;
                default: goto L7;
            }
        L7:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L23
            r1 = r5
            goto L24
        L23:
            r1 = 0
        L24:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L43
            wb.c9 r1 = new wb.c9
            r3 = 1
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = 1859100721(0x6ecfa031, float:3.2128528E28)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L46
        L43:
            r2.V()
        L46:
            sf.n r1 = sf.n.f12433a
            return r1
        L49:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L65
            r1 = r5
            goto L66
        L65:
            r1 = 0
        L66:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L85
            wb.c9 r1 = new wb.c9
            r3 = 2
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = -702309137(0xffffffffd6239cef, float:-4.4973605E13)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L88
        L85:
            r2.V()
        L88:
            sf.n r1 = sf.n.f12433a
            return r1
        L8b:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto La7
            r1 = r5
            goto La8
        La7:
            r1 = 0
        La8:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto Lc7
            wb.c9 r1 = new wb.c9
            r3 = 0
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = -1546532204(0xffffffffa3d1ca94, float:-2.274562E-17)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto Lca
        Lc7:
            r2.V()
        Lca:
            sf.n r1 = sf.n.f12433a
            return r1
        Lcd:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto Le9
            r1 = r5
            goto Lea
        Le9:
            r1 = 0
        Lea:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L109
            wb.c9 r1 = new wb.c9
            r3 = 3
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = -333238420(0xffffffffec232f6c, float:-7.891154E26)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L10c
        L109:
            r2.V()
        L10c:
            sf.n r1 = sf.n.f12433a
            return r1
        L10f:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L12b
            r1 = r5
            goto L12c
        L12b:
            r1 = 0
        L12c:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L2ac
            i0.a1 r1 = r0.f18031i
            java.lang.Object r3 = r1.getValue()
            ua.i r3 = (ua.i) r3
            boolean r3 = r3.f13646x
            boolean r4 = r2.f(r1)
            java.lang.Object r5 = r2.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto L14b
            if (r5 != r6) goto L154
        L14b:
            wb.fg r5 = new wb.fg
            r4 = 6
            r5.<init>(r1, r4)
            r2.k0(r5)
        L154:
            r4 = r5
            fg.l r4 = (fg.l) r4
            java.lang.Object r5 = r1.getValue()
            ua.i r5 = (ua.i) r5
            boolean r5 = r5.f13647y
            boolean r7 = r2.f(r1)
            java.lang.Object r8 = r2.P()
            if (r7 != 0) goto L16b
            if (r8 != r6) goto L174
        L16b:
            wb.fg r8 = new wb.fg
            r7 = 7
            r8.<init>(r1, r7)
            r2.k0(r8)
        L174:
            fg.l r8 = (fg.l) r8
            java.lang.Object r7 = r1.getValue()
            ua.i r7 = (ua.i) r7
            boolean r7 = r7.f13648z
            boolean r9 = r2.f(r1)
            java.lang.Object r10 = r2.P()
            if (r9 != 0) goto L18a
            if (r10 != r6) goto L194
        L18a:
            wb.fg r10 = new wb.fg
            r9 = 8
            r10.<init>(r1, r9)
            r2.k0(r10)
        L194:
            fg.l r10 = (fg.l) r10
            java.lang.Object r9 = r1.getValue()
            ua.i r9 = (ua.i) r9
            int r9 = r9.A
            boolean r11 = r2.f(r1)
            java.lang.Object r12 = r2.P()
            if (r11 != 0) goto L1aa
            if (r12 != r6) goto L1b4
        L1aa:
            wb.fg r12 = new wb.fg
            r11 = 9
            r12.<init>(r1, r11)
            r2.k0(r12)
        L1b4:
            fg.l r12 = (fg.l) r12
            java.lang.Object r11 = r1.getValue()
            ua.i r11 = (ua.i) r11
            boolean r11 = r11.B
            boolean r13 = r2.f(r1)
            java.lang.Object r14 = r2.P()
            if (r13 != 0) goto L1ca
            if (r14 != r6) goto L1d4
        L1ca:
            wb.fg r14 = new wb.fg
            r13 = 10
            r14.<init>(r1, r13)
            r2.k0(r14)
        L1d4:
            fg.l r14 = (fg.l) r14
            java.lang.Object r13 = r1.getValue()
            ua.i r13 = (ua.i) r13
            java.lang.String r13 = r13.C
            boolean r15 = r2.f(r1)
            r16 = r3
            java.lang.Object r3 = r2.P()
            if (r15 != 0) goto L1ec
            if (r3 != r6) goto L1f6
        L1ec:
            wb.fg r3 = new wb.fg
            r15 = 11
            r3.<init>(r1, r15)
            r2.k0(r3)
        L1f6:
            fg.l r3 = (fg.l) r3
            java.lang.Object r15 = r1.getValue()
            ua.i r15 = (ua.i) r15
            java.lang.String r15 = r15.D
            boolean r17 = r2.f(r1)
            r28 = r3
            java.lang.Object r3 = r2.P()
            if (r17 != 0) goto L212
            if (r3 != r6) goto L20f
            goto L212
        L20f:
            r29 = r4
            goto L21e
        L212:
            wb.fg r3 = new wb.fg
            r29 = r4
            r4 = 12
            r3.<init>(r1, r4)
            r2.k0(r3)
        L21e:
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r1.getValue()
            ua.i r4 = (ua.i) r4
            java.lang.String r4 = r4.E
            boolean r17 = r2.f(r1)
            r30 = r3
            java.lang.Object r3 = r2.P()
            if (r17 != 0) goto L23a
            if (r3 != r6) goto L237
            goto L23a
        L237:
            r17 = r4
            goto L246
        L23a:
            wb.fg r3 = new wb.fg
            r17 = r4
            r4 = 13
            r3.<init>(r1, r4)
            r2.k0(r3)
        L246:
            r18 = r3
            fg.l r18 = (fg.l) r18
            java.lang.Object r3 = r1.getValue()
            ua.i r3 = (ua.i) r3
            boolean r3 = r3.F
            boolean r4 = r2.f(r1)
            r19 = r3
            java.lang.Object r3 = r2.P()
            if (r4 != 0) goto L260
            if (r3 != r6) goto L26a
        L260:
            wb.fg r3 = new wb.fg
            r4 = 14
            r3.<init>(r1, r4)
            r2.k0(r3)
        L26a:
            r20 = r3
            fg.l r20 = (fg.l) r20
            java.lang.Object r3 = r1.getValue()
            ua.i r3 = (ua.i) r3
            java.lang.String r3 = r3.G
            boolean r4 = r2.f(r1)
            r21 = r3
            java.lang.Object r3 = r2.P()
            if (r4 != 0) goto L284
            if (r3 != r6) goto L28e
        L284:
            wb.fg r3 = new wb.fg
            r4 = 15
            r3.<init>(r1, r4)
            r2.k0(r3)
        L28e:
            r22 = r3
            fg.l r22 = (fg.l) r22
            r25 = 0
            r26 = 0
            r23 = r2
            android.content.Context r2 = r0.f18030h
            r24 = 0
            r4 = r29
            r6 = r8
            r8 = r10
            r10 = r12
            r12 = r14
            r3 = r16
            r14 = r28
            r16 = r30
            wb.ho.b4(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L2b1
        L2ac:
            r23 = r2
            r23.V()
        L2b1:
            sf.n r1 = sf.n.f12433a
            return r1
        L2b4:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L2d0
            r1 = r5
            goto L2d1
        L2d0:
            r1 = 0
        L2d1:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L2f0
            wb.c9 r1 = new wb.c9
            r3 = 5
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = 86400215(0x5265cd7, float:7.8223345E-36)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L2f3
        L2f0:
            r2.V()
        L2f3:
            sf.n r1 = sf.n.f12433a
            return r1
        L2f6:
            r1 = r28
            r.d r1 = (r.d) r1
            r2 = r29
            i0.h0 r2 = (i0.h0) r2
            r3 = r30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L312
            r1 = r5
            goto L313
        L312:
            r1 = 0
        L313:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L332
            wb.c9 r1 = new wb.c9
            r3 = 4
            android.content.Context r4 = r0.f18030h
            i0.a1 r6 = r0.f18031i
            r1.<init>(r4, r6, r3)
            r3 = -1056786198(0xffffffffc102b8ea, float:-8.170145)
            s0.d r1 = s0.i.e(r3, r1, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L335
        L332:
            r2.V()
        L335:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
