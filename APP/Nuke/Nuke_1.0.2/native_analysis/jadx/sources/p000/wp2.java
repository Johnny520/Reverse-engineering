package p000;

import android.app.Activity;
import android.content.Context;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends AbstractC0812vj implements w70 {

    /* JADX INFO: renamed from: d */
    public static final wp2 f12607d = new wp2(true);

    /* JADX INFO: renamed from: e */
    public static final String f12608e = "SettingMenuInjector";

    /* JADX INFO: renamed from: f */
    public static final boolean f12609f = true;

    /* JADX INFO: renamed from: g */
    public static final hx2 f12610g = new hx2(new hn1(17));

    /* JADX INFO: renamed from: h */
    public static final hx2 f12611h = new hx2(new hn1(18));

    /* JADX INFO: renamed from: j */
    public static Class m5950j() {
        return (Class) f12610g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e3  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5951l() throws Throwable {
        Method methodM5640e;
        Method method;
        Method methodM5640e2;
        final Integer numValueOf;
        InvocationHandler invocationHandler;
        a63 a63Var;
        Class<?>[] clsArr;
        a63 a63Var2;
        vg1 vg1Var;
        Object obj;
        yb1[] yb1VarArr;
        Object obj2;
        Object obj3;
        za2 za2Var;
        za2 za2Var2;
        za2 za2Var3;
        za2 za2Var4;
        Method method2;
        vg1 vg1Var2;
        C0859wt c0859wt;
        za2 za2Var5;
        int iM3506d;
        Class<InvocationHandler> cls;
        Class cls2;
        int i;
        InvocationHandler invocationHandler2;
        Class clsM5639d = qp2.f9084b.m5639d();
        Method[] declaredMethods = ((Class) f12610g.getValue()).getDeclaredMethods();
        tp2 tp2Var = tp2.f10895b;
        tp2Var.getClass();
        try {
            methodM5640e = tp2Var.m5640e();
        } catch (Throwable unused) {
            methodM5640e = null;
        }
        int i2 = 0;
        boolean z = true;
        boolean z2 = methodM5640e != null;
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i3 = 0;
        while (i3 < length) {
            Method method3 = declaredMethods[i3];
            if (method3.getParameterCount() == 0 && t11.m5086l(method3.getReturnType(), Class.class)) {
                int length2 = declaredMethods.length - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i4 = length2 - 1;
                        Method method4 = declaredMethods[length2];
                        if (method4.getParameterCount() == 0 && t11.m5086l(method4.getReturnType(), clsM5639d)) {
                            Class cls3 = Integer.TYPE;
                            if (z2) {
                                int length3 = declaredMethods.length - 1;
                                if (length3 >= 0) {
                                    while (true) {
                                        int i5 = length3 - 1;
                                        method = declaredMethods[length3];
                                        if (method.getParameterCount() == 0 && t11.m5086l(method.getReturnType(), cls3) && !t11.m5086l(method.getName(), tp2.f10895b.m5640e().getName())) {
                                            break;
                                        } else if (i5 < 0) {
                                            break;
                                        } else {
                                            length3 = i5;
                                        }
                                    }
                                }
                                um2.m5519i("Array contains no element matching the predicate.");
                                return;
                            }
                            int length4 = declaredMethods.length - 1;
                            if (length4 >= 0) {
                                while (true) {
                                    int i6 = length4 - 1;
                                    method = declaredMethods[length4];
                                    if (method.getParameterCount() == 0 && t11.m5086l(method.getReturnType(), cls3)) {
                                        break;
                                    }
                                    boolean z3 = z;
                                    Method method5 = method4;
                                    Class cls4 = cls3;
                                    int i7 = i2;
                                    if (i6 < 0) {
                                        break;
                                    }
                                    length4 = i6;
                                    z = z3;
                                    method4 = method5;
                                    i2 = i7;
                                    cls3 = cls4;
                                }
                            }
                            um2.m5519i("Array contains no element matching the predicate.");
                            return;
                            int length5 = declaredMethods.length;
                            for (int i8 = i2; i8 < length5; i8++) {
                                Method method6 = declaredMethods[i8];
                                if (method6.getParameterCount() == 3) {
                                    Class clsM5639d2 = op2.f7766b.m5639d();
                                    Method methodM5640e3 = rp2.f9696b.m5640e();
                                    Class clsM5639d3 = pp2.f8451b.m5639d();
                                    Method methodM5640e4 = vp2.f12121b.m5640e();
                                    Method method7 = method4;
                                    String name = method3.getName();
                                    name.getClass();
                                    tp2 tp2Var2 = tp2.f10895b;
                                    tp2Var2.getClass();
                                    try {
                                        methodM5640e2 = tp2Var2.m5640e();
                                    } catch (Throwable unused2) {
                                        methodM5640e2 = null;
                                    }
                                    String name2 = methodM5640e2 != null ? methodM5640e2.getName() : null;
                                    String name3 = method6.getName();
                                    name3.getClass();
                                    String name4 = up2.f11411b.m5640e().getName();
                                    name4.getClass();
                                    String name5 = method7.getName();
                                    name5.getClass();
                                    String name6 = method.getName();
                                    name6.getClass();
                                    String name7 = sp2.f10282b.m5640e().getName();
                                    name7.getClass();
                                    boolean z4 = z;
                                    Class cls5 = cls3;
                                    final z70 z70Var = new z70(clsM5639d2, clsM5639d, methodM5640e3, clsM5639d3, methodM5640e4, name, name2, name3, name4, name5, name6, name7);
                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) z70Var.f13762m;
                                    Context context = up0.f11401i;
                                    if (context == null) {
                                        t11.m5067S("hostContext");
                                        throw null;
                                    }
                                    String string = context.getString(R.string.home_settings_plugin_group);
                                    f12607d.getClass();
                                    final Class cls6 = (Class) f12611h.getValue();
                                    final ml2 ml2Var = new ml2(5);
                                    cls6.getClass();
                                    final int i9 = z70Var.f13750a;
                                    z70Var.f13750a = i9 - 1;
                                    concurrentHashMap.put(Integer.valueOf(i9), "Nuke");
                                    if (string != null) {
                                        int i10 = z70Var.f13750a;
                                        z70Var.f13750a = i10 - 1;
                                        concurrentHashMap.put(Integer.valueOf(i10), string);
                                        numValueOf = Integer.valueOf(i10);
                                    } else {
                                        numValueOf = null;
                                    }
                                    Constructor<?>[] declaredConstructors = clsM5639d.getDeclaredConstructors();
                                    declaredConstructors.getClass();
                                    int length6 = declaredConstructors.length;
                                    for (int i11 = i2; i11 < length6; i11++) {
                                        final Constructor<?> constructor = declaredConstructors[i11];
                                        if (constructor.getParameterCount() == 2) {
                                            constructor.setAccessible(z4);
                                            InvocationHandler invocationHandler3 = new InvocationHandler() { // from class: mh1
                                                @Override // java.lang.reflect.InvocationHandler
                                                public final Object invoke(Object obj4, Method method8, Object[] objArr) {
                                                    z70 z70Var2 = z70Var;
                                                    String str = (String) z70Var2.f13756g;
                                                    String str2 = (String) z70Var2.f13757h;
                                                    String str3 = (String) z70Var2.f13761l;
                                                    String str4 = (String) z70Var2.f13760k;
                                                    String str5 = (String) z70Var2.f13759j;
                                                    String str6 = (String) z70Var2.f13758i;
                                                    String str7 = (String) z70Var2.f13755f;
                                                    Class cls7 = cls6;
                                                    Constructor constructor2 = constructor;
                                                    int i12 = i9;
                                                    ml2 ml2Var2 = ml2Var;
                                                    if (str == null) {
                                                        String name8 = method8.getName();
                                                        if (!t11.m5086l(name8, str7)) {
                                                            if (t11.m5086l(name8, str6)) {
                                                                return "SettingGroup_Main_Nuke";
                                                            }
                                                            if (t11.m5086l(name8, str5)) {
                                                                return constructor2.newInstance(cls7, null);
                                                            }
                                                            if (t11.m5086l(name8, str4)) {
                                                                return Integer.valueOf(i12);
                                                            }
                                                            if (!t11.m5086l(name8, str3)) {
                                                                if (!t11.m5086l(name8, str2)) {
                                                                    Object[] objArr2 = objArr == null ? new Object[0] : objArr;
                                                                    return i42.m2265a(obj4, method8, Arrays.copyOf(objArr2, objArr2.length));
                                                                }
                                                                Object objM3097l0 = objArr != null ? AbstractC0460mg.m3097l0(objArr) : null;
                                                                objM3097l0.getClass();
                                                                ml2Var2.mo5j((Activity) objM3097l0);
                                                                return null;
                                                            }
                                                            return numValueOf;
                                                        }
                                                        return cls7;
                                                    }
                                                    String name9 = method8.getName();
                                                    if (!t11.m5086l(name9, str7)) {
                                                        if (t11.m5086l(name9, str)) {
                                                            return 1;
                                                        }
                                                        if (t11.m5086l(name9, str6)) {
                                                            return "SettingGroup_Main_Nuke";
                                                        }
                                                        if (t11.m5086l(name9, str5)) {
                                                            return constructor2.newInstance(cls7, null);
                                                        }
                                                        if (t11.m5086l(name9, str4)) {
                                                            return Integer.valueOf(i12);
                                                        }
                                                        if (!t11.m5086l(name9, str3)) {
                                                            if (!t11.m5086l(name9, str2)) {
                                                                Object[] objArr3 = objArr == null ? new Object[0] : objArr;
                                                                return i42.m2265a(obj4, method8, Arrays.copyOf(objArr3, objArr3.length));
                                                            }
                                                            Object objM3097l02 = objArr != null ? AbstractC0460mg.m3097l0(objArr) : null;
                                                            objM3097l02.getClass();
                                                            ml2Var2.mo5j((Activity) objM3097l02);
                                                            return null;
                                                        }
                                                        return numValueOf;
                                                    }
                                                    return cls7;
                                                }
                                            };
                                            ClassLoader classLoader = up0.f11402j;
                                            if (classLoader == null) {
                                                t11.m5067S("hostClassLoader");
                                                throw null;
                                            }
                                            ph1 ph1Var = new ph1(classLoader);
                                            ClassLoader classLoader2 = up0.f11402j;
                                            if (classLoader2 == null) {
                                                t11.m5067S("hostClassLoader");
                                                throw null;
                                            }
                                            Class<?> clsLoadClass = classLoader2.loadClass("androidx.appcompat.app.AppCompatActivity");
                                            clsLoadClass.getClass();
                                            z70Var.f13764o = clsLoadClass;
                                            i42 i42Var = new i42((Class) z70Var.f13751b);
                                            Context context2 = up0.f11401i;
                                            if (context2 == null) {
                                                t11.m5067S("hostContext");
                                                throw null;
                                            }
                                            File codeCacheDir = context2.getCodeCacheDir();
                                            codeCacheDir.getClass();
                                            File fileM5901g0 = wi0.m5901g0(codeCacheDir, "nuke_setting_proxy");
                                            fileM5901g0.mkdirs();
                                            File file = new File(fileM5901g0, "v" + Integer.toString(z4 ? 1 : 0));
                                            i42Var.f4265c = file;
                                            file.mkdir();
                                            i42Var.f4264b = ph1Var;
                                            if (((Class) z70Var.f13764o) == null) {
                                                t11.m5067S("activityConstructorType");
                                                throw null;
                                            }
                                            Class cls7 = new Class[]{nh1.class}[i2];
                                            if (!cls7.isInterface()) {
                                                C0676s.m4651j("Not an interface: ".concat(cls7.getName()));
                                                return;
                                            }
                                            ArrayList arrayList = i42Var.f4267e;
                                            if (!arrayList.contains(cls7)) {
                                                arrayList.add(cls7);
                                            }
                                            ClassLoader classLoader3 = i42Var.f4264b;
                                            Class superclass = i42Var.f4263a;
                                            h42 h42Var = new h42(superclass, arrayList, classLoader3);
                                            Map map = i42.f4259f;
                                            Class<?> clsLoadClass2 = (Class) map.get(h42Var);
                                            if (clsLoadClass2 != null) {
                                                invocationHandler = invocationHandler3;
                                            } else {
                                                sz0 sz0Var = new sz0(12);
                                                String hexString = Integer.toHexString(arrayList.hashCode());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(superclass.getName().replace(".", "/"));
                                                sb.append("_");
                                                String strM2211j = hk1.m2211j(sb, hexString, "_Proxy");
                                                String strM5691j = vi0.m5691j("L", strM2211j, ";");
                                                try {
                                                    a63 a63Var3 = new a63(strM5691j, strM5691j.equals("V") ? o43.f7516v : o43.m3504g(strM5691j));
                                                    a63 a63VarM101a = a63.m101a(superclass);
                                                    Class<InvocationHandler> cls8 = InvocationHandler.class;
                                                    a63 a63VarM101a2 = a63.m101a(cls8);
                                                    Throwable th = null;
                                                    a63 a63VarM101a3 = a63.m101a(Method[].class);
                                                    sz0Var.m5044y(new li0(a63Var3, a63VarM101a2, "$__handler"), 2);
                                                    String str = "$__methodArray";
                                                    sz0Var.m5044y(new li0(a63Var3, a63VarM101a3, "$__methodArray"), 10);
                                                    Constructor<?>[] declaredConstructors2 = superclass.getDeclaredConstructors();
                                                    int length7 = declaredConstructors2.length;
                                                    int i12 = 0;
                                                    while (i12 < length7) {
                                                        Constructor<?> constructor2 = declaredConstructors2[i12];
                                                        Constructor<?>[] constructorArr = declaredConstructors2;
                                                        int i13 = i12;
                                                        if (constructor2.getModifiers() == 16) {
                                                            invocationHandler2 = invocationHandler3;
                                                            cls2 = superclass;
                                                            cls = cls8;
                                                            i = length7;
                                                        } else {
                                                            Class<?>[] parameterTypes = constructor2.getParameterTypes();
                                                            int length8 = parameterTypes.length;
                                                            cls = cls8;
                                                            a63[] a63VarArr = new a63[length8];
                                                            cls2 = superclass;
                                                            i = length7;
                                                            for (int i14 = 0; i14 < parameterTypes.length; i14++) {
                                                                a63VarArr[i14] = a63.m101a(parameterTypes[i14]);
                                                            }
                                                            invocationHandler2 = invocationHandler3;
                                                            C0859wt c0859wtM5043t = sz0Var.m5043t(new vg1(a63Var3, a63.f91l, "<init>", new e63(a63VarArr)));
                                                            yb1 yb1Var = c0859wtM5043t.f12630e;
                                                            if (yb1Var == null) {
                                                                C0676s.m4653l("static methods cannot access 'this'");
                                                                return;
                                                            }
                                                            C0859wt.m5985d(yb1Var, a63Var3);
                                                            yb1[] yb1VarArr2 = new yb1[length8];
                                                            int i15 = 0;
                                                            while (i15 < length8) {
                                                                yb1VarArr2[i15] = c0859wtM5043t.m5989e(i15, a63VarArr[i15]);
                                                                i15++;
                                                                length8 = length8;
                                                            }
                                                            a63VarM101a.getClass();
                                                            vg1 vg1Var3 = new vg1(a63VarM101a, a63.f91l, "<init>", new e63(a63VarArr));
                                                            String strM5673a = vg1Var3.m5673a(true);
                                                            ConcurrentHashMap concurrentHashMap2 = d42.f1862l;
                                                            d42 d42VarM959b = (d42) concurrentHashMap2.get(strM5673a);
                                                            if (d42VarM959b == null) {
                                                                d42VarM959b = d42.m959b(strM5673a);
                                                                d42 d42Var = (d42) concurrentHashMap2.putIfAbsent(d42VarM959b.f1863h, d42VarM959b);
                                                                if (d42Var != null) {
                                                                    d42VarM959b = d42Var;
                                                                }
                                                            }
                                                            za2 za2Var6 = cb2.f1380a;
                                                            c0859wtM5043t.m5991g(new za2(52, d42VarM959b.m961c(), wu2.f12679q), vg1Var3, null, yb1Var, yb1VarArr2);
                                                            c0859wtM5043t.m5997m();
                                                        }
                                                        i12 = i13 + 1;
                                                        cls8 = cls;
                                                        declaredConstructors2 = constructorArr;
                                                        length7 = i;
                                                        superclass = cls2;
                                                        invocationHandler3 = invocationHandler2;
                                                    }
                                                    invocationHandler = invocationHandler3;
                                                    Class cls9 = superclass;
                                                    Class<InvocationHandler> cls10 = cls8;
                                                    HashSet hashSet = new HashSet();
                                                    HashSet hashSet2 = new HashSet();
                                                    while (superclass != null) {
                                                        i42.m2266b(hashSet, hashSet2, superclass);
                                                        superclass = superclass.getSuperclass();
                                                    }
                                                    Class superclass2 = cls9;
                                                    while (superclass2 != null) {
                                                        Class<?>[] interfaces = superclass2.getInterfaces();
                                                        int length9 = interfaces.length;
                                                        int i16 = 0;
                                                        while (i16 < length9) {
                                                            i42.m2266b(hashSet, hashSet2, interfaces[i16]);
                                                            i16++;
                                                            superclass2 = superclass2;
                                                        }
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        i42.m2266b(hashSet, hashSet2, (Class) it.next());
                                                    }
                                                    int size = hashSet.size();
                                                    Method[] methodArr = new Method[size];
                                                    Iterator it2 = hashSet.iterator();
                                                    int i17 = 0;
                                                    while (it2.hasNext()) {
                                                        methodArr[i17] = ((g42) it2.next()).f3307d;
                                                        i17++;
                                                    }
                                                    Arrays.sort(methodArr, new sl0(17));
                                                    a63 a63VarM101a4 = a63.m101a(cls10);
                                                    a63 a63VarM101a5 = a63.m101a(Method[].class);
                                                    a63VarM101a4.getClass();
                                                    o30 o30Var = new o30(new q30("$__handler"), new q30(a63VarM101a4.f95a));
                                                    r30 r30Var = a63Var3.f97c;
                                                    c30 c30Var = new c30(r30Var, o30Var);
                                                    a63VarM101a5.getClass();
                                                    c30 c30Var2 = new c30(r30Var, new o30(new q30("$__methodArray"), new q30(a63VarM101a5.f95a)));
                                                    a63 a63VarM101a6 = a63.m101a(Method.class);
                                                    a63 a63VarM101a7 = a63.m101a(Object[].class);
                                                    a63 a63Var4 = a63.f92m;
                                                    vg1 vg1VarM102b = a63VarM101a4.m102b(a63Var4, "invoke", a63Var4, a63VarM101a6, a63VarM101a7);
                                                    int i18 = 0;
                                                    while (i18 < size) {
                                                        Method method8 = methodArr[i18];
                                                        int i19 = size;
                                                        String name8 = method8.getName();
                                                        int i20 = i18;
                                                        Class<?>[] parameterTypes2 = method8.getParameterTypes();
                                                        h42 h42Var2 = h42Var;
                                                        int length10 = parameterTypes2.length;
                                                        Method[] methodArr2 = methodArr;
                                                        a63[] a63VarArr2 = new a63[length10];
                                                        String str2 = str;
                                                        for (int i21 = 0; i21 < length10; i21++) {
                                                            a63VarArr2[i21] = a63.m101a(parameterTypes2[i21]);
                                                        }
                                                        Class<?> returnType = method8.getReturnType();
                                                        i42 i42Var2 = i42Var;
                                                        a63 a63VarM101a8 = a63.m101a(returnType);
                                                        String str3 = strM2211j;
                                                        vg1 vg1VarM102b2 = a63Var3.m102b(a63VarM101a8, name8, a63VarArr2);
                                                        a63 a63VarM101a9 = a63.m101a(AbstractMethodError.class);
                                                        C0859wt c0859wtM5043t2 = sz0Var.m5043t(vg1VarM102b2);
                                                        sz0 sz0Var2 = sz0Var;
                                                        yb1 yb1Var2 = c0859wtM5043t2.f12630e;
                                                        if (yb1Var2 == null) {
                                                            C0676s.m4653l("static methods cannot access 'this'");
                                                            return;
                                                        }
                                                        C0859wt.m5985d(yb1Var2, a63Var3);
                                                        a63 a63Var5 = a63Var3;
                                                        wu2 wu2Var = c0859wtM5043t2.f12635j;
                                                        vg1 vg1Var4 = vg1VarM102b;
                                                        kt2 kt2Var = c0859wtM5043t2.f12633h;
                                                        yb1 yb1VarM5995k = c0859wtM5043t2.m5995k(a63VarM101a4);
                                                        int i22 = length10;
                                                        a63 a63Var6 = yb1VarM5995k.f13391b;
                                                        a63 a63Var7 = a63.f92m;
                                                        yb1 yb1VarM5995k2 = c0859wtM5043t2.m5995k(a63Var7);
                                                        a63 a63Var8 = a63.f88i;
                                                        yb1 yb1VarM5995k3 = c0859wtM5043t2.m5995k(a63Var8);
                                                        yb1 yb1VarM5995k4 = c0859wtM5043t2.m5995k(a63VarM101a7);
                                                        a63 a63Var9 = a63VarM101a7;
                                                        a63 a63Var10 = yb1VarM5995k4.f13391b;
                                                        yb1 yb1VarM5995k5 = c0859wtM5043t2.m5995k(a63Var8);
                                                        yb1 yb1VarM5995k6 = c0859wtM5043t2.m5995k(a63Var7);
                                                        yb1 yb1VarM5995k7 = c0859wtM5043t2.m5995k(a63VarM101a8);
                                                        yb1 yb1VarM5995k8 = c0859wtM5043t2.m5995k(a63VarM101a5);
                                                        a63 a63Var11 = a63VarM101a5;
                                                        yb1 yb1VarM5995k9 = c0859wtM5043t2.m5995k(a63VarM101a6);
                                                        yb1 yb1VarM5995k10 = c0859wtM5043t2.m5995k(a63Var8);
                                                        a63 a63Var12 = a63VarM101a6;
                                                        Class cls11 = (Class) i42.f4260g.get(returnType);
                                                        Object objM5995k = cls11 != null ? c0859wtM5043t2.m5995k(a63.m101a(cls11)) : th;
                                                        yb1 yb1VarM5995k11 = c0859wtM5043t2.m5995k(a63VarM101a4);
                                                        a63 a63Var13 = a63VarM101a4;
                                                        if ((method8.getModifiers() & 1024) == 0) {
                                                            yb1[] yb1VarArr3 = new yb1[parameterTypes2.length];
                                                            yb1 yb1VarM5995k12 = c0859wtM5043t2.m5995k(a63VarM101a8);
                                                            vg1 vg1VarM102b3 = a63VarM101a.m102b(a63VarM101a8, name8, a63VarArr2);
                                                            a63Var = a63VarM101a;
                                                            clsArr = parameterTypes2;
                                                            a63Var2 = a63VarM101a9;
                                                            obj = yb1VarM5995k12;
                                                            yb1VarArr = yb1VarArr3;
                                                            vg1Var = vg1VarM102b3;
                                                            Throwable th2 = th;
                                                            obj2 = th2;
                                                            obj3 = th2;
                                                        } else {
                                                            yb1 yb1VarM5995k13 = c0859wtM5043t2.m5995k(a63.f93n);
                                                            yb1 yb1VarM5995k14 = c0859wtM5043t2.m5995k(a63VarM101a9);
                                                            a63Var = a63VarM101a;
                                                            clsArr = parameterTypes2;
                                                            a63Var2 = a63VarM101a9;
                                                            Throwable th3 = th;
                                                            Throwable th4 = th3;
                                                            vg1Var = th4;
                                                            obj3 = yb1VarM5995k13;
                                                            obj2 = yb1VarM5995k14;
                                                            yb1VarArr = th3;
                                                            obj = th4;
                                                        }
                                                        c0859wtM5043t2.m5993i(yb1VarM5995k10, Integer.valueOf(i20));
                                                        o43 o43Var = yb1VarM5995k8.f13391b.f96b;
                                                        za2 za2Var7 = cb2.f1380a;
                                                        switch (o43Var.f7522i) {
                                                            case 1:
                                                                za2Var = cb2.f1387b2;
                                                                break;
                                                            case 2:
                                                                za2Var = cb2.f1391c2;
                                                                break;
                                                            case 3:
                                                                za2Var = cb2.f1395d2;
                                                                break;
                                                            case 4:
                                                                za2Var = cb2.f1379Z1;
                                                                break;
                                                            case 5:
                                                                za2Var = cb2.f1376Y1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var = cb2.f1370W1;
                                                                break;
                                                            case 7:
                                                                za2Var = cb2.f1373X1;
                                                                break;
                                                            case 8:
                                                                za2Var = cb2.f1399e2;
                                                                break;
                                                            case 9:
                                                                za2Var = cb2.f1383a2;
                                                                break;
                                                            default:
                                                                cb2.m740a(o43Var);
                                                                throw th;
                                                        }
                                                        c0859wtM5043t2.m5986a(new j23(za2Var, c0859wtM5043t2.f12633h, s72.f9958j, c0859wtM5043t2.f12635j, c30Var2), th);
                                                        c0859wtM5043t2.m5994j(yb1VarM5995k8, true);
                                                        o43 o43Var2 = yb1VarM5995k9.f13391b.f96b;
                                                        switch (o43Var2.f7522i) {
                                                            case 1:
                                                                za2Var2 = cb2.f1440p1;
                                                                break;
                                                            case 2:
                                                                za2Var2 = cb2.f1443q1;
                                                                break;
                                                            case 3:
                                                                za2Var2 = cb2.f1446r1;
                                                                break;
                                                            case 4:
                                                                za2Var2 = cb2.f1434n1;
                                                                break;
                                                            case 5:
                                                                za2Var2 = cb2.f1430m1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var2 = cb2.f1422k1;
                                                                break;
                                                            case 7:
                                                                za2Var2 = cb2.f1426l1;
                                                                break;
                                                            case 8:
                                                                za2Var2 = cb2.f1449s1;
                                                                break;
                                                            case 9:
                                                                za2Var2 = cb2.f1437o1;
                                                                break;
                                                            default:
                                                                cb2.m740a(o43Var2);
                                                                throw th;
                                                        }
                                                        c0859wtM5043t2.m5986a(new k23(za2Var2, kt2Var, s72.m4747i(yb1VarM5995k8.m6248a(), yb1VarM5995k10.m6248a()), wu2Var), null);
                                                        c0859wtM5043t2.m5994j(yb1VarM5995k9, true);
                                                        c0859wtM5043t2.m5993i(yb1VarM5995k5, Integer.valueOf(i22));
                                                        o43 o43Var3 = a63Var10.f96b;
                                                        o43Var3.getClass();
                                                        switch (o43Var3.m3508f().f7522i) {
                                                            case 1:
                                                                za2Var3 = cb2.f1325H1;
                                                                break;
                                                            case 2:
                                                                za2Var3 = cb2.f1328I1;
                                                                break;
                                                            case 3:
                                                                za2Var3 = cb2.f1331J1;
                                                                break;
                                                            case 4:
                                                                za2Var3 = cb2.f1322G1;
                                                                break;
                                                            case 5:
                                                                za2Var3 = cb2.f1319F1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var3 = cb2.f1313D1;
                                                                break;
                                                            case 7:
                                                                za2Var3 = cb2.f1316E1;
                                                                break;
                                                            case 8:
                                                                za2Var3 = cb2.f1334K1;
                                                                break;
                                                            case 9:
                                                                za2Var3 = new za2(41, o43Var3, wu2.f12673k, tg0.f10733d, 6, false, "new-array-object");
                                                                break;
                                                            default:
                                                                cb2.m740a(o43Var3);
                                                                throw null;
                                                        }
                                                        c0859wtM5043t2.m5986a(new j23(za2Var3, c0859wtM5043t2.f12633h, s72.m4746h(yb1VarM5995k5.m6248a()), c0859wtM5043t2.f12635j, a63Var10.f97c), null);
                                                        c0859wtM5043t2.m5994j(yb1VarM5995k4, true);
                                                        o43 o43Var4 = a63Var6.f96b;
                                                        switch (o43Var4.f7522i) {
                                                            case 1:
                                                                za2Var4 = cb2.f1358S1;
                                                                break;
                                                            case 2:
                                                                za2Var4 = cb2.f1361T1;
                                                                break;
                                                            case 3:
                                                                za2Var4 = cb2.f1364U1;
                                                                break;
                                                            case 4:
                                                                za2Var4 = cb2.f1352Q1;
                                                                break;
                                                            case 5:
                                                                za2Var4 = cb2.f1349P1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var4 = cb2.f1343N1;
                                                                break;
                                                            case 7:
                                                                za2Var4 = cb2.f1346O1;
                                                                break;
                                                            case 8:
                                                                za2Var4 = cb2.f1367V1;
                                                                break;
                                                            case 9:
                                                                za2Var4 = cb2.f1355R1;
                                                                break;
                                                            default:
                                                                cb2.m740a(o43Var4);
                                                                throw null;
                                                        }
                                                        c0859wtM5043t2.m5986a(new j23(za2Var4, c0859wtM5043t2.f12633h, s72.m4746h(yb1Var2.m6248a()), c0859wtM5043t2.f12635j, c30Var), null);
                                                        c0859wtM5043t2.m5994j(yb1VarM5995k, true);
                                                        c0859wtM5043t2.m5993i(yb1VarM5995k11, null);
                                                        v51 v51Var = new v51();
                                                        c0859wtM5043t2.m5987b(v51Var);
                                                        wu2 wu2VarM6002i = wu2.m6002i(yb1VarM5995k11.f13391b.f96b, a63Var6.f96b);
                                                        za2 za2Var8 = cb2.f1447s;
                                                        za2 za2Var9 = cb2.f1465y;
                                                        za2 za2Var10 = cb2.f1302A;
                                                        za2 za2Var11 = cb2.f1320G;
                                                        int length11 = wu2VarM6002i.f5590i.length;
                                                        if (length11 == 1) {
                                                            int iM3506d2 = wu2VarM6002i.getType(0).m3506d();
                                                            if (iM3506d2 != 6) {
                                                                if (iM3506d2 == 9 && za2Var9 != null) {
                                                                    za2Var8 = za2Var9;
                                                                }
                                                            }
                                                        } else if (length11 != 2 || (iM3506d = wu2VarM6002i.getType(0).m3506d()) != wu2VarM6002i.getType(1).m3506d()) {
                                                            C0676s.m4648g("bad types: ", wu2VarM6002i);
                                                            za2Var8 = null;
                                                        } else if (iM3506d == 6) {
                                                            za2Var8 = za2Var10;
                                                        } else if (iM3506d == 9 && za2Var11 != null) {
                                                            za2Var8 = za2Var11;
                                                        }
                                                        c0859wtM5043t2.m5986a(new xz1(za2Var8, kt2Var, null, s72.m4747i(yb1VarM5995k11.m6248a(), yb1VarM5995k.m6248a())), v51Var);
                                                        int i23 = 0;
                                                        Object obj4 = obj3;
                                                        Object obj5 = obj2;
                                                        C0859wt c0859wt2 = c0859wtM5043t2;
                                                        Object obj6 = obj;
                                                        while (true) {
                                                            int i24 = i22;
                                                            if (i23 < i24) {
                                                                yb1 yb1Var3 = yb1VarM5995k3;
                                                                c0859wt2.m5993i(yb1Var3, Integer.valueOf(i23));
                                                                yb1 yb1VarM5989e = c0859wt2.m5989e(i23, a63VarArr2[i23]);
                                                                int i25 = i23;
                                                                i22 = i24;
                                                                vg1 vg1Var5 = (vg1) i42.f4261h.get(yb1VarM5989e.f13391b);
                                                                if (vg1Var5 == null) {
                                                                    yb1VarM5995k3 = yb1Var3;
                                                                    c0859wt = c0859wt2;
                                                                } else {
                                                                    yb1[] yb1VarArr4 = {yb1VarM5989e};
                                                                    String strM5673a2 = vg1Var5.m5673a(true);
                                                                    ConcurrentHashMap concurrentHashMap3 = d42.f1862l;
                                                                    d42 d42Var2 = (d42) concurrentHashMap3.get(strM5673a2);
                                                                    if (d42Var2 != null) {
                                                                        vg1Var2 = vg1Var5;
                                                                    } else {
                                                                        d42 d42VarM959b2 = d42.m959b(strM5673a2);
                                                                        vg1Var2 = vg1Var5;
                                                                        d42Var2 = (d42) concurrentHashMap3.putIfAbsent(d42VarM959b2.f1863h, d42VarM959b2);
                                                                        if (d42Var2 == null) {
                                                                            d42Var2 = d42VarM959b2;
                                                                        }
                                                                    }
                                                                    za2 za2Var12 = cb2.f1380a;
                                                                    yb1VarM5995k3 = yb1Var3;
                                                                    C0859wt c0859wt3 = c0859wt2;
                                                                    c0859wt3.m5991g(new za2(49, d42Var2.m961c(), wu2.f12679q), vg1Var2, yb1VarM5995k6, null, yb1VarArr4);
                                                                    c0859wt = c0859wt3;
                                                                    yb1VarM5989e = yb1VarM5995k6;
                                                                }
                                                                o43 o43Var5 = yb1VarM5989e.f13391b.f96b;
                                                                za2 za2Var13 = cb2.f1380a;
                                                                switch (o43Var5.f7522i) {
                                                                    case 1:
                                                                        za2Var5 = cb2.f1467y1;
                                                                        break;
                                                                    case 2:
                                                                        za2Var5 = cb2.f1470z1;
                                                                        break;
                                                                    case 3:
                                                                        za2Var5 = cb2.f1304A1;
                                                                        break;
                                                                    case 4:
                                                                        za2Var5 = cb2.f1461w1;
                                                                        break;
                                                                    case 5:
                                                                        za2Var5 = cb2.f1458v1;
                                                                        break;
                                                                    case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                        za2Var5 = cb2.f1452t1;
                                                                        break;
                                                                    case 7:
                                                                        za2Var5 = cb2.f1455u1;
                                                                        break;
                                                                    case 8:
                                                                        za2Var5 = cb2.f1307B1;
                                                                        break;
                                                                    case 9:
                                                                        za2Var5 = cb2.f1464x1;
                                                                        break;
                                                                    default:
                                                                        cb2.m740a(o43Var5);
                                                                        throw null;
                                                                }
                                                                r72 r72VarM6248a = yb1VarM5989e.m6248a();
                                                                r72 r72VarM6248a2 = yb1VarM5995k4.m6248a();
                                                                Object obj7 = obj4;
                                                                r72 r72VarM6248a3 = yb1VarM5995k3.m6248a();
                                                                Object obj8 = obj5;
                                                                s72 s72Var = new s72(3);
                                                                s72Var.m2694f(0, r72VarM6248a);
                                                                s72Var.m2694f(1, r72VarM6248a2);
                                                                s72Var.m2694f(2, r72VarM6248a3);
                                                                c0859wt.m5986a(new k23(za2Var5, kt2Var, s72Var, wu2Var), null);
                                                                c0859wt2 = c0859wt;
                                                                obj5 = obj8;
                                                                obj6 = obj6;
                                                                i23 = i25 + 1;
                                                                obj4 = obj7;
                                                            } else {
                                                                yb1 yb1Var4 = obj4;
                                                                yb1 yb1Var5 = obj5;
                                                                C0859wt c0859wt4 = c0859wt2;
                                                                yb1 yb1Var6 = obj6;
                                                                yb1[] yb1VarArr5 = {yb1Var2, yb1VarM5995k9, yb1VarM5995k4};
                                                                vg1VarM102b = vg1Var4;
                                                                String strM5673a3 = vg1VarM102b.m5673a(true);
                                                                ConcurrentHashMap concurrentHashMap4 = d42.f1862l;
                                                                d42 d42VarM959b3 = (d42) concurrentHashMap4.get(strM5673a3);
                                                                if (d42VarM959b3 == null) {
                                                                    d42VarM959b3 = d42.m959b(strM5673a3);
                                                                    d42 d42Var3 = (d42) concurrentHashMap4.putIfAbsent(d42VarM959b3.f1863h, d42VarM959b3);
                                                                    if (d42Var3 != null) {
                                                                        d42VarM959b3 = d42Var3;
                                                                    }
                                                                }
                                                                za2 za2Var14 = cb2.f1380a;
                                                                wu2 wu2VarM961c = d42VarM959b3.m961c();
                                                                wu2 wu2Var2 = wu2.f12679q;
                                                                c0859wt4.m5991g(new za2(53, wu2VarM961c, wu2Var2), vg1VarM102b, yb1VarM5995k2, yb1VarM5995k, yb1VarArr5);
                                                                HashMap map2 = i42.f4262i;
                                                                boolean zContainsKey = map2.containsKey(returnType);
                                                                Class cls12 = Void.TYPE;
                                                                if (zContainsKey) {
                                                                    yb1 yb1Var7 = objM5995k;
                                                                    c0859wt4.m5988c(yb1Var7, yb1VarM5995k2);
                                                                    vg1 vg1Var6 = (vg1) map2.get(returnType);
                                                                    yb1[] yb1VarArr6 = new yb1[0];
                                                                    String strM5673a4 = vg1Var6.m5673a(true);
                                                                    d42 d42VarM959b4 = (d42) concurrentHashMap4.get(strM5673a4);
                                                                    if (d42VarM959b4 == null) {
                                                                        d42VarM959b4 = d42.m959b(strM5673a4);
                                                                        d42 d42Var4 = (d42) concurrentHashMap4.putIfAbsent(d42VarM959b4.f1863h, d42VarM959b4);
                                                                        if (d42Var4 != null) {
                                                                            d42VarM959b4 = d42Var4;
                                                                        }
                                                                    }
                                                                    c0859wt4.m5991g(new za2(50, d42VarM959b4.m961c(), wu2Var2), vg1Var6, yb1VarM5995k7, yb1Var7, yb1VarArr6);
                                                                    c0859wt4.m5996l(yb1VarM5995k7);
                                                                } else if (cls12.equals(returnType)) {
                                                                    c0859wt4.m5997m();
                                                                } else {
                                                                    c0859wt4.m5988c(yb1VarM5995k7, yb1VarM5995k2);
                                                                    c0859wt4.m5996l(yb1VarM5995k7);
                                                                }
                                                                c0859wt4.m5987b(v51Var);
                                                                if (v51Var.f11692c) {
                                                                    C0676s.m4653l("already marked");
                                                                    return;
                                                                }
                                                                v51Var.f11692c = true;
                                                                if (c0859wt4.f12628c != null) {
                                                                    c0859wt4.m5987b(v51Var);
                                                                    c0859wt4.m5986a(new xz1(cb2.f1444r, kt2Var, null, s72.f9958j), v51Var);
                                                                }
                                                                c0859wt4.f12628c = v51Var;
                                                                if ((method8.getModifiers() & 1024) == 0) {
                                                                    for (int i26 = 0; i26 < yb1VarArr.length; i26++) {
                                                                        yb1VarArr[i26] = c0859wt4.m5989e(i26, a63VarArr2[i26]);
                                                                    }
                                                                    if (cls12.equals(returnType)) {
                                                                        c0859wt4.m5992h(vg1Var, null, yb1Var2, yb1VarArr);
                                                                        c0859wt4.m5997m();
                                                                    } else {
                                                                        c0859wt4.m5992h(vg1Var, yb1Var6, yb1Var2, yb1VarArr);
                                                                        c0859wt4.m5996l(yb1Var6);
                                                                    }
                                                                    method2 = method8;
                                                                } else {
                                                                    method2 = method8;
                                                                    i42.m2268d(c0859wt4, method2, yb1Var4, yb1Var5);
                                                                }
                                                                C0859wt c0859wtM5043t3 = sz0Var2.m5043t(a63Var5.m102b(a63VarM101a8, i42.m2267c(method2), a63VarArr2));
                                                                if ((method2.getModifiers() & 1024) == 0) {
                                                                    yb1 yb1Var8 = c0859wtM5043t3.f12630e;
                                                                    if (yb1Var8 == null) {
                                                                        C0676s.m4653l("static methods cannot access 'this'");
                                                                        return;
                                                                    }
                                                                    C0859wt.m5985d(yb1Var8, a63Var5);
                                                                    int length12 = clsArr.length;
                                                                    yb1[] yb1VarArr7 = new yb1[length12];
                                                                    for (int i27 = 0; i27 < length12; i27++) {
                                                                        yb1VarArr7[i27] = c0859wtM5043t3.m5989e(i27, a63VarArr2[i27]);
                                                                    }
                                                                    if (cls12.equals(returnType)) {
                                                                        c0859wtM5043t3.m5992h(vg1Var, null, yb1Var8, yb1VarArr7);
                                                                        c0859wtM5043t3.m5997m();
                                                                    } else {
                                                                        yb1 yb1VarM5995k15 = c0859wtM5043t3.m5995k(a63VarM101a8);
                                                                        c0859wtM5043t3.m5992h(vg1Var, yb1VarM5995k15, yb1Var8, yb1VarArr7);
                                                                        c0859wtM5043t3.m5996l(yb1VarM5995k15);
                                                                    }
                                                                } else {
                                                                    i42.m2268d(c0859wtM5043t3, method2, c0859wtM5043t3.m5995k(a63.f93n), c0859wtM5043t3.m5995k(a63Var2));
                                                                }
                                                                i18 = i20 + 1;
                                                                a63Var3 = a63Var5;
                                                                sz0Var = sz0Var2;
                                                                size = i19;
                                                                h42Var = h42Var2;
                                                                methodArr = methodArr2;
                                                                str = str2;
                                                                i42Var = i42Var2;
                                                                strM2211j = str3;
                                                                a63VarM101a7 = a63Var9;
                                                                a63VarM101a5 = a63Var11;
                                                                a63VarM101a6 = a63Var12;
                                                                a63VarM101a4 = a63Var13;
                                                                a63VarM101a = a63Var;
                                                                th = null;
                                                            }
                                                        }
                                                    }
                                                    i42 i42Var3 = i42Var;
                                                    h42 h42Var3 = h42Var;
                                                    Method[] methodArr3 = methodArr;
                                                    sz0 sz0Var3 = sz0Var;
                                                    String str4 = strM2211j;
                                                    a63 a63Var14 = a63VarM101a;
                                                    a63 a63Var15 = a63Var3;
                                                    String str5 = str;
                                                    String strConcat = str4.concat(".generated");
                                                    a63[] a63VarArr3 = new a63[arrayList.size()];
                                                    Iterator it3 = arrayList.iterator();
                                                    int i28 = 0;
                                                    while (it3.hasNext()) {
                                                        a63VarArr3[i28] = a63.m101a((Class) it3.next());
                                                        i28++;
                                                    }
                                                    f80 f80VarM5035H = sz0Var3.m5035H(a63Var15);
                                                    if (f80VarM5035H.f2847b) {
                                                        c80.m669m("already declared: ", a63Var15);
                                                        return;
                                                    }
                                                    f80VarM5035H.f2847b = true;
                                                    f80VarM5035H.f2848c = 1;
                                                    f80VarM5035H.f2849d = a63Var14;
                                                    f80VarM5035H.f2850e = strConcat;
                                                    f80VarM5035H.f2851f = new e63(a63VarArr3);
                                                    try {
                                                        clsLoadClass2 = sz0Var3.m5029B(i42Var3.f4264b, i42Var3.f4265c).loadClass(str4);
                                                        try {
                                                            Field declaredField = clsLoadClass2.getDeclaredField(str5);
                                                            declaredField.setAccessible(true);
                                                            declaredField.set(null, methodArr3);
                                                            map.put(h42Var3, clsLoadClass2);
                                                            z70Var = z70Var;
                                                        } catch (IllegalAccessException e) {
                                                            C0676s.m4650i(e);
                                                            return;
                                                        } catch (NoSuchFieldException e2) {
                                                            C0676s.m4650i(e2);
                                                            return;
                                                        }
                                                    } catch (ClassNotFoundException e3) {
                                                        C0676s.m4650i(e3);
                                                        return;
                                                    } catch (IllegalAccessError e4) {
                                                        throw new UnsupportedOperationException("cannot proxy inaccessible class " + cls9, e4);
                                                    }
                                                } catch (NullPointerException unused3) {
                                                    um2.m5516f("descriptor == null");
                                                    return;
                                                }
                                            }
                                            z70Var.f13763n = clsLoadClass2;
                                            XposedBridge.hookAllConstructors(clsLoadClass2, new oh1(0, invocationHandler));
                                            XposedBridge.hookMethod((Method) z70Var.f13752c, new oh1(1, z70Var));
                                            XposedBridge.hookMethod(Context.class.getMethod("getString", cls5), new qh1(0, z70Var));
                                            XposedBridge.hookMethod((Method) z70Var.f13754e, new qh1(1, z70Var));
                                            m5952m("新版设置 Hook 安装成功");
                                            return;
                                        }
                                    }
                                    um2.m5519i("Array contains no element matching the predicate.");
                                    return;
                                }
                            }
                            um2.m5519i("Array contains no element matching the predicate.");
                            return;
                        }
                        boolean z5 = z;
                        int i29 = i2;
                        if (i4 < 0) {
                            break;
                        }
                        length2 = i4;
                        z = z5;
                        i2 = i29;
                    }
                }
                um2.m5519i("Array contains no element matching the predicate.");
                return;
            }
            i3++;
            z = z;
            i2 = i2;
        }
        um2.m5519i("Array contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: m */
    public static void m5952m(String str) {
        XposedBridge.log("[SettingMenuInjector] ".concat(str));
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(qp2.f9084b);
        arrayList.add(up2.f11411b);
        arrayList.add(tp2.f10895b);
        arrayList.add(sp2.f10282b);
        arrayList.add(op2.f7766b);
        arrayList.add(vp2.f12121b);
        arrayList.add(rp2.f9696b);
        arrayList.add(pp2.f8451b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: b */
    public final boolean mo1778b() {
        return f12609f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f12608e;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Object x92Var;
        Object x92Var2 = a83.f116a;
        try {
            m5951l();
            x92Var = x92Var2;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        wp2 wp2Var = f12607d;
        if (thM6237a != null) {
            String strConcat = "新版设置初始化失败：\n".concat(fg1.m1624Q(thM6237a));
            wp2Var.getClass();
            m5952m(strConcat);
        }
        try {
            m5953k();
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        Throwable thM6237a2 = y92.m6237a(x92Var2);
        if (thM6237a2 != null) {
            String strConcat2 = "旧版设置初始化失败：\n".concat(fg1.m1624Q(thM6237a2));
            wp2Var.getClass();
            m5952m(strConcat2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5953k() {
        Object x92Var;
        g80 g80Var;
        ClassLoader classLoader;
        try {
            Class clsM5529H = up0.m5529H("com.tencent.mm.ui.base.preference.MMPreference");
            Class clsM5529H2 = up0.m5529H("com.tencent.mm.ui.base.preference.Preference");
            sg1 sg1VarM3244v = op0.m3602y(clsM5529H).m3244v();
            sg1VarM3244v.f13871b = "createAdapter";
            Constructor<?>[] declaredConstructors = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j.getReturnType().getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                constructor.getClass();
                XposedBridge.hookMethod(constructor, new kg3(this, null, new q90(clsM5529H2, this))).getClass();
            }
            g80Var = new g80("Lcom/tencent/mm/ui/widget/listview/PullDownListView;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            classLoader = up0.f11402j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (classLoader == null) {
            t11.m5067S("hostClassLoader");
            throw null;
        }
        XposedBridge.hookMethod(g80Var.m1811a(classLoader, null), new kg3(this, new ml2(6), null)).getClass();
        m5952m("旧版设置 Hook 安装成功");
        x92Var = a83.f116a;
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            String strConcat = "旧版设置 Hook 失败：\n".concat(fg1.m1624Q(thM6237a));
            f12607d.getClass();
            m5952m(strConcat);
        }
    }
}
