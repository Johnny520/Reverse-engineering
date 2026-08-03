package h.Hchat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleEntry implements de.robv.android.xposed.IXposedHookLoadPackage {
    private static final java.util.Map<java.lang.String, org.luckypray.dexkit.DexKitBridge> DEXKIT_BRIDGES = null;
    private static final java.lang.Object DEXKIT_CREATE_LOCK = null;
    private static final java.lang.String TAG = "[Hchat:Entry]";
    private static final java.lang.String WECHAT_PKG = "com.tencent.mm";
    private final f8.c eventBus;
    private r8.g featureContext;
    private r8.h featureManager;
    private final vb.c uiRegistry;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            h.Hchat.ModuleEntry.DEXKIT_CREATE_LOCK = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            h.Hchat.ModuleEntry.DEXKIT_BRIDGES = r0
            return
    }

    public ModuleEntry() {
            r1 = this;
            r1.<init>()
            f8.c r0 = f8.c.f3320c
            r1.eventBus = r0
            vb.c r0 = vb.c.f14305a
            r1.uiRegistry = r0
            return
    }

    public static /* synthetic */ void a(h.Hchat.ModuleEntry r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, android.content.Context r2, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3) {
            r0.lambda$installHotUpdateForAttach$2(r1, r2, r3)
            return
    }

    public static /* synthetic */ void b(java.lang.String r0) {
            lambda$handleLoadPackage$0(r0)
            return
    }

    public static /* synthetic */ void c(h.Hchat.ModuleEntry r0, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1, android.content.Context r2, android.content.Context r3, ub.a r4) {
            r0.lambda$initModule$4(r1, r2, r3, r4)
            return
    }

    private org.luckypray.dexkit.DexKitBridge createDexKitBridge(java.lang.ClassLoader r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r4 = h.Hchat.ModuleEntry.DEXKIT_CREATE_LOCK
            monitor-enter(r4)
            if (r5 == 0) goto L7
            r0 = r5
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            java.util.Map<java.lang.String, org.luckypray.dexkit.DexKitBridge> r1 = h.Hchat.ModuleEntry.DEXKIT_BRIDGES     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L15
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            r5 = move-exception
            goto L20
        L17:
            org.luckypray.dexkit.DexKitBridge r5 = org.luckypray.dexkit.DexKitBridge.create(r5)     // Catch: java.lang.Throwable -> L15
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            return r5
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r5
    }

    private android.content.Context createModuleContext(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "h.Hchat"
            r1 = 3
            android.content.Context r3 = r3.createPackageContext(r0, r1)     // Catch: java.lang.Throwable -> L8
            return r3
        L8:
            r3 = 0
            return r3
    }

    public static /* synthetic */ void d(h.Hchat.ModuleEntry r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, android.content.Context r2, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3, java.lang.String r4) {
            r0.lambda$installTabletHookForAttach$3(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void e(h.Hchat.ModuleEntry r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, android.content.Context r2, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3) {
            r0.lambda$installHotUpdateForAttach$1(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void f(h.Hchat.ModuleEntry r0, android.content.Context r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            r0.initModule(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void g(h.Hchat.ModuleEntry r0, android.content.Context r1, java.lang.ClassLoader r2, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3, boolean r4) {
            r0.installAppBrandProcessHook(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void h(h.Hchat.ModuleEntry r0, android.content.Context r1, java.lang.ClassLoader r2) {
            r0.installHideBottomBarEarly(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void i(h.Hchat.ModuleEntry r0, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1, de.robv.android.xposed.XC_MethodHook.MethodHookParam r2, java.lang.String r3) {
            r0.installHotUpdateForAttach(r1, r2, r3)
            return
    }

    private void initModule(android.content.Context r12, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r13) {
            r11 = this;
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "libdexkit.so"
            java.lang.String r2 = "dexkit"
            r3 = 0
            sb.a.d(r12, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "libsilk_codec.so"
            java.lang.String r2 = "silk_codec"
            r3 = 1
            sb.a.d(r12, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L36
            android.content.Context r8 = r11.createModuleContext(r12)     // Catch: java.lang.Throwable -> L36
            ub.a r9 = new ub.a     // Catch: java.lang.Throwable -> L36
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L36
            ca.x r4 = new ca.x     // Catch: java.lang.Throwable -> L36
            r10 = 1
            r5 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L36
            r8.e.c(r4)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:Entry] 初始化失败: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            fb.v0.n(r13, r12)
            return
    }

    private void installAppBrandProcessHook(android.content.Context r11, java.lang.ClassLoader r12, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r13, boolean r14) {
            r10 = this;
            java.lang.String r0 = "Hchat_global_config"
            r11.getClass()
            java.lang.String r1 = "terms_accepted"
            r2 = 0
            android.content.SharedPreferences r3 = ub.b.c(r11, r0)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r1 = r2
        L12:
            r3 = 1
            if (r1 == 0) goto L25
            java.lang.String r1 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r11, r0)     // Catch: java.lang.Throwable -> L20
            int r0 = r0.getInt(r1, r2)     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != r3) goto L25
            r0 = r3
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 != 0) goto L2a
            goto L1bc
        L2a:
            a2.a r0 = ea.a.f2477f
            java.lang.String r1 = "Hchat_fake_mini_program_base_lib_config"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            java.lang.String r4 = "fake_mini_program_base_lib_enable"
            boolean r1 = r1.getBoolean(r4, r2)
            if (r1 == 0) goto L49
            java.lang.Class<ea.a> r1 = ea.a.class
            monitor-enter(r1)
            boolean r0 = r0.l(r11, r12)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            if (r0 != 0) goto L49
            r0 = r3
            goto L4a
        L46:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r11
        L49:
            r0 = r2
        L4a:
            java.util.HashSet r1 = ga.a.f4403e
            java.lang.String r1 = "Hchat_skip_mini_program_video_ads_config"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            java.lang.String r4 = "skip_mini_program_video_ads_enable"
            boolean r1 = r1.getBoolean(r4, r2)
            if (r1 == 0) goto L61
            boolean r1 = a2.a.k(r11, r12)
            if (r1 != 0) goto L61
            r0 = r3
        L61:
            java.util.HashSet r1 = fa.a.f3384f
            java.lang.String r1 = "Hchat_skip_global_mini_program_splash_ads_config"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            java.lang.String r4 = "skip_global_mini_program_splash_ads_enable"
            boolean r1 = r1.getBoolean(r4, r2)
            if (r1 == 0) goto Lac
            if (r12 != 0) goto L74
            goto Lac
        L74:
            java.lang.Class r1 = r12.getClass()
            java.lang.String r1 = r1.getName()
            int r4 = java.lang.System.identityHashCode(r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "@"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            android.os.Handler r4 = r8.e.f11615a
            java.lang.String r4 = "skip_global_mini_program_splash_ads:appbrand:"
            java.lang.String r1 = r4.concat(r1)
            java.lang.String r4 = "小程序开屏广告子进程 Hook"
            r8.c r5 = r8.c.f11602h
            aa.c r6 = new aa.c
            r7 = 8
            r6.<init>(r11, r7, r12)
            r7 = -100
            r8.e.e(r7, r6, r1, r4, r5)
        Lac:
            java.lang.String r1 = "Hchat_fake_location_config"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            java.lang.String r4 = "fake_location_enable"
            boolean r1 = r1.getBoolean(r4, r2)
            if (r1 == 0) goto L19d
            r12.getClass()
            java.lang.String r1 = "Hchat_fake_location_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r11, r1)
            l8.i r4 = o8.k.a(r11, r12)
            java.lang.String r4 = r4.f7933h
            java.lang.String r5 = "location_callbacks_v1"
            java.lang.String r6 = ""
            tf.t r7 = tf.t.f13167g
            boolean r8 = og.m.t0(r4)
            if (r8 == 0) goto Ld7
            goto L167
        Ld7:
            java.lang.String r8 = "cache.key"
            java.lang.String r8 = r1.getString(r8, r6)
            if (r8 != 0) goto Le0
            r8 = r6
        Le0:
            boolean r9 = og.m.t0(r8)
            if (r9 != 0) goto L167
            boolean r9 = og.m.t0(r4)
            if (r9 == 0) goto Lee
            goto L167
        Lee:
            boolean r9 = r8.equals(r4)
            if (r9 == 0) goto Lf5
            goto L10b
        Lf5:
            r9 = 124(0x7c, float:1.74E-43)
            java.lang.String r8 = og.m.O0(r8, r9, r6)
            java.lang.String r4 = og.m.O0(r4, r9, r6)
            boolean r9 = og.m.t0(r8)
            if (r9 != 0) goto L167
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L167
        L10b:
            java.lang.String r1 = r1.getString(r5, r6)
            if (r1 == 0) goto L167
            boolean r4 = og.m.t0(r1)
            r5 = 0
            if (r4 != 0) goto L119
            goto L11a
        L119:
            r1 = r5
        L11a:
            if (r1 == 0) goto L167
            char[] r4 = new char[r3]
            r6 = 10
            r4[r2] = r6
            r6 = 6
            java.util.List r1 = og.m.F0(r1, r4, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L130:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L167
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = og.m.t0(r4)
            if (r6 != 0) goto L143
            goto L144
        L143:
            r4 = r5
        L144:
            if (r4 == 0) goto L160
            lh.d r6 = new lh.d     // Catch: java.lang.Throwable -> L150
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L150
            java.lang.reflect.Method r4 = r6.b(r12)     // Catch: java.lang.Throwable -> L150
            goto L157
        L150:
            r4 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r4)
            r4 = r6
        L157:
            boolean r6 = r4 instanceof sf.f
            if (r6 == 0) goto L15d
            r4 = r5
        L15d:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L161
        L160:
            r4 = r5
        L161:
            if (r4 == 0) goto L130
            r7.add(r4)
            goto L130
        L167:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
        L170:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L187
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = ig.a.c(r6)
            if (r6 == 0) goto L170
            r1.add(r5)
            goto L170
        L187:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L18e
            goto L19a
        L18e:
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = h9.d.f5152a
            c9.n1 r4 = new c9.n1
            r5 = 2
            r4.<init>(r2, r5)
            boolean r2 = h9.d.c(r11, r1, r4)
        L19a:
            if (r2 != 0) goto L19d
            goto L19e
        L19d:
            r3 = r0
        L19e:
            if (r14 == 0) goto L1a5
            java.lang.String r0 = r13.processName
            h.Hchat.hooks.items.script.ScriptPluginRuntime.installAppBrandProcess(r11, r12, r0)
        L1a5:
            if (r3 == 0) goto L1bc
            if (r14 == 0) goto L1bc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "[Hchat:Entry] 小程序进程Hook安装失败: "
            r11.<init>(r12)
            java.lang.String r12 = r13.processName
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            fb.v0.m(r11)
        L1bc:
            return
    }

    private void installAppBrandProcessHook(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9) {
            r8 = this;
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "com.tencent.tinker.loader.app.TinkerApplication"
            java.lang.ClassLoader r2 = r9.classLoader     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "onBaseContextAttached"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1e
            d8.b r6 = new d8.b     // Catch: java.lang.Throwable -> L1e
            r7 = 1
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r5, r6}     // Catch: java.lang.Throwable -> L1e
            de.robv.android.xposed.XC_MethodHook$Unhook r1 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1e
            r0.a(r1)     // Catch: java.lang.Throwable -> L1e
            goto L29
        L1e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:Entry] 小程序进程早期入口安装失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L29:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L41
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.String r2 = "onCreate"
            d8.b r3 = new d8.b     // Catch: java.lang.Throwable -> L41
            r4 = 2
            r3.<init>(r8, r9, r4)     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r9 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L41
            de.robv.android.xposed.XC_MethodHook$Unhook r9 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r9)     // Catch: java.lang.Throwable -> L41
            r0.a(r9)     // Catch: java.lang.Throwable -> L41
            goto L4c
        L41:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Entry] 小程序进程兜底入口安装失败: "
            r0.<init>(r1)
            bc.e.s(r9, r0, r9)
        L4c:
            return
    }

    private void installHideBottomBarEarly(android.content.Context r5, java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.String r0 = "Hchat_global_config"
            r5.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "terms_accepted"
            r2 = 0
            android.content.SharedPreferences r3 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto L24
            java.lang.String r1 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.getInt(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r0 = r2
        L20:
            r1 = 1
            if (r0 != r1) goto L24
            r2 = r1
        L24:
            if (r2 != 0) goto L27
            goto L2a
        L27:
            u9.c.k(r5, r6)     // Catch: java.lang.Throwable -> L2b
        L2a:
            return
        L2b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:Entry] 隐藏底栏早期Hook失败: "
            r6.<init>(r0)
            bc.e.s(r5, r6, r5)
            return
    }

    private void installHideBottomBarEarlyHook(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9) {
            r8 = this;
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "com.tencent.tinker.loader.app.TinkerApplication"
            java.lang.ClassLoader r2 = r9.classLoader     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "onBaseContextAttached"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1e
            d8.b r6 = new d8.b     // Catch: java.lang.Throwable -> L1e
            r7 = 5
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r9 = new java.lang.Object[]{r4, r5, r5, r6}     // Catch: java.lang.Throwable -> L1e
            de.robv.android.xposed.XC_MethodHook$Unhook r9 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r3, r9)     // Catch: java.lang.Throwable -> L1e
            r0.a(r9)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Entry] 隐藏底栏早期入口安装失败: "
            r0.<init>(r1)
            bc.e.s(r9, r0, r9)
            return
    }

    private void installHotUpdateEarlyHook(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9) {
            r8 = this;
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "com.tencent.tinker.loader.app.TinkerApplication"
            java.lang.ClassLoader r2 = r9.classLoader     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "onBaseContextAttached"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1e
            d8.b r6 = new d8.b     // Catch: java.lang.Throwable -> L1e
            r7 = 3
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r9 = new java.lang.Object[]{r4, r5, r5, r6}     // Catch: java.lang.Throwable -> L1e
            de.robv.android.xposed.XC_MethodHook$Unhook r9 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r3, r9)     // Catch: java.lang.Throwable -> L1e
            r0.a(r9)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Entry] 热更新早期入口安装失败: "
            r0.<init>(r1)
            bc.e.s(r9, r0, r9)
            return
    }

    private void installHotUpdateForAttach(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9, de.robv.android.xposed.XC_MethodHook.MethodHookParam r10, java.lang.String r11) {
            r8 = this;
            java.lang.Object[] r0 = r10.args     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            java.lang.String r0 = "Hchat_global_config"
            r5.getClass()     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            java.lang.String r2 = "terms_accepted"
            android.content.SharedPreferences r3 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r3.getBoolean(r2, r1)     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L2b
            java.lang.String r2 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L26
            int r0 = r0.getInt(r2, r1)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r0 = r1
        L27:
            r2 = 1
            if (r0 != r2) goto L2b
            r1 = r2
        L2b:
            if (r1 != 0) goto L2e
            goto L36
        L2e:
            uf.d r0 = v9.b.f14287e     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            boolean r1 = uf.d.C(r5)     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            if (r1 != 0) goto L37
        L36:
            return
        L37:
            java.lang.String r1 = "before"
            boolean r1 = r1.equals(r11)     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            if (r1 == 0) goto L4b
            java.lang.ClassLoader r9 = r9.classLoader     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            r0.A(r5, r9)     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            return
        L45:
            r0 = move-exception
            r9 = r0
            goto L5f
        L48:
            r0 = move-exception
            r9 = r0
            goto L6b
        L4b:
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            d8.a r2 = new d8.a     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            r7 = 1
            r3 = r8
            r6 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            java.lang.String r9 = "Hchat-HotUpdateHook"
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            r0.start()     // Catch: java.lang.Throwable -> L45 java.lang.SecurityException -> L48
            return
        L5f:
            java.lang.String r10 = "[Hchat:Entry] 热更新早期Hook失败("
            java.lang.String r0 = "): "
            java.lang.StringBuilder r10 = bc.e.o(r10, r11, r0)
            bc.e.s(r9, r10, r9)
            return
        L6b:
            throw r9
    }

    private void installTabletEarlyHook(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9) {
            r8 = this;
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "com.tencent.tinker.loader.app.TinkerApplication"
            java.lang.ClassLoader r2 = r9.classLoader     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "onBaseContextAttached"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1e
            d8.b r6 = new d8.b     // Catch: java.lang.Throwable -> L1e
            r7 = 4
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r9 = new java.lang.Object[]{r4, r5, r5, r6}     // Catch: java.lang.Throwable -> L1e
            de.robv.android.xposed.XC_MethodHook$Unhook r9 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r3, r9)     // Catch: java.lang.Throwable -> L1e
            r0.a(r9)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Entry] 平板模式早期入口安装失败: "
            r0.<init>(r1)
            bc.e.s(r9, r0, r9)
            return
    }

    private void installTabletHookForAttach(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r10, de.robv.android.xposed.XC_MethodHook.MethodHookParam r11, java.lang.String r12) {
            r9 = this;
            java.lang.Object[] r0 = r11.args     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            java.lang.String r0 = "Hchat_global_config"
            r5.getClass()     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            java.lang.String r2 = "terms_accepted"
            android.content.SharedPreferences r3 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r3.getBoolean(r2, r1)     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L30
            java.lang.String r2 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L26
            int r0 = r0.getInt(r2, r1)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r0 = r1
        L27:
            r2 = 1
            if (r0 != r2) goto L30
            r1 = r2
            goto L30
        L2c:
            r0 = move-exception
            r10 = r0
            r7 = r12
            goto L53
        L30:
            if (r1 != 0) goto L33
            goto L3b
        L33:
            java.util.HashSet r0 = mb.a.f8811e     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            boolean r0 = oh.h.F(r5)     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            if (r0 != 0) goto L3c
        L3b:
            return
        L3c:
            ca.x r2 = new ca.x     // Catch: java.lang.SecurityException -> L4d java.lang.Throwable -> L50
            r8 = 2
            r3 = r9
            r6 = r10
            r4 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4a java.lang.SecurityException -> L4d
            r8.e.c(r2)     // Catch: java.lang.Throwable -> L4a java.lang.SecurityException -> L4d
            return
        L4a:
            r0 = move-exception
        L4b:
            r10 = r0
            goto L53
        L4d:
            r0 = move-exception
            r10 = r0
            goto L5f
        L50:
            r0 = move-exception
            r7 = r12
            goto L4b
        L53:
            java.lang.String r11 = "[Hchat:Entry] 平板模式早期Hook失败("
            java.lang.String r12 = "): "
            java.lang.StringBuilder r11 = bc.e.o(r11, r7, r12)
            bc.e.s(r10, r11, r10)
            return
        L5f:
            throw r10
    }

    private boolean isAppBrandProcess(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3) {
            r2 = this;
            java.lang.String r0 = r3.processName
            java.lang.String r3 = r3.packageName
            if (r0 == 0) goto L16
            if (r3 == 0) goto L16
            java.lang.String r1 = ":appbrand"
            java.lang.String r3 = r3.concat(r1)
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    private boolean isMainProcess(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            r1 = this;
            java.lang.String r0 = r2.processName
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.packageName
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    private boolean isTinkerClassLoader(java.lang.ClassLoader r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "/tinker/"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1a
            java.lang.String r1 = "DelegateLastClassLoader"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            r3 = 1
            return r3
    }

    private boolean isWeChatPackage(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.String r0 = "com.tencent.mm"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public static /* bridge */ /* synthetic */ void j(h.Hchat.ModuleEntry r0, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1, de.robv.android.xposed.XC_MethodHook.MethodHookParam r2, java.lang.String r3) {
            r0.installTabletHookForAttach(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ java.lang.ClassLoader k(h.Hchat.ModuleEntry r0, android.content.Context r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            java.lang.ClassLoader r0 = r0.resolveHostClassLoader(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.ClassLoader l(h.Hchat.ModuleEntry r0, java.lang.Object r1) {
            java.lang.ClassLoader r0 = r0.resolveTinkerClassLoader(r1)
            return r0
    }

    private static /* synthetic */ void lambda$handleLoadPackage$0(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:WechatApi] "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            de.robv.android.xposed.XposedBridge.log(r2)
            return
    }

    private void lambda$initModule$4(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r23, android.content.Context r24, android.content.Context r25, ub.a r26) {
            r22 = this;
            r1 = r22
            r6 = r23
            r3 = r24
            android.content.pm.ApplicationInfo r0 = r6.appInfo
            java.lang.String r0 = r0.sourceDir
            java.lang.ClassLoader r5 = r1.resolveHostClassLoader(r3, r6)
            org.luckypray.dexkit.DexKitBridge r7 = r1.createDexKitBridge(r5, r0)
            h.Hchat.dexkit.DexFinder r8 = new h.Hchat.dexkit.DexFinder
            r8.<init>(r7, r5, r3)
            h.Hchat.dexkit.DexBridgeHolder r11 = new h.Hchat.dexkit.DexBridgeHolder
            r11.<init>(r7, r8, r5, r0)
            java.util.Set r0 = fb.n0.f3650a
            r3.getClass()
            java.lang.Object r2 = fb.n0.f3652c
            monitor-enter(r2)
            fb.j0 r0 = fb.n0.f3654e     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r0 = move-exception
            goto L409
        L2f:
            r0 = 0
            fb.n0.f3654e = r0     // Catch: java.lang.Throwable -> L2c
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            fb.j0 r0 = g4.a.w(r11, r0)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.atomic.AtomicReference r4 = fb.n0.f3651b     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.getAndSet(r0)     // Catch: java.lang.Throwable -> L2c
            fb.j0 r4 = (fb.j0) r4     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L4a
            r4.close()     // Catch: java.lang.Throwable -> L2c
        L4a:
            java.util.LinkedHashMap r4 = fb.n0.f3653d     // Catch: java.lang.Throwable -> L2c
            r4.clear()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = r0.f3578j     // Catch: java.lang.Throwable -> L2c
            long r20 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = r0.f3577i     // Catch: java.lang.Throwable -> L2c
            r10.<init>(r12)     // Catch: java.lang.Throwable -> L2c
            fb.m0 r12 = new fb.m0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = r0.f3578j     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = r0.f3577i     // Catch: java.lang.Throwable -> L2c
            java.lang.String r15 = "current_wechat_apk"
            long r16 = r10.length()     // Catch: java.lang.Throwable -> L2c
            long r18 = r10.lastModified()     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r13, r14, r15, r16, r18, r20)     // Catch: java.lang.Throwable -> L2c
            r4.put(r9, r12)     // Catch: java.lang.Throwable -> L2c
            java.util.Set r4 = fb.n0.f3650a     // Catch: java.lang.Throwable -> L2c
            fb.n0.E(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            r8.g r2 = new r8.g
            if (r25 == 0) goto L7f
            r4 = r25
            goto L80
        L7f:
            r4 = r3
        L80:
            f8.c r9 = r1.eventBus
            vb.c r12 = r1.uiRegistry
            r10 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.featureContext = r2
            r8.h r2 = new r8.h
            r2.<init>()
            ib.c r0 = new ib.c
            r0.<init>()
            r2.a(r0)
            i8.i r0 = new i8.i
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r3 = 4
            r0.<init>(r3)
            r2.a(r0)
            u9.c r0 = new u9.c
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r4 = 2
            r0.<init>(r4)
            r2.a(r0)
            d9.d r0 = new d9.d
            r0.<init>()
            r2.a(r0)
            bb.e r0 = new bb.e
            r0.<init>()
            r2.a(r0)
            y9.c r0 = new y9.c
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r5 = 6
            r0.<init>(r5)
            r2.a(r0)
            mb.a r0 = new mb.a
            r0.<init>()
            r2.a(r0)
            ua.b r0 = new ua.b
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r6 = 8
            r0.<init>(r6)
            r2.a(r0)
            s8.c r0 = new s8.c
            r0.<init>()
            r2.a(r0)
            ja.a r0 = new ja.a
            r0.<init>()
            r2.a(r0)
            v9.b r0 = new v9.b
            r0.<init>()
            r2.a(r0)
            va.c r0 = new va.c
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r7 = 10
            r0.<init>(r7)
            r2.a(r0)
            xa.c r0 = new xa.c
            r0.<init>()
            r2.a(r0)
            ya.h r0 = new ya.h
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r8 = 14
            r0.<init>(r8)
            r2.a(r0)
            c9.g r0 = new c9.g
            r8 = 11
            r0.<init>(r8)
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r8)
            r2.a(r0)
            c9.g r0 = new c9.g
            r8 = 0
            r0.<init>(r8)
            r2.a(r0)
            c9.g r0 = new c9.g
            r9 = 13
            r0.<init>(r9)
            r2.a(r0)
            pb.a r0 = new pb.a
            r0.<init>()
            r2.a(r0)
            ma.a r0 = new ma.a
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r6)
            r2.a(r0)
            y8.a r0 = new y8.a
            r0.<init>()
            r2.a(r0)
            l9.a r0 = new l9.a
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r5)
            r2.a(r0)
            z8.a r0 = new z8.a
            r0.<init>()
            r2.a(r0)
            z8.e r0 = new z8.e
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r5 = 1
            r0.<init>(r5)
            r2.a(r0)
            c9.g r0 = new c9.g
            r6 = 12
            r0.<init>(r6)
            r2.a(r0)
            b9.a r0 = new b9.a
            r6 = 7
            r0.<init>(r6)
            r2.a(r0)
            ob.f r0 = new ob.f
            r0.<init>()
            r2.a(r0)
            rb.b r0 = new rb.b
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r9 = 9
            r0.<init>(r9)
            r2.a(r0)
            ab.c r0 = new ab.c
            r0.<init>()
            r2.a(r0)
            lb.k r0 = new lb.k
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r6)
            r2.a(r0)
            j9.a r0 = new j9.a
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r8)
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r5)
            r2.a(r0)
            b9.a r0 = new b9.a
            r6 = 3
            r0.<init>(r6)
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r9)
            r2.a(r0)
            aa.e r0 = new aa.e
            r0.<init>()
            r2.a(r0)
            h9.a r0 = new h9.a
            r0.<init>()
            r2.a(r0)
            m9.a r0 = new m9.a
            r0.<init>()
            r2.a(r0)
            ea.a r0 = new ea.a
            r0.<init>()
            r2.a(r0)
            ga.a r0 = new ga.a
            r0.<init>()
            r2.a(r0)
            fa.a r0 = new fa.a
            r0.<init>()
            r2.a(r0)
            ka.b r0 = new ka.b
            r0.<init>()
            r2.a(r0)
            ha.i r0 = new ha.i
            r0.<init>()
            r2.a(r0)
            ha.a r0 = new ha.a
            r0.<init>()
            r2.a(r0)
            ha.e r0 = new ha.e
            r0.<init>()
            r2.a(r0)
            ha.l r0 = new ha.l
            r0.<init>()
            r2.a(r0)
            ha.v r0 = new ha.v
            r0.<init>()
            r2.a(r0)
            ha.o r0 = new ha.o
            r0.<init>()
            r2.a(r0)
            ha.a0 r0 = new ha.a0
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r3)
            r2.a(r0)
            ha.e0 r0 = new ha.e0
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r6)
            r2.a(r0)
            ia.u r0 = new ia.u
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r3 = 5
            r0.<init>(r3)
            r2.a(r0)
            o9.a r0 = new o9.a
            r0.<init>()
            r2.a(r0)
            q9.b r0 = new q9.b
            r0.<init>()
            r2.a(r0)
            ha.h0 r0 = new ha.h0
            r0.<init>()
            r2.a(r0)
            f9.a r0 = new f9.a
            r0.<init>()
            r2.a(r0)
            g9.a r0 = new g9.a
            r0.<init>()
            r2.a(r0)
            qb.a r0 = new qb.a
            r0.<init>()
            r2.a(r0)
            hb.u r0 = new hb.u
            r0.<init>()
            r2.a(r0)
            ca.f r0 = new ca.f
            r0.<init>()
            r2.a(r0)
            db.b r0 = new db.b
            r0.<init>()
            r2.a(r0)
            b9.a r0 = new b9.a
            r0.<init>(r3)
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r7)
            r2.a(r0)
            kb.a r0 = new kb.a
            r0.<init>()
            r2.a(r0)
            jb.a r0 = new jb.a
            r0.<init>()
            r2.a(r0)
            r9.a r0 = new r9.a
            r0.<init>()
            r2.a(r0)
            c9.g r0 = new c9.g
            r0.<init>(r4)
            r2.a(r0)
            r1.featureManager = r2
            r8.g r3 = r1.featureContext
            java.lang.String r4 = ", error="
            r3.getClass()
            ub.a r0 = r3.f11626g
            r0.getClass()
            java.lang.String r6 = "terms_accepted"
            android.content.Context r7 = r0.f13668a     // Catch: java.lang.Throwable -> L343
            java.lang.String r9 = "Hchat_global_config"
            android.content.SharedPreferences r7 = ub.b.c(r7, r9)     // Catch: java.lang.Throwable -> L343
            boolean r6 = r7.getBoolean(r6, r8)     // Catch: java.lang.Throwable -> L343
            goto L344
        L343:
            r6 = r8
        L344:
            if (r6 == 0) goto L359
            java.lang.String r6 = "terms_version"
            android.content.Context r0 = r0.f13668a     // Catch: java.lang.Throwable -> L355
            java.lang.String r7 = "Hchat_global_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r7)     // Catch: java.lang.Throwable -> L355
            int r0 = r0.getInt(r6, r8)     // Catch: java.lang.Throwable -> L355
            goto L356
        L355:
            r0 = r8
        L356:
            if (r0 != r5) goto L359
            r8 = r5
        L359:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = r2.f11629a
            java.util.Iterator r6 = r0.iterator()
            r6.getClass()
        L367:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3a9
            java.lang.Object r0 = r6.next()
            r0.getClass()
            r8.f r0 = (r8.f) r0
            java.lang.String r7 = r8.h.b(r0)
            if (r8 != 0) goto L389
            java.lang.String r9 = r0.a()
            java.lang.String r10 = "settings"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L389
            goto L367
        L389:
            r0.d(r3)     // Catch: java.lang.Throwable -> L390
            r5.add(r0)     // Catch: java.lang.Throwable -> L390
            goto L367
        L390:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[Hchat:FeatureManager] onInit 失败: "
            r9.<init>(r10)
            r9.append(r7)
            r9.append(r4)
            r9.append(r0)
            java.lang.String r7 = r9.toString()
            fb.v0.n(r7, r0)
            goto L367
        L3a9:
            java.util.Iterator r5 = r5.iterator()
            r5.getClass()
        L3b0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L401
            java.lang.Object r0 = r5.next()
            r0.getClass()
            r6 = r0
            r8.f r6 = (r8.f) r6
            java.lang.String r7 = r8.h.b(r6)
            boolean r0 = r6.b(r3)     // Catch: java.lang.Throwable -> L3cb
            if (r0 != 0) goto L3d5
            goto L3b0
        L3cb:
            r0 = move-exception
            java.lang.String r8 = "[Hchat:FeatureManager] isEnabled 检查异常，默认启用: "
            java.lang.String r8 = r8.concat(r7)
            fb.v0.n(r8, r0)
        L3d5:
            r6.c(r3)     // Catch: java.lang.Throwable -> L3e8
            java.util.ArrayList r0 = r2.f11630b     // Catch: java.lang.Throwable -> L3e8
            r0.add(r6)     // Catch: java.lang.Throwable -> L3e8
            f8.c r0 = r3.f11625f     // Catch: java.lang.Throwable -> L3b0
            f8.b r6 = new f8.b     // Catch: java.lang.Throwable -> L3b0
            r6.<init>()     // Catch: java.lang.Throwable -> L3b0
            r0.b(r6)     // Catch: java.lang.Throwable -> L3b0
            goto L3b0
        L3e8:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "[Hchat:FeatureManager] 功能安装失败: "
            r6.<init>(r8)
            r6.append(r7)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            fb.v0.n(r6, r0)
            goto L3b0
        L401:
            android.os.Handler r0 = r8.e.f11615a
            r8.c r0 = r8.c.f11603i
            r8.e.a(r0)
            return
        L409:
            monitor-exit(r2)
            throw r0
    }

    private void lambda$installHotUpdateForAttach$1(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5, android.content.Context r6, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r7) {
            r4 = this;
            java.lang.Object r5 = r5.thisObject     // Catch: java.lang.Throwable -> Ld
            java.lang.ClassLoader r5 = r4.resolveTinkerClassLoader(r5)     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto Lf
            java.lang.ClassLoader r5 = r4.resolveHostClassLoader(r6, r7)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r5 = move-exception
            goto L2d
        Lf:
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "libdexkit.so"
            java.lang.String r2 = "dexkit"
            r3 = 0
            sb.a.d(r6, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            android.content.pm.ApplicationInfo r7 = r7.appInfo     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r7.sourceDir     // Catch: java.lang.Throwable -> Ld
            org.luckypray.dexkit.DexKitBridge r7 = r4.createDexKitBridge(r5, r7)     // Catch: java.lang.Throwable -> Ld
            uf.d r0 = v9.b.f14287e     // Catch: java.lang.Throwable -> Ld
            r0.z(r7, r5, r6)     // Catch: java.lang.Throwable -> Ld
            return
        L2d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[Hchat:Entry] 热更新后置安装失败: "
            r6.<init>(r7)
            bc.e.s(r5, r6, r5)
            return
    }

    private /* synthetic */ void lambda$installHotUpdateForAttach$2(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7, android.content.Context r8, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9) {
            r6 = this;
            d8.a r0 = new d8.a
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.e.c(r0)
            return
    }

    private void lambda$installTabletHookForAttach$3(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7, android.content.Context r8, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9, java.lang.String r10) {
            r6 = this;
            java.lang.Object r7 = r7.thisObject
            java.lang.ClassLoader r7 = r6.resolveTinkerClassLoader(r7)
            if (r7 != 0) goto Lc
            java.lang.ClassLoader r7 = r6.resolveHostClassLoader(r8, r9)
        Lc:
            java.util.HashSet r0 = mb.a.f8811e
            r0 = 0
            if (r8 == 0) goto L52
            if (r7 != 0) goto L14
            goto L52
        L14:
            boolean r1 = oh.h.F(r8)
            if (r1 != 0) goto L1b
            goto L52
        L1b:
            java.lang.String r1 = "Hchat_wechat_tablet_cache"
            android.content.SharedPreferences r1 = ub.b.c(r8, r1)
            java.lang.String r2 = oh.h.m(r8, r7)
            boolean r3 = oh.h.H(r7)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "pad_method"
            java.lang.reflect.Method r4 = oh.h.K(r1, r2, r7, r3)
            if (r4 == 0) goto L52
            oh.h.C(r4, r7)
            oh.h.R(r1, r2, r3, r4)
            boolean r3 = oh.h.H(r7)
        L3d:
            boolean r4 = oh.h.G(r7)
            if (r4 != 0) goto L53
            java.lang.String r4 = "login_button_method"
            java.lang.reflect.Method r5 = oh.h.K(r1, r2, r7, r4)
            if (r5 == 0) goto L53
            oh.h.B(r5, r7)
            oh.h.R(r1, r2, r4, r5)
            goto L53
        L52:
            r3 = r0
        L53:
            if (r3 == 0) goto L56
            goto L6a
        L56:
            java.lang.String r1 = "after"
            boolean r10 = r1.equals(r10)
            java.lang.String r1 = "dexkit"
            java.lang.String r2 = "libdexkit.so"
            if (r10 != 0) goto L86
            uf.d r7 = v9.b.f14287e
            boolean r7 = uf.d.C(r8)
            if (r7 != 0) goto L6b
        L6a:
            return
        L6b:
            java.lang.Class r7 = r6.getClass()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            sb.a.d(r8, r7, r2, r1, r0)
            java.lang.ClassLoader r7 = r9.classLoader
            android.content.pm.ApplicationInfo r10 = r9.appInfo
            java.lang.String r10 = r10.sourceDir
            org.luckypray.dexkit.DexKitBridge r7 = r6.createDexKitBridge(r7, r10)
            java.lang.ClassLoader r9 = r9.classLoader
            oh.h.D(r7, r9, r8)
            return
        L86:
            java.lang.Class r10 = r6.getClass()
            java.lang.ClassLoader r10 = r10.getClassLoader()
            sb.a.d(r8, r10, r2, r1, r0)
            android.content.pm.ApplicationInfo r9 = r9.appInfo
            java.lang.String r9 = r9.sourceDir
            org.luckypray.dexkit.DexKitBridge r9 = r6.createDexKitBridge(r7, r9)
            oh.h.D(r9, r7, r8)
            return
    }

    private java.lang.ClassLoader resolveHostClassLoader(android.content.Context r3, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4) {
            r2 = this;
            java.lang.ClassLoader r4 = r4.classLoader
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r3 = r0
        L9:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L11
            java.lang.ClassLoader r0 = r1.getContextClassLoader()     // Catch: java.lang.Throwable -> L11
        L11:
            boolean r1 = r2.isTinkerClassLoader(r3)
            if (r1 == 0) goto L18
            return r3
        L18:
            boolean r1 = r2.isTinkerClassLoader(r0)
            if (r1 == 0) goto L1f
            return r0
        L1f:
            if (r3 == 0) goto L22
            return r3
        L22:
            if (r0 == 0) goto L25
            return r0
        L25:
            return r4
    }

    private java.lang.ClassLoader resolveTinkerClassLoader(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "getClassLoader"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r1, r2)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r4 instanceof java.lang.ClassLoader     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L11
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.Throwable -> L11
            return r4
        L11:
            return r0
    }

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4) {
            r3 = this;
            java.lang.String r0 = r4.packageName
            boolean r0 = r3.isWeChatPackage(r0)
            if (r0 != 0) goto L9
            goto L1e
        L9:
            r3.installHotUpdateEarlyHook(r4)
            r3.installTabletEarlyHook(r4)
            boolean r0 = r3.isMainProcess(r4)
            if (r0 != 0) goto L1f
            boolean r0 = r3.isAppBrandProcess(r4)
            if (r0 == 0) goto L1e
            r3.installAppBrandProcessHook(r4)
        L1e:
            return
        L1f:
            java.lang.ClassLoader r0 = r4.classLoader
            ah.a r1 = new ah.a
            r2 = 22
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = j8.n.f6810d
            java.lang.String r2 = "com.tencent.mars.cdn.CdnManager"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            j8.n.j(r0, r1)
            r3.installHideBottomBarEarlyHook(r4)
            r8.i r0 = r8.i.f11631b
            d8.b r1 = new d8.b
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.String r2 = "onCreate"
            de.robv.android.xposed.XC_MethodHook$Unhook r4 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r2, r4)
            r0.a(r4)
            return
    }
}
