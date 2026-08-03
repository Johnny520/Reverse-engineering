package p108ha;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p002a1.RunnableC0003a;
import p011ab.C0041a;
import p011ab.C0042b;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p027c0.C0361f;
import p054dg.C0795n;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p088g0.C1271o;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.C4175v;

/* JADX INFO: renamed from: ha.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1666z {

    /* JADX INFO: renamed from: a */
    public final C3742g f5476a;

    /* JADX INFO: renamed from: b */
    public final C0042b f5477b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5478c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f5479d;

    /* JADX INFO: renamed from: e */
    public final Handler f5480e;

    /* JADX INFO: renamed from: f */
    public final Map f5481f;

    /* JADX INFO: renamed from: g */
    public final Map f5482g;

    /* JADX INFO: renamed from: h */
    public final Object f5483h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f5484i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap.KeySetView f5485j;

    /* JADX INFO: renamed from: k */
    public final C3962i f5486k;

    /* JADX INFO: renamed from: l */
    public final RunnableC0003a f5487l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f5488m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f5489n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f5490o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f5491p;

    /* JADX INFO: renamed from: q */
    public volatile String f5492q;

    /* JADX INFO: renamed from: r */
    public volatile Set f5493r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1666z(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5476a = c3742g;
        this.f5477b = c0042b;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_keyword_block_config");
        this.f5478c = sharedPreferencesM8640c;
        this.f5479d = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_keyword_block_method_cache");
        this.f5480e = new Handler(Looper.getMainLooper());
        this.f5481f = AbstractC3199a.m6843p();
        this.f5482g = AbstractC3199a.m6843p();
        this.f5483h = new Object();
        this.f5484i = new ConcurrentHashMap();
        this.f5485j = ConcurrentHashMap.newKeySet();
        this.f5486k = new C3962i(new C0041a(this, 26));
        this.f5487l = new RunnableC0003a(this, 11);
        SharedPreferencesOnSharedPreferenceChangeListenerC0216b sharedPreferencesOnSharedPreferenceChangeListenerC0216b = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 6);
        this.f5493r = C4175v.f13712g;
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0216b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4245a(C1666z c1666z, View view, Object obj) {
        c1666z.f5482g.remove(view);
        c1666z.m4261q(view);
        if (c1666z.m4254j(obj)) {
            Map map = c1666z.f5482g;
            map.getClass();
            map.put(view, obj);
            if (c1666z.m4262r(obj)) {
                c1666z.m4252d(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4246e(Class cls) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            for (Object obj : KavaReflector.declaredMethods(cls)) {
                Method method = (Method) obj;
                if (KavaReflector.isStatic(method) || KavaReflector.isAbstract(method)) {
                    z9 = false;
                } else {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        z9 = true;
                    }
                }
                if (z9) {
                    arrayList.add(obj);
                }
            }
            cls = cls.getSuperclass();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m4247f(Method method) {
        if (KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m4248h(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method) && !method.getDeclaringClass().isInterface() && View.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 4 && parameterTypes[0].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[2], cls2) && View.class.isAssignableFrom(parameterTypes[3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m4249i(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getName(), "getView") && !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method) && !method.getDeclaringClass().isInterface() && View.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 3 && AbstractC1416l.m3825a(parameterTypes[0], Integer.TYPE) && View.class.isAssignableFrom(parameterTypes[1]) && ViewGroup.class.isAssignableFrom(parameterTypes[2]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Set m4250b() {
        Set set;
        if (!this.f5478c.getBoolean("moments_keyword_block_enable", false)) {
            return C4175v.f13712g;
        }
        String string = this.f5478c.getString("moments_keyword_block_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.equals(this.f5492q)) {
            return this.f5493r;
        }
        synchronized (this.f5483h) {
            try {
                if (!string.equals(this.f5492q)) {
                    this.f5493r = AbstractC3754e0.m7877T(string);
                    this.f5492q = string;
                }
                set = this.f5493r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Method m4251c(C1253k c1253k, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Object next;
        Object c3959f2;
        C3742g c3742g = this.f5476a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((Boolean) interfaceC1231l.invoke(next)).booleanValue()) {
                    break;
                }
            }
            c3959f = (Method) next;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f5477b.invoke("朋友圈关键词屏蔽 DexKit 定位失败", thM8182b);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4252d(View view) {
        Map map = this.f5481f;
        if (map.containsKey(view)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        map.put(view, new C1663w(layoutParams != null ? Integer.valueOf(layoutParams.height) : null, view.getVisibility()));
        view.setVisibility(8);
        if (layoutParams == null || layoutParams.height == 0) {
            return;
        }
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4253g(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (KavaReflector.isStatic(method) || KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface() || !View.class.isAssignableFrom(method.getDeclaringClass()) || !AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || parameterTypes.length != 3 || !AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE)) {
            return false;
        }
        Class<?> cls = parameterTypes[1];
        cls.getClass();
        return m4260p(cls) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4254j(Object obj) {
        Class cls = (Class) this.f5486k.getValue();
        return (cls != null && cls.isInstance(obj)) || obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Method m4255k() {
        String strM4259o = m4259o();
        ClassLoader classLoader = this.f5476a.f12145c;
        SharedPreferences sharedPreferences = this.f5479d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4259o, classLoader, "flutter_profile_switch");
        if (methodM2087c != null) {
            if (!m4247f(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        Method methodM4251c = m4251c(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1666z.class), "isFlutterProfileSwitchMethod", "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 18));
        if (methodM4251c != null) {
            C0828b.m2092h(sharedPreferences, strM4259o, "flutter_profile_switch", methodM4251c);
            return methodM4251c;
        }
        C0828b.m2085a(sharedPreferences, strM4259o, "flutter_profile_switch");
        return methodM4251c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Method m4256l() {
        String strM4259o = m4259o();
        ClassLoader classLoader = this.f5476a.f12145c;
        SharedPreferences sharedPreferences = this.f5479d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4259o, classLoader, "improve_timeline_bind");
        if (methodM2087c != null) {
            if (!m4253g(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("measure", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        Method methodM4251c = m4251c(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1666z.class), "isImproveTimelineBindMethod", "isImproveTimelineBindMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 19));
        if (methodM4251c != null) {
            C0828b.m2092h(sharedPreferences, strM4259o, "improve_timeline_bind", methodM4251c);
            return methodM4251c;
        }
        C0828b.m2085a(sharedPreferences, strM4259o, "improve_timeline_bind");
        this.f5477b.invoke("朋友圈关键词屏蔽未找到新版时间线绑定方法", null);
        return methodM4251c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Method m4257m() {
        String strM4259o = m4259o();
        ClassLoader classLoader = this.f5476a.f12145c;
        SharedPreferences sharedPreferences = this.f5479d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4259o, classLoader, "legacy_timeline_create_view");
        if (methodM2087c != null) {
            if (!m4248h(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        Method methodM4251c = m4251c(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1666z.class), "isLegacyTimelineCreateViewMethod", "isLegacyTimelineCreateViewMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 20));
        if (methodM4251c != null) {
            C0828b.m2092h(sharedPreferences, strM4259o, "legacy_timeline_create_view", methodM4251c);
            return methodM4251c;
        }
        C0828b.m2085a(sharedPreferences, strM4259o, "legacy_timeline_create_view");
        return methodM4251c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Method m4258n() {
        String strM4259o = m4259o();
        ClassLoader classLoader = this.f5476a.f12145c;
        SharedPreferences sharedPreferences = this.f5479d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4259o, classLoader, "profile_list_bind");
        if (methodM2087c != null) {
            if (!m4249i(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("getView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Method methodM4251c = m4251c(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1666z.class), "isProfileListBindMethod", "isProfileListBindMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 21));
        if (methodM4251c != null) {
            C0828b.m2092h(sharedPreferences, strM4259o, "profile_list_bind", methodM4251c);
            return methodM4251c;
        }
        C0828b.m2085a(sharedPreferences, strM4259o, "profile_list_bind");
        this.f5477b.invoke("朋友圈关键词屏蔽未找到个人主页列表绑定方法", null);
        return methodM4251c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m4259o() {
        C3742g c3742g = this.f5476a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C1664x m4260p(Class cls) {
        C3962i c3962i;
        ConcurrentHashMap concurrentHashMap = this.f5484i;
        C1664x c1664x = (C1664x) concurrentHashMap.get(cls);
        if (c1664x != null) {
            return c1664x;
        }
        ConcurrentHashMap.KeySetView keySetView = this.f5485j;
        if (keySetView.contains(cls)) {
            return null;
        }
        ArrayList arrayListM4246e = m4246e(cls);
        C4329c c4329cM7E = AbstractC0000a.m7E();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4246e.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3962i = this.f5486k;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Class<?> returnType = ((Method) next).getReturnType();
            returnType.getClass();
            Class cls2 = (Class) c3962i.getValue();
            if ((cls2 != null && cls2.isAssignableFrom(returnType)) || returnType.getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c4329cM7E.add(new C1664x(AbstractC0000a.m99x0((Method) it2.next())));
        }
        C3010h c3010h = new C3010h(new C3011i(new C0795n(arrayListM4246e, 6), true, new C1657q(cls, 2)));
        while (c3010h.hasNext()) {
            Method method = (Method) c3010h.next();
            Class<?> returnType2 = method.getReturnType();
            returnType2.getClass();
            ArrayList arrayListM4246e2 = m4246e(returnType2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListM4246e2) {
                Class<?> returnType3 = ((Method) obj).getReturnType();
                returnType3.getClass();
                Class cls3 = (Class) c3962i.getValue();
                if ((cls3 != null && cls3.isAssignableFrom(returnType3)) || returnType3.getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c4329cM7E.add(new C1664x(AbstractC0000a.m101y0(method, (Method) it3.next())));
            }
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        ListIterator listIterator = c4329cM90t.listIterator(0);
        while (true) {
            C4327a c4327a = (C4327a) listIterator;
            if (!c4327a.hasNext()) {
                break;
            }
            Object next2 = c4327a.next();
            if (hashSet.add(AbstractC4166m.m8392A1(((C1664x) next2).f5473a, "|", null, null, new C1271o(7), 30))) {
                arrayList3.add(next2);
            }
        }
        C1664x c1664x2 = (C1664x) AbstractC4166m.m8400I1(arrayList3);
        if (c1664x2 != null) {
            concurrentHashMap.put(cls, c1664x2);
            return c1664x2;
        }
        keySetView.add(cls);
        return c1664x2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4261q(View view) {
        C1663w c1663w = (C1663w) this.f5481f.remove(view);
        if (c1663w != null) {
            view.setVisibility(c1663w.f5471a);
            Integer num = c1663w.f5472b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (num == null || layoutParams == null || layoutParams.height == num.intValue()) {
                return;
            }
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m4262r(Object obj) {
        Set setM4250b = m4250b();
        if (setM4250b.isEmpty()) {
            return false;
        }
        String strM7869L = AbstractC3754e0.m7869L(obj);
        if (!AbstractC3149m.m6721t0(strM7869L)) {
            Set set = setM4250b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (Boolean.valueOf(AbstractC3149m.m6709h0(strM7869L, (String) it.next(), true)).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
