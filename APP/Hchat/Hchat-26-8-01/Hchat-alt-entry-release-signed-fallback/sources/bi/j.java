package bi;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f904l;

    public /* synthetic */ j(int r1, int r2, java.lang.Object r3, java.lang.Object r4, sf.b r5, boolean r6) {
            r0 = this;
            r0.f899g = r2
            r0.f902j = r3
            r0.f903k = r4
            r0.f901i = r6
            r0.f904l = r5
            r0.f900h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ j(int r2, fg.l r3, boolean r4, db.c r5, fg.a r6) {
            r1 = this;
            r0 = 1
            r1.f899g = r0
            r1.<init>()
            r1.f900h = r2
            r1.f902j = r3
            r1.f901i = r4
            r1.f903k = r5
            r1.f904l = r6
            return
    }

    public /* synthetic */ j(wb.y2 r1, java.lang.String r2, int r3, boolean r4, java.lang.String r5, int r6) {
            r0 = this;
            r6 = 3
            r0.f899g = r6
            r0.<init>()
            r0.f902j = r1
            r0.f903k = r2
            r0.f900h = r3
            r0.f901i = r4
            r0.f904l = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.f899g
            switch(r1) {
                case 0: goto Lff;
                case 1: goto L59;
                case 2: goto L31;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f902j
            r2 = r1
            wb.y2 r2 = (wb.y2) r2
            java.lang.Object r1 = r0.f903k
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.f904l
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r7 = r17
            i0.h0 r7 = (i0.h0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 24577(0x6001, float:3.444E-41)
            int r8 = i0.r.C(r1)
            int r4 = r0.f900h
            boolean r5 = r0.f901i
            r2.r(r3, r4, r5, r6, r7, r8)
        L2e:
            sf.n r1 = sf.n.f12433a
            return r1
        L31:
            java.lang.Object r1 = r0.f902j
            r2 = r1
            wb.y2 r2 = (wb.y2) r2
            java.lang.Object r1 = r0.f903k
            r3 = r1
            wb.jv r3 = (wb.jv) r3
            java.lang.Object r1 = r0.f904l
            r5 = r1
            fg.a r5 = (fg.a) r5
            r6 = r17
            i0.h0 r6 = (i0.h0) r6
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = r0.f900h
            r1 = r1 | 1
            int r7 = i0.r.C(r1)
            boolean r4 = r0.f901i
            r2.h(r3, r4, r5, r6, r7)
            goto L2e
        L59:
            java.lang.Object r1 = r0.f902j
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f903k
            db.c r2 = (db.c) r2
            java.lang.Object r3 = r0.f904l
            fg.a r3 = (fg.a) r3
            r10 = r17
            i0.h0 r10 = (i0.h0) r10
            r4 = r18
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r13 = 0
            r14 = 1
            if (r5 == r6) goto L7a
            r5 = r14
            goto L7b
        L7a:
            r5 = r13
        L7b:
            r4 = r4 & r14
            boolean r4 = r10.S(r4, r5)
            if (r4 == 0) goto Lf9
            int r4 = r0.f900h
            java.lang.String r5 = "模块通道"
            java.lang.String r6 = "微信原生群发助手"
            if (r4 != r14) goto L8c
            r7 = r6
            goto L8d
        L8c:
            r7 = r5
        L8d:
            wb.dq r8 = new wb.dq
            java.lang.String r9 = "0"
            r8.<init>(r9, r5)
            wb.dq r5 = new wb.dq
            java.lang.String r9 = "1"
            r5.<init>(r9, r6)
            wb.dq[] r5 = new wb.dq[]{r8, r5}
            java.util.List r6 = a.a.y0(r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r5 = r10.f(r1)
            java.lang.Object r8 = r10.P()
            i0.e r15 = i0.l.f5952a
            if (r5 != 0) goto Lb5
            if (r8 != r15) goto Lbe
        Lb5:
            i.x0 r8 = new i.x0
            r5 = 7
            r8.<init>(r1, r5)
            r10.k0(r8)
        Lbe:
            fg.l r8 = (fg.l) r8
            r11 = 6
            r12 = 32
            r5 = r7
            r7 = r4
            java.lang.String r4 = "发送通道"
            r9 = 0
            wb.ho.I2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 0
            wb.ho.D1(r1, r10, r13, r14)
            boolean r1 = r0.f901i
            if (r1 == 0) goto Ld6
            java.lang.String r1 = "选择好友"
            goto Ld8
        Ld6:
            java.lang.String r1 = "选择聊天"
        Ld8:
            java.util.List r2 = r2.f2173f
            java.lang.String r2 = wb.ho.a7(r2)
            boolean r4 = r10.f(r3)
            java.lang.Object r5 = r10.P()
            if (r4 != 0) goto Lea
            if (r5 != r15) goto Lf3
        Lea:
            wb.kc r5 = new wb.kc
            r4 = 6
            r5.<init>(r3, r4)
            r10.k0(r5)
        Lf3:
            fg.a r5 = (fg.a) r5
            wb.ho.b(r1, r2, r5, r10, r13)
            goto Lfc
        Lf9:
            r10.V()
        Lfc:
            sf.n r1 = sf.n.f12433a
            return r1
        Lff:
            java.lang.Object r1 = r0.f902j
            r2 = r1
            bi.b r2 = (bi.b) r2
            java.lang.Object r1 = r0.f903k
            r3 = r1
            bi.l r3 = (bi.l) r3
            java.lang.Object r1 = r0.f904l
            r5 = r1
            s0.d r5 = (s0.d) r5
            r6 = r17
            i0.h0 r6 = (i0.h0) r6
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = r0.f900h
            r1 = r1 | 1
            int r7 = i0.r.C(r1)
            boolean r4 = r0.f901i
            ig.a.b(r2, r3, r4, r5, r6, r7)
            goto L2e
    }
}
