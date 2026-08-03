package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f20128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20130k;

    public /* synthetic */ xb(int r1, android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5) {
            r0 = this;
            r0.f20126g = r1
            r0.f20128i = r3
            r0.f20127h = r2
            r0.f20129j = r4
            r0.f20130k = r5
            r0.<init>()
            return
    }

    public /* synthetic */ xb(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f20126g = r0
            r1.<init>()
            r1.f20127h = r2
            r1.f20128i = r3
            r1.f20129j = r4
            r1.f20130k = r5
            return
    }

    public /* synthetic */ xb(android.content.Context r2, i0.a1 r3, i0.a1 r4, android.content.SharedPreferences r5) {
            r1 = this;
            r0 = 0
            r1.f20126g = r0
            r1.<init>()
            r1.f20127h = r2
            r1.f20129j = r3
            r1.f20130k = r4
            r1.f20128i = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r12 = this;
            int r0 = r12.f20126g
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L13c;
                case 1: goto L9b;
                case 2: goto L53;
                default: goto L7;
            }
        L7:
            android.content.SharedPreferences r0 = r12.f20128i
            android.content.Context r1 = r12.f20127h
            i0.a1 r3 = r12.f20129j
            i0.a1 r4 = r12.f20130k
            java.lang.Object r5 = r3.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r5 = r9.e0.Y(r5)
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.String r7 = ","
            r10 = 0
            r11 = 62
            r8 = 0
            r9 = 0
            java.lang.String r5 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            r3.setValue(r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "hide_chat_menu_enable"
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r4)
            java.lang.String r3 = "hide_chat_menu_titles"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r5)
            r0.apply()
            java.lang.String r0 = "设置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L50:
            sf.n r0 = sf.n.f12433a
            return r0
        L53:
            android.content.SharedPreferences r0 = r12.f20128i
            android.content.Context r1 = r12.f20127h
            i0.a1 r3 = r12.f20129j
            i0.a1 r4 = r12.f20130k
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r5 = "nickname_color"
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            og.k r6 = bb.l.f693c
            java.lang.String r3 = a7.a.j(r3)
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r3)
            java.lang.String r3 = "nickname_weight"
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = og.t.f0(r4)
            if (r4 == 0) goto L84
            int r4 = r4.intValue()
            goto L86
        L84:
            r4 = 400(0x190, float:5.6E-43)
        L86:
            int r4 = fb.v0.h(r4)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r4)
            r0.apply()
            java.lang.String r0 = "设置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            goto L50
        L9b:
            android.content.Context r5 = r12.f20127h
            android.content.SharedPreferences r6 = r12.f20128i
            i0.a1 r7 = r12.f20129j
            i0.a1 r8 = r12.f20130k
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto Lac
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            r9 = r0
            goto Lad
        Lac:
            r9 = r1
        Lad:
            if (r9 != 0) goto Lba
            java.lang.String r0 = "当前页面无法打开微信地图"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
            goto L137
        Lba:
            wb.zo r10 = wb.zo.f20688a
            wb.sc r3 = new wb.sc
            r4 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r4 = "启动微信地图失败: "
            monitor-enter(r10)
            wb.xo r0 = new wb.xo     // Catch: java.lang.Throwable -> L125
            r0.<init>(r9, r3)     // Catch: java.lang.Throwable -> L125
            wb.zo.f20690c = r0     // Catch: java.lang.Throwable -> L125
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L125
            r10.a(r0)     // Catch: java.lang.Throwable -> L125
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r10.a(r0)     // Catch: java.lang.Throwable -> L125
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L125
            r0.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = r9.getPackageName()     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = r9.getPackageName()     // Catch: java.lang.Throwable -> L125
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L125
            r6.<init>()     // Catch: java.lang.Throwable -> L125
            r6.append(r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = ".plugin.location.ui.RedirectUI"
            r6.append(r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L125
            r0.setClassName(r3, r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "map_view_type"
            r5 = 8
            r0.putExtra(r3, r5)     // Catch: java.lang.Throwable -> L125
            r3 = 1212371549(0x4843525d, float:200009.45)
            r9.startActivityForResult(r0, r3)     // Catch: java.lang.Throwable -> L109
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L109
            goto L110
        L109:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L125
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L125
            r0 = r3
        L110:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L125
            if (r0 == 0) goto L136
            wb.zo r3 = wb.zo.f20688a     // Catch: java.lang.Throwable -> L125
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L125
            wb.zo.f20690c = r1     // Catch: java.lang.Throwable -> L133
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L125
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L125
            if (r0 != 0) goto L127
            java.lang.String r0 = ""
            goto L127
        L125:
            r0 = move-exception
            goto L13a
        L127:
            java.lang.String r0 = r4.concat(r0)     // Catch: java.lang.Throwable -> L125
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r2)     // Catch: java.lang.Throwable -> L125
            r0.show()     // Catch: java.lang.Throwable -> L125
            goto L136
        L133:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L133
            throw r0     // Catch: java.lang.Throwable -> L125
        L136:
            monitor-exit(r10)
        L137:
            sf.n r0 = sf.n.f12433a
            return r0
        L13a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L125
            throw r0
        L13c:
            android.content.Context r0 = r12.f20127h
            i0.a1 r2 = r12.f20129j
            i0.a1 r3 = r12.f20130k
            android.content.SharedPreferences r4 = r12.f20128i
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            java.lang.Object r2 = r3.getValue()
            r9 = r2
            java.util.Set r9 = (java.util.Set) r9
            wb.me r10 = new wb.me
            r2 = 23
            r10.<init>(r4, r3, r2)
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L163
            android.app.Activity r0 = (android.app.Activity) r0
            goto L164
        L163:
            r0 = r1
        L164:
            if (r0 == 0) goto L168
            r6 = r0
            goto L17a
        L168:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L173
            android.app.Activity r0 = r0.a()
            goto L174
        L173:
            r0 = r1
        L174:
            if (r0 == 0) goto L177
            r1 = r0
        L177:
            if (r1 == 0) goto L1a1
            r6 = r1
        L17a:
            if (r7 == 0) goto L17f
            java.lang.String r0 = "正在载入好友和非好友..."
            goto L181
        L17f:
            java.lang.String r0 = "正在载入好友列表..."
        L181:
            k.s1 r1 = new k.s1
            r2 = 25
            r1.<init>(r2)
            java.lang.String r2 = "设置排除名单"
            wb.kv r8 = wb.y2.X1(r6, r1, r2, r0)
            java.lang.Thread r0 = new java.lang.Thread
            ia.l r5 = new ia.l
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r1 = "Hchat-MomentsFakeLikeExclude"
            r0.<init>(r5, r1)
            r1 = 1
            r0.setDaemon(r1)
            r0.start()
        L1a1:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
