package p033;

import androidx.window.area.AbstractC2567;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import lin.util.ReflectUtils.ReflectException;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17456 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Method m11843(Class cls, Class cls2, String str, Class[] clsArr) {
        Method methodM11852;
        String strM11589 = AbstractC6183.m11589(cls2, m11848(cls, str, clsArr));
        HashMap map = f17456;
        if (map.containsKey(strM11589)) {
            return (Method) map.get(strM11589);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if ((method.getName().equals(str) || str == null) && method.getReturnType().equals(cls2) && (methodM11852 = m11852(clsArr, strM11589, method)) != null) {
                    return methodM11852;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到方法 : ".concat(strM11589));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m11844(Object obj, String str) {
        return m11849(obj.getClass(), str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m11845(Object obj, String str, Class[] clsArr, Object... objArr) {
        return m11849(obj.getClass(), str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m11846(Class cls, String str, Object obj) {
        return m11843(obj.getClass(), cls, str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m11847(Object obj, String str, Class cls, Class[] clsArr, Object... objArr) {
        return m11843(obj.getClass(), cls, str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StringBuilder m11848(Class cls, String str, Class[] clsArr) {
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
    public static Method m11849(Class cls, String str, Class[] clsArr) {
        Method methodM11852;
        String string = m11848(cls, str, clsArr).toString();
        HashMap map = f17456;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && (methodM11852 = m11852(clsArr, string, method)) != null) {
                    return methodM11852;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到未知类型返回的方法 : ".concat(string));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Method m11850(String str, String str2, Class cls, Class[] clsArr) {
        return m11843(AbstractC6337.m11866(str), cls, str2, clsArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method[] m11851(Class cls, InterfaceC6334 interfaceC6334) {
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            if (superclass == Object.class) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                if (interfaceC6334.mo8275(method)) {
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
    public static Method m11852(Class[] clsArr, String str, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return null;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (!Objects.equals(parameterTypes[i], clsArr[i]) || !AbstractC2567.m5076(parameterTypes[i], clsArr[i])) {
                return null;
            }
        }
        method.setAccessible(true);
        f17456.put(str, method);
        return method;
    }
}
