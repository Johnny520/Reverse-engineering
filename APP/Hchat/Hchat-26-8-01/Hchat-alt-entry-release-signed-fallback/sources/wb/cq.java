package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gb.o f15533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15540r;

    public cq(boolean r1, android.content.Context r2, gb.o r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, wf.c r11) {
            r0 = this;
            r0.f15531i = r1
            r0.f15532j = r2
            r0.f15533k = r3
            r0.f15534l = r4
            r0.f15535m = r5
            r0.f15536n = r6
            r0.f15537o = r7
            r0.f15538p = r8
            r0.f15539q = r9
            r0.f15540r = r10
            r1 = 2
            r0.<init>(r1, r11)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r13, wf.c r14) {
            r12 = this;
            wb.cq r0 = new wb.cq
            i0.a1 r9 = r12.f15539q
            i0.a1 r10 = r12.f15540r
            boolean r1 = r12.f15531i
            android.content.Context r2 = r12.f15532j
            gb.o r3 = r12.f15533k
            i0.a1 r4 = r12.f15534l
            i0.a1 r5 = r12.f15535m
            i0.a1 r6 = r12.f15536n
            i0.a1 r7 = r12.f15537o
            i0.a1 r8 = r12.f15538p
            r11 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.cq r1 = (wb.cq) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f15530h
            r5 = 0
            gb.o r4 = r12.f15533k
            android.content.Context r3 = r12.f15532j
            r7 = 1
            if (r0 == 0) goto L17
            if (r0 != r7) goto L10
            f8.i.I0(r13)
            goto L31
        L10:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r13)
            r13 = 0
            return r13
        L17:
            f8.i.I0(r13)
            xg.e r13 = qg.c0.f11038a
            xg.d r13 = xg.d.f21615i
            wb.yp r1 = new wb.yp
            boolean r2 = r12.f15531i
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            r12.f15530h = r7
            java.lang.Object r13 = qg.v.x(r13, r1, r12)
            xf.a r0 = xf.a.f21579g
            if (r13 != r0) goto L31
            return r0
        L31:
            sf.g r13 = (sf.g) r13
            java.lang.Object r13 = r13.f12421g
            java.lang.Throwable r0 = sf.g.b(r13)
            if (r0 != 0) goto L65
            gb.l r13 = (gb.l) r13
            boolean r0 = r13.f4441a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.a1 r1 = r12.f15534l
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r12.f15535m
            r1.setValue(r0)
            java.lang.String r8 = r4.f4449a
            long r0 = r13.f4442b
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            r10 = 0
            r11 = 32
            i0.a1 r5 = r12.f15536n
            i0.a1 r6 = r12.f15537o
            i0.a1 r7 = r12.f15538p
            wb.y2.A1(r5, r6, r7, r8, r9, r10, r11)
            goto Lbf
        L65:
            boolean r13 = r0 instanceof gb.f
            if (r13 == 0) goto L79
            r13 = r0
            gb.f r13 = (gb.f) r13
            java.lang.String r13 = r13.f4421g
            java.lang.String r1 = "UPLOADER_BLACKLISTED"
            boolean r13 = gg.l.a(r13, r1)
            if (r13 == 0) goto L79
            java.lang.String r13 = "当前微信账号已被禁止上传在线插件"
            goto L9f
        L79:
            java.lang.String r13 = r0.getMessage()
            if (r13 == 0) goto L88
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r13 = r13.toString()
            goto L89
        L88:
            r13 = r5
        L89:
            if (r13 == 0) goto L93
            boolean r1 = og.m.t0(r13)
            if (r1 == 0) goto L92
            goto L93
        L92:
            r5 = r13
        L93:
            if (r5 == 0) goto L97
            r13 = r5
            goto L9f
        L97:
            java.lang.Class r13 = r0.getClass()
            java.lang.String r13 = r13.getSimpleName()
        L9f:
            i0.a1 r0 = r12.f15539q
            r0.setValue(r13)
            java.lang.Object r13 = r0.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "操作失败: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.widget.Toast r13 = android.widget.Toast.makeText(r3, r13, r7)
            r13.show()
        Lbf:
            i0.a1 r13 = r12.f15540r
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.setValue(r0)
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
