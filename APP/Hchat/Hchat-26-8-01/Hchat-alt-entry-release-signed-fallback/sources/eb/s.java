package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements f8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r8.g f2651h;

    public /* synthetic */ s(r8.a r1, r8.g r2, int r3) {
            r0 = this;
            r0.f2650g = r3
            r0.f2651h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ s(r8.g r2) {
            r1 = this;
            r0 = 2
            r1.f2650g = r0
            r1.<init>()
            r1.f2651h = r2
            return
    }

    @Override // f8.d
    public final void b(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.f2650g
            r2 = 8
            r3 = 10
            r8.c r4 = r8.c.f11604j
            java.lang.String r5 = "聊天发送按钮"
            java.lang.String r6 = "shared:send_button"
            r8.g r7 = r0.f2651h
            switch(r1) {
                case 0: goto Lcc;
                case 1: goto Lb9;
                case 2: goto L25;
                default: goto L13;
            }
        L13:
            r1 = r17
            f8.e r1 = (f8.e) r1
            r1.getClass()
            android.os.Handler r1 = r8.e.f11615a
            c9.f r1 = new c9.f
            r1.<init>(r7, r3)
            r8.e.f(r2, r1, r6, r5, r4)
            return
        L25:
            r1 = r17
            f8.f r1 = (f8.f) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicInteger r2 = x9.d.f21409a
            android.content.Context r2 = r7.f11620a
            java.lang.String r4 = r1.f3325c
            java.lang.String r5 = r1.f3324b
            java.lang.String r6 = r1.f3326d
            boolean r7 = og.m.t0(r4)
            if (r7 != 0) goto Lb8
            boolean r7 = og.m.t0(r5)
            if (r7 != 0) goto Lb8
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L4a
            goto Lb8
        L4a:
            java.lang.String r7 = r1.f3327e
            if (r7 == 0) goto L5a
            java.lang.Integer r3 = og.t.e0(r3, r7)
            if (r3 == 0) goto L5a
            int r3 = r3.intValue()
        L58:
            r10 = r3
            goto L64
        L5a:
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r3.getClass()
            int r3 = l8.d.f(r6)
            goto L58
        L64:
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            long r7 = r1.f3328f
            r11 = 0
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L72
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r11
            goto L76
        L72:
            long r7 = java.lang.System.currentTimeMillis()
        L76:
            long r11 = r1.f3329g
            java.lang.String r13 = r1.f3330h
            java.lang.String r14 = r1.f3331i
            r3.getClass()
            r9 = 0
            h.Hchat.hooks.api.model.WeChatMessage r15 = l8.d.k(r4, r5, r6, r7, r9, r10, r11, r13, r14)
            java.lang.String r3 = x9.d.h(r15)
            java.lang.String r10 = r1.f3323a
            java.lang.String r11 = r1.f3332j
            boolean r1 = r15.isGroupChat()
            if (r1 != 0) goto La7
            java.lang.String r1 = "@chatroom"
            r7 = 0
            boolean r1 = og.t.W(r4, r1, r7)
            if (r1 != 0) goto La7
            java.lang.String r1 = "@im.chatroom"
            boolean r1 = og.t.W(r4, r1, r7)
            if (r1 == 0) goto La4
            goto La7
        La4:
            r12 = r7
            r7 = r4
            goto La9
        La7:
            r7 = 1
            goto La4
        La9:
            k8.o r4 = new k8.o
            r14 = 0
            r8 = r5
            java.lang.String r5 = "message_block"
            r13 = 0
            r9 = r6
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            x9.d.c(r2, r4)
        Lb8:
            return
        Lb9:
            r1 = r17
            f8.e r1 = (f8.e) r1
            r1.getClass()
            android.os.Handler r1 = r8.e.f11615a
            c9.f r1 = new c9.f
            r3 = 5
            r1.<init>(r7, r3)
            r8.e.f(r2, r1, r6, r5, r4)
            return
        Lcc:
            r1 = r17
            f8.e r1 = (f8.e) r1
            r1.getClass()
            c9.g.k(r7)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            android.content.Context r2 = r7.f11620a
            r1.loadEnabledPluginsWhenReady(r2)
            return
    }
}
