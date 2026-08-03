package p050c0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642b0 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f1999a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f2000b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2001c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static byte[] m1614a(Object obj) {
        Object objM116u;
        Method method;
        try {
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
                if (AbstractC0307g.m699a(method.getName(), "getColumnIndex") && method.getParameterTypes().length == 1) {
                    break;
                }
                i2++;
            }
            if (method == null) {
                return null;
            }
            Object objInvoke = method.invoke(obj, "roomdata");
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            objM116u = Integer.valueOf(number != null ? number.intValue() : -1);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = -1;
        }
        return m1615b(((Number) objM116u).intValue(), obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m1615b(int i2, Object obj) {
        Object objM116u;
        Method method;
        byte[] bArr = null;
        if (i2 < 0) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0307g.m702d(methods, "getMethods(...)");
            int length = methods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = methods[i3];
                if (AbstractC0307g.m699a(method.getName(), "getBlob") && method.getParameterTypes().length == 1) {
                    break;
                }
                i3++;
            }
            if (method == null) {
                objM116u = null;
            } else {
                method.setAccessible(true);
                Object objInvoke = method.invoke(obj, Integer.valueOf(i2));
                if (objInvoke instanceof byte[]) {
                    objM116u = (byte[]) objInvoke;
                }
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        byte[] bArr2 = (byte[]) objM116u;
        if (bArr2 != null) {
            return bArr2;
        }
        String strM1619f = m1619f(i2, obj);
        String string = strM1619f != null ? AbstractC0425j.m1022a1(strM1619f).toString() : null;
        if (string == null) {
            string = "";
        }
        String strM1031F0 = AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0425j.m1016U0(string, "hex->"), " ", "", false), "\n", "", false), "\r", "", false);
        if (strM1031F0.length() >= 2 && strM1031F0.length() % 2 == 0) {
            Pattern patternCompile = Pattern.compile("[0-9a-fA-F]+");
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            if (patternCompile.matcher(strM1031F0).matches()) {
                int length2 = strM1031F0.length() / 2;
                bArr = new byte[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    int i5 = i4 * 2;
                    String strSubstring = strM1031F0.substring(i5, i5 + 2);
                    AbstractC0307g.m702d(strSubstring, "substring(...)");
                    AbstractC0358S.m890i(16);
                    bArr[i4] = (byte) Integer.parseInt(strSubstring, 16);
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m1616c(Object obj) {
        Method method;
        try {
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
                if (AbstractC0307g.m699a(method.getName(), "close")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                return;
            }
            method.setAccessible(true);
            method.invoke(obj, null);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1617d(Object obj) {
        Object objM116u;
        Method method;
        try {
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
                if (AbstractC0307g.m699a(method.getName(), "moveToFirst")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, null);
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            objM116u = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj2 = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj2;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static String m1618e(Object obj, String str) {
        Object objM116u;
        Method method;
        try {
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
                if (AbstractC0307g.m699a(method.getName(), "getColumnIndex") && method.getParameterTypes().length == 1) {
                    break;
                }
                i2++;
            }
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, str);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            int iIntValue = number != null ? number.intValue() : -1;
            if (iIntValue < 0) {
                iIntValue = m1622i(obj, str);
            }
            if (iIntValue < 0) {
                return null;
            }
            objM116u = m1619f(iIntValue, obj);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (String) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: f */
    public static String m1619f(int i2, Object obj) {
        Object objM116u;
        Method method;
        if (i2 < 0) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0307g.m702d(methods, "getMethods(...)");
            int length = methods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = methods[i3];
                if (AbstractC0307g.m699a(method.getName(), "getString") && method.getParameterTypes().length == 1) {
                    break;
                }
                i3++;
            }
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, Integer.valueOf(i2));
            objM116u = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (String) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: g */
    public static String m1620g(String str, String str2) {
        String str3;
        Object objM116u;
        String str4;
        String str5 = null;
        String string = str != null ? AbstractC0425j.m1022a1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        String strM1741d = AbstractC0680o.m1741d(str2);
        ConcurrentHashMap concurrentHashMap = f2001c;
        if (strM1741d != null) {
            if (string.length() > 0) {
                concurrentHashMap.put(string, strM1741d);
            }
            return strM1741d;
        }
        if (string.length() > 0 && (str4 = (String) concurrentHashMap.get(string)) != null) {
            return str4;
        }
        if (string.length() <= 0 || AbstractC0680o.m1744g(string)) {
            return "对方";
        }
        C0199c c0199c = new C0199c(10);
        Object obj = f2000b.get();
        if (obj != null) {
            c0199c.add(obj);
        }
        c0199c.addAll(f1999a);
        Iterator it = AbstractC0181l.m543o0(AbstractC0040p.m103f(c0199c)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC0307g.m700b(next);
            Iterator it2 = AbstractC0182m.m556h0(new C0139e("SELECT conRemark, nickname, alias FROM rcontact WHERE username=? LIMIT 1", new String[]{string}), new C0139e("SELECT conRemark, nickname, alias FROM rcontact WHERE username=? OR encryptUsername=? LIMIT 1", new String[]{string, string}), new C0139e(AbstractC0324d.m723f("SELECT conRemark, nickname, alias FROM rcontact WHERE username='", AbstractC0433r.m1031F0(string, "'", "''", false), "' LIMIT 1"), new String[0])).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str3 = null;
                    break;
                }
                C0139e c0139e = (C0139e) it2.next();
                try {
                    objM116u = m1624k(next, (String) c0139e.f328a, (String[]) c0139e.f329b);
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                str3 = (String) objM116u;
                if (str3 != null) {
                    break;
                }
            }
            if (str3 != null) {
                str5 = str3;
                break;
            }
        }
        if (str5 == null) {
            return "对方";
        }
        concurrentHashMap.put(string, str5);
        if (concurrentHashMap.size() > 800) {
            Set setKeySet = concurrentHashMap.keySet();
            AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
            Iterator it3 = AbstractC0181l.m549u0(200, setKeySet).iterator();
            while (it3.hasNext()) {
                concurrentHashMap.remove((String) it3.next());
            }
        }
        return str5;
    }

    /* JADX INFO: renamed from: h */
    public static Integer m1621h(byte[] bArr, String str) {
        C0139e c0139eM1625l;
        int iIntValue = 0;
        while (true) {
            C0139e c0139e = null;
            if (iIntValue >= bArr.length || (c0139eM1625l = m1625l(bArr, iIntValue)) == null) {
                return null;
            }
            int iIntValue2 = ((Number) c0139eM1625l.f329b).intValue();
            Number number = (Number) c0139eM1625l.f328a;
            int iLongValue = (int) (number.longValue() >>> 3);
            int iLongValue2 = (int) (number.longValue() & 7);
            if (iLongValue != 1 || iLongValue2 != 2) {
                Integer numM1627n = m1627n(bArr, iIntValue2, iLongValue2, bArr.length);
                if (numM1627n == null) {
                    break;
                }
                iIntValue = numM1627n.intValue();
            } else {
                C0139e c0139eM1625l2 = m1625l(bArr, iIntValue2);
                if (c0139eM1625l2 == null) {
                    return null;
                }
                int iIntValue3 = ((Number) c0139eM1625l2.f329b).intValue();
                iIntValue = ((int) ((Number) c0139eM1625l2.f328a).longValue()) + iIntValue3;
                int length = bArr.length;
                if (iIntValue > length) {
                    iIntValue = length;
                }
                if (iIntValue < iIntValue3) {
                    return null;
                }
                int iLongValue3 = 0;
                String string = null;
                while (true) {
                    if (iIntValue3 < iIntValue) {
                        C0139e c0139eM1625l3 = m1625l(bArr, iIntValue3);
                        if (c0139eM1625l3 == null) {
                            break;
                        }
                        int iIntValue4 = ((Number) c0139eM1625l3.f329b).intValue();
                        Number number2 = (Number) c0139eM1625l3.f328a;
                        int iLongValue4 = (int) (number2.longValue() >>> 3);
                        int iLongValue5 = (int) (number2.longValue() & 7);
                        if (iLongValue4 == 1 && iLongValue5 == 2) {
                            C0139e c0139eM1625l4 = m1625l(bArr, iIntValue4);
                            if (c0139eM1625l4 == null) {
                                break;
                            }
                            int iIntValue5 = ((Number) c0139eM1625l4.f329b).intValue();
                            iIntValue3 = ((int) ((Number) c0139eM1625l4.f328a).longValue()) + iIntValue5;
                            if (iIntValue3 > iIntValue) {
                                iIntValue3 = iIntValue;
                            }
                            AbstractC0040p.m114s(iIntValue3, bArr.length);
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iIntValue5, iIntValue3);
                            AbstractC0307g.m702d(bArrCopyOfRange, "copyOfRange(...)");
                            string = AbstractC0425j.m1022a1(new String(bArrCopyOfRange, AbstractC0416a.f921a)).toString();
                        } else if (iLongValue4 != 3 || iLongValue5 != 0) {
                            Integer numM1627n2 = m1627n(bArr, iIntValue4, iLongValue5, iIntValue);
                            if (numM1627n2 == null) {
                                break;
                            }
                            iIntValue3 = numM1627n2.intValue();
                        } else {
                            C0139e c0139eM1625l5 = m1625l(bArr, iIntValue4);
                            if (c0139eM1625l5 == null) {
                                break;
                            }
                            iLongValue3 = (int) ((Number) c0139eM1625l5.f328a).longValue();
                            iIntValue3 = ((Number) c0139eM1625l5.f329b).intValue();
                        }
                    } else if (string != null) {
                        c0139e = new C0139e(string, Integer.valueOf(iLongValue3));
                    }
                }
                if (c0139e != null) {
                    String str2 = (String) c0139e.f328a;
                    int iIntValue6 = ((Number) c0139e.f329b).intValue();
                    if (AbstractC0307g.m699a(str2, str)) {
                        return Integer.valueOf(iIntValue6);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static int m1622i(Object obj, String str) {
        Object objM116u;
        Method method;
        Method method2;
        try {
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
                if (AbstractC0307g.m699a(method.getName(), "getColumnCount")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                return -1;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, null);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            if (number == null) {
                return -1;
            }
            int iIntValue = number.intValue();
            Method[] methods2 = obj.getClass().getMethods();
            AbstractC0307g.m702d(methods2, "getMethods(...)");
            int length2 = methods2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    method2 = null;
                    break;
                }
                method2 = methods2[i3];
                if (AbstractC0307g.m699a(method2.getName(), "getColumnName") && method2.getParameterTypes().length == 1) {
                    break;
                }
                i3++;
            }
            if (method2 == null) {
                return -1;
            }
            method2.setAccessible(true);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                Object objInvoke2 = method2.invoke(obj, Integer.valueOf(i4));
                String str2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    return i4;
                }
            }
            objM116u = -1;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = -1;
        }
        return ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: j */
    public static Object m1623j(Object obj, String str, String[] strArr) {
        Object obj2;
        Object objM116u;
        Method[] methods = obj.getClass().getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (AbstractC0307g.m699a(method.getName(), "rawQuery")) {
                arrayList.add(method);
            }
        }
        Iterator it = AbstractC0181l.m548t0(arrayList, new C0692s(3)).iterator();
        do {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Method method2 = (Method) it.next();
            AbstractC0307g.m700b(method2);
            try {
                method2.setAccessible(true);
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && AbstractC0307g.m699a(parameterTypes[0], String.class)) {
                    objM116u = method2.invoke(obj, str);
                } else if (parameterTypes.length < 2 || !AbstractC0307g.m699a(parameterTypes[0], String.class)) {
                    objM116u = null;
                } else {
                    if (!AbstractC0307g.m699a(parameterTypes[1], String[].class)) {
                        parameterTypes[1].getName().equals("[Ljava.lang.String;");
                    }
                    if (parameterTypes.length == 2) {
                        objM116u = method2.invoke(obj, str, strArr);
                    } else {
                        int length = parameterTypes.length - 2;
                        Object[] objArr = new Object[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            objArr[i2] = null;
                        }
                        C0316p c0316p = new C0316p(3);
                        ArrayList arrayList2 = c0316p.f597a;
                        c0316p.m709a(str);
                        c0316p.m709a(strArr);
                        c0316p.m710b(objArr);
                        objM116u = method2.invoke(obj, arrayList2.toArray(new Object[arrayList2.size()]));
                    }
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (!(objM116u instanceof C0140f)) {
                obj2 = objM116u;
            }
        } while (obj2 == null);
        return obj2;
    }

    /* JADX INFO: renamed from: k */
    public static String m1624k(Object obj, String str, String[] strArr) {
        Object objM1623j = m1623j(obj, str, strArr);
        if (objM1623j == null) {
            return null;
        }
        try {
            if (!m1617d(objM1623j)) {
                m1616c(objM1623j);
                return null;
            }
            String strM1618e = m1618e(objM1623j, "conRemark");
            if (strM1618e == null) {
                strM1618e = m1619f(0, objM1623j);
            }
            String strM1618e2 = m1618e(objM1623j, "nickname");
            if (strM1618e2 == null) {
                strM1618e2 = m1619f(1, objM1623j);
            }
            String strM1618e3 = m1618e(objM1623j, "alias");
            if (strM1618e3 == null) {
                strM1618e3 = m1619f(2, objM1623j);
            }
            String strM1739b = AbstractC0680o.m1739b(strM1618e);
            if (strM1739b == null && (strM1739b = AbstractC0680o.m1739b(strM1618e2)) == null) {
                strM1739b = AbstractC0680o.m1739b(strM1618e3);
            }
            m1616c(objM1623j);
            return strM1739b;
        } catch (Throwable th) {
            m1616c(objM1623j);
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public static C0139e m1625l(byte[] bArr, int i2) {
        long j2 = 0;
        int i3 = 0;
        while (i2 < bArr.length && i3 < 64) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            j2 |= ((long) (b2 & 127)) << i3;
            if ((b2 & 128) == 0) {
                return new C0139e(Long.valueOf(j2), Integer.valueOf(i4));
            }
            i3 += 7;
            i2 = i4;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m1626m(Object obj) {
        if (obj == null) {
            return;
        }
        Method[] methods = obj.getClass().getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        for (Method method : methods) {
            if (AbstractC0307g.m699a(method.getName(), "rawQuery")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                if (!(parameterTypes.length == 0)) {
                    f2000b.set(obj);
                    CopyOnWriteArrayList copyOnWriteArrayList = f1999a;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next() == obj) {
                                return;
                            }
                        }
                    }
                    copyOnWriteArrayList.add(obj);
                    while (copyOnWriteArrayList.size() > 8) {
                        copyOnWriteArrayList.remove(0);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static Integer m1627n(byte[] bArr, int i2, int i3, int i4) {
        Integer numValueOf;
        if (i3 == 0) {
            C0139e c0139eM1625l = m1625l(bArr, i2);
            if (c0139eM1625l != null) {
                return (Integer) c0139eM1625l.f329b;
            }
            return null;
        }
        if (i3 == 1) {
            int i5 = i2 + 8;
            numValueOf = Integer.valueOf(i5);
            if (i5 > i4) {
                return null;
            }
        } else if (i3 == 2) {
            C0139e c0139eM1625l2 = m1625l(bArr, i2);
            if (c0139eM1625l2 == null) {
                return null;
            }
            int iIntValue = ((Number) c0139eM1625l2.f329b).intValue() + ((int) ((Number) c0139eM1625l2.f328a).longValue());
            numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue > i4) {
                return null;
            }
        } else {
            if (i3 != 5) {
                return null;
            }
            int i6 = i2 + 4;
            numValueOf = Integer.valueOf(i6);
            if (i6 > i4) {
                return null;
            }
        }
        return numValueOf;
    }
}
