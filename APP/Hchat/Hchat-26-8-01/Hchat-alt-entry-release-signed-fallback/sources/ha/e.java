package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_auto_forward"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "按好友和内容规则静默转发朋友圈"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "moments_auto_forward"
            java.lang.String r3 = "朋友圈自动转发"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ha.h r1 = new ha.h
            ab.b r2 = new ab.b
            java.lang.Class<ha.e> r0 = ha.e.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 16
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            android.content.SharedPreferences r12 = r1.f5214b
            java.lang.String r0 = "handled_ids"
            java.lang.String r2 = "[]"
            java.lang.String r12 = r12.getString(r0, r2)
            if (r12 != 0) goto L2b
            java.lang.String r12 = ""
        L2b:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L43
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r1.f5218f     // Catch: java.lang.Throwable -> L43
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashSet r2 = r1.f5220h     // Catch: java.lang.Throwable -> L65
            r2.clear()     // Catch: java.lang.Throwable -> L65
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L65
            r3 = 0
        L3d:
            if (r3 < r2) goto L46
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L43
            sf.n r12 = sf.n.f12433a     // Catch: java.lang.Throwable -> L43
            goto L72
        L43:
            r0 = move-exception
            r12 = r0
            goto L6c
        L46:
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> L65
            r4.getClass()     // Catch: java.lang.Throwable -> L65
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L65
            boolean r5 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            if (r4 == 0) goto L67
            java.util.LinkedHashSet r5 = r1.f5220h     // Catch: java.lang.Throwable -> L65
            r5.add(r4)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r0 = move-exception
            goto L6a
        L67:
            int r3 = r3 + 1
            goto L3d
        L6a:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L6c:
            sf.f r0 = new sf.f
            r0.<init>(r12)
            r12 = r0
        L72:
            java.lang.Throwable r12 = sf.g.b(r12)
            if (r12 == 0) goto L8d
            java.lang.Object r2 = r1.f5218f
            monitor-enter(r2)
            java.util.LinkedHashSet r0 = r1.f5220h     // Catch: java.lang.Throwable -> L89
            r0.clear()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r2)
            ab.b r0 = r1.f5213a
            java.lang.String r2 = "读取朋友圈自动转发去重记录失败"
            r0.invoke(r2, r12)
            goto L8d
        L89:
            r0 = move-exception
            r12 = r0
            monitor-exit(r2)
            throw r12
        L8d:
            java.lang.Object r12 = r1.f5217e
            monitor-enter(r12)
            boolean r0 = r1.f5222j     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb9
            long r2 = r1.f5223k     // Catch: java.lang.Throwable -> Lb4
            r4 = 1
            long r2 = r2 + r4
            r1.f5223k = r2     // Catch: java.lang.Throwable -> Lb4
            android.content.SharedPreferences r0 = r1.f5214b     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "enabled_at_seconds"
            r3 = 0
            long r5 = r0.getLong(r2, r3)     // Catch: java.lang.Throwable -> Lb4
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            android.content.SharedPreferences r0 = r1.f5214b     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "handled_ids"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto Lb9
            goto Lb6
        Lb4:
            r0 = move-exception
            goto Le0
        Lb6:
            r1.a()     // Catch: java.lang.Throwable -> Lb4
        Lb9:
            monitor-exit(r12)
            android.content.SharedPreferences r12 = r1.f5214b
            b9.b r0 = r1.f5224l
            r12.registerOnSharedPreferenceChangeListener(r0)
            p8.d0 r12 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r12 == 0) goto Ld0
            ha.c r0 = new ha.c
            r2 = 1
            r0.<init>(r1, r2)
            r12.n(r0)
        Ld0:
            o8.d r12 = h.Hchat.hooks.api.core.WeChatApis.databaseChanges()
            if (r12 == 0) goto Ldf
            g8.e r0 = new g8.e
            r2 = 4
            r0.<init>(r1, r2)
            r12.g(r0)
        Ldf:
            return
        Le0:
            monitor-exit(r12)
            throw r0
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈自动转发"
            return r0
    }
}
