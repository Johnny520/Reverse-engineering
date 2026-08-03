package p380z8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p062e8.C0828b;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p365y9.C6006b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: z8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6131g {

    /* JADX INFO: renamed from: g */
    public static final List f24704g = AbstractC0000a.m101y0(new String[]{"MicroMsg.VoIP.VoIPAudioManager", "continuePlayStartRing username:", "isOutCall", "scene", "start"}, new String[]{"startRing() called with: username = ", "isOutCall", "isSpeakOn", "seekStartMs", "scene", "start"});

    /* JADX INFO: renamed from: h */
    public static final String[] f24705h = {"MicroMsg.VoIPMP.CoreV2", "startRing() called with: username = ", ", roomType = ", ", roomRole = "};

    /* JADX INFO: renamed from: a */
    public final C3742g f24706a;

    /* JADX INFO: renamed from: b */
    public final C6006b f24707b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f24708c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f24709d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f24710e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f24711f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6131g(C3742g c3742g, C6006b c6006b) {
        c3742g.getClass();
        this.f24706a = c3742g;
        this.f24707b = c6006b;
        Context context = c3742g.f12143a;
        this.f24708c = AbstractC4302b.m8640c(context, "Hchat_call_media_limit_config");
        this.f24709d = AbstractC4302b.m8640c(context, "Hchat_call_ringtone_block_method_cache");
        this.f24710e = ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10890a(Method method, Method method2) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getDeclaringClass(), method2.getDeclaringClass()) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10891b(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 4 && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE) && AbstractC1416l.m3825a(parameterTypes[1], byte[].class) && AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE) && AbstractC1416l.m3825a(parameterTypes[3], Boolean.TYPE) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m10892c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class cls = Boolean.TYPE;
        return ((length == 3 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], cls) && AbstractC1416l.m3825a(parameterTypes[2], cls)) || (parameterTypes.length == 5 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], cls) && AbstractC1416l.m3825a(parameterTypes[2], cls) && AbstractC1416l.m3825a(parameterTypes[3], Long.TYPE) && AbstractC1416l.m3825a(parameterTypes[4], cls))) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f1  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m10893d() {
        Object c3959f;
        Object c3959f2;
        C6130f c6130f;
        Object c3959f3;
        Object c3959f4;
        C3742g c3742g = this.f24706a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        ClassLoader classLoader2 = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f24709d;
        List listM2090f = C0828b.m2090f(sharedPreferences, str, classLoader2, "core_start_methods_v1");
        ClassLoader classLoader3 = c3742g.f12145c;
        List listM2090f2 = C0828b.m2090f(sharedPreferences, str, classLoader3, "core_ack_methods_v1");
        if (listM2090f.size() == listM2090f2.size() && !listM2090f.isEmpty()) {
            Iterator it = listM2090f.iterator();
            Iterator it2 = listM2090f2.iterator();
            ArrayList<C3958e> arrayList = new ArrayList(Math.min(AbstractC4167n.m8429e1(listM2090f), AbstractC4167n.m8429e1(listM2090f2)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList.add(new C3958e(it.next(), it2.next()));
            }
            ArrayList<C6130f> arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
            for (C3958e c3958e : arrayList) {
                arrayList2.add(new C6130f((Method) c3958e.f12961g, (Method) c3958e.f12962h));
            }
            if (!arrayList2.isEmpty()) {
                for (C6130f c6130f2 : arrayList2) {
                    if (!(m10891b(c6130f2.f24702a) && m10890a(c6130f2.f24703b, c6130f2.f24702a))) {
                    }
                }
            }
            return arrayList2;
        }
        if (!listM2090f.isEmpty() || !listM2090f2.isEmpty()) {
            sharedPreferences.edit().remove("core_scan_runtime_v1").apply();
        }
        C0828b.m2085a(sharedPreferences, str, "core_start_methods_v1");
        C0828b.m2085a(sharedPreferences, str, "core_ack_methods_v1");
        boolean zM3825a = AbstractC1416l.m3825a(sharedPreferences.getString("core_scan_runtime_v1", HttpUrl.FRAGMENT_ENCODE_SET), str);
        C4173t c4173t = C4173t.f13710g;
        if (zM3825a) {
            return c4173t;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            String[] strArr = f24705h;
            c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
            c0570e.f1764h = c1253k;
            c3959f = dexKitBridge.findMethod(c0570e);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f24707b.invoke("定位微信 CoreV2 通话铃声入口失败", thM8182b);
            return c4173t;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C1730o c1730o : (C1731p) c3959f) {
            try {
                c3959f2 = c1730o.m4350r(classLoader3);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = null;
            }
            Method method = (Method) c3959f2;
            if (method == null) {
                c6130f = null;
            } else {
                Method method2 = m10891b(method) ? method : null;
                if (method2 != null) {
                    try {
                        c3959f3 = c1730o.m4349q();
                    } catch (Throwable th4) {
                        c3959f3 = new C3959f(th4);
                    }
                    if (c3959f3 instanceof C3959f) {
                        c3959f3 = c4173t;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = ((Iterable) c3959f3).iterator();
                    while (it3.hasNext()) {
                        try {
                            c3959f4 = ((C1730o) it3.next()).m4350r(classLoader3);
                        } catch (Throwable th5) {
                            c3959f4 = new C3959f(th5);
                        }
                        if (c3959f4 instanceof C3959f) {
                            c3959f4 = null;
                        }
                        Method method3 = (Method) c3959f4;
                        if (method3 != null) {
                            arrayList4.add(method3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayList4) {
                        if (m10890a((Method) obj, method2)) {
                            arrayList5.add(obj);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (hashSet.add(((Method) obj2).toGenericString())) {
                            arrayList6.add(obj2);
                        }
                    }
                    Method method4 = (Method) AbstractC4166m.m8400I1(arrayList6);
                    if (method4 != null) {
                        c6130f = new C6130f(method2, method4);
                    }
                }
            }
            if (c6130f != null) {
                arrayList3.add(c6130f);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (hashSet2.add(((C6130f) obj3).f24702a.toGenericString())) {
                arrayList7.add(obj3);
            }
        }
        if (!arrayList7.isEmpty()) {
            ArrayList arrayList8 = new ArrayList(AbstractC4167n.m8429e1(arrayList7));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((C6130f) it4.next()).f24702a);
            }
            C0828b c0828b = C0828b.f2478a;
            c0828b.m2097j(sharedPreferences, str, "core_start_methods_v1", arrayList8);
            ArrayList arrayList9 = new ArrayList(AbstractC4167n.m8429e1(arrayList7));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                arrayList9.add(((C6130f) it5.next()).f24703b);
            }
            c0828b.m2097j(sharedPreferences, str, "core_ack_methods_v1", arrayList9);
        }
        sharedPreferences.edit().putString("core_scan_runtime_v1", str).apply();
        return arrayList7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00af */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    public final List m10894e() {
        C6006b c6006b;
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f24706a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        ClassLoader classLoader2 = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f24709d;
        List listM2090f = C0828b.m2090f(sharedPreferences, str, classLoader2, "direction_methods_v1");
        if (listM2090f.isEmpty()) {
            listM2090f = null;
            break;
        }
        if (!listM2090f.isEmpty()) {
            Iterator it = listM2090f.iterator();
            while (it.hasNext()) {
                if (!m10892c((Method) it.next())) {
                    listM2090f = null;
                    break;
                }
            }
        }
        if (listM2090f != null) {
            return listM2090f;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = f24704g.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            c6006b = this.f24707b;
            if (!zHasNext) {
                break;
            }
            String[] strArr = (String[]) it2.next();
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                c3959f = new ArrayList();
                Iterator it3 = c1731pFindMethod.iterator();
                while (it3.hasNext()) {
                    try {
                        c3959f2 = ((C1730o) it3.next()).m4350r(c3742g.f12145c);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method = (Method) c3959f2;
                    if (method != null) {
                        c3959f.add(method);
                    }
                }
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            Object obj = c3959f;
            if (thM8182b != null) {
                String str3 = (String) AbstractC4165l.m8391z0(strArr);
                if (str3 != null) {
                    str2 = str3;
                }
                c6006b.invoke("定位微信通话铃声入口失败: ".concat(str2), thM8182b);
                obj = C4173t.f13710g;
            }
            for (Object obj2 : (List) obj) {
                if (m10892c((Method) obj2)) {
                    linkedHashSet.add(obj2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : linkedHashSet) {
            if (hashSet.add(((Method) obj3).toGenericString())) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                    editorEdit.clear().putString("cache.key", str);
                }
                editorEdit.remove("direction_methods_v1").apply();
            } catch (Throwable unused) {
            }
            c6006b.invoke("未定位微信通话铃声入口", null);
        } else {
            C0828b.f2478a.m2097j(sharedPreferences, str, "direction_methods_v1", arrayList);
        }
        return arrayList;
    }
}
