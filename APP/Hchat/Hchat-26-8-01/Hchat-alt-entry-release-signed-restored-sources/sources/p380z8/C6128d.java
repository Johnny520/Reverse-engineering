package p380z8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import gh.C1431c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1252j;
import p086fh.C1253k;
import p086fh.C1254l;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p365y9.C6006b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: z8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6128d {

    /* JADX INFO: renamed from: h */
    public static final List f24693h = AbstractC0000a.m101y0("isMultiTalking", "isCameraUsing", "isVoiceUsing", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b");

    /* JADX INFO: renamed from: a */
    public final C3742g f24694a;

    /* JADX INFO: renamed from: b */
    public final C6006b f24695b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f24696c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f24697d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f24698e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap.KeySetView f24699f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f24700g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6128d(C3742g c3742g, C6006b c6006b) {
        c3742g.getClass();
        this.f24694a = c3742g;
        this.f24695b = c6006b;
        this.f24696c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_call_media_limit_method_cache");
        this.f24697d = new ThreadLocal();
        this.f24698e = new ConcurrentHashMap();
        this.f24699f = ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10884a(Method method) {
        if (KavaReflector.isStatic(method)) {
            return (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class)) && method.getParameterTypes().length <= 3;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10885b(List list) {
        if (list.size() < 7) {
            return false;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getDeclaringClass());
        }
        if (AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)).size() != 1) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!m10884a((Method) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m10886c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return KavaReflector.isStatic(method) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.viewitems.") && parameterTypes.length == 3 && parameterTypes[2].getName().equals("com.tencent.mm.plugin.msgquote.model.MsgQuoteItem") && (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m10887d() {
        ArrayList arrayList;
        C3742g c3742g;
        Object obj;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        DexKitBridge dexKitBridge;
        C0570e c0570e;
        C1253k c1253k;
        C6128d c6128d = this;
        C3742g c3742g2 = c6128d.f24694a;
        Context context = c3742g2.f12143a;
        ClassLoader classLoader = c3742g2.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        ClassLoader classLoader2 = c3742g2.f12145c;
        ClassLoader classLoader3 = c3742g2.f12145c;
        SharedPreferences sharedPreferences = c6128d.f24696c;
        List listM2090f = C0828b.m2090f(sharedPreferences, str, classLoader2, "device_occupy_methods_v1");
        if (!m10885b(listM2090f)) {
            listM2090f = null;
        }
        if (listM2090f != null) {
            return listM2090f;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = f24693h.iterator();
        int i9 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C6006b c6006b = c6128d.f24695b;
            List list = C4173t.f13710g;
            if (!zHasNext) {
                linkedHashSet.addAll(linkedHashSet2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    Class<?> declaringClass = ((Method) obj2).getDeclaringClass();
                    Object arrayList2 = linkedHashMap.get(declaringClass);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(declaringClass, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (m10885b((List) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                List list2 = (List) AbstractC4166m.m8400I1(arrayList3);
                if (list2 != null) {
                    HashSet hashSet = new HashSet();
                    arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (hashSet.add(((Method) obj4).toGenericString())) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    try {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                            editorEdit.clear().putString("cache.key", str);
                        }
                        editorEdit.remove("device_occupy_methods_v1").apply();
                    } catch (Throwable unused) {
                    }
                    c6006b.invoke("通话占用方法组不完整或候选不唯一", null);
                } else {
                    C0828b.f2478a.m2097j(sharedPreferences, str, "device_occupy_methods_v1", list);
                }
                return list;
            }
            Object next = it.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            String str2 = (String) next;
            try {
                dexKitBridge = c3742g2.f12146d;
                obj = null;
                try {
                    c0570e = new C0570e();
                    c1253k = new C1253k();
                    c3742g = c3742g2;
                } catch (Throwable th2) {
                    th = th2;
                    c3742g = c3742g2;
                }
            } catch (Throwable th3) {
                th = th3;
                c3742g = c3742g2;
                obj = null;
            }
            try {
                c1253k.m3374r0("MicroMsg.DeviceOccupy", str2);
                c0570e.f1764h = c1253k;
                c3959f = dexKitBridge.findMethod(c0570e);
            } catch (Throwable th4) {
                th = th4;
                c3959f = new C3959f(th);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c6006b.invoke("定位通话占用方法失败: " + str2, thM8182b);
                c3959f = list;
            }
            for (C1730o c1730o : (List) c3959f) {
                try {
                    c3959f2 = c1730o.m4350r(classLoader3);
                } catch (Throwable th5) {
                    c3959f2 = new C3959f(th5);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj;
                }
                Method method = (Method) c3959f2;
                if (method != null && m10884a(method)) {
                    linkedHashSet.add(method);
                    if (i9 == 0) {
                        try {
                            c3959f3 = c1730o.m4349q();
                        } catch (Throwable th6) {
                            c3959f3 = new C3959f(th6);
                        }
                        if (c3959f3 instanceof C3959f) {
                            c3959f3 = list;
                        }
                        Iterator it2 = ((Iterable) c3959f3).iterator();
                        while (it2.hasNext()) {
                            try {
                                c3959f4 = ((C1730o) it2.next()).m4350r(classLoader3);
                            } catch (Throwable th7) {
                                c3959f4 = new C3959f(th7);
                            }
                            if (c3959f4 instanceof C3959f) {
                                c3959f4 = obj;
                            }
                            Method method2 = (Method) c3959f4;
                            if (method2 != null) {
                                Class<?> declaringClass2 = method.getDeclaringClass();
                                declaringClass2.getClass();
                                if (AbstractC1416l.m3825a(method2.getDeclaringClass(), declaringClass2) && KavaReflector.isStatic(method2)) {
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    parameterTypes.getClass();
                                    if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method2.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method2.getReturnType(), Boolean.class))) {
                                        linkedHashSet2.add(method2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c6128d = this;
            i9 = i10;
            c3742g2 = c3742g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x00f3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    public final Method m10888e() {
        ?? c3959f;
        ?? r02;
        Object c3959f2;
        C4173t c4173t = C4173t.f13710g;
        C3742g c3742g = this.f24694a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        ClassLoader classLoader2 = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f24696c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, str, classLoader2, "voice_playback_guard_v1");
        if (methodM2087c != null) {
            if (!m10886c(methodM2087c)) {
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
            c1253k.m3369l0(2, "com.tencent.mm.ui.chatting.viewitems.");
            C1253k c1253k2 = new C1253k();
            c1253k2.m3369l0(5, "com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent");
            c1253k2.f4103g = new C1431c("<init>", 5);
            C1252j c1252j = new C1252j(1);
            c1252j.f4101h = new ArrayList(c4173t);
            c1253k2.f4106j = c1252j;
            C1254l c1254l = c1253k.f4109m;
            if (c1254l == null) {
                c1254l = new C1254l();
            }
            c1253k.f4109m = c1254l;
            c1254l.m3377k0(c1253k2);
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
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m10886c((Method) obj)) {
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
        C6006b c6006b = this.f24695b;
        if (thM8182b == null) {
            r02 = c3959f;
        } else {
            c6006b.invoke("定位语音消息通话检查方法失败", thM8182b);
            r02 = c4173t;
        }
        Method method2 = (Method) AbstractC4166m.m8400I1((List) r02);
        if (method2 == null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                    editorEdit.clear().putString("cache.key", str);
                }
                editorEdit.remove("voice_playback_guard_v1").apply();
            } catch (Throwable unused) {
            }
            c6006b.invoke("语音消息通话检查方法缺失或候选不唯一", null);
        } else {
            C0828b.m2092h(sharedPreferences, str, "voice_playback_guard_v1", method2);
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        r6 = null;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6126b m10889f() {
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent", this.f24694a.f12145c);
        C6006b c6006b = this.f24695b;
        if (clsLoadClass == null) {
            c6006b.invoke("微信通话状态事件类缺失", null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = clsLoadClass; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(superclass);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listDeclaredMethods) {
                if (!KavaReflector.isStatic((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((Method) it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        Object obj2 = null;
        boolean z9 = false;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method)) {
                    if (z9) {
                        break;
                    }
                    obj2 = next;
                    z9 = true;
                }
            } else if (!z9) {
                break;
            }
        }
        Method method2 = (Method) obj2;
        if (method2 == null) {
            c6006b.invoke("微信通话状态事件派发方法缺失或候选不唯一", null);
            return null;
        }
        Iterator<T> it3 = KavaReflector.declaredFields(clsLoadClass).iterator();
        Object obj3 = null;
        boolean z10 = false;
        while (true) {
            if (it3.hasNext()) {
                Object next2 = it3.next();
                Field field = (Field) next2;
                if ((KavaReflector.isStatic(field) || field.getType().isPrimitive()) ? false : true) {
                    if (z10) {
                        break;
                    }
                    obj3 = next2;
                    z10 = true;
                }
            } else if (!z10) {
                break;
            }
        }
        obj3 = null;
        Field field2 = (Field) obj3;
        if (field2 != null) {
            return new C6126b(method2, field2);
        }
        c6006b.invoke("微信通话状态事件结果字段缺失或候选不唯一", null);
        return null;
    }
}
