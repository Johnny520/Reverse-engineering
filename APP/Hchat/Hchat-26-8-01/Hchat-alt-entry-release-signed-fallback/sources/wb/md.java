package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17678p;

    public /* synthetic */ md(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, int r10) {
            r0 = this;
            r0.f17669g = r10
            r0.f17670h = r1
            r0.f17671i = r2
            r0.f17672j = r3
            r0.f17673k = r4
            r0.f17674l = r5
            r0.f17675m = r6
            r0.f17676n = r7
            r0.f17677o = r8
            r0.f17678p = r9
            r0.<init>()
            return
    }

    public /* synthetic */ md(i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, android.content.SharedPreferences r9, i0.a1 r10) {
            r1 = this;
            r0 = 2
            r1.f17669g = r0
            r1.<init>()
            r1.f17671i = r2
            r1.f17672j = r3
            r1.f17673k = r4
            r1.f17674l = r5
            r1.f17675m = r6
            r1.f17676n = r7
            r1.f17677o = r8
            r1.f17670h = r9
            r1.f17678p = r10
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.f17669g
            switch(r1) {
                case 0: goto L5d9;
                case 1: goto L3c6;
                case 2: goto L21a;
                default: goto L7;
            }
        L7:
            r6 = r17
            i0.h0 r6 = (i0.h0) r6
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L1c
            r2 = r10
            goto L1d
        L1c:
            r2 = r11
        L1d:
            r1 = r1 & r10
            boolean r1 = r6.S(r1, r2)
            if (r1 == 0) goto L214
            i0.a1 r1 = r0.f17671i
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r10) goto L36
            java.lang.String r2 = "在范围内随机等待"
        L34:
            r3 = r2
            goto L39
        L36:
            java.lang.String r2 = "每条等待固定时间"
            goto L34
        L39:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            sf.e r4 = new sf.e
            java.lang.String r5 = "固定延迟"
            r4.<init>(r5, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            sf.e r5 = new sf.e
            java.lang.String r7 = "随机延迟"
            r5.<init>(r7, r2)
            sf.e[] r2 = new sf.e[]{r4, r5}
            java.util.ArrayList r4 = wb.ho.w6(r2)
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            android.content.SharedPreferences r12 = r0.f17670h
            boolean r2 = r6.h(r12)
            java.lang.Object r7 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L71
            if (r7 != r13) goto L7b
        L71:
            wb.di r7 = new wb.di
            r2 = 20
            r7.<init>(r12, r1, r2)
            r6.k0(r7)
        L7b:
            fg.l r7 = (fg.l) r7
            r8 = r6
            r6 = r7
            r7 = 0
            r9 = 6
            java.lang.String r2 = "评论延迟"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r8
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r14 = 0
            if (r1 != 0) goto Lcc
            r1 = -1811880392(0xffffffff9400e638, float:-6.507751E-27)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17672j
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto Lb2
            if (r3 != r13) goto Lbc
        Lb2:
            wb.di r3 = new wb.di
            r2 = 21
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        Lbc:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "等待时间"
            java.lang.String r3 = "单位秒，最少 0 秒"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r6.p(r11)
            goto L131
        Lcc:
            r1 = -1811401752(0xffffffff940833e8, float:-6.876482E-27)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17673k
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto Lea
            if (r3 != r13) goto Lf4
        Lea:
            wb.di r3 = new wb.di
            r2 = 22
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        Lf4:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "最短等待"
            java.lang.String r3 = "单位秒，最少 0 秒"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17674l
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L118
            if (r3 != r13) goto L122
        L118:
            wb.di r3 = new wb.di
            r2 = 23
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L122:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "最长等待"
            java.lang.String r3 = "单位秒，不能小于最短等待"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r6.p(r11)
        L131:
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17675m
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r6.h(r12)
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L14c
            if (r4 != r13) goto L156
        L14c:
            wb.di r4 = new wb.di
            r3 = 24
            r4.<init>(r12, r1, r3)
            r6.k0(r4)
        L156:
            fg.l r4 = (fg.l) r4
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "限制运行时段"
            r5 = r6
            r6 = r4
            java.lang.String r4 = "支持跨零点时段"
            r7 = r5
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r7
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1dc
            r1 = -1810194364(0xffffffff941aa044, float:-7.80662E-27)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17676n
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L192
            if (r3 != r13) goto L19c
        L192:
            wb.di r3 = new wb.di
            r2 = 25
            r3.<init>(r12, r1, r2)
            r6.k0(r3)
        L19c:
            r4 = r3
            fg.l r4 = (fg.l) r4
            r2 = 6
            r3 = 4
            r5 = r6
            java.lang.String r6 = "开始时间"
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r6 = r5
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17677o
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L1c1
            if (r3 != r13) goto L1cb
        L1c1:
            wb.di r3 = new wb.di
            r2 = 26
            r3.<init>(r12, r1, r2)
            r6.k0(r3)
        L1cb:
            r4 = r3
            fg.l r4 = (fg.l) r4
            r2 = 6
            r3 = 4
            r5 = r6
            java.lang.String r6 = "结束时间"
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r6 = r5
            r6.p(r11)
            goto L1e5
        L1dc:
            r1 = -1809607193(0xffffffff942395e7, float:-8.25896E-27)
            r6.a0(r1)
            r6.p(r11)
        L1e5:
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17678p
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L1fd
            if (r3 != r13) goto L207
        L1fd:
            wb.di r3 = new wb.di
            r2 = 27
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L207:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "发布时间限制"
            java.lang.String r3 = "仅评论发布后指定小时内的朋友圈，最少 1 小时"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            goto L217
        L214:
            r6.V()
        L217:
            sf.n r1 = sf.n.f12433a
            return r1
        L21a:
            r7 = r17
            i0.h0 r7 = (i0.h0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 0
            r11 = 1
            if (r2 == r3) goto L22f
            r2 = r11
            goto L230
        L22f:
            r2 = r10
        L230:
            r1 = r1 & r11
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L3c0
            i0.a1 r1 = r0.f17678p
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r6 = 6
            r5 = r7
            r7 = 4
            java.lang.String r2 = "当前启用"
            r4 = 0
            wb.ho.B1(r2, r3, r4, r5, r6, r7)
            r7 = r5
            r1 = 0
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17671i
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            i0.e r12 = i0.l.f5952a
            if (r3 != 0) goto L265
            if (r5 != r12) goto L26f
        L265:
            wb.ni r5 = new wb.ni
            r3 = 11
            r5.<init>(r2, r3)
            r7.k0(r5)
        L26f:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "配置名称"
            java.lang.String r3 = "例如 DeepSeek 主账号"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17672j
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L296
            if (r5 != r12) goto L2a0
        L296:
            wb.ni r5 = new wb.ni
            r3 = 12
            r5.<init>(r2, r3)
            r7.k0(r5)
        L2a0:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "API Key"
            java.lang.String r3 = "OpenAI 兼容接口密钥"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17673k
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L2c7
            if (r5 != r12) goto L2d1
        L2c7:
            wb.ni r5 = new wb.ni
            r3 = 13
            r5.<init>(r2, r3)
            r7.k0(r5)
        L2d1:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "API 地址"
            java.lang.String r3 = "例如 https://api.xxx.com/v1"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17674l
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L2f8
            if (r5 != r12) goto L302
        L2f8:
            wb.ni r5 = new wb.ni
            r3 = 14
            r5.<init>(r2, r3)
            r7.k0(r5)
        L302:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "API 路径"
            java.lang.String r3 = "默认 /chat/completions"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17675m
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L329
            if (r5 != r12) goto L333
        L329:
            wb.ni r5 = new wb.ni
            r3 = 15
            r5.<init>(r2, r3)
            r7.k0(r5)
        L333:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "模型"
            java.lang.String r3 = "例如 deepseek-ai/DeepSeek-V3"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17676n
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L35a
            if (r5 != r12) goto L364
        L35a:
            wb.ni r5 = new wb.ni
            r3 = 16
            r5.<init>(r2, r3)
            r7.k0(r5)
        L364:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 3126(0xc36, float:4.38E-42)
            r9 = 0
            java.lang.String r2 = "系统指令"
            java.lang.String r3 = "AI 角色设定和回复要求"
            r5 = 4
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r1, r7, r10, r11)
            i0.a1 r2 = r0.f17677o
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r7.f(r2)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L38a
            if (r5 != r12) goto L394
        L38a:
            wb.ni r5 = new wb.ni
            r3 = 17
            r5.<init>(r2, r3)
            r7.k0(r5)
        L394:
            fg.l r5 = (fg.l) r5
            r6 = r7
            r7 = 54
            java.lang.String r2 = "上下文轮数"
            java.lang.String r3 = "0 表示不保留上下文"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r7 = r6
            wb.ho.D1(r1, r7, r10, r11)
            r6 = 0
            r8 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r2 = r0.f17670h
            java.lang.String r3 = "ai_stream"
            java.lang.String r4 = "流式请求"
            java.lang.String r5 = "失败时会自动尝试非流式"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            wb.ho.D1(r1, r7, r10, r11)
            r6 = 1
            java.lang.String r3 = "ai_clear_context_on_save"
            java.lang.String r4 = "保存后清空上下文"
            java.lang.String r5 = "修改人设或模型后避免继续沿用旧对话"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            goto L3c3
        L3c0:
            r7.V()
        L3c3:
            sf.n r1 = sf.n.f12433a
            return r1
        L3c6:
            r6 = r17
            i0.h0 r6 = (i0.h0) r6
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L3db
            r2 = r10
            goto L3dc
        L3db:
            r2 = r11
        L3dc:
            r1 = r1 & r10
            boolean r1 = r6.S(r1, r2)
            if (r1 == 0) goto L5d3
            i0.a1 r1 = r0.f17671i
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r10) goto L3f5
            java.lang.String r2 = "在范围内随机等待"
        L3f3:
            r3 = r2
            goto L3f8
        L3f5:
            java.lang.String r2 = "每条等待固定时间"
            goto L3f3
        L3f8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            sf.e r4 = new sf.e
            java.lang.String r5 = "固定延迟"
            r4.<init>(r5, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            sf.e r5 = new sf.e
            java.lang.String r7 = "随机延迟"
            r5.<init>(r7, r2)
            sf.e[] r2 = new sf.e[]{r4, r5}
            java.util.ArrayList r4 = wb.ho.w6(r2)
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            android.content.SharedPreferences r12 = r0.f17670h
            boolean r2 = r6.h(r12)
            java.lang.Object r7 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L430
            if (r7 != r13) goto L43a
        L430:
            wb.wh r7 = new wb.wh
            r2 = 15
            r7.<init>(r12, r1, r2)
            r6.k0(r7)
        L43a:
            fg.l r7 = (fg.l) r7
            r8 = r6
            r6 = r7
            r7 = 0
            r9 = 6
            java.lang.String r2 = "点赞延迟"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r8
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r14 = 0
            if (r1 != 0) goto L48b
            r1 = 1036135200(0x3dc22b20, float:0.09480882)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17672j
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L471
            if (r3 != r13) goto L47b
        L471:
            wb.wh r3 = new wb.wh
            r2 = 16
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L47b:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "等待时间"
            java.lang.String r3 = "单位秒，最少 0 秒"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r6.p(r11)
            goto L4f0
        L48b:
            r1 = 1036610771(0x3dc96cd3, float:0.0983521)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17673k
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L4a9
            if (r3 != r13) goto L4b3
        L4a9:
            wb.wh r3 = new wb.wh
            r2 = 17
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L4b3:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "最短等待"
            java.lang.String r3 = "单位秒，最少 0 秒"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17674l
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L4d7
            if (r3 != r13) goto L4e1
        L4d7:
            wb.wh r3 = new wb.wh
            r2 = 18
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L4e1:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "最长等待"
            java.lang.String r3 = "单位秒，不能小于最短等待"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r6.p(r11)
        L4f0:
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17675m
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r6.h(r12)
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L50b
            if (r4 != r13) goto L515
        L50b:
            wb.wh r4 = new wb.wh
            r3 = 19
            r4.<init>(r12, r1, r3)
            r6.k0(r4)
        L515:
            fg.l r4 = (fg.l) r4
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "限制运行时段"
            r5 = r6
            r6 = r4
            java.lang.String r4 = "支持跨零点时段"
            r7 = r5
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r7
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L59b
            r1 = 1037809231(0x3ddbb64f, float:0.10728132)
            r6.a0(r1)
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17676n
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L551
            if (r3 != r13) goto L55b
        L551:
            wb.wh r3 = new wb.wh
            r2 = 20
            r3.<init>(r12, r1, r2)
            r6.k0(r3)
        L55b:
            r4 = r3
            fg.l r4 = (fg.l) r4
            r2 = 6
            r3 = 4
            r5 = r6
            java.lang.String r6 = "开始时间"
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r6 = r5
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17677o
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L580
            if (r3 != r13) goto L58a
        L580:
            wb.wh r3 = new wb.wh
            r2 = 21
            r3.<init>(r12, r1, r2)
            r6.k0(r3)
        L58a:
            r4 = r3
            fg.l r4 = (fg.l) r4
            r2 = 6
            r3 = 4
            r5 = r6
            java.lang.String r6 = "结束时间"
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r6 = r5
            r6.p(r11)
            goto L5a4
        L59b:
            r1 = 1038390636(0x3de4956c, float:0.111613125)
            r6.a0(r1)
            r6.p(r11)
        L5a4:
            wb.ho.D1(r14, r6, r11, r10)
            i0.a1 r1 = r0.f17678p
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L5bc
            if (r3 != r13) goto L5c6
        L5bc:
            wb.wh r3 = new wb.wh
            r2 = 22
            r3.<init>(r1, r12, r2)
            r6.k0(r3)
        L5c6:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 54
            java.lang.String r2 = "发布时间限制"
            java.lang.String r3 = "仅点赞发布后指定小时内的朋友圈，最少 1 小时"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            goto L5d6
        L5d3:
            r6.V()
        L5d6:
            sf.n r1 = sf.n.f12433a
            return r1
        L5d9:
            r8 = r17
            i0.h0 r8 = (i0.h0) r8
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r11 = 1
            r12 = 0
            if (r2 == r3) goto L5ee
            r2 = r11
            goto L5ef
        L5ee:
            r2 = r12
        L5ef:
            r1 = r1 & r11
            boolean r1 = r8.S(r1, r2)
            if (r1 == 0) goto L804
            i0.a1 r1 = r0.f17671i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r13 = r0.f17670h
            boolean r3 = r8.h(r13)
            java.lang.Object r4 = r8.P()
            i0.e r14 = i0.l.f5952a
            if (r3 != 0) goto L612
            if (r4 != r14) goto L61c
        L612:
            wb.me r4 = new wb.me
            r3 = 13
            r4.<init>(r13, r1, r3)
            r8.k0(r4)
        L61c:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "退群系统消息"
            java.lang.String r4 = "保留现有退群监控逻辑，检测到成员退出后插入可点击资料页的系统消息"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r15 = 0
            if (r2 == 0) goto L670
            r2 = -794607399(0xffffffffd0a340d9, float:-2.1911489E10)
            r8.a0(r2)
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r2 = r0.f17672j
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16649q
            java.lang.Object r3 = r8.P()
            if (r3 != r14) goto L65d
            wb.mf r3 = new wb.mf
            r6 = 4
            r3.<init>(r2, r6)
            r8.k0(r3)
        L65d:
            r7 = r3
            fg.l r7 = (fg.l) r7
            r9 = 221238(0x36036, float:3.1002E-40)
            r10 = 0
            java.lang.String r2 = "退群系统消息模板"
            java.lang.String r3 = "wxid变量会生成可点击资料链接"
            r6 = 3
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8.p(r12)
            goto L679
        L670:
            r2 = -794238375(0xffffffffd0a8e259, float:-2.266725E10)
            r8.a0(r2)
            r8.p(r12)
        L679:
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r10 = r0.f17673k
            java.lang.Object r2 = r10.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r8.h(r13)
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto L694
            if (r4 != r14) goto L69e
        L694:
            wb.me r4 = new wb.me
            r3 = 14
            r4.<init>(r13, r10, r3)
            r8.k0(r4)
        L69e:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "邀请详情"
            java.lang.String r4 = "检测到邀请进群后插入邀请者、被邀请者和累计邀请次数"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            java.lang.Object r2 = r10.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6f5
            r2 = -793730130(0xffffffffd0b0a3ae, float:-2.3708135E10)
            r8.a0(r2)
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r2 = r0.f17674l
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16650r
            java.lang.Object r3 = r8.P()
            if (r3 != r14) goto L6de
            wb.mf r3 = new wb.mf
            r6 = 5
            r3.<init>(r2, r6)
            r8.k0(r3)
        L6de:
            r7 = r3
            fg.l r7 = (fg.l) r7
            r9 = 221238(0x36036, float:3.1002E-40)
            r2 = r10
            r10 = 0
            r3 = r2
            java.lang.String r2 = "邀请详情系统消息模板"
            r6 = r3
            java.lang.String r3 = "邀请者和被邀请者wxid会生成可点击资料链接"
            r13 = r6
            r6 = 4
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8.p(r12)
            goto L6ff
        L6f5:
            r13 = r10
            r2 = -793350535(0xffffffffd0b66e79, float:-2.4485546E10)
            r8.a0(r2)
            r8.p(r12)
        L6ff:
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L723
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L718
            goto L723
        L718:
            r1 = -791925031(0xffffffffd0cc2ed9, float:-2.7404978E10)
            r8.a0(r1)
            r8.p(r12)
            goto L7c7
        L723:
            r1 = -793240640(0xffffffffd0b81bc0, float:-2.471061E10)
            r8.a0(r1)
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r1 = r0.f17675m
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r13 = "specific"
            boolean r2 = gg.l.a(r2, r13)
            java.lang.String r3 = "全部群聊"
            java.lang.String r4 = "指定群聊"
            if (r2 == 0) goto L742
            r2 = r4
            goto L743
        L742:
            r2 = r3
        L743:
            wb.dq r5 = new wb.dq
            java.lang.String r6 = "all"
            r5.<init>(r6, r3)
            wb.dq r3 = new wb.dq
            r3.<init>(r13, r4)
            wb.dq[] r3 = new wb.dq[]{r5, r3}
            java.util.List r4 = a.a.y0(r3)
            java.lang.Object r3 = r1.getValue()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r8.P()
            if (r3 != r14) goto L76d
            wb.mf r3 = new wb.mf
            r6 = 6
            r3.<init>(r1, r6)
            r8.k0(r3)
        L76d:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r9 = 24582(0x6006, float:3.4447E-41)
            r10 = 32
            r3 = r2
            java.lang.String r2 = "适用群聊"
            r7 = 0
            wb.ho.I2(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = gg.l.a(r1, r13)
            if (r1 == 0) goto L7bb
            r1 = -792530182(0xffffffffd0c2f2fa, float:-2.6165629E10)
            r8.a0(r1)
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r1 = r0.f17676n
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = wb.ho.i7(r2)
            java.lang.Object r3 = r8.P()
            if (r3 != r14) goto L7ae
            c9.x0 r3 = new c9.x0
            r4 = 24
            i0.a1 r5 = r0.f17677o
            r3.<init>(r4, r1, r5)
            r8.k0(r3)
        L7ae:
            fg.a r3 = (fg.a) r3
            r1 = 390(0x186, float:5.47E-43)
            java.lang.String r4 = "选择指定群聊"
            wb.ho.b(r4, r2, r3, r8, r1)
            r8.p(r12)
            goto L7c4
        L7bb:
            r1 = -791946855(0xffffffffd0cbd999, float:-2.7360283E10)
            r8.a0(r1)
            r8.p(r12)
        L7c4:
            r8.p(r12)
        L7c7:
            wb.ho.D1(r15, r8, r12, r11)
            i0.a1 r1 = r0.f17678p
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r8.P()
            if (r2 != r14) goto L7e2
            wb.bf r2 = new wb.bf
            r3 = 3
            r2.<init>(r1, r3)
            r8.k0(r2)
        L7e2:
            r6 = r2
            fg.a r6 = (fg.a) r6
            java.lang.Object r2 = r8.P()
            if (r2 != r14) goto L7f4
            wb.mf r2 = new wb.mf
            r3 = 7
            r2.<init>(r1, r3)
            r8.k0(r2)
        L7f4:
            r7 = r2
            fg.l r7 = (fg.l) r7
            r9 = 224310(0x36c36, float:3.14325E-40)
            r10 = 0
            java.lang.String r2 = "wxid颜色"
            java.lang.String r3 = "退群和邀请详情里的 wxid 链接颜色"
            r5 = 0
            wb.ho.S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L807
        L804:
            r8.V()
        L807:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
