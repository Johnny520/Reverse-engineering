package p000;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569zc {

    /* JADX INFO: renamed from: a */
    public static final Map f1162a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static final Map f1163b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f1164c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c3 A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1209a(Object obj, Method method, Field field, Object[] objArr) {
        Object objInvoke;
        Method method2;
        Method[] declaredMethods;
        if (objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 == null || (obj2 instanceof CharSequence) || (obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof View) || (obj2 instanceof Class)) {
                objInvoke = null;
                if (objInvoke != null) {
                    return objInvoke;
                }
            } else if (field != null) {
                if (field.getDeclaringClass().isInstance(obj2)) {
                    objInvoke = field.get(obj2);
                    if (!m1210b(objInvoke)) {
                        Class<?> cls = obj2.getClass();
                        if (cls == Object.class) {
                            method2 = null;
                            if (method2 == null) {
                                try {
                                    objInvoke = method2.invoke(obj2, null);
                                    if (!m1210b(objInvoke)) {
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            Map map = f1162a;
                            synchronized (map) {
                                try {
                                    method2 = (Method) map.get(cls);
                                    if (method2 == null) {
                                        Map map2 = f1163b;
                                        synchronized (map2) {
                                            try {
                                                if (Boolean.TRUE.equals(map2.get(cls))) {
                                                    method2 = null;
                                                } else {
                                                    method2 = null;
                                                    for (Class<?> superclass = cls; superclass != null && superclass != Object.class && method2 == null; superclass = superclass.getSuperclass()) {
                                                        try {
                                                            declaredMethods = superclass.getDeclaredMethods();
                                                        } catch (Throwable unused2) {
                                                            declaredMethods = null;
                                                        }
                                                        if (declaredMethods != null) {
                                                            int length = declaredMethods.length;
                                                            int i = 0;
                                                            while (true) {
                                                                if (i < length) {
                                                                    Method method3 = declaredMethods[i];
                                                                    if (m1211c(method3)) {
                                                                        method3.setAccessible(true);
                                                                        method2 = method3;
                                                                        break;
                                                                    }
                                                                    i++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (method2 != null) {
                                                        Map map3 = f1162a;
                                                        synchronized (map3) {
                                                            map3.put(cls, method2);
                                                        }
                                                    } else {
                                                        Map map4 = f1163b;
                                                        synchronized (map4) {
                                                            map4.put(cls, Boolean.TRUE);
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (method2 == null) {
                            }
                        }
                    }
                    if (objInvoke != null) {
                    }
                }
            }
        }
        if (obj != null && method != null) {
            try {
                Object objInvoke2 = method.invoke(obj, null);
                if (m1210b(objInvoke2)) {
                    return objInvoke2;
                }
            } catch (Throwable unused3) {
            }
        }
        if (objArr == null || objArr.length <= 1 || !m1210b(objArr[1])) {
            return null;
        }
        return objArr[1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m1210b(Object obj) {
        if (obj == null || (obj instanceof View) || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Class)) {
            return false;
        }
        String name = obj.getClass().getName();
        return name.endsWith(".AIOMsgItem") || name.contains(".aio.msg.") || name.contains("MsgRecord") || AbstractC0497v4.m1097p(obj) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1211c(Method method) {
        if (method == null || Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length != 0 || method.getReturnType().isPrimitive()) {
            return false;
        }
        String name = method.getReturnType().getName();
        return "com.tencent.mobileqq.aio.msg.AIOMsgItem".equals(name) || name.endsWith(".AIOMsgItem");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1212d() {
        Map map = f1162a;
        synchronized (map) {
            map.clear();
        }
        Map map2 = f1163b;
        synchronized (map2) {
            map2.clear();
        }
    }
}
