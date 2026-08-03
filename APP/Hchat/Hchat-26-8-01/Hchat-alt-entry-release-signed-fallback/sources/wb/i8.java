package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i8 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f16737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16743p;

    public /* synthetic */ i8(android.content.SharedPreferences r1, android.content.Context r2, fg.a r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, int r10) {
            r0 = this;
            r0.f16734g = r10
            r0.f16735h = r1
            r0.f16736i = r2
            r0.f16737j = r3
            r0.f16738k = r4
            r0.f16739l = r5
            r0.f16740m = r6
            r0.f16741n = r7
            r0.f16742o = r8
            r0.f16743p = r9
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r19 = this;
            r0 = r19
            int r1 = r0.f16734g
            switch(r1) {
                case 0: goto L76;
                default: goto L7;
            }
        L7:
            r1 = r20
            th.a r1 = (th.a) r1
            r8 = r21
            i0.h0 r8 = (i0.h0) r8
            r2 = r22
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
            if (r1 == 0) goto L70
            android.content.SharedPreferences r10 = r0.f16735h
            boolean r1 = r8.h(r10)
            android.content.Context r11 = r0.f16736i
            boolean r2 = r8.h(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r8.P()
            if (r1 != 0) goto L42
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L5d
        L42:
            wb.wk r9 = new wb.wk
            r18 = 1
            i0.a1 r12 = r0.f16738k
            i0.a1 r13 = r0.f16739l
            i0.a1 r14 = r0.f16740m
            i0.a1 r15 = r0.f16741n
            i0.a1 r1 = r0.f16742o
            i0.a1 r2 = r0.f16743p
            r16 = r1
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.k0(r9)
            r2 = r9
        L5d:
            r3 = r2
            fg.a r3 = (fg.a) r3
            r9 = 390(0x186, float:5.47E-43)
            r10 = 48
            java.lang.String r2 = "保存设置"
            java.lang.String r4 = "返回"
            fg.a r5 = r0.f16737j
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L73
        L70:
            r8.V()
        L73:
            sf.n r1 = sf.n.f12433a
            return r1
        L76:
            r1 = r20
            th.a r1 = (th.a) r1
            r8 = r21
            i0.h0 r8 = (i0.h0) r8
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r4 = 1
            if (r1 == r3) goto L92
            r1 = r4
            goto L93
        L92:
            r1 = 0
        L93:
            r2 = r2 & r4
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto Ldf
            android.content.SharedPreferences r10 = r0.f16735h
            boolean r1 = r8.h(r10)
            android.content.Context r11 = r0.f16736i
            boolean r2 = r8.h(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r8.P()
            if (r1 != 0) goto Lb1
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto Lcc
        Lb1:
            wb.wk r9 = new wb.wk
            r18 = 0
            i0.a1 r12 = r0.f16738k
            i0.a1 r13 = r0.f16739l
            i0.a1 r14 = r0.f16740m
            i0.a1 r15 = r0.f16741n
            i0.a1 r1 = r0.f16742o
            i0.a1 r2 = r0.f16743p
            r16 = r1
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.k0(r9)
            r2 = r9
        Lcc:
            r3 = r2
            fg.a r3 = (fg.a) r3
            r9 = 390(0x186, float:5.47E-43)
            r10 = 48
            java.lang.String r2 = "保存设置"
            java.lang.String r4 = "返回"
            fg.a r5 = r0.f16737j
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Le2
        Ldf:
            r8.V()
        Le2:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
