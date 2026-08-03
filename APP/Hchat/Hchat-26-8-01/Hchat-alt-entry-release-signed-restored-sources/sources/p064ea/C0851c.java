package p064ea;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p011ab.C0042b;
import p024b9.C0219e;
import p062e8.C0828b;
import p063e9.C0837h;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p119i2.C1955z;
import p126ia.C2026t;
import p162l3.C2469w;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p343x6.AbstractC5700d;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: ea.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851c {

    /* JADX INFO: renamed from: a */
    public final Object f2602a;

    /* JADX INFO: renamed from: b */
    public final Object f2603b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f2604c;

    /* JADX INFO: renamed from: d */
    public final Object f2605d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0851c(C3742g c3742g) {
        c3742g.getClass();
        this.f2602a = c3742g;
        Context context = c3742g.f12143a;
        this.f2603b = AbstractC4302b.m8640c(context, "Hchat_fake_scan_camera_config");
        this.f2605d = AbstractC4302b.m8640c(context, "Hchat_fake_scan_camera_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2154b(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes.length == 17 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Boolean.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[5], String.class)) {
                Class<?> cls3 = parameterTypes[6];
                Class cls4 = Integer.TYPE;
                if (AbstractC1416l.m3825a(cls3, cls4) && parameterTypes[7].getName().equals("com.tencent.mm.plugin.appbrand.report.quality.QualitySession") && AbstractC1416l.m3825a(parameterTypes[8], String.class) && parameterTypes[9].getName().equals("com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer") && AbstractC1416l.m3825a(parameterTypes[10], String.class) && AbstractC1416l.m3825a(parameterTypes[12], cls4) && AbstractC1416l.m3825a(parameterTypes[13], cls2) && AbstractC1416l.m3825a(parameterTypes[14], String.class) && AbstractC1416l.m3825a(parameterTypes[15], cls2) && AbstractC1416l.m3825a(parameterTypes[16], cls2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2155c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && (parameterTypes.length == 15 || parameterTypes.length == 16) && Activity.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m2156a(boolean z9) {
        try {
            boolean z10 = true;
            if (this.f2604c) {
                return true;
            }
            Iterator it = m2159f(z9).iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                try {
                    C3744i.f12154b.m7763b((Method) it.next(), new C0219e(this, 12));
                    this.f2604c = true;
                    z11 = true;
                } catch (Throwable th2) {
                    AbstractC1184v0.m3204n("[Hchat:FakeScanCamera] 安装 QBarStringHandler Hook 失败: " + th2.getMessage(), th2);
                }
            }
            if (!z11) {
                if (!this.f2604c) {
                    z10 = false;
                }
            }
            return z10;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x00d4 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    public Constructor m2157d() {
        Object c3959f;
        Object c3959f2;
        Constructor constructor;
        C0042b c0042b = (C0042b) this.f2605d;
        C3742g c3742g = (C3742g) this.f2602a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2603b;
        Constructor constructorM2088d = C0828b.m2088d(sharedPreferences, strM2091g, classLoader, "launch_wxa_app_constructor");
        if (constructorM2088d != null) {
            if (!m2154b(constructorM2088d)) {
                constructorM2088d = null;
            }
            if (constructorM2088d != null) {
                return constructorM2088d;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                if (c1730o.m4352t()) {
                    try {
                        classLoader.getClass();
                        c3959f2 = c1730o.m4348p().m6022a(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    constructor = (Constructor) c3959f2;
                } else {
                    constructor = null;
                }
                if (constructor != null) {
                    arrayList.add(constructor);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m2154b((Constructor) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Constructor) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c0042b.invoke("定位小程序启动请求构造器失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Constructor constructor2 = (Constructor) AbstractC4166m.m8400I1(list);
        if (constructor2 != null) {
            C0828b.m2093i(sharedPreferences, strM2091g, "launch_wxa_app_constructor", constructor2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("launch_wxa_app_constructor").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c0042b.invoke("小程序启动请求构造器候选不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C0837h(5), 31)), null);
            }
        }
        return constructor2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x00cf */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    public Method m2158e() {
        Object c3959f;
        Object c3959f2;
        Method method;
        C0042b c0042b = (C0042b) this.f2605d;
        C3742g c3742g = (C3742g) this.f2602a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2603b;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM2091g, classLoader, "private_open_url_method");
        if (methodM2087c != null) {
            if (!AbstractC5700d.m10282j(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("private_openUrl", "rawUrl", "geta8key_open_webview_appid");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                if (c1730o.m4352t()) {
                    method = null;
                } else {
                    try {
                        c3959f2 = c1730o.m4350r(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    method = (Method) c3959f2;
                }
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (AbstractC5700d.m10282j((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c0042b.invoke("定位小程序私有网页跳转方法失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strM2091g, "private_open_url_method", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("private_open_url_method").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c0042b.invoke("小程序私有网页跳转方法候选不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C0837h(4), 31)), null);
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00aa */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    public List m2159f(boolean z9) {
        ?? c3959f;
        ?? r72;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2605d;
        C3742g c3742g = (C3742g) this.f2602a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|fake_scan_camera_v5_eq_qbar_only") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM2090f = C0828b.m2090f(sharedPreferences, strConcat, classLoader, "qbar_string_handler_methods");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (m2155c((Method) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        C4173t c4173t = C4173t.f13710g;
        if (!z9) {
            return c4173t;
        }
        String[] strArr = {"MicroMsg.QBarStringHandler", "key_offline_scan_show_tips"};
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0((String[]) Arrays.copyOf(strArr, 2));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                c3959f.add(((C1730o) it.next()).m4350r(classLoader));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            r72 = c3959f;
        } else {
            AbstractC0921a.m2260w("[Hchat:FakeScanCamera] 精确定位 QBarStringHandler 失败(", AbstractC4165l.m8369F0(strArr, null, 63), "): ", thM8182b.getMessage(), thM8182b);
            r72 = c4173t;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (List) r72) {
            if (m2155c((Method) obj2)) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (hashSet.add(((Method) obj3).toGenericString())) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("qbar_string_handler_methods").apply();
            } catch (Throwable unused) {
            }
        } else {
            C0828b.f2478a.m2097j(sharedPreferences, strConcat, "qbar_string_handler_methods", arrayList3);
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x013d */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public Method m2160g() {
        Object c3959f;
        Object c3959f2;
        C2026t c2026t = (C2026t) this.f2605d;
        C3742g c3742g = (C3742g) this.f2602a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2603b;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, str, classLoader, "recorder_duration");
        Class cls = Long.TYPE;
        if (methodM2087c != null) {
            if (KavaReflector.isStatic(methodM2087c) || methodM2087c.getParameterCount() != 0 || !AbstractC1416l.m3825a(methodM2087c.getReturnType(), cls)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.SceneVoice.Recorder", "Stop file success: ");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader).getDeclaringClass();
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Class cls2 = (Class) c3959f2;
                if (cls2 != null) {
                    arrayList.add(cls2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((Class) obj).getName())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC4171r.m8432h1(arrayList3, KavaReflector.declaredMethods((Class) it2.next()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                Method method = (Method) obj2;
                if (!KavaReflector.isStatic(method) && method.getParameterCount() == 0 && AbstractC1416l.m3825a(method.getReturnType(), cls)) {
                    arrayList4.add(obj2);
                }
            }
            HashSet hashSet2 = new HashSet();
            c3959f = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (hashSet2.add(((Method) obj3).toGenericString())) {
                    c3959f.add(obj3);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj4 = c3959f;
        if (thM8182b != null) {
            c2026t.invoke("伪造语音时长定位录音器失败", thM8182b);
            obj4 = C4173t.f13710g;
        }
        List list = (List) obj4;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, str, "recorder_duration", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                    editorEdit.clear().putString("cache.key", str);
                }
                editorEdit.remove("recorder_duration").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c2026t.invoke("伪造语音时长录音长度方法候选不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C1955z(12), 31)), null);
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x00cd */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: h */
    public Method m2161h() {
        Object c3959f;
        Object c3959f2;
        Method method;
        C0042b c0042b = (C0042b) this.f2605d;
        C3742g c3742g = (C3742g) this.f2602a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2603b;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM2091g, classLoader, "splash_ad_check_method");
        if (methodM2087c != null) {
            if (!AbstractC1089i.m2758b(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, appId:%s, canShowAd:%s");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                if (c1730o.m4352t()) {
                    method = null;
                } else {
                    try {
                        c3959f2 = c1730o.m4350r(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    method = (Method) c3959f2;
                }
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (AbstractC1089i.m2758b((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c0042b.invoke("定位小程序开屏广告资格方法失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strM2091g, "splash_ad_check_method", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove("splash_ad_check_method").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c0042b.invoke("小程序开屏广告资格方法候选不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C0837h(23), 31)), null);
            }
        }
        return method2;
    }

    public C0851c(C3742g c3742g, C0042b c0042b, byte b10) {
        c3742g.getClass();
        this.f2602a = c3742g;
        this.f2605d = c0042b;
        this.f2603b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_upload_tail_config");
    }

    public C0851c() {
        this.f2602a = new C2469w(18);
        this.f2605d = new LinkedHashMap();
        this.f2603b = new LinkedHashSet();
    }

    public C0851c(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f2602a = c3742g;
        this.f2605d = c2026t;
        this.f2603b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_fake_voice_duration_recorder_method_cache");
    }

    public C0851c(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f2602a = c3742g;
        this.f2605d = c0042b;
        this.f2603b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_fake_mini_program_host_version_member_cache");
    }

    public C0851c(C3742g c3742g, C0042b c0042b, boolean z9) {
        c3742g.getClass();
        this.f2602a = c3742g;
        this.f2605d = c0042b;
        this.f2603b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_skip_global_mini_program_splash_ads_method_cache");
    }
}
