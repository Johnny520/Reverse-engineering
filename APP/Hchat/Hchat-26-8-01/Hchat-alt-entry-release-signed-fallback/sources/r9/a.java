package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r9.d0 f11633e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "hchat_extra"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r9) {
            r8 = this;
            r9.getClass()
            android.content.Context r9 = r9.f11620a
            java.lang.Class<r9.e0> r0 = r9.e0.class
            monitor-enter(r0)
            java.lang.String r1 = "Hchat_wekit_port_config"
            android.content.SharedPreferences r1 = ub.b.c(r9, r1)     // Catch: java.lang.Throwable -> L5b
            java.util.Map r2 = r1.getAll()     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L1b
            monitor-exit(r0)
            goto Lcb
        L1b:
            java.lang.String r3 = "Hchat_extra_config"
            android.content.SharedPreferences r9 = ub.b.c(r9, r3)     // Catch: java.lang.Throwable -> L5b
            java.util.Map r3 = r9.getAll()     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto Lbf
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L5b
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
        L37:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto Lbc
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5b
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L5b
            r9.putBoolean(r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L37
        L5b:
            r9 = move-exception
            goto L10c
        L5e:
            boolean r5 = r3 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L6c
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L5b
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L5b
            r9.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L37
        L6c:
            boolean r5 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L7a
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L5b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L5b
            r9.putInt(r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L37
        L7a:
            boolean r5 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L88
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L5b
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> L5b
            r9.putLong(r4, r5)     // Catch: java.lang.Throwable -> L5b
            goto L37
        L88:
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L92
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5b
            r9.putString(r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L37
        L92:
            boolean r5 = r3 instanceof java.util.Set     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L37
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L5b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L5b
        La1:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto Lb3
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L5b
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto La1
            r5.add(r6)     // Catch: java.lang.Throwable -> L5b
            goto La1
        Lb3:
            java.util.Set r3 = tf.m.U1(r5)     // Catch: java.lang.Throwable -> L5b
            r9.putStringSet(r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L37
        Lbc:
            r9.apply()     // Catch: java.lang.Throwable -> L5b
        Lbf:
            android.content.SharedPreferences$Editor r9 = r1.edit()     // Catch: java.lang.Throwable -> L5b
            android.content.SharedPreferences$Editor r9 = r9.clear()     // Catch: java.lang.Throwable -> L5b
            r9.apply()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
        Lcb:
            ha.k0 r9 = new ha.k0
            java.lang.String r0 = "hchat_message_time"
            java.lang.String r1 = "消息显示时间"
            java.lang.String r2 = "在聊天消息旁显示时间、类型等详情"
            java.lang.String r3 = "practical"
            r9.<init>(r0, r1, r2, r3)
            r8.h(r9)
            ha.k0 r9 = new ha.k0
            java.lang.String r0 = "hchat_group_member_history"
            java.lang.String r1 = "历史发言记录"
            java.lang.String r2 = "在群成员资料页查看历史发言记录"
            java.lang.String r3 = "practical"
            r9.<init>(r0, r1, r2, r3)
            r8.h(r9)
            ha.k0 r9 = new ha.k0
            java.lang.String r0 = "hchat_red_packet_details"
            java.lang.String r1 = "红包显示详情"
            java.lang.String r2 = "红包详情页显示金额、个数和领取时间"
            java.lang.String r3 = "practical"
            r9.<init>(r0, r1, r2, r3)
            r8.h(r9)
            ha.k0 r9 = new ha.k0
            java.lang.String r0 = "hchat_skip_web_risk"
            java.lang.String r1 = "跳过网页风险"
            java.lang.String r2 = "跳过微信 WebView 高风险网页拦截提示"
            java.lang.String r3 = "practical"
            r9.<init>(r0, r1, r2, r3)
            r8.h(r9)
            return
        L10c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r9
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            r9.d0 r0 = new r9.d0
            ia.t r1 = new ia.t
            java.lang.Class<r9.a> r2 = r9.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 20
            r2 = 2
            java.lang.String r5 = "logError"
            java.lang.String r6 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f11633e = r0
            i.e0 r11 = new i.e0
            r0 = 15
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "hchat_extra"
            java.lang.String r2 = "分支扩展功能"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            q9.a r11 = new q9.a
            r0 = 2
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "分支扩展功能"
            return r0
    }
}
