package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18808p;

    public /* synthetic */ r9(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, int r10) {
            r0 = this;
            r0.f18799g = r10
            r0.f18800h = r1
            r0.f18801i = r2
            r0.f18802j = r3
            r0.f18803k = r4
            r0.f18804l = r5
            r0.f18805m = r6
            r0.f18806n = r7
            r0.f18807o = r8
            r0.f18808p = r9
            r0.<init>()
            return
    }

    public /* synthetic */ r9(i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, android.content.SharedPreferences r9, i0.a1 r10) {
            r1 = this;
            r0 = 2
            r1.f18799g = r0
            r1.<init>()
            r1.f18801i = r2
            r1.f18802j = r3
            r1.f18803k = r4
            r1.f18804l = r5
            r1.f18805m = r6
            r1.f18806n = r7
            r1.f18807o = r8
            r1.f18800h = r9
            r1.f18808p = r10
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r17 = this;
            r0 = r17
            int r1 = r0.f18799g
            switch(r1) {
                case 0: goto Lf8;
                case 1: goto La7;
                case 2: goto L58;
                default: goto L7;
            }
        L7:
            r1 = r18
            r.d r1 = (r.d) r1
            r2 = r19
            i0.h0 r2 = (i0.h0) r2
            r3 = r20
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
            if (r1 == 0) goto L52
            wb.md r6 = new wb.md
            r16 = 3
            android.content.SharedPreferences r7 = r0.f18800h
            i0.a1 r8 = r0.f18801i
            i0.a1 r9 = r0.f18802j
            i0.a1 r10 = r0.f18803k
            i0.a1 r11 = r0.f18804l
            i0.a1 r12 = r0.f18805m
            i0.a1 r13 = r0.f18806n
            i0.a1 r14 = r0.f18807o
            i0.a1 r15 = r0.f18808p
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = -978109861(0xffffffffc5b33a5b, float:-5735.2944)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L55
        L52:
            r2.V()
        L55:
            sf.n r1 = sf.n.f12433a
            return r1
        L58:
            r1 = r18
            r.d r1 = (r.d) r1
            r2 = r19
            i0.h0 r2 = (i0.h0) r2
            r3 = r20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L74
            r1 = r5
            goto L75
        L74:
            r1 = 0
        L75:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto La1
            wb.md r6 = new wb.md
            i0.a1 r7 = r0.f18801i
            i0.a1 r8 = r0.f18802j
            i0.a1 r9 = r0.f18803k
            i0.a1 r10 = r0.f18804l
            i0.a1 r11 = r0.f18805m
            i0.a1 r12 = r0.f18806n
            i0.a1 r13 = r0.f18807o
            android.content.SharedPreferences r14 = r0.f18800h
            i0.a1 r15 = r0.f18808p
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -208197243(0xfffffffff3972985, float:-2.3952604E31)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto La4
        La1:
            r2.V()
        La4:
            sf.n r1 = sf.n.f12433a
            return r1
        La7:
            r1 = r18
            r.d r1 = (r.d) r1
            r2 = r19
            i0.h0 r2 = (i0.h0) r2
            r3 = r20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto Lc3
            r1 = r5
            goto Lc4
        Lc3:
            r1 = 0
        Lc4:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto Lf2
            wb.md r6 = new wb.md
            r16 = 1
            android.content.SharedPreferences r7 = r0.f18800h
            i0.a1 r8 = r0.f18801i
            i0.a1 r9 = r0.f18802j
            i0.a1 r10 = r0.f18803k
            i0.a1 r11 = r0.f18804l
            i0.a1 r12 = r0.f18805m
            i0.a1 r13 = r0.f18806n
            i0.a1 r14 = r0.f18807o
            i0.a1 r15 = r0.f18808p
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = -775455466(0xffffffffd1c77d16, float:-1.07099636E11)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto Lf5
        Lf2:
            r2.V()
        Lf5:
            sf.n r1 = sf.n.f12433a
            return r1
        Lf8:
            r1 = r18
            r.d r1 = (r.d) r1
            r2 = r19
            i0.h0 r2 = (i0.h0) r2
            r3 = r20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L114
            r1 = r5
            goto L115
        L114:
            r1 = 0
        L115:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L143
            wb.md r6 = new wb.md
            r16 = 0
            android.content.SharedPreferences r7 = r0.f18800h
            i0.a1 r8 = r0.f18801i
            i0.a1 r9 = r0.f18802j
            i0.a1 r10 = r0.f18803k
            i0.a1 r11 = r0.f18804l
            i0.a1 r12 = r0.f18805m
            i0.a1 r13 = r0.f18806n
            i0.a1 r14 = r0.f18807o
            i0.a1 r15 = r0.f18808p
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 2080201673(0x7bfd5bc9, float:2.6310255E36)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L146
        L143:
            r2.V()
        L146:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
