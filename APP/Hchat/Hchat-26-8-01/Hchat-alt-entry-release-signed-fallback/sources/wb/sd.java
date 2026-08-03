package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19070v;

    public /* synthetic */ sd(android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16, int r17) {
            r1 = this;
            r0 = r17
            r1.f19055g = r0
            r1.f19056h = r2
            r1.f19057i = r3
            r1.f19058j = r4
            r1.f19059k = r5
            r1.f19060l = r6
            r1.f19061m = r7
            r1.f19062n = r8
            r1.f19063o = r9
            r1.f19064p = r10
            r1.f19065q = r11
            r1.f19066r = r12
            r1.f19067s = r13
            r1.f19068t = r14
            r1.f19069u = r15
            r2 = r16
            r1.f19070v = r2
            r1.<init>()
            return
    }

    public /* synthetic */ sd(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16) {
            r1 = this;
            r0 = 2
            r1.f19055g = r0
            r1.<init>()
            r1.f19070v = r2
            r1.f19056h = r3
            r1.f19057i = r4
            r1.f19058j = r5
            r1.f19059k = r6
            r1.f19060l = r7
            r1.f19061m = r8
            r1.f19062n = r9
            r1.f19063o = r10
            r1.f19064p = r11
            r1.f19065q = r12
            r1.f19066r = r13
            r1.f19067s = r14
            r1.f19068t = r15
            r2 = r16
            r1.f19069u = r2
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r13 = this;
            int r0 = r13.f19055g
            switch(r0) {
                case 0: goto L1df;
                case 1: goto L104;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f19070v
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            i0.a1 r1 = r13.f19057i
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 44
            java.lang.String r2 = og.m.M0(r2, r3)
            java.lang.String r2 = a7.a.i(r2)
            int r3 = r2.length()
            if (r3 != 0) goto L23
            java.lang.String r2 = "#576B95"
        L23:
            r1.setValue(r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            i0.a1 r1 = r13.f19058j
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "group_rename_notice_enable"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            i0.a1 r1 = r13.f19059k
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "group_rename_notice_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)
            i0.a1 r1 = r13.f19060l
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "group_rename_notice_scope"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)
            i0.a1 r1 = r13.f19061m
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "group_rename_notice_groups"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)
            i0.a1 r1 = r13.f19062n
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "group_rename_send_enable"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            i0.a1 r1 = r13.f19063o
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "group_rename_listen_groups"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)
            i0.a1 r1 = r13.f19064p
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = og.t.f0(r1)
            r3 = 0
            if (r1 == 0) goto La0
            int r1 = r1.intValue()
            r4 = 600(0x258, float:8.41E-43)
            int r1 = r9.e0.r(r1, r3, r4)
            goto La1
        La0:
            r1 = r3
        La1:
            java.lang.String r4 = "group_rename_delay_seconds"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r1)
            i0.a1 r1 = r13.f19065q
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "group_rename_prompt_type"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            i0.a1 r1 = r13.f19066r
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "group_rename_both_order"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            i0.a1 r1 = r13.f19067s
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "group_rename_text"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            i0.a1 r1 = r13.f19068t
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "group_rename_card_title"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            i0.a1 r1 = r13.f19069u
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "group_rename_card_desc"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            java.lang.String r1 = "group_rename_wxid_color"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
            java.lang.String r0 = "改名监控设置已保存"
            android.content.Context r1 = r13.f19056h
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
        L101:
            sf.n r0 = sf.n.f12433a
            return r0
        L104:
            java.lang.Object r0 = r13.f19070v
            i0.a1 r0 = (i0.a1) r0
            i0.a1 r7 = r13.f19057i
            java.lang.Object r1 = r7.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = og.t.f0(r1)
            android.content.Context r11 = r13.f19056h
            r12 = 0
            if (r1 == 0) goto L1d3
            int r1 = r1.intValue()
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r2 > r1) goto L1d3
            r2 = 1000001(0xf4241, float:1.4013E-39)
            if (r1 >= r2) goto L1d3
            i0.a1 r1 = r13.f19058j
            i0.a1 r2 = r13.f19059k
            i0.a1 r3 = r13.f19060l
            i0.a1 r4 = r13.f19061m
            i0.a1 r5 = r13.f19062n
            i0.a1 r6 = r13.f19063o
            i0.a1 r8 = r13.f19064p
            i0.a1 r9 = r13.f19065q
            i0.a1 r10 = r13.f19066r
            fb.v r2 = wb.y2.B0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = r2.f3823a
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L1c9
            java.lang.String r4 = r2.f3826d
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L14e
            goto L1c9
        L14e:
            java.lang.String r4 = wb.y2.H0(r2)
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L159
            goto L15a
        L159:
            r4 = 0
        L15a:
            if (r4 == 0) goto L165
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r4, r12)
            r0.show()
            goto L1dc
        L165:
            java.util.List r4 = r2.f3827e
            if (r4 == 0) goto L170
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L170
            goto L196
        L170:
            java.util.Iterator r4 = r4.iterator()
        L174:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L196
            java.lang.Object r5 = r4.next()
            fb.r0 r5 = (fb.r0) r5
            boolean r6 = r5.f3746c
            if (r6 == 0) goto L174
            java.lang.String r5 = r5.f3747d
            boolean r5 = og.m.t0(r5)
            if (r5 == 0) goto L174
            java.lang.String r0 = "已启用 MCP 的 Endpoint 不能为空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r12)
            r0.show()
            goto L1dc
        L196:
            fb.w.w(r11, r2)
            r1.setValue(r3)
            fb.t0 r1 = fb.w.n(r11)
            java.lang.String r2 = r1.f3783a
            i0.a1 r3 = r13.f19067s
            r3.setValue(r2)
            java.lang.String r1 = r1.f3784b
            i0.a1 r2 = r13.f19068t
            r2.setValue(r1)
            i0.a1 r1 = r13.f19069u
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            r3 = 1
            p.a.u(r2, r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            java.lang.String r0 = "Agent 配置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r12)
            r0.show()
            goto L1dc
        L1c9:
            java.lang.String r0 = "API 地址和模型不能为空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r12)
            r0.show()
            goto L1dc
        L1d3:
            java.lang.String r0 = "自动压缩阈值需为 2000 到 1000000"
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r12)
            r0.show()
        L1dc:
            sf.n r0 = sf.n.f12433a
            return r0
        L1df:
            java.lang.Object r0 = r13.f19070v
            i0.a1 r0 = (i0.a1) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.a1 r2 = r13.f19057i
            r2.setValue(r1)
            i0.a1 r2 = r13.f19058j
            java.lang.String r3 = "#00000000"
            r2.setValue(r3)
            i0.a1 r2 = r13.f19059k
            java.lang.String r4 = "#FFFF0000"
            r2.setValue(r4)
            i0.a1 r2 = r13.f19060l
            r2.setValue(r3)
            i0.a1 r2 = r13.f19061m
            r2.setValue(r4)
            java.lang.String r2 = "${time}"
            i0.a1 r3 = r13.f19062n
            r3.setValue(r2)
            java.lang.String r2 = "HH:mm:ss"
            i0.a1 r3 = r13.f19063o
            r3.setValue(r2)
            java.lang.String r2 = "message_bottom"
            i0.a1 r3 = r13.f19064p
            r3.setValue(r2)
            java.lang.String r2 = "2"
            i0.a1 r3 = r13.f19065q
            r3.setValue(r2)
            i0.a1 r2 = r13.f19066r
            java.lang.String r3 = "64"
            r2.setValue(r3)
            i0.a1 r2 = r13.f19067s
            r2.setValue(r3)
            java.lang.String r2 = "10"
            i0.a1 r3 = r13.f19068t
            r3.setValue(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            i0.a1 r3 = r13.f19069u
            r3.setValue(r2)
            r0.setValue(r1)
            java.lang.String r0 = "已恢复默认，保存后生效"
            android.content.Context r1 = r13.f19056h
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            goto L101
    }
}
