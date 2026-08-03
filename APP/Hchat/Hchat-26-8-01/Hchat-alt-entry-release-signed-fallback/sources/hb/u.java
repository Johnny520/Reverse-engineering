package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hb.i0 f5475e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "selected_messages"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "从多选消息菜单群发或定时转发聊天记录"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "selected_messages"
            java.lang.String r3 = "群发助手"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            hb.i0 r0 = new hb.i0
            ab.b r1 = new ab.b
            java.lang.Class<hb.u> r2 = hb.u.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 23
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            hb.c r11 = r0.f5407h
            hb.r r1 = r0.f5406g
            hb.k r2 = r0.f5408i
            r11.getClass()
            r1.getClass()
            r2.getClass()
            hb.k0 r4 = new hb.k0
            r4.<init>(r11, r1, r2)
            a.a.f1g = r4
            hb.l r11 = hb.m.f5433a
            hb.l r11 = hb.m.f5433a
            r1 = 1
            if (r11 == 0) goto L41
            boolean r11 = r11.a()
            if (r11 != r1) goto L41
            goto L5a
        L41:
            java.util.concurrent.atomic.AtomicBoolean r11 = hb.m.f5435c
            r2 = 0
            boolean r11 = r11.compareAndSet(r2, r1)
            if (r11 != 0) goto L4b
            goto L5a
        L4b:
            java.lang.Thread r11 = new java.lang.Thread
            h.Hchat.crash.e r2 = new h.Hchat.crash.e
            r2.<init>(r1)
            java.lang.String r1 = "Hchat-SelectedMessageContactsWarmup"
            r11.<init>(r2, r1)
            r11.start()
        L5a:
            r3.f5475e = r0
            ab.a r11 = new ab.a
            r0 = 29
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "selected_messages"
            java.lang.String r2 = "群发助手"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 15
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "群发助手"
            return r0
    }
}
