package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_post_notification"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "指定好友发布朋友圈时提醒"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "moments_post_notification"
            java.lang.String r3 = "朋友圈发布通知"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ha.b0 r1 = new ha.b0
            ab.b r2 = new ab.b
            java.lang.Class<ha.a0> r0 = ha.a0.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 21
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            android.content.SharedPreferences r12 = r1.f5158c
            java.lang.String r0 = "enabled_at_seconds"
            r2 = 0
            long r4 = r12.getLong(r0, r2)
            android.content.SharedPreferences r12 = r1.f5158c
            java.lang.String r0 = "notified_ids"
            boolean r12 = r12.contains(r0)
            boolean r0 = r1.f5164i
            if (r0 == 0) goto L65
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L39
            if (r12 != 0) goto L65
        L39:
            java.util.LinkedHashSet r12 = r1.f5161f
            monitor-enter(r12)
            java.util.LinkedHashSet r0 = r1.f5161f     // Catch: java.lang.Throwable -> L62
            r0.clear()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r12)
            android.content.SharedPreferences r12 = r1.f5158c
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r0 = "enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r12 = r12.putLong(r0, r2)
            java.lang.String r0 = "notified_ids"
            java.lang.String r2 = "[]"
            android.content.SharedPreferences$Editor r12 = r12.putString(r0, r2)
            r12.apply()
            goto Le0
        L62:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L65:
            if (r0 == 0) goto Le0
            android.content.SharedPreferences r12 = r1.f5158c
            java.lang.String r0 = "notified_ids"
            java.lang.String r2 = ""
            java.lang.String r12 = r12.getString(r0, r2)
            if (r12 != 0) goto L75
            java.lang.String r12 = ""
        L75:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L8a
            uf.c r12 = a.a.E()     // Catch: java.lang.Throwable -> L8a
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L8a
            r3 = 0
        L83:
            if (r3 < r2) goto L8d
            uf.c r12 = a.a.t(r12)     // Catch: java.lang.Throwable -> L8a
            goto Lb2
        L8a:
            r0 = move-exception
            r12 = r0
            goto Lac
        L8d:
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> L8a
            r4.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            boolean r5 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L8a
            if (r5 != 0) goto La3
            goto La4
        La3:
            r4 = 0
        La4:
            if (r4 == 0) goto La9
            r12.add(r4)     // Catch: java.lang.Throwable -> L8a
        La9:
            int r3 = r3 + 1
            goto L83
        Lac:
            sf.f r0 = new sf.f
            r0.<init>(r12)
            r12 = r0
        Lb2:
            tf.t r0 = tf.t.f13167g
            boolean r2 = r12 instanceof sf.f
            if (r2 == 0) goto Lb9
            r12 = r0
        Lb9:
            java.util.List r12 = (java.util.List) r12
            java.util.LinkedHashSet r2 = r1.f5161f
            monitor-enter(r2)
            java.util.LinkedHashSet r0 = r1.f5161f     // Catch: java.lang.Throwable -> Ld9
            r0.clear()     // Catch: java.lang.Throwable -> Ld9
            java.util.LinkedHashSet r0 = r1.f5161f     // Catch: java.lang.Throwable -> Ld9
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Ld9
        Lc9:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ld9
            r0.add(r3)     // Catch: java.lang.Throwable -> Ld9
            goto Lc9
        Ld9:
            r0 = move-exception
            r12 = r0
            goto Lde
        Ldc:
            monitor-exit(r2)
            goto Le0
        Lde:
            monitor-exit(r2)
            throw r12
        Le0:
            android.content.SharedPreferences r12 = r1.f5158c
            b9.b r0 = r1.f5165j
            r12.registerOnSharedPreferenceChangeListener(r0)
            p8.d0 r12 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r12 == 0) goto Lf6
            ha.c r0 = new ha.c
            r2 = 3
            r0.<init>(r1, r2)
            r12.n(r0)
        Lf6:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈发布通知"
            return r0
    }
}
