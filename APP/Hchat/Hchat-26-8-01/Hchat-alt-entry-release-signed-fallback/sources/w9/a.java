package w9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static android.os.PowerManager.WakeLock f14889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f14890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f14891c;

    static {
            return
    }

    public static void a(android.content.Context r7, android.content.Context r8) {
            sf.n r0 = sf.n.f12433a
            if (r7 != 0) goto L6
            goto L14e
        L6:
            android.content.Context r1 = r7.getApplicationContext()
            if (r1 == 0) goto Ld
            r7 = r1
        Ld:
            r1 = 0
            if (r8 == 0) goto L11
            goto L28
        L11:
            java.lang.String r8 = "h.Hchat"
            r2 = 2
            android.content.Context r8 = r7.createPackageContext(r8, r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r8 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r8)
            r8 = r2
        L20:
            boolean r2 = r8 instanceof sf.f
            if (r2 == 0) goto L26
            r8 = r1
        L26:
            android.content.Context r8 = (android.content.Context) r8
        L28:
            if (r8 == 0) goto L32
            android.content.Context r1 = r8.getApplicationContext()
            if (r1 == 0) goto L31
            goto L32
        L31:
            r1 = r8
        L32:
            java.lang.String r8 = "Hchat_wechat_keep_alive_config"
            android.content.SharedPreferences r8 = ub.b.c(r7, r8)
            java.lang.String r2 = "wechat_keep_alive_enable"
            r3 = 0
            boolean r2 = r8.getBoolean(r2, r3)
            java.lang.Class<h.Hchat.hooks.items.keepalive.WeChatKeepAliveService> r4 = h.Hchat.hooks.items.keepalive.WeChatKeepAliveService.class
            if (r2 != 0) goto L5b
            d()
            if (r1 == 0) goto L14e
            int r7 = h.Hchat.hooks.items.keepalive.WeChatKeepAliveService.f4605k     // Catch: java.lang.Throwable -> L14e
            android.content.Context r7 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L14e
            if (r7 == 0) goto L51
            r1 = r7
        L51:
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> L14e
            r7.<init>(r1, r4)     // Catch: java.lang.Throwable -> L14e
            r1.stopService(r7)     // Catch: java.lang.Throwable -> L14e
            goto L14e
        L5b:
            java.lang.String r2 = "wechat_keep_alive_wake_lock"
            r5 = 1
            boolean r2 = r8.getBoolean(r2, r5)
            if (r2 == 0) goto La0
            android.os.PowerManager$WakeLock r2 = w9.a.f14889a
            if (r2 == 0) goto L6f
            boolean r2 = r2.isHeld()
            if (r2 != r5) goto L6f
            goto La3
        L6f:
            java.lang.String r2 = "power"
            java.lang.Object r7 = r7.getSystemService(r2)     // Catch: java.lang.Throwable -> L8a
            r7.getClass()     // Catch: java.lang.Throwable -> L8a
            android.os.PowerManager r7 = (android.os.PowerManager) r7     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Hchat:WeChatKeepAlive"
            android.os.PowerManager$WakeLock r7 = r7.newWakeLock(r5, r2)     // Catch: java.lang.Throwable -> L8a
            r7.setReferenceCounted(r3)     // Catch: java.lang.Throwable -> L8a
            r7.acquire()     // Catch: java.lang.Throwable -> L8a
            w9.a.f14889a = r7     // Catch: java.lang.Throwable -> L8a
            r2 = r0
            goto L90
        L8a:
            r7 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r7)
        L90:
            java.lang.Throwable r7 = sf.g.b(r2)
            if (r7 == 0) goto La3
            java.lang.String r2 = r7.getMessage()
            java.lang.String r6 = "[Hchat:KeepAlive] 获取 WakeLock 失败: "
            eh.a.x(r6, r2, r7)
            goto La3
        La0:
            d()
        La3:
            java.lang.String r7 = "wechat_keep_alive_foreground_service"
            boolean r7 = r8.getBoolean(r7, r5)
            if (r7 == 0) goto Lf1
            if (r1 == 0) goto Leb
            java.lang.String r7 = "wechat_keep_alive_watchdog"
            boolean r7 = r8.getBoolean(r7, r3)
            java.lang.String r2 = "wechat_keep_alive_network_heartbeat"
            boolean r2 = r8.getBoolean(r2, r3)
            int r6 = h.Hchat.hooks.items.keepalive.WeChatKeepAliveService.f4605k     // Catch: java.lang.Throwable -> Ld5
            android.content.Context r6 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Ld5
            if (r6 == 0) goto Lc2
            r1 = r6
        Lc2:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> Ld5
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r4 = "h.Hchat.extra.WATCHDOG"
            r6.putExtra(r4, r7)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r7 = "h.Hchat.extra.NETWORK_HEARTBEAT"
            r6.putExtra(r7, r2)     // Catch: java.lang.Throwable -> Ld5
            r1.startForegroundService(r6)     // Catch: java.lang.Throwable -> Ld5
            goto Ldb
        Ld5:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
        Ldb:
            java.lang.Throwable r7 = sf.g.b(r0)
            if (r7 == 0) goto L104
            java.lang.String r0 = r7.getMessage()
            java.lang.String r1 = "[Hchat:KeepAlive] 启动前台服务失败: "
            eh.a.x(r1, r0, r7)
            goto L104
        Leb:
            java.lang.String r7 = "[Hchat:KeepAlive] 模块 Context 不可用，跳过前台服务"
            fb.v0.m(r7)
            goto L104
        Lf1:
            if (r1 == 0) goto L104
            int r7 = h.Hchat.hooks.items.keepalive.WeChatKeepAliveService.f4605k     // Catch: java.lang.Throwable -> L104
            android.content.Context r7 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L104
            if (r7 == 0) goto Lfc
            r1 = r7
        Lfc:
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> L104
            r7.<init>(r1, r4)     // Catch: java.lang.Throwable -> L104
            r1.stopService(r7)     // Catch: java.lang.Throwable -> L104
        L104:
            java.lang.String r7 = "wechat_keep_alive_root_doze_whitelist"
            boolean r7 = r8.getBoolean(r7, r3)
            if (r7 == 0) goto L129
            boolean r7 = w9.a.f14890b
            if (r7 == 0) goto L111
            goto L129
        L111:
            w9.a.f14890b = r5
            java.lang.Thread r7 = new java.lang.Thread
            h.Hchat.crash.e r0 = new h.Hchat.crash.e
            r1 = 7
            r0.<init>(r1)
            r7.<init>(r0)
            java.lang.String r0 = "Hchat-KeepAlive-RootWhitelist"
            r7.setName(r0)
            r7.setDaemon(r5)
            r7.start()
        L129:
            java.lang.String r7 = "wechat_keep_alive_root_app_ops"
            boolean r7 = r8.getBoolean(r7, r3)
            if (r7 == 0) goto L14e
            boolean r7 = w9.a.f14891c
            if (r7 == 0) goto L136
            goto L14e
        L136:
            w9.a.f14891c = r5
            java.lang.Thread r7 = new java.lang.Thread
            h.Hchat.crash.e r8 = new h.Hchat.crash.e
            r0 = 6
            r8.<init>(r0)
            r7.<init>(r8)
            java.lang.String r8 = "Hchat-KeepAlive-RootAppOps"
            r7.setName(r8)
            r7.setDaemon(r5)
            r7.start()
        L14e:
            return
    }

    public static boolean b(android.content.Context r2) {
            java.lang.String r0 = "power"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L20
            boolean r0 = r2 instanceof android.os.PowerManager     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Ld
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch: java.lang.Throwable -> L20
            goto Le
        Ld:
            r2 = 0
        Le:
            r0 = 0
            if (r2 == 0) goto L1b
            java.lang.String r1 = "com.tencent.mm"
            boolean r2 = r2.isIgnoringBatteryOptimizations(r1)     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r2 != r1) goto L1b
            r0 = r1
        L1b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L2e
            r2 = r0
        L2e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean c() {
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "sh"
            java.lang.String r2 = "-c"
            java.lang.String r3 = "pidof com.tencent.mm"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            r1 = 1
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.Process r0 = r0.start()     // Catch: java.lang.Throwable -> L25
            int r0 = r0.waitFor()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L33
            r0 = r1
        L33:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static void d() {
            r0 = 0
            android.os.PowerManager$WakeLock r1 = w9.a.f14889a     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            boolean r2 = r1.isHeld()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L17
            r1.release()     // Catch: java.lang.Throwable -> L15
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L15
            goto L1f
        L15:
            r1 = move-exception
            goto L19
        L17:
            r1 = r0
            goto L1f
        L19:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L1f:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "[Hchat:KeepAlive] 释放 WakeLock 失败: "
            eh.a.x(r3, r2, r1)
        L2e:
            w9.a.f14889a = r0
            return
    }

    public static boolean e(java.lang.String r3) {
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "su"
            java.lang.String r2 = "-c"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L23
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r3 = 1
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Process r0 = r0.start()     // Catch: java.lang.Throwable -> L23
            int r0 = r0.waitFor()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L31
            r3 = r0
        L31:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }
}
