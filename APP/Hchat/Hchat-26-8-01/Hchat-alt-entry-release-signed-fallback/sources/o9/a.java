package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "group_leave_monitor"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "监听成员进群和退群，支持系统消息和自动回复"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "group_leave_monitor"
            java.lang.String r3 = "进退群监控"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r14) {
            r13 = this;
            r14.getClass()
            o9.c r10 = o9.c.f9620a
            ia.t r1 = new ia.t
            java.lang.Class<o9.a> r11 = o9.a.class
            java.lang.Class r4 = eh.a.i(r11)
            r8 = 0
            r9 = 13
            r2 = 2
            java.lang.String r5 = "logError"
            java.lang.String r6 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            android.content.Context r0 = r14.f11620a
            boolean r2 = o9.c.f9621b
            r12 = 0
            if (r2 == 0) goto L22
            goto L63
        L22:
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            java.lang.Class<android.widget.TextView$BufferType> r3 = android.widget.TextView.BufferType.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.String r4 = "setText"
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r3, r4, r2)
            if (r2 != 0) goto L3a
            java.lang.String r0 = "退群监控 wxid 高亮 Hook 未找到"
            r1.invoke(r0, r12)
            goto L63
        L3a:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L4c
            ea.b r4 = new ea.b     // Catch: java.lang.Throwable -> L4c
            r5 = 5
            r6 = 0
            r4.<init>(r0, r5, r6)     // Catch: java.lang.Throwable -> L4c
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L4c
            r0 = 1
            o9.c.f9621b = r0     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c
            goto L53
        L4c:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L53:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L5a
            goto L61
        L5a:
            java.lang.String r0 = "退群监控 wxid 高亮 Hook 安装失败"
            r1.invoke(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L61:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L63:
            r10.b(r14, r1)
            o9.p r10 = new o9.p
            ia.t r1 = new ia.t
            java.lang.Class r4 = eh.a.i(r11)
            r8 = 0
            r9 = 14
            r2 = 2
            java.lang.String r5 = "logError"
            java.lang.String r6 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r14, r1)
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.d()
            if (r0 == 0) goto L8c
            goto L90
        L8c:
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChanges()
        L90:
            if (r0 == 0) goto La0
            na.f r2 = new na.f
            r4 = 1
            r2.<init>(r10, r4)
            a2.a r0 = r0.a(r2)
            r13.j(r0)
            goto La5
        La0:
            java.lang.String r0 = "群聊变更 API 未就绪"
            r1.invoke(r0, r12)
        La5:
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserve()     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lb1:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Lb7
            goto Lb8
        Lb7:
            r12 = r0
        Lb8:
            k8.p r12 = (k8.p) r12
            if (r12 == 0) goto Le7
            boolean r0 = r12.c()
            if (r0 == 0) goto Le7
            r12.b()     // Catch: java.lang.Throwable -> Lc8
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lc8
            goto Lcf
        Lc8:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lcf:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Lda
            java.lang.String r2 = "邀请详情消息监听安装失败"
            r1.invoke(r2, r0)
        Lda:
            na.c r0 = new na.c
            r1 = 2
            r0.<init>(r10, r1)
            a2.a r0 = r12.e(r0)
            r13.j(r0)
        Le7:
            r10.z()
            ke.h r0 = new ke.h
            r1 = 28
            r0.<init>(r10, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r13.i(r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "进退群监控"
            return r0
    }
}
