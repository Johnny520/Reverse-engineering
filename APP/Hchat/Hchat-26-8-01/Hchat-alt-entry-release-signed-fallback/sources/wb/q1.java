package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18564i;

    public /* synthetic */ q1(android.content.Context r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18562g = r3
            r0.f18563h = r1
            r0.f18564i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f18562g
            java.lang.String r1 = "铃声已选择，保存后生效"
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto Ldb;
                case 1: goto Lae;
                case 2: goto L88;
                case 3: goto L6e;
                case 4: goto L52;
                case 5: goto L36;
                default: goto L9;
            }
        L9:
            android.content.Context r0 = r6.f18563h
            i0.a1 r1 = r6.f18564i
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L1b
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L28
            java.lang.String r7 = "当前页面无法打开文件选择器"
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r7, r3)
            r7.show()
            goto L33
        L28:
            wb.wq r3 = wb.wq.f20020a
            eb.v0 r4 = new eb.v0
            r5 = 6
            r4.<init>(r7, r0, r1, r5)
            r3.b(r2, r7, r4)
        L33:
            sf.n r7 = sf.n.f12433a
            return r7
        L36:
            android.content.Context r0 = r6.f18563h
            i0.a1 r1 = r6.f18564i
            i0.a0 r7 = (i0.a0) r7
            r7.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r7 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            wb.l9 r3 = new wb.l9
            r4 = 24
            r3.<init>(r1, r4)
            eb.b0 r7 = r7.subscribePluginCatalog(r0, r3)
            wb.bo r0 = new wb.bo
            r0.<init>(r7, r2)
            return r0
        L52:
            android.content.Context r0 = r6.f18563h
            i0.a1 r2 = r6.f18564i
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.util.concurrent.atomic.AtomicBoolean r4 = e9.q.f2460a
            java.lang.String r7 = e9.q.h(r0, r7)
            r2.setValue(r7)
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r1, r3)
            r7.show()
        L6b:
            sf.n r7 = sf.n.f12433a
            return r7
        L6e:
            android.content.Context r0 = r6.f18563h
            i0.a1 r2 = r6.f18564i
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.util.concurrent.atomic.AtomicBoolean r4 = e9.q.f2460a
            java.lang.String r7 = e9.q.h(r0, r7)
            r2.setValue(r7)
            android.widget.Toast r7 = android.widget.Toast.makeText(r0, r1, r3)
            r7.show()
            goto L6b
        L88:
            android.content.Context r0 = r6.f18563h
            i0.a1 r1 = r6.f18564i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L97
            java.lang.String r4 = "自定义头像已保存"
            goto L99
        L97:
            java.lang.String r4 = "头像设置失败"
        L99:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r4, r3)
            r0.show()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r1.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            p.a.u(r7, r2, r1)
        Lab:
            sf.n r7 = sf.n.f12433a
            return r7
        Lae:
            android.content.Context r0 = r6.f18563h
            i0.a1 r1 = r6.f18564i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            r1.setValue(r7)
            k9.r r7 = k9.r.f7530a
            java.lang.String r7 = "floating_shortcut_menu"
            android.content.SharedPreferences r7 = ub.b.c(r0, r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r0 = "enable"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r0, r2)
            r7.apply()
            k9.r.f7533d = r2
            k9.q r7 = new k9.q
            r7.<init>(r3, r2)
            k9.r.p(r7)
            goto L6b
        Ldb:
            android.content.Context r0 = r6.f18563h
            i0.a1 r1 = r6.f18564i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            r1.setValue(r7)
            java.lang.String r7 = "Hchat_conversation_groups"
            android.content.SharedPreferences r7 = ub.b.c(r0, r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r1 = "enabled"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r1, r2)
            boolean r7 = r7.commit()
            if (r7 != 0) goto L103
            java.lang.String r7 = "[Hchat:ConversationGroup] 保存启用状态失败"
            fb.v0.m(r7)
        L103:
            c9.d2.y(r0)
            goto L6b
    }
}
