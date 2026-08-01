package p049;

import androidx.window.area.AbstractC3400;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import lin.util.ReflectUtils.ReflectException;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7162 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17801 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Method m12402(Class cls, Class cls2, String str, Class[] clsArr) {
        Method methodM12411;
        String strM12148 = AbstractC7012.m12148(cls2, m12407(cls, str, clsArr));
        HashMap map = f17801;
        if (map.containsKey(strM12148)) {
            return (Method) map.get(strM12148);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if ((method.getName().equals(str) || str == null) && method.getReturnType().equals(cls2) && (methodM12411 = m12411(clsArr, strM12148, method)) != null) {
                    return methodM12411;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到方法 : ".concat(strM12148));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m12403(Object obj, String str) {
        return m12408(obj.getClass(), str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m12404(Object obj, String str, Class[] clsArr, Object... objArr) {
        return m12408(obj.getClass(), str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m12405(Class cls, String str, Object obj) {
        return m12402(obj.getClass(), cls, str, new Class[0]).invoke(obj, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m12406(Object obj, String str, Class cls, Class[] clsArr, Object... objArr) {
        return m12402(obj.getClass(), cls, str, clsArr).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StringBuilder m12407(Class cls, String str, Class[] clsArr) {
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
    public static Method m12408(Class cls, String str, Class[] clsArr) {
        Method methodM12411;
        String string = m12407(cls, str, clsArr).toString();
        HashMap map = f17801;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && (methodM12411 = m12411(clsArr, string, method)) != null) {
                    return methodM12411;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("没有查找到未知类型返回的方法 : ".concat(string));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Method m12409(String str, String str2, Class cls, Class[] clsArr) {
        return m12402(AbstractC7166.m12425(str), cls, str2, clsArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method[] m12410(Class cls, InterfaceC7163 interfaceC7163) {
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            if (superclass == Object.class) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                if (interfaceC7163.mo8834(method)) {
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
    public static Method m12411(Class[] clsArr, String str, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return null;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (!Objects.equals(parameterTypes[i], clsArr[i]) || !AbstractC3400.m5636(parameterTypes[i], clsArr[i])) {
                return null;
            }
        }
        method.setAccessible(true);
        f17801.put(str, method);
        return method;
    }
}
