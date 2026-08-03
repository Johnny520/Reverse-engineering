package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f7948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7952l;

    public /* synthetic */ a(java.lang.String r2, java.lang.String r3, int r4, x8.r r5, android.content.Context r6) {
            r1 = this;
            r0 = 3
            r1.f7947g = r0
            r1.<init>()
            r1.f7948h = r2
            r1.f7949i = r3
            r1.f7950j = r4
            r1.f7951k = r5
            r1.f7952l = r6
            return
    }

    public /* synthetic */ a(lb.i r2, j8.y r3, java.lang.String r4, java.lang.String r5, int r6) {
            r1 = this;
            r0 = 0
            r1.f7947g = r0
            r1.<init>()
            r1.f7951k = r2
            r1.f7952l = r3
            r1.f7948h = r4
            r1.f7949i = r5
            r1.f7950j = r6
            return
    }

    public /* synthetic */ a(ra.c r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
            r1 = this;
            r0 = 1
            r1.f7947g = r0
            r1.<init>()
            r1.f7951k = r2
            r1.f7948h = r3
            r1.f7949i = r4
            r1.f7952l = r5
            r1.f7950j = r6
            return
    }

    public /* synthetic */ a(rb.k r2, rb.h r3, int r4, java.lang.String r5, org.json.JSONObject r6) {
            r1 = this;
            r0 = 2
            r1.f7947g = r0
            r1.<init>()
            r1.f7951k = r2
            r1.f7952l = r3
            r1.f7950j = r4
            r1.f7948h = r5
            r1.f7949i = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            int r0 = r1.f7947g
            r2 = 0
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = r1.f7948h
            java.lang.Object r6 = r1.f7952l
            java.lang.Object r7 = r1.f7951k
            int r8 = r1.f7950j
            java.lang.Object r9 = r1.f7949i
            switch(r0) {
                case 0: goto L139;
                case 1: goto L12f;
                case 2: goto L8b;
                default: goto L15;
            }
        L15:
            java.lang.String r11 = r1.f7948h
            java.lang.String r9 = (java.lang.String) r9
            x8.r r7 = (x8.r) r7
            r10 = r6
            android.content.Context r10 = (android.content.Context) r10
            java.util.concurrent.ExecutorService r0 = x8.q.f21329a
            eb.k r0 = eb.k.f2567a     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = eb.k.p(r8, r11, r9)     // Catch: java.lang.Throwable -> L37
            i8.a r5 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L37
            r5.getClass()     // Catch: java.lang.Throwable -> L37
            g8.l r5 = h.Hchat.hooks.api.core.WeChatApis.s()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L39
            r5.c(r0, r9, r8, r4)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L75
        L39:
            java.lang.String r0 = "auto_accept_tag_enable"
            boolean r0 = r7.e(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "auto_accept_tag_name"
            java.lang.String r3 = r7.h(r4, r3)     // Catch: java.lang.Throwable -> L37
            x8.q.w(r11, r3, r0)     // Catch: java.lang.Throwable -> L37
            x8.f r0 = x8.q.f21341m     // Catch: java.lang.Throwable -> L37
            x8.q.c(r7, r11, r0)     // Catch: java.lang.Throwable -> L37
            x8.q.d(r7, r11, r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "auto_accept_delay_ms"
            long r3 = r7.g(r0)     // Catch: java.lang.Throwable -> L37
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5e
            r14 = r5
            goto L5f
        L5e:
            r14 = r3
        L5f:
            java.util.List r12 = r7.c()     // Catch: java.lang.Throwable -> L37
            x8.g r13 = new x8.g     // Catch: java.lang.Throwable -> L37
            r0 = 252(0xfc, float:3.53E-43)
            r13.<init>(r0, r11, r11, r2)     // Catch: java.lang.Throwable -> L37
            r16 = 0
            boolean r0 = x8.q.k(r10, r11, r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            goto L7b
        L75:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L7b:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L8a
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:AutoReply] 好友申请处理失败: "
            eh.a.x(r3, r2, r0)
        L8a:
            return
        L8b:
            rb.k r7 = (rb.k) r7
            rb.h r6 = (rb.h) r6
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            rb.j r0 = r6.f11897a
            java.lang.String r0 = r0.f11902a
            java.util.concurrent.ConcurrentHashMap r6 = r7.f11913j
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto La0
            goto La1
        La0:
            r3 = r6
        La1:
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto La8
            r3 = r0
        La8:
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto Lb7
            goto Le8
        Lb7:
            java.lang.String r6 = "不是收款方好友"
            boolean r6 = og.m.h0(r5, r6, r4)
            if (r6 != 0) goto L11c
            java.lang.String r6 = "拒绝接收你的"
            boolean r6 = og.m.h0(r5, r6, r4)
            if (r6 != 0) goto L11c
            java.lang.String r6 = "对方拒绝接收"
            boolean r6 = og.m.h0(r5, r6, r4)
            if (r6 != 0) goto L11c
            java.lang.String r6 = "好友关系是否正常"
            boolean r6 = og.m.h0(r5, r6, r4)
            if (r6 != 0) goto L11c
            java.lang.String r6 = "确认你和"
            boolean r6 = og.m.h0(r5, r6, r4)
            if (r6 == 0) goto Le8
            java.lang.String r6 = "好友关系"
            boolean r4 = og.m.h0(r5, r6, r4)
            if (r4 == 0) goto Le8
            goto L11c
        Le8:
            if (r8 == 0) goto Led
            r4 = 2
            if (r8 != r4) goto L108
        Led:
            if (r9 == 0) goto Lf5
            java.lang.String r2 = "req_key"
            java.lang.String r2 = r9.optString(r2)
        Lf5:
            if (r2 == 0) goto L108
            boolean r2 = og.m.t0(r2)
            if (r2 == 0) goto Lfe
            goto L108
        Lfe:
            rb.d r2 = new rb.d
            rb.e r4 = rb.e.f11885g
            java.lang.String r5 = "好友关系正常"
            r2.<init>(r0, r3, r4, r5)
            goto L12b
        L108:
            boolean r2 = og.m.t0(r5)
            if (r2 == 0) goto L114
            java.lang.String r2 = "检测返回异常码 "
            java.lang.String r5 = eh.a.l(r8, r2)
        L114:
            rb.d r2 = new rb.d
            rb.e r4 = rb.e.f11887i
            r2.<init>(r0, r3, r4, r5)
            goto L12b
        L11c:
            boolean r2 = og.m.t0(r5)
            if (r2 == 0) goto L124
            java.lang.String r5 = "好友关系异常"
        L124:
            rb.d r2 = new rb.d
            rb.e r4 = rb.e.f11886h
            r2.<init>(r0, r3, r4, r5)
        L12b:
            r7.i(r2)
            return
        L12f:
            ra.c r7 = (ra.c) r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r6 = (java.lang.String) r6
            r7.w(r8, r5, r9, r6)
            return
        L139:
            lb.i r7 = (lb.i) r7
            j8.y r6 = (j8.y) r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = r6.s(r8, r5, r9)     // Catch: java.lang.Throwable -> L148
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L148
            goto L14f
        L148:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L14f:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L15c
            ia.t r2 = r7.f7983b
            java.lang.String r3 = "复读语音发送失败"
            r2.invoke(r3, r0)
        L15c:
            return
    }
}
