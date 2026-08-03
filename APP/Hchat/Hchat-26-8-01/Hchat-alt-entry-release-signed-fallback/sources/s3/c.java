package s3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12348m;

    public /* synthetic */ c(java.lang.String r1, int r2, boolean r3, int r4, sh.t r5, fg.l r6, int r7) {
            r0 = this;
            r7 = 1
            r0.f12342g = r7
            r0.<init>()
            r0.f12346k = r1
            r0.f12343h = r2
            r0.f12344i = r3
            r0.f12345j = r4
            r0.f12347l = r5
            r0.f12348m = r6
            return
    }

    public /* synthetic */ c(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.Object r4, int r5, int r6, int r7) {
            r0 = this;
            r0.f12342g = r7
            r0.f12346k = r1
            r0.f12347l = r2
            r0.f12344i = r3
            r0.f12348m = r4
            r0.f12343h = r5
            r0.f12345j = r6
            r0.<init>()
            return
    }

    public /* synthetic */ c(s3.e r2, boolean r3, fg.a r4, fg.a r5, int r6, int r7) {
            r1 = this;
            r0 = 0
            r1.f12342g = r0
            r1.<init>()
            r1.f12346k = r2
            r1.f12344i = r3
            r1.f12347l = r4
            r1.f12348m = r5
            r1.f12343h = r6
            r1.f12345j = r7
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f12342g
            switch(r0) {
                case 0: goto L7d;
                case 1: goto L55;
                case 2: goto L2e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f12346k
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r9.f12347l
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r9.f12348m
            r3 = r0
            fg.l r3 = (fg.l) r3
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12343h
            r10 = r10 | 1
            int r1 = i0.r.C(r10)
            int r2 = r9.f12345j
            boolean r7 = r9.f12344i
            wb.ho.X3(r1, r2, r3, r4, r5, r6, r7)
        L2b:
            sf.n r10 = sf.n.f12433a
            return r10
        L2e:
            java.lang.Object r0 = r9.f12346k
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r9.f12347l
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r9.f12348m
            r4 = r0
            k9.c r4 = (k9.c) r4
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12343h
            r10 = r10 | 1
            int r6 = i0.r.C(r10)
            boolean r3 = r9.f12344i
            int r7 = r9.f12345j
            wb.ho.R0(r1, r2, r3, r4, r5, r6, r7)
            goto L2b
        L55:
            java.lang.Object r0 = r9.f12346k
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r9.f12347l
            r5 = r0
            sh.t r5 = (sh.t) r5
            java.lang.Object r0 = r9.f12348m
            r6 = r0
            fg.l r6 = (fg.l) r6
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 196609(0x30001, float:2.75508E-40)
            int r8 = i0.r.C(r10)
            int r2 = r9.f12343h
            boolean r3 = r9.f12344i
            int r4 = r9.f12345j
            sh.s.f(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2b
        L7d:
            java.lang.Object r0 = r9.f12346k
            r1 = r0
            s3.e r1 = (s3.e) r1
            java.lang.Object r0 = r9.f12347l
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r9.f12348m
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12343h
            r10 = r10 | 1
            int r6 = i0.r.C(r10)
            boolean r2 = r9.f12344i
            int r7 = r9.f12345j
            x6.d.d(r1, r2, r3, r4, r5, r6, r7)
            goto L2b
    }
}
