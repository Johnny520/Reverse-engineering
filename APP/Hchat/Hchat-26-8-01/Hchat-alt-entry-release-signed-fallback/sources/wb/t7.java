package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19179j;

    public /* synthetic */ t7(android.content.SharedPreferences r2, i0.a1 r3, i0.a1 r4) {
            r1 = this;
            r0 = 9
            r1.f19176g = r0
            r1.<init>()
            r1.f19178i = r3
            r1.f19177h = r2
            r1.f19179j = r4
            return
    }

    public /* synthetic */ t7(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19176g = r4
            r0.f19177h = r1
            r0.f19178i = r2
            r0.f19179j = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f19176g
            r.d r7 = (r.d) r7
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.getClass()
            r7 = r9 & 17
            switch(r0) {
                case 0: goto L2a4;
                case 1: goto L274;
                case 2: goto L244;
                case 3: goto L214;
                case 4: goto L1e4;
                case 5: goto L1b5;
                case 6: goto L186;
                case 7: goto L157;
                case 8: goto L128;
                case 9: goto Ld1;
                case 10: goto La2;
                case 11: goto L73;
                case 12: goto L44;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1b
            r7 = r1
            goto L1c
        L1b:
            r7 = 0
        L1c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L3e
            wb.n8 r7 = new wb.n8
            r9 = 13
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1435016151(0x55889bd7, float:1.8775364E13)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L41
        L3e:
            r8.V()
        L41:
            sf.n r7 = sf.n.f12433a
            return r7
        L44:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L4b
            r7 = r1
            goto L4c
        L4b:
            r7 = 0
        L4c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L6d
            wb.n8 r7 = new wb.n8
            r9 = 4
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -2000104839(0xffffffff88c8d279, float:-1.2086544E-33)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L70
        L6d:
            r8.V()
        L70:
            sf.n r7 = sf.n.f12433a
            return r7
        L73:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L7a
            r7 = r1
            goto L7b
        L7a:
            r7 = 0
        L7b:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L9c
            wb.n8 r7 = new wb.n8
            r9 = 6
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1892811104(0x70d20160, float:5.199481E29)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L9f
        L9c:
            r8.V()
        L9f:
            sf.n r7 = sf.n.f12433a
            return r7
        La2:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto La9
            r7 = r1
            goto Laa
        La9:
            r7 = 0
        Laa:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lcb
            wb.n8 r7 = new wb.n8
            r9 = 3
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -127709029(0xfffffffff863509b, float:-1.8441973E34)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto Lce
        Lcb:
            r8.V()
        Lce:
            sf.n r7 = sf.n.f12433a
            return r7
        Ld1:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r7 == r0) goto Ld9
            r7 = r2
            goto Lda
        Ld9:
            r7 = r1
        Lda:
            r9 = r9 & r2
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L122
            i0.a1 r7 = r6.f19179j
            java.lang.Object r9 = r7.getValue()
            java.util.List r9 = (java.util.List) r9
            i0.a1 r0 = r6.f19178i
            boolean r2 = r8.f(r0)
            java.lang.Object r3 = r8.P()
            i0.e r4 = i0.l.f5952a
            if (r2 != 0) goto Lf9
            if (r3 != r4) goto L103
        Lf9:
            wb.gj r3 = new wb.gj
            r2 = 18
            r3.<init>(r0, r2)
            r8.k0(r3)
        L103:
            fg.l r3 = (fg.l) r3
            android.content.SharedPreferences r0 = r6.f19177h
            boolean r2 = r8.h(r0)
            java.lang.Object r5 = r8.P()
            if (r2 != 0) goto L113
            if (r5 != r4) goto L11c
        L113:
            wb.od r5 = new wb.od
            r2 = 6
            r5.<init>(r0, r7, r2)
            r8.k0(r5)
        L11c:
            fg.a r5 = (fg.a) r5
            wb.ho.v3(r9, r3, r5, r8, r1)
            goto L125
        L122:
            r8.V()
        L125:
            sf.n r7 = sf.n.f12433a
            return r7
        L128:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L12f
            r7 = r1
            goto L130
        L12f:
            r7 = 0
        L130:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L151
            wb.n8 r7 = new wb.n8
            r9 = 2
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 95887157(0x5b71f35, float:1.7220701E-35)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L154
        L151:
            r8.V()
        L154:
            sf.n r7 = sf.n.f12433a
            return r7
        L157:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L15e
            r7 = r1
            goto L15f
        L15e:
            r7 = 0
        L15f:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L180
            wb.n8 r7 = new wb.n8
            r9 = 0
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -1397564173(0xffffffffacb2dcf3, float:-5.0835946E-12)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L183
        L180:
            r8.V()
        L183:
            sf.n r7 = sf.n.f12433a
            return r7
        L186:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L18d
            r7 = r1
            goto L18e
        L18d:
            r7 = 0
        L18e:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L1af
            wb.n8 r7 = new wb.n8
            r9 = 1
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1783340888(0x6a4b9f58, float:6.1541105E25)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L1b2
        L1af:
            r8.V()
        L1b2:
            sf.n r7 = sf.n.f12433a
            return r7
        L1b5:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1bc
            r7 = r1
            goto L1bd
        L1bc:
            r7 = 0
        L1bd:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L1de
            wb.n8 r7 = new wb.n8
            r9 = 5
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -1516263707(0xffffffffa59fa6e5, float:-2.7695195E-16)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L1e1
        L1de:
            r8.V()
        L1e1:
            sf.n r7 = sf.n.f12433a
            return r7
        L1e4:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1eb
            r7 = r1
            goto L1ec
        L1eb:
            r7 = 0
        L1ec:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L20e
            wb.n8 r7 = new wb.n8
            r9 = 9
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -677976174(0xffffffffd796e792, float:-3.3184266E14)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L211
        L20e:
            r8.V()
        L211:
            sf.n r7 = sf.n.f12433a
            return r7
        L214:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L21b
            r7 = r1
            goto L21c
        L21b:
            r7 = 0
        L21c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L23e
            wb.n8 r7 = new wb.n8
            r9 = 11
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = -730880493(0xffffffffd46fa613, float:-4.1171338E12)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L241
        L23e:
            r8.V()
        L241:
            sf.n r7 = sf.n.f12433a
            return r7
        L244:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L24b
            r7 = r1
            goto L24c
        L24b:
            r7 = 0
        L24c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L26e
            wb.n8 r7 = new wb.n8
            r9 = 10
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1942495958(0x73c822d6, float:3.1712827E31)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L271
        L26e:
            r8.V()
        L271:
            sf.n r7 = sf.n.f12433a
            return r7
        L274:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L27b
            r7 = r1
            goto L27c
        L27b:
            r7 = 0
        L27c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L29e
            wb.n8 r7 = new wb.n8
            r9 = 8
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1470231206(0x57a1f2a6, float:3.5612708E14)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L2a1
        L29e:
            r8.V()
        L2a1:
            sf.n r7 = sf.n.f12433a
            return r7
        L2a4:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L2ab
            r7 = r1
            goto L2ac
        L2ab:
            r7 = 0
        L2ac:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L2cd
            wb.n8 r7 = new wb.n8
            r9 = 7
            android.content.SharedPreferences r0 = r6.f19177h
            i0.a1 r2 = r6.f19178i
            i0.a1 r3 = r6.f19179j
            r7.<init>(r0, r2, r3, r9)
            r9 = 509249592(0x1e5a8838, float:1.1568993E-20)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L2d0
        L2cd:
            r8.V()
        L2d0:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
