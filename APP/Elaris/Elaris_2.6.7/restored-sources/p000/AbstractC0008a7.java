package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0008a7 {

    /* JADX INFO: renamed from: b */
    public static volatile Application f27b;

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f28c;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f26a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static volatile String f29d = "";

    /* JADX INFO: renamed from: e */
    public static volatile String f30e = "";

    /* JADX INFO: renamed from: f */
    public static volatile int f31f = 0;

    /* JADX INFO: renamed from: g */
    public static volatile long f32g = 0;

    /* JADX INFO: renamed from: h */
    public static volatile long f33h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m39A(int i) {
        return m66w() && HookEntry.isCurrentHotReloadGeneration(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static C0531x6 m40B(ClassLoader classLoader, String str) {
        C0531x6 c0531x6 = new C0531x6(str);
        if (!m60q(str)) {
            c0531x6.f1037h = "invalid troop uin";
            return c0531x6;
        }
        try {
            Object objM54k = m54k(classLoader);
            if (objM54k != null) {
                c0531x6.f1031b = m49f(objM54k);
                Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.troop.clockin.handler.TroopClockInHandler", classLoader);
                c0531x6.f1032c = m55l(objM54k, clsFindClass) != null;
                c0531x6.f1033d = m51h(clsFindClass) != null;
            }
        } catch (Throwable unused) {
        }
        try {
            m41C(classLoader, str, c0531x6);
        } catch (Throwable th) {
            String str2 = c0531x6.f1037h;
            String str3 = "handler " + th;
            if (!m59p(str3)) {
                if (m59p(str2)) {
                    str2 = str3;
                } else {
                    str2 = str2 + "; " + str3;
                }
            }
            c0531x6.f1037h = str2;
        }
        if (!c0531x6.f1034e) {
            if (!c0531x6.f1034e && m59p(c0531x6.f1037h)) {
                c0531x6.f1037h = "clock-in transport unavailable";
            }
        }
        return c0531x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41C(ClassLoader classLoader, String str, C0531x6 c0531x6) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Looper mainLooper;
        Object objM54k = m54k(classLoader);
        if (objM54k == null) {
            C0479u2.m1037b("AppRuntime is null");
            return;
        }
        String strM49f = m49f(objM54k);
        c0531x6.f1031b = strM49f;
        if (m59p(strM49f)) {
            C0479u2.m1037b("account uin empty");
            return;
        }
        Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.troop.clockin.handler.TroopClockInHandler", classLoader);
        Object objM55l = m55l(objM54k, clsFindClass);
        boolean z = false;
        c0531x6.f1032c = objM55l != null;
        if (objM55l == null) {
            C0479u2.m1037b("TroopClockInHandler is null");
            return;
        }
        Method methodM51h = m51h(clsFindClass);
        c0531x6.f1033d = methodM51h != null;
        if (methodM51h == null) {
            throw new NoSuchMethodException("TroopClockInHandler void(String,String)");
        }
        methodM51h.setAccessible(true);
        C0515w6 c0515w6 = new C0515w6(methodM51h, objM55l, str, strM49f, c0531x6);
        try {
            try {
                mainLooper = Looper.getMainLooper();
            } catch (Throwable unused) {
                c0515w6.m1122b();
            }
        } catch (Throwable unused2) {
        }
        if (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) {
            boolean[] zArr = new boolean[1];
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(mainLooper).post(new RunnableC0035c2(zArr, c0515w6, countDownLatch, 2));
            countDownLatch.await(2500L, TimeUnit.MILLISECONDS);
            z = zArr[0];
            if (z) {
                methodM51h.invoke(objM55l, str, strM49f);
                c0531x6.f1034e = true;
                c0531x6.f1035f = true;
                c0531x6.f1038i = true;
                if (m59p(c0531x6.f1036g)) {
                    c0531x6.f1036g = "native handler invoked";
                    return;
                }
                return;
            }
            return;
        }
        c0515w6.m1122b();
        z = true;
        if (z) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m42D() {
        return new SimpleDateFormat("yyyyMMdd", Locale.ROOT).format(new Date());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m43E(Object obj, String... strArr) {
        for (String str : strArr) {
            Object objInvoke = null;
            try {
                Field fieldM52i = m52i(obj.getClass(), str);
                Object obj2 = fieldM52i == null ? null : fieldM52i.get(obj);
                if (obj2 != null && obj2.toString().trim().length() > 0) {
                    return obj2.toString().trim();
                }
            } catch (Throwable unused) {
            }
            try {
                Method methodM53j = m53j(obj.getClass(), null, str);
                if (methodM53j != null) {
                    objInvoke = methodM53j.invoke(obj, null);
                }
                if (objInvoke != null && objInvoke.toString().trim().length() > 0) {
                    return objInvoke.toString().trim();
                }
            } catch (Throwable unused2) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m44a() {
        if (m66w()) {
            String strM42D = m42D();
            if (!strM42D.equals(f30e)) {
                f30e = strM42D;
                f31f = 0;
                f32g = 0L;
                f29d = "";
            }
            ArrayList arrayListM65v = m65v(m64u(m58o()));
            if (arrayListM65v.isEmpty()) {
                return;
            }
            f31f++;
            f32g = System.currentTimeMillis();
            HookEntry.logAlways("auto clock-in run, groups=" + arrayListM65v.size() + ", attempt=" + f31f + "/6");
            C0547y6 c0547y6M67x = m67x(arrayListM65v, false);
            ArrayList arrayListM65v2 = m65v(m64u(m58o()));
            StringBuilder sb = new StringBuilder("auto clock-in done: ");
            sb.append(c0547y6M67x.f1091b);
            sb.append("/");
            sb.append(c0547y6M67x.f1090a);
            sb.append(", pending=");
            sb.append(arrayListM65v2.size());
            sb.append(arrayListM65v2.isEmpty() ? "" : ", pendingGroups=".concat(m61r(arrayListM65v2)));
            HookEntry.logAlways(sb.toString());
            if (arrayListM65v2.isEmpty()) {
                f29d = strM42D;
            } else if (f31f < 6) {
                f29d = "";
            } else {
                f29d = strM42D;
                HookEntry.logAlways("auto clock-in pending after max attempts: ".concat(m61r(arrayListM65v2)));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m45b(int i, long j) {
        long jMax = Math.max(0L, j) + System.currentTimeMillis();
        while (m39A(i)) {
            long jCurrentTimeMillis = jMax - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                return;
            }
            try {
                Thread.sleep(Math.min(jCurrentTimeMillis, 60000L));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m46c(Object obj, LinkedHashMap linkedHashMap) {
        String strM43E;
        if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                if (obj2 != null) {
                    String[] strArr = {"troopuin", "troopUin", "troopCode", "troopUinStr", "mTroopUin"};
                    int i = 0;
                    while (true) {
                        if (i >= 5) {
                            strM43E = "";
                            break;
                        }
                        strM43E = m43E(obj2, strArr[i]);
                        if (m60q(strM43E)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (m60q(strM43E)) {
                        linkedHashMap.put(strM43E, new C0563z6(strM43E, m43E(obj2, "troopname", "troopName", "troopRemark", "name", "mTroopName")));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m47d(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls == null) {
            return arrayList;
        }
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            Collections.addAll(arrayList, superclass.getDeclaredMethods());
        }
        Collections.addAll(arrayList, cls.getMethods());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Context m48e() {
        Context contextHostContext = HookEntry.hostContext();
        if (contextHostContext != null) {
            return contextHostContext;
        }
        Application application = f27b;
        if (application == null) {
            return null;
        }
        return application.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m49f(Object obj) {
        String[] strArr = {"getCurrentAccountUin", "getAccount", "getAccountUin"};
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (i >= 3) {
                try {
                    Field fieldM52i = m52i(obj.getClass(), "longAccountUin");
                    if (fieldM52i != null) {
                        obj2 = fieldM52i.get(obj);
                    }
                    return obj2 != null ? obj2.toString() : "";
                } catch (Throwable unused) {
                    return "";
                }
            }
            try {
                Object objInvoke = obj.getClass().getMethod(strArr[i], null).invoke(obj, null);
                if (objInvoke != null && objInvoke.toString().trim().length() > 0) {
                    return objInvoke.toString().trim();
                }
            } catch (Throwable unused2) {
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m50g(String str) {
        try {
            Context contextM48e = m48e();
            if (contextM48e == null) {
                return "";
            }
            return contextM48e.getSharedPreferences(Prefs.PREFS_NAME, 0).getString(Prefs.KEY_DONE_PREFIX + str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Method m51h(Class cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : m47d(cls)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (method.getReturnType() == Void.TYPE && parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Field m52i(Class cls, String str) {
        if (cls != null && str != null) {
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (Throwable unused) {
                    cls = cls.getSuperclass();
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Method m53j(Class cls, Class cls2, String str) {
        if (cls == null || str == null) {
            return null;
        }
        for (Method method : m47d(cls)) {
            if (str.equals(method.getName()) && method.getParameterTypes().length == 0 && (cls2 == null || cls2.isAssignableFrom(method.getReturnType()) || method.getReturnType() == cls2)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object m54k(ClassLoader classLoader) {
        Object objInvoke;
        Method methodM53j;
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("mqq.app.MobileQQ", classLoader);
            try {
                objInvoke = XposedHelpers.getStaticObjectField(clsFindClass, "sMobileQQ");
            } catch (Throwable unused) {
                objInvoke = null;
            }
            if (objInvoke == null && (methodM53j = m53j(clsFindClass, clsFindClass, "getMobileQQ")) != null) {
                objInvoke = methodM53j.invoke(null, null);
            }
            if (objInvoke != null) {
                String str = new String[]{"peekAppRuntime"}[0];
                for (Method method : m47d(objInvoke.getClass())) {
                    if (str.equals(method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        try {
                            method.setAccessible(true);
                            Object objInvoke2 = parameterTypes.length == 0 ? method.invoke(objInvoke, null) : (parameterTypes.length != 1 || parameterTypes[0].isPrimitive()) ? null : method.invoke(objInvoke, null);
                            if (objInvoke2 != null) {
                                return objInvoke2;
                            }
                        } catch (Throwable unused2) {
                            continue;
                        }
                    }
                }
                Field fieldM52i = m52i(objInvoke.getClass(), "mAppRuntime");
                if (fieldM52i != null) {
                    Object obj = fieldM52i.get(objInvoke);
                    if (obj != null) {
                        return obj;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Object m55l(Object obj, Class cls) {
        if (cls != null) {
            String[] strArr = {"getBusinessHandler", "getHandler"};
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                for (Method method : m47d(obj.getClass())) {
                    if (str.equals(method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        try {
                            method.setAccessible(true);
                            Object objInvoke = (parameterTypes.length == 1 && parameterTypes[0] == Class.class) ? method.invoke(obj, cls) : (parameterTypes.length == 1 && parameterTypes[0] == String.class) ? method.invoke(obj, cls.getName()) : null;
                            if (objInvoke != null) {
                                return objInvoke;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
            }
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    try {
                        if (cls.isAssignableFrom(field.getType())) {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static ArrayList m56m() {
        Object objM57n;
        Object objInvoke;
        Method methodM53j;
        Field fieldM52i;
        ClassLoader classLoader = f28c != null ? f28c : AbstractC0008a7.class.getClassLoader();
        ClassLoader classLoader2 = f28c != null ? f28c : AbstractC0008a7.class.getClassLoader();
        if (classLoader2 != null) {
            classLoader = classLoader2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (classLoader == null) {
            return new ArrayList();
        }
        try {
            Object objInvoke2 = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader).getMethod("api", Class.class).invoke(null, XposedHelpers.findClass("com.tencent.qqnt.troop.ITroopListRepoApi", classLoader));
            if (objInvoke2 != null) {
                String[] strArr = {"sortedJoinedTroopInfoFromCache", "getSortedJoinedTroopInfoFromCache", "getTroopListFromCache", "getTroopList", "getAllTroopList"};
                for (int i = 0; i < 5; i++) {
                    String str = strArr[i];
                    try {
                        fieldM52i = m52i(objInvoke2.getClass(), new String[]{str}[0]);
                    } catch (Throwable unused) {
                    }
                    if (fieldM52i == null || (objInvoke = fieldM52i.get(objInvoke2)) == null) {
                        objInvoke = null;
                    }
                    if (objInvoke == null && (methodM53j = m53j(objInvoke2.getClass(), null, str)) != null) {
                        objInvoke = methodM53j.invoke(objInvoke2, null);
                    }
                    m46c(objInvoke, linkedHashMap);
                    if (linkedHashMap.isEmpty()) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Object objM54k = m54k(classLoader);
            if (objM54k != null && (objM57n = m57n(classLoader, objM54k)) != null) {
                for (Method method : m47d(objM57n.getClass())) {
                    if (method.getParameterTypes().length == 0 && (List.class.isAssignableFrom(method.getReturnType()) || method.getReturnType() == ArrayList.class)) {
                        try {
                            method.setAccessible(true);
                            Object objInvoke3 = method.invoke(objM57n, null);
                            int size = linkedHashMap.size();
                            m46c(objInvoke3, linkedHashMap);
                            if (linkedHashMap.size() > size) {
                                break;
                            }
                        } catch (Throwable unused3) {
                            continue;
                        }
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        return new ArrayList(linkedHashMap.values());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m57n(ClassLoader classLoader, Object obj) {
        Method method;
        Object objInvoke;
        ArrayList<Integer> arrayList = new ArrayList();
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.app.QQManagerFactory", classLoader);
            String[] strArr = {"TROOP_MANAGER", "TROOP_MANAGER_FOR_UI"};
            for (int i = 0; i < 2; i++) {
                Field fieldM52i = m52i(clsFindClass, strArr[i]);
                if (fieldM52i != null) {
                    arrayList.add(Integer.valueOf(((Number) fieldM52i.get(null)).intValue()));
                }
            }
        } catch (Throwable unused) {
        }
        Collections.addAll(arrayList, 51, 52, 34);
        Iterator it = m47d(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                method = null;
                break;
            }
            method = (Method) it.next();
            if ("getManager".equals(method.getName()) && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Integer.TYPE) {
                break;
            }
        }
        if (method != null) {
            for (Integer num : arrayList) {
                try {
                    num.getClass();
                    objInvoke = method.invoke(obj, num);
                } catch (Throwable unused2) {
                }
                if (objInvoke != null && objInvoke.getClass().getName().toLowerCase(Locale.ROOT).contains("troop")) {
                    return objInvoke;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m58o() {
        try {
            Context contextM48e = m48e();
            return contextM48e == null ? HookEntry.runtimeString(Prefs.KEY_CLOCK_IN_GROUPS, "") : contextM48e.getSharedPreferences(Prefs.PREFS_NAME, 0).getString(Prefs.KEY_CLOCK_IN_GROUPS, HookEntry.runtimeString(Prefs.KEY_CLOCK_IN_GROUPS, ""));
        } catch (Throwable unused) {
            return HookEntry.runtimeString(Prefs.KEY_CLOCK_IN_GROUPS, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m59p(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m60q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.length() < 6 || strTrim.length() > 12) {
            return false;
        }
        for (int i = 0; i < strTrim.length(); i++) {
            if (!Character.isDigit(strTrim.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m61r(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!m59p(str)) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static long m62s() {
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            if (timeInMillis < calendar2.getTimeInMillis()) {
                return Math.max(0L, calendar2.getTimeInMillis() - timeInMillis);
            }
            String strM42D = m42D();
            if (!strM42D.equals(f30e)) {
                f30e = strM42D;
                f31f = 0;
                f32g = 0L;
                f29d = "";
            }
            if (m42D().equals(f29d)) {
                calendar2.add(6, 1);
                return Math.max(60000L, calendar2.getTimeInMillis() - timeInMillis);
            }
            Iterator it = m64u(m58o()).iterator();
            while (it.hasNext()) {
                if (!m42D().equals(m50g((String) it.next()))) {
                    if (f31f >= 6) {
                        calendar2.add(6, 1);
                        return Math.max(60000L, calendar2.getTimeInMillis() - timeInMillis);
                    }
                    long j = f33h - timeInMillis;
                    return j > 0 ? j : Math.max(0L, (f32g + 300000) - timeInMillis);
                }
            }
            calendar2.add(6, 1);
            return Math.max(60000L, calendar2.getTimeInMillis() - timeInMillis);
        } catch (Throwable unused) {
            return 86400000L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m63t() {
        try {
            long jM62s = m62s();
            if (jM62s <= 0) {
                return "今天 00:00";
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis() + jM62s);
            Calendar calendar2 = Calendar.getInstance();
            boolean z = true;
            if (calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                z = false;
            }
            return (z ? "今天" : "明天").concat(" 00:00");
        } catch (Throwable unused) {
            return "每天 00:00";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static ArrayList m64u(String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.replace('\r', '\n').replace(',', '\n').replace((char) 65292, '\n').replace(';', '\n').replace((char) 65307, '\n').split("\\n")) {
                if (str2 == null) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < str2.length(); i++) {
                        char cCharAt = str2.charAt(i);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (sb.length() > 0) {
                                break;
                            }
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    string = sb.toString();
                }
                if (m60q(string) && !arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static ArrayList m65v(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        String strM42D = m42D();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m60q(str) && !strM42D.equals(m50g(str)) && !arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m66w() {
        try {
            Context contextM48e = m48e();
            return contextM48e == null ? HookEntry.runtimeBool(Prefs.KEY_CLOCK_IN_ENABLED) : Prefs.readBoolean(contextM48e.getSharedPreferences(Prefs.PREFS_NAME, 0), Prefs.KEY_CLOCK_IN_ENABLED);
        } catch (Throwable unused) {
            return HookEntry.runtimeBool(Prefs.KEY_CLOCK_IN_ENABLED);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(10:27|(3:51|29|(4:63|31|67|66)(1:65))(1:64)|34|(4:36|49|37|(1:39))|42|53|43|68|66|25) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0547y6 m67x(ArrayList arrayList, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m60q(str) && !arrayList2.contains(str.trim())) {
                arrayList2.add(str.trim());
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(m64u(m58o()));
        }
        if (arrayList2.isEmpty()) {
            return new C0547y6(0, 0);
        }
        ClassLoader classLoader = f28c != null ? f28c : AbstractC0008a7.class.getClassLoader();
        if (classLoader == null) {
            return new C0547y6(arrayList2.size(), 0);
        }
        int i = 0;
        for (String str2 : arrayList2) {
            if (!z) {
                try {
                } catch (Throwable th) {
                    HookEntry.logAlways("clock-in result, manual=" + z + ", troop=" + str2 + ", handler=false, requestSent=false, response=false, retCode=none, message=exception, success=false, error=" + th);
                }
                if (m42D().equals(m50g(str2))) {
                }
            }
            C0531x6 c0531x6M40B = m40B(classLoader, str2);
            HookEntry.logAlways(c0531x6M40B.m1131a(z));
            if (c0531x6M40B.f1038i) {
                i++;
                String strM42D = m42D();
                try {
                    Context contextM48e = m48e();
                    if (contextM48e != null) {
                        contextM48e.getSharedPreferences(Prefs.PREFS_NAME, 0).edit().putString(Prefs.KEY_DONE_PREFIX + str2, strM42D).apply();
                    }
                } catch (Throwable unused) {
                }
            }
            Thread.sleep(520L);
        }
        return new C0547y6(arrayList2.size(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static String m68y(String str) {
        ArrayList<String> arrayListM64u = m64u(str);
        ArrayList<C0563z6> arrayListM56m = m56m();
        if (!arrayListM56m.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0563z6 c0563z6 : arrayListM56m) {
                if (c0563z6 != null) {
                    String str2 = c0563z6.f1138a;
                    if (m60q(str2)) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str3 : arrayListM64u) {
                if (linkedHashMap.containsKey(str3)) {
                    arrayList.add(str3);
                }
            }
            arrayListM64u = arrayList;
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : arrayListM64u) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m69z() {
        if (m66w() && f26a.compareAndSet(false, true)) {
            f33h = System.currentTimeMillis() + 60000;
            Thread thread = new Thread(new RunnableC0255i0(HookEntry.hotReloadGeneration(), 1), "QQClockIn-Auto");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
