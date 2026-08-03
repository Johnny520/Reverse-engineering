package q9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "group_rename_monitor"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "监控群成员修改群内昵称，支持系统消息、文本和卡片提醒"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "group_rename_monitor"
            java.lang.String r3 = "改名监控"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ia.t r0 = new ia.t
            java.lang.Class<q9.b> r9 = q9.b.class
            java.lang.Class r3 = eh.a.i(r9)
            r7 = 0
            r8 = 17
            r1 = 2
            java.lang.String r4 = "logError"
            java.lang.String r5 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            o9.c r1 = o9.c.f9620a
            r1.b(r12, r0)
            hb.r r10 = new hb.r
            ia.t r0 = new ia.t
            java.lang.Class r3 = eh.a.i(r9)
            r8 = 18
            r1 = 2
            java.lang.String r4 = "logError"
            java.lang.String r5 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r12, r0)
            i8.a r1 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r1.getClass()
            g8.g r1 = h.Hchat.hooks.api.core.WeChatApis.d()
            if (r1 == 0) goto L40
            goto L44
        L40:
            g8.g r1 = h.Hchat.hooks.api.core.WeChatApis.chatroomChanges()
        L44:
            if (r1 != 0) goto L4d
            java.lang.String r1 = "群聊变更 API 未就绪"
            r3 = 0
            r0.invoke(r1, r3)
            goto L5d
        L4d:
            na.f r0 = new na.f
            r3 = 2
            r0.<init>(r10, r3)
            a2.a r0 = r1.a(r0)
            r11.j(r0)
            r10.p()
        L5d:
            q9.a r0 = new q9.a
            r1 = 0
            r0.<init>(r10, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r11.i(r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "改名监控"
            return r0
    }
}
