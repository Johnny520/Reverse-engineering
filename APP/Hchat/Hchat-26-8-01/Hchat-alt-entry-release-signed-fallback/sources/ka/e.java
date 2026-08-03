package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements eb.i0, gg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka.f f7550a;

    public e(ka.f r1) {
            r0 = this;
            r0.<init>()
            r0.f7550a = r1
            return
    }

    @Override // gg.h
    public final gg.j a() {
            r8 = this;
            gg.j r0 = new gg.j
            java.lang.Class<ka.f> r1 = ka.f.class
            java.lang.Class r3 = eh.a.i(r1)
            r6 = 0
            r7 = 0
            r1 = 1
            ka.f r2 = r8.f7550a
            java.lang.String r4 = "onSendButton"
            java.lang.String r5 = "onSendButton(Ljava/lang/String;)Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // eb.i0
    public final boolean b(java.lang.String r10) {
            r9 = this;
            r10.getClass()
            ka.f r1 = r9.f7550a
            ka.g r0 = r1.f7554c
            java.lang.String r2 = "qq_music_order_enable"
            r3 = 0
            boolean r2 = r0.b(r2, r3)
            if (r2 != 0) goto L12
            goto L84
        L12:
            i8.b r2 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r2.getClass()
            q8.m r2 = h.Hchat.hooks.api.core.WeChatApis.b()
            r4 = 0
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.a()
            goto L26
        L25:
            r2 = r4
        L26:
            java.lang.String r5 = ""
            if (r2 != 0) goto L2b
            r2 = r5
        L2b:
            boolean r6 = og.m.t0(r2)
            if (r6 == 0) goto L32
            goto L84
        L32:
            java.lang.CharSequence r6 = og.m.R0(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "开启点歌"
            boolean r7 = gg.l.a(r6, r7)
            r8 = 1
            if (r7 == 0) goto L47
            r1.f(r2, r8)
            return r8
        L47:
            java.lang.String r7 = "关闭点歌"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L53
            r1.f(r2, r3)
            return r8
        L53:
            java.lang.String r6 = "qq_music_order_intercept_own_command"
            boolean r0 = r0.b(r6, r3)
            if (r0 != 0) goto L5c
            goto L84
        L5c:
            ka.d r6 = r1.c(r10)
            if (r6 == 0) goto L84
            i8.a r10 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r10.getClass()
            g8.a r10 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r10 == 0) goto L73
            java.lang.String r4 = r10.c()
        L73:
            if (r4 != 0) goto L76
            goto L77
        L76:
            r5 = r4
        L77:
            java.util.concurrent.ExecutorService r10 = r1.f7556e
            ka.c r0 = new ka.c
            r3 = 0
            r0.<init>(r1, r2, r3, r5, r6)
            r10.execute(r0)
            return r8
        L84:
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof eb.i0
            if (r0 == 0) goto L17
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L17
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
        L17:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
    }
}
