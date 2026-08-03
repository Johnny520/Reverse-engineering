package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f18436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18438l;

    public /* synthetic */ pd(android.content.SharedPreferences r1, java.lang.String r2, fg.l r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f18433g = r6
            r0.f18434h = r1
            r0.f18435i = r2
            r0.f18436j = r3
            r0.f18437k = r4
            r0.f18438l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f18433g
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            switch(r0) {
                case 0: goto L47;
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
            wb.jg r2 = new wb.jg
            r8 = 1
            android.content.SharedPreferences r3 = r9.f18434h
            java.lang.String r4 = r9.f18435i
            fg.l r5 = r9.f18436j
            i0.a1 r6 = r9.f18437k
            i0.a1 r7 = r9.f18438l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -37189219(0xfffffffffdc8899d, float:-3.3320016E37)
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
            wb.jg r2 = new wb.jg
            r8 = 0
            android.content.SharedPreferences r3 = r9.f18434h
            java.lang.String r4 = r9.f18435i
            fg.l r5 = r9.f18436j
            i0.a1 r6 = r9.f18437k
            i0.a1 r7 = r9.f18438l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 1323288536(0x4edfc7d8, float:1.877208E9)
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
    }
}
