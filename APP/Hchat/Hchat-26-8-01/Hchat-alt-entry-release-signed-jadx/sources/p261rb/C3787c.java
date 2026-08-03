package p261rb;

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
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p062e8.C0828b;
import p086fh.C1253k;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p153k8.C2355s;
import p210o8.C3087k;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: rb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3787c {

    /* JADX INFO: renamed from: a */
    public final C3742g f12410a;

    /* JADX INFO: renamed from: b */
    public final C3795k f12411b;

    /* JADX INFO: renamed from: c */
    public final C2026t f12412c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f12413d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f12414e;

    /* JADX INFO: renamed from: f */
    public volatile Method f12415f;

    /* JADX INFO: renamed from: g */
    public volatile Object f12416g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f12417h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3787c(C3742g c3742g, C3795k c3795k, C2026t c2026t) {
        c3742g.getClass();
        this.f12410a = c3742g;
        this.f12411b = c3795k;
        this.f12412c = c2026t;
        this.f12413d = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_zombie_check_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7964c(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getDeclaringClass(), cls) && AbstractC1416l.m3825a(method.getName(), "onGYNetEnd") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && AbstractC1416l.m3825a(parameterTypes[0], Integer.TYPE) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && AbstractC1416l.m3825a(parameterTypes[2], JSONObject.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7965d(Method method) {
        List<Constructor<?>> listDeclaredConstructors;
        if (!KavaReflector.isStatic(method) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length != 2 || !AbstractC1416l.m3825a(parameterTypes[0], String.class) || !AbstractC1416l.m3825a(parameterTypes[1], Boolean.TYPE)) {
                if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && ((listDeclaredConstructors = KavaReflector.declaredConstructors(method.getDeclaringClass())) == null || !listDeclaredConstructors.isEmpty())) {
                    Iterator<T> it = listDeclaredConstructors.iterator();
                    while (it.hasNext()) {
                        Class<?>[] parameterTypes2 = ((Constructor) it.next()).getParameterTypes();
                        parameterTypes2.getClass();
                        if (parameterTypes2.length == 0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m7966e(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if ((parameterTypes.length == 29 || parameterTypes.length == 30) && AbstractC1416l.m3825a(parameterTypes[0], Double.TYPE)) {
            int[] iArr = {1, 2, 3, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22, 23, 25, 27, 28};
            int i9 = 0;
            while (true) {
                if (i9 >= 21) {
                    int[] iArr2 = {4, 5, 7, 13, 24, 26};
                    int i10 = 0;
                    while (true) {
                        if (i10 < 6) {
                            if (!AbstractC1416l.m3825a(parameterTypes[iArr2[i10]], Integer.TYPE)) {
                                break;
                            }
                            i10++;
                        } else if (parameterTypes[19].getName().equals("com.tencent.mm.autogen.events.F2fDynamicStartPayEvent") && (parameterTypes.length != 30 || AbstractC1416l.m3825a(parameterTypes[29], Boolean.TYPE))) {
                            return AbstractC3156t.m6740d0(constructor.getDeclaringClass().getName(), "com.tencent.mm.plugin.remittance.model.", false);
                        }
                    }
                } else {
                    if (!AbstractC1416l.m3825a(parameterTypes[iArr[i9]], String.class)) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m7967a(String str) {
        str.getClass();
        Constructor constructor = this.f12414e;
        if (constructor != null && m7966e(constructor)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length = parameterTypes.length;
            Object[] objArr = new Object[length];
            for (int i9 = 0; i9 < length; i9++) {
                Class<?> cls = parameterTypes[i9];
                cls.getClass();
                objArr[i9] = (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) ? Boolean.FALSE : (cls.equals(Byte.TYPE) || cls.equals(Byte.class)) ? (byte) 0 : (cls.equals(Short.TYPE) || cls.equals(Short.class)) ? (short) 0 : (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) ? 0 : (cls.equals(Long.TYPE) || cls.equals(Long.class)) ? 0L : (cls.equals(Float.TYPE) || cls.equals(Float.class)) ? Float.valueOf(0.0f) : (cls.equals(Double.TYPE) || cls.equals(Double.class)) ? Double.valueOf(0.0d) : cls.equals(String.class) ? HttpUrl.FRAGMENT_ENCODE_SET : null;
            }
            objArr[0] = Double.valueOf(1.0d);
            objArr[1] = "1";
            objArr[2] = str;
            objArr[4] = 31;
            objArr[5] = 2;
            objArr[13] = 11;
            objArr[24] = 0;
            objArr[26] = 0;
            Object objNewInstance = KavaReflector.newInstance(constructor, Arrays.copyOf(objArr, length));
            if (objNewInstance != null) {
                KavaReflector.invokeMethod(objNewInstance, "setProcessName", "RemittanceProcess");
                return objNewInstance;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m7968b(String str, boolean z9) {
        Object c3959f;
        Object[] objArr;
        Object c3959f2;
        str.getClass();
        Method methodM7970g = this.f12415f;
        if (methodM7970g == null && (methodM7970g = m7970g()) == null) {
            return false;
        }
        try {
            Object objM7972i = m7972i(methodM7970g);
            if (objM7972i == null) {
                this.f12412c.invoke("删除好友服务实例获取失败: " + methodM7970g.toGenericString(), null);
                return false;
            }
            if (methodM7970g.getParameterTypes().length == 2) {
                if (z9) {
                    zBooleanValue = true;
                } else {
                    C2355s c2355sMessageStore = WeChatApis.messageStore();
                    if (c2355sMessageStore != null && c2355sMessageStore.m5665h()) {
                        try {
                            c3959f2 = Boolean.valueOf(c2355sMessageStore.m5660b(str) == null);
                        } catch (Throwable th2) {
                            c3959f2 = new C3959f(th2);
                        }
                        Object obj = Boolean.FALSE;
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = obj;
                        }
                        zBooleanValue = ((Boolean) c3959f2).booleanValue();
                    }
                }
                objArr = new Object[]{str, Boolean.valueOf(zBooleanValue)};
            } else {
                objArr = new Object[]{str};
            }
            KavaReflector.invokeOrThrow(methodM7970g, objM7972i, Arrays.copyOf(objArr, objArr.length));
            c3959f = Boolean.TRUE;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f12412c.invoke("删除异常好友失败: ".concat(str), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Method m7969f(Constructor constructor) {
        String strM7973j = m7973j();
        ClassLoader classLoader = this.f12410a.f12145c;
        SharedPreferences sharedPreferences = this.f12413d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM7973j, classLoader, "probe_callback_v1");
        Object obj = null;
        if (methodM2087c != null) {
            Class declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            if (!m7964c(declaringClass, methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        Iterator<T> it = KavaReflector.declaredMethods(constructor.getDeclaringClass()).iterator();
        boolean z9 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                if (m7964c(declaringClass2, (Method) next)) {
                    if (z9) {
                        break;
                    }
                    z9 = true;
                    obj2 = next;
                }
            } else if (z9) {
                obj = obj2;
            }
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strM7973j, "probe_callback_v1", method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7973j)) {
                editorEdit.clear().putString("cache.key", strM7973j);
            }
            editorEdit.remove("probe_callback_v1").apply();
        } catch (Throwable unused) {
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0164 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final Method m7970g() {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        String strM7973j = m7973j();
        Method methodM2087c = C0828b.m2087c(this.f12413d, strM7973j, this.f12410a.f12145c, "delete_contact_method_v2");
        if (methodM2087c != null) {
            if (!m7965d(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                this.f12415f = methodM2087c;
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = this.f12410a.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.DeleteContactService", "delete contact %s isClearRecord:%s");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f3 = ((C1730o) it.next()).m4350r(this.f12410a.f12145c);
                } catch (Throwable th2) {
                    c3959f3 = new C3959f(th2);
                }
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = null;
                }
                Method method = (Method) c3959f3;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m7965d((Method) obj)) {
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
            if (c3959f.isEmpty()) {
                DexKitBridge dexKitBridge2 = this.f12410a.f12146d;
                C0570e c0570e2 = new C0570e();
                C1253k c1253k2 = new C1253k();
                c1253k2.m3374r0("MicroMsg.DeleteContactService", "delete contact %s");
                c0570e2.f1764h = c1253k2;
                C1731p c1731pFindMethod2 = dexKitBridge2.findMethod(c0570e2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = c1731pFindMethod2.iterator();
                while (it2.hasNext()) {
                    try {
                        c3959f2 = ((C1730o) it2.next()).m4350r(this.f12410a.f12145c);
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method2 = (Method) c3959f2;
                    if (method2 != null) {
                        arrayList3.add(method2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (m7965d((Method) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                HashSet hashSet2 = new HashSet();
                c3959f = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (hashSet2.add(((Method) obj4).toGenericString())) {
                        c3959f.add(obj4);
                    }
                }
            }
        } catch (Throwable th4) {
            c3959f = new C3959f(th4);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj5 = c3959f;
        if (thM8182b != null) {
            this.f12412c.invoke("定位删除好友方法失败", thM8182b);
            obj5 = C4173t.f13710g;
        }
        List list = (List) obj5;
        Method method3 = (Method) AbstractC4166m.m8400I1(list);
        SharedPreferences sharedPreferences = this.f12413d;
        if (method3 != null) {
            C0828b.m2092h(sharedPreferences, strM7973j, "delete_contact_method_v2", method3);
            this.f12415f = method3;
        } else {
            sharedPreferences.getClass();
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7973j)) {
                    editorEdit.clear().putString("cache.key", strM7973j);
                }
                editorEdit.remove("delete_contact_method_v2").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                this.f12412c.invoke("删除好友方法候选不唯一", null);
            }
        }
        return method3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x00cd */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: h */
    public final Constructor m7971h() {
        Object c3959f;
        Object c3959f2;
        Constructor constructor;
        String strM7973j = m7973j();
        C3742g c3742g = this.f12410a;
        ClassLoader classLoader = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f12413d;
        Constructor constructorM2088d = C0828b.m2088d(sharedPreferences, strM7973j, classLoader, "probe_constructor_v1");
        if (constructorM2088d != null) {
            if (!m7966e(constructorM2088d)) {
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
            c1253k.m3374r0("Micromsg.NetSceneTenpayRemittanceGen", "receiver_openid", "placeorder_attach");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                if (c1730o.m4352t()) {
                    try {
                        ClassLoader classLoader2 = c3742g.f12145c;
                        classLoader2.getClass();
                        c3959f2 = c1730o.m4348p().m6022a(classLoader2);
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
                if (m7966e((Constructor) obj)) {
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
        C2026t c2026t = this.f12412c;
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c2026t.invoke("定位转账核验构造器失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Constructor constructor2 = (Constructor) AbstractC4166m.m8400I1(list);
        if (constructor2 != null) {
            C0828b.m2093i(sharedPreferences, strM7973j, "probe_constructor_v1", constructor2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7973j)) {
                    editorEdit.clear().putString("cache.key", strM7973j);
                }
                editorEdit.remove("probe_constructor_v1").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c2026t.invoke("转账核验构造器候选不唯一", null);
            }
        }
        return constructor2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m7972i(Method method) {
        Object next;
        Class<?> declaringClass = method.getDeclaringClass();
        Object obj = this.f12416g;
        if (obj != null) {
            declaringClass.getClass();
            if (!declaringClass.isInstance(obj)) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        DexFinder dexFinder = this.f12410a.f12147e;
        if (dexFinder.serviceGetterMethod == null) {
            dexFinder.resolveServiceManagerApi();
        }
        Object objM4995A = AbstractC2043a.m4995A(dexFinder, declaringClass);
        if (objM4995A != null) {
            this.f12416g = objM4995A;
            return objM4995A;
        }
        Object objStaticInstance = KavaReflector.staticInstance(declaringClass);
        if (objStaticInstance != null) {
            declaringClass.getClass();
            if (!declaringClass.isInstance(objStaticInstance)) {
                objStaticInstance = null;
            }
            if (objStaticInstance != null) {
                this.f12416g = objStaticInstance;
                return objStaticInstance;
            }
        }
        Iterator<T> it = KavaReflector.declaredConstructors(declaringClass).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Class<?>[] parameterTypes = ((Constructor) next).getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0) {
                break;
            }
        }
        Constructor constructor = (Constructor) next;
        Object objNewInstance = constructor != null ? KavaReflector.newInstance(constructor, new Object[0]) : null;
        if (objNewInstance != null) {
            this.f12416g = objNewInstance;
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m7973j() {
        C3742g c3742g = this.f12410a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }
}
