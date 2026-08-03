package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f4465a = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            gb.q.f4465a = r0
            return
    }

    public static java.lang.Object a(android.content.Context r6) {
            r6.getClass()
            g8.a r6 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto Lc8
            java.lang.String r0 = r6.c()     // Catch: java.lang.Throwable -> Ld0
            r0.getClass()     // Catch: java.lang.Throwable -> Ld0
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld0
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> Ld0
            if (r1 != 0) goto Lc0
            r1 = 0
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            h.Hchat.hooks.api.model.WeChatContact r2 = r2.n(r0)     // Catch: java.lang.Throwable -> L2a
            goto L34
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = r1
            goto L34
        L2e:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> Ld0
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Ld0
            r2 = r3
        L34:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> Ld0
            if (r3 == 0) goto L3a
            r2 = r1
        L3a:
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2     // Catch: java.lang.Throwable -> Ld0
            r3 = 42
            java.lang.String r3 = r6.b(r3)     // Catch: java.lang.Throwable -> Ld0
            r3.getClass()     // Catch: java.lang.Throwable -> Ld0
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = og.m.t0(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = ""
            if (r4 == 0) goto L66
            if (r2 == 0) goto L5a
            java.lang.String r3 = r2.customWxId     // Catch: java.lang.Throwable -> Ld0
            goto L5b
        L5a:
            r3 = r1
        L5b:
            if (r3 != 0) goto L5e
            r3 = r5
        L5e:
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
        L66:
            r4 = 4
            java.lang.String r6 = r6.b(r4)     // Catch: java.lang.Throwable -> Ld0
            r6.getClass()     // Catch: java.lang.Throwable -> Ld0
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = og.m.t0(r6)     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto L8c
            if (r2 == 0) goto L80
            java.lang.String r1 = r2.nickname     // Catch: java.lang.Throwable -> Ld0
        L80:
            if (r1 != 0) goto L83
            goto L84
        L83:
            r5 = r1
        L84:
            java.lang.CharSequence r6 = og.m.R0(r5)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld0
        L8c:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ld0
            r2 = 128(0x80, float:1.8E-43)
            if (r1 > r2) goto Lb8
            int r1 = r3.length()     // Catch: java.lang.Throwable -> Ld0
            if (r1 > r2) goto Lb0
            int r1 = r6.length()     // Catch: java.lang.Throwable -> Ld0
            r2 = 100
            if (r1 > r2) goto La8
            gb.s r1 = new gb.s     // Catch: java.lang.Throwable -> Ld0
            r1.<init>(r0, r3, r6)     // Catch: java.lang.Throwable -> Ld0
            goto Ld6
        La8:
            java.lang.String r6 = "当前账号微信昵称过长"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Lb0:
            java.lang.String r6 = "当前账号微信号长度异常"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Lb8:
            java.lang.String r6 = "当前账号 wxid 长度异常"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Lc0:
            java.lang.String r6 = "无法读取当前账号 wxid，请重启微信后重试"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Lc8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "当前微信账号资料尚未就绪，请重启微信后重试"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Ld0
            throw r6     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
        Ld6:
            return r1
    }

    public static gb.c b(org.json.JSONObject r8) {
            gb.c r0 = new gb.c
            java.lang.String r1 = "commentId"
            java.lang.String r1 = wb.en.j(r1, r8)
            java.lang.String r2 = "pluginId"
            java.lang.String r2 = wb.en.j(r2, r8)
            java.lang.String r3 = "userNickname"
            java.lang.String r3 = wb.en.j(r3, r8)
            java.lang.String r4 = "content"
            java.lang.String r4 = r8.optString(r4)
            r4.getClass()
            java.lang.String r5 = "createdAt"
            java.lang.String r5 = r8.optString(r5)
            r5.getClass()
            java.lang.String r6 = "canDelete"
            r7 = 0
            boolean r6 = r8.optBoolean(r6, r7)
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static gb.o c(org.json.JSONObject r22) {
            r1 = r22
            java.lang.String r0 = "latestVersion"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            if (r0 == 0) goto Lc
        La:
            r2 = r0
            goto L13
        Lc:
            java.lang.String r0 = "snapshot"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            goto La
        L13:
            java.lang.String r0 = "files"
            org.json.JSONArray r3 = r1.optJSONArray(r0)
            java.lang.String r4 = "name"
            java.lang.String r5 = ""
            if (r3 == 0) goto Lc5
            uf.c r6 = a.a.E()
            int r7 = r3.length()
            r0 = 0
            r8 = r0
        L29:
            if (r8 < r7) goto L35
            uf.c r0 = a.a.t(r6)
            if (r0 == 0) goto Lc5
        L31:
            r21 = r0
            goto Lc9
        L35:
            org.json.JSONObject r9 = r3.optJSONObject(r8)
            if (r9 == 0) goto Lc1
            java.lang.String r0 = r9.optString(r4)
            boolean r10 = og.m.t0(r0)
            if (r10 == 0) goto L47
            r12 = r5
            goto L48
        L47:
            r12 = r0
        L48:
            java.lang.String r0 = "text"
            java.lang.String r0 = r9.optString(r0)
            java.lang.String r10 = "content"
            java.lang.String r13 = r9.optString(r10, r0)
            java.lang.String r0 = "encoding"
            java.lang.String r10 = "utf8"
            java.lang.String r0 = bc.e.l(r0, r10, r9)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r15 = r0.toLowerCase(r10)
            r15.getClass()
            java.lang.String r0 = "base64"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L77
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r13, r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75
        L73:
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L75
            goto L85
        L75:
            r0 = move-exception
            goto L8a
        L77:
            r13.getClass()     // Catch: java.lang.Throwable -> L75
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L75
            byte[] r0 = r13.getBytes(r0)     // Catch: java.lang.Throwable -> L75
            r0.getClass()     // Catch: java.lang.Throwable -> L75
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75
            goto L73
        L85:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L75
            goto L90
        L8a:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L90:
            r10 = -1
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r11 = r0 instanceof sf.f
            if (r11 == 0) goto L9b
            r0 = r10
        L9b:
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            java.lang.String r0 = "size"
            long r16 = r9.optLong(r0, r10)
            gb.g r11 = new gb.g
            r13.getClass()
            java.lang.String r0 = "sha256"
            java.lang.String r0 = wb.en.j(r0, r9)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r14 = r0.toLowerCase(r9)
            r14.getClass()
            r11.<init>(r12, r13, r14, r15, r16)
            r6.add(r11)
        Lc1:
            int r8 = r8 + 1
            goto L29
        Lc5:
            tf.t r0 = tf.t.f13167g
            goto L31
        Lc9:
            java.lang.String r0 = "remotePluginId"
            java.lang.String r0 = r1.optString(r0)
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto Ldb
            java.lang.String r0 = "pluginId"
            java.lang.String r0 = r1.optString(r0)
        Ldb:
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto Le7
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.optString(r0)
        Le7:
            r7 = r0
            r7.getClass()
            java.lang.String r0 = "sourcePluginId"
            java.lang.String r8 = r1.optString(r0)
            r8.getClass()
            java.lang.String r0 = "displayName"
            java.lang.String r0 = r1.optString(r0)
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L104
            java.lang.String r0 = r1.optString(r4)
        L104:
            r9 = r0
            r9.getClass()
            java.lang.String r0 = "author"
            java.lang.String r10 = r1.optString(r0)
            r10.getClass()
            r0 = 0
            if (r2 == 0) goto L11b
            java.lang.String r3 = "versionName"
            java.lang.String r3 = r2.optString(r3)
            goto L11c
        L11b:
            r3 = r0
        L11c:
            if (r3 != 0) goto L11f
            r3 = r5
        L11f:
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L12b
            java.lang.String r3 = "version"
            java.lang.String r3 = r1.optString(r3)
        L12b:
            r11 = r3
            r11.getClass()
            java.lang.String r3 = "versionId"
            if (r2 == 0) goto L138
            java.lang.String r4 = r2.optString(r3)
            goto L139
        L138:
            r4 = r0
        L139:
            if (r4 != 0) goto L13c
            r4 = r5
        L13c:
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto L146
            java.lang.String r4 = r1.optString(r3)
        L146:
            r12 = r4
            r12.getClass()
            if (r2 == 0) goto L152
            java.lang.String r0 = "createdAt"
            java.lang.String r0 = r2.optString(r0)
        L152:
            if (r0 != 0) goto L155
            goto L156
        L155:
            r5 = r0
        L156:
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L162
            java.lang.String r0 = "updatedAt"
            java.lang.String r5 = r1.optString(r0)
        L162:
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L16e
            java.lang.String r0 = "updateTime"
            java.lang.String r5 = r1.optString(r0)
        L16e:
            r13 = r5
            r13.getClass()
            java.lang.String r0 = "downloadCount"
            r2 = 0
            long r4 = r1.optLong(r0, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L180
            r14 = r2
            goto L181
        L180:
            r14 = r4
        L181:
            java.lang.String r0 = "likeCount"
            long r4 = r1.optLong(r0, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L18e
            r16 = r2
            goto L190
        L18e:
            r16 = r4
        L190:
            java.lang.String r0 = "commentCount"
            long r4 = r1.optLong(r0, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L19d
            r18 = r2
            goto L19f
        L19d:
            r18 = r4
        L19f:
            java.lang.String r0 = "summary"
            java.lang.String r0 = r1.optString(r0)
            java.lang.String r2 = "description"
            java.lang.String r20 = r1.optString(r2, r0)
            r20.getClass()
            gb.o r6 = new gb.o
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20, r21)
            return r6
    }

    public static java.lang.String d(android.content.Context r5) {
            r5.getClass()
            java.lang.Object r0 = gb.q.f4465a
            monitor-enter(r0)
            android.content.SharedPreferences r5 = h(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "install_id"
            r2 = 0
            java.lang.String r1 = r5.getString(r1, r2)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            boolean r3 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L24
            r2 = r1
        L24:
            if (r2 == 0) goto L2a
            monitor-exit(r0)
            return r2
        L28:
            r5 = move-exception
            goto L58
        L2a:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r1.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "-"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r1 = og.t.a0(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "install_id"
            android.content.SharedPreferences$Editor r5 = r5.putString(r2, r1)     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.commit()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L50
            monitor-exit(r0)
            return r1
        L50:
            java.lang.String r5 = "保存插件仓库 installId 失败"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L58:
            monitor-exit(r0)
            throw r5
    }

    public static gb.m e(android.content.Context r5, java.lang.String r6) {
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            boolean r0 = og.m.t0(r6)
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            java.lang.Object r0 = gb.q.f4465a
            monitor-enter(r0)
            org.json.JSONObject r5 = g(r5)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r5.keys()     // Catch: java.lang.Throwable -> L3b
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b
            org.json.JSONObject r3 = r5.optJSONObject(r3)     // Catch: java.lang.Throwable -> L3b
            gb.m r3 = f(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L1b
            java.lang.String r4 = r3.f4443a     // Catch: java.lang.Throwable -> L3b
            boolean r4 = gg.l.a(r4, r6)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L1b
            monitor-exit(r0)
            return r3
        L3b:
            r5 = move-exception
            goto L3f
        L3d:
            monitor-exit(r0)
            return r1
        L3f:
            monitor-exit(r0)
            throw r5
    }

    public static gb.m f(org.json.JSONObject r4) {
            r0 = 0
            if (r4 == 0) goto L14
            java.lang.String r1 = "remotePluginId"
            java.lang.String r1 = r4.optString(r1)
            if (r1 == 0) goto L14
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            goto L15
        L14:
            r1 = r0
        L15:
            java.lang.String r2 = ""
            if (r1 != 0) goto L1a
            r1 = r2
        L1a:
            if (r4 == 0) goto L2d
            java.lang.String r3 = "ownerToken"
            java.lang.String r4 = r4.optString(r3)
            if (r4 == 0) goto L2d
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            goto L2e
        L2d:
            r4 = r0
        L2e:
            if (r4 != 0) goto L31
            goto L32
        L31:
            r2 = r4
        L32:
            boolean r4 = og.m.t0(r1)
            if (r4 != 0) goto L47
            boolean r4 = og.m.t0(r2)
            if (r4 == 0) goto L3f
            goto L47
        L3f:
            gb.m r4 = new gb.m
            gb.p r0 = gb.p.f4463i
            r4.<init>(r1, r2, r0)
            return r4
        L47:
            return r0
    }

    public static org.json.JSONObject g(android.content.Context r2) {
            android.content.SharedPreferences r2 = h(r2)
            java.lang.String r0 = "ownerships"
            java.lang.String r1 = "{}"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto Lf
            r1 = r2
        Lf:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L1c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L26
            r2 = r0
        L26:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            return r2
    }

    public static android.content.SharedPreferences h(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto L7
            r1 = r0
        L7:
            java.lang.String r0 = "Hchat_script_plugin_market"
            android.content.SharedPreferences r1 = ub.b.c(r1, r0)
            return r1
    }

    public static void i(android.content.Context r2, java.lang.String r3) {
            r2.getClass()
            java.lang.Object r0 = gb.q.f4465a
            monitor-enter(r0)
            org.json.JSONObject r1 = g(r2)     // Catch: java.lang.Throwable -> L2f
            r1.remove(r3)     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences r2 = h(r2)     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "ownerships"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.commit()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L27
            monitor-exit(r0)
            return
        L27:
            java.lang.String r2 = "删除插件仓库归属信息失败"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static void j(android.content.Context r6, java.lang.String r7) {
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Object r0 = gb.q.f4465a
            monitor-enter(r0)
            org.json.JSONObject r1 = g(r6)     // Catch: java.lang.Throwable -> L2c
            uf.c r2 = a.a.E()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r3 = r1.keys()     // Catch: java.lang.Throwable -> L2c
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2c
            r2.add(r4)     // Catch: java.lang.Throwable -> L2c
            goto L1e
        L2c:
            r6 = move-exception
            goto L9a
        L2e:
            uf.c r2 = a.a.t(r2)     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            java.util.ListIterator r2 = r2.listIterator(r4)     // Catch: java.lang.Throwable -> L2c
        L3c:
            r4 = r2
            uf.a r4 = (uf.a) r4     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L64
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L2c
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch: java.lang.Throwable -> L2c
            gb.m r5 = f(r5)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L59
            java.lang.String r5 = r5.f4443a     // Catch: java.lang.Throwable -> L2c
            goto L5a
        L59:
            r5 = 0
        L5a:
            boolean r5 = gg.l.a(r5, r7)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L3c
            r3.add(r4)     // Catch: java.lang.Throwable -> L2c
            goto L3c
        L64:
            java.util.Iterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L2c
        L68:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L78
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2c
            r1.remove(r2)     // Catch: java.lang.Throwable -> L2c
            goto L68
        L78:
            android.content.SharedPreferences r6 = h(r6)     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = "ownerships"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r6 = r6.putString(r7, r1)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6.commit()     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L92
            monitor-exit(r0)
            return
        L92:
            java.lang.String r6 = "删除插件仓库归属信息失败"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            throw r7     // Catch: java.lang.Throwable -> L2c
        L9a:
            monitor-exit(r0)
            throw r6
    }

    public static void k(android.content.Context r5, java.lang.String r6, gb.m r7) {
            r5.getClass()
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L67
            java.lang.String r0 = r7.f4443a
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L61
            java.lang.String r0 = r7.f4444b
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L5b
            java.lang.Object r0 = gb.q.f4465a
            monitor-enter(r0)
            org.json.JSONObject r1 = g(r5)     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "remotePluginId"
            java.lang.String r4 = r7.f4443a     // Catch: java.lang.Throwable -> L58
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "ownerToken"
            java.lang.String r7 = r7.f4444b     // Catch: java.lang.Throwable -> L58
            r2.put(r3, r7)     // Catch: java.lang.Throwable -> L58
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences r5 = h(r5)     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "ownerships"
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences$Editor r5 = r5.putString(r6, r7)     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.commit()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L50
            monitor-exit(r0)
            return
        L50:
            java.lang.String r5 = "保存插件仓库归属信息失败"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L58
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L5b:
            java.lang.String r5 = "插件 ownerToken 不能为空"
            j8.o.t(r5)
            return
        L61:
            java.lang.String r5 = "远程插件 ID 不能为空"
            j8.o.t(r5)
            return
        L67:
            java.lang.String r5 = "本地插件 ID 不能为空"
            j8.o.t(r5)
            return
    }
}
