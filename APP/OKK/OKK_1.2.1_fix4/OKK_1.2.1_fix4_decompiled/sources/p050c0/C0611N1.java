package p050c0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.result.MethodDataList;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.C0190u;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.N1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611N1 {

    /* JADX INFO: renamed from: a */
    public static final C0611N1 f1883a = new C0611N1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1884b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1885c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1886d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final Set f1887e;

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f1888f;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
        f1887e = setNewSetFromMap;
        f1888f = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static Method m1507a(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
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
                        sb.append(m1510e(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1510e(returnType));
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
    public static void m1508b(Class cls) {
        Set set = f1887e;
        synchronized (set) {
            if (set.contains(cls)) {
                return;
            }
            set.add(cls);
            int i2 = 0;
            for (String str : AbstractC0182m.m556h0("getLatitude", "getLongitude")) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0307g.m699a(method.getName(), str)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && (AbstractC0307g.m699a(method.getReturnType(), Double.TYPE) || AbstractC0307g.m699a(method.getReturnType(), Double.class) || AbstractC0307g.m699a(method.getReturnType(), Float.TYPE) || AbstractC0307g.m699a(method.getReturnType(), Float.class))) {
                            arrayList.add(method);
                        }
                    }
                }
                for (Method method2 : arrayList) {
                    try {
                        method2.setAccessible(true);
                        AbstractC0762d.m1952b(method2, new C0608M1(AbstractC0307g.m699a(str, "getLatitude"), method2));
                        i2++;
                    } catch (Throwable th) {
                        AbstractC0040p.m116u(th);
                    }
                }
            }
            Class superclass = cls.getSuperclass();
            if (superclass != null && !superclass.equals(Object.class) && !superclass.getName().equals("java.lang.Object")) {
                m1508b(superclass);
            }
            if (i2 > 0) {
                m1511f("hooked " + i2 + " getters on " + cls.getName());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1509d(Context context, String str) {
        Object objM116u;
        String str2;
        AtomicBoolean atomicBoolean = f1886d;
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
            return;
        }
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
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_", str2, "_libdexkit.so"));
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

    /* JADX INFO: renamed from: e */
    public static String m1510e(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC0433r.m1032G0(cls.getName(), '.', '/') : AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        throw new IllegalStateException(("Unknown primitive " + cls).toString());
    }

    /* JADX INFO: renamed from: f */
    public static void m1511f(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-VirtualLoc] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX INFO: renamed from: c */
    public final int m1512c(DexKitBridge dexKitBridge, ClassLoader classLoader, String str, String... strArr) {
        ?? M116u;
        Object objM116u;
        Object objM116u2;
        try {
            FindMethod findMethod = new FindMethod();
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.setName("onLocationChanged");
            methodMatcher.usingEqStrings((String[]) Arrays.copyOf(strArr, strArr.length));
            findMethod.matcher(methodMatcher);
            MethodDataList methodDataListFindMethod = dexKitBridge.findMethod(findMethod);
            M116u = new ArrayList(AbstractC0183n.m559k0(methodDataListFindMethod, 10));
            Iterator<MethodData> it = methodDataListFindMethod.iterator();
            while (it.hasNext()) {
                M116u.add(it.next().getDescriptor());
            }
        } catch (Throwable th) {
            M116u = AbstractC0040p.m116u(th);
        }
        C0190u c0190u = C0190u.f401a;
        boolean z2 = M116u instanceof C0140f;
        ?? r10 = M116u;
        if (z2) {
            r10 = c0190u;
        }
        List list = (List) r10;
        Iterator it2 = AbstractC0181l.m543o0(list).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            try {
                objM116u = m1507a(classLoader, (String) it2.next());
            } catch (Throwable th2) {
                objM116u = AbstractC0040p.m116u(th2);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            Method method = (Method) objM116u;
            if (method != null) {
                String strM725h = AbstractC0324d.m725h("DexKit:", str);
                try {
                    method.setAccessible(true);
                    AbstractC0762d.m1952b(method, new C0674m(7, this));
                    m1511f("hooked onLocationChanged via " + strM725h + " -> " + method.getDeclaringClass().getName() + "." + method.getName());
                    objM116u2 = Boolean.TRUE;
                } catch (Throwable th3) {
                    objM116u2 = AbstractC0040p.m116u(th3);
                }
                Object obj = Boolean.FALSE;
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = obj;
                }
                if (((Boolean) objM116u2).booleanValue()) {
                    i2++;
                }
            }
        }
        if (list.isEmpty()) {
            m1511f("DexKit miss onLocationChanged label=" + str);
        }
        return i2;
    }
}
