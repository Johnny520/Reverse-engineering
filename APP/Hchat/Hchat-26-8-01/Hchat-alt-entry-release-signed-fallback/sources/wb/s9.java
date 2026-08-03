package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s9 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19039q;

    public /* synthetic */ s9(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, int r11) {
            r0 = this;
            r0.f19029g = r11
            r0.f19030h = r1
            r0.f19031i = r2
            r0.f19032j = r3
            r0.f19033k = r4
            r0.f19034l = r5
            r0.f19035m = r6
            r0.f19036n = r7
            r0.f19037o = r8
            r0.f19038p = r9
            r0.f19039q = r10
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            r18 = this;
            r0 = r18
            int r1 = r0.f19029g
            switch(r1) {
                case 0: goto Lb1;
                case 1: goto L5c;
                default: goto L7;
            }
        L7:
            r1 = r19
            r.d r1 = (r.d) r1
            r2 = r20
            i0.h0 r2 = (i0.h0) r2
            r3 = r21
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
            if (r1 == 0) goto L56
            wb.pe r6 = new wb.pe
            r17 = 2
            android.content.SharedPreferences r7 = r0.f19030h
            i0.a1 r8 = r0.f19031i
            i0.a1 r9 = r0.f19032j
            i0.a1 r10 = r0.f19033k
            i0.a1 r11 = r0.f19034l
            i0.a1 r12 = r0.f19035m
            i0.a1 r13 = r0.f19036n
            i0.a1 r14 = r0.f19037o
            i0.a1 r15 = r0.f19038p
            i0.a1 r1 = r0.f19039q
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = -1919030503(0xffffffff8d9deb19, float:-9.73247E-31)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L59
        L56:
            r2.V()
        L59:
            sf.n r1 = sf.n.f12433a
            return r1
        L5c:
            r1 = r19
            r.d r1 = (r.d) r1
            r2 = r20
            i0.h0 r2 = (i0.h0) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto L78
            r1 = r5
            goto L79
        L78:
            r1 = 0
        L79:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto Lab
            wb.pe r6 = new wb.pe
            r17 = 1
            android.content.SharedPreferences r7 = r0.f19030h
            i0.a1 r8 = r0.f19031i
            i0.a1 r9 = r0.f19032j
            i0.a1 r10 = r0.f19033k
            i0.a1 r11 = r0.f19034l
            i0.a1 r12 = r0.f19035m
            i0.a1 r13 = r0.f19036n
            i0.a1 r14 = r0.f19037o
            i0.a1 r15 = r0.f19038p
            i0.a1 r1 = r0.f19039q
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 1420767828(0x54af3254, float:6.019709E12)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto Lae
        Lab:
            r2.V()
        Lae:
            sf.n r1 = sf.n.f12433a
            return r1
        Lb1:
            r1 = r19
            r.d r1 = (r.d) r1
            r2 = r20
            i0.h0 r2 = (i0.h0) r2
            r3 = r21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            r5 = 1
            if (r1 == r4) goto Lcd
            r1 = r5
            goto Lce
        Lcd:
            r1 = 0
        Lce:
            r3 = r3 & r5
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto L100
            wb.pe r6 = new wb.pe
            r17 = 0
            android.content.SharedPreferences r7 = r0.f19030h
            i0.a1 r8 = r0.f19031i
            i0.a1 r9 = r0.f19032j
            i0.a1 r10 = r0.f19033k
            i0.a1 r11 = r0.f19034l
            i0.a1 r12 = r0.f19035m
            i0.a1 r13 = r0.f19036n
            i0.a1 r14 = r0.f19037o
            i0.a1 r15 = r0.f19038p
            i0.a1 r1 = r0.f19039q
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 1162930635(0x4550e9cb, float:3342.612)
            s0.d r1 = s0.i.e(r1, r6, r2)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r1, r2, r3, r5)
            goto L103
        L100:
            r2.V()
        L103:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
