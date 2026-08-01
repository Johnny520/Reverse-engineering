package p032;

import androidx.compose.runtime.internal.C1245;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f17408 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1245 f17409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6316 m11825(String str) {
        C6316 c6316 = new C6316();
        C1245 c1245 = new C1245(8);
        c6316.f17409 = c1245;
        c1245.f3620 = str;
        return c6316;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6316 m11826(Class cls) {
        C6316 c6316 = new C6316();
        C1245 c1245 = new C1245(8);
        c6316.f17409 = c1245;
        c1245.f3619 = cls;
        c1245.f3620 = cls.getName();
        return c6316;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m11827() {
        C1245 c1245 = this.f17409;
        String str = (String) c1245.f3620;
        String str2 = (String) c1245.f3617;
        Class[] clsArr = (Class[]) c1245.f3618;
        Class cls = (Class) c1245.f3616;
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
        HashMap map = f17408;
        if (map.containsKey(string)) {
            return (Method) map.get(string);
        }
        Class superclass = (Class) c1245.f3619;
        if (superclass == null) {
            superclass = AbstractC6318.m11838((String) c1245.f3620);
        }
        while (superclass != Object.class) {
            for (Method method : superclass.getDeclaredMethods()) {
                if ((((String) c1245.f3617) == null || method.getName().equals((String) c1245.f3617)) && (((Class) c1245.f3616) == null || method.getReturnType().equals((Class) c1245.f3616))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == ((Class[]) c1245.f3618).length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Class cls3 = ((Class[]) c1245.f3618)[i];
                            if (cls3 != Object.class && (!Objects.equals(parameterTypes[i], cls3) || !AbstractC4921.m9890(parameterTypes[i], ((Class[]) c1245.f3618)[i]))) {
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
    public final Object m11828(Object obj, Object... objArr) {
        try {
            return m11827().invoke(obj, objArr);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }
}
