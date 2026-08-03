package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_auto_comment"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "按好友、内容和时间规则自动评论"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "moments_auto_comment"
            java.lang.String r3 = "朋友圈自动评论"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ha.d r1 = new ha.d
            ab.b r2 = new ab.b
            java.lang.Class<ha.a> r0 = ha.a.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 15
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            android.content.SharedPreferences r12 = r1.f5177b
            java.lang.String r0 = "comment_success_records"
            java.lang.String r2 = ""
            java.lang.String r12 = r12.getString(r0, r2)
            if (r12 != 0) goto L2b
            java.lang.String r12 = ""
        L2b:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r12 = r1.f5179d     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L6c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L4b
            r3 = 0
        L38:
            if (r3 < r2) goto L3c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L6c
            goto L6c
        L3c:
            org.json.JSONObject r4 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L4d
            java.lang.String r5 = "id"
            java.lang.String r4 = r4.optString(r5)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L4d
            goto L51
        L4b:
            r0 = move-exception
            goto L6a
        L4d:
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> L4b
        L51:
            r4.getClass()     // Catch: java.lang.Throwable -> L4b
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4b
            boolean r5 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L4b
            if (r5 != 0) goto L67
            java.util.LinkedHashSet r5 = r1.f5182g     // Catch: java.lang.Throwable -> L4b
            r5.add(r4)     // Catch: java.lang.Throwable -> L4b
        L67:
            int r3 = r3 + 1
            goto L38
        L6a:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            boolean r12 = r1.f5184i
            if (r12 == 0) goto L94
            android.content.SharedPreferences r12 = r1.f5177b
            java.lang.String r0 = "comment_enabled_at_seconds"
            r2 = 0
            long r4 = r12.getLong(r0, r2)
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 > 0) goto L94
            android.content.SharedPreferences r12 = r1.f5177b
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r0 = "comment_enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r12 = r12.putLong(r0, r2)
            r12.apply()
        L94:
            android.content.SharedPreferences r12 = r1.f5177b
            b9.b r0 = r1.f5185j
            r12.registerOnSharedPreferenceChangeListener(r0)
            p8.d0 r12 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r12 == 0) goto Laa
            ha.c r0 = new ha.c
            r2 = 0
            r0.<init>(r1, r2)
            r12.n(r0)
        Laa:
            o8.d r12 = h.Hchat.hooks.api.core.WeChatApis.databaseChanges()
            if (r12 == 0) goto Lb9
            g8.e r0 = new g8.e
            r2 = 3
            r0.<init>(r1, r2)
            r12.g(r0)
        Lb9:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈自动评论"
            return r0
    }
}
