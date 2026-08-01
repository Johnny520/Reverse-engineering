package p032;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.util.ReflectUtils.ReflectException;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17407 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Method m11815(Class cls, Class cls2, String str, Class[] clsArr) {
        Method methodM11824;
        String strM11549 = AbstractC6136.m11549(cls2, m11820(cls, str, clsArr));
        HashMap map = f17407;
        if (map.containsKey(strM11549)) {
            return (Method) map.get(strM11549);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if ((method.getName().equals(str) || str == null) && method.getReturnType().equals(cls2) && (methodM11824 = m11824(clsArr, strM11549, method)) != null) {
                    return methodM11824;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到方法 : ".concat(strM11549));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m11816(Object obj, String str) {
        return m11821(obj.getClass(), str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m11817(Object obj, String str, Class[] clsArr, Object... objArr) {
        return m11821(obj.getClass(), str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m11818(Class cls, String str, Object obj) {
        return m11815(obj.getClass(), cls, str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m11819(Object obj, String str, Class cls, Class[] clsArr, Object... objArr) {
        return m11815(obj.getClass(), cls, str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StringBuilder m11820(Class cls, String str, Class[] clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(".");
        sb.append(str);
        sb.append("(");
        for (Class cls2 : clsArr) {
            sb.append(cls2.getName());
            sb.append(",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append(")");
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Method m11821(Class cls, String str, Class[] clsArr) {
        Method methodM11824;
        String string = m11820(cls, str, clsArr).toString();
        HashMap map = f17407;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && (methodM11824 = m11824(clsArr, string, method)) != null) {
                    return methodM11824;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到未知类型返回的方法 : ".concat(string));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Method m11822(String str, String str2, Class cls, Class[] clsArr) {
        return m11815(AbstractC6318.m11838(str), cls, str2, clsArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method[] m11823(Class cls, InterfaceC6315 interfaceC6315) {
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            if (superclass == Object.class) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                if (interfaceC6315.mo8287(method)) {
                    method.setAccessible(true);
                    arrayList.add(method);
                }
            }
            superclass = superclass.getSuperclass();
        }
        if (arrayList.isEmpty()) {
            throw new ReflectException("模糊查找方法异常(可能是没有查找到方法) : ".concat(cls.getName()));
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11824(Class[] clsArr, String str, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return null;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (!Objects.equals(parameterTypes[i], clsArr[i]) || !AbstractC4921.m9890(parameterTypes[i], clsArr[i])) {
                return null;
            }
        }
        method.setAccessible(true);
        f17407.put(str, method);
        return method;
    }
}
