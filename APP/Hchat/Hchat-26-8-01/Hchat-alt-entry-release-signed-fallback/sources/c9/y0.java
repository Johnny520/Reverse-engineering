package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f1441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1442j;

    public /* synthetic */ y0(java.util.List r2, fg.l r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f1439g = r0
            r1.<init>()
            r1.f1440h = r2
            r1.f1441i = r3
            r1.f1442j = r4
            return
    }

    public /* synthetic */ y0(java.util.List r1, java.lang.String r2, fg.l r3, int r4) {
            r0 = this;
            r0.f1439g = r4
            r0.f1440h = r1
            r0.f1442j = r2
            r0.f1441i = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f1439g
            r.h r10 = (r.h) r10
            switch(r0) {
                case 0: goto L73;
                case 1: goto L40;
                default: goto L7;
            }
        L7:
            r10.getClass()
            wb.sr r0 = new wb.sr
            r1 = 13
            r0.<init>(r1)
            java.util.List r1 = r9.f1440h
            int r2 = r1.size()
            wb.nv r3 = new wb.nv
            r3.<init>(r0, r1)
            wb.nv r0 = new wb.nv
            r0.<init>(r1)
            wb.ov r4 = new wb.ov
            java.lang.String r5 = r9.f1442j
            fg.l r6 = r9.f1441i
            r4.<init>(r1, r5, r6)
            s0.d r1 = new s0.d
            r5 = 802480018(0x2fd4df92, float:3.8721432E-10)
            r6 = 1
            r1.<init>(r5, r4, r6)
            ac.k r10 = r10.f11166a
            b5.c r4 = new b5.c
            r4.<init>(r3, r0, r1)
            r10.b(r2, r4)
            sf.n r10 = sf.n.f12433a
            return r10
        L40:
            r10.getClass()
            java.util.List r0 = r9.f1440h
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            fb.t0 r1 = (fb.t0) r1
            java.lang.String r2 = r1.f3783a
            c9.h0 r3 = new c9.h0
            r4 = 27
            fg.l r5 = r9.f1441i
            java.lang.String r6 = r9.f1442j
            r3.<init>(r5, r1, r6, r4)
            s0.d r1 = new s0.d
            r4 = 629202757(0x2580df45, float:2.2355754E-16)
            r5 = 1
            r1.<init>(r4, r3, r5)
            r3 = 2
            r.h.a(r10, r2, r1, r3)
            goto L49
        L70:
            sf.n r10 = sf.n.f12433a
            return r10
        L73:
            r10.getClass()
            c9.g0 r0 = new c9.g0
            r1 = 0
            fg.l r2 = r9.f1441i
            java.lang.String r3 = r9.f1442j
            r0.<init>(r1, r2, r3)
            s0.d r1 = new s0.d
            r4 = 1238036053(0x49caee55, float:1662410.6)
            r5 = 1
            r1.<init>(r4, r0, r5)
            java.lang.String r0 = "root"
            r4 = 2
            r.h.a(r10, r0, r1, r4)
            java.util.List r0 = r9.f1440h
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r0.next()
            c9.c1 r1 = (c9.c1) r1
            java.lang.String r6 = r1.f1118a
            if (r6 == 0) goto La6
            goto La8
        La6:
            java.lang.String r6 = "__wechat_home__"
        La8:
            c9.h0 r7 = new c9.h0
            r8 = 0
            r7.<init>(r1, r3, r2, r8)
            s0.d r1 = new s0.d
            r8 = -1156669043(0xffffffffbb0ea18d, float:-0.0021763772)
            r1.<init>(r8, r7, r5)
            r.h.a(r10, r6, r1, r4)
            goto L95
        Lba:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
