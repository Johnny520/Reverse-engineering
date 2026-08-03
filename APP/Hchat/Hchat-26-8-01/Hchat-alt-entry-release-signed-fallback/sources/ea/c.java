package ea;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f2483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f2484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f2485d;

    public c() {
            r2 = this;
            r2.<init>()
            l3.w r0 = new l3.w
            r1 = 18
            r0.<init>(r1)
            r2.f2482a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f2485d = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.f2483b = r0
            return
    }

    public c(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f2482a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_fake_scan_camera_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f2483b = r0
            java.lang.String r0 = "Hchat_fake_scan_camera_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f2485d = r2
            return
    }

    public c(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2482a = r1
            r0.f2485d = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_fake_mini_program_host_version_member_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f2483b = r1
            return
    }

    public c(r8.g r1, ab.b r2, byte r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2482a = r1
            r0.f2485d = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_upload_tail_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f2483b = r1
            return
    }

    public c(r8.g r1, ab.b r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2482a = r1
            r0.f2485d = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_skip_global_mini_program_splash_ads_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f2483b = r1
            return
    }

    public c(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2482a = r1
            r0.f2485d = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_fake_voice_duration_recorder_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f2483b = r1
            return
    }

    public static boolean b(java.lang.reflect.Constructor r7) {
            java.lang.Class[] r7 = r7.getParameterTypes()
            int r0 = r7.length
            r1 = 17
            r2 = 0
            if (r0 != r1) goto L99
            r0 = r7[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L99
            r0 = 1
            r3 = r7[r0]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L99
            r3 = 5
            r3 = r7[r3]
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L99
            r3 = 6
            r3 = r7[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L99
            r3 = 7
            r3 = r7[r3]
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "com.tencent.mm.plugin.appbrand.report.quality.QualitySession"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L99
            r3 = 8
            r3 = r7[r3]
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L99
            r3 = 9
            r3 = r7[r3]
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L99
            r3 = 10
            r3 = r7[r3]
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L99
            r3 = 12
            r3 = r7[r3]
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L99
            r3 = 13
            r3 = r7[r3]
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L99
            r3 = 14
            r3 = r7[r3]
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L99
            r1 = 15
            r1 = r7[r1]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L99
            r1 = 16
            r7 = r7[r1]
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L99
            return r0
        L99:
            return r2
    }

    public static boolean c(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            r1 = 0
            if (r3 == 0) goto L31
            int r3 = r0.length
            r2 = 15
            if (r3 == r2) goto L1b
            int r3 = r0.length
            r2 = 16
            if (r3 != r2) goto L31
        L1b:
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r2 = r0[r1]
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L31
            r3 = 1
            r0 = r0[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L31
            return r3
        L31:
            return r1
    }

    public synchronized boolean a(boolean r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f2484c     // Catch: java.lang.Throwable -> L48
            r1 = 1
            if (r0 == 0) goto L8
            monitor-exit(r7)
            return r1
        L8:
            java.util.List r8 = r7.f(r8)     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L48
            r0 = 0
            r2 = r0
        L12:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L48
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2e
            b9.e r5 = new b9.e     // Catch: java.lang.Throwable -> L2e
            r6 = 12
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L2e
            r4.b(r3, r5)     // Catch: java.lang.Throwable -> L2e
            r7.f2484c = r1     // Catch: java.lang.Throwable -> L2e
            r2 = r1
            goto L12
        L2e:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "[Hchat:FakeScanCamera] 安装 QBarStringHandler Hook 失败: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L48
            r5.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L48
            fb.v0.n(r4, r3)     // Catch: java.lang.Throwable -> L48
            goto L12
        L48:
            r8 = move-exception
            goto L54
        L4a:
            if (r2 != 0) goto L52
            boolean r8 = r7.f2484c     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            monitor-exit(r7)
            return r1
        L54:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L48
            throw r8
    }

    public java.lang.reflect.Constructor d() {
            r14 = this;
            java.lang.Object r0 = r14.f2485d
            r1 = r0
            ab.b r1 = (ab.b) r1
            java.lang.Object r0 = r14.f2482a
            r8.g r0 = (r8.g) r0
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r3 = r0.f11622c
            java.lang.String r2 = e8.b.g(r2, r3)
            java.lang.Object r4 = r14.f2483b
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r5 = "launch_wxa_app_constructor"
            java.lang.reflect.Constructor r6 = e8.b.d(r4, r2, r3, r5)
            r7 = 0
            if (r6 == 0) goto L29
            boolean r8 = b(r6)
            if (r8 == 0) goto L25
            goto L26
        L25:
            r6 = r7
        L26:
            if (r6 == 0) goto L29
            return r6
        L29:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L84
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = "MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122"
            java.lang.String r10 = "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> L84
            r8.r0(r9)     // Catch: java.lang.Throwable -> L84
            r6.f1666h = r8     // Catch: java.lang.Throwable -> L84
            hh.p r0 = r0.findMethod(r6)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L4f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L86
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L84
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L84
            boolean r9 = r0.t()     // Catch: java.lang.Throwable -> L84
            if (r9 != 0) goto L63
            r0 = r7
            goto L7e
        L63:
            r3.getClass()     // Catch: java.lang.Throwable -> L6f
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L6f
            java.lang.reflect.Constructor r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L84
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L84
            r0 = r9
        L76:
            boolean r9 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto L7c
            r0 = r7
        L7c:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Throwable -> L84
        L7e:
            if (r0 == 0) goto L4f
            r6.add(r0)     // Catch: java.lang.Throwable -> L84
            goto L4f
        L84:
            r0 = move-exception
            goto Lcf
        L86:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L84
        L8f:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r6 == 0) goto La6
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L84
            r8 = r6
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8     // Catch: java.lang.Throwable -> L84
            boolean r8 = b(r8)     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L8f
            r0.add(r6)     // Catch: java.lang.Throwable -> L84
            goto L8f
        La6:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        Lb4:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto Ld4
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L84
            r9 = r8
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L84
            boolean r9 = r3.add(r9)     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto Lb4
            r6.add(r8)     // Catch: java.lang.Throwable -> L84
            goto Lb4
        Lcf:
            sf.f r6 = new sf.f
            r6.<init>(r0)
        Ld4:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 != 0) goto Ldb
            goto Le2
        Ldb:
            java.lang.String r3 = "定位小程序启动请求构造器失败"
            r1.invoke(r3, r0)
            tf.t r6 = tf.t.f13167g
        Le2:
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = tf.m.I1(r8)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 == 0) goto Lf1
            e8.b.i(r4, r2, r5, r0)
            goto L130
        Lf1:
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r4.edit()     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = ""
            java.lang.String r4 = r4.getString(r3, r9)     // Catch: java.lang.Throwable -> L111
            boolean r4 = gg.l.a(r4, r2)     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto L10a
            android.content.SharedPreferences$Editor r4 = r6.clear()     // Catch: java.lang.Throwable -> L111
            r4.putString(r3, r2)     // Catch: java.lang.Throwable -> L111
        L10a:
            android.content.SharedPreferences$Editor r2 = r6.remove(r5)     // Catch: java.lang.Throwable -> L111
            r2.apply()     // Catch: java.lang.Throwable -> L111
        L111:
            int r2 = r8.size()
            r3 = 1
            if (r2 <= r3) goto L130
            e9.h r12 = new e9.h
            r2 = 5
            r12.<init>(r2)
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r2 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = "小程序启动请求构造器候选不唯一: "
            java.lang.String r2 = r3.concat(r2)
            r1.invoke(r2, r7)
        L130:
            return r0
    }

    public java.lang.reflect.Method e() {
            r14 = this;
            java.lang.Object r0 = r14.f2485d
            r1 = r0
            ab.b r1 = (ab.b) r1
            java.lang.Object r0 = r14.f2482a
            r8.g r0 = (r8.g) r0
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r3 = r0.f11622c
            java.lang.String r2 = e8.b.g(r2, r3)
            java.lang.Object r4 = r14.f2483b
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r5 = "private_open_url_method"
            java.lang.reflect.Method r6 = e8.b.c(r4, r2, r3, r5)
            r7 = 0
            if (r6 == 0) goto L29
            boolean r8 = x6.d.j(r6)
            if (r8 == 0) goto L25
            goto L26
        L25:
            r6 = r7
        L26:
            if (r6 == 0) goto L29
            return r6
        L29:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L7f
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L7f
            r6.<init>()     // Catch: java.lang.Throwable -> L7f
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L7f
            r8.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r9 = "private_openUrl"
            java.lang.String r10 = "rawUrl"
            java.lang.String r11 = "geta8key_open_webview_appid"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11}     // Catch: java.lang.Throwable -> L7f
            r8.r0(r9)     // Catch: java.lang.Throwable -> L7f
            r6.f1666h = r8     // Catch: java.lang.Throwable -> L7f
            hh.p r0 = r0.findMethod(r6)     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            r6.<init>()     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L7f
        L51:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L81
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L7f
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L7f
            boolean r9 = r0.t()     // Catch: java.lang.Throwable -> L7f
            if (r9 == 0) goto L65
            r0 = r7
            goto L79
        L65:
            java.lang.reflect.Method r0 = r0.r(r3)     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L7f
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            r0 = r9
        L71:
            boolean r9 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L7f
            if (r9 == 0) goto L77
            r0 = r7
        L77:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L7f
        L79:
            if (r0 == 0) goto L51
            r6.add(r0)     // Catch: java.lang.Throwable -> L7f
            goto L51
        L7f:
            r0 = move-exception
            goto Lca
        L81:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
        L8a:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto La1
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L7f
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L7f
            boolean r8 = x6.d.j(r8)     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L8a
            r0.add(r6)     // Catch: java.lang.Throwable -> L7f
            goto L8a
        La1:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7f
            r3.<init>()     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            r6.<init>()     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7f
        Laf:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto Lcf
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L7f
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L7f
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L7f
            boolean r9 = r3.add(r9)     // Catch: java.lang.Throwable -> L7f
            if (r9 == 0) goto Laf
            r6.add(r8)     // Catch: java.lang.Throwable -> L7f
            goto Laf
        Lca:
            sf.f r6 = new sf.f
            r6.<init>(r0)
        Lcf:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 != 0) goto Ld6
            goto Ldd
        Ld6:
            java.lang.String r3 = "定位小程序私有网页跳转方法失败"
            r1.invoke(r3, r0)
            tf.t r6 = tf.t.f13167g
        Ldd:
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = tf.m.I1(r8)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lec
            e8.b.h(r4, r2, r5, r0)
            goto L12b
        Lec:
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r4.edit()     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = ""
            java.lang.String r4 = r4.getString(r3, r9)     // Catch: java.lang.Throwable -> L10c
            boolean r4 = gg.l.a(r4, r2)     // Catch: java.lang.Throwable -> L10c
            if (r4 != 0) goto L105
            android.content.SharedPreferences$Editor r4 = r6.clear()     // Catch: java.lang.Throwable -> L10c
            r4.putString(r3, r2)     // Catch: java.lang.Throwable -> L10c
        L105:
            android.content.SharedPreferences$Editor r2 = r6.remove(r5)     // Catch: java.lang.Throwable -> L10c
            r2.apply()     // Catch: java.lang.Throwable -> L10c
        L10c:
            int r2 = r8.size()
            r3 = 1
            if (r2 <= r3) goto L12b
            e9.h r12 = new e9.h
            r2 = 4
            r12.<init>(r2)
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r2 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = "小程序私有网页跳转方法候选不唯一: "
            java.lang.String r2 = r3.concat(r2)
            r1.invoke(r2, r7)
        L12b:
            return r0
    }

    public java.util.List f(boolean r12) {
            r11 = this;
            java.lang.Object r0 = r11.f2485d
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r1 = r11.f2482a
            r8.g r1 = (r8.g) r1
            android.content.Context r2 = r1.f11620a
            java.lang.ClassLoader r3 = r1.f11622c
            r3.getClass()
            l8.i r2 = o8.k.a(r2, r3)
            java.lang.String r2 = r2.f7933h
            boolean r4 = og.m.t0(r2)
            r5 = 0
            if (r4 != 0) goto L1d
            goto L1e
        L1d:
            r2 = r5
        L1e:
            if (r2 == 0) goto L27
            java.lang.String r4 = "|fake_scan_camera_v5_eq_qbar_only"
            java.lang.String r2 = r2.concat(r4)
            goto L28
        L27:
            r2 = r5
        L28:
            java.lang.String r4 = ""
            if (r2 != 0) goto L2d
            r2 = r4
        L2d:
            java.lang.String r6 = "qbar_string_handler_methods"
            java.util.List r7 = e8.b.f(r0, r2, r3, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3c:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L53
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = c(r10)
            if (r10 == 0) goto L3c
            r8.add(r9)
            goto L3c
        L53:
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L5a
            goto L5b
        L5a:
            r8 = r5
        L5b:
            if (r8 == 0) goto L5e
            return r8
        L5e:
            tf.t r7 = tf.t.f13167g
            if (r12 != 0) goto L63
            return r7
        L63:
            java.lang.String r12 = "MicroMsg.QBarStringHandler"
            java.lang.String r8 = "key_offline_scan_show_tips"
            java.lang.String[] r12 = new java.lang.String[]{r12, r8}
            org.luckypray.dexkit.DexKitBridge r1 = r1.f11623d     // Catch: java.lang.Throwable -> La4
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> La4
            r8.<init>()     // Catch: java.lang.Throwable -> La4
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> La4
            r9.<init>()     // Catch: java.lang.Throwable -> La4
            r10 = 2
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r12, r10)     // Catch: java.lang.Throwable -> La4
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch: java.lang.Throwable -> La4
            r9.r0(r10)     // Catch: java.lang.Throwable -> La4
            r8.f1666h = r9     // Catch: java.lang.Throwable -> La4
            hh.p r1 = r1.findMethod(r8)     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            r8.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La4
        L90:
            boolean r9 = r1.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r9 == 0) goto Laa
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> La4
            hh.o r9 = (hh.o) r9     // Catch: java.lang.Throwable -> La4
            java.lang.reflect.Method r9 = r9.r(r3)     // Catch: java.lang.Throwable -> La4
            r8.add(r9)     // Catch: java.lang.Throwable -> La4
            goto L90
        La4:
            r1 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r1)
        Laa:
            java.lang.Throwable r1 = sf.g.b(r8)
            if (r1 != 0) goto Lb2
            r7 = r8
            goto Lc3
        Lb2:
            r3 = 63
            java.lang.String r12 = tf.l.F0(r12, r5, r3)
            java.lang.String r3 = r1.getMessage()
            java.lang.String r5 = "[Hchat:FakeScanCamera] 精确定位 QBarStringHandler 失败("
            java.lang.String r8 = "): "
            eh.a.w(r5, r12, r8, r3, r1)
        Lc3:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r7.iterator()
        Lce:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Le5
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = c(r5)
            if (r5 == 0) goto Lce
            r12.add(r3)
            goto Lce
        Le5:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        Lf3:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L10e
            java.lang.Object r5 = r12.next()
            r7 = r5
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = r7.toGenericString()
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto Lf3
            r3.add(r5)
            goto Lf3
        L10e:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L11a
            e8.b r12 = e8.b.f2358a
            r12.j(r0, r2, r6, r3)
            goto L138
        L11a:
            java.lang.String r12 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: java.lang.Throwable -> L138
            java.lang.String r0 = r0.getString(r12, r4)     // Catch: java.lang.Throwable -> L138
            boolean r0 = gg.l.a(r0, r2)     // Catch: java.lang.Throwable -> L138
            if (r0 != 0) goto L131
            android.content.SharedPreferences$Editor r0 = r1.clear()     // Catch: java.lang.Throwable -> L138
            r0.putString(r12, r2)     // Catch: java.lang.Throwable -> L138
        L131:
            android.content.SharedPreferences$Editor r12 = r1.remove(r6)     // Catch: java.lang.Throwable -> L138
            r12.apply()     // Catch: java.lang.Throwable -> L138
        L138:
            return r3
    }

    public java.lang.reflect.Method g() {
            r15 = this;
            java.lang.Object r0 = r15.f2485d
            r1 = r0
            ia.t r1 = (ia.t) r1
            java.lang.Object r0 = r15.f2482a
            r8.g r0 = (r8.g) r0
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r3 = r0.f11622c
            r3.getClass()
            l8.i r2 = o8.k.a(r2, r3)
            java.lang.String r2 = r2.f7933h
            java.lang.Object r4 = r15.f2483b
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r5 = "recorder_duration"
            java.lang.reflect.Method r6 = e8.b.c(r4, r2, r3, r5)
            java.lang.Class r7 = java.lang.Long.TYPE
            r8 = 0
            if (r6 == 0) goto L40
            boolean r9 = h.Hchat.utils.KavaReflector.isStatic(r6)
            if (r9 != 0) goto L3c
            int r9 = r6.getParameterCount()
            if (r9 != 0) goto L3c
            java.lang.Class r9 = r6.getReturnType()
            boolean r9 = gg.l.a(r9, r7)
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r8
        L3d:
            if (r6 == 0) goto L40
            return r6
        L40:
            r6 = 1
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L91
            ch.e r9 = new ch.e     // Catch: java.lang.Throwable -> L91
            r9.<init>()     // Catch: java.lang.Throwable -> L91
            fh.k r10 = new fh.k     // Catch: java.lang.Throwable -> L91
            r10.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r11 = "MicroMsg.SceneVoice.Recorder"
            java.lang.String r12 = "Stop file success: "
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L91
            r10.r0(r11)     // Catch: java.lang.Throwable -> L91
            r9.f1666h = r10     // Catch: java.lang.Throwable -> L91
            hh.p r0 = r0.findMethod(r9)     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r9.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L91
        L67:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L94
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L91
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L91
            java.lang.reflect.Method r0 = r0.r(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L7c
            goto L83
        L7c:
            r0 = move-exception
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L91
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r11
        L83:
            boolean r11 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L91
            if (r11 == 0) goto L89
            r0 = r8
        L89:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L67
            r9.add(r0)     // Catch: java.lang.Throwable -> L91
            goto L67
        L91:
            r0 = move-exception
            goto L138
        L94:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L91
        La2:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L91
            r11 = r10
            java.lang.Class r11 = (java.lang.Class) r11     // Catch: java.lang.Throwable -> L91
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L91
            boolean r11 = r0.add(r11)     // Catch: java.lang.Throwable -> L91
            if (r11 == 0) goto La2
            r3.add(r10)     // Catch: java.lang.Throwable -> L91
            goto La2
        Lbd:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L91
        Lc6:
            boolean r9 = r3.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto Lda
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L91
            java.lang.Class r9 = (java.lang.Class) r9     // Catch: java.lang.Throwable -> L91
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)     // Catch: java.lang.Throwable -> L91
            tf.r.h1(r0, r9)     // Catch: java.lang.Throwable -> L91
            goto Lc6
        Lda:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L91
        Le3:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto L10f
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L91
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L91
            boolean r11 = h.Hchat.utils.KavaReflector.isStatic(r10)     // Catch: java.lang.Throwable -> L91
            if (r11 != 0) goto L108
            int r11 = r10.getParameterCount()     // Catch: java.lang.Throwable -> L91
            if (r11 != 0) goto L108
            java.lang.Class r10 = r10.getReturnType()     // Catch: java.lang.Throwable -> L91
            boolean r10 = gg.l.a(r10, r7)     // Catch: java.lang.Throwable -> L91
            if (r10 == 0) goto L108
            r10 = r6
            goto L109
        L108:
            r10 = 0
        L109:
            if (r10 == 0) goto Le3
            r3.add(r9)     // Catch: java.lang.Throwable -> L91
            goto Le3
        L10f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r7.<init>()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L91
        L11d:
            boolean r9 = r3.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto L13d
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L91
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L91
            java.lang.String r10 = r10.toGenericString()     // Catch: java.lang.Throwable -> L91
            boolean r10 = r0.add(r10)     // Catch: java.lang.Throwable -> L91
            if (r10 == 0) goto L11d
            r7.add(r9)     // Catch: java.lang.Throwable -> L91
            goto L11d
        L138:
            sf.f r7 = new sf.f
            r7.<init>(r0)
        L13d:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 != 0) goto L144
            goto L14b
        L144:
            java.lang.String r3 = "伪造语音时长定位录音器失败"
            r1.invoke(r3, r0)
            tf.t r7 = tf.t.f13167g
        L14b:
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = tf.m.I1(r9)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L15a
            e8.b.h(r4, r2, r5, r0)
            goto L199
        L15a:
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r7 = r4.edit()     // Catch: java.lang.Throwable -> L17a
            java.lang.String r10 = ""
            java.lang.String r4 = r4.getString(r3, r10)     // Catch: java.lang.Throwable -> L17a
            boolean r4 = gg.l.a(r4, r2)     // Catch: java.lang.Throwable -> L17a
            if (r4 != 0) goto L173
            android.content.SharedPreferences$Editor r4 = r7.clear()     // Catch: java.lang.Throwable -> L17a
            r4.putString(r3, r2)     // Catch: java.lang.Throwable -> L17a
        L173:
            android.content.SharedPreferences$Editor r2 = r7.remove(r5)     // Catch: java.lang.Throwable -> L17a
            r2.apply()     // Catch: java.lang.Throwable -> L17a
        L17a:
            int r2 = r9.size()
            if (r2 <= r6) goto L199
            i2.z r13 = new i2.z
            r2 = 12
            r13.<init>(r2)
            r14 = 31
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r2 = tf.m.A1(r9, r10, r11, r12, r13, r14)
            java.lang.String r3 = "伪造语音时长录音长度方法候选不唯一: "
            java.lang.String r2 = r3.concat(r2)
            r1.invoke(r2, r8)
        L199:
            return r0
    }

    public java.lang.reflect.Method h() {
            r14 = this;
            java.lang.Object r0 = r14.f2485d
            r1 = r0
            ab.b r1 = (ab.b) r1
            java.lang.Object r0 = r14.f2482a
            r8.g r0 = (r8.g) r0
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r3 = r0.f11622c
            java.lang.String r2 = e8.b.g(r2, r3)
            java.lang.Object r4 = r14.f2483b
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r5 = "splash_ad_check_method"
            java.lang.reflect.Method r6 = e8.b.c(r4, r2, r3, r5)
            r7 = 0
            if (r6 == 0) goto L29
            boolean r8 = f8.i.b(r6)
            if (r8 == 0) goto L25
            goto L26
        L25:
            r6 = r7
        L26:
            if (r6 == 0) goto L29
            return r6
        L29:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L7d
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L7d
            r8.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = "MicroMsg.AppBrandAdUtils[AppBrandSplashAd]"
            java.lang.String r10 = "isAdContact, appId:%s, canShowAd:%s"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> L7d
            r8.r0(r9)     // Catch: java.lang.Throwable -> L7d
            r6.f1666h = r8     // Catch: java.lang.Throwable -> L7d
            hh.p r0 = r0.findMethod(r6)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
        L4f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L7d
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r0.t()     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L63
            r0 = r7
            goto L77
        L63:
            java.lang.reflect.Method r0 = r0.r(r3)     // Catch: java.lang.Throwable -> L68
            goto L6f
        L68:
            r0 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L7d
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            r0 = r9
        L6f:
            boolean r9 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L75
            r0 = r7
        L75:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L7d
        L77:
            if (r0 == 0) goto L4f
            r6.add(r0)     // Catch: java.lang.Throwable -> L7d
            goto L4f
        L7d:
            r0 = move-exception
            goto Lc8
        L7f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r0.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L88:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L7d
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L7d
            boolean r8 = f8.i.b(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L88
            r0.add(r6)     // Catch: java.lang.Throwable -> L7d
            goto L88
        L9f:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
        Lad:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto Lcd
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L7d
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r3.add(r9)     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto Lad
            r6.add(r8)     // Catch: java.lang.Throwable -> L7d
            goto Lad
        Lc8:
            sf.f r6 = new sf.f
            r6.<init>(r0)
        Lcd:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 != 0) goto Ld4
            goto Ldb
        Ld4:
            java.lang.String r3 = "定位小程序开屏广告资格方法失败"
            r1.invoke(r3, r0)
            tf.t r6 = tf.t.f13167g
        Ldb:
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = tf.m.I1(r8)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lea
            e8.b.h(r4, r2, r5, r0)
            goto L12a
        Lea:
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r4.edit()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r9 = ""
            java.lang.String r4 = r4.getString(r3, r9)     // Catch: java.lang.Throwable -> L10a
            boolean r4 = gg.l.a(r4, r2)     // Catch: java.lang.Throwable -> L10a
            if (r4 != 0) goto L103
            android.content.SharedPreferences$Editor r4 = r6.clear()     // Catch: java.lang.Throwable -> L10a
            r4.putString(r3, r2)     // Catch: java.lang.Throwable -> L10a
        L103:
            android.content.SharedPreferences$Editor r2 = r6.remove(r5)     // Catch: java.lang.Throwable -> L10a
            r2.apply()     // Catch: java.lang.Throwable -> L10a
        L10a:
            int r2 = r8.size()
            r3 = 1
            if (r2 <= r3) goto L12a
            e9.h r12 = new e9.h
            r2 = 23
            r12.<init>(r2)
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r2 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = "小程序开屏广告资格方法候选不唯一: "
            java.lang.String r2 = r3.concat(r2)
            r1.invoke(r2, r7)
        L12a:
            return r0
    }
}
