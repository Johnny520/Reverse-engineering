package com.abc.internal.probe;

import android.content.Context;
import android.os.Build;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p009E0.C0180k;
import p009E0.C0184o;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p040V0.C0398a;
import p040V0.InterfaceC0405h;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class DexKitManager {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f1646a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static Class m1362a(Context context, ClassLoader classLoader, String str, String... strArr) {
        AbstractC0307g.m703e(context, "context");
        AbstractC0307g.m703e(classLoader, "classLoader");
        return (Class) m1367f(context, classLoader, str, new C0552b(classLoader, strArr, 0));
    }

    /* JADX INFO: renamed from: b */
    public static List m1363b(Context context, ClassLoader classLoader, String str, String... strArr) {
        AbstractC0307g.m703e(classLoader, "classLoader");
        List list = (List) m1367f(context, classLoader, str, new C0552b(strArr, classLoader));
        return list == null ? C0190u.f401a : list;
    }

    /* JADX INFO: renamed from: c */
    public static Class m1364c(DexKitBridge dexKitBridge, ClassLoader classLoader, String... strArr) {
        Object objM116u;
        Object objM116u2;
        AbstractC0307g.m703e(dexKitBridge, "bridge");
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(strArr, "strings");
        try {
            FindClass findClass = new FindClass();
            ClassMatcher classMatcher = new ClassMatcher();
            classMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
            findClass.matcher(classMatcher);
            ClassData classDataFirstOrNull = dexKitBridge.findClass(findClass).firstOrNull();
            objM116u = classDataFirstOrNull != null ? classDataFirstOrNull.getName() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Class clsM1366e = m1366e(classLoader, (String) objM116u);
        if (clsM1366e != null) {
            return clsM1366e;
        }
        try {
            FindMethod findMethod = new FindMethod();
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u2 = methodDataFirstOrNull != null ? methodDataFirstOrNull.getClassName() : null;
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        return m1366e(classLoader, (String) (objM116u2 instanceof C0140f ? null : objM116u2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1365d(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        String str2;
        String str3;
        Object next;
        try {
            System.loadLibrary("dexkit");
            m1368g("loaded via library path");
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
            if (str == null) {
                str = context.getApplicationInfo().sourceDir;
            } else {
                if (!(!AbstractC0425j.m1013R0(str)) || !new File(str).isFile()) {
                    str = null;
                }
                if (str == null) {
                }
            }
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr == null) {
                strArr = new String[0];
            }
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                str2 = "arm64-v8a";
                if (i2 < length) {
                    String str4 = strArr[i2];
                    AbstractC0307g.m700b(str4);
                    if (AbstractC0425j.m1005J0(str4, "arm64", false)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    int length2 = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str5 = strArr[i3];
                            AbstractC0307g.m700b(str5);
                            if (AbstractC0425j.m1005J0(str5, "armeabi", false)) {
                                str2 = "armeabi-v7a";
                                break;
                            }
                            i3++;
                        } else {
                            int length3 = strArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length3) {
                                    String str6 = strArr[i4];
                                    AbstractC0307g.m700b(str6);
                                    str3 = "x86_64";
                                    if (AbstractC0425j.m1005J0(str6, "x86_64", false)) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    for (String str7 : strArr) {
                                        AbstractC0307g.m700b(str7);
                                        str3 = "x86";
                                        if (!AbstractC0425j.m1005J0(str7, "x86", false)) {
                                        }
                                    }
                                }
                            }
                            str2 = str3;
                        }
                    }
                }
            }
            File file = new File(context.getCacheDir(), "achat_dexkit");
            file.mkdirs();
            File file2 = new File(file, "libdexkit.so");
            if (!file2.isFile() || file2.length() == 0) {
                ZipFile zipFile = new ZipFile(str);
                try {
                    ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
                    if (entry == null) {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        AbstractC0307g.m702d(enumerationEntries, "entries(...)");
                        InterfaceC0405h c0180k = new C0180k(5, new C0184o(enumerationEntries));
                        if (!(c0180k instanceof C0398a)) {
                            c0180k = new C0398a(c0180k);
                        }
                        Iterator it = ((C0398a) c0180k).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            String name = ((ZipEntry) next).getName();
                            AbstractC0307g.m702d(name, "getName(...)");
                            if (AbstractC0433r.m1028C0(name, "libdexkit.so")) {
                                break;
                            }
                        }
                        entry = (ZipEntry) next;
                        if (entry == null) {
                            throw new IllegalStateException("libdexkit.so not in module apk".toString());
                        }
                    }
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            AbstractC0307g.m700b(inputStream);
                            AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                            AbstractC0040p.m108m(fileOutputStream, null);
                            AbstractC0040p.m108m(inputStream, null);
                            AbstractC0040p.m108m(zipFile, null);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            System.load(file2.getAbsolutePath());
            m1368g("loaded from module apk abi=".concat(str2));
        }
    }

    /* JADX INFO: renamed from: e */
    public static Class m1366e(ClassLoader classLoader, String str) {
        Object objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            return null;
        }
        try {
            objM116u = Class.forName(AbstractC0433r.m1032G0(AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(str, "L"), ";"), '/', '.'), false, classLoader);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Class) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: f */
    public static Object m1367f(Context context, ClassLoader classLoader, String str, InterfaceC0286l interfaceC0286l) {
        Object objM116u;
        boolean zBooleanValue;
        Object objM116u2;
        AbstractC0307g.m703e(context, "context");
        AbstractC0307g.m703e(classLoader, "classLoader");
        AtomicBoolean atomicBoolean = f1646a;
        if (atomicBoolean.get()) {
            zBooleanValue = true;
        } else {
            try {
                m1365d(context, str);
                atomicBoolean.set(true);
                objM116u = Boolean.TRUE;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                m1368g("native load fail: " + thM465a.getMessage());
                objM116u = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) objM116u).booleanValue();
        }
        if (!zBooleanValue) {
            return null;
        }
        try {
            DexKitBridge dexKitBridgeCreate = DexKitBridge.Companion.create(classLoader, true);
            try {
                objM116u2 = interfaceC0286l.invoke(dexKitBridgeCreate);
                AbstractC0040p.m108m(dexKitBridgeCreate, null);
            } finally {
            }
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
        if (thM465a2 != null) {
            m1368g("bridge fail: " + thM465a2.getClass().getSimpleName() + ": " + thM465a2.getMessage());
        }
        if (objM116u2 instanceof C0140f) {
            return null;
        }
        return objM116u2;
    }

    /* JADX INFO: renamed from: g */
    public static void m1368g(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-DexKit] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
