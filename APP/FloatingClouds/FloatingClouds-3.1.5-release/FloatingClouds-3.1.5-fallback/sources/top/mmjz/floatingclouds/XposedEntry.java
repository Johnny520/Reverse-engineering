package top.mmjz.floatingclouds;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Ltop/mmjz/floatingclouds/XposedEntry;", "Lio/github/libxposed/api/XposedModule;", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "processName", "La/Wf;", "initWeChatHooks", "(Ljava/lang/ClassLoader;Ljava/lang/String;)V", "La/J8;", "session", "initPlugins", "(La/J8;)V", "Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;", "param", "onModuleLoaded", "(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;", "onPackageLoaded", "(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;", "onPackageReady", "(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;", "", "onHotReloading", "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;)Z", "Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;", "onHotReloaded", "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;)V", "id", "Lio/github/libxposed/api/XposedInterface$HookHandle;", "handle", "registerHookHandle$app_release", "(Ljava/lang/String;Lio/github/libxposed/api/XposedInterface$HookHandle;)V", "registerHookHandle", "", "hookHandles", "Ljava/util/Map;", "Companion", "a", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class XposedEntry extends io.github.libxposed.api.XposedModule {
    public static final top.mmjz.floatingclouds.XposedEntry.a Companion = null;
    private static final java.lang.String TARGET_PACKAGE = "com.tencent.mm";
    private static top.mmjz.floatingclouds.XposedEntry self;
    private final java.util.Map<java.lang.String, io.github.libxposed.api.XposedInterface.HookHandle> hookHandles;

    public static final class a {
    }

    static {
            top.mmjz.floatingclouds.XposedEntry$a r0 = new top.mmjz.floatingclouds.XposedEntry$a
            r0.<init>()
            top.mmjz.floatingclouds.XposedEntry.Companion = r0
            return
    }

    public XposedEntry() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.hookHandles = r0
            top.mmjz.floatingclouds.XposedEntry.self = r2
            java.lang.String r0 = "Floatingclouds"
            java.lang.String r1 = "Floatingclouds XposedEntry constructed"
            android.util.Log.i(r0, r1)
            return
    }

    public static /* synthetic */ void a(top.mmjz.floatingclouds.XposedEntry r0, a.J8 r1) {
            initPlugins$lambda$12(r0, r1)
            return
    }

    public static final /* synthetic */ top.mmjz.floatingclouds.XposedEntry access$getSelf$cp() {
            top.mmjz.floatingclouds.XposedEntry r0 = top.mmjz.floatingclouds.XposedEntry.self
            return r0
    }

    public static /* synthetic */ java.lang.Object b(java.util.concurrent.atomic.AtomicBoolean r0, a.J8 r1, top.mmjz.floatingclouds.XposedEntry r2, io.github.libxposed.api.XposedInterface.Chain r3) {
            java.lang.Object r0 = initWeChatHooks$lambda$6$lambda$5(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void c(top.mmjz.floatingclouds.XposedEntry r0, a.J8 r1) {
            initWeChatHooks$doInit$lambda$1(r0, r1)
            return
    }

    public static /* synthetic */ java.lang.Object d(java.util.concurrent.atomic.AtomicBoolean r0, a.J8 r1, top.mmjz.floatingclouds.XposedEntry r2, io.github.libxposed.api.XposedInterface.Chain r3) {
            java.lang.Object r0 = initWeChatHooks$lambda$2(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object e(java.util.concurrent.atomic.AtomicBoolean r0, a.J8 r1, top.mmjz.floatingclouds.XposedEntry r2, io.github.libxposed.api.XposedInterface.Chain r3) {
            java.lang.Object r0 = initWeChatHooks$lambda$4$lambda$3(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ io.github.libxposed.api.XposedInterface.HookBuilder f(top.mmjz.floatingclouds.XposedEntry r0, java.lang.reflect.Executable r1) {
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = initWeChatHooks$lambda$0(r0, r1)
            return r0
    }

    private final void initPlugins(a.J8 r20) {
            r19 = this;
            r1 = r20
            r2 = 0
            r3 = 2
            a.K3$a r0 = a.K3.f148a
            java.lang.String r5 = "Migration from "
            java.lang.String r6 = "Legacy package "
            r0.getClass()
            android.content.SharedPreferences r0 = a.K3.a.j()
            java.lang.String r7 = a.K3.g
            boolean r0 = r0.getBoolean(r7, r2)
            r7 = 0
            java.lang.String r8 = "Floatingclouds_Migrate"
            if (r0 == 0) goto L23
            java.lang.String r0 = "Migration skipped (guard set by clearData)"
            android.util.Log.i(r8, r0)
            goto L1cb
        L23:
            java.lang.String r0 = "com.lu.wxmask"
            java.lang.String r9 = "com.lu.wxmask272"
            java.lang.String r10 = "com.lu.floatingclouds"
            java.lang.String[] r0 = new java.lang.String[]{r0, r9, r10}
            java.util.List r0 = a.C0294o3.d0(r0)
            android.content.SharedPreferences r9 = a.K3.a.h()
            java.lang.String r10 = a.K3.c
            java.lang.String r9 = r9.getString(r10, r7)
            if (r9 != 0) goto L45
            android.content.SharedPreferences r9 = a.K3.a.j()
            java.lang.String r9 = r9.getString(r10, r7)
        L45:
            android.content.SharedPreferences r10 = a.K3.a.j()
            java.lang.String r11 = a.K3.b
            java.lang.String r10 = r10.getString(r11, r7)
            java.lang.String r11 = "{}"
            java.lang.String r12 = "[]"
            if (r9 == 0) goto L78
            boolean r13 = a.Be.P(r9)
            if (r13 == 0) goto L5c
            goto L78
        L5c:
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L78
            if (r10 == 0) goto L78
            boolean r9 = a.Be.P(r10)
            if (r9 == 0) goto L6b
            goto L78
        L6b:
            boolean r9 = r10.equals(r12)
            if (r9 != 0) goto L78
            java.lang.String r0 = "Current SP already has data, skipping migration"
            android.util.Log.i(r8, r0)
            goto L1cb
        L78:
            java.util.Iterator r9 = r0.iterator()
            r10 = r2
        L7d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1c3
            java.lang.Object r0 = r9.next()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r0 != 0) goto L90
            goto L194
        L90:
            android.content.Context r0 = r0.createPackageContext(r13, r3)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r14 = "mask_wechat_config"
            r15 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r14, r15)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r14 = a.K3.c     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r15 = r0.getString(r14, r7)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r3 = a.K3.b     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r4 = r0.getString(r3, r7)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r15 == 0) goto L17d
            boolean r17 = a.Be.P(r15)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r17 == 0) goto Lb1
            goto L17d
        Lb1:
            boolean r17 = r15.equals(r11)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r17 != 0) goto L17d
            if (r4 == 0) goto L17d
            boolean r17 = a.Be.P(r4)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r17 == 0) goto Lc1
            goto L17d
        Lc1:
            boolean r17 = r4.equals(r12)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r17 != 0) goto L17d
            android.content.SharedPreferences r17 = a.K3.a.j()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r2 = r17.edit()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r2 = r2.putString(r14, r15)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r2.putString(r3, r4)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            int r2 = r15.length()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            int r3 = r4.length()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r4.<init>()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r7 = "Migrated options("
            r4.append(r7)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r4.append(r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = "B) + maskList("
            r4.append(r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r4.append(r3)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = "B) from "
            r4.append(r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r4.append(r13)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = " → top.mmjz.floatingclouds"
            r4.append(r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.util.Log.i(r8, r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences r2 = a.K3.a.h()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r2 = r2.putString(r14, r15)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r2.commit()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = a.K3.e     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r3 = 0
            java.lang.String r4 = r0.getString(r2, r3)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r4 == 0) goto L13e
            boolean r3 = a.Be.P(r4)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r3 == 0) goto L126
            goto L13e
        L126:
            boolean r3 = r4.equals(r12)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r3 != 0) goto L13e
            android.content.SharedPreferences r3 = a.K3.a.j()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r2 = r3.putString(r2, r4)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r2.apply()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            goto L13e
        L13c:
            r0 = move-exception
            goto L199
        L13e:
            java.lang.String r2 = a.K3.d     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r3 = 0
            boolean r0 = r0.getBoolean(r2, r3)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            if (r0 == 0) goto L157
            android.content.SharedPreferences r0 = a.K3.a.j()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r3 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r0.apply()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
        L157:
            r17 = 0
            a.K3.j = r17     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            a.K3.k = r17     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            a.K3.l = r17     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            r0.<init>()     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            r0.append(r5)     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            r0.append(r13)     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            java.lang.String r2 = " complete. Invalidate cache and reload."
            r0.append(r2)     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            android.util.Log.i(r8, r0)     // Catch: java.lang.Exception -> L178 android.content.pm.PackageManager.NameNotFoundException -> L17b
            r10 = 1
            goto L1c3
        L178:
            r0 = move-exception
            r10 = 1
            goto L199
        L17b:
            r10 = 1
            goto L1ae
        L17d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r0.<init>()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r0.append(r6)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            r0.append(r13)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r2 = " has no data, skip"
            r0.append(r2)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
            android.util.Log.d(r8, r0)     // Catch: java.lang.Exception -> L13c android.content.pm.PackageManager.NameNotFoundException -> L1ae
        L194:
            r2 = 0
            r3 = 2
            r7 = 0
            goto L7d
        L199:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r13)
            java.lang.String r3 = " failed"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r8, r2, r0)
            goto L194
        L1ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r13)
            java.lang.String r2 = " not installed, skip"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r8, r0)
            goto L194
        L1c3:
            if (r10 != 0) goto L1ca
            java.lang.String r0 = "No legacy data found to migrate"
            android.util.Log.i(r8, r0)
        L1ca:
            r2 = r10
        L1cb:
            if (r2 == 0) goto L1d6
            java.lang.String r0 = "Legacy config migrated"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L1d6:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            r17 = 0
            a.K3.j = r17
            a.K3.k = r17
            a.K3.l = r17
            java.util.concurrent.atomic.AtomicBoolean r0 = a.Yc.d
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 != 0) goto L1ee
            goto L20e
        L1ee:
            android.content.Context r0 = a.C0435w1.p
            if (r0 == 0) goto L1fa
            java.lang.String r0 = "fc_remote_killswitch"
            android.content.SharedPreferences r0 = a.C0282n9.s(r0)
            a.Yc.e = r0
        L1fa:
            java.lang.Thread r0 = new java.lang.Thread
            a.l0 r2 = new a.l0
            r3 = 2
            r2.<init>(r3)
            java.lang.String r3 = "fc-remote-killswitch"
            r0.<init>(r2, r3)
            r3 = 1
            r0.setDaemon(r3)
            r0.start()
        L20e:
            a.jc r0 = a.K3.a.i()
            boolean r2 = r0.L
            boolean r3 = r0.n
            boolean r4 = r0.s
            boolean r5 = r0.o
            boolean r0 = r0.f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Loaded: master="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " hideConv="
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = " blockChat="
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = " hideContact="
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = " hideSns="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            a.x3 r0 = new a.x3
            r0.<init>()
            a.fh r2 = new a.fh
            r2.<init>()
            r3 = 2
            top.mmjz.floatingclouds.plugin.IPlugin[] r3 = new top.mmjz.floatingclouds.plugin.IPlugin[r3]
            r18 = 0
            r3[r18] = r0
            r16 = 1
            r3[r16] = r2
            java.util.List r0 = a.C0294o3.d0(r3)
            java.util.Iterator r2 = r0.iterator()
            r3 = r18
        L270:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2de
            java.lang.Object r0 = r2.next()
            int r4 = r3 + 1
            if (r3 < 0) goto L2d6
            r5 = r0
            top.mmjz.floatingclouds.plugin.IPlugin r5 = (top.mmjz.floatingclouds.plugin.IPlugin) r5
            java.util.LinkedHashMap r0 = a.C0482yc.f771a     // Catch: java.lang.Throwable -> L2bc
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L2bc
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L2bc
            java.util.LinkedHashMap r6 = a.C0482yc.f771a     // Catch: java.lang.Throwable -> L2bc
            r6.put(r0, r5)     // Catch: java.lang.Throwable -> L2bc
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L2bc
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L2bc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2bc
            r6.<init>()     // Catch: java.lang.Throwable -> L2bc
            java.lang.String r7 = "init plugin ["
            r6.append(r7)     // Catch: java.lang.Throwable -> L2bc
            r6.append(r3)     // Catch: java.lang.Throwable -> L2bc
            java.lang.String r3 = "]: "
            r6.append(r3)     // Catch: java.lang.Throwable -> L2bc
            r6.append(r0)     // Catch: java.lang.Throwable -> L2bc
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L2bc
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2bc
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L2bc
            r5.handleHook(r1)     // Catch: java.lang.Throwable -> L2bc
            goto L2d2
        L2bc:
            r0 = move-exception
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r5 = "init plugin failed: "
            java.lang.String r3 = r5.concat(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            a.C0453x1.a(r0)
        L2d2:
            r3 = r4
            r16 = 1
            goto L270
        L2d6:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
        L2de:
            boolean r0 = a.C0279n6.f595a
            android.content.Context r0 = a.C0435w1.p
            a.C0193i9.b(r0)
            java.lang.ClassLoader r2 = r1.f136a
            a.C0279n6.a(r0)
            a.hg r0 = a.C0182hg.f502a     // Catch: java.lang.Throwable -> L335
            java.lang.ClassLoader r2 = r1.f136a     // Catch: java.lang.Throwable -> L335
            r0.getClass()     // Catch: java.lang.Throwable -> L335
            a.ig r0 = a.C0182hg.c(r2)     // Catch: java.lang.Throwable -> L335
            java.lang.String r2 = r0.b     // Catch: java.lang.Throwable -> L335
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L335
            if (r2 <= 0) goto L2ff
            r2 = 1
            goto L301
        L2ff:
            r2 = r18
        L301:
            if (r2 == 0) goto L337
            a.K3$a r2 = a.K3.f148a     // Catch: java.lang.Throwable -> L335
            r2.getClass()     // Catch: java.lang.Throwable -> L335
            a.K3.a.p(r0)     // Catch: java.lang.Throwable -> L335
            a.K3.a.q(r0)     // Catch: java.lang.Throwable -> L335
            java.lang.String r2 = r0.b     // Catch: java.lang.Throwable -> L335
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L335
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L335
            r3.<init>()     // Catch: java.lang.Throwable -> L335
            java.lang.String r4 = "VersionSnapshot captured: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L335
            r3.append(r2)     // Catch: java.lang.Throwable -> L335
            java.lang.String r2 = " hotUpdated="
            r3.append(r2)     // Catch: java.lang.Throwable -> L335
            r3.append(r0)     // Catch: java.lang.Throwable -> L335
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L335
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L335
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L335
            goto L337
        L335:
            r0 = move-exception
            goto L33a
        L337:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L335
            goto L33e
        L33a:
            a.wd$a r0 = a.C0465xd.a(r0)
        L33e:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L34d
            java.lang.String r2 = "VersionSnapshot collect failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            a.C0453x1.e(r0)
        L34d:
            a.if r0 = a.Cif.f512a
            r0.getClass()
            a.Cif.c()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            a.zh r2 = new a.zh
            r4 = 1
            r3 = r19
            r2.<init>(r3, r1, r4)
            r4 = 15000(0x3a98, double:7.411E-320)
            r0.postDelayed(r2, r4)
            return
    }

    private static final void initPlugins$lambda$12(top.mmjz.floatingclouds.XposedEntry r2, a.J8 r3) {
            java.lang.String r2 = "VersionSnapshot delayed re-collect: tag="
            a.hg r0 = a.C0182hg.f502a     // Catch: java.lang.Throwable -> L44
            java.lang.ClassLoader r3 = r3.f136a     // Catch: java.lang.Throwable -> L44
            r0.getClass()     // Catch: java.lang.Throwable -> L44
            a.ig r3 = a.C0182hg.c(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r3.b     // Catch: java.lang.Throwable -> L44
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L44
            if (r0 <= 0) goto L41
            java.lang.String r0 = r3.d
            if (r0 == 0) goto L41
            a.K3$a r1 = a.K3.f148a     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            a.K3.a.p(r3)     // Catch: java.lang.Throwable -> L44
            a.K3.a.q(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.k     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44
            r1.append(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = " b.ver="
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            r1.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L44
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L44
        L41:
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L49:
            java.lang.Throwable r2 = a.C0447wd.a(r2)
            if (r2 == 0) goto L58
            java.lang.String r3 = "VersionSnapshot delayed collect failed"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            a.C0453x1.e(r2)
        L58:
            return
    }

    private final void initWeChatHooks(java.lang.ClassLoader r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "onCreate"
            java.lang.String r1 = "android.app.Application"
            java.lang.String r2 = "initWeChatHooks start process="
            java.lang.String r2 = a.C0487z.k(r2, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.b(r2)
            a.C0435w1.g = r8
            a.J8 r2 = new a.J8     // Catch: java.lang.Throwable -> L67
            a.t r3 = new a.t     // Catch: java.lang.Throwable -> L67
            r4 = 9
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L67
            r2.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L67
            a.if r8 = a.Cif.f512a     // Catch: java.lang.Throwable -> L67
            r8.getClass()     // Catch: java.lang.Throwable -> L67
            a.Cif.d(r2)     // Catch: java.lang.Throwable -> L67
            a.Cif.a()     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L67
            r9 = 0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "attach"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L67
            a.Ah r5 = new a.Ah     // Catch: java.lang.Throwable -> L67
            r6 = 0
            r5.<init>(r8, r2, r7, r6)     // Catch: java.lang.Throwable -> L67
            a.J8.a(r2, r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "com.tencent.mm.app.GPApplication"
            java.lang.Class[] r4 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L50
            a.Ah r5 = new a.Ah     // Catch: java.lang.Throwable -> L50
            r6 = 1
            r5.<init>(r8, r2, r7, r6)     // Catch: java.lang.Throwable -> L50
            io.github.libxposed.api.XposedInterface$HookHandle r3 = a.J8.a(r2, r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r3 = move-exception
            a.wd$a r3 = a.C0465xd.a(r3)     // Catch: java.lang.Throwable -> L67
        L55:
            java.lang.Throwable r3 = a.C0447wd.a(r3)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L71
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L67
            a.Ah r3 = new a.Ah     // Catch: java.lang.Throwable -> L67
            r4 = 2
            r3.<init>(r8, r2, r7, r4)     // Catch: java.lang.Throwable -> L67
            a.J8.a(r2, r1, r0, r9, r3)     // Catch: java.lang.Throwable -> L67
            goto L71
        L67:
            r8 = move-exception
            java.lang.String r9 = "initWeChatHooks failed"
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            a.C0453x1.a(r8)
        L71:
            java.lang.String r8 = "initWeChatHooks done"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            a.C0453x1.b(r8)
            return
    }

    private static final void initWeChatHooks$doInit(java.util.concurrent.atomic.AtomicBoolean r5, a.J8 r6, top.mmjz.floatingclouds.XposedEntry r7, android.content.Context r8) {
            java.lang.String r0 = "dexkit_scan_cache"
            r1 = 0
            r2 = 1
            boolean r5 = r5.compareAndSet(r1, r2)
            if (r5 != 0) goto Lb
            return
        Lb:
            a.C0435w1.p = r8
            a.C0435w1.D(r8)
            java.lang.String r5 = r8.getPackageName()
            java.lang.String r2 = "AppContext attached, using WeChat context: "
            java.lang.String r5 = a.C0487z.k(r2, r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.b(r5)
            android.content.SharedPreferences r5 = r8.getSharedPreferences(r0, r1)     // Catch: java.lang.Exception -> L62
            java.util.Map r5 = r5.getAll()     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "getAll(...)"
            a.C0193i9.d(r5, r2)     // Catch: java.lang.Exception -> L62
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L62
            int r3 = r5.size()     // Catch: java.lang.Exception -> L62
            int r3 = a.C0048aa.C(r3)     // Catch: java.lang.Exception -> L62
            r2.<init>(r3)     // Catch: java.lang.Exception -> L62
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Exception -> L62
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L62
        L43:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L64
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Exception -> L62
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> L62
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Exception -> L62
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> L62
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L62
            r2.put(r4, r3)     // Catch: java.lang.Exception -> L62
            goto L43
        L62:
            a.Z5 r2 = a.Z5.f369a
        L64:
            a.C0043a5.f384a = r2
            int r5 = r2.size()
            java.lang.String r2 = "DexKitCache: self="
            java.lang.String r3 = " keys"
            java.lang.String r5 = a.C0487z.c(r5, r2, r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.b(r5)
            boolean r5 = a.C0279n6.f595a
            android.content.SharedPreferences r5 = r8.getSharedPreferences(r0, r1)
            java.util.Map r5 = r5.getAll()
            int r5 = r5.size()
            boolean r8 = a.C0043a5.f()
            a.C0279n6.l = r5
            a.C0279n6.m = r8
            if (r8 == 0) goto L94
            java.lang.String r0 = "OK"
            goto L9b
        L94:
            if (r5 <= 0) goto L99
            java.lang.String r0 = "WARN"
            goto L9b
        L99:
            java.lang.String r0 = "FAIL"
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[DIAG-HEALTH] module=DexKitCache status="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " selfKeys="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " inkKeys=0 ready="
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = r2.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.b(r5)
            a.ch r5 = new a.ch     // Catch: java.lang.Throwable -> Ld9
            r5.<init>()     // Catch: java.lang.Throwable -> Ld9
            r5.handleHook(r6)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = "WXDbPlugin"
            java.util.LinkedHashMap r0 = a.C0482yc.f771a     // Catch: java.lang.Throwable -> Ld9
            r0.put(r8, r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "WXDbPlugin registered early (before delayed init)"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Ld9
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> Ld9
            goto Le3
        Ld9:
            r5 = move-exception
            java.lang.String r8 = "WXDbPlugin early register failed"
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r5}
            a.C0453x1.a(r5)
        Le3:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r5.<init>(r8)
            a.zh r8 = new a.zh
            r8.<init>(r7, r6, r1)
            r5.post(r8)
            return
    }

    private static final void initWeChatHooks$doInit$lambda$1(top.mmjz.floatingclouds.XposedEntry r0, a.J8 r1) {
            r0.initPlugins(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "initPlugins (delayed) failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.a(r0)
            return
    }

    private static final io.github.libxposed.api.XposedInterface.HookBuilder initWeChatHooks$lambda$0(top.mmjz.floatingclouds.XposedEntry r1, java.lang.reflect.Executable r2) {
            java.lang.String r0 = "executable"
            a.C0193i9.e(r2, r0)
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.hook(r2)
            java.lang.String r2 = "hook(...)"
            a.C0193i9.d(r1, r2)
            return r1
    }

    private static final java.lang.Object initWeChatHooks$lambda$2(java.util.concurrent.atomic.AtomicBoolean r2, a.J8 r3, top.mmjz.floatingclouds.XposedEntry r4, io.github.libxposed.api.XposedInterface.Chain r5) {
            java.lang.String r0 = "chain"
            a.C0193i9.e(r5, r0)
            java.lang.Object r0 = r5.proceed()
            java.util.List r5 = r5.getArgs()
            r1 = 0
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof android.content.Context
            if (r1 == 0) goto L19
            android.content.Context r5 = (android.content.Context) r5
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 == 0) goto L1f
            initWeChatHooks$doInit(r2, r3, r4, r5)
        L1f:
            return r0
    }

    private static final java.lang.Object initWeChatHooks$lambda$4$lambda$3(java.util.concurrent.atomic.AtomicBoolean r2, a.J8 r3, top.mmjz.floatingclouds.XposedEntry r4, io.github.libxposed.api.XposedInterface.Chain r5) {
            java.lang.String r0 = "chain"
            a.C0193i9.e(r5, r0)
            java.lang.Object r0 = r5.proceed()
            java.lang.Object r5 = r5.getThisObject()
            boolean r1 = r5 instanceof android.app.Application
            if (r1 == 0) goto L14
            android.app.Application r5 = (android.app.Application) r5
            goto L15
        L14:
            r5 = 0
        L15:
            if (r5 == 0) goto L1a
            initWeChatHooks$doInit(r2, r3, r4, r5)
        L1a:
            return r0
    }

    private static final java.lang.Object initWeChatHooks$lambda$6$lambda$5(java.util.concurrent.atomic.AtomicBoolean r2, a.J8 r3, top.mmjz.floatingclouds.XposedEntry r4, io.github.libxposed.api.XposedInterface.Chain r5) {
            java.lang.String r0 = "chain"
            a.C0193i9.e(r5, r0)
            java.lang.Object r0 = r5.proceed()
            java.lang.Object r5 = r5.getThisObject()
            boolean r1 = r5 instanceof android.app.Application
            if (r1 == 0) goto L14
            android.app.Application r5 = (android.app.Application) r5
            goto L15
        L14:
            r5 = 0
        L15:
            if (r5 == 0) goto L1a
            initWeChatHooks$doInit(r2, r3, r4, r5)
        L1a:
            return r0
    }

    public void onHotReloaded(io.github.libxposed.api.XposedModuleInterface.HotReloadedParam r6) {
            r5 = this;
            java.lang.String r0 = "param"
            a.C0193i9.e(r6, r0)
            java.lang.String r6 = r6.getProcessName()
            java.lang.String r0 = "onHotReloaded: process="
            java.lang.String r6 = a.C0487z.k(r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            a.C0453x1.b(r6)
            java.util.Map<java.lang.String, io.github.libxposed.api.XposedInterface$HookHandle> r6 = r5.hookHandles
            r6.clear()
            a.x8 r6 = a.C0460x8.f762a
            a.ca$c r0 = a.C0086ca.c.d
            r6.b(r0)
            r6 = 0
            a.C0366s4.F = r6
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Object r0 = a.Rb.g
            monitor-enter(r0)
            r1 = 0
            a.Rb.d = r1     // Catch: java.lang.Throwable -> L6f
            a.Rb.e = r6     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            a.Rb.f = r2     // Catch: java.lang.Throwable -> L6f
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            java.lang.String r0 = "ObfResolv: cache invalidated"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r4 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            a.Gb r0 = a.Gb.f99a
            r0.getClass()
            java.lang.Object r0 = a.Gb.k
            monitor-enter(r0)
            a.Gb.h = r1     // Catch: java.lang.Throwable -> L6c
            a.Gb.i = r6     // Catch: java.lang.Throwable -> L6c
            a.Gb.j = r2     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            a.jf r0 = a.C0216jf.f536a
            r0.getClass()
            a.C0216jf.c = r1
            a.C0216jf.d = r6
            java.lang.String r6 = "NONE"
            a.C0216jf.e = r6
            a.jg r6 = a.C0217jg.f537a
            r6.getClass()
            a.C0217jg.e()
            return
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L6f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public boolean onHotReloading(io.github.libxposed.api.XposedModuleInterface.HotReloadingParam r2) {
            r1 = this;
            java.lang.String r0 = "param"
            a.C0193i9.e(r2, r0)
            java.lang.String r2 = "onHotReloading triggered — returning true to allow hot reload"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.b(r2)
            r2 = 1
            return r2
    }

    public void onModuleLoaded(io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam r5) {
            r4 = this;
            java.lang.String r0 = "param"
            a.C0193i9.e(r5, r0)
            java.lang.String r0 = r5.getProcessName()
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "onModuleLoaded:"
            java.lang.String r3 = "pid="
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r3, r1}
            a.C0453x1.b(r0)
            java.lang.String r0 = r5.getProcessName()
            java.lang.String r1 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = r5.getProcessName()
            java.lang.String r1 = "top.mmjz.floatingclouds"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = "Skipping non-target process:"
            java.lang.String r5 = r5.getProcessName()
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            a.C0453x1.b(r5)
        L41:
            return
    }

    public void onPackageLoaded(io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam r4) {
            r3 = this;
            java.lang.String r0 = "param"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L1e
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "top.mmjz.floatingclouds"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L1e
            return
        L1e:
            java.lang.String r0 = r4.getPackageName()
            boolean r4 = r4.isFirstPackage()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r1 = "onPackageLoaded:"
            java.lang.String r2 = "isFirst="
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r0, r2, r4}
            a.C0453x1.b(r4)
            return
    }

    public void onPackageReady(io.github.libxposed.api.XposedModuleInterface.PackageReadyParam r7) {
            r6 = this;
            java.lang.String r0 = "param"
            a.C0193i9.e(r7, r0)
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r1 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r1)
            java.lang.String r1 = "top.mmjz.floatingclouds"
            if (r0 != 0) goto L1e
            java.lang.String r0 = r7.getPackageName()
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L1e
            goto L58
        L1e:
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.processName
            if (r0 != 0) goto L31
        L28:
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r2 = "getPackageName(...)"
            a.C0193i9.d(r0, r2)
        L31:
            java.lang.String r2 = r7.getPackageName()
            java.lang.String r3 = "classLoader ready"
            java.lang.String r4 = "onPackageReady:"
            java.lang.String r5 = "process="
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r5, r0, r3}
            a.C0453x1.b(r2)
            java.lang.String r2 = r7.getPackageName()
            boolean r1 = a.C0193i9.a(r2, r1)
            if (r1 != 0) goto L58
            java.lang.ClassLoader r7 = r7.getClassLoader()
            java.lang.String r1 = "getClassLoader(...)"
            a.C0193i9.d(r7, r1)
            r6.initWeChatHooks(r7, r0)
        L58:
            return
    }

    public final void registerHookHandle$app_release(java.lang.String r2, io.github.libxposed.api.XposedInterface.HookHandle r3) {
            r1 = this;
            java.lang.String r0 = "id"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "handle"
            a.C0193i9.e(r3, r0)
            java.util.Map<java.lang.String, io.github.libxposed.api.XposedInterface$HookHandle> r0 = r1.hookHandles
            r0.put(r2, r3)
            return
    }
}
