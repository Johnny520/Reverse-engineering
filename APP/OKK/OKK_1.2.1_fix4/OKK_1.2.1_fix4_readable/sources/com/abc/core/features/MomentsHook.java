package com.abc.core.features;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.k */
/* JADX INFO: loaded from: classes.dex */
public final class MomentsHook {

    /* JADX INFO: renamed from: a */
    public static final MomentsHook f2076a = new MomentsHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2077b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2078c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2079d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static Method m1668a(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
        if (iM1011P0 <= 1 || iM1010O0 <= iM1011P0) {
            throw new IllegalArgumentException(str.toString());
        }
        String strSubstring = str.substring(1, iM1011P0 - 1);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        String strM1032G0 = AbstractC0433r.m1032G0(strSubstring, '/', '.');
        String strSubstring2 = str.substring(iM1011P0 + 2, iM1010O0);
        AbstractC0307g.m702d(strSubstring2, "substring(...)");
        String strSubstring3 = str.substring(iM1010O0);
        AbstractC0307g.m702d(strSubstring3, "substring(...)");
        for (Class<?> clsLoadClass = classLoader.loadClass(strM1032G0); clsLoadClass != null; clsLoadClass = clsLoadClass.getSuperclass()) {
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0307g.m699a(method.getName(), strSubstring2)) {
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    for (Class<?> cls : parameterTypes) {
                        AbstractC0307g.m700b(cls);
                        sb.append(m1674j(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1674j(returnType));
                    String string = sb.toString();
                    AbstractC0307g.m702d(string, "toString(...)");
                    if (string.equals(strSubstring3)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new NoSuchMethodException(str);
    }

    /* JADX INFO: renamed from: b */
    public static Method m1669b(Class cls) {
        Method method;
        Method method2;
        Method[] methods = cls.getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (AbstractC0307g.m699a(method2.getName(), "parseFrom") && method2.getParameterTypes().length == 1 && AbstractC0307g.m699a(method2.getParameterTypes()[0], byte[].class)) {
                break;
            }
            i2++;
        }
        if (method2 != null) {
            return method2;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
        int length2 = declaredMethods.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (AbstractC0307g.m699a(method3.getName(), "parseFrom") && method3.getParameterTypes().length == 1 && AbstractC0307g.m699a(method3.getParameterTypes()[0], byte[].class)) {
                method = method3;
                break;
            }
            i3++;
        }
        return method;
    }

    /* JADX INFO: renamed from: c */
    public static Method m1670c(Class cls) {
        Method method;
        Method method2;
        Method[] methods = cls.getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            if (AbstractC0307g.m699a(method2.getName(), "toByteArray")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && AbstractC0307g.m699a(method2.getReturnType(), byte[].class)) {
                    break;
                }
            }
            i3++;
        }
        if (method2 != null) {
            return method2;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
        int length2 = declaredMethods.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Method method3 = declaredMethods[i2];
            if (AbstractC0307g.m699a(method3.getName(), "toByteArray")) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                if (parameterTypes2.length == 0 && AbstractC0307g.m699a(method3.getReturnType(), byte[].class)) {
                    method = method3;
                    break;
                }
            }
            i2++;
        }
        return method;
    }

    /* JADX INFO: renamed from: f */
    public static int m1671f(DexKitBridge dexKitBridge, ClassLoader classLoader, List list, String str, InterfaceC0286l interfaceC0286l) {
        Object objM116u;
        Object objM116u2;
        int i2 = 0;
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.plugin.sns.storage");
            MethodMatcher methodMatcher = new MethodMatcher();
            String[] strArr = (String[]) list.toArray(new String[0]);
            methodMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
            findMethod.matcher(methodMatcher);
            objM116u = dexKitBridge.findMethod(findMethod);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        List list2 = (List) objM116u;
        if (list2 == null) {
            list2 = C0190u.f401a;
        }
        if (list2.isEmpty()) {
            m1675k("DexKit missed ".concat(str));
            return 0;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            try {
                objM116u2 = m1668a(classLoader, ((MethodData) it.next()).getDescriptor());
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            if (objM116u2 instanceof C0140f) {
                objM116u2 = null;
            }
            Method method = (Method) objM116u2;
            if (method != null && ((Boolean) interfaceC0286l.invoke(method)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1672g(String str, Method method) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new InputStatsMessageHook(0, false));
            m1675k("hooked rawQuery via " + str);
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1675k("hook rawQuery failed " + str + ": " + thM465a.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = bool;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m1673i(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Object objM116u;
        String str2;
        AtomicBoolean atomicBoolean = f2078c;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (!(objM116u instanceof C0140f)) {
            atomicBoolean.set(true);
            m1675k("DexKit native loaded via library path");
            return;
        }
        if (str == null) {
            throw new IllegalStateException("module path unavailable for libdexkit.so");
        }
        if (Process.is64Bit()) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            AbstractC0307g.m702d(strArr, "SUPPORTED_64_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr);
            if (str2 == null) {
                str2 = "arm64-v8a";
            }
        } else {
            String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
            AbstractC0307g.m702d(strArr2, "SUPPORTED_32_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr2);
            if (str2 == null) {
                str2 = "armeabi-v7a";
            }
        }
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_moments_", str2, "_libdexkit.so"));
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
            if (entry == null) {
                throw new IllegalStateException("lib/" + str2 + "/libdexkit.so not found in module apk");
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC0307g.m700b(inputStream);
                    AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                    AbstractC0040p.m108m(fileOutputStream, null);
                    AbstractC0040p.m108m(inputStream, null);
                    AbstractC0040p.m108m(zipFile, null);
                    System.load(file.getAbsolutePath());
                    atomicBoolean.set(true);
                    m1675k("DexKit native loaded from module apk");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m1674j(Class cls) {
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m725h("[", m1674j(componentType));
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (!cls.equals(Void.TYPE)) {
            if (cls.equals(Boolean.TYPE)) {
                return "Z";
            }
            if (cls.equals(Byte.TYPE)) {
                return "B";
            }
            if (cls.equals(Character.TYPE)) {
                return "C";
            }
            if (cls.equals(Short.TYPE)) {
                return "S";
            }
            if (cls.equals(Long.TYPE)) {
                return "J";
            }
            if (cls.equals(Float.TYPE)) {
                return "F";
            }
            if (cls.equals(Double.TYPE)) {
                return "D";
            }
        }
        return "V";
    }

    /* JADX INFO: renamed from: k */
    public static void m1675k(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-AntiMoments] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1676d(String str, Method method) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0662i(this, str, 0));
            m1675k("hooked delete via ".concat(str));
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1675k("hook delete failed " + str + ": " + thM465a.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = bool;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1677e(String str, Method method) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0662i(this, str, 1));
            m1675k("hooked execSQL via " + str);
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1675k("hook execSQL failed " + str + ": " + thM465a.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = bool;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1678h(String str, Method method) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0662i(this, str, 2));
            m1675k("hooked update via " + str);
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1675k("hook update failed " + str + ": " + thM465a.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = bool;
        }
        return ((Boolean) objM116u).booleanValue();
    }
}
