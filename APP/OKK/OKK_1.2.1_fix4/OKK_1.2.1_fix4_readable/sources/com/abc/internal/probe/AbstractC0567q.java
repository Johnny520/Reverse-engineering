package com.abc.internal.probe;

import android.content.Context;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: b0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0567q {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f1676a = new AtomicReference("");

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f1677b = new AtomicReference("");

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f1678c = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    public static Class m1378a(Context context, ClassLoader classLoader, String str) {
        Object objM116u;
        AtomicReference atomicReference = f1678c;
        Class cls = (Class) atomicReference.get();
        if (cls != null) {
            return cls;
        }
        AbstractC0307g.m703e(classLoader, "cl");
        try {
            objM116u = Class.forName("iy0.z1", false, classLoader);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Class cls2 = (Class) objM116u;
        if (cls2 != null) {
            atomicReference.set(cls2);
            m1382e("config class fallback iy0.z1");
            return cls2;
        }
        if (context != null) {
            Class clsM1362a = DexKitManager.m1362a(context, classLoader, str, "MicroMsg.ConfigStorageLogic", "get userinfo fail");
            if (clsM1362a == null) {
                clsM1362a = DexKitManager.m1362a(context, classLoader, str, "MicroMsg.ConfigStorageLogic");
            }
            if (clsM1362a != null) {
                atomicReference.set(clsM1362a);
                m1382e("config class DexKit ".concat(clsM1362a.getName()));
                return clsM1362a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m1379b(Method method) {
        Object objM116u;
        String string;
        try {
            Object objInvoke = method.invoke(null, null);
            objM116u = (objInvoke == null || (string = objInvoke.toString()) == null) ? null : AbstractC0425j.m1022a1(string).toString();
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0 || str.equals("null")) {
            return null;
        }
        if (AbstractC0433r.m1033H0(str, "wxid_", false)) {
            return str;
        }
        int length = str.length();
        if (5 > length || length >= 65 || AbstractC0425j.m1006K0(str, ' ') || AbstractC0425j.m1006K0(str, '\n')) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m1380c(Context context, ClassLoader classLoader, String str) {
        Object next;
        String strM1379b;
        Class clsM1378a = m1378a(context, classLoader, str);
        if (clsM1378a == null) {
            return "";
        }
        Method[] declaredMethods = clsM1378a.getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && AbstractC0307g.m699a(method.getReturnType(), String.class)) {
                    arrayList.add(method);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Method) it.next()).setAccessible(true);
        }
        for (String str2 : AbstractC0182m.m556h0("r", "s", "t", "u", "getUsernameFromUserInfo")) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC0307g.m699a(((Method) next).getName(), str2)) {
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 != null && (strM1379b = m1379b(method2)) != null) {
                return strM1379b;
            }
        }
        for (Method method3 : arrayList) {
            AbstractC0307g.m700b(method3);
            String strM1379b2 = m1379b(method3);
            if (strM1379b2 != null) {
                return strM1379b2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static String m1381d(Context context, ClassLoader classLoader, String str) {
        Object next;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM116u;
        String string;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AtomicReference atomicReference = f1677b;
        Object obj = atomicReference.get();
        AbstractC0307g.m700b((String) obj);
        Object obj2 = null;
        if (!(!AbstractC0425j.m1013R0(r3))) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        Class clsM1378a = m1378a(context, classLoader, str);
        if (clsM1378a == null) {
            return "";
        }
        Method[] declaredMethods = clsM1378a.getDeclaredMethods();
        AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && AbstractC0307g.m699a(method.getReturnType(), String.class)) {
                    arrayList.add(method);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Method) it.next()).setAccessible(true);
        }
        String strM1380c = m1380c(context, classLoader, str);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                Object objInvoke = ((Method) it2.next()).invoke(null, null);
                objM116u = (objInvoke == null || (string = objInvoke.toString()) == null) ? null : AbstractC0425j.m1022a1(string).toString();
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            String str3 = (String) objM116u;
            if (str3 == null || !(!AbstractC0425j.m1013R0(str3)) || str3.equals("null") || str3.equals(strM1380c) || str3.equals("")) {
                str3 = null;
            }
            if (str3 != null) {
                arrayList2.add(str3);
            }
        }
        List listM543o0 = AbstractC0181l.m543o0(arrayList2);
        if (listM543o0.isEmpty()) {
            m1382e("nickname candidates empty");
            return "";
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM543o0) {
            String str4 = (String) obj3;
            if (!AbstractC0433r.m1033H0(str4, "wxid_", false)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= str4.length()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < str4.length()) {
                                char cCharAt = str4.charAt(i3);
                                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_' && cCharAt != '-') {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= str4.length()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (Character.isUpperCase(str4.charAt(i4))) {
                                        z2 = true;
                                        break;
                                    }
                                    i4++;
                                }
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= str4.length()) {
                                        z3 = false;
                                        break;
                                    }
                                    if (Character.isLowerCase(str4.charAt(i5))) {
                                        z3 = true;
                                        break;
                                    }
                                    i5++;
                                }
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= str4.length()) {
                                        z4 = false;
                                        break;
                                    }
                                    if (Character.isDigit(str4.charAt(i6))) {
                                        z4 = true;
                                        break;
                                    }
                                    i6++;
                                }
                                if (!z2 || !z3) {
                                    if (!z4 || z2 || z3) {
                                        if (!z4 || !z2 || z3) {
                                            if (!z4 || !z3 || z2) {
                                                if (z3 || !z2 || str4.length() < 6) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (str4.charAt(i2) > 127) {
                            break;
                        }
                        i2++;
                    }
                }
                arrayList3.add(obj3);
            }
        }
        m1382e("nickname candidates=".concat(AbstractC0181l.m546r0(listM543o0, "|", null, null, new C0555e(24), 30)));
        Iterator it3 = arrayList3.iterator();
        loop9: while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            String str5 = (String) next;
            for (int i7 = 0; i7 < str5.length(); i7++) {
                if (str5.charAt(i7) > 127) {
                    break loop9;
                }
            }
        }
        String str6 = (String) next;
        if (str6 == null) {
            Iterator it4 = arrayList3.iterator();
            loop11: while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                String str7 = (String) next2;
                int i8 = 0;
                while (true) {
                    if (i8 >= str7.length()) {
                        break;
                    }
                    if (Character.isUpperCase(str7.charAt(i8))) {
                        for (int i9 = 0; i9 < str7.length(); i9++) {
                            if (Character.isLowerCase(str7.charAt(i9))) {
                                obj2 = next2;
                                break loop11;
                            }
                        }
                    } else {
                        i8++;
                    }
                }
            }
            str6 = (String) obj2;
            if (str6 == null) {
                str6 = (String) AbstractC0181l.m544p0(arrayList3);
            }
        }
        if (str6 == null) {
            return "";
        }
        atomicReference.set(str6);
        m1382e("resolved nickname=".concat(str6));
        return str6;
    }

    /* JADX INFO: renamed from: e */
    public static void m1382e(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-SelfUser] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
