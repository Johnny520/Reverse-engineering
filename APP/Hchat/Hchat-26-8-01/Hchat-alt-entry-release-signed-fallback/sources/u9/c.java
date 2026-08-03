package u9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u9.b f13539f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.Map f13540g = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u9.h f13541e;

    static {
            u9.b r0 = new u9.b
            r0.<init>()
            u9.c.f13539f = r0
            java.util.Map r0 = p.a.p()
            u9.c.f13540g = r0
            return
    }

    public static final void k(android.content.Context r11, java.lang.ClassLoader r12) {
            u9.b r2 = u9.c.f13539f
            if (r12 != 0) goto L5
            return
        L5:
            java.util.Map r9 = u9.c.f13540g
            r9.getClass()
            monitor-enter(r9)
            java.lang.Object r0 = r9.get(r12)     // Catch: java.lang.Throwable -> L42
            u9.h r0 = (u9.h) r0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L14
            goto L3c
        L14:
            u9.h r10 = new u9.h     // Catch: java.lang.Throwable -> L42
            ia.t r0 = new ia.t     // Catch: java.lang.Throwable -> L42
            java.lang.Class<u9.b> r1 = u9.b.class
            gg.f r1 = gg.v.a(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Class r3 = r1.a()     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r8 = 23
            r1 = 2
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L42
            r1 = 0
            r10.<init>(r11, r12, r1, r0)     // Catch: java.lang.Throwable -> L42
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Throwable -> L42
            r11.put(r12, r10)     // Catch: java.lang.Throwable -> L42
            r0 = r10
        L3c:
            monitor-exit(r9)
            r11 = 0
            r0.f(r11)
            return
        L42:
            r0 = move-exception
            r11 = r0
            monitor-exit(r9)
            throw r11
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "hide_wechat_bottom_bar"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "隐藏微信首页底部的微信、通讯录、发现和我"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "hide_wechat_bottom_bar"
            java.lang.String r3 = "隐藏微信底栏"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            u9.b r2 = u9.c.f13539f
            java.lang.ClassLoader r0 = r12.f11622c
            java.util.Map r9 = u9.c.f13540g
            r9.getClass()
            monitor-enter(r9)
            java.lang.Object r0 = r9.remove(r0)     // Catch: java.lang.Throwable -> L74
            u9.h r0 = (u9.h) r0     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L1f
            c9.f r1 = new c9.f     // Catch: java.lang.Throwable -> L74
            r2 = 8
            r1.<init>(r12, r2)     // Catch: java.lang.Throwable -> L74
            r0.f13554c = r1     // Catch: java.lang.Throwable -> L74
            goto L4a
        L1f:
            u9.h r10 = new u9.h     // Catch: java.lang.Throwable -> L74
            ia.t r0 = new ia.t     // Catch: java.lang.Throwable -> L74
            java.lang.Class<u9.b> r1 = u9.b.class
            gg.f r1 = gg.v.a(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.Class r3 = r1.a()     // Catch: java.lang.Throwable -> L74
            r3.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r8 = 24
            r1 = 2
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L74
            android.content.Context r1 = r12.f11620a     // Catch: java.lang.Throwable -> L74
            java.lang.ClassLoader r2 = r12.f11622c     // Catch: java.lang.Throwable -> L74
            c9.f r3 = new c9.f     // Catch: java.lang.Throwable -> L74
            r4 = 7
            r3.<init>(r12, r4)     // Catch: java.lang.Throwable -> L74
            r10.<init>(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L74
            r0 = r10
        L4a:
            monitor-exit(r9)
            r11.f13541e = r0
            r12 = 0
            boolean r12 = r0.f(r12)
            r0 = 1
            if (r12 != r0) goto L56
            goto L67
        L56:
            java.lang.String r12 = "hide_wechat_bottom_bar"
            java.lang.String r0 = "隐藏微信底栏"
            i.e0 r1 = new i.e0
            r2 = 29
            r1.<init>(r11, r2)
            r2 = 12
            r3 = 0
            r8.e.f(r2, r1, r12, r0, r3)
        L67:
            java.lang.Class<f8.e> r12 = f8.e.class
            q9.a r0 = new q9.a
            r1 = 9
            r0.<init>(r11, r1)
            r11.i(r12, r0)
            return
        L74:
            r0 = move-exception
            r12 = r0
            monitor-exit(r9)
            throw r12
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "隐藏微信底栏"
            return r0
    }
}
