package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19229j;

    public /* synthetic */ tc(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4) {
            r1 = this;
            r0 = 10
            r1.f19226g = r0
            r1.<init>()
            r1.f19229j = r2
            r1.f19228i = r3
            r1.f19227h = r4
            return
    }

    public /* synthetic */ tc(android.content.SharedPreferences r1, android.content.Context r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19226g = r4
            r0.f19228i = r1
            r0.f19229j = r2
            r0.f19227h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ tc(i0.a1 r1, android.content.SharedPreferences r2, android.content.Context r3, int r4) {
            r0 = this;
            r0.f19226g = r4
            r0.f19227h = r1
            r0.f19228i = r2
            r0.f19229j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f19226g
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L23b;
                case 1: goto L225;
                case 2: goto L20f;
                case 3: goto L1f9;
                case 4: goto L1e3;
                case 5: goto L1cd;
                case 6: goto L1b7;
                case 7: goto L15d;
                case 8: goto L137;
                case 9: goto L111;
                case 10: goto L2e;
                default: goto L7;
            }
        L7:
            android.content.SharedPreferences r0 = r14.f19228i
            android.content.Context r1 = r14.f19229j
            i0.a1 r3 = r14.f19227h
            r.h r15 = (r.h) r15
            r15.getClass()
            s0.d r4 = wb.p0.T4
            r5 = 3
            r.h.a(r15, r2, r4, r5)
            c9.h0 r4 = new c9.h0
            r6 = 25
            r4.<init>(r0, r1, r3, r6)
            s0.d r0 = new s0.d
            r1 = -526951344(0xffffffffe0975c50, float:-8.725344E19)
            r3 = 1
            r0.<init>(r1, r4, r3)
            r.h.a(r15, r2, r0, r5)
        L2b:
            sf.n r15 = sf.n.f12433a
            return r15
        L2e:
            android.content.Context r0 = r14.f19229j
            android.content.SharedPreferences r2 = r14.f19228i
            i0.a1 r3 = r14.f19227h
            java.util.List r15 = (java.util.List) r15
            r15.getClass()
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto L4a
            java.lang.String r15 = "没有可删除的名单"
            android.widget.Toast r15 = android.widget.Toast.makeText(r0, r15, r1)
            r15.show()
            goto L10e
        L4a:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r15)
            r4.<init>(r5)
            java.util.Iterator r5 = r15.iterator()
        L57:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "|"
            java.lang.String r8 = "contact"
            java.lang.String r9 = "group_member"
            if (r6 == 0) goto L98
            java.lang.Object r6 = r5.next()
            aa.a r6 = (aa.a) r6
            java.lang.String r10 = r6.f105b
            java.lang.String r6 = r6.f106c
            r10.getClass()
            r6.getClass()
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L7a
            r8 = r9
        L7a:
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r4.add(r6)
            goto L57
        L98:
            java.util.Set r4 = tf.m.U1(r4)
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lab:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lef
            java.lang.Object r10 = r5.next()
            r11 = r10
            aa.a r11 = (aa.a) r11
            java.lang.String r12 = r11.f105b
            java.lang.String r11 = r11.f106c
            r12.getClass()
            r11.getClass()
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto Lca
            r12 = r9
            goto Lcb
        Lca:
            r12 = r8
        Lcb:
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r7)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            boolean r11 = r4.contains(r11)
            if (r11 != 0) goto Lab
            r6.add(r10)
            goto Lab
        Lef:
            r3.setValue(r6)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "message_block_bindings"
            java.lang.String r4 = a2.a.e(r6)
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)
            r2.apply()
            int r15 = r15.size()
            java.lang.String r2 = "已删除 "
            java.lang.String r3 = " 个名单项"
            wb.en.o(r2, r15, r3, r0, r1)
        L10e:
            sf.n r15 = sf.n.f12433a
            return r15
        L111:
            android.content.SharedPreferences r0 = r14.f19228i
            android.content.Context r1 = r14.f19229j
            i0.a1 r2 = r14.f19227h
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.setValue(r15)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "bubble_icon"
            android.content.SharedPreferences$Editor r15 = r0.putString(r2, r15)
            r15.apply()
            ig.a.m(r1, r3)
            goto L2b
        L137:
            android.content.SharedPreferences r0 = r14.f19228i
            android.content.Context r1 = r14.f19229j
            i0.a1 r2 = r14.f19227h
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.setValue(r15)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "bubble_dark_icon"
            android.content.SharedPreferences$Editor r15 = r0.putString(r2, r15)
            r15.apply()
            ig.a.m(r1, r3)
            goto L2b
        L15d:
            android.content.SharedPreferences r0 = r14.f19228i
            android.content.Context r3 = r14.f19229j
            i0.a1 r4 = r14.f19227h
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r5 = r15.booleanValue()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r6 = "crash_report_enable"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r5)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L1ab
            r4.setValue(r15)
            h.Hchat.crash.g r15 = h.Hchat.crash.g.f4581a
            h.Hchat.crash.g.f4589i = r5
            if (r5 != 0) goto L18a
            java.io.File r15 = h.Hchat.crash.g.f4596p
            if (r15 == 0) goto L1b4
            h.Hchat.crash.g.c()
            goto L1b4
        L18a:
            android.content.Context r15 = r3.getApplicationContext()
            boolean r0 = r15 instanceof android.app.Application
            if (r0 == 0) goto L195
            r2 = r15
            android.app.Application r2 = (android.app.Application) r2
        L195:
            if (r2 == 0) goto L198
            goto L19c
        L198:
            android.app.Application r2 = h.Hchat.crash.g.f4590j
            if (r2 == 0) goto L1b4
        L19c:
            h.Hchat.crash.g.h(r2)
            java.lang.ClassLoader r15 = h.Hchat.crash.g.f4591k
            if (r15 == 0) goto L1a7
            h.Hchat.crash.g.g(r2, r15)
            goto L1b4
        L1a7:
            h.Hchat.crash.g.d()
            goto L1b4
        L1ab:
            java.lang.String r15 = "保存设置失败"
            android.widget.Toast r15 = android.widget.Toast.makeText(r3, r15, r1)
            r15.show()
        L1b4:
            sf.n r15 = sf.n.f12433a
            return r15
        L1b7:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_network_heartbeat"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L1cd:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_watchdog"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L1e3:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_root_app_ops"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L1f9:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_root_doze_whitelist"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L20f:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_wake_lock"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L225:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_foreground_service"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
        L23b:
            i0.a1 r0 = r14.f19227h
            android.content.SharedPreferences r1 = r14.f19228i
            android.content.Context r2 = r14.f19229j
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            r0.setValue(r15)
            java.lang.String r15 = "wechat_keep_alive_enable"
            wb.ho.l4(r2, r1, r15, r3)
            goto L2b
    }
}
