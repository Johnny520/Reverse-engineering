package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f20620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20622j;

    public /* synthetic */ zf(java.lang.Object r1, boolean r2, sf.b r3, int r4, int r5) {
            r0 = this;
            r0.f20619g = r5
            r0.f20622j = r1
            r0.f20620h = r2
            r0.f20621i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ zf(java.lang.String r2, boolean r3, fg.a r4) {
            r1 = this;
            r0 = 0
            r1.f20619g = r0
            r1.<init>()
            r1.f20622j = r2
            r1.f20620h = r3
            r1.f20621i = r4
            return
    }

    public /* synthetic */ zf(boolean r1, fg.a r2, fg.l r3, int r4) {
            r0 = this;
            r4 = 1
            r0.f20619g = r4
            r0.<init>()
            r0.f20620h = r1
            r0.f20621i = r2
            r0.f20622j = r3
            return
    }

    public /* synthetic */ zf(boolean r2, fg.l r3, java.util.List r4) {
            r1 = this;
            r0 = 2
            r1.f20619g = r0
            r1.<init>()
            r1.f20620h = r2
            r1.f20622j = r3
            r1.f20621i = r4
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.f20619g
            switch(r0) {
                case 0: goto Le6;
                case 1: goto Lca;
                case 2: goto L55;
                case 3: goto L3b;
                case 4: goto L21;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f20622j
            wb.k5 r0 = (wb.k5) r0
            java.lang.Object r1 = r12.f20621i
            fg.l r1 = (fg.l) r1
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
            r14 = 1
            int r14 = i0.r.C(r14)
            boolean r2 = r12.f20620h
            wb.ho.T1(r0, r2, r1, r13, r14)
        L1e:
            sf.n r13 = sf.n.f12433a
            return r13
        L21:
            java.lang.Object r0 = r12.f20622j
            wb.m5 r0 = (wb.m5) r0
            java.lang.Object r1 = r12.f20621i
            fg.a r1 = (fg.a) r1
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
            r14 = 1
            int r14 = i0.r.C(r14)
            boolean r2 = r12.f20620h
            wb.ho.U1(r0, r2, r1, r13, r14)
            goto L1e
        L3b:
            java.lang.Object r0 = r12.f20622j
            wb.bp r0 = (wb.bp) r0
            java.lang.Object r1 = r12.f20621i
            fg.a r1 = (fg.a) r1
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
            r14 = 1
            int r14 = i0.r.C(r14)
            boolean r2 = r12.f20620h
            wb.ho.x2(r0, r2, r1, r13, r14)
            goto L1e
        L55:
            java.lang.Object r0 = r12.f20622j
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20621i
            java.util.List r1 = (java.util.List) r1
            r5 = r13
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r2 = 2
            r10 = 0
            r11 = 1
            if (r14 == r2) goto L6f
            r14 = r11
            goto L70
        L6f:
            r14 = r10
        L70:
            r13 = r13 & r11
            boolean r13 = r5.S(r13, r14)
            if (r13 == 0) goto Lc3
            boolean r13 = r5.f(r0)
            java.lang.Object r14 = r5.P()
            if (r13 != 0) goto L85
            i0.e r13 = i0.l.f5952a
            if (r14 != r13) goto L8e
        L85:
            i.x0 r14 = new i.x0
            r13 = 6
            r14.<init>(r0, r13)
            r5.k0(r14)
        L8e:
            r6 = r14
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            boolean r2 = r12.f20620h
            java.lang.String r3 = "启用定时任务"
            java.lang.String r4 = "开启后按计划时间发送聊天消息或发布朋友圈"
            r7 = r5
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r13 = 0
            wb.ho.D1(r13, r7, r10, r11)
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto Lae
            java.lang.String r13 = "暂无任务"
        Lac:
            r3 = r13
            goto Lb9
        Lae:
            int r13 = r1.size()
            java.lang.String r14 = " 个"
            java.lang.String r13 = p.a.i(r13, r14)
            goto Lac
        Lb9:
            r6 = 6
            r5 = r7
            r7 = 4
            java.lang.String r2 = "当前任务"
            r4 = 0
            wb.ho.B1(r2, r3, r4, r5, r6, r7)
            goto Lc7
        Lc3:
            r7 = r5
            r7.V()
        Lc7:
            sf.n r13 = sf.n.f12433a
            return r13
        Lca:
            java.lang.Object r0 = r12.f20621i
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r12.f20622j
            fg.l r1 = (fg.l) r1
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            r14.getClass()
            r14 = 3505(0xdb1, float:4.912E-42)
            int r14 = i0.r.C(r14)
            boolean r2 = r12.f20620h
            wb.ho.D2(r2, r0, r1, r13, r14)
            goto L1e
        Le6:
            java.lang.Object r0 = r12.f20622j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r12.f20621i
            fg.a r1 = (fg.a) r1
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r2 = r14 & 3
            r3 = 2
            r4 = 1
            if (r2 == r3) goto Lfe
            r2 = r4
            goto Lff
        Lfe:
            r2 = 0
        Lff:
            r14 = r14 & r4
            boolean r14 = r13.S(r14, r2)
            if (r14 == 0) goto L131
            java.lang.String r14 = wb.ho.E4(r0)
            boolean r0 = r12.f20620h
            boolean r2 = r13.g(r0)
            boolean r3 = r13.f(r1)
            r2 = r2 | r3
            java.lang.Object r3 = r13.P()
            if (r2 != 0) goto L11f
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L128
        L11f:
            l.g r3 = new l.g
            r2 = 3
            r3.<init>(r0, r1, r2)
            r13.k0(r3)
        L128:
            fg.a r3 = (fg.a) r3
            r0 = 6
            java.lang.String r1 = "选择聊天"
            wb.ho.b(r1, r14, r3, r13, r0)
            goto L134
        L131:
            r13.V()
        L134:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
