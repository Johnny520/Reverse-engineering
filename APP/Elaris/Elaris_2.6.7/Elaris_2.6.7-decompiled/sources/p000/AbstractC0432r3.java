package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0432r3 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f783a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f784b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f785c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f786d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m843a(Member member) {
        if (!(member instanceof Method)) {
            return null;
        }
        Class<?> returnType = ((Method) member).getReturnType();
        if (Void.TYPE.equals(returnType) || !returnType.isPrimitive()) {
            return null;
        }
        if (Boolean.TYPE.equals(returnType)) {
            return Boolean.FALSE;
        }
        if (Byte.TYPE.equals(returnType)) {
            return (byte) 0;
        }
        if (Short.TYPE.equals(returnType)) {
            return (short) 0;
        }
        if (Integer.TYPE.equals(returnType)) {
            return 0;
        }
        if (Long.TYPE.equals(returnType)) {
            return 0L;
        }
        return Float.TYPE.equals(returnType) ? Float.valueOf(0.0f) : Double.TYPE.equals(returnType) ? Double.valueOf(0.0d) : Character.TYPE.equals(returnType) ? (char) 0 : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m844b(ClassLoader classLoader, C0400p3 c0400p3) {
        String str;
        int i = 0;
        if (classLoader == null) {
            return 0;
        }
        HashSet hashSet = new HashSet();
        m851i(classLoader, "com.tencent.mobileqq.notification.modularize.TianShuOfflineMsgCenter", hashSet, c0400p3);
        m851i(classLoader, "com.tencent.mobileqq.tianshu.TianShuOfflineMsgCenter", hashSet, c0400p3);
        m851i(classLoader, "com.tencent.mobileqq.tianshu.api.impl.TianShuOfflineMsgCenter", hashSet, c0400p3);
        if (hashSet.isEmpty()) {
            str = "dex";
            try {
                for (C0043ca c0043ca : AbstractC0260i5.m644p0(HookEntry.getHostSourceDir(), "Lcom/tencent/mobileqq/notification/modularize", "TianShuOfflineMsgCenter", "deal0x135Msg online:")) {
                    i++;
                    if (m852j(classLoader, c0043ca, hashSet, c0400p3) > 0) {
                        AbstractC0463t2.m1015p("target.notice.group_todo_method", AbstractC0486u9.m1055h(c0043ca));
                    }
                }
            } catch (Throwable th) {
                m857o("[Elaris:NoticeGate] precise group-todo dex scan skipped: ".concat(th.getClass().getSimpleName()));
            }
        } else {
            str = "known_class";
        }
        if (!hashSet.isEmpty()) {
            m857o("[Elaris:NoticeGate] precise group-todo hook installed methods=" + hashSet.size() + " source=" + str + " dex_candidates=" + i);
        }
        return hashSet.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m845c(Object obj, String str, String str2, int i) {
        Class<?> superclass = obj.getClass();
        Object objInvoke = null;
        try {
            try {
                Method method = superclass.getMethod(str2, null);
                method.setAccessible(true);
                objInvoke = method.invoke(obj, null);
            } catch (Throwable unused) {
                Method declaredMethod = superclass.getDeclaredMethod(str2, null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(obj, null);
            }
        } catch (Throwable unused2) {
            while (superclass != null && superclass != Object.class) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    objInvoke = declaredField.get(obj);
                    break;
                } catch (Throwable unused3) {
                    superclass = superclass.getSuperclass();
                }
            }
        }
        return objInvoke instanceof Number ? ((Number) objInvoke).intValue() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0416q3 m846d() {
        Context context = null;
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            if (objInvoke instanceof Context) {
                context = (Context) objInvoke;
            }
        } catch (Throwable unused) {
        }
        if (context == null) {
            return new C0416q3(HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_AT_ALL), HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO));
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Prefs.PREFS_NAME, 0);
            return new C0416q3(sharedPreferences.getBoolean(Prefs.KEY_NOTICE_BLOCK_AT_ALL, false), sharedPreferences.getBoolean(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO, false));
        } catch (Throwable unused2) {
            return new C0416q3(HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_AT_ALL), HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m847e(StringBuilder sb, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            m848f(sb, obj.toString());
            return;
        }
        int i = 0;
        if (obj instanceof CharSequence[]) {
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            int length = charSequenceArr.length;
            while (i < length) {
                m847e(sb, charSequenceArr[i]);
                i++;
            }
            return;
        }
        if (obj.getClass().isArray()) {
            try {
                int length2 = Array.getLength(obj);
                while (i < length2) {
                    m847e(sb, Array.get(obj, i));
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m848f(StringBuilder sb, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m849g(StringBuilder sb, Object obj, Set set, int i) {
        if (obj == null || i > 2 || sb.length() > 4096) {
            return;
        }
        if (obj instanceof CharSequence) {
            m848f(sb, obj.toString());
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            return;
        }
        Class<?> cls = obj.getClass();
        int i2 = 0;
        try {
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                while (i2 < length) {
                    m849g(sb, Array.get(obj, i2), set, i + 1);
                    i2++;
                }
                return;
            }
            String name = cls.getName();
            if ((name.startsWith("com.tencent") || name.startsWith("mqq.") || name.startsWith("java.util.")) && set.add(obj)) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length2 = declaredFields.length;
                while (i2 < length2) {
                    Field field = declaredFields[i2];
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 instanceof CharSequence) {
                            m848f(sb, field.getName() + '=' + obj2);
                        } else if (i < 2) {
                            m849g(sb, obj2, set, i + 1);
                        }
                    } catch (Throwable unused) {
                    }
                    if (sb.length() > 4096) {
                        return;
                    } else {
                        i2++;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m850h(Method method) {
        for (Class<?> cls : method.getParameterTypes()) {
            if (Notification.class.equals(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m851i(ClassLoader classLoader, String str, HashSet hashSet, C0400p3 c0400p3) {
        try {
            for (Method method : Class.forName(str, false, classLoader).getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 5) {
                    m853k(hashSet, method, c0400p3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m852j(ClassLoader classLoader, C0043ca c0043ca, HashSet hashSet, C0400p3 c0400p3) {
        if (c0043ca != null) {
            int i = c0043ca.f101c;
            String str = c0043ca.f100b;
            String str2 = c0043ca.f99a;
            if (str2 != null && str != null && i >= 3) {
                int size = hashSet.size();
                try {
                    Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str2);
                    if (clsM1091j != null) {
                        for (Method method : clsM1091j.getDeclaredMethods()) {
                            if (str.equals(method.getName()) && method.getParameterTypes().length == i && !Modifier.isAbstract(method.getModifiers())) {
                                m853k(hashSet, method, c0400p3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("notice-gate", "group-todo-cached-hook", th);
                }
                return hashSet.size() - size;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m853k(HashSet hashSet, Method method, XC_MethodHook xC_MethodHook) {
        String genericString;
        try {
            genericString = method.toGenericString();
            try {
                if (hashSet.add(genericString)) {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, xC_MethodHook);
                }
            } catch (Throwable th) {
                th = th;
                if (genericString != null) {
                    hashSet.remove(genericString);
                }
                AbstractC0198e7.m343a("notice-gate", "hook-method", th);
            }
        } catch (Throwable th2) {
            th = th2;
            genericString = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static synchronized void m854l(ClassLoader classLoader, String str) {
        try {
            boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_AT_ALL);
            boolean zRuntimeBool2 = HookEntry.runtimeBool(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO);
            if (zRuntimeBool || zRuntimeBool2) {
                m856n(classLoader, str);
                if (zRuntimeBool) {
                    m855m(classLoader, str);
                }
                if (zRuntimeBool2) {
                    m860r(classLoader, str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m855m(ClassLoader classLoader, String str) {
        if (f784b) {
            return;
        }
        f784b = true;
        C0341n3 c0341n3 = new C0341n3(str);
        if (classLoader == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.tencent.qqnt.notification.NotificationFacade", false, classLoader);
            HashSet hashSet = new HashSet();
            for (Method method : cls.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int length = parameterTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (m861s(parameterTypes[i])) {
                            m853k(hashSet, method, c0341n3);
                            break;
                        }
                        i++;
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            m857o("[Elaris:NoticeGate] precise at-all hook installed methods=" + hashSet.size());
        } catch (Throwable th) {
            m857o("[Elaris:NoticeGate] precise at-all hook skipped: ".concat(th.getClass().getSimpleName()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m856n(ClassLoader classLoader, String str) {
        if (f783a) {
            return;
        }
        f783a = true;
        C0357o3 c0357o3 = new C0357o3(str);
        try {
            HashSet hashSet = new HashSet();
            for (Method method : NotificationManager.class.getDeclaredMethods()) {
                String name = method.getName();
                if ("notify".equals(name) || "notifyAsUser".equals(name) || "notifyAsPackage".equals(name)) {
                    if (m850h(method)) {
                        m853k(hashSet, method, c0357o3);
                    }
                }
            }
        } catch (Throwable th) {
            m857o("[Elaris:NoticeGate] NotificationManager hook skipped: ".concat(th.getClass().getSimpleName()));
        }
        try {
            Class<?> cls = Class.forName("android.app.INotificationManager$Stub$Proxy");
            HashSet hashSet2 = new HashSet();
            for (Method method2 : cls.getDeclaredMethods()) {
                if (method2.getName().startsWith("enqueueNotification") && m850h(method2)) {
                    m853k(hashSet2, method2, c0357o3);
                }
            }
        } catch (Throwable th2) {
            m857o("[Elaris:NoticeGate] INotificationManager proxy hook skipped: ".concat(th2.getClass().getSimpleName()));
        }
        if (classLoader != null) {
            String[] strArr = {"com.tencent.qqnt.notification.NotificationFacade", "com.tencent.mobileqq.troop.trooptodo.TroopTodoHandler", "com.tencent.mobileqq.troop.trooptodo.TroopTodoManager", "com.tencent.mobileqq.troop.trooptodo.TroopTodoMsgUtil", "com.tencent.mobileqq.troop.trooptodo.TroopTodoUtils", "com.tencent.mobileqq.troop.trooptodo.ITroopTodoAIOMenuApi", "com.tencent.mobileqq.troop.trooptodo.handler.TroopTodoInfoHandler", "com.tencent.mobileqq.troop.trooptodo.impl.TroopTodoAIOMenuApiImpl", "com.tencent.mobileqq.troop.todo.TroopTodoHandler", "com.tencent.mobileqq.troop.todo.TroopTodoManager", "com.tencent.mobileqq.tianshu.TianShuOfflineMsgCenter", "com.tencent.mobileqq.tianshu.api.impl.TianShuOfflineMsgCenter"};
            for (int i = 0; i < 12; i++) {
                String str2 = strArr[i];
                try {
                    Class<?> cls2 = Class.forName(str2, false, classLoader);
                    HashSet hashSet3 = new HashSet();
                    for (Method method3 : cls2.getDeclaredMethods()) {
                        if (m850h(method3)) {
                            m853k(hashSet3, method3, c0357o3);
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        m857o("[Elaris:NoticeGate] internal hook installed: " + str2 + " methods=" + hashSet3.size());
                    }
                } catch (Throwable unused) {
                }
            }
        }
        m857o("[Elaris:NoticeGate] installed base qq-process hooks in ".concat(m859q(str)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m857o(String str) {
        if (HookEntry.shouldLogMessage(str)) {
            XposedBridge.log(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static synchronized void m858p() {
        f783a = false;
        f784b = false;
        f785c = false;
        f786d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m859q(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.replace('\n', ' ').replace('\r', ' ').trim();
        return strTrim.length() > 160 ? strTrim.substring(0, 160).concat("…") : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m860r(ClassLoader classLoader, String str) {
        int size;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0400p3 c0400p3 = new C0400p3(str);
        if (classLoader == null) {
            size = 0;
        } else {
            HashSet hashSet = new HashSet();
            m851i(classLoader, "com.tencent.mobileqq.notification.modularize.TianShuOfflineMsgCenter", hashSet, c0400p3);
            m851i(classLoader, "com.tencent.mobileqq.tianshu.TianShuOfflineMsgCenter", hashSet, c0400p3);
            m851i(classLoader, "com.tencent.mobileqq.tianshu.api.impl.TianShuOfflineMsgCenter", hashSet, c0400p3);
            size = hashSet.size();
        }
        if (size > 0) {
            f785c = true;
            m857o("[Elaris:NoticeGate] precise group-todo hook installed methods=" + size + " source=known_class cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            return;
        }
        C0400p3 c0400p32 = new C0400p3(str);
        String strM1004e = AbstractC0463t2.m1004e("target.notice.group_todo_method");
        C0043ca c0043ca = null;
        if (!AbstractC0486u9.m1063p(strM1004e)) {
            String[] strArrSplit = strM1004e.split("\t", -1);
            if (strArrSplit.length == 3 && !AbstractC0486u9.m1063p(strArrSplit[0]) && !AbstractC0486u9.m1063p(strArrSplit[1])) {
                try {
                    int i = Integer.parseInt(strArrSplit[2]);
                    if (i >= 0) {
                        c0043ca = new C0043ca(strArrSplit[0], strArrSplit[1], i, "");
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        int iM852j = c0043ca != null ? m852j(classLoader, c0043ca, new HashSet(), c0400p32) : 0;
        if (iM852j <= 0) {
            synchronized (AbstractC0432r3.class) {
                if (!f785c && !f786d) {
                    f786d = true;
                    AbstractC0361o7.m769a("Elaris-notice-group-todo", new RunnableC0325m3(HookEntry.hotReloadGeneration(), classLoader, str));
                    return;
                }
                return;
            }
        }
        f785c = true;
        m857o("[Elaris:NoticeGate] precise group-todo hook installed methods=" + iM852j + " source=version_cache cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m861s(Class cls) {
        if (cls == null) {
            return false;
        }
        String name = cls.getName();
        return name.equals("RecentContactInfo") || name.endsWith(".".concat("RecentContactInfo")) || name.endsWith("$".concat("RecentContactInfo"));
    }
}
