package top.mmjz.floatingclouds;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000a.C0034Be;
import p000a.C0122Gb;
import p000a.C0173J8;
import p000a.C0186K3;
import p000a.C0319Rb;
import p000a.C0413Wf;
import p000a.C0446Yc;
import p000a.C0457Z5;
import p000a.C0475a5;
import p000a.C0480aa;
import p000a.C0518ca;
import p000a.C0525ch;
import p000a.C0582fh;
import p000a.C0619hg;
import p000a.C0631i9;
import p000a.C0637if;
import p000a.C0638ig;
import p000a.C0653jc;
import p000a.C0656jf;
import p000a.C0657jg;
import p000a.C0723n6;
import p000a.C0726n9;
import p000a.C0739o3;
import p000a.C0816s4;
import p000a.C0830t;
import p000a.C0889w1;
import p000a.C0901wd;
import p000a.C0908x1;
import p000a.C0910x3;
import p000a.C0915x8;
import p000a.C0920xd;
import p000a.C0938yc;
import p000a.C0944z;
import p000a.InterfaceC0064D7;
import p000a.RunnableC0679l0;
import p000a.RunnableC0962zh;
import top.mmjz.floatingclouds.XposedEntry;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m3303d2 = {"Ltop/mmjz/floatingclouds/XposedEntry;", "Lio/github/libxposed/api/XposedModule;", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "processName", "La/Wf;", "initWeChatHooks", "(Ljava/lang/ClassLoader;Ljava/lang/String;)V", "La/J8;", "session", "initPlugins", "(La/J8;)V", "Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;", "param", "onModuleLoaded", "(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;", "onPackageLoaded", "(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;", "onPackageReady", "(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V", "Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;", "", "onHotReloading", "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;)Z", "Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;", "onHotReloaded", "(Lio/github/libxposed/api/XposedModuleInterface$HotReloadedParam;)V", "id", "Lio/github/libxposed/api/XposedInterface$HookHandle;", "handle", "registerHookHandle$app_release", "(Ljava/lang/String;Lio/github/libxposed/api/XposedInterface$HookHandle;)V", "registerHookHandle", "", "hookHandles", "Ljava/util/Map;", "Companion", "a", "app_release"}, m3304k = 1, m3305mv = {2, 0, 0}, m3307xi = 48)
public final class XposedEntry extends XposedModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String TARGET_PACKAGE = "com.tencent.mm";
    private static XposedEntry self;
    private final Map<String, XposedInterface.HookHandle> hookHandles = new LinkedHashMap();

    /* JADX INFO: renamed from: top.mmjz.floatingclouds.XposedEntry$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public XposedEntry() {
        self = this;
        Log.i("Floatingclouds", "Floatingclouds XposedEntry constructed");
    }

    private final void initPlugins(C0173J8 session) {
        Object objM2206a;
        boolean z = false;
        int i = 2;
        C0186K3.f638a.getClass();
        String str = null;
        if (C0186K3.a.m509j().getBoolean(C0186K3.f644g, false)) {
            Log.i("Floatingclouds_Migrate", "Migration skipped (guard set by clearData)");
        } else {
            List listM1757d0 = C0739o3.m1757d0("com.lu.wxmask", "com.lu.wxmask272", "com.lu.floatingclouds");
            SharedPreferences sharedPreferencesM507h = C0186K3.a.m507h();
            String str2 = C0186K3.f640c;
            String string = sharedPreferencesM507h.getString(str2, null);
            if (string == null) {
                string = C0186K3.a.m509j().getString(str2, null);
            }
            String string2 = C0186K3.a.m509j().getString(C0186K3.f639b, null);
            if (string == null || C0034Be.m101P(string) || string.equals("{}") || string2 == null || C0034Be.m101P(string2) || string2.equals("[]")) {
                Iterator it = listM1757d0.iterator();
                boolean z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    try {
                        Context context = C0889w1.f3488p;
                        if (context != null) {
                            SharedPreferences sharedPreferences = context.createPackageContext(str3, i).getSharedPreferences("mask_wechat_config", 4);
                            String str4 = C0186K3.f640c;
                            String string3 = sharedPreferences.getString(str4, str);
                            String str5 = C0186K3.f639b;
                            String string4 = sharedPreferences.getString(str5, str);
                            if (string3 != null && !C0034Be.m101P(string3) && !string3.equals("{}") && string4 != null && !C0034Be.m101P(string4) && !string4.equals("[]")) {
                                C0186K3.a.m509j().edit().putString(str4, string3).putString(str5, string4);
                                Log.i("Floatingclouds_Migrate", "Migrated options(" + string3.length() + "B) + maskList(" + string4.length() + "B) from " + str3 + " → top.mmjz.floatingclouds");
                                C0186K3.a.m507h().edit().putString(str4, string3).commit();
                                String str6 = C0186K3.f642e;
                                String string5 = sharedPreferences.getString(str6, null);
                                if (string5 != null && !C0034Be.m101P(string5) && !string5.equals("[]")) {
                                    C0186K3.a.m509j().edit().putString(str6, string5).apply();
                                }
                                String str7 = C0186K3.f641d;
                                if (sharedPreferences.getBoolean(str7, false)) {
                                    C0186K3.a.m509j().edit().putBoolean(str7, true).apply();
                                }
                                try {
                                    C0186K3.f647j = null;
                                    C0186K3.f648k = null;
                                    C0186K3.f649l = null;
                                    Log.i("Floatingclouds_Migrate", "Migration from " + str3 + " complete. Invalidate cache and reload.");
                                    z2 = true;
                                    break;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    z2 = true;
                                    Log.d("Floatingclouds_Migrate", "Legacy package " + str3 + " not installed, skip");
                                    i = 2;
                                    str = null;
                                } catch (Exception e) {
                                    e = e;
                                    z2 = true;
                                    Log.w("Floatingclouds_Migrate", "Migration from " + str3 + " failed", e);
                                    i = 2;
                                    str = null;
                                }
                            }
                            Log.d("Floatingclouds_Migrate", "Legacy package " + str3 + " has no data, skip");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    } catch (Exception e2) {
                        e = e2;
                    }
                    i = 2;
                    str = null;
                }
                if (!z2) {
                    Log.i("Floatingclouds_Migrate", "No legacy data found to migrate");
                }
                z = z2;
            } else {
                Log.i("Floatingclouds_Migrate", "Current SP already has data, skipping migration");
            }
        }
        if (z) {
            C0908x1.m2194b("Legacy config migrated");
        }
        C0186K3.f638a.getClass();
        C0186K3.f647j = null;
        C0186K3.f648k = null;
        C0186K3.f649l = null;
        if (C0446Yc.f1661d.compareAndSet(false, true)) {
            if (C0889w1.f3488p != null) {
                C0446Yc.f1662e = C0726n9.m1676s("fc_remote_killswitch");
            }
            Thread thread = new Thread(new RunnableC0679l0(2), "fc-remote-killswitch");
            thread.setDaemon(true);
            thread.start();
        }
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        C0908x1.m2194b("Loaded: master=" + c0653jcM508i.f2420L + " hideConv=" + c0653jcM508i.f2444n + " blockChat=" + c0653jcM508i.f2449s + " hideContact=" + c0653jcM508i.f2445o + " hideSns=" + c0653jcM508i.f2436f);
        int i2 = 0;
        for (Object obj : C0739o3.m1757d0(new C0910x3(), new C0582fh())) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            IPlugin iPlugin = (IPlugin) obj;
            try {
                LinkedHashMap linkedHashMap = C0938yc.f3550a;
                C0938yc.f3550a.put(iPlugin.getClass().getSimpleName(), iPlugin);
                C0908x1.m2194b("init plugin [" + i2 + "]: " + iPlugin.getClass().getSimpleName());
                iPlugin.handleHook(session);
            } catch (Throwable th) {
                C0908x1.m2193a("init plugin failed: ".concat(iPlugin.getClass().getSimpleName()), th);
            }
            i2 = i3;
        }
        boolean z3 = C0723n6.f2804a;
        Context context2 = C0889w1.f3488p;
        C0631i9.m1479b(context2);
        ClassLoader classLoader = session.f608a;
        C0723n6.m1653a(context2);
        try {
            C0619hg c0619hg = C0619hg.f2288a;
            ClassLoader classLoader2 = session.f608a;
            c0619hg.getClass();
            C0638ig c0638igM1472c = C0619hg.m1472c(classLoader2);
            if (c0638igM1472c.f2331b.length() > 0) {
                C0186K3.f638a.getClass();
                C0186K3.a.m515p(c0638igM1472c);
                C0186K3.a.m516q(c0638igM1472c);
                C0908x1.m2194b("VersionSnapshot captured: " + c0638igM1472c.f2331b + " hotUpdated=" + c0638igM1472c.m1497a());
            }
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("VersionSnapshot collect failed", thM2189a);
        }
        C0637if.f2311a.getClass();
        C0637if.m1489c();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0962zh(this, session, 1), 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPlugins$lambda$12(XposedEntry xposedEntry, C0173J8 c0173j8) {
        Object objM2206a;
        String str;
        try {
            C0619hg c0619hg = C0619hg.f2288a;
            ClassLoader classLoader = c0173j8.f608a;
            c0619hg.getClass();
            C0638ig c0638igM1472c = C0619hg.m1472c(classLoader);
            if (c0638igM1472c.f2331b.length() > 0 && (str = c0638igM1472c.f2333d) != null) {
                C0186K3.f638a.getClass();
                C0186K3.a.m515p(c0638igM1472c);
                C0186K3.a.m516q(c0638igM1472c);
                C0908x1.m2194b("VersionSnapshot delayed re-collect: tag=" + str + " b.ver=" + c0638igM1472c.f2340k);
            }
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("VersionSnapshot delayed collect failed", thM2189a);
        }
    }

    private final void initWeChatHooks(ClassLoader classLoader, String processName) {
        XposedInterface.HookHandle hookHandleM2206a;
        C0908x1.m2194b(C0944z.m2231k("initWeChatHooks start process=", processName));
        C0889w1.f3479g = classLoader;
        try {
            final C0173J8 c0173j8 = new C0173J8(classLoader, processName, new C0830t(9, this));
            C0637if.f2311a.getClass();
            C0637if.m1490d(c0173j8);
            C0637if.m1487a();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            C0173J8.m463a(c0173j8, "android.app.Application", "attach", new Class[]{Context.class}, new InterfaceC0064D7() { // from class: a.Ah
                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                public final Object mo53f(Object obj) {
                    switch (i) {
                        case 0:
                            return XposedEntry.initWeChatHooks$lambda$2(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                        case 1:
                            return XposedEntry.initWeChatHooks$lambda$4$lambda$3(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                        default:
                            return XposedEntry.initWeChatHooks$lambda$6$lambda$5(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                    }
                }
            });
            try {
                final int i2 = 1;
                hookHandleM2206a = C0173J8.m463a(c0173j8, "com.tencent.mm.app.GPApplication", "onCreate", new Class[0], new InterfaceC0064D7() { // from class: a.Ah
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        switch (i2) {
                            case 0:
                                return XposedEntry.initWeChatHooks$lambda$2(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                            case 1:
                                return XposedEntry.initWeChatHooks$lambda$4$lambda$3(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                            default:
                                return XposedEntry.initWeChatHooks$lambda$6$lambda$5(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                        }
                    }
                });
            } catch (Throwable th) {
                hookHandleM2206a = C0920xd.m2206a(th);
            }
            if (C0901wd.m2189a(hookHandleM2206a) != null) {
                final int i3 = 2;
                C0173J8.m463a(c0173j8, "android.app.Application", "onCreate", new Class[0], new InterfaceC0064D7() { // from class: a.Ah
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        switch (i3) {
                            case 0:
                                return XposedEntry.initWeChatHooks$lambda$2(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                            case 1:
                                return XposedEntry.initWeChatHooks$lambda$4$lambda$3(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                            default:
                                return XposedEntry.initWeChatHooks$lambda$6$lambda$5(atomicBoolean, c0173j8, this, (XposedInterface.Chain) obj);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            C0908x1.m2193a("initWeChatHooks failed", th2);
        }
        C0908x1.m2194b("initWeChatHooks done");
    }

    private static final void initWeChatHooks$doInit(AtomicBoolean atomicBoolean, C0173J8 c0173j8, XposedEntry xposedEntry, Context context) {
        Map linkedHashMap;
        int i = 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            C0889w1.f3488p = context;
            C0889w1.m2118D(context);
            C0908x1.m2194b(C0944z.m2231k("AppContext attached, using WeChat context: ", context.getPackageName()));
            try {
                Map<String, ?> all = context.getSharedPreferences("dexkit_scan_cache", 0).getAll();
                C0631i9.m1481d(all, "getAll(...)");
                linkedHashMap = new LinkedHashMap(C0480aa.m1169C(all.size()));
                for (Object obj : all.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), String.valueOf(((Map.Entry) obj).getValue()));
                }
            } catch (Exception unused) {
                linkedHashMap = C0457Z5.f1721a;
            }
            C0475a5.f1753a = linkedHashMap;
            C0908x1.m2194b(C0944z.m2223c(linkedHashMap.size(), "DexKitCache: self=", " keys"));
            boolean z = C0723n6.f2804a;
            int size = context.getSharedPreferences("dexkit_scan_cache", 0).getAll().size();
            boolean zM1157f = C0475a5.m1157f();
            C0723n6.f2815l = size;
            C0723n6.f2816m = zM1157f;
            C0908x1.m2194b("[DIAG-HEALTH] module=DexKitCache status=" + (zM1157f ? "OK" : size > 0 ? "WARN" : "FAIL") + " selfKeys=" + size + " inkKeys=0 ready=" + zM1157f);
            try {
                C0525ch c0525ch = new C0525ch();
                c0525ch.handleHook(c0173j8);
                C0938yc.f3550a.put("WXDbPlugin", c0525ch);
                C0908x1.m2194b("WXDbPlugin registered early (before delayed init)");
            } catch (Throwable th) {
                C0908x1.m2193a("WXDbPlugin early register failed", th);
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0962zh(xposedEntry, c0173j8, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initWeChatHooks$doInit$lambda$1(XposedEntry xposedEntry, C0173J8 c0173j8) {
        try {
            xposedEntry.initPlugins(c0173j8);
        } catch (Throwable th) {
            C0908x1.m2193a("initPlugins (delayed) failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XposedInterface.HookBuilder initWeChatHooks$lambda$0(XposedEntry xposedEntry, Executable executable) {
        C0631i9.m1482e(executable, "executable");
        XposedInterface.HookBuilder hookBuilderHook = xposedEntry.hook(executable);
        C0631i9.m1481d(hookBuilderHook, "hook(...)");
        return hookBuilderHook;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object initWeChatHooks$lambda$2(AtomicBoolean atomicBoolean, C0173J8 c0173j8, XposedEntry xposedEntry, XposedInterface.Chain chain) {
        C0631i9.m1482e(chain, "chain");
        Object objProceed = chain.proceed();
        Object obj = chain.getArgs().get(0);
        Context context = obj instanceof Context ? (Context) obj : null;
        if (context != null) {
            initWeChatHooks$doInit(atomicBoolean, c0173j8, xposedEntry, context);
        }
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object initWeChatHooks$lambda$4$lambda$3(AtomicBoolean atomicBoolean, C0173J8 c0173j8, XposedEntry xposedEntry, XposedInterface.Chain chain) {
        C0631i9.m1482e(chain, "chain");
        Object objProceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        Application application = thisObject instanceof Application ? (Application) thisObject : null;
        if (application != null) {
            initWeChatHooks$doInit(atomicBoolean, c0173j8, xposedEntry, application);
        }
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object initWeChatHooks$lambda$6$lambda$5(AtomicBoolean atomicBoolean, C0173J8 c0173j8, XposedEntry xposedEntry, XposedInterface.Chain chain) {
        C0631i9.m1482e(chain, "chain");
        Object objProceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        Application application = thisObject instanceof Application ? (Application) thisObject : null;
        if (application != null) {
            initWeChatHooks$doInit(atomicBoolean, c0173j8, xposedEntry, application);
        }
        return objProceed;
    }

    public void onHotReloaded(XposedModuleInterface.HotReloadedParam param) {
        C0631i9.m1482e(param, "param");
        C0908x1.m2194b(C0944z.m2231k("onHotReloaded: process=", param.getProcessName()));
        this.hookHandles.clear();
        C0915x8.f3530a.m2204b(C0518ca.c.f1904d);
        C0816s4.f3217F = false;
        C0319Rb.f1143a.getClass();
        synchronized (C0319Rb.f1149g) {
            C0319Rb.f1146d = null;
            C0319Rb.f1147e = 0;
            C0319Rb.f1148f = 0L;
            C0413Wf c0413Wf = C0413Wf.f1577a;
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: cache invalidated"}, 1));
        C0122Gb.f389a.getClass();
        synchronized (C0122Gb.f399k) {
            C0122Gb.f396h = null;
            C0122Gb.f397i = 0;
            C0122Gb.f398j = 0L;
        }
        C0656jf.f2462a.getClass();
        C0656jf.f2464c = null;
        C0656jf.f2465d = false;
        C0656jf.f2466e = "NONE";
        C0657jg.f2467a.getClass();
        C0657jg.m1527e();
    }

    public boolean onHotReloading(XposedModuleInterface.HotReloadingParam param) {
        C0631i9.m1482e(param, "param");
        C0908x1.m2194b("onHotReloading triggered — returning true to allow hot reload");
        return true;
    }

    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam param) {
        C0631i9.m1482e(param, "param");
        C0908x1.m2194b("onModuleLoaded:", param.getProcessName(), "pid=", Integer.valueOf(Process.myPid()));
        if (C0631i9.m1478a(param.getProcessName(), TARGET_PACKAGE) || C0631i9.m1478a(param.getProcessName(), "top.mmjz.floatingclouds")) {
            return;
        }
        C0908x1.m2194b("Skipping non-target process:", param.getProcessName());
    }

    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam param) {
        C0631i9.m1482e(param, "param");
        if (C0631i9.m1478a(param.getPackageName(), TARGET_PACKAGE) || C0631i9.m1478a(param.getPackageName(), "top.mmjz.floatingclouds")) {
            C0908x1.m2194b("onPackageLoaded:", param.getPackageName(), "isFirst=", Boolean.valueOf(param.isFirstPackage()));
        }
    }

    public void onPackageReady(XposedModuleInterface.PackageReadyParam param) {
        String packageName;
        C0631i9.m1482e(param, "param");
        if (C0631i9.m1478a(param.getPackageName(), TARGET_PACKAGE) || C0631i9.m1478a(param.getPackageName(), "top.mmjz.floatingclouds")) {
            ApplicationInfo applicationInfo = param.getApplicationInfo();
            if (applicationInfo == null || (packageName = applicationInfo.processName) == null) {
                packageName = param.getPackageName();
                C0631i9.m1481d(packageName, "getPackageName(...)");
            }
            C0908x1.m2194b("onPackageReady:", param.getPackageName(), "process=", packageName, "classLoader ready");
            if (C0631i9.m1478a(param.getPackageName(), "top.mmjz.floatingclouds")) {
                return;
            }
            ClassLoader classLoader = param.getClassLoader();
            C0631i9.m1481d(classLoader, "getClassLoader(...)");
            initWeChatHooks(classLoader, packageName);
        }
    }

    public final void registerHookHandle$app_release(String id, XposedInterface.HookHandle handle) {
        C0631i9.m1482e(id, "id");
        C0631i9.m1482e(handle, "handle");
        this.hookHandles.put(id, handle);
    }
}
