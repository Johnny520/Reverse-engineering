package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0332ma {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f567a;

    /* JADX INFO: renamed from: b */
    public static volatile long f568b;

    /* JADX INFO: renamed from: c */
    public static volatile long f569c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m760a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f569c < 1200) {
            return;
        }
        f569c = jCurrentTimeMillis;
        HookEntry.logAlways("original image panel checked: source=".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Method m761b(Class cls, String str) {
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName()) && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 0 && !Modifier.isAbstract(method.getModifiers())) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Method m762c(Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 1) {
                String name = method.getParameterTypes()[0].getName();
                if (name.contains("MviUIState") || name.contains("UIState") || name.contains("UiState")) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m763d(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m764e(ClassLoader classLoader) {
        try {
            Class clsM767h = m767h(classLoader, "target.original_image.album_config_class", "com.tencent.qqnt.qbasealbum.model.Config");
            String[] strArr = {"s", "z"};
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Method method = null;
                if (str != null) {
                    Method[] declaredMethods = clsM767h.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Method method2 = declaredMethods[i3];
                        if (str.equals(method2.getName()) && method2.getReturnType() == Boolean.TYPE && method2.getParameterTypes().length == 0 && !Modifier.isAbstract(method2.getModifiers())) {
                            method = method2;
                            break;
                        }
                        i3++;
                    }
                }
                if (method != null) {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0300ka(55));
                    i++;
                }
            }
            return i;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m765f(ClassLoader classLoader) {
        int i;
        try {
            Class clsM767h = m767h(classLoader, "target.original_image.photo_panel_class", "com.tencent.mobileqq.aio.panel.photo.PhotoPanelVB");
            Method[] declaredMethods = clsM767h.getDeclaredMethods();
            int length = declaredMethods.length;
            Method method = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Method method2 = declaredMethods[i2];
                if (!Modifier.isAbstract(method2.getModifiers()) && method2.getReturnType() == Void.TYPE && method2.getParameterTypes().length == 1 && method2.getParameterTypes()[0] == Boolean.TYPE) {
                    if (Modifier.isPublic(method2.getModifiers())) {
                        method = method2;
                        break;
                    }
                    method = method2;
                }
                i2++;
            }
            if (method == null) {
                HookEntry.log("original image panel setter not found");
                return 0;
            }
            Method methodM761b = m761b(clsM767h, "Q0");
            if (methodM761b != null) {
                methodM761b.setAccessible(true);
                method.setAccessible(true);
                XposedBridge.hookMethod(methodM761b, new C0284ja(method));
                i = 1;
            } else {
                i = 0;
            }
            Method methodM762c = m762c(clsM767h);
            if (methodM762c != null && (methodM761b == null || !methodM761b.equals(methodM762c))) {
                methodM762c.setAccessible(true);
                method.setAccessible(true);
                XposedBridge.hookMethod(methodM762c, new C0284ja(method));
                i++;
            }
            if (i == 0) {
                HookEntry.log("original image panel refresh not found");
            }
            return i;
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("original image panel hook failed: "), ": ");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static synchronized void m766g(ClassLoader classLoader) {
        try {
            if (!f567a && classLoader != null) {
                int iM765f = m765f(classLoader) + m764e(classLoader);
                int i = 0;
                try {
                    Method methodM761b = m761b(m767h(classLoader, "target.original_image.guild_panel_class", "com.tencent.guild.aio.panel.photo.GuildPhotoPanelVB"), "e");
                    if (methodM761b != null) {
                        methodM761b.setAccessible(true);
                        XposedBridge.hookMethod(methodM761b, new C0316la(55));
                        i = 1;
                    }
                } catch (Throwable unused) {
                }
                int i2 = iM765f + i;
                f567a = true;
                if (i2 > 0) {
                    HookEntry.logAlways("original image panel hooks installed count=" + i2);
                } else {
                    HookEntry.log("original image panel hooks target not found");
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Class m767h(ClassLoader classLoader, String str, String str2) throws ClassNotFoundException {
        Class clsM1008i = AbstractC0463t2.m1008i(classLoader, str, str2);
        if (clsM1008i == null) {
            throw new ClassNotFoundException(str2);
        }
        AbstractC0463t2.m1015p(str, clsM1008i.getName());
        return clsM1008i;
    }
}
