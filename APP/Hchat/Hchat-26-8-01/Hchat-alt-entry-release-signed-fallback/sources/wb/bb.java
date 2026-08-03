package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15192l;

    public /* synthetic */ bb(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f15187g = r6
            r0.f15188h = r1
            r0.f15189i = r2
            r0.f15190j = r3
            r0.f15191k = r4
            r0.f15192l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f15187g
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            switch(r0) {
                case 0: goto L146;
                case 1: goto L113;
                case 2: goto Le0;
                case 3: goto Lad;
                case 4: goto L7a;
                case 5: goto L47;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L1b
            r10 = r1
            goto L1c
        L1b:
            r10 = 0
        L1c:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L41
            wb.na r2 = new wb.na
            r8 = 6
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 416113816(0x18cd6498, float:5.309283E-24)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L44
        L41:
            r11.V()
        L44:
            sf.n r10 = sf.n.f12433a
            return r10
        L47:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L4e
            r10 = r1
            goto L4f
        L4e:
            r10 = 0
        L4f:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L74
            wb.na r2 = new wb.na
            r8 = 0
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -1316099519(0xffffffffb18dea41, float:-4.1302717E-9)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L77
        L74:
            r11.V()
        L77:
            sf.n r10 = sf.n.f12433a
            return r10
        L7a:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L81
            r10 = r1
            goto L82
        L81:
            r10 = 0
        L82:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto La7
            wb.na r2 = new wb.na
            r8 = 4
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 1028464257(0x3d4d1e81, float:0.05007792)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto Laa
        La7:
            r11.V()
        Laa:
            sf.n r10 = sf.n.f12433a
            return r10
        Lad:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto Lb4
            r10 = r1
            goto Lb5
        Lb4:
            r10 = 0
        Lb5:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto Lda
            wb.na r2 = new wb.na
            r8 = 5
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 1868505552(0x6f5f21d0, float:6.9056034E28)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto Ldd
        Lda:
            r11.V()
        Ldd:
            sf.n r10 = sf.n.f12433a
            return r10
        Le0:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto Le7
            r10 = r1
            goto Le8
        Le7:
            r10 = 0
        Le8:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L10d
            wb.na r2 = new wb.na
            r8 = 3
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 1081442029(0x40757eed, float:3.835872)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L110
        L10d:
            r11.V()
        L110:
            sf.n r10 = sf.n.f12433a
            return r10
        L113:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L11a
            r10 = r1
            goto L11b
        L11a:
            r10 = 0
        L11b:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L140
            wb.na r2 = new wb.na
            r8 = 1
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 1785254830(0x6a68d3ae, float:7.0367605E25)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L143
        L140:
            r11.V()
        L143:
            sf.n r10 = sf.n.f12433a
            return r10
        L146:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L14d
            r10 = r1
            goto L14e
        L14d:
            r10 = 0
        L14e:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L173
            wb.na r2 = new wb.na
            r8 = 2
            android.content.SharedPreferences r3 = r9.f15188h
            i0.a1 r4 = r9.f15189i
            i0.a1 r5 = r9.f15190j
            i0.a1 r6 = r9.f15191k
            i0.a1 r7 = r9.f15192l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -1600225062(0xffffffffa09e80da, float:-2.6851508E-19)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L176
        L173:
            r11.V()
        L176:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
