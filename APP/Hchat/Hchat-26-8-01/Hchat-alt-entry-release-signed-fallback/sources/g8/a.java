package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f4338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f4339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi f4340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f4341d;

    public a(android.content.Context r1, java.lang.ClassLoader r2, h.Hchat.hooks.api.runtime.WeChatDatabaseApi r3, i8.f r4) {
            r0 = this;
            r0.<init>()
            r0.f4338a = r1
            r0.f4339b = r2
            r0.f4340c = r3
            return
    }

    public final java.lang.String a(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "com.tencent.mm.sdk.platformtools.MMApplicationContext"
            java.lang.ClassLoader r2 = r5.f4339b     // Catch: java.lang.Throwable -> L35
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "getSharedPreferences"
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4}     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeStaticMethod(r1, r2, r4)     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L21
            android.content.Context r1 = r5.f4338a     // Catch: java.lang.Throwable -> L35
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r6, r3)     // Catch: java.lang.Throwable -> L35
        L21:
            if (r1 != 0) goto L24
            goto L35
        L24:
            java.lang.String r6 = "getString"
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r6, r7)     // Catch: java.lang.Throwable -> L35
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L35
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L35
            return r6
        L35:
            return r0
    }

    public final java.lang.String b(int r5) {
            r4 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r4.f4340c     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "SELECT value FROM userinfo WHERE id=?"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "value"
            java.lang.String r5 = r0.queryFirstString(r1, r2, r3)     // Catch: java.lang.Throwable -> L13
            return r5
        L13:
            r0 = move-exception
            java.lang.String r1 = "读取账号字段失败: "
            java.lang.String r2 = " "
            java.lang.StringBuilder r5 = eh.a.t(r5, r1, r2)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "[WeChatAccountApi] "
            java.lang.String r5 = r0.concat(r5)
            i8.i.f(r5)
            java.lang.String r5 = ""
            return r5
    }

    public final java.lang.String c() {
            r5 = this;
            java.lang.String r0 = r5.f4341d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r5.f4341d
            return r0
        Lb:
            r0 = 2
            java.lang.String r0 = r5.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L50
            java.lang.String r0 = "notify_key_pref_no_account"
            java.lang.String r1 = "login_weixin_username"
            java.lang.String r0 = r5.a(r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L2b
            java.lang.String r0 = r0.trim()
            goto L50
        L2b:
            java.lang.String r0 = "login_username"
            java.lang.String r3 = "last_login_username"
            java.lang.String r4 = "login_user_name"
            java.lang.String[] r0 = new java.lang.String[]{r1, r4, r0, r3}
            r1 = 0
        L36:
            r3 = 4
            if (r1 >= r3) goto L4f
            r3 = r0[r1]
            java.lang.String r4 = "login_info"
            java.lang.String r3 = r5.a(r4, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L4c
            java.lang.String r0 = r3.trim()
            goto L50
        L4c:
            int r1 = r1 + 1
            goto L36
        L4f:
            r0 = r2
        L50:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8e
            r0 = 42
            java.lang.String r0 = r5.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8d
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r5.f4340c
            java.lang.String r3 = "SELECT username FROM rcontact WHERE alias=? AND username!='' AND username NOT LIKE '%@chatroom' AND username NOT LIKE '%@im.chatroom' LIMIT 1"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "username"
            java.lang.String r2 = r1.queryFirstString(r3, r0, r4)     // Catch: java.lang.Throwable -> L71
            goto L8d
        L71:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "通过微信号反查自身wxid失败: "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "[WeChatAccountApi] "
            java.lang.String r0 = r1.concat(r0)
            i8.i.f(r0)
        L8d:
            r0 = r2
        L8e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L96
            r5.f4341d = r0
        L96:
            return r0
    }
}
