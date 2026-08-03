package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17668m;

    public /* synthetic */ mc(android.content.SharedPreferences r2, int r3, fg.a r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 0
            r1.f17662g = r0
            r1.<init>()
            r1.f17667l = r2
            r1.f17664i = r3
            r1.f17668m = r4
            r1.f17663h = r5
            r1.f17665j = r6
            r1.f17666k = r7
            return
    }

    public /* synthetic */ mc(x8.s r2, i0.a1 r3, int r4, android.content.Context r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f17662g = r0
            r1.<init>()
            r1.f17667l = r2
            r1.f17663h = r3
            r1.f17664i = r4
            r1.f17668m = r5
            r1.f17665j = r6
            r1.f17666k = r7
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f17662g
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f17667l
            r2 = r0
            x8.s r2 = (x8.s) r2
            java.lang.Object r0 = r9.f17668m
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            r0 = 16
            r8 = 1
            if (r10 == r0) goto L25
            r10 = r8
            goto L26
        L25:
            r10 = 0
        L26:
            r12 = r12 & r8
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L48
            c9.c0 r1 = new c9.c0
            i0.a1 r3 = r9.f17663h
            int r4 = r9.f17664i
            i0.a1 r6 = r9.f17665j
            i0.a1 r7 = r9.f17666k
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10 = 705857798(0x2a128906, float:1.3014944E-13)
            s0.d r10 = s0.i.e(r10, r1, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r8)
            goto L4b
        L48:
            r11.V()
        L4b:
            sf.n r10 = sf.n.f12433a
            return r10
        L4e:
            java.lang.Object r0 = r9.f17667l
            r2 = r0
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r0 = r9.f17668m
            r4 = r0
            fg.a r4 = (fg.a) r4
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            r0 = 16
            r8 = 1
            if (r10 == r0) goto L6e
            r10 = r8
            goto L6f
        L6e:
            r10 = 0
        L6f:
            r12 = r12 & r8
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L91
            c9.c0 r1 = new c9.c0
            int r3 = r9.f17664i
            i0.a1 r5 = r9.f17663h
            i0.a1 r6 = r9.f17665j
            i0.a1 r7 = r9.f17666k
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10 = -965891442(0xffffffffc66daa8e, float:-15210.639)
            s0.d r10 = s0.i.e(r10, r1, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r8)
            goto L94
        L91:
            r11.V()
        L94:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
