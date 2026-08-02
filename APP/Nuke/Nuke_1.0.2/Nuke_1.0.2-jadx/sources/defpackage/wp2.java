package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends vj implements w70 {
    public static final wp2 d = new wp2(true);
    public static final String e = "SettingMenuInjector";
    public static final boolean f = true;
    public static final hx2 g = new hx2(new hn1(17));
    public static final hx2 h = new hx2(new hn1(18));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class j() {
        return (Class) g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v19, resolved type: yb1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v10, resolved type: yb1[] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v11, resolved type: yb1[] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: yb1[] */
    /* JADX DEBUG: Multi-variable search result rejected for r14v10, resolved type: vg1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: vg1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: vg1 */
    /* JADX DEBUG: Multi-variable search result rejected for r31v3, resolved type: yb1 */
    /* JADX DEBUG: Multi-variable search result rejected for r32v2, resolved type: yb1 */
    /* JADX DEBUG: Multi-variable search result rejected for r33v2, resolved type: yb1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: v51 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l() throws Throwable {
        Method methodE;
        Method method;
        Method methodE2;
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
        wt wtVar;
        za2 za2Var5;
        int iD;
        Class<InvocationHandler> cls;
        Class cls2;
        int i;
        InvocationHandler invocationHandler2;
        Class clsD = qp2.b.d();
        Method[] declaredMethods = ((Class) g.getValue()).getDeclaredMethods();
        tp2 tp2Var = tp2.b;
        tp2Var.getClass();
        try {
            methodE = tp2Var.e();
        } catch (Throwable unused) {
            methodE = null;
        }
        int i2 = 0;
        boolean z = true;
        boolean z2 = methodE != null;
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i3 = 0;
        while (i3 < length) {
            Method method3 = declaredMethods[i3];
            if (method3.getParameterCount() == 0 && t11.l(method3.getReturnType(), Class.class)) {
                int length2 = declaredMethods.length - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i4 = length2 - 1;
                        Method method4 = declaredMethods[length2];
                        if (method4.getParameterCount() == 0 && t11.l(method4.getReturnType(), clsD)) {
                            Class cls3 = Integer.TYPE;
                            if (z2) {
                                int length3 = declaredMethods.length - 1;
                                if (length3 >= 0) {
                                    while (true) {
                                        int i5 = length3 - 1;
                                        method = declaredMethods[length3];
                                        if (method.getParameterCount() == 0 && t11.l(method.getReturnType(), cls3) && !t11.l(method.getName(), tp2.b.e().getName())) {
                                            break;
                                        } else if (i5 < 0) {
                                            break;
                                        } else {
                                            length3 = i5;
                                        }
                                    }
                                }
                                um2.i("Array contains no element matching the predicate.");
                                return;
                            }
                            int length4 = declaredMethods.length - 1;
                            if (length4 >= 0) {
                                while (true) {
                                    int i6 = length4 - 1;
                                    method = declaredMethods[length4];
                                    if (method.getParameterCount() == 0 && t11.l(method.getReturnType(), cls3)) {
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
                            um2.i("Array contains no element matching the predicate.");
                            return;
                            int length5 = declaredMethods.length;
                            for (int i8 = i2; i8 < length5; i8++) {
                                Method method6 = declaredMethods[i8];
                                if (method6.getParameterCount() == 3) {
                                    Class clsD2 = op2.b.d();
                                    Method methodE3 = rp2.b.e();
                                    Class clsD3 = pp2.b.d();
                                    Method methodE4 = vp2.b.e();
                                    Method method7 = method4;
                                    String name = method3.getName();
                                    name.getClass();
                                    tp2 tp2Var2 = tp2.b;
                                    tp2Var2.getClass();
                                    try {
                                        methodE2 = tp2Var2.e();
                                    } catch (Throwable unused2) {
                                        methodE2 = null;
                                    }
                                    String name2 = methodE2 != null ? methodE2.getName() : null;
                                    String name3 = method6.getName();
                                    name3.getClass();
                                    String name4 = up2.b.e().getName();
                                    name4.getClass();
                                    String name5 = method7.getName();
                                    name5.getClass();
                                    String name6 = method.getName();
                                    name6.getClass();
                                    String name7 = sp2.b.e().getName();
                                    name7.getClass();
                                    boolean z4 = z;
                                    Class cls5 = cls3;
                                    final z70 z70Var = new z70(clsD2, clsD, methodE3, clsD3, methodE4, name, name2, name3, name4, name5, name6, name7);
                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) z70Var.m;
                                    Context context = up0.i;
                                    if (context == null) {
                                        t11.S("hostContext");
                                        throw null;
                                    }
                                    String string = context.getString(R.string.home_settings_plugin_group);
                                    d.getClass();
                                    final Class cls6 = (Class) h.getValue();
                                    final ml2 ml2Var = new ml2(5);
                                    cls6.getClass();
                                    final int i9 = z70Var.a;
                                    z70Var.a = i9 - 1;
                                    concurrentHashMap.put(Integer.valueOf(i9), "Nuke");
                                    if (string != null) {
                                        int i10 = z70Var.a;
                                        z70Var.a = i10 - 1;
                                        concurrentHashMap.put(Integer.valueOf(i10), string);
                                        numValueOf = Integer.valueOf(i10);
                                    } else {
                                        numValueOf = null;
                                    }
                                    Constructor<?>[] declaredConstructors = clsD.getDeclaredConstructors();
                                    declaredConstructors.getClass();
                                    int length6 = declaredConstructors.length;
                                    for (int i11 = i2; i11 < length6; i11++) {
                                        final Constructor<?> constructor = declaredConstructors[i11];
                                        if (constructor.getParameterCount() == 2) {
                                            constructor.setAccessible(z4);
                                            InvocationHandler invocationHandler3 = new InvocationHandler() { // from class: mh1
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // java.lang.reflect.InvocationHandler
                                                public final Object invoke(Object obj4, Method method8, Object[] objArr) {
                                                    z70 z70Var2 = z70Var;
                                                    String str = (String) z70Var2.g;
                                                    String str2 = (String) z70Var2.h;
                                                    String str3 = (String) z70Var2.l;
                                                    String str4 = (String) z70Var2.k;
                                                    String str5 = (String) z70Var2.j;
                                                    String str6 = (String) z70Var2.i;
                                                    String str7 = (String) z70Var2.f;
                                                    Class cls7 = cls6;
                                                    Constructor constructor2 = constructor;
                                                    int i12 = i9;
                                                    ml2 ml2Var2 = ml2Var;
                                                    if (str == null) {
                                                        String name8 = method8.getName();
                                                        if (!t11.l(name8, str7)) {
                                                            if (t11.l(name8, str6)) {
                                                                return "SettingGroup_Main_Nuke";
                                                            }
                                                            if (t11.l(name8, str5)) {
                                                                return constructor2.newInstance(cls7, null);
                                                            }
                                                            if (t11.l(name8, str4)) {
                                                                return Integer.valueOf(i12);
                                                            }
                                                            if (!t11.l(name8, str3)) {
                                                                if (!t11.l(name8, str2)) {
                                                                    Object[] objArr2 = objArr == null ? new Object[0] : objArr;
                                                                    return i42.a(obj4, method8, Arrays.copyOf(objArr2, objArr2.length));
                                                                }
                                                                Object objL0 = objArr != null ? mg.l0(objArr) : null;
                                                                objL0.getClass();
                                                                ml2Var2.j((Activity) objL0);
                                                                return null;
                                                            }
                                                            return numValueOf;
                                                        }
                                                        return cls7;
                                                    }
                                                    String name9 = method8.getName();
                                                    if (!t11.l(name9, str7)) {
                                                        if (t11.l(name9, str)) {
                                                            return 1;
                                                        }
                                                        if (t11.l(name9, str6)) {
                                                            return "SettingGroup_Main_Nuke";
                                                        }
                                                        if (t11.l(name9, str5)) {
                                                            return constructor2.newInstance(cls7, null);
                                                        }
                                                        if (t11.l(name9, str4)) {
                                                            return Integer.valueOf(i12);
                                                        }
                                                        if (!t11.l(name9, str3)) {
                                                            if (!t11.l(name9, str2)) {
                                                                Object[] objArr3 = objArr == null ? new Object[0] : objArr;
                                                                return i42.a(obj4, method8, Arrays.copyOf(objArr3, objArr3.length));
                                                            }
                                                            Object objL02 = objArr != null ? mg.l0(objArr) : null;
                                                            objL02.getClass();
                                                            ml2Var2.j((Activity) objL02);
                                                            return null;
                                                        }
                                                        return numValueOf;
                                                    }
                                                    return cls7;
                                                }
                                            };
                                            ClassLoader classLoader = up0.j;
                                            if (classLoader == null) {
                                                t11.S("hostClassLoader");
                                                throw null;
                                            }
                                            ph1 ph1Var = new ph1(classLoader);
                                            ClassLoader classLoader2 = up0.j;
                                            if (classLoader2 == null) {
                                                t11.S("hostClassLoader");
                                                throw null;
                                            }
                                            Class<?> clsLoadClass = classLoader2.loadClass("androidx.appcompat.app.AppCompatActivity");
                                            clsLoadClass.getClass();
                                            z70Var.o = clsLoadClass;
                                            i42 i42Var = new i42((Class) z70Var.b);
                                            Context context2 = up0.i;
                                            if (context2 == null) {
                                                t11.S("hostContext");
                                                throw null;
                                            }
                                            File codeCacheDir = context2.getCodeCacheDir();
                                            codeCacheDir.getClass();
                                            File fileG0 = wi0.g0(codeCacheDir, "nuke_setting_proxy");
                                            fileG0.mkdirs();
                                            File file = new File(fileG0, "v" + Integer.toString(z4 ? 1 : 0));
                                            i42Var.c = file;
                                            file.mkdir();
                                            i42Var.b = ph1Var;
                                            if (((Class) z70Var.o) == null) {
                                                t11.S("activityConstructorType");
                                                throw null;
                                            }
                                            Class cls7 = new Class[]{nh1.class}[i2];
                                            if (!cls7.isInterface()) {
                                                s.j("Not an interface: ".concat(cls7.getName()));
                                                return;
                                            }
                                            ArrayList arrayList = i42Var.e;
                                            if (!arrayList.contains(cls7)) {
                                                arrayList.add(cls7);
                                            }
                                            ClassLoader classLoader3 = i42Var.b;
                                            Class superclass = i42Var.a;
                                            h42 h42Var = new h42(superclass, arrayList, classLoader3);
                                            Map map = i42.f;
                                            Class<?> clsLoadClass2 = (Class) map.get(h42Var);
                                            if (clsLoadClass2 != null) {
                                                invocationHandler = invocationHandler3;
                                            } else {
                                                sz0 sz0Var = new sz0(12);
                                                String hexString = Integer.toHexString(arrayList.hashCode());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(superclass.getName().replace(".", "/"));
                                                sb.append("_");
                                                String strJ = hk1.j(sb, hexString, "_Proxy");
                                                String strJ2 = vi0.j("L", strJ, ";");
                                                try {
                                                    a63 a63Var3 = new a63(strJ2, strJ2.equals("V") ? o43.v : o43.g(strJ2));
                                                    a63 a63VarA = a63.a(superclass);
                                                    Class<InvocationHandler> cls8 = InvocationHandler.class;
                                                    a63 a63VarA2 = a63.a(cls8);
                                                    Throwable th = null;
                                                    a63 a63VarA3 = a63.a(Method[].class);
                                                    sz0Var.y(new li0(a63Var3, a63VarA2, "$__handler"), 2);
                                                    String str = "$__methodArray";
                                                    sz0Var.y(new li0(a63Var3, a63VarA3, "$__methodArray"), 10);
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
                                                                a63VarArr[i14] = a63.a(parameterTypes[i14]);
                                                            }
                                                            invocationHandler2 = invocationHandler3;
                                                            wt wtVarT = sz0Var.t(new vg1(a63Var3, a63.l, "<init>", new e63(a63VarArr)));
                                                            yb1 yb1Var = wtVarT.e;
                                                            if (yb1Var == null) {
                                                                s.l("static methods cannot access 'this'");
                                                                return;
                                                            }
                                                            wt.d(yb1Var, a63Var3);
                                                            yb1[] yb1VarArr2 = new yb1[length8];
                                                            int i15 = 0;
                                                            while (i15 < length8) {
                                                                yb1VarArr2[i15] = wtVarT.e(i15, a63VarArr[i15]);
                                                                i15++;
                                                                length8 = length8;
                                                            }
                                                            a63VarA.getClass();
                                                            vg1 vg1Var3 = new vg1(a63VarA, a63.l, "<init>", new e63(a63VarArr));
                                                            String strA = vg1Var3.a(true);
                                                            ConcurrentHashMap concurrentHashMap2 = d42.l;
                                                            d42 d42VarB = (d42) concurrentHashMap2.get(strA);
                                                            if (d42VarB == null) {
                                                                d42VarB = d42.b(strA);
                                                                d42 d42Var = (d42) concurrentHashMap2.putIfAbsent(d42VarB.h, d42VarB);
                                                                if (d42Var != null) {
                                                                    d42VarB = d42Var;
                                                                }
                                                            }
                                                            za2 za2Var6 = cb2.a;
                                                            wtVarT.g(new za2(52, d42VarB.c(), wu2.q), vg1Var3, null, yb1Var, yb1VarArr2);
                                                            wtVarT.m();
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
                                                        i42.b(hashSet, hashSet2, superclass);
                                                        superclass = superclass.getSuperclass();
                                                    }
                                                    Class superclass2 = cls9;
                                                    while (superclass2 != null) {
                                                        Class<?>[] interfaces = superclass2.getInterfaces();
                                                        int length9 = interfaces.length;
                                                        int i16 = 0;
                                                        while (i16 < length9) {
                                                            i42.b(hashSet, hashSet2, interfaces[i16]);
                                                            i16++;
                                                            superclass2 = superclass2;
                                                        }
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        i42.b(hashSet, hashSet2, (Class) it.next());
                                                    }
                                                    int size = hashSet.size();
                                                    Method[] methodArr = new Method[size];
                                                    Iterator it2 = hashSet.iterator();
                                                    int i17 = 0;
                                                    while (it2.hasNext()) {
                                                        methodArr[i17] = ((g42) it2.next()).d;
                                                        i17++;
                                                    }
                                                    Arrays.sort(methodArr, new sl0(17));
                                                    a63 a63VarA4 = a63.a(cls10);
                                                    a63 a63VarA5 = a63.a(Method[].class);
                                                    a63VarA4.getClass();
                                                    o30 o30Var = new o30(new q30("$__handler"), new q30(a63VarA4.a));
                                                    r30 r30Var = a63Var3.c;
                                                    c30 c30Var = new c30(r30Var, o30Var);
                                                    a63VarA5.getClass();
                                                    c30 c30Var2 = new c30(r30Var, new o30(new q30("$__methodArray"), new q30(a63VarA5.a)));
                                                    a63 a63VarA6 = a63.a(Method.class);
                                                    a63 a63VarA7 = a63.a(Object[].class);
                                                    a63 a63Var4 = a63.m;
                                                    vg1 vg1VarB = a63VarA4.b(a63Var4, "invoke", a63Var4, a63VarA6, a63VarA7);
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
                                                            a63VarArr2[i21] = a63.a(parameterTypes2[i21]);
                                                        }
                                                        Class<?> returnType = method8.getReturnType();
                                                        i42 i42Var2 = i42Var;
                                                        a63 a63VarA8 = a63.a(returnType);
                                                        String str3 = strJ;
                                                        vg1 vg1VarB2 = a63Var3.b(a63VarA8, name8, a63VarArr2);
                                                        a63 a63VarA9 = a63.a(AbstractMethodError.class);
                                                        wt wtVarT2 = sz0Var.t(vg1VarB2);
                                                        sz0 sz0Var2 = sz0Var;
                                                        yb1 yb1Var2 = wtVarT2.e;
                                                        if (yb1Var2 == null) {
                                                            s.l("static methods cannot access 'this'");
                                                            return;
                                                        }
                                                        wt.d(yb1Var2, a63Var3);
                                                        a63 a63Var5 = a63Var3;
                                                        wu2 wu2Var = wtVarT2.j;
                                                        vg1 vg1Var4 = vg1VarB;
                                                        kt2 kt2Var = wtVarT2.h;
                                                        yb1 yb1VarK = wtVarT2.k(a63VarA4);
                                                        int i22 = length10;
                                                        a63 a63Var6 = yb1VarK.b;
                                                        a63 a63Var7 = a63.m;
                                                        yb1 yb1VarK2 = wtVarT2.k(a63Var7);
                                                        a63 a63Var8 = a63.i;
                                                        yb1 yb1VarK3 = wtVarT2.k(a63Var8);
                                                        yb1 yb1VarK4 = wtVarT2.k(a63VarA7);
                                                        a63 a63Var9 = a63VarA7;
                                                        a63 a63Var10 = yb1VarK4.b;
                                                        yb1 yb1VarK5 = wtVarT2.k(a63Var8);
                                                        yb1 yb1VarK6 = wtVarT2.k(a63Var7);
                                                        yb1 yb1VarK7 = wtVarT2.k(a63VarA8);
                                                        yb1 yb1VarK8 = wtVarT2.k(a63VarA5);
                                                        a63 a63Var11 = a63VarA5;
                                                        yb1 yb1VarK9 = wtVarT2.k(a63VarA6);
                                                        yb1 yb1VarK10 = wtVarT2.k(a63Var8);
                                                        a63 a63Var12 = a63VarA6;
                                                        Class cls11 = (Class) i42.g.get(returnType);
                                                        Object objK = cls11 != null ? wtVarT2.k(a63.a(cls11)) : th;
                                                        yb1 yb1VarK11 = wtVarT2.k(a63VarA4);
                                                        a63 a63Var13 = a63VarA4;
                                                        if ((method8.getModifiers() & 1024) == 0) {
                                                            yb1[] yb1VarArr3 = new yb1[parameterTypes2.length];
                                                            yb1 yb1VarK12 = wtVarT2.k(a63VarA8);
                                                            vg1 vg1VarB3 = a63VarA.b(a63VarA8, name8, a63VarArr2);
                                                            a63Var = a63VarA;
                                                            clsArr = parameterTypes2;
                                                            a63Var2 = a63VarA9;
                                                            obj = yb1VarK12;
                                                            yb1VarArr = yb1VarArr3;
                                                            vg1Var = vg1VarB3;
                                                            Throwable th2 = th;
                                                            obj2 = th2;
                                                            obj3 = th2;
                                                        } else {
                                                            yb1 yb1VarK13 = wtVarT2.k(a63.n);
                                                            yb1 yb1VarK14 = wtVarT2.k(a63VarA9);
                                                            a63Var = a63VarA;
                                                            clsArr = parameterTypes2;
                                                            a63Var2 = a63VarA9;
                                                            Throwable th3 = th;
                                                            Throwable th4 = th3;
                                                            vg1Var = th4;
                                                            obj3 = yb1VarK13;
                                                            obj2 = yb1VarK14;
                                                            yb1VarArr = th3;
                                                            obj = th4;
                                                        }
                                                        wtVarT2.i(yb1VarK10, Integer.valueOf(i20));
                                                        o43 o43Var = yb1VarK8.b.b;
                                                        za2 za2Var7 = cb2.a;
                                                        switch (o43Var.i) {
                                                            case 1:
                                                                za2Var = cb2.b2;
                                                                break;
                                                            case 2:
                                                                za2Var = cb2.c2;
                                                                break;
                                                            case 3:
                                                                za2Var = cb2.d2;
                                                                break;
                                                            case 4:
                                                                za2Var = cb2.Z1;
                                                                break;
                                                            case 5:
                                                                za2Var = cb2.Y1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var = cb2.W1;
                                                                break;
                                                            case 7:
                                                                za2Var = cb2.X1;
                                                                break;
                                                            case 8:
                                                                za2Var = cb2.e2;
                                                                break;
                                                            case 9:
                                                                za2Var = cb2.a2;
                                                                break;
                                                            default:
                                                                cb2.a(o43Var);
                                                                throw th;
                                                        }
                                                        wtVarT2.a(new j23(za2Var, wtVarT2.h, s72.j, wtVarT2.j, c30Var2), th);
                                                        wtVarT2.j(yb1VarK8, true);
                                                        o43 o43Var2 = yb1VarK9.b.b;
                                                        switch (o43Var2.i) {
                                                            case 1:
                                                                za2Var2 = cb2.p1;
                                                                break;
                                                            case 2:
                                                                za2Var2 = cb2.q1;
                                                                break;
                                                            case 3:
                                                                za2Var2 = cb2.r1;
                                                                break;
                                                            case 4:
                                                                za2Var2 = cb2.n1;
                                                                break;
                                                            case 5:
                                                                za2Var2 = cb2.m1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var2 = cb2.k1;
                                                                break;
                                                            case 7:
                                                                za2Var2 = cb2.l1;
                                                                break;
                                                            case 8:
                                                                za2Var2 = cb2.s1;
                                                                break;
                                                            case 9:
                                                                za2Var2 = cb2.o1;
                                                                break;
                                                            default:
                                                                cb2.a(o43Var2);
                                                                throw th;
                                                        }
                                                        wtVarT2.a(new k23(za2Var2, kt2Var, s72.i(yb1VarK8.a(), yb1VarK10.a()), wu2Var), null);
                                                        wtVarT2.j(yb1VarK9, true);
                                                        wtVarT2.i(yb1VarK5, Integer.valueOf(i22));
                                                        o43 o43Var3 = a63Var10.b;
                                                        o43Var3.getClass();
                                                        switch (o43Var3.f().i) {
                                                            case 1:
                                                                za2Var3 = cb2.H1;
                                                                break;
                                                            case 2:
                                                                za2Var3 = cb2.I1;
                                                                break;
                                                            case 3:
                                                                za2Var3 = cb2.J1;
                                                                break;
                                                            case 4:
                                                                za2Var3 = cb2.G1;
                                                                break;
                                                            case 5:
                                                                za2Var3 = cb2.F1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var3 = cb2.D1;
                                                                break;
                                                            case 7:
                                                                za2Var3 = cb2.E1;
                                                                break;
                                                            case 8:
                                                                za2Var3 = cb2.K1;
                                                                break;
                                                            case 9:
                                                                za2Var3 = new za2(41, o43Var3, wu2.k, tg0.d, 6, false, "new-array-object");
                                                                break;
                                                            default:
                                                                cb2.a(o43Var3);
                                                                throw null;
                                                        }
                                                        wtVarT2.a(new j23(za2Var3, wtVarT2.h, s72.h(yb1VarK5.a()), wtVarT2.j, a63Var10.c), null);
                                                        wtVarT2.j(yb1VarK4, true);
                                                        o43 o43Var4 = a63Var6.b;
                                                        switch (o43Var4.i) {
                                                            case 1:
                                                                za2Var4 = cb2.S1;
                                                                break;
                                                            case 2:
                                                                za2Var4 = cb2.T1;
                                                                break;
                                                            case 3:
                                                                za2Var4 = cb2.U1;
                                                                break;
                                                            case 4:
                                                                za2Var4 = cb2.Q1;
                                                                break;
                                                            case 5:
                                                                za2Var4 = cb2.P1;
                                                                break;
                                                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                za2Var4 = cb2.N1;
                                                                break;
                                                            case 7:
                                                                za2Var4 = cb2.O1;
                                                                break;
                                                            case 8:
                                                                za2Var4 = cb2.V1;
                                                                break;
                                                            case 9:
                                                                za2Var4 = cb2.R1;
                                                                break;
                                                            default:
                                                                cb2.a(o43Var4);
                                                                throw null;
                                                        }
                                                        wtVarT2.a(new j23(za2Var4, wtVarT2.h, s72.h(yb1Var2.a()), wtVarT2.j, c30Var), null);
                                                        wtVarT2.j(yb1VarK, true);
                                                        wtVarT2.i(yb1VarK11, null);
                                                        v51 v51Var = new v51();
                                                        wtVarT2.b(v51Var);
                                                        wu2 wu2VarI = wu2.i(yb1VarK11.b.b, a63Var6.b);
                                                        za2 za2Var8 = cb2.s;
                                                        za2 za2Var9 = cb2.y;
                                                        za2 za2Var10 = cb2.A;
                                                        za2 za2Var11 = cb2.G;
                                                        int length11 = wu2VarI.i.length;
                                                        if (length11 == 1) {
                                                            int iD2 = wu2VarI.getType(0).d();
                                                            if (iD2 != 6) {
                                                                if (iD2 == 9 && za2Var9 != null) {
                                                                    za2Var8 = za2Var9;
                                                                }
                                                            }
                                                        } else if (length11 != 2 || (iD = wu2VarI.getType(0).d()) != wu2VarI.getType(1).d()) {
                                                            s.g("bad types: ", wu2VarI);
                                                            za2Var8 = null;
                                                        } else if (iD == 6) {
                                                            za2Var8 = za2Var10;
                                                        } else if (iD == 9 && za2Var11 != null) {
                                                            za2Var8 = za2Var11;
                                                        }
                                                        wtVarT2.a(new xz1(za2Var8, kt2Var, null, s72.i(yb1VarK11.a(), yb1VarK.a())), v51Var);
                                                        int i23 = 0;
                                                        Object obj4 = obj3;
                                                        Object obj5 = obj2;
                                                        wt wtVar2 = wtVarT2;
                                                        Object obj6 = obj;
                                                        while (true) {
                                                            int i24 = i22;
                                                            if (i23 < i24) {
                                                                yb1 yb1Var3 = yb1VarK3;
                                                                wtVar2.i(yb1Var3, Integer.valueOf(i23));
                                                                yb1 yb1VarE = wtVar2.e(i23, a63VarArr2[i23]);
                                                                int i25 = i23;
                                                                i22 = i24;
                                                                vg1 vg1Var5 = (vg1) i42.h.get(yb1VarE.b);
                                                                if (vg1Var5 == null) {
                                                                    yb1VarK3 = yb1Var3;
                                                                    wtVar = wtVar2;
                                                                } else {
                                                                    yb1[] yb1VarArr4 = {yb1VarE};
                                                                    String strA2 = vg1Var5.a(true);
                                                                    ConcurrentHashMap concurrentHashMap3 = d42.l;
                                                                    d42 d42Var2 = (d42) concurrentHashMap3.get(strA2);
                                                                    if (d42Var2 != null) {
                                                                        vg1Var2 = vg1Var5;
                                                                    } else {
                                                                        d42 d42VarB2 = d42.b(strA2);
                                                                        vg1Var2 = vg1Var5;
                                                                        d42Var2 = (d42) concurrentHashMap3.putIfAbsent(d42VarB2.h, d42VarB2);
                                                                        if (d42Var2 == null) {
                                                                            d42Var2 = d42VarB2;
                                                                        }
                                                                    }
                                                                    za2 za2Var12 = cb2.a;
                                                                    yb1VarK3 = yb1Var3;
                                                                    wt wtVar3 = wtVar2;
                                                                    wtVar3.g(new za2(49, d42Var2.c(), wu2.q), vg1Var2, yb1VarK6, null, yb1VarArr4);
                                                                    wtVar = wtVar3;
                                                                    yb1VarE = yb1VarK6;
                                                                }
                                                                o43 o43Var5 = yb1VarE.b.b;
                                                                za2 za2Var13 = cb2.a;
                                                                switch (o43Var5.i) {
                                                                    case 1:
                                                                        za2Var5 = cb2.y1;
                                                                        break;
                                                                    case 2:
                                                                        za2Var5 = cb2.z1;
                                                                        break;
                                                                    case 3:
                                                                        za2Var5 = cb2.A1;
                                                                        break;
                                                                    case 4:
                                                                        za2Var5 = cb2.w1;
                                                                        break;
                                                                    case 5:
                                                                        za2Var5 = cb2.v1;
                                                                        break;
                                                                    case AIChatConfig.DefaultContextRounds /* 6 */:
                                                                        za2Var5 = cb2.t1;
                                                                        break;
                                                                    case 7:
                                                                        za2Var5 = cb2.u1;
                                                                        break;
                                                                    case 8:
                                                                        za2Var5 = cb2.B1;
                                                                        break;
                                                                    case 9:
                                                                        za2Var5 = cb2.x1;
                                                                        break;
                                                                    default:
                                                                        cb2.a(o43Var5);
                                                                        throw null;
                                                                }
                                                                r72 r72VarA = yb1VarE.a();
                                                                r72 r72VarA2 = yb1VarK4.a();
                                                                Object obj7 = obj4;
                                                                r72 r72VarA3 = yb1VarK3.a();
                                                                Object obj8 = obj5;
                                                                s72 s72Var = new s72(3);
                                                                s72Var.f(0, r72VarA);
                                                                s72Var.f(1, r72VarA2);
                                                                s72Var.f(2, r72VarA3);
                                                                wtVar.a(new k23(za2Var5, kt2Var, s72Var, wu2Var), null);
                                                                wtVar2 = wtVar;
                                                                obj5 = obj8;
                                                                obj6 = obj6;
                                                                i23 = i25 + 1;
                                                                obj4 = obj7;
                                                            } else {
                                                                yb1 yb1Var4 = obj4;
                                                                yb1 yb1Var5 = obj5;
                                                                wt wtVar4 = wtVar2;
                                                                yb1 yb1Var6 = obj6;
                                                                yb1[] yb1VarArr5 = {yb1Var2, yb1VarK9, yb1VarK4};
                                                                vg1VarB = vg1Var4;
                                                                String strA3 = vg1VarB.a(true);
                                                                ConcurrentHashMap concurrentHashMap4 = d42.l;
                                                                d42 d42VarB3 = (d42) concurrentHashMap4.get(strA3);
                                                                if (d42VarB3 == null) {
                                                                    d42VarB3 = d42.b(strA3);
                                                                    d42 d42Var3 = (d42) concurrentHashMap4.putIfAbsent(d42VarB3.h, d42VarB3);
                                                                    if (d42Var3 != null) {
                                                                        d42VarB3 = d42Var3;
                                                                    }
                                                                }
                                                                za2 za2Var14 = cb2.a;
                                                                wu2 wu2VarC = d42VarB3.c();
                                                                wu2 wu2Var2 = wu2.q;
                                                                wtVar4.g(new za2(53, wu2VarC, wu2Var2), vg1VarB, yb1VarK2, yb1VarK, yb1VarArr5);
                                                                HashMap map2 = i42.i;
                                                                boolean zContainsKey = map2.containsKey(returnType);
                                                                Class cls12 = Void.TYPE;
                                                                if (zContainsKey) {
                                                                    yb1 yb1Var7 = objK;
                                                                    wtVar4.c(yb1Var7, yb1VarK2);
                                                                    vg1 vg1Var6 = (vg1) map2.get(returnType);
                                                                    yb1[] yb1VarArr6 = new yb1[0];
                                                                    String strA4 = vg1Var6.a(true);
                                                                    d42 d42VarB4 = (d42) concurrentHashMap4.get(strA4);
                                                                    if (d42VarB4 == null) {
                                                                        d42VarB4 = d42.b(strA4);
                                                                        d42 d42Var4 = (d42) concurrentHashMap4.putIfAbsent(d42VarB4.h, d42VarB4);
                                                                        if (d42Var4 != null) {
                                                                            d42VarB4 = d42Var4;
                                                                        }
                                                                    }
                                                                    wtVar4.g(new za2(50, d42VarB4.c(), wu2Var2), vg1Var6, yb1VarK7, yb1Var7, yb1VarArr6);
                                                                    wtVar4.l(yb1VarK7);
                                                                } else if (cls12.equals(returnType)) {
                                                                    wtVar4.m();
                                                                } else {
                                                                    wtVar4.c(yb1VarK7, yb1VarK2);
                                                                    wtVar4.l(yb1VarK7);
                                                                }
                                                                wtVar4.b(v51Var);
                                                                if (v51Var.c) {
                                                                    s.l("already marked");
                                                                    return;
                                                                }
                                                                v51Var.c = true;
                                                                if (wtVar4.c != null) {
                                                                    wtVar4.b(v51Var);
                                                                    wtVar4.a(new xz1(cb2.r, kt2Var, null, s72.j), v51Var);
                                                                }
                                                                wtVar4.c = v51Var;
                                                                if ((method8.getModifiers() & 1024) == 0) {
                                                                    for (int i26 = 0; i26 < yb1VarArr.length; i26++) {
                                                                        yb1VarArr[i26] = wtVar4.e(i26, a63VarArr2[i26]);
                                                                    }
                                                                    if (cls12.equals(returnType)) {
                                                                        wtVar4.h(vg1Var, null, yb1Var2, yb1VarArr);
                                                                        wtVar4.m();
                                                                    } else {
                                                                        wtVar4.h(vg1Var, yb1Var6, yb1Var2, yb1VarArr);
                                                                        wtVar4.l(yb1Var6);
                                                                    }
                                                                    method2 = method8;
                                                                } else {
                                                                    method2 = method8;
                                                                    i42.d(wtVar4, method2, yb1Var4, yb1Var5);
                                                                }
                                                                wt wtVarT3 = sz0Var2.t(a63Var5.b(a63VarA8, i42.c(method2), a63VarArr2));
                                                                if ((method2.getModifiers() & 1024) == 0) {
                                                                    yb1 yb1Var8 = wtVarT3.e;
                                                                    if (yb1Var8 == null) {
                                                                        s.l("static methods cannot access 'this'");
                                                                        return;
                                                                    }
                                                                    wt.d(yb1Var8, a63Var5);
                                                                    int length12 = clsArr.length;
                                                                    yb1[] yb1VarArr7 = new yb1[length12];
                                                                    for (int i27 = 0; i27 < length12; i27++) {
                                                                        yb1VarArr7[i27] = wtVarT3.e(i27, a63VarArr2[i27]);
                                                                    }
                                                                    if (cls12.equals(returnType)) {
                                                                        wtVarT3.h(vg1Var, null, yb1Var8, yb1VarArr7);
                                                                        wtVarT3.m();
                                                                    } else {
                                                                        yb1 yb1VarK15 = wtVarT3.k(a63VarA8);
                                                                        wtVarT3.h(vg1Var, yb1VarK15, yb1Var8, yb1VarArr7);
                                                                        wtVarT3.l(yb1VarK15);
                                                                    }
                                                                } else {
                                                                    i42.d(wtVarT3, method2, wtVarT3.k(a63.n), wtVarT3.k(a63Var2));
                                                                }
                                                                i18 = i20 + 1;
                                                                a63Var3 = a63Var5;
                                                                sz0Var = sz0Var2;
                                                                size = i19;
                                                                h42Var = h42Var2;
                                                                methodArr = methodArr2;
                                                                str = str2;
                                                                i42Var = i42Var2;
                                                                strJ = str3;
                                                                a63VarA7 = a63Var9;
                                                                a63VarA5 = a63Var11;
                                                                a63VarA6 = a63Var12;
                                                                a63VarA4 = a63Var13;
                                                                a63VarA = a63Var;
                                                                th = null;
                                                            }
                                                        }
                                                    }
                                                    i42 i42Var3 = i42Var;
                                                    h42 h42Var3 = h42Var;
                                                    Method[] methodArr3 = methodArr;
                                                    sz0 sz0Var3 = sz0Var;
                                                    String str4 = strJ;
                                                    a63 a63Var14 = a63VarA;
                                                    a63 a63Var15 = a63Var3;
                                                    String str5 = str;
                                                    String strConcat = str4.concat(".generated");
                                                    a63[] a63VarArr3 = new a63[arrayList.size()];
                                                    Iterator it3 = arrayList.iterator();
                                                    int i28 = 0;
                                                    while (it3.hasNext()) {
                                                        a63VarArr3[i28] = a63.a((Class) it3.next());
                                                        i28++;
                                                    }
                                                    f80 f80VarH = sz0Var3.H(a63Var15);
                                                    if (f80VarH.b) {
                                                        c80.m("already declared: ", a63Var15);
                                                        return;
                                                    }
                                                    f80VarH.b = true;
                                                    f80VarH.c = 1;
                                                    f80VarH.d = a63Var14;
                                                    f80VarH.e = strConcat;
                                                    f80VarH.f = new e63(a63VarArr3);
                                                    try {
                                                        clsLoadClass2 = sz0Var3.B(i42Var3.b, i42Var3.c).loadClass(str4);
                                                        try {
                                                            Field declaredField = clsLoadClass2.getDeclaredField(str5);
                                                            declaredField.setAccessible(true);
                                                            declaredField.set(null, methodArr3);
                                                            map.put(h42Var3, clsLoadClass2);
                                                            z70Var = z70Var;
                                                        } catch (IllegalAccessException e2) {
                                                            s.i(e2);
                                                            return;
                                                        } catch (NoSuchFieldException e3) {
                                                            s.i(e3);
                                                            return;
                                                        }
                                                    } catch (ClassNotFoundException e4) {
                                                        s.i(e4);
                                                        return;
                                                    } catch (IllegalAccessError e5) {
                                                        throw new UnsupportedOperationException("cannot proxy inaccessible class " + cls9, e5);
                                                    }
                                                } catch (NullPointerException unused3) {
                                                    um2.f("descriptor == null");
                                                    return;
                                                }
                                            }
                                            z70Var.n = clsLoadClass2;
                                            XposedBridge.hookAllConstructors(clsLoadClass2, new oh1(0, invocationHandler));
                                            XposedBridge.hookMethod((Method) z70Var.c, new oh1(1, z70Var));
                                            XposedBridge.hookMethod(Context.class.getMethod("getString", cls5), new qh1(0, z70Var));
                                            XposedBridge.hookMethod((Method) z70Var.e, new qh1(1, z70Var));
                                            m("新版设置 Hook 安装成功");
                                            return;
                                        }
                                    }
                                    um2.i("Array contains no element matching the predicate.");
                                    return;
                                }
                            }
                            um2.i("Array contains no element matching the predicate.");
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
                um2.i("Array contains no element matching the predicate.");
                return;
            }
            i3++;
            z = z;
            i2 = i2;
        }
        um2.i("Array contains no element matching the predicate.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(String str) {
        XposedBridge.log("[SettingMenuInjector] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(qp2.b);
        arrayList.add(up2.b);
        arrayList.add(tp2.b);
        arrayList.add(sp2.b);
        arrayList.add(op2.b);
        arrayList.add(vp2.b);
        arrayList.add(rp2.b);
        arrayList.add(pp2.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean b() {
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Object x92Var;
        Object x92Var2 = a83.a;
        try {
            l();
            x92Var = x92Var2;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        wp2 wp2Var = d;
        if (thA != null) {
            String strConcat = "新版设置初始化失败：\n".concat(fg1.Q(thA));
            wp2Var.getClass();
            m(strConcat);
        }
        try {
            k();
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        Throwable thA2 = y92.a(x92Var2);
        if (thA2 != null) {
            String strConcat2 = "旧版设置初始化失败：\n".concat(fg1.Q(thA2));
            wp2Var.getClass();
            m(strConcat2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        Object x92Var;
        g80 g80Var;
        ClassLoader classLoader;
        try {
            Class clsH = up0.H("com.tencent.mm.ui.base.preference.MMPreference");
            Class clsH2 = up0.H("com.tencent.mm.ui.base.preference.Preference");
            sg1 sg1VarV = op0.y(clsH).v();
            sg1VarV.b = "createAdapter";
            Constructor<?>[] declaredConstructors = ((zg1) du.o0(sg1VarV.c())).j.getReturnType().getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                constructor.getClass();
                XposedBridge.hookMethod(constructor, new kg3(this, null, new q90(clsH2, this))).getClass();
            }
            g80Var = new g80("Lcom/tencent/mm/ui/widget/listview/PullDownListView;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            classLoader = up0.j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (classLoader == null) {
            t11.S("hostClassLoader");
            throw null;
        }
        XposedBridge.hookMethod(g80Var.a(classLoader, null), new kg3(this, new ml2(6), null)).getClass();
        m("旧版设置 Hook 安装成功");
        x92Var = a83.a;
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            String strConcat = "旧版设置 Hook 失败：\n".concat(fg1.Q(thA));
            d.getClass();
            m(strConcat);
        }
    }
}
