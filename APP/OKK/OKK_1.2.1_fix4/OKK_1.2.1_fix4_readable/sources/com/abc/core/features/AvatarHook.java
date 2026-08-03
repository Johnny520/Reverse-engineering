package com.abc.core.features;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.widget.ImageView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0179j;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class AvatarHook {

    /* JADX INFO: renamed from: a */
    public static final AvatarHook f2217a = new AvatarHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2218b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2219c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f2220d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public static volatile Method f2221e;

    /* JADX INFO: renamed from: a */
    public static final void m1797a(AvatarHook avatarHook, Object obj, float f2) {
        Object objM116u;
        avatarHook.getClass();
        if (obj == null) {
            return;
        }
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (superclass.equals(Object.class)) {
                    return;
                }
                C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                while (c0172cM714c.hasNext()) {
                    Field field = (Field) c0172cM714c.next();
                    if (!Modifier.isStatic(field.getModifiers()) && (AbstractC0307g.m699a(field.getType(), Float.TYPE) || AbstractC0307g.m699a(field.getType(), Float.class))) {
                        field.setAccessible(true);
                        try {
                            objM116u = Float.valueOf(field.getFloat(obj));
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        if (objM116u instanceof C0140f) {
                            objM116u = null;
                        }
                        Float f3 = (Float) objM116u;
                        if (f3 != null) {
                            float fFloatValue = f3.floatValue();
                            if (0.0f <= fFloatValue && fFloatValue <= 1.01f) {
                                field.setFloat(obj, f2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1798b(AvatarHook avatarHook, String str, float f2) {
        avatarHook.getClass();
        int iIncrementAndGet = f2220d.incrementAndGet();
        if (iIncrementAndGet <= 25 || iIncrementAndGet % 200 == 0) {
            m1804i("APPLY #" + iIncrementAndGet + " " + str + " radius=" + f2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m1799c(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
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
                        sb.append(m1803h(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1803h(returnType));
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

    /* JADX INFO: renamed from: d */
    public static Class m1800d(ClassLoader classLoader, String str) {
        Object objM116u;
        try {
            objM116u = AbstractC0358S.m906r(classLoader, str);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        return (Class) objM116u;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1801f(Method method) {
        if (!Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 4 || !ImageView.class.isAssignableFrom(parameterTypes[0]) || !AbstractC0307g.m699a(parameterTypes[1], String.class)) {
            return false;
        }
        if (AbstractC0307g.m699a(parameterTypes[2], Float.TYPE) || AbstractC0307g.m699a(parameterTypes[2], Float.class)) {
            return AbstractC0307g.m699a(parameterTypes[3], Boolean.TYPE) || AbstractC0307g.m699a(parameterTypes[3], Boolean.class);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m1802g(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        String str2;
        AtomicBoolean atomicBoolean = f2219c;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            atomicBoolean.set(true);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
            if (str == null) {
                return;
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
            File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_avatar_", str2, "_libdexkit.so"));
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
                if (entry == null) {
                    AbstractC0040p.m108m(zipFile, null);
                    return;
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
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m1803h(Class cls) {
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m725h("[", m1803h(componentType));
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

    /* JADX INFO: renamed from: i */
    public static void m1804i(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-RoundAvatar] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1805e(String str, Method method) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0653f(this, str, 5));
            m1804i("hooked ".concat(str));
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }
}
