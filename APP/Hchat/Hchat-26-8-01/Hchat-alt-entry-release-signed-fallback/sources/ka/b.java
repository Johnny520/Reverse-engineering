package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "qq_music_order"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "搜索 QQ 音乐并发送音乐卡片或歌曲语音，可同时发送"
            java.lang.String r1 = "entertainment"
            java.lang.String r2 = "qq_music_order"
            java.lang.String r3 = "QQ点歌"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r13) {
            r12 = this;
            r13.getClass()
            android.os.Handler r0 = r8.e.f11615a
            c9.f r0 = new c9.f
            r1 = 5
            r0.<init>(r13, r1)
            r1 = 8
            java.lang.String r2 = "shared:send_button"
            java.lang.String r3 = "聊天发送按钮"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r1, r0, r2, r3, r4)
            eb.s r0 = new eb.s
            r1 = 1
            r0.<init>(r12, r13, r1)
            java.lang.Class<f8.e> r2 = f8.e.class
            r12.i(r2, r0)
            ka.f r2 = new ka.f
            android.content.Context r13 = r13.f11620a
            ia.t r3 = new ia.t
            java.lang.Class<ka.b> r0 = ka.b.class
            java.lang.Class r6 = eh.a.i(r0)
            r10 = 0
            r11 = 8
            r4 = 2
            java.lang.String r7 = "logError"
            java.lang.String r8 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.<init>(r13, r3)
            i8.c r13 = h.Hchat.hooks.api.core.WeChatApis.message()
            r13.getClass()
            k8.i r13 = h.Hchat.hooks.api.core.WeChatApis.k()
            if (r13 == 0) goto L70
            r13.a()     // Catch: java.lang.Throwable -> L50
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L57:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L64
            ia.t r3 = r2.f7552a
            java.lang.String r4 = "QQ点歌数据库监听安装失败"
            r3.invoke(r4, r0)
        L64:
            k8.m r0 = new k8.m
            r0.<init>(r2, r1)
            a2.a r13 = r13.e(r0)
            r12.j(r13)
        L70:
            eb.m0 r13 = eb.m0.f2587a
            ka.e r13 = new ka.e
            r13.<init>(r2)
            java.lang.String r0 = "qq_music_order"
            a2.a r13 = eb.m0.j(r0, r13)
            r12.j(r13)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "QQ点歌"
            return r0
    }
}
