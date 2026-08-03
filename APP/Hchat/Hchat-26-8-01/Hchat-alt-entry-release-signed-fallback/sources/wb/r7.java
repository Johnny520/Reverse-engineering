package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f18774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18778n;

    public /* synthetic */ r7(android.content.Context r2, android.content.SharedPreferences r3, fg.a r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 1
            r1.f18771g = r0
            r1.<init>()
            r1.f18772h = r2
            r1.f18773i = r3
            r1.f18774j = r4
            r1.f18775k = r5
            r1.f18776l = r6
            r1.f18777m = r7
            r1.f18778n = r8
            return
    }

    public /* synthetic */ r7(android.content.SharedPreferences r2, android.content.Context r3, fg.a r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 0
            r1.f18771g = r0
            r1.<init>()
            r1.f18773i = r2
            r1.f18772h = r3
            r1.f18774j = r4
            r1.f18775k = r5
            r1.f18776l = r6
            r1.f18777m = r7
            r1.f18778n = r8
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r16 = this;
            r0 = r16
            int r1 = r0.f18771g
            switch(r1) {
                case 0: goto L6c;
                default: goto L7;
            }
        L7:
            r1 = r17
            th.a r1 = (th.a) r1
            r8 = r18
            i0.h0 r8 = (i0.h0) r8
            r2 = r19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r4 = 1
            if (r1 == r3) goto L23
            r1 = r4
            goto L24
        L23:
            r1 = 0
        L24:
            r2 = r2 & r4
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L66
            android.content.Context r10 = r0.f18772h
            boolean r1 = r8.h(r10)
            android.content.SharedPreferences r11 = r0.f18773i
            boolean r2 = r8.h(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r8.P()
            if (r1 != 0) goto L42
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L53
        L42:
            wb.tk r9 = new wb.tk
            i0.a1 r12 = r0.f18775k
            i0.a1 r13 = r0.f18776l
            i0.a1 r14 = r0.f18777m
            i0.a1 r15 = r0.f18778n
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.k0(r9)
            r2 = r9
        L53:
            r3 = r2
            fg.a r3 = (fg.a) r3
            r9 = 390(0x186, float:5.47E-43)
            r10 = 48
            java.lang.String r2 = "保存设置"
            java.lang.String r4 = "返回"
            fg.a r5 = r0.f18774j
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L69
        L66:
            r8.V()
        L69:
            sf.n r1 = sf.n.f12433a
            return r1
        L6c:
            r1 = r17
            th.a r1 = (th.a) r1
            r8 = r18
            i0.h0 r8 = (i0.h0) r8
            r2 = r19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r4 = 1
            if (r1 == r3) goto L88
            r1 = r4
            goto L89
        L88:
            r1 = 0
        L89:
            r2 = r2 & r4
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto Lcb
            android.content.SharedPreferences r10 = r0.f18773i
            boolean r1 = r8.h(r10)
            android.content.Context r11 = r0.f18772h
            boolean r2 = r8.h(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r8.P()
            if (r1 != 0) goto La7
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto Lb8
        La7:
            wb.tk r9 = new wb.tk
            i0.a1 r12 = r0.f18775k
            i0.a1 r13 = r0.f18776l
            i0.a1 r14 = r0.f18777m
            i0.a1 r15 = r0.f18778n
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.k0(r9)
            r2 = r9
        Lb8:
            r3 = r2
            fg.a r3 = (fg.a) r3
            r9 = 390(0x186, float:5.47E-43)
            r10 = 48
            java.lang.String r2 = "保存设置"
            java.lang.String r4 = "返回"
            fg.a r5 = r0.f18774j
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Lce
        Lcb:
            r8.V()
        Lce:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
