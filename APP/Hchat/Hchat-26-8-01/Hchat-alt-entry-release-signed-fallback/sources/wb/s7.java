package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19018m;

    public /* synthetic */ s7(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f19012g = r7
            r0.f19013h = r1
            r0.f19014i = r2
            r0.f19015j = r3
            r0.f19016k = r4
            r0.f19017l = r5
            r0.f19018m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f19012g
            r.d r11 = (r.d) r11
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L49;
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
            if (r11 == 0) goto L43
            wb.v8 r2 = new wb.v8
            r9 = 1
            android.content.SharedPreferences r3 = r10.f19013h
            i0.a1 r4 = r10.f19014i
            i0.a1 r5 = r10.f19015j
            i0.a1 r6 = r10.f19016k
            i0.a1 r7 = r10.f19017l
            i0.a1 r8 = r10.f19018m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -970142510(0xffffffffc62cccd2, float:-11059.205)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L46
        L43:
            r12.V()
        L46:
            sf.n r11 = sf.n.f12433a
            return r11
        L49:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L50
            r11 = r1
            goto L51
        L50:
            r11 = 0
        L51:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L78
            wb.v8 r2 = new wb.v8
            r9 = 2
            android.content.SharedPreferences r3 = r10.f19013h
            i0.a1 r4 = r10.f19014i
            i0.a1 r5 = r10.f19015j
            i0.a1 r6 = r10.f19016k
            i0.a1 r7 = r10.f19017l
            i0.a1 r8 = r10.f19018m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1690132947(0x64bd61d3, float:2.7947869E22)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L7b
        L78:
            r12.V()
        L7b:
            sf.n r11 = sf.n.f12433a
            return r11
        L7e:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L85
            r11 = r1
            goto L86
        L85:
            r11 = 0
        L86:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto Lad
            wb.v8 r2 = new wb.v8
            r9 = 0
            android.content.SharedPreferences r3 = r10.f19013h
            i0.a1 r4 = r10.f19014i
            i0.a1 r5 = r10.f19015j
            i0.a1 r6 = r10.f19016k
            i0.a1 r7 = r10.f19017l
            i0.a1 r8 = r10.f19018m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 880125811(0x3475a773, float:2.2878321E-7)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto Lb0
        Lad:
            r12.V()
        Lb0:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
