package p049;

import androidx.compose.runtime.internal.C2080;
import androidx.window.area.AbstractC3400;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f17802 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2080 f17803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7164 m12412(String str) {
        C7164 c7164 = new C7164();
        C2080 c2080 = new C2080(8);
        c7164.f17803 = c2080;
        c2080.f3966 = str;
        return c7164;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7164 m12413(Class cls) {
        C7164 c7164 = new C7164();
        C2080 c2080 = new C2080(8);
        c7164.f17803 = c2080;
        c2080.f3965 = cls;
        c2080.f3966 = cls.getName();
        return c7164;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m12414() {
        C2080 c2080 = this.f17803;
        String str = (String) c2080.f3966;
        String str2 = (String) c2080.f3963;
        Class[] clsArr = (Class[]) c2080.f3964;
        Class cls = (Class) c2080.f3962;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        for (Class cls2 : clsArr) {
            sb.append(cls2.getName());
            sb.append(",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append(")");
        if (cls != null) {
            sb.append(cls.getName());
        }
        String string = sb.toString();
        HashMap map = f17802;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        Class superclass = (Class) c2080.f3965;
        if (superclass == null) {
            superclass = AbstractC7166.m12425((String) c2080.f3966);
        }
        while (superclass != Object.class) {
            for (Method method : superclass.getDeclaredMethods()) {
                if ((((String) c2080.f3963) == null || method.getName().equals((String) c2080.f3963)) && (((Class) c2080.f3962) == null || method.getReturnType().equals((Class) c2080.f3962))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == ((Class[]) c2080.f3964).length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Class cls3 = ((Class[]) c2080.f3964)[i];
                            if (cls3 != Object.class && (!Objects.equals(parameterTypes[i], cls3) || !AbstractC3400.m5636(parameterTypes[i], ((Class[]) c2080.f3964)[i]))) {
                                break;
                            }
                        }
                        method.setAccessible(true);
                        map.put(string, method);
                        return method;
                    }
                    continue;
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new ReflectException("没有查找到方法 : ".concat(string));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12415(Object obj, Object... objArr) {
        try {
            return m12414().invoke(obj, objArr);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }
}
