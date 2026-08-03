package p050c0;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.C0137c;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p089x0.C1121e;

/* JADX INFO: renamed from: c0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0677n {

    /* JADX INFO: renamed from: i */
    public static volatile Method f2113i;

    /* JADX INFO: renamed from: j */
    public static volatile Object f2114j;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f2105a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2106b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2107c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2108d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2109e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f2110f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2111g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2112h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static final boolean f2115k = true;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1692a(String str, ContentValues contentValues, C0686q c0686q) {
        long j2;
        long jLongValue;
        String str2;
        Long lM1027B0;
        long jLongValue2;
        Long lM1027B02;
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger == null) {
            return false;
        }
        int iIntValue = asInteger.intValue();
        Long lM1702k = m1702k(contentValues, "msgId");
        long jLongValue3 = (lM1702k == null && (lM1702k = m1702k(contentValues, "msgSvrId")) == null) ? 0L : lM1702k.longValue();
        String asString = contentValues.getAsString("content");
        if (asString == null) {
            asString = "";
        }
        if (iIntValue != 10000 || !AbstractC0680o.m1749l(asString)) {
            long jLongValue4 = 0;
            if (jLongValue3 <= 0) {
                Long lM1702k2 = m1702k(contentValues, "msgSvrId");
                if ((lM1702k2 != null ? lM1702k2.longValue() : 0L) <= 0) {
                    return false;
                }
            }
            String asString2 = contentValues.getAsString("talker");
            Long lM1702k3 = m1702k(contentValues, "msgSvrId");
            long jLongValue5 = lM1702k3 != null ? lM1702k3.longValue() : 0L;
            String strM1740c = AbstractC0680o.m1740c(asString);
            String str3 = strM1740c == null ? (asString2 == null || !AbstractC0680o.m1745h(asString2) || AbstractC0680o.m1744g(asString2)) ? null : asString2 : strM1740c;
            Long asLong = contentValues.getAsLong("createTime");
            if (asLong != null) {
                jLongValue4 = asLong.longValue();
            }
            m1704m(new C0652e1(iIntValue, asString, asString2, jLongValue4, str3, jLongValue5), jLongValue3, jLongValue5, asString2);
            return false;
        }
        if (AbstractC0680o.m1746i(asString) && !c0686q.f2147c) {
            m1703l(contentValues, jLongValue3);
            m1708q("MARKED self revoke DB msgId=" + jLongValue3 + " (pass-through)");
            return false;
        }
        if (AbstractC0680o.m1746i(asString)) {
            m1703l(contentValues, jLongValue3);
            m1708q("MARKED self revoke DB msgId=" + jLongValue3 + " (keep)");
        }
        String asString3 = contentValues.getAsString("talker");
        if (asString3 == null && ((asString3 = AbstractC0680o.m1742e(asString, "session")) == null || !(!AbstractC0425j.m1013R0(asString3)))) {
            asString3 = null;
        }
        String strM1742e = AbstractC0680o.m1742e(asString, "newmsgid");
        if (strM1742e == null || (lM1027B02 = AbstractC0432q.m1027B0(strM1742e)) == null) {
            Pattern patternCompile = Pattern.compile("newmsgid[\"\\s:=]+(\\d+)", C1121e.m2635b(2));
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(asString);
            AbstractC0307g.m702d(matcher, "matcher(...)");
            C0419d c0419dM875a = AbstractC0358S.m875a(matcher, 0, asString);
            if (c0419dM875a == null || (str2 = (String) AbstractC0181l.m545q0(c0419dM875a.m1002a(), 1)) == null || (lM1027B0 = AbstractC0432q.m1027B0(str2)) == null) {
                j2 = 0;
            } else {
                jLongValue = lM1027B0.longValue();
                j2 = 0;
                if (jLongValue <= 0) {
                }
            }
            jLongValue = j2;
        } else {
            long jLongValue6 = lM1027B02.longValue();
            if (jLongValue6 > 0) {
                jLongValue = jLongValue6;
                j2 = 0;
            }
        }
        Long lValueOf = Long.valueOf(jLongValue);
        if (jLongValue <= j2) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            jLongValue2 = lValueOf.longValue();
        } else {
            Long lM1702k4 = m1702k(contentValues, "msgSvrId");
            jLongValue2 = lM1702k4 != null ? lM1702k4.longValue() : 0L;
        }
        C0652e1 c0652e1M1705n = m1705n(jLongValue3, jLongValue2, asString3);
        String strM1752o = AbstractC0680o.m1752o(AbstractC0680o.m1746i(asString), c0652e1M1705n, asString3, asString);
        String strM1620g = AbstractC0642b0.m1620g(strM1752o, asString);
        if (strM1752o != null && !AbstractC0425j.m1013R0(strM1752o) && !strM1620g.equals("对方")) {
            String string = AbstractC0425j.m1022a1(strM1752o).toString();
            String str4 = string != null ? string : "";
            String strM1739b = AbstractC0680o.m1739b(strM1620g);
            if (strM1739b != null && str4.length() != 0 && !AbstractC0680o.m1744g(str4)) {
                AbstractC0642b0.f2001c.put(str4, strM1739b);
            }
        }
        AbstractC0358S abstractC0358SM1738a = AbstractC0680o.m1738a(new C0700u1(jLongValue3, iIntValue, asString), c0652e1M1705n, c0686q.f2147c, c0686q.f2148d, c0686q.f2146b, strM1620g);
        if (abstractC0358SM1738a.equals(C0694s1.f2193z)) {
            return false;
        }
        if (!(abstractC0358SM1738a instanceof C0697t1)) {
            throw new C0137c();
        }
        if (!c0686q.f2146b) {
            m1708q("BLOCKED DB revoke without notice msgId=" + jLongValue3);
            return true;
        }
        contentValues.put("type", (Integer) 10000);
        String str5 = ((C0697t1) abstractC0358SM1738a).f2198z;
        contentValues.put("content", str5);
        Integer numValueOf = c0652e1M1705n != null ? Integer.valueOf(c0652e1M1705n.f2024a) : null;
        m1708q("KEPT DB recall notice via " + str + " msgId=" + jLongValue3 + " wxid=" + strM1752o + " name=" + strM1620g + " type=" + numValueOf + " snippet=" + AbstractC0425j.m1021Z0(str5, 48));
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static Method m1693b(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
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
                        sb.append(m1707p(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1707p(returnType));
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

    /* JADX INFO: renamed from: c */
    public static Object m1694c(Object obj, String str) {
        Field fieldM1695d = m1695d(obj.getClass(), str);
        if (fieldM1695d == null) {
            return null;
        }
        fieldM1695d.setAccessible(true);
        return fieldM1695d.get(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Field m1695d(Class cls, String str) {
        while (true) {
            Field field = null;
            if (cls == null) {
                return null;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Field field2 = declaredFields[i2];
                if (AbstractC0307g.m699a(field2.getName(), str)) {
                    field = field2;
                    break;
                }
                i2++;
            }
            if (field != null) {
                return field;
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m1696e(Class cls, String str, Class... clsArr) {
        try {
            C0316p c0316p = new C0316p(2);
            ArrayList arrayList = c0316p.f597a;
            c0316p.m710b(clsArr);
            c0316p.m709a(new C0674m(0, str));
            AbstractC0358S.m904q(cls, str, arrayList.toArray(new Object[arrayList.size()]));
            return 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1697f(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        if (f2107c.get()) {
            return;
        }
        try {
            FindMethod findMethod = new FindMethod();
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingEqStrings("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null) {
            try {
                FindMethod findMethod2 = new FindMethod();
                MethodMatcher methodMatcher2 = new MethodMatcher();
                methodMatcher2.usingStrings("doRevokeMsg xmlSrvMsgId=");
                findMethod2.matcher(methodMatcher2);
                MethodData methodDataFirstOrNull2 = dexKitBridge.findMethod(findMethod2).firstOrNull();
                objM116u2 = methodDataFirstOrNull2 != null ? methodDataFirstOrNull2.getDescriptor() : null;
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            if (objM116u2 instanceof C0140f) {
                objM116u2 = null;
            }
            str = (String) objM116u2;
        }
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1708q("DexKit did not find doRevokeMsg");
            return;
        }
        try {
            objM116u3 = m1693b(classLoader, str);
        } catch (Throwable th3) {
            objM116u3 = AbstractC0040p.m116u(th3);
        }
        Method method = (Method) (objM116u3 instanceof C0140f ? null : objM116u3);
        if (method == null) {
            m1708q("DexKit descriptor could not resolve: ".concat(str));
        } else {
            m1699h("DexKit:".concat(str), method);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1698g(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        if (f2113i != null) {
            return;
        }
        try {
            FindMethod findMethod = new FindMethod();
            findMethod.searchPackages("com.tencent.mm.storage");
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.returnType(Long.TYPE);
            methodMatcher.usingStrings("check table name from id:%d table:%s getTableNameByLocalId:%s");
            findMethod.matcher(methodMatcher);
            MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
            objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getDescriptor() : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null || AbstractC0425j.m1013R0(str)) {
            m1708q("DexKit did not find send-tip cache method");
            return;
        }
        try {
            objM116u2 = m1693b(classLoader, str);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Method method = (Method) (objM116u2 instanceof C0140f ? null : objM116u2);
        if (method == null) {
            m1708q("send-tip descriptor could not resolve: ".concat(str));
            return;
        }
        method.setAccessible(true);
        f2113i = method;
        AbstractC0762d.m1952b(method, new C0665j(2, false));
        m1708q("hooked send-tip cache method: ".concat(str));
    }

    /* JADX INFO: renamed from: h */
    public static void m1699h(String str, Method method) {
        if (f2107c.compareAndSet(false, true)) {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0665j(3, false));
            m1708q("hooked source revoke via " + str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1700i(Context context, String str) {
        Object objM116u;
        String str2;
        AtomicBoolean atomicBoolean = f2105a;
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
            m1708q("DexKit native loaded via library path");
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
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_", str2, "_libdexkit.so"));
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
                    m1708q("DexKit native loaded from module apk");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: j */
    public static Long m1701j(Object obj, String str) {
        Object objM1694c = m1694c(obj, str);
        Number number = objM1694c instanceof Number ? (Number) objM1694c : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Long m1702k(ContentValues contentValues, String str) {
        Object objM116u;
        try {
            objM116u = contentValues.getAsLong(str);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        return (Long) objM116u;
    }

    /* JADX INFO: renamed from: l */
    public static void m1703l(ContentValues contentValues, long j2) {
        ConcurrentHashMap concurrentHashMap = C0572A1.f1693a;
        Long lM1702k = m1702k(contentValues, "msgId");
        long jLongValue = lM1702k != null ? lM1702k.longValue() : 0L;
        Long lM1702k2 = m1702k(contentValues, "msgSvrId");
        long jLongValue2 = lM1702k2 != null ? lM1702k2.longValue() : 0L;
        Long lM1702k3 = m1702k(contentValues, "newMsgId");
        C0572A1.m1384a(new long[]{j2, jLongValue, jLongValue2, lM1702k3 != null ? lM1702k3.longValue() : 0L});
    }

    /* JADX INFO: renamed from: m */
    public static void m1704m(C0652e1 c0652e1, long j2, long j3, String str) {
        ConcurrentHashMap concurrentHashMap = f2110f;
        if (j2 > 0) {
            concurrentHashMap.put(Long.valueOf(j2), c0652e1);
        }
        if (j3 <= 0) {
            j3 = c0652e1.f2029f;
        }
        if (j3 > 0) {
            concurrentHashMap.put(Long.valueOf(j3), c0652e1);
        }
        if (str == null) {
            str = c0652e1.f2026c;
        }
        if (str != null && !AbstractC0425j.m1013R0(str) && j3 > 0) {
            ConcurrentHashMap concurrentHashMap2 = f2111g;
            concurrentHashMap2.put(str + ":" + j3, c0652e1);
            if (concurrentHashMap2.size() > 1200) {
                int size = concurrentHashMap2.size() - 1000;
                Set setKeySet = concurrentHashMap2.keySet();
                AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
                Iterator it = AbstractC0181l.m549u0(size, setKeySet).iterator();
                while (it.hasNext()) {
                    concurrentHashMap2.remove((String) it.next());
                }
            }
        }
        if (concurrentHashMap.size() > 2400) {
            int size2 = concurrentHashMap.size() - 2000;
            Set setKeySet2 = concurrentHashMap.keySet();
            AbstractC0307g.m702d(setKeySet2, "<get-keys>(...)");
            Iterator it2 = AbstractC0181l.m549u0(size2, setKeySet2).iterator();
            while (it2.hasNext()) {
                concurrentHashMap.remove((Long) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static C0652e1 m1705n(long j2, long j3, String str) {
        C0652e1 c0652e1;
        ConcurrentHashMap concurrentHashMap = f2110f;
        if (j2 > 0 && (c0652e1 = (C0652e1) concurrentHashMap.get(Long.valueOf(j2))) != null) {
            return c0652e1;
        }
        if (j3 <= 0) {
            return null;
        }
        C0652e1 c0652e12 = (C0652e1) concurrentHashMap.get(Long.valueOf(j3));
        if (c0652e12 != null) {
            return c0652e12;
        }
        if (str == null || AbstractC0425j.m1013R0(str)) {
            return null;
        }
        C0652e1 c0652e13 = (C0652e1) f2111g.get(str + ":" + j3);
        if (c0652e13 != null) {
            return c0652e13;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m1706o(Object obj, Object obj2, String str) throws IllegalAccessException {
        Field fieldM1695d = m1695d(obj.getClass(), str);
        if (fieldM1695d == null || Modifier.isFinal(fieldM1695d.getModifiers())) {
            return;
        }
        fieldM1695d.setAccessible(true);
        fieldM1695d.set(obj, obj2);
    }

    /* JADX INFO: renamed from: p */
    public static String m1707p(Class cls) {
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

    /* JADX INFO: renamed from: q */
    public static void m1708q(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-AntiRevoke] " + str);
        } catch (Throwable unused) {
        }
    }
}
