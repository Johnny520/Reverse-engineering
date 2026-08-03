package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19047n;

    public /* synthetic */ sa(android.content.SharedPreferences r2, java.util.List r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 1
            r1.f19040g = r0
            r1.<init>()
            r1.f19041h = r2
            r1.f19042i = r3
            r1.f19043j = r4
            r1.f19044k = r5
            r1.f19045l = r6
            r1.f19046m = r7
            r1.f19047n = r8
            return
    }

    public /* synthetic */ sa(java.util.List r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 0
            r1.f19040g = r0
            r1.<init>()
            r1.f19042i = r2
            r1.f19041h = r3
            r1.f19043j = r4
            r1.f19044k = r5
            r1.f19045l = r6
            r1.f19046m = r7
            r1.f19047n = r8
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f19040g
            r.d r11 = (r.d) r11
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            switch(r0) {
                case 0: goto L4a;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L1b
            r11 = r1
            goto L1c
        L1b:
            r11 = 0
        L1c:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L44
            wb.rc r2 = new wb.rc
            android.content.SharedPreferences r3 = r10.f19041h
            java.util.List r4 = r10.f19042i
            i0.a1 r5 = r10.f19043j
            i0.a1 r6 = r10.f19044k
            i0.a1 r7 = r10.f19045l
            i0.a1 r8 = r10.f19046m
            i0.a1 r9 = r10.f19047n
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 486176724(0x1cfa77d4, float:1.6574587E-21)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L47
        L44:
            r12.V()
        L47:
            sf.n r11 = sf.n.f12433a
            return r11
        L4a:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L51
            r11 = r1
            goto L52
        L51:
            r11 = 0
        L52:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L7a
            wb.rc r2 = new wb.rc
            java.util.List r3 = r10.f19042i
            android.content.SharedPreferences r4 = r10.f19041h
            i0.a1 r5 = r10.f19043j
            i0.a1 r6 = r10.f19044k
            i0.a1 r7 = r10.f19045l
            i0.a1 r8 = r10.f19046m
            i0.a1 r9 = r10.f19047n
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1083815983(0x4099b82f, float:4.8037333)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L7d
        L7a:
            r12.V()
        L7d:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
