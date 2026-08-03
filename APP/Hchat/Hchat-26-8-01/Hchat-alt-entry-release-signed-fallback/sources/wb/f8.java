package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16082k;

    public /* synthetic */ f8(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f16078g = r5
            r0.f16079h = r1
            r0.f16080i = r2
            r0.f16081j = r3
            r0.f16082k = r4
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.f16078g
            r.d r9 = (r.d) r9
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r9.getClass()
            r9 = r11 & 17
            switch(r0) {
                case 0: goto L109;
                case 1: goto Ld8;
                case 2: goto La7;
                case 3: goto L76;
                case 4: goto L45;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto L1b
            r9 = r1
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L3f
            wb.y9 r2 = new wb.y9
            r7 = 2
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = -1832863156(0xffffffff92c0ba4c, float:-1.2162829E-27)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto L42
        L3f:
            r10.V()
        L42:
            sf.n r9 = sf.n.f12433a
            return r9
        L45:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto L4c
            r9 = r1
            goto L4d
        L4c:
            r9 = 0
        L4d:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L70
            wb.y9 r2 = new wb.y9
            r7 = 1
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 1404761264(0x53baf4b0, float:1.6059382E12)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto L73
        L70:
            r10.V()
        L73:
            sf.n r9 = sf.n.f12433a
            return r9
        L76:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto L7d
            r9 = r1
            goto L7e
        L7d:
            r9 = 0
        L7e:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto La1
            wb.y9 r2 = new wb.y9
            r7 = 5
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = -377816185(0xffffffffe97afb87, float:-1.8963704E25)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto La4
        La1:
            r10.V()
        La4:
            sf.n r9 = sf.n.f12433a
            return r9
        La7:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto Lae
            r9 = r1
            goto Laf
        Lae:
            r9 = 0
        Laf:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto Ld2
            wb.y9 r2 = new wb.y9
            r7 = 4
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = -1098188801(0xffffffffbe8af7ff, float:-0.2714233)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto Ld5
        Ld2:
            r10.V()
        Ld5:
            sf.n r9 = sf.n.f12433a
            return r9
        Ld8:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto Ldf
            r9 = r1
            goto Le0
        Ldf:
            r9 = 0
        Le0:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L103
            wb.y9 r2 = new wb.y9
            r7 = 3
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = -671611441(0xffffffffd7f805cf, float:-5.4540766E14)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto L106
        L103:
            r10.V()
        L106:
            sf.n r9 = sf.n.f12433a
            return r9
        L109:
            r0 = 16
            r1 = 1
            if (r9 == r0) goto L110
            r9 = r1
            goto L111
        L110:
            r9 = 0
        L111:
            r11 = r11 & r1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L134
            wb.y9 r2 = new wb.y9
            r7 = 0
            i0.a1 r3 = r8.f16079h
            i0.a1 r4 = r8.f16080i
            i0.a1 r5 = r8.f16081j
            i0.a1 r6 = r8.f16082k
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 1386269371(0x52a0cabb, float:3.45298E11)
            s0.d r9 = s0.i.e(r9, r2, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r1)
            goto L137
        L134:
            r10.V()
        L137:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
