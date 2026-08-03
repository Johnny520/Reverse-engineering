package com.abc.core.features;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Process;
import de.robv.android.xposed.AbstractC0762d;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
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
import p007D0.C0140f;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: loaded from: classes.dex */
public final class MomentsCommentProtectHook {

    /* JADX INFO: renamed from: a */
    public static final MomentsCommentProtectHook f2040a = new MomentsCommentProtectHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2041b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2042c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m1641a(MomentsCommentProtectHook momentsCommentProtectHook, C0760b c0760b, boolean z2) throws IllegalAccessException, IOException, InvocationTargetException {
        String[] strArr;
        String str;
        Object objM116u;
        Object objM116u2;
        Cursor cursor;
        Object objM116u3;
        Object objM116u4;
        momentsCommentProtectHook.getClass();
        Object[] objArr = c0760b.f2670c;
        AbstractC0307g.m702d(objArr, "args");
        Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
        Number number = objM537n0 instanceof Number ? (Number) objM537n0 : null;
        if (number != null) {
            long jLongValue = number.longValue();
            if (z2) {
                Object[] objArr2 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr2, "args");
                Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                Number number2 = objM537n02 instanceof Number ? (Number) objM537n02 : null;
                if (number2 == null) {
                    return;
                }
                strArr = new String[]{String.valueOf(jLongValue), String.valueOf(number2.longValue())};
                str = "snsID = ? AND commentSvrID = ?";
            } else {
                strArr = new String[]{String.valueOf(jLongValue)};
                str = "snsID = ?";
            }
            Object obj = c0760b.f2669b;
            AbstractC0307g.m702d(obj, "thisObject");
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                AbstractC0188s.m561m0(arrayList, declaredFields);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    objM116u = null;
                    break;
                }
                Field field = (Field) it.next();
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (!type.isPrimitive() && !type.equals(String.class) && !AbstractC0433r.m1033H0(type.getName(), "java.", false)) {
                        field.setAccessible(true);
                        try {
                            objM116u = field.get(obj);
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        if (objM116u instanceof C0140f) {
                            objM116u = null;
                        }
                        if (objM116u != null && m1646f(objM116u) != null) {
                            break;
                        }
                    }
                }
            }
            if (objM116u == null) {
                m1657r("markAndBlockDelete: no db handle");
                return;
            }
            String strConcat = "SELECT rowid, curActionBuf, commentflag FROM SnsComment WHERE ".concat(str);
            Method methodM1646f = m1646f(objM116u);
            if (methodM1646f == null) {
                cursor = null;
            } else {
                try {
                    Object objInvoke = methodM1646f.invoke(objM116u, strConcat, strArr);
                    objM116u2 = objInvoke instanceof Cursor ? (Cursor) objInvoke : null;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = null;
                }
                cursor = (Cursor) objM116u2;
            }
            if (cursor == null) {
                return;
            }
            while (cursor.moveToNext()) {
                try {
                    long j2 = cursor.getLong(0);
                    try {
                        objM116u3 = cursor.getBlob(1);
                    } catch (Throwable th3) {
                        objM116u3 = AbstractC0040p.m116u(th3);
                    }
                    if (objM116u3 instanceof C0140f) {
                        objM116u3 = null;
                    }
                    byte[] bArr = (byte[]) objM116u3;
                    try {
                        objM116u4 = Integer.valueOf(cursor.getInt(2));
                    } catch (Throwable th4) {
                        objM116u4 = AbstractC0040p.m116u(th4);
                    }
                    if (objM116u4 instanceof C0140f) {
                        objM116u4 = 0;
                    }
                    int iIntValue = ((Number) objM116u4).intValue();
                    if ((iIntValue & 256) == 0) {
                        int i2 = (iIntValue & (-2)) | 256;
                        byte[] bArrM854D = AbstractC0358S.m854D(bArr);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("curActionBuf", bArrM854D);
                        contentValues.put("commentflag", Integer.valueOf(i2));
                        m1656q(objM116u, contentValues, new String[]{String.valueOf(j2)});
                        m1657r("marked rowid=" + j2 + " flag=" + iIntValue + "->" + i2);
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC0040p.m108m(cursor, th5);
                        throw th6;
                    }
                }
            }
            AbstractC0040p.m108m(cursor, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1642b(Object obj) throws IllegalAccessException {
        Field fieldM1647g = m1647g(obj.getClass(), "field_commentflag");
        if (fieldM1647g == null) {
            return;
        }
        fieldM1647g.setAccessible(true);
        Object obj2 = fieldM1647g.get(obj);
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        fieldM1647g.set(obj, Integer.valueOf(((number != null ? number.intValue() : 0) & (-2)) | 256));
        Field fieldM1647g2 = m1647g(obj.getClass(), "field_curActionBuf");
        if (fieldM1647g2 == null) {
            return;
        }
        fieldM1647g2.setAccessible(true);
        Object obj3 = fieldM1647g2.get(obj);
        fieldM1647g2.set(obj, AbstractC0358S.m854D(obj3 instanceof byte[] ? (byte[]) obj3 : null));
    }

    /* JADX INFO: renamed from: c */
    public static void m1643c(Object obj) {
        Iterator it = AbstractC0182m.m556h0("f233756s", "s", "DeleteFlag", "deleteFlag").iterator();
        while (it.hasNext()) {
            Field fieldM1647g = m1647g(obj.getClass(), (String) it.next());
            if (fieldM1647g != null && (AbstractC0307g.m699a(fieldM1647g.getType(), Integer.TYPE) || AbstractC0307g.m699a(fieldM1647g.getType(), Integer.class))) {
                fieldM1647g.setAccessible(true);
                try {
                    fieldM1647g.set(obj, 0);
                    return;
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m1644d(Object obj) throws IllegalAccessException {
        Integer numValueOf;
        String str;
        Iterator it = AbstractC0182m.m556h0("f233744d", "d", "Username", "username", "UserName").iterator();
        while (true) {
            numValueOf = null;
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Field fieldM1647g = m1647g(obj.getClass(), (String) it.next());
            if (fieldM1647g != null && AbstractC0307g.m699a(fieldM1647g.getType(), String.class)) {
                fieldM1647g.setAccessible(true);
                Object obj2 = fieldM1647g.get(obj);
                str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null && str.length() != 0) {
                    break;
                }
            }
        }
        if (str == null) {
            return null;
        }
        Iterator it2 = AbstractC0182m.m556h0("f233750m", "m", "CommentId", "commentId", "i").iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Field fieldM1647g2 = m1647g(obj.getClass(), (String) it2.next());
            if (fieldM1647g2 != null) {
                fieldM1647g2.setAccessible(true);
                Object obj3 = fieldM1647g2.get(obj);
                if (obj3 == null) {
                    continue;
                } else {
                    if (obj3 instanceof Integer) {
                        numValueOf = (Integer) obj3;
                        break;
                    }
                    if (obj3 instanceof Long) {
                        numValueOf = Integer.valueOf((int) ((Number) obj3).longValue());
                        break;
                    }
                    if (obj3 instanceof Number) {
                        numValueOf = Integer.valueOf(((Number) obj3).intValue());
                        break;
                    }
                }
            }
        }
        return str + "#" + (numValueOf != null ? numValueOf.intValue() : 0);
    }

    /* JADX INFO: renamed from: e */
    public static Method m1645e(ClassLoader classLoader, String str) throws ClassNotFoundException {
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
                        sb.append(m1655p(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1655p(returnType));
                    String string = sb.toString();
                    AbstractC0307g.m702d(string, "toString(...)");
                    if (string.equals(strSubstring3)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                return method;
            }
        }
        throw new IllegalStateException("method not found ".concat(str).toString());
    }

    /* JADX INFO: renamed from: f */
    public static Method m1646f(Object obj) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                Method method = (Method) c0172cM714c.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2 && AbstractC0307g.m699a(parameterTypes[0], String.class) && (AbstractC0307g.m699a(parameterTypes[1], String[].class) || parameterTypes[1].getName().equals("[Ljava.lang.String;"))) {
                    if (Cursor.class.isAssignableFrom(method.getReturnType())) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Field m1647g(Class cls, String str) {
        while (cls != null && !cls.equals(Object.class)) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m1648h(DexKitBridge dexKitBridge, ClassLoader classLoader, List list, String str, InterfaceC0286l interfaceC0286l) {
        Object objM116u;
        Object objM116u2;
        int i2 = 0;
        try {
            FindMethod findMethod = new FindMethod();
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
        List<MethodData> list2 = (List) objM116u;
        if (list2 == null) {
            list2 = C0190u.f401a;
        }
        if (list2.isEmpty()) {
            m1657r("DexKit miss ".concat(str));
            return 0;
        }
        for (MethodData methodData : list2) {
            try {
                objM116u2 = m1645e(classLoader, methodData.getDescriptor());
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            if (objM116u2 instanceof C0140f) {
                objM116u2 = null;
            }
            Method method = (Method) objM116u2;
            if (method != null && ((Boolean) interfaceC0286l.invoke(method)).booleanValue()) {
                i2++;
                m1657r("hooked " + str + " -> " + methodData.getDescriptor());
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1649j() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("anti_moments_comment_revoke", true));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.TRUE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m1650k(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        String str2;
        AtomicBoolean atomicBoolean = f2042c;
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
            File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_cmt_", str2, "_libdexkit.so"));
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

    /* JADX INFO: renamed from: l */
    public static void m1651l(Object obj) throws IllegalAccessException {
        Field fieldM1647g;
        String strConcat;
        Iterator it = AbstractC0182m.m556h0("f233748h", "h", "m", "Content", "content", "Desc").iterator();
        while (true) {
            if (!it.hasNext()) {
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                    while (c0172cM714c.hasNext()) {
                        Field field = (Field) c0172cM714c.next();
                        if (AbstractC0307g.m699a(field.getType(), String.class)) {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            String strConcat2 = obj2 instanceof String ? (String) obj2 : null;
                            if (strConcat2 != null && !AbstractC0425j.m1005J0(strConcat2, "@", false) && !AbstractC0433r.m1033H0(strConcat2, "wxid_", false)) {
                                if (AbstractC0433r.m1033H0(strConcat2, "[已删除]", false) || AbstractC0433r.m1033H0(strConcat2, "(已删除)", false)) {
                                    return;
                                }
                                if (!AbstractC0433r.m1033H0(strConcat2, "[已删除]", false)) {
                                    strConcat2 = AbstractC0433r.m1033H0(strConcat2, "(已删除)", false) ? "[已删除]".concat(AbstractC0425j.m1016U0(strConcat2, "(已删除)")) : strConcat2.length() != 0 ? "[已删除] ".concat(strConcat2) : "[已删除]";
                                }
                                field.set(obj, strConcat2);
                                return;
                            }
                        }
                    }
                }
                return;
            }
            String str = (String) it.next();
            fieldM1647g = m1647g(obj.getClass(), str);
            if (fieldM1647g != null && AbstractC0307g.m699a(fieldM1647g.getType(), String.class)) {
                fieldM1647g.setAccessible(true);
                Object obj3 = fieldM1647g.get(obj);
                strConcat = obj3 instanceof String ? (String) obj3 : null;
                if (strConcat != null || AbstractC0425j.m1005J0(str, "h", true) || str.equals("f233748h")) {
                    break;
                }
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        if (!AbstractC0433r.m1033H0(strConcat, "[已删除]", false)) {
            strConcat = AbstractC0433r.m1033H0(strConcat, "(已删除)", false) ? "[已删除]".concat(AbstractC0425j.m1016U0(strConcat, "(已删除)")) : strConcat.length() != 0 ? "[已删除] ".concat(strConcat) : "[已删除]";
        }
        fieldM1647g.set(obj, strConcat);
    }

    /* JADX INFO: renamed from: m */
    public static Object m1652m(Class cls, byte[] bArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Method method;
        Object objNewInstance = cls.newInstance();
        Method[] methods = cls.getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (AbstractC0307g.m699a(method.getName(), "parseFrom") && method.getParameterTypes().length == 1 && AbstractC0307g.m699a(method.getParameterTypes()[0], byte[].class)) {
                break;
            }
            i2++;
        }
        if (method == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length2 = declaredMethods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    method = null;
                    break;
                }
                Method method2 = declaredMethods[i3];
                if (AbstractC0307g.m699a(method2.getName(), "parseFrom") && method2.getParameterTypes().length == 1 && AbstractC0307g.m699a(method2.getParameterTypes()[0], byte[].class)) {
                    method = method2;
                    break;
                }
                i3++;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        Object objInvoke = method.invoke(objNewInstance, bArr);
        return objInvoke == null ? objNewInstance : objInvoke;
    }

    /* JADX INFO: renamed from: n */
    public static List m1653n(Object obj) {
        Object objM116u;
        try {
            objM116u = AbstractC0358S.m920y(obj, "CommentUserList");
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        if (AbstractC0317q.m713b(objM116u)) {
            return (List) objM116u;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m1654o(Object obj) throws IllegalAccessException, InvocationTargetException {
        Method method;
        Method[] methods = obj.getClass().getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (AbstractC0307g.m699a(method.getName(), "toByteArray")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0) {
                    break;
                }
            }
            i2++;
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        Object objInvoke = method.invoke(obj, null);
        if (objInvoke instanceof byte[]) {
            return (byte[]) objInvoke;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static String m1655p(Class cls) {
        if (cls.isPrimitive()) {
            return cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : "V";
        }
        if (!cls.isArray()) {
            return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
        }
        Class<?> componentType = cls.getComponentType();
        AbstractC0307g.m700b(componentType);
        return AbstractC0324d.m725h("[", m1655p(componentType));
    }

    /* JADX INFO: renamed from: q */
    public static void m1656q(Object obj, ContentValues contentValues, String[] strArr) {
        Method method;
        Object objM116u;
        Class<?> superclass = obj.getClass();
        loop0: while (true) {
            if (superclass == null) {
                method = null;
                break;
            }
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                method = (Method) c0172cM714c.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && AbstractC0307g.m699a(parameterTypes[0], String.class) && AbstractC0307g.m699a(parameterTypes[1], ContentValues.class) && AbstractC0307g.m699a(parameterTypes[2], String.class) && (AbstractC0307g.m699a(parameterTypes[3], String[].class) || parameterTypes[3].getName().equals("[Ljava.lang.String;"))) {
                    break loop0;
                }
            }
            superclass = superclass.getSuperclass();
        }
        method.setAccessible(true);
        if (method == null) {
            return;
        }
        try {
            Object objInvoke = method.invoke(obj, "SnsComment", contentValues, "rowid = ?", strArr);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            objM116u = Integer.valueOf(number != null ? number.intValue() : -1);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = -1;
        }
        ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: r */
    public static void m1657r(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-MomentsCmt] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1658i(Method method, boolean z2, String str) {
        Object objM116u;
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0650e(this, str, z2));
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
