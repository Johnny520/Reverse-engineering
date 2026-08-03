package p099h.Hchat;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import bb.C0243e;
import ca.C0518f;
import ca.RunnableC0537x;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import ga.C1376a;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.C2549k;
import ma.C2821a;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p003a2.C0014a;
import p010aa.C0035c;
import p010aa.C0037e;
import p011ab.C0043c;
import p012ah.C0086a;
import p024b9.C0215a;
import p025bc.AbstractC0255e;
import p036c9.C0438g;
import p036c9.C0468n1;
import p048d8.C0739b;
import p048d8.RunnableC0738a;
import p049d9.C0743d;
import p051db.C0764b;
import p064ea.C0849a;
import p077f8.C1082b;
import p077f8.C1083c;
import p078f9.C1090a;
import p079fa.C1098a;
import p080fb.AbstractC1184v0;
import p080fb.C1136j0;
import p080fb.C1148m0;
import p080fb.C1152n0;
import p092g4.AbstractC1341a;
import p097g9.C1372a;
import p099h.Hchat.dexkit.DexBridgeHolder;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p107h9.C1626a;
import p107h9.C1629d;
import p108ha.C1630a;
import p108ha.C1631a0;
import p108ha.C1638e;
import p108ha.C1639e0;
import p108ha.C1645h0;
import p108ha.C1646i;
import p108ha.C1652l;
import p108ha.C1655o;
import p108ha.C1662v;
import p109hb.C1698u;
import p125i8.C2005i;
import p126ia.C2027u;
import p127ib.C2035c;
import p129ig.AbstractC2043a;
import p136j8.C2103n;
import p137j9.C2115a;
import p138ja.C2116a;
import p139jb.C2117a;
import p155ka.C2376b;
import p156kb.C2386a;
import p168l9.C2535a;
import p173lh.C2570d;
import p184m9.C2816a;
import p185mb.C2822a;
import p210o8.C3087k;
import p211o9.C3088a;
import p213ob.C3113f;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p231pb.C3378a;
import p243q9.C3466b;
import p244qb.C3480a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3743h;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p258r8.InterfaceC3741f;
import p259r9.C3745a;
import p261rb.C3786b;
import p274s8.C3943c;
import p276sf.C3959f;
import p299u9.C4284c;
import p300ub.AbstractC4302b;
import p300ub.C4301a;
import p304uf.C4330d;
import p316v9.C4540b;
import p317vb.C4546c;
import p347xa.C5742c;
import p364y8.C6001a;
import p365y9.C6007c;
import p366ya.C6018h;
import p380z8.C6125a;
import p380z8.C6129e;
import sb.AbstractC3951a;
import tf.C4173t;
import ua.C4291b;
import va.C4543c;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleEntry implements IXposedHookLoadPackage {
    private static final String TAG = "[Hchat:Entry]";
    private static final String WECHAT_PKG = "com.tencent.mm";
    private C3742g featureContext;
    private C3743h featureManager;
    private static final Object DEXKIT_CREATE_LOCK = new Object();
    private static final Map<String, DexKitBridge> DEXKIT_BRIDGES = new ConcurrentHashMap();
    private final C1083c eventBus = C1083c.f3473c;
    private final C4546c uiRegistry = C4546c.f15001a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DexKitBridge createDexKitBridge(ClassLoader classLoader, String str) {
        synchronized (DEXKIT_CREATE_LOCK) {
            String str2 = str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
            try {
                Map<String, DexKitBridge> map = DEXKIT_BRIDGES;
                DexKitBridge dexKitBridge = map.get(str2);
                if (dexKitBridge != null) {
                    return dexKitBridge;
                }
                DexKitBridge dexKitBridgeCreate = DexKitBridge.create(str);
                map.put(str2, dexKitBridgeCreate);
                return dexKitBridgeCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Context createModuleContext(Context context) {
        try {
            return context.createPackageContext("h.Hchat", 3);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void initModule(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            AbstractC3951a.m8176d(context, getClass().getClassLoader(), "libdexkit.so", "dexkit", false);
            AbstractC3951a.m8176d(context, getClass().getClassLoader(), "libsilk_codec.so", "silk_codec", true);
            C3740e.m7756c(new RunnableC0537x(this, loadPackageParam, context, createModuleContext(context), new C4301a(context), 1));
        } catch (Throwable th2) {
            AbstractC1184v0.m3204n("[Hchat:Entry] 初始化失败: " + th2, th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x011a */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019d  */
    /* JADX WARN: Type inference failed for: r7v0, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void installAppBrandProcessHook(Context context, ClassLoader classLoader, XC_LoadPackage.LoadPackageParam loadPackageParam, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object c3959f;
        Method method;
        boolean zM197l;
        int i9;
        context.getClass();
        boolean zM4154c = false;
        boolean z14 = false;
        try {
            z10 = AbstractC4302b.m8640c(context, "Hchat_global_config").getBoolean("terms_accepted", false);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            try {
                i9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getInt("terms_version", 0);
            } catch (Throwable unused2) {
                i9 = 0;
            }
            z11 = i9 == 1;
        }
        if (z11) {
            C0014a c0014a = C0849a.f2597f;
            if (AbstractC4302b.m8640c(context, "Hchat_fake_mini_program_base_lib_config").getBoolean("fake_mini_program_base_lib_enable", false)) {
                synchronized (C0849a.class) {
                    zM197l = c0014a.m197l(context, classLoader);
                }
                z12 = !zM197l;
            }
            HashSet hashSet = C1376a.f4571e;
            if (AbstractC4302b.m8640c(context, "Hchat_skip_mini_program_video_ads_config").getBoolean("skip_mini_program_video_ads_enable", false) && !C0014a.m178k(context, classLoader)) {
                z12 = true;
            }
            HashSet hashSet2 = C1098a.f3537f;
            if (AbstractC4302b.m8640c(context, "Hchat_skip_global_mini_program_splash_ads_config").getBoolean("skip_global_mini_program_splash_ads_enable", false) && classLoader != null) {
                String str = classLoader.getClass().getName() + "@" + System.identityHashCode(classLoader);
                Handler handler = C3740e.f12138a;
                C3740e.m7758e(-100, new C0035c(context, 8, classLoader), "skip_global_mini_program_splash_ads:appbrand:".concat(str), "小程序开屏广告子进程 Hook", EnumC3738c.EARLY);
            }
            if (AbstractC4302b.m8640c(context, "Hchat_fake_location_config").getBoolean("fake_location_enable", false)) {
                classLoader.getClass();
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_fake_location_method_cache");
                String str2 = C3087k.m6557a(context, classLoader).f8202h;
                ?? arrayList = C4173t.f13710g;
                if (!AbstractC3149m.m6721t0(str2)) {
                    String string = sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6721t0(string) && !AbstractC3149m.m6721t0(str2)) {
                        if (string.equals(str2)) {
                            String string2 = sharedPreferencesM8640c.getString("location_callbacks_v1", HttpUrl.FRAGMENT_ENCODE_SET);
                            if (string2 != null) {
                                if (AbstractC3149m.m6721t0(string2)) {
                                    string2 = null;
                                }
                                if (string2 != null) {
                                    List<String> listM6691F0 = AbstractC3149m.m6691F0(string2, new char[]{'\n'}, 6);
                                    arrayList = new ArrayList();
                                    for (String str3 : listM6691F0) {
                                        if (AbstractC3149m.m6721t0(str3)) {
                                            str3 = null;
                                        }
                                        if (str3 != null) {
                                            try {
                                                c3959f = new C2570d(str3).m6023b(classLoader);
                                            } catch (Throwable th2) {
                                                c3959f = new C3959f(th2);
                                            }
                                            boolean z15 = c3959f instanceof C3959f;
                                            Object obj = c3959f;
                                            if (z15) {
                                                obj = null;
                                            }
                                            method = (Method) obj;
                                        } else {
                                            method = null;
                                        }
                                        if (method != null) {
                                            arrayList.add(method);
                                        }
                                    }
                                }
                            }
                        } else {
                            String strM6700O0 = AbstractC3149m.m6700O0(string, '|', HttpUrl.FRAGMENT_ENCODE_SET);
                            String strM6700O02 = AbstractC3149m.m6700O0(str2, '|', HttpUrl.FRAGMENT_ENCODE_SET);
                            if (!AbstractC3149m.m6721t0(strM6700O0) && strM6700O0.equals(strM6700O02)) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (AbstractC2043a.m5025c((Method) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ConcurrentHashMap.KeySetView keySetView = C1629d.f5334a;
                    zM4154c = C1629d.m4154c(context, arrayList2, new C0468n1(z14 ? 1 : 0, 2));
                }
                z13 = zM4154c ? z12 : true;
            }
            if (z9) {
                ScriptPluginRuntime.installAppBrandProcess(context, classLoader, loadPackageParam.processName);
            }
            if (z13 && z9) {
                AbstractC1184v0.m3203m("[Hchat:Entry] 小程序进程Hook安装失败: " + loadPackageParam.processName);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void installHideBottomBarEarly(Context context, ClassLoader classLoader) {
        boolean z9;
        int i9;
        try {
            context.getClass();
            boolean z10 = false;
            try {
                z9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getBoolean("terms_accepted", false);
            } catch (Throwable unused) {
                z9 = false;
            }
            if (z9) {
                try {
                    i9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getInt("terms_version", 0);
                } catch (Throwable unused2) {
                    i9 = 0;
                }
                if (i9 == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                C4284c.m8605k(context, classLoader);
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 隐藏底栏早期Hook失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void installHideBottomBarEarlyHook(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            C3744i c3744i = C3744i.f12154b;
            ClassLoader classLoader = loadPackageParam.classLoader;
            Class cls = Long.TYPE;
            c3744i.m7762a(XposedHelpers.findAndHookMethod("com.tencent.tinker.loader.app.TinkerApplication", classLoader, "onBaseContextAttached", new Object[]{Context.class, cls, cls, new C0739b(this, loadPackageParam, 5)}));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 隐藏底栏早期入口安装失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void installHotUpdateEarlyHook(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            C3744i c3744i = C3744i.f12154b;
            ClassLoader classLoader = loadPackageParam.classLoader;
            Class cls = Long.TYPE;
            c3744i.m7762a(XposedHelpers.findAndHookMethod("com.tencent.tinker.loader.app.TinkerApplication", classLoader, "onBaseContextAttached", new Object[]{Context.class, cls, cls, new C0739b(this, loadPackageParam, 3)}));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 热更新早期入口安装失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void installHotUpdateForAttach(XC_LoadPackage.LoadPackageParam loadPackageParam, XC_MethodHook.MethodHookParam methodHookParam, String str) {
        boolean z9;
        int i9;
        try {
            boolean z10 = false;
            Context context = (Context) methodHookParam.args[0];
            context.getClass();
            try {
                z9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getBoolean("terms_accepted", false);
            } catch (Throwable unused) {
                z9 = false;
            }
            if (z9) {
                try {
                    i9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getInt("terms_version", 0);
                } catch (Throwable unused2) {
                    i9 = 0;
                }
                if (i9 == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                C4330d c4330d = C4540b.f14983e;
                if (C4330d.m8741C(context)) {
                    if ("before".equals(str)) {
                        c4330d.m8771A(context, loadPackageParam.classLoader);
                    } else {
                        new Thread(new RunnableC0738a(this, methodHookParam, context, loadPackageParam, 1), "Hchat-HotUpdateHook").start();
                    }
                }
            }
        } catch (SecurityException e6) {
            throw e6;
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, AbstractC0255e.m1026o("[Hchat:Entry] 热更新早期Hook失败(", str, "): "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void installTabletEarlyHook(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            C3744i c3744i = C3744i.f12154b;
            ClassLoader classLoader = loadPackageParam.classLoader;
            Class cls = Long.TYPE;
            c3744i.m7762a(XposedHelpers.findAndHookMethod("com.tencent.tinker.loader.app.TinkerApplication", classLoader, "onBaseContextAttached", new Object[]{Context.class, cls, cls, new C0739b(this, loadPackageParam, 4)}));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 平板模式早期入口安装失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public void installTabletHookForAttach(XC_LoadPackage.LoadPackageParam loadPackageParam, XC_MethodHook.MethodHookParam methodHookParam, String str) {
        String str2;
        boolean z9;
        int i9;
        try {
            try {
                boolean z10 = false;
                Context context = (Context) methodHookParam.args[0];
                context.getClass();
                try {
                    z9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getBoolean("terms_accepted", false);
                } catch (Throwable unused) {
                    z9 = false;
                }
                if (z9) {
                    try {
                        i9 = AbstractC4302b.m8640c(context, "Hchat_global_config").getInt("terms_version", 0);
                    } catch (Throwable unused2) {
                        i9 = 0;
                    }
                    if (i9 == 1) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return;
                }
                HashSet hashSet = C2822a.f9113e;
                if (!AbstractC3165h.m6754F(context)) {
                    return;
                }
                str2 = str;
                try {
                    C3740e.m7756c(new RunnableC0537x(this, methodHookParam, context, loadPackageParam, str2, 2));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = str;
            }
            Throwable th4 = th;
            AbstractC0255e.m1030s(th4, AbstractC0255e.m1026o("[Hchat:Entry] 平板模式早期Hook失败(", str2, "): "), th4);
        } catch (SecurityException e6) {
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isAppBrandProcess(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = loadPackageParam.processName;
        String str2 = loadPackageParam.packageName;
        return (str == null || str2 == null || !str.startsWith(str2.concat(":appbrand"))) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMainProcess(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = loadPackageParam.processName;
        return str == null || str.equals(loadPackageParam.packageName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isTinkerClassLoader(ClassLoader classLoader) {
        if (classLoader == null) {
            return false;
        }
        String strValueOf = String.valueOf(classLoader);
        return strValueOf.contains("/tinker/") || strValueOf.contains("DelegateLastClassLoader");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isWeChatPackage(String str) {
        return str != null && str.startsWith(WECHAT_PKG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleLoadPackage$0(String str) {
        XposedBridge.log("[Hchat:WechatApi] " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initModule$4(XC_LoadPackage.LoadPackageParam loadPackageParam, Context context, Context context2, C4301a c4301a) {
        boolean z9;
        int i9;
        String str = loadPackageParam.appInfo.sourceDir;
        ClassLoader classLoaderResolveHostClassLoader = resolveHostClassLoader(context, loadPackageParam);
        DexKitBridge dexKitBridgeCreateDexKitBridge = createDexKitBridge(classLoaderResolveHostClassLoader, str);
        DexFinder dexFinder = new DexFinder(dexKitBridgeCreateDexKitBridge, classLoaderResolveHostClassLoader, context);
        DexBridgeHolder dexBridgeHolder = new DexBridgeHolder(dexKitBridgeCreateDexKitBridge, dexFinder, classLoaderResolveHostClassLoader, str);
        Set set = C1152n0.f3803a;
        context.getClass();
        synchronized (C1152n0.f3805c) {
            try {
                C1136j0 c1136j0 = C1152n0.f3807e;
                if (c1136j0 != null) {
                    c1136j0.close();
                }
                C1152n0.f3807e = null;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                C1136j0 c1136j0M3607w = AbstractC1341a.m3607w(dexBridgeHolder, applicationContext);
                C1136j0 c1136j02 = (C1136j0) C1152n0.f3804b.getAndSet(c1136j0M3607w);
                if (c1136j02 != null) {
                    c1136j02.close();
                }
                LinkedHashMap linkedHashMap = C1152n0.f3806d;
                linkedHashMap.clear();
                String str2 = c1136j0M3607w.f3731j;
                long jCurrentTimeMillis = System.currentTimeMillis();
                File file = new File(c1136j0M3607w.f3730i);
                linkedHashMap.put(str2, new C1148m0(c1136j0M3607w.f3731j, c1136j0M3607w.f3730i, "current_wechat_apk", file.length(), file.lastModified(), jCurrentTimeMillis));
                Set set2 = C1152n0.f3803a;
                C1152n0.m2918E(c1136j0M3607w);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.featureContext = new C3742g(context, context2 != null ? context2 : context, classLoaderResolveHostClassLoader, loadPackageParam, dexKitBridgeCreateDexKitBridge, dexFinder, this.eventBus, c4301a, dexBridgeHolder, this.uiRegistry);
        C3743h c3743h = new C3743h();
        c3743h.m7761a(new C2035c());
        c3743h.m7761a(new C2005i());
        int i10 = 4;
        c3743h.m7761a(new C0438g(i10));
        c3743h.m7761a(new C4284c());
        int i11 = 2;
        c3743h.m7761a(new C0215a(i11));
        c3743h.m7761a(new C0743d());
        c3743h.m7761a(new C0243e());
        c3743h.m7761a(new C6007c());
        int i12 = 6;
        c3743h.m7761a(new C0215a(i12));
        c3743h.m7761a(new C2822a());
        c3743h.m7761a(new C4291b());
        int i13 = 8;
        c3743h.m7761a(new C0215a(i13));
        c3743h.m7761a(new C3943c());
        c3743h.m7761a(new C2116a());
        c3743h.m7761a(new C4540b());
        c3743h.m7761a(new C4543c());
        int i14 = 10;
        c3743h.m7761a(new C0215a(i14));
        c3743h.m7761a(new C5742c());
        c3743h.m7761a(new C6018h());
        c3743h.m7761a(new C0438g(14));
        int i15 = 11;
        c3743h.m7761a(new C0438g(i15));
        c3743h.m7761a(new C0215a(i15));
        int i16 = 0;
        c3743h.m7761a(new C0438g(i16));
        c3743h.m7761a(new C0438g(13));
        c3743h.m7761a(new C3378a());
        c3743h.m7761a(new C2821a());
        c3743h.m7761a(new C0438g(i13));
        c3743h.m7761a(new C6001a());
        c3743h.m7761a(new C2535a());
        c3743h.m7761a(new C0438g(i12));
        c3743h.m7761a(new C6125a());
        c3743h.m7761a(new C6129e());
        int i17 = 1;
        c3743h.m7761a(new C0438g(i17));
        c3743h.m7761a(new C0438g(12));
        int i18 = 7;
        c3743h.m7761a(new C0215a(i18));
        c3743h.m7761a(new C3113f());
        c3743h.m7761a(new C3786b());
        int i19 = 9;
        c3743h.m7761a(new C0438g(i19));
        c3743h.m7761a(new C0043c());
        c3743h.m7761a(new C2549k());
        c3743h.m7761a(new C0438g(i18));
        c3743h.m7761a(new C2115a());
        c3743h.m7761a(new C0215a(i16));
        c3743h.m7761a(new C0215a(i17));
        int i20 = 3;
        c3743h.m7761a(new C0215a(i20));
        c3743h.m7761a(new C0215a(i19));
        c3743h.m7761a(new C0037e());
        c3743h.m7761a(new C1626a());
        c3743h.m7761a(new C2816a());
        c3743h.m7761a(new C0849a());
        c3743h.m7761a(new C1376a());
        c3743h.m7761a(new C1098a());
        c3743h.m7761a(new C2376b());
        c3743h.m7761a(new C1646i());
        c3743h.m7761a(new C1630a());
        c3743h.m7761a(new C1638e());
        c3743h.m7761a(new C1652l());
        c3743h.m7761a(new C1662v());
        c3743h.m7761a(new C1655o());
        c3743h.m7761a(new C1631a0());
        c3743h.m7761a(new C0215a(i10));
        c3743h.m7761a(new C1639e0());
        c3743h.m7761a(new C0438g(i20));
        c3743h.m7761a(new C2027u());
        int i21 = 5;
        c3743h.m7761a(new C0438g(i21));
        c3743h.m7761a(new C3088a());
        c3743h.m7761a(new C3466b());
        c3743h.m7761a(new C1645h0());
        c3743h.m7761a(new C1090a());
        c3743h.m7761a(new C1372a());
        c3743h.m7761a(new C3480a());
        c3743h.m7761a(new C1698u());
        c3743h.m7761a(new C0518f());
        c3743h.m7761a(new C0764b());
        c3743h.m7761a(new C0215a(i21));
        c3743h.m7761a(new C0438g(i14));
        c3743h.m7761a(new C2386a());
        c3743h.m7761a(new C2117a());
        c3743h.m7761a(new C3745a());
        c3743h.m7761a(new C0438g(i11));
        this.featureManager = c3743h;
        C3742g c3742g = this.featureContext;
        c3742g.getClass();
        C4301a c4301a2 = c3742g.f12149g;
        c4301a2.getClass();
        try {
            z9 = AbstractC4302b.m8640c(c4301a2.f14345a, "Hchat_global_config").getBoolean("terms_accepted", false);
        } catch (Throwable unused) {
            z9 = false;
        }
        if (z9) {
            try {
                i9 = AbstractC4302b.m8640c(c4301a2.f14345a, "Hchat_global_config").getInt("terms_version", 0);
            } catch (Throwable unused2) {
                i9 = 0;
            }
            if (i9 == 1) {
                i16 = 1;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c3743h.f12152a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            InterfaceC3741f interfaceC3741f = (InterfaceC3741f) next;
            String strM7760b = C3743h.m7760b(interfaceC3741f);
            if (i16 != 0 || interfaceC3741f.mo297a().equals("settings")) {
                try {
                    interfaceC3741f.mo4988d(c3742g);
                    arrayList.add(interfaceC3741f);
                } catch (Throwable th3) {
                    AbstractC1184v0.m3204n("[Hchat:FeatureManager] onInit 失败: " + strM7760b + ", error=" + th3, th3);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            InterfaceC3741f interfaceC3741f2 = (InterfaceC3741f) next2;
            String strM7760b2 = C3743h.m7760b(interfaceC3741f2);
            try {
            } catch (Throwable th4) {
                AbstractC1184v0.m3204n("[Hchat:FeatureManager] isEnabled 检查异常，默认启用: ".concat(strM7760b2), th4);
            }
            if (interfaceC3741f2.mo4940b(c3742g)) {
                try {
                    interfaceC3741f2.mo4941c(c3742g);
                    c3743h.f12153b.add(interfaceC3741f2);
                    try {
                        c3742g.f12148f.m2715b(new C1082b());
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable th5) {
                    AbstractC1184v0.m3204n("[Hchat:FeatureManager] 功能安装失败: " + strM7760b2 + ", error=" + th5, th5);
                }
            }
        }
        Handler handler = C3740e.f12138a;
        C3740e.m7754a(EnumC3738c.BRIDGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$installHotUpdateForAttach$1(XC_MethodHook.MethodHookParam methodHookParam, Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            ClassLoader classLoaderResolveTinkerClassLoader = resolveTinkerClassLoader(methodHookParam.thisObject);
            if (classLoaderResolveTinkerClassLoader == null) {
                classLoaderResolveTinkerClassLoader = resolveHostClassLoader(context, loadPackageParam);
            }
            AbstractC3951a.m8176d(context, getClass().getClassLoader(), "libdexkit.so", "dexkit", false);
            C4540b.f14983e.m8777z(createDexKitBridge(classLoaderResolveTinkerClassLoader, loadPackageParam.appInfo.sourceDir), classLoaderResolveTinkerClassLoader, context);
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 热更新后置安装失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installHotUpdateForAttach$2(XC_MethodHook.MethodHookParam methodHookParam, Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C3740e.m7756c(new RunnableC0738a(this, methodHookParam, context, loadPackageParam, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$installTabletHookForAttach$3(XC_MethodHook.MethodHookParam methodHookParam, Context context, XC_LoadPackage.LoadPackageParam loadPackageParam, String str) {
        boolean zM6756H;
        Method methodM6759K;
        ClassLoader classLoaderResolveTinkerClassLoader = resolveTinkerClassLoader(methodHookParam.thisObject);
        if (classLoaderResolveTinkerClassLoader == null) {
            classLoaderResolveTinkerClassLoader = resolveHostClassLoader(context, loadPackageParam);
        }
        HashSet hashSet = C2822a.f9113e;
        if (context == null || classLoaderResolveTinkerClassLoader == null || !AbstractC3165h.m6754F(context)) {
            zM6756H = false;
        } else {
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_wechat_tablet_cache");
            String strM6786m = AbstractC3165h.m6786m(context, classLoaderResolveTinkerClassLoader);
            zM6756H = AbstractC3165h.m6756H(classLoaderResolveTinkerClassLoader);
            if (!zM6756H) {
                Method methodM6759K2 = AbstractC3165h.m6759K(sharedPreferencesM8640c, strM6786m, classLoaderResolveTinkerClassLoader, "pad_method");
                if (methodM6759K2 != null) {
                    AbstractC3165h.m6751C(methodM6759K2, classLoaderResolveTinkerClassLoader);
                    AbstractC3165h.m6766R(sharedPreferencesM8640c, strM6786m, "pad_method", methodM6759K2);
                    zM6756H = AbstractC3165h.m6756H(classLoaderResolveTinkerClassLoader);
                }
                zM6756H = false;
            }
            if (!AbstractC3165h.m6755G(classLoaderResolveTinkerClassLoader) && (methodM6759K = AbstractC3165h.m6759K(sharedPreferencesM8640c, strM6786m, classLoaderResolveTinkerClassLoader, "login_button_method")) != null) {
                AbstractC3165h.m6750B(methodM6759K, classLoaderResolveTinkerClassLoader);
                AbstractC3165h.m6766R(sharedPreferencesM8640c, strM6786m, "login_button_method", methodM6759K);
            }
        }
        if (zM6756H) {
            return;
        }
        if ("after".equals(str)) {
            AbstractC3951a.m8176d(context, getClass().getClassLoader(), "libdexkit.so", "dexkit", false);
            AbstractC3165h.m6752D(createDexKitBridge(classLoaderResolveTinkerClassLoader, loadPackageParam.appInfo.sourceDir), classLoaderResolveTinkerClassLoader, context);
            return;
        }
        C4330d c4330d = C4540b.f14983e;
        if (C4330d.m8741C(context)) {
            AbstractC3951a.m8176d(context, getClass().getClassLoader(), "libdexkit.so", "dexkit", false);
            AbstractC3165h.m6752D(createDexKitBridge(loadPackageParam.classLoader, loadPackageParam.appInfo.sourceDir), loadPackageParam.classLoader, context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public ClassLoader resolveHostClassLoader(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        ClassLoader classLoader;
        ClassLoader classLoader2 = loadPackageParam.classLoader;
        ClassLoader contextClassLoader = null;
        try {
            classLoader = context.getClassLoader();
        } catch (Throwable unused) {
            classLoader = null;
        }
        try {
            contextClassLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable unused2) {
        }
        return isTinkerClassLoader(classLoader) ? classLoader : isTinkerClassLoader(contextClassLoader) ? contextClassLoader : classLoader != null ? classLoader : contextClassLoader != null ? contextClassLoader : classLoader2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public ClassLoader resolveTinkerClassLoader(Object obj) {
        try {
            Object objCallMethod = XposedHelpers.callMethod(obj, "getClassLoader", new Object[0]);
            if (objCallMethod instanceof ClassLoader) {
                return (ClassLoader) objCallMethod;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (isWeChatPackage(loadPackageParam.packageName)) {
            installHotUpdateEarlyHook(loadPackageParam);
            installTabletEarlyHook(loadPackageParam);
            if (!isMainProcess(loadPackageParam)) {
                if (isAppBrandProcess(loadPackageParam)) {
                    installAppBrandProcessHook(loadPackageParam);
                }
            } else {
                ClassLoader classLoader = loadPackageParam.classLoader;
                C0086a c0086a = new C0086a(22);
                AtomicBoolean atomicBoolean = C2103n.f7030d;
                C2103n.m5258j(KavaReflector.loadClass("com.tencent.mars.cdn.CdnManager", classLoader), c0086a);
                installHideBottomBarEarlyHook(loadPackageParam);
                C3744i.f12154b.m7762a(XposedHelpers.findAndHookMethod(Application.class, "onCreate", new Object[]{new C0739b(this, loadPackageParam, 0)}));
            }
        }
    }

    private void installAppBrandProcessHook(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        try {
            C3744i c3744i = C3744i.f12154b;
            ClassLoader classLoader = loadPackageParam.classLoader;
            Class cls = Long.TYPE;
            c3744i.m7762a(XposedHelpers.findAndHookMethod("com.tencent.tinker.loader.app.TinkerApplication", classLoader, "onBaseContextAttached", new Object[]{Context.class, cls, cls, new C0739b(this, loadPackageParam, 1)}));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:Entry] 小程序进程早期入口安装失败: "), th2);
        }
        try {
            C3744i.f12154b.m7762a(XposedHelpers.findAndHookMethod(Application.class, "onCreate", new Object[]{new C0739b(this, loadPackageParam, 2)}));
        } catch (Throwable th3) {
            AbstractC0255e.m1030s(th3, new StringBuilder("[Hchat:Entry] 小程序进程兜底入口安装失败: "), th3);
        }
    }
}
